package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۗܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X59Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C3496 extends C17202 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f12047;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver.PendingResult f12048;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C9743 f12049;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Intent f12050;

    public C3496(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f12047 = context;
        this.f12050 = intent;
        this.f12048 = pendingResult;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11494(C9743 c9743) {
        this.f12049 = c9743;
    }

    @Override // l.C17202
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11493() {
        new C3911(this.f12047, this.f12049.m25371()).m12619((KeyEvent) this.f12050.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        this.f12049.m25372();
        this.f12048.finish();
    }

    @Override // l.C17202
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo11495() {
        this.f12049.m25372();
        this.f12048.finish();
    }

    @Override // l.C17202
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11496() {
        this.f12049.m25372();
        this.f12048.finish();
    }
}
