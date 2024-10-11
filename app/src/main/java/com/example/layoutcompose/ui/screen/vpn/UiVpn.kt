package com.example.layoutcompose.ui.screen.vpn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun VpnUi(vpnService:GoogleVpnService) {
    var isVpnActive by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = if (isVpnActive) "VPN is Active" else "VPN is Inactive")
        Button(onClick = {
            if (isVpnActive) {
                // Stop VPN
//                vpnService.stopVpn() // Implement this method
            } else {
                // Start VPN
                vpnService.startVpn() // Implement this method
            }
            isVpnActive = !isVpnActive
        }) {
            Text(text = if (isVpnActive) "Disconnect" else "Connect")
        }
    }
}