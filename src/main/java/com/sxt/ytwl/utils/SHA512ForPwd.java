package com.sxt.ytwl.utils;

import org.apache.shiro.crypto.hash.Sha512Hash;
import org.springframework.stereotype.Component;

@Component
public class SHA512ForPwd {
    public String encryptPwd(Object password,Object salt,Integer ite){
        Sha512Hash pwd = new Sha512Hash(password,salt,ite);

        return pwd.toString();
    }

}
