package l;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 58GU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12349 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6384 f39664;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f39665;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f39666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39667;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f39668;

    public C12349(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39667 = new ArrayList();
        this.f39668 = Collections.EMPTY_LIST;
        this.f39665 = 0.0533f;
        this.f39664 = C6384.f21572;
        this.f39666 = 0.08f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30816(List list, C6384 c6384, float f, float f2) {
        this.f39668 = list;
        this.f39664 = c6384;
        this.f39665 = f;
        this.f39666 = f2;
        while (true) {
            ArrayList arrayList = this.f39667;
            if (arrayList.size() < list.size()) {
                arrayList.add(new C22397(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        List list = this.f39668;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float f4 = this.f39665;
        float f5 = -3.4028235E38f;
        float f6 = f4 == -3.4028235E38f ? -3.4028235E38f : f4 * i2;
        if (f6 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C2137 c2137M17073 = (C2137) list.get(i3);
            if (c2137M17073.f7060 != Integer.MIN_VALUE) {
                C5866 c5866M7381 = c2137M17073.m7381();
                float f7 = c2137M17073.f7048;
                c5866M7381.m17086(f5);
                c5866M7381.m17088(Integer.MIN_VALUE);
                c5866M7381.m17089((Layout.Alignment) null);
                if (c2137M17073.f7056 == 0) {
                    i = 0;
                    c5866M7381.m17075(1.0f - f7, 0);
                } else {
                    i = 0;
                    c5866M7381.m17075((-f7) - 1.0f, 1);
                }
                f = -3.4028235E38f;
                int i4 = c2137M17073.f7059;
                if (i4 == 0) {
                    c5866M7381.m17076(2);
                } else if (i4 == 2) {
                    c5866M7381.m17076(i);
                }
                c2137M17073 = c5866M7381.m17073();
            } else {
                f = -3.4028235E38f;
            }
            C2137 c2137 = c2137M17073;
            int i5 = c2137.f7053;
            float f8 = c2137.f7055;
            if (f8 != f) {
                if (i5 != 0) {
                    if (i5 == 1) {
                        f3 = height;
                    } else if (i5 != 2) {
                        f2 = -3.4028235E38f;
                    }
                    f2 = f8;
                } else {
                    f3 = i2;
                }
                f8 *= f3;
                f2 = f8;
            } else {
                f2 = -3.4028235E38f;
            }
            int i6 = paddingBottom;
            ((C22397) this.f39667.get(i3)).m50473(c2137, this.f39664, f6, f2, this.f39666, canvas, paddingLeft, paddingTop, width, i6);
            i3++;
            f5 = -3.4028235E38f;
            size = size;
            i2 = i2;
            paddingBottom = i6;
            width = width;
        }
    }
}
