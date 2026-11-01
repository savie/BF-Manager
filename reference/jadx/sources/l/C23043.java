package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes.dex */
public final class C23043 extends C3991 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public WindowInsetsController f74860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f74861;

    public C23043(View view) {
        super(view);
        this.f74861 = view;
    }

    public C23043(WindowInsetsController windowInsetsController) {
        super(null);
        this.f74860 = windowInsetsController;
    }

    @Override // l.C3991
    /* JADX INFO: renamed from: ܰ */
    public final void mo11493() {
        View view = this.f74861;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f74860;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.mo11493();
        }
    }

    @Override // l.C3991
    /* JADX INFO: renamed from: ۙ */
    public final void mo11492() {
        WindowInsetsController windowInsetsController = this.f74860;
        View view = this.f74861;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: l.ۜܳ
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.mo11492();
    }
}
