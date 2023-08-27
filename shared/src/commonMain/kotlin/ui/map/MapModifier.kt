package ui.map

import androidx.compose.ui.Modifier
import data.models.sdui.ActionData
import data.models.sdui.ModifierData
import ui.map.datamodel.mapWeight
import ui.map.modifier.mapAlignment
import ui.map.modifier.mapAspectRatio
import ui.map.modifier.mapBackground
import ui.map.modifier.mapBorder
import ui.map.modifier.mapClickable
import ui.map.modifier.mapClip
import ui.map.modifier.mapFillMaxHeight
import ui.map.modifier.mapFillMaxSize
import ui.map.modifier.mapFillMaxWidth
import ui.map.modifier.mapHeight
import ui.map.modifier.mapPadding
import ui.map.modifier.mapSize
import ui.map.modifier.mapWidth

internal fun List<ModifierData>?.mapModifier(
    modifier: Modifier,
    onClick: (ActionData?) -> Unit
): Modifier {
    return when (this?.size) {
        1 -> {
            modifier
                .mapModifier(this[0], onClick)
        }

        2 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
        }

        3 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
        }

        4 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
        }

        5 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
        }

        6 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
        }

        7 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
        }

        8 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
        }

        9 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
        }

        10 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
        }

        11 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
                .mapModifier(this[10], onClick)
        }

        12 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
                .mapModifier(this[10], onClick)
                .mapModifier(this[11], onClick)
        }

        13 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
                .mapModifier(this[10], onClick)
                .mapModifier(this[11], onClick)
                .mapModifier(this[12], onClick)
        }

        14 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
                .mapModifier(this[10], onClick)
                .mapModifier(this[11], onClick)
                .mapModifier(this[12], onClick)
                .mapModifier(this[13], onClick)
        }

        15 -> {
            modifier
                .mapModifier(this[0], onClick)
                .mapModifier(this[1], onClick)
                .mapModifier(this[2], onClick)
                .mapModifier(this[3], onClick)
                .mapModifier(this[4], onClick)
                .mapModifier(this[5], onClick)
                .mapModifier(this[6], onClick)
                .mapModifier(this[7], onClick)
                .mapModifier(this[8], onClick)
                .mapModifier(this[9], onClick)
                .mapModifier(this[10], onClick)
                .mapModifier(this[11], onClick)
                .mapModifier(this[12], onClick)
                .mapModifier(this[13], onClick)
                .mapModifier(this[14], onClick)
        }

        else -> {
            modifier
        }
    }
}

internal fun Modifier.mapModifier(
    modifier: ModifierData?,
    onClick: (ActionData?) -> Unit
): Modifier {
    return if (modifier != null) {
        when (modifier) {
            is ModifierData.Alignment -> this.mapAlignment(modifier)
            is ModifierData.AspectRatio -> this.mapAspectRatio(modifier)
            is ModifierData.Background -> this.mapBackground(modifier)
            is ModifierData.Border -> this.mapBorder(modifier)
            is ModifierData.Clickable -> this.mapClickable(modifier, onClick)
            is ModifierData.Clip -> this.mapClip(modifier)
            ModifierData.FillMaxHeight -> this.mapFillMaxHeight()
            ModifierData.FillMaxSize -> this.mapFillMaxSize()
            ModifierData.FillMaxWidth -> this.mapFillMaxWidth()
            is ModifierData.Height -> this.mapHeight(modifier)
            is ModifierData.Padding -> this.mapPadding(modifier)
            is ModifierData.Size -> this.mapSize(modifier)
            is ModifierData.Weight -> this.mapWeight(modifier)
            is ModifierData.Width -> this.mapWidth(modifier)
            ModifierData.Unknown -> this
        }
    } else {
        this
    }
}
