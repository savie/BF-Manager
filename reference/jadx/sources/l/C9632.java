package l;

/* JADX INFO: renamed from: l.ۢܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9CP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9632 extends AbstractC1869 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f32428 = C13488.m32997(C9632.class);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3573 f32429;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6808 f32430;

    public C9632(C3573 c3573, C6808 c6808) {
        this.f32429 = c3573;
        this.f32430 = c6808;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    @Override // l.AbstractC1869
    /* JADX INFO: renamed from: ۙ */
    public final void mo6062(C2597 c2597) throws C21317 {
        Long lValueOf = Long.valueOf(((C1186) c2597.m19360()).m4341());
        C6808 c6808 = this.f32430;
        C18803 c18803M18403 = c6808.m18403(lValueOf);
        try {
            C3573 c3573 = this.f32429;
            AbstractC10068 abstractC10068M43364 = c18803M18403.m43364();
            c3573.getClass();
            C11771 c11771M10559 = C3573.m10559(abstractC10068M43364, c2597);
            C18803 c18803M18406 = c6808.m18406(Long.valueOf(((C1186) c11771M10559.mo25478()).m4341()));
            boolean zM29401 = c11771M10559.m29401();
            EnumC2162 enumC2162M4325 = ((C1186) c11771M10559.mo25478()).m4325();
            long jM4349 = ((C1186) c11771M10559.mo25478()).m4349();
            if (enumC2162M4325 == EnumC2162.SMB2_READ) {
                if (jM4349 == EnumC3055.STATUS_SUCCESS.getValue() || jM4349 == EnumC3055.STATUS_END_OF_FILE.getValue()) {
                    zM29401 = true;
                } else {
                    zM29401 = false;
                }
            } else if (enumC2162M4325 == EnumC2162.SMB2_WRITE) {
                if (jM4349 == EnumC3055.STATUS_SUCCESS.getValue()) {
                    zM29401 = true;
                } else {
                    zM29401 = false;
                }
            }
            if (zM29401) {
                boolean z = c11771M10559 instanceof C18454;
            }
            c18803M18406.m43368().m14180(c11771M10559);
        } catch (C17271 e) {
            f32428.mo12118(c2597, "Failed to deserialize SMB2 Packet Data of {}");
            throw new C21317("Unable to deserialize SMB2 Packet Data.", e);
        }
    }
}
