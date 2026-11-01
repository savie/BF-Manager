package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18645 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f60457;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18645(C12562 c12562) {
        this.f60457 = c12562;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f60457.setEnabled(editable.toString().toLowerCase().startsWith("https://"));
    }
}
