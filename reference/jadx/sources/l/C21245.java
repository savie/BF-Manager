package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21245 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7820 f67784;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67785;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f67787;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21245(C7820 c7820, C24975 c24975, int i, int i2, BitSet bitSet, int i3) {
        super(c24975, i);
        this.f67784 = c7820;
        this.f67785 = i2;
        this.f67787 = bitSet;
        this.f67786 = i3;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2989(C8565 c8565) {
        C7820 c7820 = this.f67784;
        C24975 c24975 = c7820.f26041;
        int iM23001 = c8565.m23001();
        int i = this.f67785;
        if (iM23001 >= i) {
            m14148();
            return null;
        }
        BitSet bitSet = this.f67787;
        if (bitSet != null && !bitSet.get((c8565.m23001() - this.f67786) / 2)) {
            C10407 c10407 = new C10407(c24975, EnumC22631.f73424, c8565.m23001());
            c8565.m22984(2);
            return c10407;
        }
        AbstractC19270 abstractC19270M44604 = AbstractC19270.m44604(c24975, c8565);
        int iM23002 = c8565.m23001();
        if (iM23002 > i || iM23002 < 0) {
            throw new C23044(null, "The last instruction in method %s is truncated", c7820.f26042);
        }
        return abstractC19270M44604;
    }
}
