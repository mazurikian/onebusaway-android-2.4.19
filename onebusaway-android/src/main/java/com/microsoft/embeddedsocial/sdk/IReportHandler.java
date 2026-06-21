package com.microsoft.embeddedsocial.sdk;

import android.content.Context;

import com.microsoft.embeddedsocial.server.model.view.TopicView;

public interface IReportHandler {
    void generateReport(Context context, TopicView topic);
    String getDisplayString(Context context, TopicView topic);
}
