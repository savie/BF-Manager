package l;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩺۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes.dex */
public final class C22986 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC18046 f74707;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C22986(DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046) {
        this.f74707 = dialogInterfaceOnClickListenerC18046;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = this.f74707;
        if (dialogInterfaceOnClickListenerC18046.f57699) {
            return;
        }
        try {
            int i = Integer.parseInt(dialogInterfaceOnClickListenerC18046.f57703.getText().toString());
            int i2 = Integer.parseInt(dialogInterfaceOnClickListenerC18046.f57700.getText().toString());
            int i3 = Integer.parseInt(dialogInterfaceOnClickListenerC18046.f57698.getText().toString());
            int i4 = Integer.parseInt(dialogInterfaceOnClickListenerC18046.f57697.getText().toString());
            if (i >= 0 && i <= 100 && i2 >= 0 && i2 <= 255 && i3 >= 0 && i3 <= 255 && i4 >= 0 && i4 <= 255) {
                int iArgb = Color.argb(Math.round((i * 255) / 100.0f), i2, i3, i4);
                dialogInterfaceOnClickListenerC18046.f57695.m27063(iArgb);
                dialogInterfaceOnClickListenerC18046.m42033(iArgb, false);
                if (dialogInterfaceOnClickListenerC18046.f57704) {
                    DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceOnClickListenerC18046.f57702;
                    dialogInterfaceOnClickListenerC18046.f57704 = false;
                    dialogInterfaceC19356.m44372(false);
                }
            }
        } catch (Exception unused) {
        }
    }
}
