package com.microsoft.embeddedsocial.server.model.view;

public class TopicView {
    private String topicCategory;

    public TopicView() {
    }

    public TopicView(String topicCategory) {
        this.topicCategory = topicCategory;
    }

    public String getTopicCategory() {
        return topicCategory;
    }
}
