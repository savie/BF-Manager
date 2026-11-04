package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۡ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9618 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8873 f31108;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9618(C8873 c8873) {
        this.f31108 = c8873;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C8873 c8873 = this.f31108;
        boolean z = c8873.f28986 && string.contains("static") && string.contains("final");
        c8873.f28988 = z;
        if (z) {
            if (!c8873.f28990 || c8873.f28989) {
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
