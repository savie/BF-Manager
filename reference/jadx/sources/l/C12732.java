package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12732 extends C16221 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f42476;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12732(C6111 c6111, C14144 c14144) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c14144);
        this.f42476 = c6111;
    }

    @Override // l.C16221, l.C20454, l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20678(C6111 c6111, boolean z, boolean z2, int i, int i2) {
        C6111 c6112 = this.f42476;
        if (c6112.f20850 == null || !z) {
            return false;
        }
        C13190 c13190 = c6112.f20770;
        c6112.f20813 = (c6112.f20794.f6398 && c13190.m32642()) ? c13190.m32644(i, i2) : null;
        return (c6112.f20813 == null || c6112.f20813.m49595().m37369() == null) ? false : true;
    }
}
