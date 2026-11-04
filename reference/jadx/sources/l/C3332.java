package l;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۗۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes2.dex */
public final class C3332 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC6316 f10902;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3332(DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316) {
        this.f10902 = dialogInterfaceOnClickListenerC6316;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = this.f10902;
        if (dialogInterfaceOnClickListenerC6316.f21406) {
            return;
        }
        try {
            int i = Integer.parseInt(dialogInterfaceOnClickListenerC6316.f21412.m54021().toString());
            int i2 = Integer.parseInt(dialogInterfaceOnClickListenerC6316.f21405.m54021().toString());
            int i3 = Integer.parseInt(dialogInterfaceOnClickListenerC6316.f21404.m54021().toString());
            int i4 = Integer.parseInt(dialogInterfaceOnClickListenerC6316.f21409.m54021().toString());
            if (i >= 0 && i <= 100 && i2 >= 0 && i2 <= 255 && i3 >= 0 && i3 <= 255 && i4 >= 0 && i4 <= 255) {
                int iArgb = Color.argb(Math.round((i * 255) / 100.0f), i2, i3, i4);
                dialogInterfaceOnClickListenerC6316.f21411.m49047(iArgb);
                dialogInterfaceOnClickListenerC6316.m18019(iArgb, false);
                if (dialogInterfaceOnClickListenerC6316.f21413) {
                    DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceOnClickListenerC6316.f21403;
                    dialogInterfaceOnClickListenerC6316.f21413 = false;
                    dialogInterfaceC8327.m22431(false);
                }
            }
        } catch (Exception unused) {
        }
    }
}
