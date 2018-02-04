package com.example.android.kaunasguide;

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Title of the location
     */
    private int mTitle;

    private int mDescription;

    /**
     * Photo of the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object.
     *
     * @param title           is the name of the location
     *
     * @param description      is the short description of the location
     * @param imageResourceId is the image that illustrates the location
     */
    public Location(int title, int description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the title of the location
     */
    public int getTitle() {
        return mTitle;
    }

       /**
     * Get the summary of the location
     */
    public int getDescription() {
        return mDescription;
    }

    /**
     * Get the photo of the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Not sure if this is necessary here
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}