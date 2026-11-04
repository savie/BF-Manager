package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۗܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3544 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC8552 f12158;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f12159;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3544(String str, AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        this.f12159 = str;
        this.f12158 = abstractDialogInterfaceOnClickListenerC8552;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        String str = this.f12159;
        int length2 = str.length();
        AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = this.f12158;
        if (length <= length2) {
            if (TextUtils.equals(editable, str)) {
                return;
            }
            abstractDialogInterfaceOnClickListenerC8552.m22924((CharSequence) str);
            abstractDialogInterfaceOnClickListenerC8552.m22916();
            return;
        }
        if (editable.toString().startsWith(str.concat("-"))) {
            return;
        }
        abstractDialogInterfaceOnClickListenerC8552.m22924((CharSequence) str.concat("-"));
        abstractDialogInterfaceOnClickListenerC8552.m22916();
    }
}
