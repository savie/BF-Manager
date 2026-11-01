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

/* JADX INFO: renamed from: l.ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85W1 */
/* JADX INFO: loaded from: classes2.dex */
public class C2269 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f8102;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f8103;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC13560 f8104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f8105;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f8107;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f8109;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f8110;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12418 f8111;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f8112;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f8108 = 8388611;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final PopupWindow.OnDismissListener f8106 = new C11443(this);

    public C2269(Context context, C12418 c12418, View view, boolean z, int i, int i2) {
        this.f8110 = context;
        this.f8111 = c12418;
        this.f8105 = view;
        this.f8109 = z;
        this.f8107 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6957(PopupWindow.OnDismissListener onDismissListener) {
        this.f8102 = onDismissListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6956(View view) {
        this.f8105 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6959(boolean z) {
        this.f8103 = z;
        AbstractC13560 abstractC13560 = this.f8104;
        if (abstractC13560 != null) {
            abstractC13560.mo23043(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6955(int i) {
        this.f8108 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m6963() {
        return this.f8108;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m6964() {
        if (!m6960(0, 0)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC13560 m6962() {
        AbstractC13560 viewOnKeyListenerC21320;
        if (this.f8104 == null) {
            Context context = this.f8110;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.MT_Protector)) {
                viewOnKeyListenerC21320 = new ViewOnKeyListenerC8890(context, this.f8105, this.f8107, this.f8109);
            } else {
                viewOnKeyListenerC21320 = new ViewOnKeyListenerC21320(this.f8110, this.f8111, this.f8105, this.f8107, this.f8109);
            }
            viewOnKeyListenerC21320.mo23042(this.f8111);
            viewOnKeyListenerC21320.mo23041(this.f8106);
            viewOnKeyListenerC21320.mo23040(this.f8105);
            viewOnKeyListenerC21320.setCallback(this.f8112);
            viewOnKeyListenerC21320.mo23043(this.f8103);
            viewOnKeyListenerC21320.mo23039(this.f8108);
            this.f8104 = viewOnKeyListenerC21320;
        }
        return this.f8104;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m6952() {
        if (m6953()) {
            return true;
        }
        if (this.f8105 == null) {
            return false;
        }
        m6951(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6960(int i, int i2) {
        if (m6953()) {
            return true;
        }
        if (this.f8105 == null) {
            return false;
        }
        m6951(i, i2, true, true);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6951(int i, int i2, boolean z, boolean z2) {
        AbstractC13560 abstractC13560M6962 = m6962();
        abstractC13560M6962.mo23046(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f8108, this.f8105.getLayoutDirection()) & 7) == 5) {
                i -= this.f8105.getWidth();
            }
            abstractC13560M6962.mo23045(i);
            abstractC13560M6962.mo23044(i2);
            int i3 = (int) ((this.f8110.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC13560M6962.m33149(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abstractC13560M6962.show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6954() {
        if (m6953()) {
            this.f8104.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo6961() {
        this.f8104 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8102;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m6953() {
        AbstractC13560 abstractC13560 = this.f8104;
        return abstractC13560 != null && abstractC13560.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6958(InterfaceC5092 interfaceC5092) {
        this.f8112 = interfaceC5092;
        AbstractC13560 abstractC13560 = this.f8104;
        if (abstractC13560 != null) {
            abstractC13560.setCallback(interfaceC5092);
        }
    }
}
