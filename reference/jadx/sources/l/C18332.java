package l;

import android.content.IntentFilter;

/* JADX INFO: renamed from: l.ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18332 extends AbstractC21860 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f58468;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3514 f58469;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18332(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161, C3514 c3514) {
        super(layoutInflaterFactory2C9161);
        this.f58468 = layoutInflaterFactory2C9161;
        this.f58469 = c3514;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m42564() {
        return this.f58469.m10343() ? 2 : 1;
    }

    @Override // l.AbstractC21860
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo42565() {
        this.f58468.mo23567();
    }

    @Override // l.AbstractC21860
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IntentFilter mo42566() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
