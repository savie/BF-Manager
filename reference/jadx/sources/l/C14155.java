package l;

/* JADX INFO: renamed from: l.ܰ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 056O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14155 extends AbstractC11000 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C14155 f46459 = new C14155();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient Object f46460;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final transient int f46461;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient Object[] f46462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient C14155 f46463;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final transient int f46464;

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo7131() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f46464;
    }

    @Override // l.AbstractC11000, l.InterfaceC21707
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC11000 mo27750() {
        return this.f46463;
    }

    @Override // l.InterfaceC21707
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC21707 mo27750() {
        return this.f46463;
    }

    @Override // l.AbstractC6910, java.util.Map
    public final Object get(Object obj) {
        Object objM32934 = C13449.m32934(this.f46460, this.f46462, this.f46464, this.f46461, obj);
        if (objM32934 == null) {
            return null;
        }
        return objM32934;
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23844 mo7130() {
        return new C5687(this, this.f46462, this.f46461, this.f46464);
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC23844 mo7133() {
        return new C22621(this, new C1453(this.f46461, this.f46464, this.f46462));
    }

    @Override // l.AbstractC11000, l.AbstractC6910
    public Object writeReplace() {
        return super.writeReplace();
    }

    public C14155() {
        this.f46460 = null;
        this.f46462 = new Object[0];
        this.f46461 = 0;
        this.f46464 = 0;
        this.f46463 = this;
    }

    public C14155(int i, Object[] objArr) {
        this.f46462 = objArr;
        this.f46464 = i;
        this.f46461 = 0;
        int iM52566 = i >= 2 ? AbstractC23844.m52566(i) : 0;
        this.f46460 = C13449.m32936(i, iM52566, 0, objArr);
        this.f46463 = new C14155(C13449.m32936(i, iM52566, 1, objArr), objArr, i, this);
    }

    public C14155(Object obj, Object[] objArr, int i, C14155 c14155) {
        this.f46460 = obj;
        this.f46462 = objArr;
        this.f46461 = 1;
        this.f46464 = i;
        this.f46463 = c14155;
    }
}
