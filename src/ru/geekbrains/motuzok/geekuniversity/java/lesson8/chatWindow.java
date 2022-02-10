package ru.geekbrains.motuzok.geekuniversity.java.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class chatWindow extends JFrame {
    public chatWindow() {
        setTitle("blah blah chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Вы закрыли чат");
            }
        });
        setBounds(300, 300, 400, 480);
        setResizable(false);
        setLayout(null);

        //ниже параметры окна основного общения
        JTextArea field = new JTextArea (" ", 20,50);
        field.setBounds(20, 20, 220, 180);
        JScrollPane scrollPane = new JScrollPane(field);
        scrollPane.setBounds(20, 20, 240, 180);
        setPreferredSize(new Dimension(220, 100));
        field.setEditable(false);
        //add(field);
        add(scrollPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //ниже параметры окна набора текста
        JTextArea messageField = new JTextArea();
        messageField.setBounds(20, 240, 220, 32);
        messageField.setLineWrap(true);//перенос слов
        messageField.setWrapStyleWord(true);//перенос слов
        add(messageField);

        //кнопка "Отправить"

        JButton button = new JButton("Отправить");
        button.setBounds(20, 340, 160, 32);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String currentMsg = field.getText();
                field.setText(currentMsg + "\n" + messageField.getText());
                button.setText("Отправить");
                messageField.setText("");
            }
        });
        //кнопка "Очистить историю
        JButton clearButton = new JButton("Очистить историю");
        clearButton.setBounds(190, 340, 160, 32);
        add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                field.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new chatWindow();
    }

}
