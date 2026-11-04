package l;

/* JADX INFO: renamed from: l.᩹᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9CP */
/* JADX INFO: loaded from: classes.dex */
public final class C23774 extends AbstractC16314 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77024 = C16980.m40037(C23774.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20922 f77025;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7608 f77026;

    public C23774(C20922 c20922, C7608 c7608) {
        this.f77025 = c20922;
        this.f77026 = c7608;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    @Override // l.AbstractC16314
    /* JADX INFO: renamed from: ۙ */
    public final void mo11782(C4514 c4514) throws C9469 {
        Long lValueOf = Long.valueOf(((C18684) c4514.m49391()).m43457());
        C7608 c7608 = this.f77026;
        C2387 c2387M20808 = c7608.m20808(lValueOf);
        try {
            C20922 c20922 = this.f77025;
            AbstractC4625 abstractC4625M8125 = c2387M20808.m8125();
            c20922.getClass();
            C24652 c24652M47777 = C20922.m47777(abstractC4625M8125, c4514);
            C2387 c2387M20811 = c7608.m20811(Long.valueOf(((C18684) c24652M47777.mo3632()).m43457()));
            boolean zM55004 = c24652M47777.m55004();
            EnumC23906 enumC23906M43462 = ((C18684) c24652M47777.mo3632()).m43462();
            long jM43472 = ((C18684) c24652M47777.mo3632()).m43472();
            if (enumC23906M43462 == EnumC23906.SMB2_READ) {
                if (jM43472 == EnumC20243.STATUS_SUCCESS.getValue() || jM43472 == EnumC20243.STATUS_END_OF_FILE.getValue()) {
                    zM55004 = true;
                } else {
                    zM55004 = false;
                }
            } else if (enumC23906M43462 == EnumC23906.SMB2_WRITE) {
                if (jM43472 == EnumC20243.STATUS_SUCCESS.getValue()) {
                    zM55004 = true;
                } else {
                    zM55004 = false;
                }
            }
            if (zM55004) {
                boolean z = c24652M47777 instanceof C8746;
            }
            c2387M20811.m8123().m13572(c24652M47777);
        } catch (C2013 e) {
            f77024.mo13698(c4514, "Failed to deserialize SMB2 Packet Data of {}");
            throw new C9469("Unable to deserialize SMB2 Packet Data.", e);
        }
    }
}
