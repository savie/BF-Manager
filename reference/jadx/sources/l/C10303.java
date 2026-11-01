package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۤ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10303 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7480 f35346;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C10303(ViewOnClickListenerC7480 viewOnClickListenerC7480) {
        this.f35346 = viewOnClickListenerC7480;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int iM17654;
        String string = editable.toString();
        boolean zM17648 = C6461.m17648(string);
        ViewOnClickListenerC7480 viewOnClickListenerC7480 = this.f35346;
        String strM1533 = (!zM17648 || (iM17654 = C6461.m17654(string)) >= viewOnClickListenerC7480.f24925.f5083.mo1519()) ? null : viewOnClickListenerC7480.f24925.f5083.m1533(iM17654);
        if (strM1533 != null && !strM1533.isEmpty()) {
            viewOnClickListenerC7480.f24920.setText(strM1533);
            viewOnClickListenerC7480.f24920.setEnabled(false);
            viewOnClickListenerC7480.f24920.setAlpha(0.5f);
        } else {
            viewOnClickListenerC7480.f24920.setEnabled(true);
            viewOnClickListenerC7480.f24920.setAlpha(1.0f);
        }
    }
}
