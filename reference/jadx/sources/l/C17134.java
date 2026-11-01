package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17134 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f54647;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9166 f54648;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17134(ActivityC19749 activityC19749, ActivityC19749 activityC197410, C9166 c9166) {
        super(activityC197410, -1);
        this.f54647 = activityC19749;
        this.f54648 = c9166;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            m40365(R.string.MT_Protector);
            return;
        }
        this.f54648.m23580(strM40352);
        C7754.m20408();
        AbstractC14217 abstractC14217M44430 = this.f54647.f63464.m44430();
        C13638.requireNonNull(abstractC14217M44430);
        abstractC14217M44430.m34322();
        m40364();
    }
}
