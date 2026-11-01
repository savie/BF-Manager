package l;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4Q8 */
/* JADX INFO: loaded from: classes5.dex */
public class C21154 extends DialogInterfaceOnCancelListenerC11281 {
    public C21154() {
    }

    public C21154(int i) {
        super(i);
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC7749(getContext(), getTheme());
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC7749) {
            DialogC7749 dialogC7749 = (DialogC7749) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dialogC7749.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
