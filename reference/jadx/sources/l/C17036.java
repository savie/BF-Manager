package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܿ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17036 implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f54419;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2446 f54420;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public CheckBox f54421;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextInputLayout f54422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CheckBox f54423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EditText f54424;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17036(View view, int i, int i2, int i3, int i4, int i5) {
        this.f54419 = (TextView) view.findViewById(i);
        this.f54422 = (TextInputLayout) view.findViewById(i2);
        EditText editText = (EditText) view.findViewById(i3);
        this.f54424 = editText;
        CheckBox checkBox = (CheckBox) view.findViewById(i4);
        this.f54421 = checkBox;
        CheckBox checkBox2 = (CheckBox) view.findViewById(i5);
        this.f54423 = checkBox2;
        checkBox.setOnCheckedChangeListener(this);
        editText.addTextChangedListener(this);
        onCheckedChanged(checkBox, checkBox.isChecked());
        C18211.m42335(editText, checkBox2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39808(C2446 c2446) {
        this.f54420 = c2446;
        this.f54424.setText(c2446.f9757);
        this.f54421.setChecked(c2446.f9758);
        this.f54423.setChecked(c2446.f9759);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39809() {
        this.f54420.f9757 = this.f54424.getText().toString();
        this.f54420.f9758 = this.f54421.isChecked();
        this.f54420.f9759 = this.f54423.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39806() {
        if (this.f54421.isChecked() || !this.f54423.isChecked()) {
            return;
        }
        try {
            Pattern.compile(this.f54424.getText().toString());
        } catch (PatternSyntaxException e) {
            m39807(R.string.MT_Protector);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39810() {
        return this.f54424.length() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39807(int i) {
        TextInputLayout textInputLayout = this.f54422;
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C16737.m39288(i));
        this.f54424.requestFocus();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TextInputLayout textInputLayout = this.f54422;
        textInputLayout.setEnabled(!z);
        this.f54424.setEnabled(!z);
        this.f54423.setEnabled(!z);
        textInputLayout.setAlpha(z ? 0.6f : 1.0f);
        this.f54419.setAlpha(z ? 0.6f : 1.0f);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f54422;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
        }
    }
}
