/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Mukhtiar
 */
public class Mp4Player implements AdvancedMediaPlayer{

   
   @Override
   public void play(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}
