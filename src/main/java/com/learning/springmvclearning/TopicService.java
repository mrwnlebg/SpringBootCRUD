package com.learning.springmvclearning;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Java", 1, "So important to learn"),
            new Topic("Javascript", 2, "The future is javascript"),
            new Topic("php", 3, "dead")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(Integer id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void setNewTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateExistingTopic(Integer id, Topic topic) {
        for (int index = 0; index < topics.size(); index++) {
            Topic t = topics.get(index);
            if (t.getId().equals(id)) {
                topics.set(index, topic);
                return;
            }
        }
    }

    public void deleteSpecificTopic(Integer id) {
        for (int index = 0; index < topics.size(); index++) {
            Topic t = topics.get(index);
            if (t.getId().equals(id))
                topics.remove(index);
        }
    }
}
