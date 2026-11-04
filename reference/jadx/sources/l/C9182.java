package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9182 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13657 f29784;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9182(ViewOnClickListenerC13657 viewOnClickListenerC13657) {
        this.f29784 = viewOnClickListenerC13657;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC13657 viewOnClickListenerC13657 = this.f29784;
        View view = viewOnClickListenerC13657.f43373;
        boolean z = true;
        if (editable.length() != 0 && (editable.length() != 1 || editable.charAt(0) != '/')) {
            z = false;
        }
        view.setEnabled(z);
        viewOnClickListenerC13657.f43379.setEnabled(viewOnClickListenerC13657.f43373.isEnabled());
    }
}
