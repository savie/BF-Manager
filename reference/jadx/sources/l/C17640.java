package l;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C17640 extends AbstractC23608 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PowerManager f58001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f58002;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17640(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354, Context context) {
        super(layoutInflaterFactory2C24354);
        this.f58002 = layoutInflaterFactory2C24354;
        this.f58001 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m41307() {
        return C13165.m32688(this.f58001) ? 2 : 1;
    }

    @Override // l.AbstractC23608
    /* JADX INFO: renamed from: ۤ */
    public final void mo11425() {
        this.f58002.mo5046();
    }

    @Override // l.AbstractC23608
    /* JADX INFO: renamed from: ᩷ */
    public final IntentFilter mo11427() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
