/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendItem;
import java.util.List;

/**
 * FINAL COPY
 * @author Royce Rabanal
 * GitHub: https://github.com/roycemicah
 * Email: royce.rabanal93@gmail.com
 * Date: August 18th, 2021
 * Purpose: Milestone 3 Assessment: Vending Machine Exercise
 */
public interface VendingMachineDao {
    
    VendItem getItem(String row) throws VendingMachineDaoPersistenceException;
    void setItemCount(String itemRow, int count) throws VendingMachineDaoPersistenceException;
    
    List<VendItem> getAllItems() throws VendingMachineDaoPersistenceException;
    
}

