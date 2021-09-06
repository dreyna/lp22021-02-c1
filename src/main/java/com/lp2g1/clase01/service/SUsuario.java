/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2g1.clase01.service;

import com.lp2g1.clase01.entity.TUsuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface SUsuario {
    List<Map<String, Object>> readAll();
    int create(TUsuario tu);
    int update(TUsuario tu);
    int delete(int id);
    TUsuario read(int id);
    TUsuario searchUser(String user);
}
