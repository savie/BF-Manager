package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC7525 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f25021;

    public ViewOnAttachStateChangeListenerC7525(BroadcastReceiver broadcastReceiver) {
        this.f25021 = broadcastReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPicker.ACTION_START");
        intentFilter.addAction("ScreenColorPicker.ACTION_STOP");
        C16737.m39269(this.f25021, intentFilter);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C16737.m39268(this.f25021);
    }
}
