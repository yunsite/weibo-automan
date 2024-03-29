/*
 * Zirco Browser for Android Copyright (C) 2010 J. Devauchelle and contributors. This program is free software; you can
 * redistribute it and/or modify it under the terms of the GNU General Public License version 3 as published by the Free
 * Software Foundation. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 */

package org.zirco.events;

/**
 * Interface for object listening to download events.
 */
public interface IDownloadEventsListener {

    /**
     * The method run on download events.
     * 
     * @param event The event.
     * @param data Additional data.
     */
    void onDownloadEvent(String event, Object data);

}
