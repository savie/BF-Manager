package l;

/* JADX INFO: renamed from: l.᩷ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes.dex */
public final class C22041 implements InterfaceC1399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10852 f71083;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6117 f71084;

    public C22041(C10852 c10852, C6117 c6117) {
        this.f71083 = c10852;
        this.f71084 = c6117;
    }

    @Override // l.InterfaceC1399
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5109(C6117 c6117) {
        C6117 c6118 = this.f71084;
        boolean zM17649 = c6117.m17649(c6118);
        C10852 c10852M27583 = this.f71083;
        if (!zM17649) {
            C10852.f34361.mo13720(c6117.m17648(), "Re-routing the connection to host {}");
            c10852M27583 = c10852M27583.m27583(c6117);
        }
        if (c6117.m17652(c6118)) {
            return null;
        }
        return c10852M27583.m27582(c6117.m17650());
    }
}
