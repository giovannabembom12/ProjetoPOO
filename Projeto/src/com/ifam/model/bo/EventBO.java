package com.ifam.model.bo;

import java.util.Date;

import com.ifam.model.vo.EventModel;

public class EventBO {
    // Outras dependências podem ser injetadas aqui, como EventDAO ou serviços relacionados

    public boolean validateEvent(EventModel event) {
        // Realizar validações de negócios no evento, se necessário
        // Retornar true se o evento for válido, ou false caso contrário
        // Exemplo: verificar se o nome do evento não está vazio e a data do evento é válida
        return !event.getEventName().isEmpty() && event.getEventDate() != null;
    }

    // Outros métodos de negócios relacionados a eventos podem ser adicionados aqui
}
