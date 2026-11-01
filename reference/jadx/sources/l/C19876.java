package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19876 extends AbstractC8587 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f63726;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19876(C13609 c13609) {
        super(c13609, EnumC5992.HEADER_PHASE, new C4435(c13609));
        this.f63726 = c13609;
    }

    @Override // l.AbstractC9293
    /* JADX INFO: renamed from: ۙ */
    public final void mo1178(C4603 c4603) {
        C8753 c8753 = c4603.f16301;
        C22492 c22492 = c8753.f30086;
        C4603 c4603M22368 = AbstractC8587.m22368(c4603, c8753);
        AbstractC5930 abstractC5930 = c8753.f30092;
        C13609 c13609 = this.f63726;
        if (abstractC5930 != null) {
            c13609.f44890.m40869(c8753.f30092, c4603M22368, c22492, c8753);
        }
        Iterator it = c8753.f30087.iterator();
        while (it.hasNext()) {
            c13609.f44890.m40869((AbstractC5930) it.next(), c4603M22368, c22492, c8753);
        }
        c13609.f44890.m40874();
        m22369(c4603, c4603M22368);
        HashSet hashSet = new HashSet();
        for (AbstractC5930 abstractC5931 : c8753.f30087) {
            AbstractC16579 abstractC16579 = abstractC5931.f30190;
            if (abstractC16579.m39001(EnumC6617.CLASS)) {
                c13609.f44902.m47278(abstractC5931, c13609.f44895.m52402(abstractC16579), hashSet);
            }
        }
        c13609.f44890.m40871(c8753.f30089.f70566, c4603M22368, c22492, c8753);
        c13609.f44907.m18318(c8753.f30088, c4603M22368, false);
        Iterator it2 = c8753.f30088.iterator();
        while (it2.hasNext()) {
            c13609.f44890.m40869((C22179) it2.next(), c4603M22368, c22492, c8753);
        }
        AbstractC23903 abstractC23903 = c22492.f77448;
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35867;
        if (enumC10477 == enumC10478 && abstractC23903 != c4603.f16295.f34730.f63141 && c13609.f44893.m11159(c4603.f16295.f34730, c22492.f73419)) {
            C20414 c20414 = c13609.f44894;
            int i = c8753.f30189;
            EnumC7654 enumC7654M38160 = C16121.m38160(c22492);
            C5909 c5909 = C23879.f77204;
            c20414.m48188(i, new C5909("compiler", "clash.with.pkg.of.same.name", enumC7654M38160, c22492));
        }
        if (c22492.f77448.f77452 == enumC10478 && (c22492.f77447 & 1) == 0 && !c4603.f16295.f34725.mo6761(c22492.f77453.toString(), EnumC11347.SOURCE)) {
            c22492.f77447 |= 17592186044416L;
        }
    }
}
