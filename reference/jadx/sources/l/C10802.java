package l;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۧۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10802 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f36774;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f36775;

    public C10802(TextInputLayout textInputLayout, EditText editText) {
        this.f36774 = textInputLayout;
        this.f36775 = editText;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C5301.m14718(this.f36774, this.f36775);
    }
}
