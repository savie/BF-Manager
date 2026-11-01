package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31IJ */
/* JADX INFO: loaded from: classes3.dex */
public class C7561 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f25074;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View f25075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25076;

    public C7561(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25076 = -1;
        this.f25075 = null;
        this.f25074 = 4;
        m20079(attributeSet);
    }

    public C7561(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25076 = -1;
        this.f25075 = null;
        this.f25074 = 4;
        m20079(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20079(AttributeSet attributeSet) {
        super.setVisibility(this.f25074);
        this.f25076 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51887);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f25076 = typedArrayObtainStyledAttributes.getResourceId(index, this.f25076);
                } else if (index == 1) {
                    this.f25074 = typedArrayObtainStyledAttributes.getInt(index, this.f25074);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m20080() {
        return this.f25075;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20081(C5444 c5444) {
        if (this.f25076 == -1 && !isInEditMode()) {
            setVisibility(this.f25074);
        }
        View viewFindViewById = c5444.findViewById(this.f25076);
        this.f25075 = viewFindViewById;
        if (viewFindViewById != null) {
            ((C11795) viewFindViewById.getLayoutParams()).f39635 = true;
            this.f25075.setVisibility(0);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20082() {
        if (this.f25075 == null) {
            return;
        }
        C11795 c11795 = (C11795) getLayoutParams();
        C11795 c11796 = (C11795) this.f25075.getLayoutParams();
        c11796.f39661.m46636(0);
        C20719 c20719 = c11795.f39661;
        EnumC7313 enumC7313 = c20719.f67434[0];
        EnumC7313 enumC7314 = EnumC7313.FIXED;
        if (enumC7313 != enumC7314) {
            c20719.m46608(c11796.f39661.m46640());
        }
        C20719 c207110 = c11795.f39661;
        if (c207110.f67434[1] != enumC7314) {
            c207110.m46620(c11796.f39661.m46619());
        }
        c11796.f39661.m46636(8);
    }
}
