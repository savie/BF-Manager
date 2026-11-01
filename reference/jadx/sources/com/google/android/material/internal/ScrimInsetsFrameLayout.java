package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.C15844;
import l.C18616;
import l.C5031;
import l.C8033;
import l.InterfaceC11754;

/* JADX INFO: loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    public boolean drawBottomInsetForeground;
    public boolean drawLeftInsetForeground;
    public boolean drawRightInsetForeground;
    public boolean drawTopInsetForeground;
    public Drawable insetForeground;
    public Rect insets;
    public Rect tempRect;

    public void onInsetsChanged(C15844 c15844) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new Rect();
        this.drawTopInsetForeground = true;
        this.drawBottomInsetForeground = true;
        this.drawLeftInsetForeground = true;
        this.drawRightInsetForeground = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C8033.f26678, i, C18616.f59847, new int[0]);
        this.insetForeground = typedArrayObtainStyledAttributes.getDrawable(C8033.f27370);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C5031.m13989(this, new InterfaceC11754() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // l.InterfaceC11754
            public C15844 onApplyWindowInsets(View view, C15844 c15844) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.insets == null) {
                    scrimInsetsFrameLayout.insets = new Rect();
                }
                ScrimInsetsFrameLayout.this.insets.set(c15844.m37683(), c15844.m37681(), c15844.m37672(), c15844.m37670());
                ScrimInsetsFrameLayout.this.onInsetsChanged(c15844);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!c15844.m37690() || ScrimInsetsFrameLayout.this.insetForeground == null);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
                int i2 = C5031.f17539;
                scrimInsetsFrameLayout2.postInvalidateOnAnimation();
                return c15844.m37682();
            }
        });
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.insetForeground = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.drawTopInsetForeground = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.drawBottomInsetForeground = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.drawLeftInsetForeground = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.drawRightInsetForeground = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets == null || this.insetForeground == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.drawTopInsetForeground) {
            this.tempRect.set(0, 0, width, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawBottomInsetForeground) {
            this.tempRect.set(0, height - this.insets.bottom, width, height);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawLeftInsetForeground) {
            Rect rect = this.tempRect;
            Rect rect2 = this.insets;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawRightInsetForeground) {
            Rect rect3 = this.tempRect;
            Rect rect4 = this.insets;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
