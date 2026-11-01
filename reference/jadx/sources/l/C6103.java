package l;

/* JADX INFO: renamed from: l.ۛܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9HO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6103 extends AbstractC1869 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f20670 = C13488.m32997(C6103.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6808 f20671;

    public C6103(C6808 c6808) {
        this.f20671 = c6808;
    }

    @Override // l.AbstractC1869
    /* JADX INFO: renamed from: ۙ */
    public final void mo6062(C2597 c2597) {
        C18803 c18803M18403 = this.f20671.m18403(Long.valueOf(((C1186) c2597.m19360()).m4341()));
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c18803M18403.m43371().getTime());
        InterfaceC4314 interfaceC4314 = f20670;
        interfaceC4314.mo12137("Send/Recv of packet {} took << {} ms >>", c2597, lValueOf);
        if (c2597.m8071()) {
            interfaceC4314.mo12121("Received ASYNC packet {} with AsyncId << {} >>", c2597, Long.valueOf(((C1186) c2597.m19360()).m4338()));
            c18803M18403.m43367(((C1186) c2597.m19360()).m4338());
        } else {
            this.f53462.m39153(c2597);
        }
    }
}
