package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes.dex */
public class C23935 extends AbstractC3472 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77519;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f77520;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21424 f77521;

    public C23935(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C23935(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C23935(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m52767() {
        return this.f77520;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52766(int i) {
        this.f77520 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52761(C20719 c20719, int i, boolean z) {
        this.f77519 = i;
        if (z) {
            int i2 = this.f77520;
            if (i2 == 5) {
                this.f77519 = 1;
            } else if (i2 == 6) {
                this.f77519 = 0;
            }
        } else {
            int i3 = this.f77520;
            if (i3 == 5) {
                this.f77519 = 0;
            } else if (i3 == 6) {
                this.f77519 = 1;
            }
        }
        if (c20719 instanceof C21424) {
            ((C21424) c20719).m47996(this.f77519);
        }
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo8331(C20719 c20719, boolean z) {
        m52761(c20719, this.f77520, z);
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo8328(AttributeSet attributeSet) {
        super.mo8328(attributeSet);
        this.f77521 = new C21424();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f77520 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.f77521.m47998(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.f77521.m47995(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f12754 = this.f77521;
        m10202();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52764(boolean z) {
        this.f77521.m47998(z);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m52762() {
        return this.f77521.m47993();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m52765() {
        return this.f77521.m48001();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52763(int i) {
        this.f77521.m47995(i);
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo8329(C4032 c4032, C17191 c17191, C18850 c18850, SparseArray sparseArray) {
        super.mo8329(c4032, c17191, c18850, sparseArray);
        C6855 c6855 = c4032.f14903;
        if (c17191 instanceof C21424) {
            C21424 c21424 = (C21424) c17191;
            m52761(c21424, c6855.f23097, ((C15781) c17191.f67433).m37538());
            c21424.m47998(c6855.f23103);
            c21424.m47995(c6855.f23074);
        }
    }
}
