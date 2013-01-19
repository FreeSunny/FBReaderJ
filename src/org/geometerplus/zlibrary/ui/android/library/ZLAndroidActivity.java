/*
 * Copyright (C) 2007-2013 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.ui.android.library;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.*;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import android.view.*;

import org.geometerplus.zlibrary.core.application.ZLApplication;
import org.geometerplus.zlibrary.core.filesystem.ZLFile;
import org.geometerplus.zlibrary.core.filetypes.*;
import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.zlibrary.core.util.MimeType;

import org.geometerplus.zlibrary.ui.android.R;
import org.geometerplus.zlibrary.ui.android.application.ZLAndroidApplicationWindow;
import org.geometerplus.android.util.UIUtil;

import org.geometerplus.fbreader.library.Book;

public abstract class ZLAndroidActivity extends Activity {
	protected abstract void onPluginAbsent(long bookId);
	
	protected abstract ZLFile fileFromIntent(Intent intent);

	protected abstract Runnable getPostponedInitAction();

	protected boolean myIsPaused = false;
	protected AlertDialog myDialogToShow = null;

	protected static ZLAndroidLibrary getZLibrary() {
		return (ZLAndroidLibrary)ZLAndroidLibrary.Instance();
	}

	public abstract void refresh();
}
