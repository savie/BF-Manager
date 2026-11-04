package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16523 extends C11302 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public WindowInsetsController f53490;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f53491;

    public C16523(View view) {
        super(view);
        this.f53491 = view;
    }

    public C16523(WindowInsetsController windowInsetsController) {
        super(null);
        this.f53490 = windowInsetsController;
    }

    @Override // l.C11302
    /* JADX INFO: renamed from: ᩷ */
    public final void mo28564() {
        View view = this.f53491;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f53490;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo28564();
    }

    @Override // l.C11302
    /* JADX INFO: renamed from: ۙ */
    public final void mo28563() {
        WindowInsetsController windowInsetsController = this.f53490;
        View view = this.f53491;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: l.᩻ۖ
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
        super.mo28563();
    }
}
