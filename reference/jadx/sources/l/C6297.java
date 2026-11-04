package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6297 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f21364;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6297(ActivityC2350 activityC2350, C24132 c24132) {
        super(activityC2350, -1);
        this.f21364 = c24132;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C24132 c24132 = this.f21364;
        try {
            if (!c24132.m54017(Integer.parseInt(m22914()) - 1)) {
                m22952(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        if (!c24132.isFocused()) {
            c24132.requestFocus();
        }
        m22951();
    }
}
