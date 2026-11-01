package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: l.᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21860 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f70937;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f70938;

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo42565();

    /* JADX INFO: renamed from: ܰ */
    public abstract IntentFilter mo42566();

    public AbstractC21860(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f70938 = layoutInflaterFactory2C9161;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48640() {
        m48641();
        IntentFilter intentFilterMo42566 = mo42566();
        if (intentFilterMo42566.countActions() == 0) {
            return;
        }
        if (this.f70937 == null) {
            this.f70937 = new C15511(this);
        }
        this.f70938.f31195.registerReceiver(this.f70937, intentFilterMo42566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48641() {
        BroadcastReceiver broadcastReceiver = this.f70937;
        if (broadcastReceiver != null) {
            try {
                this.f70938.f31195.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f70937 = null;
        }
    }
}
