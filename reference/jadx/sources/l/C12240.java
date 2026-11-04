package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12240 extends C17372 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f39391;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12240(C24132 c24132, C21017 c21017) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c21017);
        this.f39391 = c24132;
    }

    @Override // l.C17372, l.C15880, l.AbstractC22484
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo30572(C24132 c24132, boolean z, boolean z2, int i, int i2) {
        C24132 c24133 = this.f39391;
        if (c24133.f78034 == null || !z) {
            return false;
        }
        C1314 c1314 = c24133.f78033;
        c24133.f78038 = (c24133.f78066.f45755 && c1314.m4816()) ? c1314.m4812(i, i2) : null;
        return (c24133.f78038 == null || c24133.f78038.m44539().m30035() == null) ? false : true;
    }
}
