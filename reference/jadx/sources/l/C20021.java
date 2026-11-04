package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20021 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f64318;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f64319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f64320;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20021(C23255 c23255, C23255 c23256, C12628 c12628) {
        this.f64318 = c23255;
        this.f64320 = c23256;
        this.f64319 = c12628;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C15545.m37235(this.f64318, this.f64320, this.f64319.f40509.m17218());
    }
}
