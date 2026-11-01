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

/* JADX INFO: renamed from: l.᩵ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceC19356 implements DialogInterface, InterfaceC1423 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Field f62400;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62401 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC7957 f62402;

    static {
        try {
            Field declaredField = DialogC7749.class.getDeclaredField("mKeyDispatcher");
            declaredField.setAccessible(true);
            f62400 = declaredField;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public DialogInterfaceC19356(DialogInterfaceC7957 dialogInterfaceC7957) {
        this.f62402 = dialogInterfaceC7957;
        try {
            Field field = f62400;
            final InterfaceC7791 interfaceC7791 = (InterfaceC7791) field.get(dialogInterfaceC7957);
            if (interfaceC7791 != null) {
                field.set(dialogInterfaceC7957, new InterfaceC7791() { // from class: l.ᩴۡۜ
                    @Override // l.InterfaceC7791
                    /* JADX INFO: renamed from: ۙ */
                    public final boolean mo20463(KeyEvent keyEvent) {
                        try {
                            return interfaceC7791.mo20463(keyEvent);
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
    public final View m44364(int i) {
        return this.f62402.findViewById(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Window m44378() {
        return this.f62402.getWindow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context m44363() {
        return this.f62402.getContext();
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        try {
            this.f62402.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.content.DialogInterface
    public final void dismiss() {
        try {
            this.f62402.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m44362() {
        Window window;
        DialogInterfaceC7957 dialogInterfaceC7957 = this.f62402;
        try {
            dialogInterfaceC7957.show();
            if (!m44360(dialogInterfaceC7957.findViewById(R.id.MT_Protector)) || (window = dialogInterfaceC7957.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(16);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44360(View view) {
        if (view != null && view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m44360(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Button m44373() {
        return this.f62402.m21014(-1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Button m44374() {
        return this.f62402.m21014(-2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Button m44361() {
        return this.f62402.m21014(-3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44367(DialogInterface.OnDismissListener onDismissListener) {
        this.f62402.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44366(DialogInterface.OnCancelListener onCancelListener) {
        this.f62402.setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44368(DialogInterface.OnKeyListener onKeyListener) {
        this.f62402.setOnKeyListener(onKeyListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44369(DialogInterface.OnShowListener onShowListener) {
        this.f62402.setOnShowListener(onShowListener);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m44375() {
        return this.f62402.isShowing();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44370(ViewGroup viewGroup) {
        this.f62402.m21017(viewGroup);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44371(CharSequence charSequence) {
        this.f62402.m21018(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44377(CharSequence charSequence) {
        this.f62402.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44372(boolean z) {
        this.f62402.setCancelable(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44365(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f62402.m21016(i, charSequence, onClickListener);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21362 m44376() {
        return this.f62402.m21015();
    }

    @Override // l.InterfaceC1423
    public final AbstractC3062 getLifecycle() {
        return this.f62402.getLifecycle();
    }
}
