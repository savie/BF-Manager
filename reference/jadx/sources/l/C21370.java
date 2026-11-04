package l;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4Q8 */
/* JADX INFO: loaded from: classes5.dex */
public class C21370 extends DialogInterfaceOnCancelListenerC19136 {
    public C21370() {
    }

    public C21370(int i) {
        super(i);
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC14656(getContext(), getTheme());
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof DialogC14656) {
            DialogC14656 dialogC14656 = (DialogC14656) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dialogC14656.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
