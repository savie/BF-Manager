package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import l.C5031;
import l.C8033;
import l.C9535;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarItemStyle {
    public final ColorStateList backgroundColor;
    public final Rect insets;
    public final ShapeAppearanceModel itemShape;
    public final ColorStateList strokeColor;
    public final int strokeWidth;
    public final ColorStateList textColor;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        C9535.m24382(rect.left);
        C9535.m24382(rect.top);
        C9535.m24382(rect.right);
        C9535.m24382(rect.bottom);
        this.insets = rect;
        this.textColor = colorStateList2;
        this.backgroundColor = colorStateList;
        this.strokeColor = colorStateList3;
        this.strokeWidth = i;
        this.itemShape = shapeAppearanceModel;
    }

    public static CalendarItemStyle create(Context context, int i) {
        C9535.m24384("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C8033.f26778);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f28106, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f26457, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f27416, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C8033.f27149, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f27043);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f26495);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f27347);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27187, 0);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f26564, 0), typedArrayObtainStyledAttributes.getResourceId(C8033.f26655, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
    }

    public void styleItem(TextView textView) {
        styleItem(textView, null, null);
    }

    public void styleItem(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.itemShape);
        materialShapeDrawable2.setShapeAppearanceModel(this.itemShape);
        if (colorStateList == null) {
            colorStateList = this.backgroundColor;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        if (colorStateList2 == null) {
            colorStateList2 = this.textColor;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.textColor.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.insets;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int i = C5031.f17539;
        textView.setBackground(insetDrawable);
    }

    public int getLeftInset() {
        return this.insets.left;
    }

    public int getRightInset() {
        return this.insets.right;
    }

    public int getTopInset() {
        return this.insets.top;
    }

    public int getBottomInset() {
        return this.insets.bottom;
    }
}
