package l;

/* JADX INFO: renamed from: l.ۖ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBDZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2823 extends AbstractC10794 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f10708;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f10709;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC9901[] f10710;

    public C2823(C17143 c17143, C11312 c11312, C0727 c0727, AbstractC9901[] abstractC9901Arr) {
        super(c17143, c11312, c0727);
        this.f10710 = abstractC9901Arr;
        this.f10708 = new int[abstractC9901Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f10708;
            if (i < iArr.length) {
                if (abstractC9901Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            } else {
                this.f10709 = -1;
                return;
            }
        }
    }

    public C2823(C17143 c17143, C11312 c11312, C0727 c0727, AbstractC9901[] abstractC9901Arr, int[] iArr, int i) {
        super(c17143, c11312, c0727);
        this.f10710 = abstractC9901Arr;
        this.f10708 = iArr;
        this.f10709 = i;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 mo8570(C17143 c17143) {
        return new C2823(c17143, m38701(), m38695(), this.f10710, this.f10708, this.f10709);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C2823(m38693(), m38701(), c0727, this.f10710, this.f10708, this.f10709);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m8575() {
        return this.f10710.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m8574(int i) {
        return this.f10710[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m8566(int i) {
        int i2 = this.f10708[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "index not yet set for constant ", " value = ");
        sbM40153.append(this.f10710[i]);
        throw new IllegalStateException(sbM40153.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8571(int i, int i2) {
        if (i2 >= 0) {
            int[] iArr = this.f10708;
            if (iArr[i] != -1) {
                throw new IllegalStateException("index already set");
            }
            iArr[i] = i2;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m8572(int i) {
        if (i >= 0) {
            if (this.f10709 != -1) {
                throw new IllegalStateException("class index already set");
            }
            this.f10709 = i;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo8568() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC9901[] abstractC9901Arr = this.f10710;
            if (i < abstractC9901Arr.length) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC9901Arr[i].mo2376());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo8567() {
        return mo8568();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo8573() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC9901[] abstractC9901Arr = this.f10710;
            if (i < abstractC9901Arr.length) {
                if (this.f10708[i] == -1) {
                    return "";
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC9901Arr[i].mo2375());
                sb.append('@');
                int iM8566 = m8566(i);
                if (iM8566 < 65536) {
                    sb.append(C22475.m49982(iM8566));
                } else {
                    sb.append(C22475.m49978(iM8566));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
