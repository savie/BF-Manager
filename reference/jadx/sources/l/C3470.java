package l;

import android.content.IntentFilter;

/* JADX INFO: renamed from: l.ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C3470 extends AbstractC23608 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22051 f12014;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f12015;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3470(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354, C22051 c22051) {
        super(layoutInflaterFactory2C24354);
        this.f12015 = layoutInflaterFactory2C24354;
        this.f12014 = c22051;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m11426() {
        return this.f12014.m49894() ? 2 : 1;
    }

    @Override // l.AbstractC23608
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo11425() {
        this.f12015.mo5046();
    }

    @Override // l.AbstractC23608
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IntentFilter mo11427() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
