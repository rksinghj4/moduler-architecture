package com.raj.profilefeature

import android.app.Activity
import com.raj.sdklite.ProfileFeatureInterface
import javax.inject.Inject

class ProfileFeatureInterfaceImpl @Inject constructor() : ProfileFeatureInterface {
    override fun showProfileScreen(fromActivity: Activity) {
        ProfileActivity.show(fromActivity)
    }
}