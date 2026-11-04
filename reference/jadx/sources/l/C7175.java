package l;

/* JADX INFO: renamed from: l.ۜ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C7175 extends AbstractC14239 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4192 f23702;

    @Override // l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo1766(Object obj, AbstractC22664 abstractC22664) {
        return !abstractC22664.m51067(EnumC21172.DEFERRED) ? abstractC22664 : mo19749((C8666) abstractC22664, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 mo19749(C8666 c8666, Object obj) {
        C4192 c4192 = this.f23702;
        int iOrdinal = c4192.f15331.ordinal();
        if (iOrdinal == 0) {
            return c8666.mo17984(c4192.f15336, c4192.f15333);
        }
        if (iOrdinal == 1) {
            AbstractC22664 abstractC22664 = c8666.f28301.f26659;
            return abstractC22664 == null ? AbstractC22664.f73590 : abstractC22664;
        }
        C11972.m30019();
        throw null;
    }

    public C7175(C12863 c12863, EnumC16124 enumC16124, AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        this.f23702 = new C4192(c12863, enumC16124, abstractC11781, enumC20234, c12863.f41182.f45700, c12863.f41172, c12863.f41178.f79958);
    }
}
