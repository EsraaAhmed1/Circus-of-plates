/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Esraa
 */
public class EasyLevel implements Strategy {
      @Override
    public int getTimeout() {
        return 2;
    }

    @Override
    public int getSpeed() {
        return 30;
    }

}
