package l;

import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X88W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1048 extends C12234 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC6269 f3775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f3776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6269 f3777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f3778;

    public C1048(EnumC6269 enumC6269, EnumC6269 enumC62610) {
        m30522(EnumC4031.BIND);
        m30521(EnumSet.of(EnumC14471.FIRST_FRAGMENT, EnumC14471.LAST_FRAGMENT));
        m30523((short) 72);
        this.f3776 = 16384;
        this.f3778 = 16384;
        this.f3775 = enumC6269;
        this.f3777 = enumC62610;
    }

    @Override // l.C12234
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3948(C7760 c7760) throws IOException {
        super.mo3948(c7760);
        c7760.m21135(this.f3776);
        c7760.m21135(this.f3778);
        c7760.m21136(0);
        c7760.m21131(1);
        c7760.m21131(0);
        c7760.m21135(0);
        c7760.m21135(0);
        c7760.m21131(1);
        c7760.m21131(0);
        EnumC6269 enumC6269 = this.f3775;
        c7760.m21134(enumC6269.m17928());
        c7760.m21135(enumC6269.m17927());
        c7760.m21135(enumC6269.m17930());
        EnumC6269 enumC62610 = this.f3777;
        c7760.m21134(enumC62610.m17928());
        c7760.m21135(enumC62610.m17927());
        c7760.m21135(enumC62610.m17930());
    }
}
