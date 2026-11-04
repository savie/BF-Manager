package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۖ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2907 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8873 f9514;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2907(C8873 c8873) {
        this.f9514 = c8873;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C8873 c8873 = this.f9514;
        boolean zContains = c8873.f28991.contains(editable.toString().trim());
        c8873.f28990 = zContains;
        if (zContains) {
            if (!c8873.f28988 || c8873.f28989) {
                return;
            }
            c8873.f28989 = true;
            c8873.m25516(3).setVisibility(0);
            return;
        }
        if (c8873.f28989) {
            c8873.f28989 = false;
            c8873.m25516(3).setVisibility(8);
        }
    }
}
