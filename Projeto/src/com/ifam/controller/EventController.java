package com.ifam.controller;

import com.ifam.model.bo.EventBO;
import com.ifam.model.dao.EventDAO;
import com.ifam.model.vo.EventModel;

public class EventController {
    private EventBO eventBO;
    private EventDAO eventDAO;

	/*
	 * public EventController() { this.eventBO = new EventBO(); this.eventDAO = new
	 * EventDAO(); }
	 * 
	 * public boolean createEvent(EventModel event) { if
	 * (eventBO.validateEvent(event)) { return eventDAO.saveEvent(event); } return
	 * false; }
	 * 
	 * public boolean updateEvent(EventModel event) { if
	 * (eventBO.validateEvent(event)) { return eventDAO.updateEvent(event); } return
	 * false; }
	 * 
	 * public boolean deleteEvent(int eventId) { return
	 * eventDAO.deleteEvent(eventId); }
	 * 
	 * public EventModel getEventById(int eventId) { return
	 * eventDAO.getEventById(eventId); }
	 * 
	 * public List<EventModel> getAllEvents() { return eventDAO.getAllEvents(); }
	 */
}
