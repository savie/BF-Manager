package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܰ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13836 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f45656;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13836(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f45656 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C22492 c22492 = (C22492) abstractC23903;
        C0429 c0429 = this.f45656;
        AbstractC11242 abstractC11242M1624 = c0429.f1983.m1624(c0429.m2248());
        c22492.f73415 = new C7485(abstractC11242M1624);
        String string = abstractC11242M1624.toString();
        if (c22492.f77448.f77452 == EnumC10477.f35867 && string.endsWith(".java") && !string.equals(c22492.f77453.toString().concat(".java"))) {
            c22492.f77447 |= 17592186044416L;
        }
    }
}
