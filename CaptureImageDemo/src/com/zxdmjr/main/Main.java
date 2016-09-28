/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxdmjr.main;

import com.zxdmjr.frame.SnapShot;
import org.opencv.core.Core;

/**
 *
 * @author pavel
 */
public class Main {
    
    public static void main(String[] args){
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(SnapShot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        SnapShot shapshot = new SnapShot();
        
        shapshot.setVisible(true);
    }
    
}
