package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31IJ */
/* JADX INFO: loaded from: classes4.dex */
public class C19110 extends View {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f61846;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f61847;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61848;

    public C19110(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61848 = -1;
        this.f61846 = null;
        this.f61847 = 4;
        m44229(attributeSet);
    }

    public C19110(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61848 = -1;
        this.f61846 = null;
        this.f61847 = 4;
        m44229(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44229(AttributeSet attributeSet) {
        super.setVisibility(this.f61847);
        this.f61848 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4426);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f61848 = typedArrayObtainStyledAttributes.getResourceId(index, this.f61848);
                } else if (index == 1) {
                    this.f61847 = typedArrayObtainStyledAttributes.getInt(index, this.f61847);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m44230() {
        return this.f61846;
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
    public final void m44231(C16872 c16872) {
        if (this.f61848 == -1 && !isInEditMode()) {
            setVisibility(this.f61847);
        }
        View viewFindViewById = c16872.findViewById(this.f61848);
        this.f61846 = viewFindViewById;
        if (viewFindViewById != null) {
            ((C11651) viewFindViewById.getLayoutParams()).f37698 = true;
            this.f61846.setVisibility(0);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44232() {
        if (this.f61846 == null) {
            return;
        }
        C11651 c11651 = (C11651) getLayoutParams();
        C11651 c11652 = (C11651) this.f61846.getLayoutParams();
        c11652.f37714.m26869(0);
        C10445 c10445 = c11651.f37714;
        EnumC19396 enumC19396 = c10445.f33210[0];
        EnumC19396 enumC19397 = EnumC19396.FIXED;
        if (enumC19396 != enumC19397) {
            c10445.m26805(c11652.f37714.m26806());
        }
        C10445 c10446 = c11651.f37714;
        if (c10446.f33210[1] != enumC19397) {
            c10446.m26824(c11652.f37714.m26823());
        }
        c11652.f37714.m26869(8);
    }
}
