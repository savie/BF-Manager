package l;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ܶᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15390 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CompoundButton f50092;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1900 f50093;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15390(CompoundButton compoundButton, C1900 c1900) {
        this.f50092 = compoundButton;
        this.f50093 = c1900;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CompoundButton compoundButton = this.f50092;
        if (compoundButton == null || compoundButton.isChecked()) {
            C18211.m42338(this.f50093, (Spannable) editable);
        }
    }
}
