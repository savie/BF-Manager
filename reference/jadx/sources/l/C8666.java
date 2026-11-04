package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۠۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C8666 extends AbstractC22664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3168 f28296;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f28297;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12863 f28298;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C2700 f28299;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public EnumC16124 f28300;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f28301;

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        return "DeferredType";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8666(C12863 c12863, AbstractC22295 abstractC22295, C3168 c3168) {
        super(null, C14458.f45498);
        this.f28298 = c12863;
        this.f28297 = new HashSet();
        this.f28301 = abstractC22295;
        c12863.f41176.getClass();
        this.f28296 = C0310.m1922(c3168);
        this.f28299 = new C2700();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        throw new AssertionError("Cannot add metadata to a deferred type");
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return EnumC21172.DEFERRED;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo17984(AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        C9411 c9411M8865 = this.f28299.m8865(abstractC11781, enumC20234);
        return c9411M8865 != null ? c9411M8865.f30545.f26659 : AbstractC22664.f73590;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC8036 mo17983(C4192 c4192) {
        C9411 c9411M8865 = this.f28299.m8865(c4192.f15336, c4192.f15333);
        return c9411M8865 != null ? c9411M8865.f30545 : this.f28298.f41173;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo17985(C14479 c14479, C4192 c4192) {
        int iOrdinal = c4192.f15331.ordinal();
        C3168 c3168 = this.f28296;
        AbstractC22295 abstractC22295 = this.f28301;
        C12863 c12863 = this.f28298;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C11972.m30026(this.f28300 != null);
                return c12863.f41176.m1933(abstractC22295, c3168, c14479);
            }
            C11972.m30019();
            throw null;
        }
        EnumC16124 enumC16124 = this.f28300;
        C11972.m30026(enumC16124 == null || enumC16124 == EnumC16124.SPECULATIVE);
        AbstractC8036 abstractC8036M31896 = c12863.m31896(abstractC22295, c3168, c14479, c12863.f41185, null, EnumC23584.SPECULATIVE, null);
        this.f28299.m8866(abstractC8036M31896, c14479);
        return abstractC8036M31896.f26659;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m23334(C14479 c14479) {
        InterfaceC1209 c21814;
        AbstractC22664 abstractC22664 = c14479.f45575;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        boolean zM51067 = abstractC22664.m51067(EnumC21172.NONE);
        C12863 c12863 = this.f28298;
        if (zM51067 || c14479.f45575.mo9329()) {
            c21814 = c12863.f41175;
        } else if (interfaceC1013.mo2277().f15331 != EnumC16124.SPECULATIVE && !interfaceC1013.mo2277().m13378()) {
            c21814 = new C12395(c12863, c14479, this);
        } else {
            c21814 = new C21814(c12863, c14479, this);
        }
        return m23332(c14479, c21814);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 m23332(C14479 c14479, InterfaceC1209 interfaceC1209) {
        C4192 c4192Mo2277 = c14479.f45571.mo2277();
        C11972.m30026(c4192Mo2277 != this.f28298.f41172);
        if (interfaceC1209.mo4423()) {
            c4192Mo2277.mo13376(this, c14479, interfaceC1209);
            EnumC16124 enumC16124 = c4192Mo2277.f15331;
            EnumC16124 enumC16125 = EnumC16124.SPECULATIVE;
            if (enumC16124 == enumC16125) {
                this.f28297.add(c4192Mo2277.f15336);
                this.f28300 = enumC16125;
            }
            return AbstractC22664.f73590;
        }
        try {
            return mo17985(c14479, c4192Mo2277);
        } finally {
            this.f28300 = c4192Mo2277.f15331;
        }
    }
}
