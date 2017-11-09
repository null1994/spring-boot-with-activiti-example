package org.springboot.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/10.
 */
@Service
public class UserService {

    public String getMyUser(String a) {
        System.out.println(a);
        return a;
    }
}
