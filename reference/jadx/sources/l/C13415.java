package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13415 extends C17372 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10155 f42731;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5958 f42732;

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7442() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13415(C5958 c5958, C15652 c15652, C10155 c10155) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c15652);
        this.f42732 = c5958;
        this.f42731 = c10155;
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7443() {
        this.f42731.f32517 = false;
        C25350 c25350 = this.f42732.f20402;
        if (c25350.f81856) {
            c25350.f81832.invalidate();
        }
    }
}
