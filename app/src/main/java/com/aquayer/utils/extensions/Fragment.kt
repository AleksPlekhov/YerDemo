package com.aquayer.utils.extensions

import android.content.Intent
import android.net.Uri
import androidx.fragment.app.Fragment


fun Fragment.openHyperLink(url: String) {
    activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}