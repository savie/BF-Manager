package l;

/* JADX INFO: renamed from: l.۬ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13579 implements InterfaceC25138, InterfaceC2017 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43130;

    public /* synthetic */ C13579(Object obj) {
        this.f43130 = obj;
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        final C16320 c16320 = (C16320) this.f43130;
        Throwable th = (Throwable) obj;
        C13950 c13950 = c16320.f52982;
        return (c13950 == null ? FutureC23690.m52928(null) : c13950.m34017()).m52943(new InterfaceC25138() { // from class: l.᩸᩵᩸
            @Override // l.InterfaceC25138
            public final Object apply(Object obj2) {
                return c16320.f52987.m41087();
            }
        }).m52933((InterfaceC11711) new C20050(th));
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        ((C25096) this.f43130).m55947();
    }
}
