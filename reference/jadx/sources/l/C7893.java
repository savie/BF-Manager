package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.۟۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D946 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7893 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1626 f26239;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21433(C1626 c1626) {
        C23255 c23255M5756 = c1626.m5756();
        C17359.requireNonNull(c23255M5756);
        c23255M5756.m53899(new C7893(c1626));
    }

    public C7893(C1626 c1626) {
        this.f26239 = c1626;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f26239.m5769(false);
    }
}
