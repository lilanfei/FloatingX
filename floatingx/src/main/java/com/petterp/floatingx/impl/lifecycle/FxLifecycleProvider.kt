package com.petterp.floatingx.impl.lifecycle

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import com.petterp.floatingx.FloatingX

/**
 * AppLifecycle全局绑定者
 *
 * @author petterp
 */
class FxLifecycleProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        context?.let {
            FloatingX.initContext(it)
        }
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? = null

    override fun getType(uri: Uri): String? = null

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int = 0

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int = 0
}
