package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.۬ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14050 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f44500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16434 f44501;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C14050(C16434 c16434, C23255 c23255) {
        this.f44501 = c16434;
        this.f44500 = c23255;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            int iM50083 = C22124.m50083(editable.toString());
            this.f44501.setProgress(Math.round((iM50083 - 80) / 5.0f));
            this.f44500.m53896(iM50083 / 100.0f);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
    }
}
