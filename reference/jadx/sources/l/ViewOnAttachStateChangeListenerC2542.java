package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2542 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f8124;

    public ViewOnAttachStateChangeListenerC2542(BroadcastReceiver broadcastReceiver) {
        this.f8124 = broadcastReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPicker.ACTION_START");
        intentFilter.addAction("ScreenColorPicker.ACTION_STOP");
        C21576.m49064(this.f8124, intentFilter);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C21576.m49063(this.f8124);
    }
}
