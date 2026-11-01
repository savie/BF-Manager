package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩷ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20655 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f67228;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f67229;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f67230;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20655(EditText editText, EditText editText2, C13026 c13026) {
        this.f67229 = editText;
        this.f67230 = editText2;
        this.f67228 = c13026;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C15717.m37441(this.f67229, this.f67230, this.f67228.f43452.m33442());
    }
}
