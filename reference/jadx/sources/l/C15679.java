package l;

/* JADX INFO: renamed from: l.ܳ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBDZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15679 extends AbstractC2476 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f50984;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487[] f50985;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f50986;

    public C15679(C0985 c0985, C9012 c9012, C0063 c0063, AbstractC13487[] abstractC13487Arr) {
        super(c0985, c9012, c0063);
        this.f50985 = abstractC13487Arr;
        this.f50984 = new int[abstractC13487Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f50984;
            if (i < iArr.length) {
                if (abstractC13487Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            } else {
                this.f50986 = -1;
                return;
            }
        }
    }

    public C15679(C0985 c0985, C9012 c9012, C0063 c0063, AbstractC13487[] abstractC13487Arr, int[] iArr, int i) {
        super(c0985, c9012, c0063);
        this.f50985 = abstractC13487Arr;
        this.f50984 = iArr;
        this.f50986 = i;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo14214(C0985 c0985) {
        return new C15679(c0985, m43799(), m43795(), this.f50985, this.f50984, this.f50986);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C15679(m43802(), m43799(), c0063, this.f50985, this.f50984, this.f50986);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37452() {
        return this.f50985.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m37451(int i) {
        return this.f50985[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37449(int i, int i2) {
        if (i2 >= 0) {
            int[] iArr = this.f50984;
            if (iArr[i] != -1) {
                throw new IllegalStateException("index already set");
            }
            iArr[i] = i2;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m37454(int i) {
        int i2 = this.f50984[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "index not yet set for constant ", " value = ");
        sbM12235.append(this.f50985[i]);
        throw new IllegalStateException(sbM12235.toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m37453(int i) {
        if (i >= 0) {
            if (this.f50986 != -1) {
                throw new IllegalStateException("class index already set");
            }
            this.f50986 = i;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC13487[] abstractC13487Arr = this.f50985;
            if (i < abstractC13487Arr.length) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC13487Arr[i].mo1843());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo37455() {
        return mo18812();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo37450() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC13487[] abstractC13487Arr = this.f50985;
            if (i < abstractC13487Arr.length) {
                if (this.f50984[i] == -1) {
                    return "";
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC13487Arr[i].mo1845());
                sb.append('@');
                int iM37454 = m37454(i);
                if (iM37454 < 65536) {
                    sb.append(C5306.m15934(iM37454));
                } else {
                    sb.append(C5306.m15938(iM37454));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
