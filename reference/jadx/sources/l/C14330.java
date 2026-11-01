package l;

import android.text.Editable;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ܳۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14330 extends AbstractC12561 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f46949;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC6192 f46950;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f46951;

    public C14330(TextInputLayout textInputLayout, RunnableC6192 runnableC6192, EditText editText) {
        this.f46951 = textInputLayout;
        this.f46950 = runnableC6192;
        this.f46949 = editText;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f46951;
        RunnableC6192 runnableC6192 = this.f46950;
        textInputLayout.removeCallbacks(runnableC6192);
        runnableC6192.run();
        Integer numM37905 = C15945.m37905(this.f46949.getText().toString());
        boolean z = false;
        if (numM37905 == null) {
            textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM37905 != null && numM37905.intValue() != C16259.m38409()) {
            z = true;
        }
        textInputLayout.setEndIconVisible(z);
    }
}
