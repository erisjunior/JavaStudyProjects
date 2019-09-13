/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

public static int gerarNumAleatorio(int min, int max) {
        java.util.Random randomico = new java.util.Random();
        int numRandom = randomico.nextInt((max - min) + 1) + min;
        return numRandom;
    }

    private

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;int gerarNumAleatorio(int min, int max) {
        java.util.Random randomico = new java.util.Random();
        int numRandom = randomico.nextInt((max - min) + 1) + min;
        return numRandom;
    }

    private

import javax.swing.AbstractAction;

 class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "Jogar!");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < 10; i++) {
                try {  
                       Thread.sleep(500);  
                    } catch (Exception e1) {  
                       e1.printStackTrace();  
                    }  
                tfNumUm.setText(String.valueOf(gerarNumAleatorio(1, 10)));
            }        
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }