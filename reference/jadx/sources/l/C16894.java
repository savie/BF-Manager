package l;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C16894 extends WindowCallbackC5425 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f55249;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f55250;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f55251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f55252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC10927 f55253;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16894(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354, Window.Callback callback) {
        super(callback);
        this.f55252 = layoutInflaterFactory2C24354;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39854(InterfaceC10927 interfaceC10927) {
        this.f55253 = interfaceC10927;
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f55251) {
            return m16155().dispatchKeyEvent(keyEvent);
        }
        return this.f55252.m54417(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f55252.m54416(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C9898)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC10927 interfaceC10927 = this.f55253;
        if (interfaceC10927 != null) {
            View view = i == 0 ? new View(((C8690) interfaceC10927).f28352.f23767.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f55249) {
            m16155().onContentChanged();
        }
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C9898 c9898 = menu instanceof C9898 ? (C9898) menu : null;
        if (i == 0 && c9898 == null) {
            return false;
        }
        if (c9898 != null) {
            c9898.setOverrideVisibleItems(true);
        }
        InterfaceC10927 interfaceC10927 = this.f55253;
        if (interfaceC10927 != null) {
            C7199 c7199 = ((C8690) interfaceC10927).f28352;
            if (i == 0 && !c7199.f23770) {
                c7199.f23767.mo18347();
                c7199.f23770 = true;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c9898 != null) {
            c9898.setOverrideVisibleItems(false);
        }
        return zOnPreparePanel;
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f55252.m54408(i);
        return true;
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f55250) {
            m16155().onPanelClosed(i, menu);
        } else {
            super.onPanelClosed(i, menu);
            this.f55252.m54419(i);
        }
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f55252;
        if (!layoutInflaterFactory2C24354.m54421()) {
            return super.onWindowStartingActionMode(callback);
        }
        C8625 c8625 = new C8625(layoutInflaterFactory2C24354.f79005, callback);
        AbstractC10116 abstractC10116M54412 = layoutInflaterFactory2C24354.m54412(c8625);
        if (abstractC10116M54412 != null) {
            return c8625.m23252(abstractC10116M54412);
        }
        return null;
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f55252;
        if (layoutInflaterFactory2C24354.m54421() && i == 0) {
            C8625 c8625 = new C8625(layoutInflaterFactory2C24354.f79005, callback);
            AbstractC10116 abstractC10116M54412 = layoutInflaterFactory2C24354.m54412(c8625);
            if (abstractC10116M54412 != null) {
                return c8625.m23252(abstractC10116M54412);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // l.WindowCallbackC5425, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C9898 c9898 = this.f55252.m54418(0).f39929;
        if (c9898 != null) {
            super.onProvideKeyboardShortcuts(list, c9898, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39852(Window.Callback callback) {
        try {
            this.f55249 = true;
            callback.onContentChanged();
        } finally {
            this.f55249 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39855(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f55251 = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f55251 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39853(Window.Callback callback, int i, Menu menu) {
        try {
            this.f55250 = true;
            callback.onPanelClosed(i, menu);
        } finally {
            this.f55250 = false;
        }
    }
}
