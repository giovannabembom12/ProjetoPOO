package com.ifam.view;

import javax.swing.*;

import com.ifam.model.vo.EventModel;

import java.awt.*;

public class EventDetailView extends JFrame {
    private JLabel nameLabel;
    private JLabel dateLabel;
    private JLabel locationLabel;

    public EventDetailView() {
        super("Event Details");

        nameLabel = new JLabel("Event Name:");
        dateLabel = new JLabel("Event Date:");
        locationLabel = new JLabel("Event Location:");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(nameLabel);
        panel.add(dateLabel);
        panel.add(locationLabel);

        getContentPane().add(panel);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void displayEventDetails(EventModel event) {
        nameLabel.setText("Event Name: " + event.getEventName());
        dateLabel.setText("Event Date: " + event.getEventDate());
        locationLabel.setText("Event Location: " + event.getEventLocation());

        setVisible(true);
    }
}
