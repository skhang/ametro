/*
 * http://code.google.com/p/ametro/
 * Transport map viewer for Android platform
 * Copyright (C) 2009-2010 Roman.Golovanov@gmail.com and other
 * respective project committers (see project home page)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.ametro.catalog;

public class CatalogMapState {
	public static final int OFFLINE = 0;
	public static final int NOT_SUPPORTED = 1;
	public static final int CORRUPTED = 2;
	public static final int UPDATE = 3;
	public static final int INSTALLED = 4;
	public static final int IMPORT = 5;
	public static final int DOWNLOAD = 6;
	public static final int UPDATE_NOT_SUPPORTED = 7;
	public static final int NEED_TO_UPDATE = 8;
	public static final int DOWNLOAD_PENDING = 9;
	public static final int IMPORT_PENDING = 10;
	public static final int DOWNLOADING = 11;
	public static final int IMPORTING = 12;
}
