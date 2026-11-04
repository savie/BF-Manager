package l;

import android.text.Editable;
import android.text.TextWatcher;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;

/* JADX INFO: renamed from: l.᩷ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C21790 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10601 f69490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginEditTextWatcher f69491;

    public C21790(C10601 c10601, PluginEditTextWatcher pluginEditTextWatcher) {
        this.f69490 = c10601;
        this.f69491 = pluginEditTextWatcher;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f69491.beforeTextChanged(this.f69490, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f69491.onTextChanged(this.f69490, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f69491.afterTextChanged(this.f69490, editable);
    }
}
