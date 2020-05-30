
package com.mehmetsaitisik.youtubeplaylist;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Snippet {

    @SerializedName("channelId")
    private String mChannelId;
    @SerializedName("channelTitle")
    private String mChannelTitle;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("localized")
    private Localized mLocalized;
    @SerializedName("publishedAt")
    private String mPublishedAt;
    @SerializedName("thumbnails")
    private Thumbnails mThumbnails;
    @SerializedName("title")
    private String mTitle;

    public String getChannelId() {
        return mChannelId;
    }

    public void setChannelId(String channelId) {
        mChannelId = channelId;
    }

    public String getChannelTitle() {
        return mChannelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        mChannelTitle = channelTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Localized getLocalized() {
        return mLocalized;
    }

    public void setLocalized(Localized localized) {
        mLocalized = localized;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        mPublishedAt = publishedAt;
    }

    public Thumbnails getThumbnails() {
        return mThumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        mThumbnails = thumbnails;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
