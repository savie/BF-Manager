package l;

/* JADX INFO: renamed from: l.ۧ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11839 extends AbstractC16314 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f38166 = C16980.m40037(C11839.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7608 f38167;

    public C11839(C7608 c7608) {
        this.f38167 = c7608;
    }

    @Override // l.AbstractC16314
    /* JADX INFO: renamed from: ۙ */
    public final void mo11782(C4514 c4514) {
        C2387 c2387M20808 = this.f38167.m20808(Long.valueOf(((C18684) c4514.m49391()).m43457()));
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - c2387M20808.m8122().getTime());
        InterfaceC25186 interfaceC25186 = f38166;
        interfaceC25186.mo13723("Send/Recv of packet {} took << {} ms >>", c4514, lValueOf);
        if (c4514.m14236()) {
            interfaceC25186.mo13701("Received ASYNC packet {} with AsyncId << {} >>", c4514, Long.valueOf(((C18684) c4514.m49391()).m43458()));
            c2387M20808.m8119(((C18684) c4514.m49391()).m43458());
        } else {
            this.f42518.m32898(c4514);
        }
    }
}
