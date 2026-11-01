package l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۟ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7559 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f25067;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f25068;

    public C7559(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f25068 = textInputLayout;
        this.f25067 = textInputLayout2;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f25068;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            C7000.m18806(this.f25067, -1, 0, -1, -1);
        }
    }
}
