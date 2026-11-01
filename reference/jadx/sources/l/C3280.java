package l;

/* JADX INFO: renamed from: l.ۗܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9DL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3280 extends AbstractC1869 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f12163 = C13488.m32997(C3280.class);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC0458 f12164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20215 f12165;

    public C3280(C20215 c20215, InterfaceC0458 interfaceC0458) {
        this.f12165 = c20215;
        this.f12164 = interfaceC0458;
    }

    @Override // l.AbstractC1869
    /* JADX INFO: renamed from: ۙ */
    public final void mo6062(C2597 c2597) {
        C20858 c20858M45673;
        long jM4341 = ((C1186) c2597.m19360()).m4341();
        InterfaceC4314 interfaceC4314 = f12163;
        if (jM4341 == -1) {
            interfaceC4314.mo12135("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.f53462.m39153(c2597);
            return;
        }
        if (c2597 instanceof C16275) {
            interfaceC4314.mo12135("Passthrough Signature Verification as packet is decrypted");
            this.f53462.m39153(c2597);
            return;
        }
        C1186 c1186 = (C1186) c2597.m19360();
        EnumC4714 enumC4714 = EnumC4714.SMB2_FLAGS_SIGNED;
        boolean zM4335 = c1186.m4335(enumC4714);
        C20215 c20215 = this.f12165;
        if (!zM4335) {
            if (((C1186) c2597.m19360()).m4335(enumC4714) || c2597.m8071() || c2597.m8069() || (c20858M45673 = c20215.m45673(Long.valueOf(((C1186) c2597.m19360()).m4337()))) == null || !c20858M45673.m46894()) {
                this.f53462.m39153(c2597);
                return;
            } else {
                interfaceC4314.mo12115(c2597, "Illegal request, session requires message signing, but packet {} is not signed.");
                this.f53462.m39153(new C19803(c2597.m19360()));
                return;
            }
        }
        long jM4337 = ((C1186) c2597.m19360()).m4337();
        if (jM4337 == 0 || ((C1186) c2597.m19360()).m4325() == EnumC2162.SMB2_SESSION_SETUP) {
            this.f53462.m39153(c2597);
            return;
        }
        C20858 c20858M45674 = c20215.m45673(Long.valueOf(jM4337));
        if (c20858M45674 == null) {
            interfaceC4314.mo12128("Could not find session << {} >> for packet {}.", Long.valueOf(jM4337), c2597);
            this.f53462.m39153(new C19803(c2597.m19360()));
        } else {
            c20858M45674.m46887((C1186) c2597.m19360(), false);
            this.f12164.getClass();
            interfaceC4314.mo12126(c2597, "Signature for packet {} verified.");
            this.f53462.m39153(c2597);
        }
    }
}
