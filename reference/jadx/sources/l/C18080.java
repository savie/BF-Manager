package l;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ᩳ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C76R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18080 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f57843;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18080(TextInputLayout textInputLayout) {
        this.f57843 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f57843;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
        }
    }
}
