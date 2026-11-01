package l;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58GU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14425 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f47299;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f47300;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f47301;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1723 f47302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f47303;

    public C14425(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47299 = new ArrayList();
        this.f47303 = Collections.EMPTY_LIST;
        this.f47300 = 0.0533f;
        this.f47302 = C1723.f6825;
        this.f47301 = 0.08f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34695(List list, C1723 c1723, float f, float f2) {
        this.f47303 = list;
        this.f47302 = c1723;
        this.f47300 = f;
        this.f47301 = f2;
        while (true) {
            ArrayList arrayList = this.f47299;
            if (arrayList.size() < list.size()) {
                arrayList.add(new C8032(getContext()));
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
        List list = this.f47303;
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
        float f4 = this.f47300;
        float f5 = -3.4028235E38f;
        float f6 = f4 == -3.4028235E38f ? -3.4028235E38f : f4 * i2;
        if (f6 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C0612 c0612M45996 = (C0612) list.get(i3);
            if (c0612M45996.f2659 != Integer.MIN_VALUE) {
                C20369 c20369M2814 = c0612M45996.m2814();
                float f7 = c0612M45996.f2654;
                c20369M2814.m46009(f5);
                c20369M2814.m46011(Integer.MIN_VALUE);
                c20369M2814.m46012((Layout.Alignment) null);
                if (c0612M45996.f2650 == 0) {
                    i = 0;
                    c20369M2814.m45998(1.0f - f7, 0);
                } else {
                    i = 0;
                    c20369M2814.m45998((-f7) - 1.0f, 1);
                }
                f = -3.4028235E38f;
                int i4 = c0612M45996.f2647;
                if (i4 == 0) {
                    c20369M2814.m45999(2);
                } else if (i4 == 2) {
                    c20369M2814.m45999(i);
                }
                c0612M45996 = c20369M2814.m45996();
            } else {
                f = -3.4028235E38f;
            }
            C0612 c0612 = c0612M45996;
            int i5 = c0612.f2658;
            float f8 = c0612.f2661;
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
            ((C8032) this.f47299.get(i3)).m21143(c0612, this.f47302, f6, f2, this.f47301, canvas, paddingLeft, paddingTop, width, i6);
            i3++;
            f5 = -3.4028235E38f;
            size = size;
            i2 = i2;
            paddingBottom = i6;
            width = width;
        }
    }
}
