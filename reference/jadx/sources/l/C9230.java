package l;

/* JADX INFO: renamed from: l.ۡ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBBB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9230 extends C20222 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC13487[] f30064;

    public C9230(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f30064 = new AbstractC13487[i];
    }

    public final int size() {
        return this.f30064.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m24414(int i) {
        try {
            return this.f30064[i];
        } catch (IndexOutOfBoundsException unused) {
            throw new C3880("invalid constant pool index ".concat(C5306.m15934(i)), null);
        }
    }

    public final AbstractC13487 get(int i) {
        try {
            AbstractC13487 abstractC13487 = this.f30064[i];
            if (abstractC13487 != null) {
                return abstractC13487;
            }
            throw new C3880("invalid constant pool index ".concat(C5306.m15934(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3880("invalid constant pool index ".concat(C5306.m15934(i)), null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24415(int i, AbstractC13487 abstractC13487) {
        int i2;
        AbstractC13487 abstractC13488;
        m46490();
        boolean z = abstractC13487 != null && abstractC13487.mo1849();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        AbstractC13487[] abstractC13487Arr = this.f30064;
        if (z) {
            if (i == abstractC13487Arr.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            abstractC13487Arr[i + 1] = null;
        }
        if (abstractC13487 != null && abstractC13487Arr[i] == null && (abstractC13488 = abstractC13487Arr[(i2 = i - 1)]) != null && abstractC13488.mo1849()) {
            abstractC13487Arr[i2] = null;
        }
        abstractC13487Arr[i] = abstractC13487;
    }
}
