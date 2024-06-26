package com.nirvikbasnet.distancetrack.util

import android.Manifest
import android.content.Context
import androidx.fragment.app.Fragment
import com.nirvikbasnet.distancetrack.util.Constants.PERMISSION_LOCATION_REQUEST_CODE
import com.vmadalin.easypermissions.EasyPermissions

object Permissions {

    fun hasLocationPermission(context: Context)=
        EasyPermissions.hasPermissions(context,
        Manifest.permission.ACCESS_FINE_LOCATION)


    fun requestLocationPermission(fragment : Fragment){
        EasyPermissions.requestPermissions(fragment,
        "This application cannot work without location permissions",
            PERMISSION_LOCATION_REQUEST_CODE,
            Manifest.permission.ACCESS_FINE_LOCATION
            )
    }
}