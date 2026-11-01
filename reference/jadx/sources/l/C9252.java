package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۢ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9252 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f31465;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9252(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f31465 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C0429 c0429 = this.f31465;
        char cM2248 = c0429.m2248();
        C21825 c21825M48588 = C21825.m48588();
        for (int i2 = 0; i2 < cM2248; i2++) {
            c21825M48588 = c21825M48588.m48597(c0429.f1983.m1627(c0429.m2248()).f77449);
        }
        if (abstractC23903.f77449.mo33524().isEmpty()) {
            abstractC23903.f77449.mo27295().f45366 = c21825M48588.m48589();
        }
    }
}
