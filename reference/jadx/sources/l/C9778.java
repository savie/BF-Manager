package l;

/* JADX INFO: renamed from: l.ۢ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9778 extends AbstractC20967 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0830 f31522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9778(C0830 c0830, AbstractC8909 abstractC8909, int i, int i2) {
        super(c0830);
        this.f31522 = c0830;
        int i3 = i + i2;
        if (i3 > abstractC8909.mo23821()) {
            throw new IllegalArgumentException(C13645.m33382(i3, "tried to queue past end of data, "));
        }
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "tried to queue before start of data, "));
        }
        this.f67056 = abstractC8909;
        new C0084(3);
        this.f58918 = i;
        this.f58921 = i2;
    }

    @Override // l.InterfaceC6971
    public final void run() {
        synchronized (this.f31522.f3128) {
            if (this.f31522.f3128.size() > 0) {
                ((C17983) this.f31522.f3128.getLast()).getClass();
            }
            this.f31522.f3128.add(this);
        }
    }
}
