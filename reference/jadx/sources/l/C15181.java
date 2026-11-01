package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15181 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f49566;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15181(ActivityC4471 activityC4471, C6111 c6111) {
        super(activityC4471, -1);
        this.f49566 = c6111;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        C6111 c6111 = this.f49566;
        try {
            if (!c6111.m17058(Integer.parseInt(m40352()) - 1)) {
                m40365(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        if (!c6111.isFocused()) {
            c6111.requestFocus();
        }
        m40364();
    }
}
