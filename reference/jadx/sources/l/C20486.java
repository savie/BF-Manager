package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩵ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes5.dex */
public final class C20486 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC6316 f65625;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20486(DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316) {
        this.f65625 = dialogInterfaceOnClickListenerC6316;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = this.f65625;
        if (dialogInterfaceOnClickListenerC6316.f21406) {
            return;
        }
        String string = editable.toString();
        if (C11730.m29457(string)) {
            int iM29451 = C11730.m29451(string);
            dialogInterfaceOnClickListenerC6316.f21411.m49047(iM29451);
            dialogInterfaceOnClickListenerC6316.m18019(iM29451, false);
            if (dialogInterfaceOnClickListenerC6316.f21413) {
                DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceOnClickListenerC6316.f21403;
                dialogInterfaceOnClickListenerC6316.f21413 = false;
                dialogInterfaceC8327.m22431(false);
            }
        }
    }
}
