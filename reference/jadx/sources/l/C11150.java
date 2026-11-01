package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۧܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D946 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11150 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f37809;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28071(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        C13638.requireNonNull(editText);
        editText.addTextChangedListener(new C11150(textInputLayout));
    }

    public C11150(TextInputLayout textInputLayout) {
        this.f37809 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f37809.setErrorEnabled(false);
    }
}
