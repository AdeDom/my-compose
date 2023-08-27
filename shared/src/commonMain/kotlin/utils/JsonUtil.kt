package utils

import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import data.models.sdui.ModifierData
import data.models.sdui.datamodel.sealed.ArrangementData
import data.models.sdui.datamodel.sealed.BackgroundData
import data.models.sdui.datamodel.sealed.BorderData
import data.models.sdui.datamodel.sealed.BrushData
import data.models.sdui.datamodel.sealed.ClipData
import data.models.sdui.datamodel.sealed.ShapeData
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

object JsonUtil {

    fun getJson(): Json {
        return Json {
            ignoreUnknownKeys = true
            isLenient = true
            prettyPrint = true
            serializersModule = SerializersModule {
                polymorphic(ComposableData::class) {
                    subclass(ComposableData.Box::class)
                    subclass(ComposableData.Column::class)
                    subclass(ComposableData.KamelImage::class)
                    subclass(ComposableData.LazyColumn::class)
                    subclass(ComposableData.Row::class)
                    subclass(ComposableData.Text::class)
                    defaultDeserializer { ComposableData.Unknown.serializer() }
                }
                polymorphic(ModifierData::class) {
                    subclass(ModifierData.Alignment::class)
                    subclass(ModifierData.AspectRatio::class)
                    subclass(ModifierData.Background::class)
                    subclass(ModifierData.Border::class)
                    subclass(ModifierData.Clickable::class)
                    subclass(ModifierData.Clip::class)
                    subclass(ModifierData.FillMaxHeight::class)
                    subclass(ModifierData.FillMaxSize::class)
                    subclass(ModifierData.FillMaxWidth::class)
                    subclass(ModifierData.Height::class)
                    subclass(ModifierData.Padding::class)
                    subclass(ModifierData.Size::class)
                    subclass(ModifierData.Weight::class)
                    subclass(ModifierData.Width::class)
                    defaultDeserializer { ModifierData.Unknown.serializer() }
                }
                polymorphic(ActionData::class) {
                    subclass(ActionData.Open::class)
                    defaultDeserializer { ActionData.Unknown.serializer() }
                }
                polymorphic(ArrangementData::class) {
                    subclass(ArrangementData.SpacedBy::class)
                    defaultDeserializer { ArrangementData.Unknown.serializer() }
                }
                polymorphic(ClipData::class) {
                    subclass(ClipData.CircleShape::class)
                    subclass(ClipData.RoundedCornerShape::class)
                    defaultDeserializer { ClipData.Unknown.serializer() }
                }
                polymorphic(BackgroundData::class) {
                    subclass(BackgroundData.Brush::class)
                    subclass(BackgroundData.Color::class)
                    defaultDeserializer { BackgroundData.Unknown.serializer() }
                }
                polymorphic(BorderData::class) {
                    subclass(BorderData.Brush::class)
                    subclass(BorderData.Color::class)
                    defaultDeserializer { BorderData.Unknown.serializer() }
                }
                polymorphic(ShapeData::class) {
                    subclass(ShapeData.CircleShape::class)
                    subclass(ShapeData.RectangleShape::class)
                    subclass(ShapeData.RoundedCornerShape::class)
                    defaultDeserializer { ShapeData.Unknown.serializer() }
                }
                polymorphic(BrushData::class) {
                    subclass(BrushData.HorizontalGradient::class)
                    subclass(BrushData.LinearGradient::class)
                    subclass(BrushData.RadialGradient::class)
                    subclass(BrushData.SweepGradient::class)
                    subclass(BrushData.VerticalGradient::class)
                    defaultDeserializer { BrushData.Unknown.serializer() }
                }
            }
        }
    }
}
