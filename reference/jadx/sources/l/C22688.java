package l;

/* JADX INFO: renamed from: l.᩺֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9E5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22688 extends C11771 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11748 f73868;

    public C22688(EnumC20508 enumC20508, C11748 c11748, long j) {
        super(9, enumC20508, EnumC2162.SMB2_TREE_CONNECT, j, 0L);
        this.f73868 = c11748;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        EnumC20508 enumC20508 = EnumC20508.UNKNOWN;
        c19240.m44196();
        c19240.m27396(72);
        String strM29354 = this.f73868.m29354();
        if (strM29354 == null) {
            c19240.m27396(0);
        } else {
            c19240.m27396(strM29354.length() * 2);
        }
        c19240.m27399(strM29354, C7393.f24574);
    }
}
