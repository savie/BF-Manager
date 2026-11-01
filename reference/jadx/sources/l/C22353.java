package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22353 extends AbstractC19906 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73023;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4007 f73024;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f73025;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22353(C4007 c4007, C17684 c17684, int i, int i2, BitSet bitSet, int i3) {
        super(c17684, i);
        this.f73024 = c4007;
        this.f73023 = i2;
        this.f73025 = bitSet;
        this.f73022 = i3;
    }

    @Override // l.AbstractC19906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5043(C18825 c18825) {
        C4007 c4007 = this.f73024;
        C17684 c17684 = c4007.f14856;
        int iM43447 = c18825.m43447();
        int i = this.f73023;
        if (iM43447 >= i) {
            m25170();
            return null;
        }
        BitSet bitSet = this.f73025;
        if (bitSet != null && !bitSet.get((c18825.m43447() - this.f73022) / 2)) {
            C22687 c22687 = new C22687(c17684, EnumC10297.f35298, c18825.m43447());
            c18825.m43437(2);
            return c22687;
        }
        AbstractC6686 abstractC6686M18062 = AbstractC6686.m18062(c17684, c18825);
        int iM43448 = c18825.m43447();
        if (iM43448 > i || iM43448 < 0) {
            throw new C20749(null, "The last instruction in method %s is truncated", c4007.f14852);
        }
        return abstractC6686M18062;
    }
}
