package l;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes3.dex */
public class C6520 extends C16960 implements InterfaceC23674 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static Method f21927;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23674 f21928;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f21927 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // l.C16960
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9479 mo18396(Context context, boolean z) {
        C12485 c12485 = new C12485(context, z);
        c12485.m31021(this);
        return c12485;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m18401() {
        if (Build.VERSION.SDK_INT >= 23) {
            C3536.m11561(this.f55402, null);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m18395() {
        if (Build.VERSION.SDK_INT >= 23) {
            C3536.m11562(this.f55402, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18399(InterfaceC23674 interfaceC23674) {
        this.f21928 = interfaceC23674;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m18400() {
        int i = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.f55402;
        if (i <= 28) {
            Method method = f21927;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.FALSE);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        C20690.m47326(popupWindow, false);
    }

    @Override // l.InterfaceC23674
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18398(C9898 c9898, C8407 c8407) {
        InterfaceC23674 interfaceC23674 = this.f21928;
        if (interfaceC23674 != null) {
            interfaceC23674.mo18398(c9898, c8407);
        }
    }

    @Override // l.InterfaceC23674
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18397(C9898 c9898, MenuItem menuItem) {
        InterfaceC23674 interfaceC23674 = this.f21928;
        if (interfaceC23674 != null) {
            interfaceC23674.mo18397(c9898, menuItem);
        }
    }
}
