package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1751 extends AbstractC7014 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f5976;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24126 f5977;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Long f5978;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6175(C7760 c7760) throws IOException {
        C24126 c24126 = this.f5977;
        if (c24126 != null) {
            c7760.m21130();
            c24126.m12849(c7760);
            c24126.m12850(c7760);
            c24126.m12847(c7760);
            c7760.m21133(EnumC18947.FOUR);
        } else {
            c7760.m21136(0);
        }
        EnumC16666 enumC16666 = EnumC16666.SHARE_INFO_1_CONTAINER;
        c7760.m21136(enumC16666.m39375());
        c7760.m21136(enumC16666.m39375());
        c7760.m21130();
        c7760.m21136(0);
        c7760.m21136(0);
        c7760.m21136((int) this.f5976);
        Long l2 = this.f5978;
        if (l2 != null) {
            c7760.m21130();
            c7760.m21136((int) l2.longValue());
        } else {
            c7760.m21136(0);
        }
    }

    public AbstractC1751(C24126 c24126, Long l2) {
        super(EnumC12937.NetrShareEnum.m32324());
        this.f5977 = c24126;
        this.f5976 = 4294967295L;
        this.f5978 = l2;
    }
}
