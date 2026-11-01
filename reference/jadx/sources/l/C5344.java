package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۚ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5344 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10948 f18455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15532 f18456;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5344(C15532 c15532, C10948 c10948) {
        this.f18456 = c15532;
        this.f18455 = c10948;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            int iM4127 = C1110.m4127(editable.toString());
            this.f18456.setProgress(Math.round((iM4127 - 80) / 5.0f));
            this.f18455.m16849(iM4127 / 100.0f);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
    }
}
