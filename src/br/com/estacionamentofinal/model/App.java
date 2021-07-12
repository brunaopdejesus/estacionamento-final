package br.com.estacionamentofinal.model;

import java.time.Duration;
import java.time.LocalTime;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

public class App {

	public static void main(String[] args) {

		try {
			// APARÊNCIA DO SISTEMA OPERACIONAL
//			UIManager.setLookAndFeel(
//		            UIManager.getSystemLookAndFeelClassName());
			
			// APARÊNCIA NIMBUS
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		
		
		Frame tela = new Frame();
		tela.criarTela();
	}
	

}
