package l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1082 extends AbstractC9284 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f3868;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C10030 f3869;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object[] f3870;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21943 f3871;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f3872;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f3873;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C21943[] f3874;

    public C1082(AbstractC16481 abstractC16481, int i, boolean z) {
        super(EnumC24203.SWITCH, 1);
        mo44014(abstractC16481);
        this.f3872 = i;
        this.f3873 = z;
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4065() {
        return this.f3869 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4067(C10030 c10030, int i) {
        this.f3869 = c10030;
        this.f3868 = i;
    }

    @Override // l.AbstractC9284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4068(C21943 c21943) {
        if (this.f3869 == null) {
            throw new C8597("Switch data not yet attached");
        }
        List listM49646 = c21943.m49646();
        int[] iArrM25881 = this.f3869.m25881();
        int length = iArrM25881.length;
        this.f3874 = new C21943[length];
        for (int i = 0; i < length; i++) {
            this.f3874[i] = C23231.m52157(iArrM25881[i], listM49646);
        }
        this.f3871 = C23231.m52157(this.f3868, listM49646);
    }

    @Override // l.AbstractC9284
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4069(C21943 c21943, C21943 c21944) {
        C21943[] c21943Arr = this.f3874;
        if (c21943Arr == null) {
            return;
        }
        int length = c21943Arr.length;
        for (int i = 0; i < length; i++) {
            C21943[] c21943Arr2 = this.f3874;
            if (c21943Arr2[i] == c21943) {
                c21943Arr2[i] = c21944;
            }
        }
        if (this.f3871 == c21943) {
            this.f3871 = c21944;
        }
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if (!(c18959 instanceof C1082) || !super.mo4075(c18959)) {
            return false;
        }
        C1082 c1082 = (C1082) c18959;
        return this.f3872 == c1082.f3872 && this.f3873 == c1082.f3873;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 mo4072() {
        C1082 c1082 = new C1082(mo44035(0), this.f3872, this.f3873);
        c1082.f3869 = this.f3869;
        c1082.f3868 = this.f3868;
        c1082.f3874 = this.f3874;
        c1082.f3871 = this.f3871;
        m44033(c1082);
        return c1082;
    }

    @Override // l.C18959
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m44038());
        C10030 c10030 = this.f3869;
        if (c10030 == null) {
            sb.append("no payload");
        } else {
            int iM25878 = c10030.m25878();
            int[] iArrM25880 = this.f3869.m25880();
            int i = 0;
            if (this.f3874 != null) {
                while (i < iM25878) {
                    sb.append("\n case ");
                    sb.append(iArrM25880[i]);
                    sb.append(": goto ");
                    sb.append(this.f3874[i]);
                    i++;
                }
                if (this.f3868 != -1) {
                    sb.append("\n default: goto ");
                    sb.append(this.f3871);
                }
            } else {
                int[] iArrM25881 = this.f3869.m25881();
                while (i < iM25878) {
                    sb.append("\n case ");
                    sb.append(iArrM25880[i]);
                    sb.append(": goto ");
                    sb.append(C8314.m22396(iArrM25881[i]));
                    i++;
                }
                if (this.f3868 != -1) {
                    sb.append("\n default: goto ");
                    sb.append(C8314.m22396(this.f3868));
                }
            }
        }
        m44030(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m4077() {
        return this.f3872;
    }

    /* JADX INFO: renamed from: ᩴۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4076() {
        return this.f3873;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m4079() {
        return this.f3868;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int[] m4073() {
        C10030 c10030 = this.f3869;
        if (c10030 == null) {
            throw new C8597("Switch data not yet attached");
        }
        return c10030.m25880();
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final int[] m4074() {
        C10030 c10030 = this.f3869;
        if (c10030 == null) {
            throw new C8597("Switch data not yet attached");
        }
        return c10030.m25881();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object m4071(int i) {
        Object[] objArr = this.f3870;
        if (objArr == null) {
            C10030 c10030 = this.f3869;
            if (c10030 == null) {
                throw new C8597("Switch data not yet attached");
            }
            return Integer.valueOf(c10030.m25880()[i]);
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4066(int i, Object obj) {
        if (this.f3870 == null) {
            int[] iArrM4073 = m4073();
            int length = iArrM4073.length;
            Object[] objArr = new Object[length];
            for (int i2 = 0; i2 < length; i2++) {
                objArr[i2] = Integer.valueOf(iArrM4073[i2]);
            }
            this.f3870 = objArr;
        }
        this.f3870[i] = obj;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C21943[] m4078() {
        return this.f3874;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m4070() {
        return this.f3871;
    }
}
