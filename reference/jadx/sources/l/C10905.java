package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1KA */
/* JADX INFO: loaded from: classes4.dex */
public class C10905 extends AbstractC13143 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34530;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f34531;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C24618 f34532;

    public C10905(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C10905(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C10905(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m27675() {
        return this.f34530;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27677(int i) {
        this.f34530 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27670(C10445 c10445, int i, boolean z) {
        this.f34531 = i;
        if (z) {
            int i2 = this.f34530;
            if (i2 == 5) {
                this.f34531 = 1;
            } else if (i2 == 6) {
                this.f34531 = 0;
            }
        } else {
            int i3 = this.f34530;
            if (i3 == 5) {
                this.f34531 = 0;
            } else if (i3 == 6) {
                this.f34531 = 1;
            }
        }
        if (c10445 instanceof C24618) {
            ((C24618) c10445).m54948(this.f34531);
        }
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27673(C10445 c10445, boolean z) {
        m27670(c10445, this.f34530, z);
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo19751(AttributeSet attributeSet) {
        super.mo19751(attributeSet);
        this.f34532 = new C24618();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f34530 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.f34532.m54952(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == 16) {
                    this.f34532.m54953(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f42038 = this.f34532;
        m32674();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27674(boolean z) {
        this.f34532.m54952(z);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m27678() {
        return this.f34532.m54946();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27676() {
        return this.f34532.m54954();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27671(int i) {
        this.f34532.m54953(i);
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27672(C3448 c3448, C14174 c14174, C14634 c14634, SparseArray sparseArray) {
        super.mo27672(c3448, c14174, c14634, sparseArray);
        C20602 c20602 = c3448.f11241;
        if (c14174 instanceof C24618) {
            C24618 c24618 = (C24618) c14174;
            m27670(c24618, c20602.f65986, ((C1497) c14174.f33252).m5345());
            c24618.m54952(c20602.f66015);
            c24618.m54953(c20602.f66017);
        }
    }
}
