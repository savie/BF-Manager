package l;

/* JADX INFO: renamed from: l.ۗ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9DL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636 extends AbstractC16314 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f12447 = C16980.m40037(C3636.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC15568 f12448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20044 f12449;

    public C3636(C20044 c20044, InterfaceC15568 interfaceC15568) {
        this.f12449 = c20044;
        this.f12448 = interfaceC15568;
    }

    @Override // l.AbstractC16314
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11782(C4514 c4514) {
        C10852 c10852M46100;
        long jM43457 = ((C18684) c4514.m49391()).m43457();
        InterfaceC25186 interfaceC25186 = f12447;
        if (jM43457 == -1) {
            interfaceC25186.mo13721("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.f42518.m32898(c4514);
            return;
        }
        if (c4514 instanceof C20176) {
            interfaceC25186.mo13721("Passthrough Signature Verification as packet is decrypted");
            this.f42518.m32898(c4514);
            return;
        }
        C18684 c18684 = (C18684) c4514.m49391();
        EnumC12717 enumC12717 = EnumC12717.SMB2_FLAGS_SIGNED;
        boolean zM43456 = c18684.m43456(enumC12717);
        C20044 c20044 = this.f12449;
        if (!zM43456) {
            if (((C18684) c4514.m49391()).m43456(enumC12717) || c4514.m14236() || c4514.m14238() || (c10852M46100 = c20044.m46100(Long.valueOf(((C18684) c4514.m49391()).m43461()))) == null || !c10852M46100.m27588()) {
                this.f42518.m32898(c4514);
                return;
            } else {
                interfaceC25186.mo13728(c4514, "Illegal request, session requires message signing, but packet {} is not signed.");
                this.f42518.m32898(new C13813(c4514.m49391()));
                return;
            }
        }
        long jM43461 = ((C18684) c4514.m49391()).m43461();
        if (jM43461 == 0 || ((C18684) c4514.m49391()).m43462() == EnumC23906.SMB2_SESSION_SETUP) {
            this.f42518.m32898(c4514);
            return;
        }
        C10852 c10852M46101 = c20044.m46100(Long.valueOf(jM43461));
        if (c10852M46101 == null) {
            interfaceC25186.mo13718("Could not find session << {} >> for packet {}.", Long.valueOf(jM43461), c4514);
            this.f42518.m32898(new C13813(c4514.m49391()));
        } else {
            c10852M46101.m27581((C18684) c4514.m49391(), false);
            this.f12448.getClass();
            interfaceC25186.mo13716(c4514, "Signature for packet {} verified.");
            this.f42518.m32898(c4514);
        }
    }
}
