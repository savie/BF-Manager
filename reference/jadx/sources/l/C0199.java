package l;

/* JADX INFO: renamed from: l.֡ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C0199 extends AbstractC6166 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f1335 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f1336;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f1337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0199 m1586(C14902 c14902) {
        return new C0199(new C7657(c14902), C11328.f35682, f1335);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0199 m1587(AbstractC24755 abstractC24755, Object obj, Object obj2) {
        return new C0199(abstractC24755, obj, obj2);
    }

    public C0199(AbstractC24755 abstractC24755, Object obj, Object obj2) {
        super(abstractC24755);
        this.f1337 = obj;
        this.f1336 = obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0199 m1590(AbstractC24755 abstractC24755) {
        return new C0199(abstractC24755, this.f1337, this.f1336);
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11328 mo1592(int i, C11328 c11328, long j) {
        this.f21004.mo1592(i, c11328, j);
        if (C17359.equals(c11328.f35698, this.f1337)) {
            c11328.f35698 = C11328.f35682;
        }
        return c11328;
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1634 mo1591(int i, C1634 c1634, boolean z) {
        this.f21004.mo1591(i, c1634, z);
        if (C17359.equals(c1634.f5658, this.f1336) && z) {
            c1634.f5658 = f1335;
        }
        return c1634;
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1588(Object obj) {
        Object obj2;
        if (f1335.equals(obj) && (obj2 = this.f1336) != null) {
            obj = obj2;
        }
        return this.f21004.mo1588(obj);
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1589(int i) {
        Object objMo1589 = this.f21004.mo1589(i);
        return C17359.equals(objMo1589, this.f1336) ? f1335 : objMo1589;
    }
}
