package l;

/* JADX INFO: renamed from: l.ۧܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBBB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11083 extends C18947 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC9901[] f37619;

    public C11083(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f37619 = new AbstractC9901[i];
    }

    public final int size() {
        return this.f37619.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m27930(int i) {
        try {
            return this.f37619[i];
        } catch (IndexOutOfBoundsException unused) {
            throw new C7513("invalid constant pool index ".concat(C22475.m49982(i)), null);
        }
    }

    public final AbstractC9901 get(int i) {
        try {
            AbstractC9901 abstractC9901 = this.f37619[i];
            if (abstractC9901 != null) {
                return abstractC9901;
            }
            throw new C7513("invalid constant pool index ".concat(C22475.m49982(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C7513("invalid constant pool index ".concat(C22475.m49982(i)), null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27931(int i, AbstractC9901 abstractC9901) {
        int i2;
        AbstractC9901 abstractC9902;
        m43641();
        boolean z = abstractC9901 != null && abstractC9901.mo2379();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        AbstractC9901[] abstractC9901Arr = this.f37619;
        if (z) {
            if (i == abstractC9901Arr.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            abstractC9901Arr[i + 1] = null;
        }
        if (abstractC9901 != null && abstractC9901Arr[i] == null && (abstractC9902 = abstractC9901Arr[(i2 = i - 1)]) != null && abstractC9902.mo2379()) {
            abstractC9901Arr[i2] = null;
        }
        abstractC9901Arr[i] = abstractC9901;
    }
}
