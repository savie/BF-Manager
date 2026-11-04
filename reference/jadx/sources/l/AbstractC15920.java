package l;

/* JADX INFO: renamed from: l.ܶۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8A8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15920 implements InterfaceC9996 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12191 f51726;

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۤ */
    public final void mo12848(C0302 c0302) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12191 m37952() {
        return this.f51726;
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۙ */
    public final void mo10598(C0302 c0302) {
        C12191 c12191 = this.f51726;
        if (c12191 != null) {
            c0302.m1881(c12191);
        }
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10601(C0302 c0302) throws C18201 {
        c0302.m1882(EnumC18947.FOUR);
        int iM1884 = c0302.m1884();
        EnumC16666 enumC16666 = EnumC16666.SHARE_INFO_1_CONTAINER;
        if (iM1884 != enumC16666.m39375()) {
            throw new C18201(String.format("Expected info level %d, got: %d", Integer.valueOf(enumC16666.m39375()), Integer.valueOf(iM1884)));
        }
        int iM1885 = c0302.m1884();
        if (iM1885 == iM1884) {
            if (c0302.m1884() != 0) {
                this.f51726 = new C12191();
                return;
            } else {
                this.f51726 = null;
                return;
            }
        }
        throw new C18201(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(iM1884), Integer.valueOf(iM1885)));
    }
}
