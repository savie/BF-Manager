package l;

import android.text.Editable;
import android.text.TextWatcher;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;

/* JADX INFO: renamed from: l.۠۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8187 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19476 f28539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginEditTextWatcher f28540;

    public C8187(C19476 c19476, PluginEditTextWatcher pluginEditTextWatcher) {
        this.f28539 = c19476;
        this.f28540 = pluginEditTextWatcher;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f28540.beforeTextChanged(this.f28539, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f28540.onTextChanged(this.f28539, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f28540.afterTextChanged(this.f28539, editable);
    }
}
