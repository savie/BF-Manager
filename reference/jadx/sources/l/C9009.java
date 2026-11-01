package l;

/* JADX INFO: renamed from: l.ۡܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C9009 implements InterfaceC16294 {
    @Override // l.InterfaceC16294
    /* JADX INFO: renamed from: ۙ */
    public final void mo2175(InterfaceC12061 interfaceC12061, AbstractC19367 abstractC19367) {
        C22895 c22895 = (C22895) abstractC19367;
        InterfaceC4774 interfaceC4774Mo19014 = interfaceC12061.mo29970().m42695().mo19014(C22895.class);
        if (interfaceC4774Mo19014 == null) {
            interfaceC12061.mo29972(c22895);
            return;
        }
        int length = interfaceC12061.length();
        interfaceC12061.mo29972(c22895);
        if (length == interfaceC12061.length()) {
            interfaceC12061.builder().append((char) 65532);
        }
        C18410 c18410Mo29970 = interfaceC12061.mo29970();
        boolean z = c22895.mo35319() instanceof C21483;
        AbstractC13513 abstractC13513M42697 = c18410Mo29970.m42697();
        String strM50651 = c22895.m50651();
        abstractC13513M42697.getClass();
        InterfaceC9239 interfaceC9239Mo29965 = interfaceC12061.mo29965();
        AbstractC20940.f68255.m34276(interfaceC9239Mo29965, strM50651);
        AbstractC20940.f68256.m34276(interfaceC9239Mo29965, Boolean.valueOf(z));
        AbstractC20940.f68257.m34276(interfaceC9239Mo29965, null);
        interfaceC12061.mo29966(length, interfaceC4774Mo19014.mo6311(c18410Mo29970, interfaceC9239Mo29965));
    }
}
