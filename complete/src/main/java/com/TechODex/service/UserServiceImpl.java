package com.TechODex.service;

import com.TechODex.dao.UserDAO;
import com.TechODex.dto.UserDTO;
import com.TechODex.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void login(UserDTO userDTO){
        findByEIDandPassword(setDTOToModel(userDTO));
    }

    private User setDTOToModel(UserDTO dto){
        User user = new User();

        user.seteId(dto.geteId());
        user.setPassword(dto.getPassword());

        return user;
    }

   private void findByEIDandPassword(User user){
       userDAO.findByEIDAndPassword(user);
   }
}
