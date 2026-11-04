package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩹ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes.dex */
public final class C23343 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3205 f75618;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C23343(ViewOnClickListenerC3205 viewOnClickListenerC3205) {
        this.f75618 = viewOnClickListenerC3205;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int iM29456;
        String string = editable.toString();
        boolean zM29453 = C11730.m29453(string);
        ViewOnClickListenerC3205 viewOnClickListenerC3205 = this.f75618;
        String strM53021 = (!zM29453 || (iM29456 = C11730.m29456(string)) >= viewOnClickListenerC3205.f10453.f33816.mo4328()) ? null : viewOnClickListenerC3205.f10453.f33816.m53021(iM29456);
        if (strM53021 != null && !strM53021.isEmpty()) {
            viewOnClickListenerC3205.f10452.mo52335((CharSequence) strM53021);
            viewOnClickListenerC3205.f10452.setEnabled(false);
            viewOnClickListenerC3205.f10452.setAlpha(0.5f);
        } else {
            viewOnClickListenerC3205.f10452.setEnabled(true);
            viewOnClickListenerC3205.f10452.setAlpha(1.0f);
        }
    }
}
