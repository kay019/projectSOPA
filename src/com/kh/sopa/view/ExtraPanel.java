package com.kh.sopa.view;


//������ �׸��ؿ� ��ư ȭ�� ��ȯ�� �ӽ� Ŭ����
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExtraPanel extends JFrame {
	private JPanel contentPane;
	
	public ExtraPanel() {
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBounds(100, 100, 1024, 768);
		contentPane.setBackground(new Color(254, 228, 167));
		setContentPane(contentPane);
		
		
		setVisible(true);
	}
}
