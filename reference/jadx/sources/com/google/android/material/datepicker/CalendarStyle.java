package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import l.C2387;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarStyle {
    public final CalendarItemStyle day;
    public final CalendarItemStyle invalidDay;
    public final Paint rangeFill;
    public final CalendarItemStyle selectedDay;
    public final CalendarItemStyle selectedYear;
    public final CalendarItemStyle todayDay;
    public final CalendarItemStyle todayYear;
    public final CalendarItemStyle year;

    public CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C2387.f8432, MaterialCalendar.class.getCanonicalName()), C8033.f27628);
        this.day = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f26602, 0));
        this.invalidDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f26389, 0));
        this.selectedDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f27294, 0));
        this.todayDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f26816, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f27454);
        this.year = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f27666, 0));
        this.selectedYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f27931, 0));
        this.todayYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C8033.f27719, 0));
        Paint paint = new Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
