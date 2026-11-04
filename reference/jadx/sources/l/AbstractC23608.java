package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: l.᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f76635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f76636;

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo11425();

    /* JADX INFO: renamed from: ᩷ */
    public abstract IntentFilter mo11427();

    public AbstractC23608(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f76636 = layoutInflaterFactory2C24354;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52853() {
        m52852();
        IntentFilter intentFilterMo11427 = mo11427();
        if (intentFilterMo11427.countActions() == 0) {
            return;
        }
        if (this.f76635 == null) {
            this.f76635 = new C16148(this);
        }
        this.f76636.f79005.registerReceiver(this.f76635, intentFilterMo11427);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52852() {
        BroadcastReceiver broadcastReceiver = this.f76635;
        if (broadcastReceiver != null) {
            try {
                this.f76636.f79005.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f76635 = null;
        }
    }
}
