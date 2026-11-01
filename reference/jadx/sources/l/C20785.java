package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩷ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20785 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC17341 f67593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f67594;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20785(String str, AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341) {
        this.f67594 = str;
        this.f67593 = abstractDialogInterfaceOnClickListenerC17341;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        String str = this.f67594;
        int length2 = str.length();
        AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = this.f67593;
        if (length <= length2) {
            if (TextUtils.equals(editable, str)) {
                return;
            }
            abstractDialogInterfaceOnClickListenerC17341.m40346((CharSequence) str);
            abstractDialogInterfaceOnClickListenerC17341.m40371();
            return;
        }
        if (editable.toString().startsWith(str.concat("-"))) {
            return;
        }
        abstractDialogInterfaceOnClickListenerC17341.m40346((CharSequence) str.concat("-"));
        abstractDialogInterfaceOnClickListenerC17341.m40371();
    }
}
