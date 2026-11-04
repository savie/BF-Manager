package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12369 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f39726;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1711 f39727;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12369(ActivityC5440 activityC5440, ActivityC5440 activityC5441, C1711 c1711) {
        super(activityC5441, -1);
        this.f39726 = activityC5440;
        this.f39727 = c1711;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            m22952(R.string.MT_Protector);
            return;
        }
        this.f39727.m6081(strM22914);
        C24832.m55356();
        AbstractC6274 abstractC6274M36524 = this.f39726.f18998.m36524();
        C17359.requireNonNull(abstractC6274M36524);
        abstractC6274M36524.m17946();
        m22951();
    }
}
