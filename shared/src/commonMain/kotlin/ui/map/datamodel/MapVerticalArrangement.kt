package ui.map.datamodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import data.models.sdui.datamodel.sealed.ArrangementData

internal fun ArrangementData?.mapVerticalArrangement(): Arrangement.Vertical {
    return when (this) {
        is ArrangementData.SpacedBy -> Arrangement.spacedBy((this.spacedBy ?: 0).dp)
        ArrangementData.Unknown, null -> Arrangement.Top
    }
}
