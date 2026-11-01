package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܶ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15225 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC18046 f49651;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15225(DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046) {
        this.f49651 = dialogInterfaceOnClickListenerC18046;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = this.f49651;
        if (dialogInterfaceOnClickListenerC18046.f57699) {
            return;
        }
        String string = editable.toString();
        if (C6461.m17652(string)) {
            int iM17646 = C6461.m17646(string);
            dialogInterfaceOnClickListenerC18046.f57695.m27063(iM17646);
            dialogInterfaceOnClickListenerC18046.m42033(iM17646, false);
            if (dialogInterfaceOnClickListenerC18046.f57704) {
                DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceOnClickListenerC18046.f57702;
                dialogInterfaceOnClickListenerC18046.f57704 = false;
                dialogInterfaceC19356.m44372(false);
            }
        }
    }
}
