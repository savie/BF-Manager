package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܽۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17301 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f56332;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17301(C1626 c1626) {
        this.f56332 = c1626;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1626 c1626 = this.f56332;
        if (c1626.m5765()) {
            c1626.m5769(false);
        }
    }
}
