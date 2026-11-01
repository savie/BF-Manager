package l;

/* JADX INFO: renamed from: l.᩻ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9GZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23743 extends AbstractC1869 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f76813 = C13488.m32997(C23743.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15982 f76814;

    public C23743(C15982 c15982) {
        this.f76814 = c15982;
    }

    @Override // l.AbstractC1869
    /* JADX INFO: renamed from: ۙ */
    public final void mo6062(C2597 c2597) {
        int iM4336 = ((C1186) c2597.m19360()).m4336();
        C15982 c15982 = this.f76814;
        c15982.m37962(iM4336);
        f76813.mo12139("Server granted us {} credits for {}, now available: {} credits", Integer.valueOf(((C1186) c2597.m19360()).m4336()), c2597, Integer.valueOf(c15982.m37961()));
        this.f53462.m39153(c2597);
    }
}
