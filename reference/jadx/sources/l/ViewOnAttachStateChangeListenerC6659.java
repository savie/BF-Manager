package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۛ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC6659 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f22194;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14861 f22195;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C15243.m36590(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        C15243.m36590(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f22194.get();
        IBinder iBinder = null;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.f22195.m35799(iBinder, activity);
    }

    public ViewOnAttachStateChangeListenerC6659(C14861 c14861, Activity activity) {
        this.f22195 = c14861;
        this.f22194 = new WeakReference(activity);
    }
}
