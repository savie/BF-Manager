package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 85W1 */
/* JADX INFO: loaded from: classes4.dex */
public class C15009 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22469 f49027;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f49028;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f49029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49031;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f49032;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9898 f49033;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f49035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49036;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f49037;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49030 = 8388611;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final PopupWindow.OnDismissListener f49034 = new C19485(this);

    public C15009(Context context, C9898 c9898, View view, boolean z, int i, int i2) {
        this.f49035 = context;
        this.f49033 = c9898;
        this.f49028 = view;
        this.f49029 = z;
        this.f49031 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36143(PopupWindow.OnDismissListener onDismissListener) {
        this.f49032 = onDismissListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36142(View view) {
        this.f49028 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36145(boolean z) {
        this.f49036 = z;
        AbstractC22469 abstractC22469 = this.f49027;
        if (abstractC22469 != null) {
            abstractC22469.mo50670(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36141(int i) {
        this.f49030 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36150() {
        return this.f49030;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36149() {
        if (!m36146(0, 0)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22469 m36147() {
        AbstractC22469 viewOnKeyListenerC23215;
        if (this.f49027 == null) {
            Context context = this.f49035;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.MT_Protector)) {
                viewOnKeyListenerC23215 = new ViewOnKeyListenerC24071(context, this.f49028, this.f49031, this.f49029);
            } else {
                viewOnKeyListenerC23215 = new ViewOnKeyListenerC23215(this.f49035, this.f49033, this.f49028, this.f49031, this.f49029);
            }
            viewOnKeyListenerC23215.mo50669(this.f49033);
            viewOnKeyListenerC23215.mo50668(this.f49034);
            viewOnKeyListenerC23215.mo50667(this.f49028);
            viewOnKeyListenerC23215.setCallback(this.f49037);
            viewOnKeyListenerC23215.mo50670(this.f49036);
            viewOnKeyListenerC23215.mo50665(this.f49030);
            this.f49027 = viewOnKeyListenerC23215;
        }
        return this.f49027;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m36148() {
        if (m36151()) {
            return true;
        }
        if (this.f49028 == null) {
            return false;
        }
        m36139(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36146(int i, int i2) {
        if (m36151()) {
            return true;
        }
        if (this.f49028 == null) {
            return false;
        }
        m36139(i, i2, true, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36139(int i, int i2, boolean z, boolean z2) {
        AbstractC22469 abstractC22469M36147 = m36147();
        abstractC22469M36147.mo50673(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f49030, this.f49028.getLayoutDirection()) & 7) == 5) {
                i -= this.f49028.getWidth();
            }
            abstractC22469M36147.mo50672(i);
            abstractC22469M36147.mo50671(i2);
            int i3 = (int) ((this.f49035.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC22469M36147.m50666(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC22469M36147.show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36140() {
        if (m36151()) {
            this.f49027.dismiss();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo22387() {
        this.f49027 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f49032;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36151() {
        AbstractC22469 abstractC22469 = this.f49027;
        return abstractC22469 != null && abstractC22469.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36144(InterfaceC12772 interfaceC12772) {
        this.f49037 = interfaceC12772;
        AbstractC22469 abstractC22469 = this.f49027;
        if (abstractC22469 != null) {
            abstractC22469.setCallback(interfaceC12772);
        }
    }
}
