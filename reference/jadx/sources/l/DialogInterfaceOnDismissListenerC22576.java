package l;

import android.content.DialogInterface;
import com.tencent.open.web.security.JniInterface;

/* JADX INFO: renamed from: l.᩸ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC22576 implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        try {
            if (JniInterface.f897) {
                JniInterface.clearAllPWD();
            }
        } catch (Exception unused) {
        }
    }
}
