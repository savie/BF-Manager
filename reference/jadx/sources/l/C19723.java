package l;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes5.dex */
public final class C19723 extends C7022 implements InterfaceC21839 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static Method f63296;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21839 f63297;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f63296 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // l.C7022
    /* JADX INFO: renamed from: ۙ */
    public final C6129 mo18827(Context context, boolean z) {
        C8434 c8434 = new C8434(context, z);
        c8434.m22088(this);
        return c8434;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m44849() {
        if (Build.VERSION.SDK_INT >= 23) {
            C18311.m42536(this.f23602, null);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m44848() {
        if (Build.VERSION.SDK_INT >= 23) {
            C18311.m42537(this.f23602, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44847(InterfaceC21839 interfaceC21839) {
        this.f63297 = interfaceC21839;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m44850() {
        int i = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.f23602;
        if (i <= 28) {
            Method method = f63296;
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
        C19017.m43741(popupWindow, false);
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo21478(C12418 c12418, C23707 c23707) {
        InterfaceC21839 interfaceC21839 = this.f63297;
        if (interfaceC21839 != null) {
            interfaceC21839.mo21478(c12418, c23707);
        }
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo21477(C12418 c12418, MenuItem menuItem) {
        InterfaceC21839 interfaceC21839 = this.f63297;
        if (interfaceC21839 != null) {
            interfaceC21839.mo21477(c12418, menuItem);
        }
    }
}
