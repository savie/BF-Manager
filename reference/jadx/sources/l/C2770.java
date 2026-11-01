package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2770 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f10599;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770(ActivityC15472 activityC15472, ActivityC15472 activityC15473) {
        super(activityC15473, -1);
        this.f10599 = activityC15472;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        try {
            this.f10599.f50419.m23925(m40352());
            m40364();
        } catch (IllegalArgumentException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
