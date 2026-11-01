package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16388 extends C16221 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12155 f52733;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4555 f52734;

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo20975() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16388(C12155 c12155, C0159 c0159, C4555 c4555) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c0159);
        this.f52733 = c12155;
        this.f52734 = c4555;
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۖ */
    public final void mo20974() {
        this.f52734.f16178 = false;
        C23444 c23444 = this.f52733.f40684;
        if (c23444.f75898) {
            c23444.f75915.invalidate();
        }
    }
}
