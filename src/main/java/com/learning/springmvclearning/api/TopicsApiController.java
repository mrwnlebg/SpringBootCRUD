package com.learning.springmvclearning.api;

import com.learning.springmvclearning.Topic;
import com.learning.springmvclearning.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsApiController {
    @Autowired
    TopicService topicService = new TopicService();

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Integer id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void setNewTopic(@RequestBody Topic topic) {
        topicService.setNewTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateExistingTopic(@RequestBody Topic topic, @PathVariable Integer id) {
        topicService.updateExistingTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteSpecificTopic(@PathVariable Integer id) {
        topicService.deleteSpecificTopic(id);
    }
}
