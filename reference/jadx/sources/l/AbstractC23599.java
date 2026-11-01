package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23599 extends AbstractC7370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1060 f76452;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Long f76453;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f76454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52028(C21481 c21481) throws IOException {
        C1060 c1060 = this.f76452;
        if (c1060 != null) {
            c21481.m48093();
            c1060.m32258(c21481);
            c1060.m32259(c21481);
            c1060.m32257(c21481);
            c21481.m48096(EnumC17953.FOUR);
        } else {
            c21481.m48099(0);
        }
        EnumC9488 enumC9488 = EnumC9488.SHARE_INFO_1_CONTAINER;
        c21481.m48099(enumC9488.m24297());
        c21481.m48099(enumC9488.m24297());
        c21481.m48093();
        c21481.m48099(0);
        c21481.m48099(0);
        c21481.m48099((int) this.f76454);
        Long l2 = this.f76453;
        if (l2 != null) {
            c21481.m48093();
            c21481.m48099((int) l2.longValue());
        } else {
            c21481.m48099(0);
        }
    }

    public AbstractC23599(C1060 c1060, Long l2) {
        super(EnumC5959.NetrShareEnum.m16247());
        this.f76452 = c1060;
        this.f76454 = 4294967295L;
        this.f76453 = l2;
    }
}
