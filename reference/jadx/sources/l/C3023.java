package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: l.ۗۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3023 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11989 f11327;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3023(ViewOnClickListenerC11989 viewOnClickListenerC11989) {
        this.f11327 = viewOnClickListenerC11989;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC11989 viewOnClickListenerC11989 = this.f11327;
        View view = viewOnClickListenerC11989.f40171;
        boolean z = true;
        if (editable.length() != 0 && (editable.length() != 1 || editable.charAt(0) != '/')) {
            z = false;
        }
        view.setEnabled(z);
        viewOnClickListenerC11989.f40180.setEnabled(viewOnClickListenerC11989.f40171.isEnabled());
    }
}
