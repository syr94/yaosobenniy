package com.yaosobenniy.site.controller;

import com.yaosobenniy.site.model.Message;
import com.yaosobenniy.site.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getMessages() {
        return messageService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable Long id) {
        return messageService.findById(id);
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageService.save(message);
    }

    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message message) {
        message.setId(id);
        return messageService.save(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteById(id);
    }
}