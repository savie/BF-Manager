package l;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23272 extends AbstractC21860 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f75493;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PowerManager f75494;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23272(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161, Context context) {
        super(layoutInflaterFactory2C9161);
        this.f75493 = layoutInflaterFactory2C9161;
        this.f75494 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51350() {
        return C5632.m15527(this.f75494) ? 2 : 1;
    }

    @Override // l.AbstractC21860
    /* JADX INFO: renamed from: ۨ */
    public final void mo42565() {
        this.f75493.mo23567();
    }

    @Override // l.AbstractC21860
    /* JADX INFO: renamed from: ܰ */
    public final IntentFilter mo42566() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
