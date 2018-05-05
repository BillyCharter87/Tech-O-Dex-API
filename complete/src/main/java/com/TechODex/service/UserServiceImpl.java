package com.TechODex.service;

import com.TechODex.dao.UserDAO;
import com.TechODex.dto.UserDTO;
import com.TechODex.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public boolean login(UserDTO userDTO){
        User u = findByEIDAndPassword(setDTOToModel(userDTO));

        if(u.getPassword() != null){
            return true;
        }else{
            return false;
        }
    }

    private User setDTOToModel(UserDTO dto){
        User user = new User();

        user.seteId(dto.geteId());
        user.setPassword(dto.getPassword());

        return user;
    }

   private User findByEIDAndPassword(User user){
        return userDAO.findByeIdAndPassword(user.geteId(),user.getPassword());
   }
}
