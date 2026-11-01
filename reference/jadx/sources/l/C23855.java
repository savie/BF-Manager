package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.᩻ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23855 extends C21216 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Intent f77119;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5694 f77120;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f77121;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver.PendingResult f77122;

    public C23855(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f77121 = context;
        this.f77119 = intent;
        this.f77122 = pendingResult;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52579(C5694 c5694) {
        this.f77120 = c5694;
    }

    @Override // l.C21216
    /* JADX INFO: renamed from: ۙ */
    public final void mo47687() {
        new C20636(this.f77121, this.f77120.m15705()).m46500((KeyEvent) this.f77119.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        this.f77120.m15706();
        this.f77122.finish();
    }

    @Override // l.C21216
    /* JADX INFO: renamed from: ۨ */
    public final void mo47688() {
        this.f77120.m15706();
        this.f77122.finish();
    }

    @Override // l.C21216
    /* JADX INFO: renamed from: ܰ */
    public final void mo47689() {
        this.f77120.m15706();
        this.f77122.finish();
    }
}
