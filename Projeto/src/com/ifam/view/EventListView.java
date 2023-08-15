package com.ifam.view;

import com.ifam.model.vo.EventModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class EventListView extends JFrame {
    private JList<String> eventList;

    public EventListView() {
        super("Event List");

        eventList = new JList<>();
        eventList.setBackground(new Color(128, 0, 128)); // Tela roxa

        JScrollPane scrollPane = new JScrollPane(eventList);

        getContentPane().add(new JLabel("Event List:"), BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void displayEventList(List<EventModel> events) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (EventModel event : events) {
            listModel.addElement("Event ID: " + event.getEventId() +
                                 ", Event Name: " + event.getEventName() +
                                 ", Event Date: " + event.getEventDate() +
                                 ", Event Location: " + event.getEventLocation());
        }
        eventList.setModel(listModel);
    }
}
