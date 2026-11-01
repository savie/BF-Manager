package l;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7043 extends WindowCallbackC22295 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f23662;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23663;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23664;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f23665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4926 f23666;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7043(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161, Window.Callback callback) {
        super(callback);
        this.f23665 = layoutInflaterFactory2C9161;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18895(InterfaceC4926 interfaceC4926) {
        this.f23666 = interfaceC4926;
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f23662) {
            return m49461().dispatchKeyEvent(keyEvent);
        }
        return this.f23665.m23555(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f23665.m23554(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C12418)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC4926 interfaceC4926 = this.f23666;
        if (interfaceC4926 != null) {
            View view = i == 0 ? new View(((C23977) interfaceC4926).f77733.f48402.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f23664) {
            m49461().onContentChanged();
        }
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C12418 c12418 = menu instanceof C12418 ? (C12418) menu : null;
        if (i == 0 && c12418 == null) {
            return false;
        }
        if (c12418 != null) {
            c12418.setOverrideVisibleItems(true);
        }
        InterfaceC4926 interfaceC4926 = this.f23666;
        if (interfaceC4926 != null) {
            C14805 c14805 = ((C23977) interfaceC4926).f77733;
            if (i == 0 && !c14805.f48400) {
                c14805.f48402.mo44629();
                c14805.f48400 = true;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c12418 != null) {
            c12418.setOverrideVisibleItems(false);
        }
        return zOnPreparePanel;
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f23665.m23539(i);
        return true;
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f23663) {
            m49461().onPanelClosed(i, menu);
        } else {
            super.onPanelClosed(i, menu);
            this.f23665.m23559(i);
        }
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f23665;
        if (!layoutInflaterFactory2C9161.m23570()) {
            return super.onWindowStartingActionMode(callback);
        }
        C23356 c23356 = new C23356(layoutInflaterFactory2C9161.f31195, callback);
        AbstractC12067 abstractC12067M23544 = layoutInflaterFactory2C9161.m23544(c23356);
        if (abstractC12067M23544 != null) {
            return c23356.m51471(abstractC12067M23544);
        }
        return null;
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f23665;
        if (layoutInflaterFactory2C9161.m23570() && i == 0) {
            C23356 c23356 = new C23356(layoutInflaterFactory2C9161.f31195, callback);
            AbstractC12067 abstractC12067M23544 = layoutInflaterFactory2C9161.m23544(c23356);
            if (abstractC12067M23544 != null) {
                return c23356.m51471(abstractC12067M23544);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // l.WindowCallbackC22295, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C12418 c12418 = this.f23665.m23563(0).f29345;
        if (c12418 != null) {
            super.onProvideKeyboardShortcuts(list, c12418, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18893(Window.Callback callback) {
        try {
            this.f23664 = true;
            callback.onContentChanged();
        } finally {
            this.f23664 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18896(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f23662 = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f23662 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18894(Window.Callback callback, int i, Menu menu) {
        try {
            this.f23663 = true;
            callback.onPanelClosed(i, menu);
        } finally {
            this.f23663 = false;
        }
    }
}
