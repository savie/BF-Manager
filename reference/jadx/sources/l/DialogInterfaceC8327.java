package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import bin.mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۠ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceC8327 implements DialogInterface, InterfaceC11217 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Field f27314;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27315 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC12551 f27316;

    static {
        try {
            Field declaredField = DialogC14656.class.getDeclaredField("mKeyDispatcher");
            declaredField.setAccessible(true);
            f27314 = declaredField;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public DialogInterfaceC8327(DialogInterfaceC12551 dialogInterfaceC12551) {
        this.f27316 = dialogInterfaceC12551;
        try {
            Field field = f27314;
            final InterfaceC4041 interfaceC4041 = (InterfaceC4041) field.get(dialogInterfaceC12551);
            if (interfaceC4041 != null) {
                field.set(dialogInterfaceC12551, new InterfaceC4041() { // from class: l.ۡۖۧ
                    @Override // l.InterfaceC4041
                    /* JADX INFO: renamed from: ۙ */
                    public final boolean mo13007(KeyEvent keyEvent) {
                        try {
                            return interfaceC4041.mo13007(keyEvent);
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m22423(int i) {
        return this.f27316.findViewById(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Window m22435() {
        return this.f27316.getWindow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context m22422() {
        return this.f27316.getContext();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22438(int i) {
        this.f27316.getDelegate().mo5049(i);
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        try {
            this.f27316.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.content.DialogInterface
    public final void dismiss() {
        try {
            this.f27316.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22432() {
        Window window;
        DialogInterfaceC12551 dialogInterfaceC12551 = this.f27316;
        try {
            dialogInterfaceC12551.show();
            if (!m22421(dialogInterfaceC12551.findViewById(R.id.MT_Protector)) || (window = dialogInterfaceC12551.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(16);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22421(View view) {
        if (view != null && view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m22421(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Button m22436() {
        return this.f27316.m31225(-1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Button m22433() {
        return this.f27316.m31225(-2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Button m22440() {
        return this.f27316.m31225(-3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22426(DialogInterface.OnDismissListener onDismissListener) {
        this.f27316.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22425(DialogInterface.OnCancelListener onCancelListener) {
        this.f27316.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22427(DialogInterface.OnKeyListener onKeyListener) {
        this.f27316.setOnKeyListener(onKeyListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22428(DialogInterface.OnShowListener onShowListener) {
        this.f27316.setOnShowListener(onShowListener);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22434() {
        return this.f27316.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22429(ViewGroup viewGroup) {
        this.f27316.m31228(viewGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22430(CharSequence charSequence) {
        this.f27316.m31229(charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22439(CharSequence charSequence) {
        this.f27316.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22431(boolean z) {
        this.f27316.setCancelable(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22424(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f27316.m31227(i, charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23740 m22437() {
        return this.f27316.m31226();
    }

    @Override // l.InterfaceC11217
    public final AbstractC8585 getLifecycle() {
        return this.f27316.getLifecycle();
    }
}
