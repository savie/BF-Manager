package l;

/* JADX INFO: renamed from: l.ۙۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8A8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4588 implements InterfaceC18659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5294 f16250;

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۨ */
    public final void mo7579(C15132 c15132) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5294 m12736() {
        return this.f16250;
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۙ */
    public final void mo7578(C15132 c15132) {
        C5294 c5294 = this.f16250;
        if (c5294 != null) {
            c15132.m36285(c5294);
        }
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ܰ */
    public final void mo7580(C15132 c15132) throws C22893 {
        c15132.m36284(EnumC17953.FOUR);
        int iM36288 = c15132.m36288();
        EnumC9488 enumC9488 = EnumC9488.SHARE_INFO_1_CONTAINER;
        if (iM36288 != enumC9488.m24297()) {
            throw new C22893(String.format("Expected info level %d, got: %d", Integer.valueOf(enumC9488.m24297()), Integer.valueOf(iM36288)));
        }
        int iM36289 = c15132.m36288();
        if (iM36289 == iM36288) {
            if (c15132.m36288() != 0) {
                this.f16250 = new C5294();
                return;
            } else {
                this.f16250 = null;
                return;
            }
        }
        throw new C22893(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(iM36288), Integer.valueOf(iM36289)));
    }
}
