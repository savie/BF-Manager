package l;

import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.۠ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X88W */
/* JADX INFO: loaded from: classes4.dex */
public final class C8076 extends C5253 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC22187 f28302;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f28303;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC22187 f28304;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f28305;

    public C8076(EnumC22187 enumC22187, EnumC22187 enumC22188) {
        m14520(EnumC13015.BIND);
        m14519(EnumSet.of(EnumC3841.FIRST_FRAGMENT, EnumC3841.LAST_FRAGMENT));
        m14523((short) 72);
        this.f28305 = 16384;
        this.f28303 = 16384;
        this.f28302 = enumC22187;
        this.f28304 = enumC22188;
    }

    @Override // l.C5253
    /* JADX INFO: renamed from: ۙ */
    public final void mo14522(C21481 c21481) throws IOException {
        super.mo14522(c21481);
        c21481.m48098(this.f28305);
        c21481.m48098(this.f28303);
        c21481.m48099(0);
        c21481.m48094(1);
        c21481.m48094(0);
        c21481.m48098(0);
        c21481.m48098(0);
        c21481.m48094(1);
        c21481.m48094(0);
        EnumC22187 enumC22187 = this.f28302;
        c21481.m48097(enumC22187.m49217());
        c21481.m48098(enumC22187.m49218());
        c21481.m48098(enumC22187.m49220());
        EnumC22187 enumC22188 = this.f28304;
        c21481.m48097(enumC22188.m49217());
        c21481.m48098(enumC22188.m49218());
        c21481.m48098(enumC22188.m49220());
    }
}
