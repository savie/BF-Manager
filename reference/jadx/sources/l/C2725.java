package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public class C2725 extends AbstractC12501 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0257 f10494;

    public C2725(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C2725(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8331(C20719 c20719, boolean z) {
        this.f10494.m27189(z);
    }

    @Override // l.AbstractC3472, android.view.View
    public final void onMeasure(int i, int i2) {
        mo8330(this.f10494, i, i2);
    }

    @Override // l.AbstractC12501
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8330(C10842 c10842, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c10842 != null) {
            c10842.mo1743(mode, size, mode2, size2);
            setMeasuredDimension(c10842.m27181(), c10842.m27188());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8329(C4032 c4032, C17191 c17191, C18850 c18850, SparseArray sparseArray) {
        super.mo8329(c4032, c17191, c18850, sparseArray);
        if (c17191 instanceof C0257) {
            C0257 c0257 = (C0257) c17191;
            int i = c18850.f39607;
            if (i != -1) {
                c0257.m1742(i);
            }
        }
    }

    @Override // l.AbstractC12501, l.AbstractC3472
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8328(AttributeSet attributeSet) {
        super.mo8328(attributeSet);
        this.f10494 = new C0257();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f10494.m1742(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f10494.m27186(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    this.f10494.m27179(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 12) {
                    this.f10494.m27195(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.f10494.m27191(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f10494.m27192(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f10494.m27194(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f10494.m27185(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.f10494.m1741(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.f10494.m1759(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.f10494.m1752(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.f10494.m1753(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.f10494.m1756(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.f10494.m1757(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.f10494.m1739(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.f10494.m1747(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.f10494.m1751(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.f10494.m1758(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.f10494.m1740(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.f10494.m1738(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.f10494.m1754(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.f10494.m1748(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.f10494.m1746(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.f10494.m1750(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.f10494.m1755(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.f10494.m1749(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f12754 = this.f10494;
        m10202();
    }
}
