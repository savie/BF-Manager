package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC0454 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final WeakReference f2069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17388 f2070;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C13465.m32966(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        C13465.m32966(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f2069.get();
        IBinder iBinder = null;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.f2070.m40506(iBinder, activity);
    }

    public ViewOnAttachStateChangeListenerC0454(C17388 c17388, Activity activity) {
        this.f2070 = c17388;
        this.f2069 = new WeakReference(activity);
    }
}
