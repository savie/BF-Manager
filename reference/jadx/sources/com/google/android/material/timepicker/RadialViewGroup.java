package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.C15089;
import l.C18144;
import l.C3798;
import l.C5031;
import l.C5444;
import l.C8033;

/* JADX INFO: loaded from: classes.dex */
public class RadialViewGroup extends C5444 {
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final float LEVEL_RADIUS_RATIO = 0.66f;
    public static final String SKIP_TAG = "skip";
    public MaterialShapeDrawable background;
    public int radius;
    public final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C15089.f49250, this);
        Drawable drawableCreateBackground = createBackground();
        int i2 = C5031.f17539;
        setBackground(drawableCreateBackground);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8033.f27662, i, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8033.f27715, 0);
        this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.updateLayoutParams();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.background.setFillColor(ColorStateList.valueOf(i));
    }

    @Override // l.C5444, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            int i2 = C5031.f17539;
            view.setId(View.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    @Override // l.C5444, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        C18144 c18144 = new C18144();
        c18144.m42253(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C3798.f13880 && !shouldSkipView(childAt)) {
                int i2 = (Integer) childAt.getTag(C3798.f13853);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), c18144, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        c18144.m42246(this);
    }

    private void addConstraints(List list, C18144 c18144, int i) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c18144.m42241(((View) it.next()).getId(), C3798.f13880, i, size);
            size += 360.0f / list.size();
        }
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public int getRadius() {
        return this.radius;
    }

    public int getLeveledRadius(int i) {
        return i == 2 ? Math.round(this.radius * 0.66f) : this.radius;
    }

    public static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }
}
