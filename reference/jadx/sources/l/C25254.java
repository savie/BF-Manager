package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: l.᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public class C25254 extends AbstractC7177 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C2988 f81580;

    public C25254(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C25254(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo27673(C10445 c10445, boolean z) {
        this.f81580.m49421(z);
    }

    @Override // l.AbstractC13143, android.view.View
    public final void onMeasure(int i, int i2) {
        mo19752(this.f81580, i, i2);
    }

    @Override // l.AbstractC7177
    /* JADX INFO: renamed from: ۙ */
    public final void mo19752(C21789 c21789, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c21789 != null) {
            c21789.mo9734(mode, size, mode2, size2);
            setMeasuredDimension(c21789.m49407(), c21789.m49410());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo27672(C3448 c3448, C14174 c14174, C14634 c14634, SparseArray sparseArray) {
        super.mo27672(c3448, c14174, c14634, sparseArray);
        if (c14174 instanceof C2988) {
            C2988 c2988 = (C2988) c14174;
            int i = c14634.f37697;
            if (i != -1) {
                c2988.m9747(i);
            }
        }
    }

    @Override // l.AbstractC7177, l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo19751(AttributeSet attributeSet) {
        super.mo19751(attributeSet);
        this.f81580 = new C2988();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f81580.m9747(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f81580.m49411(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 11) {
                    this.f81580.m49418(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 12) {
                    this.f81580.m49408(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.f81580.m49414(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f81580.m49406(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f81580.m49420(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f81580.m49422(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 38) {
                    this.f81580.m9753(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 28) {
                    this.f81580.m9742(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 37) {
                    this.f81580.m9745(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 22) {
                    this.f81580.m9740(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 30) {
                    this.f81580.m9733(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 24) {
                    this.f81580.m9749(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 32) {
                    this.f81580.m9741(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 26) {
                    this.f81580.m9750(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 21) {
                    this.f81580.m9744(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 29) {
                    this.f81580.m9748(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 23) {
                    this.f81580.m9752(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 31) {
                    this.f81580.m9746(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 35) {
                    this.f81580.m9738(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 25) {
                    this.f81580.m9743(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 34) {
                    this.f81580.m9737(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 27) {
                    this.f81580.m9732(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 36) {
                    this.f81580.m9751(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 33) {
                    this.f81580.m9739(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f42038 = this.f81580;
        m32674();
    }
}
