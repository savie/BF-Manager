package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܰ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13468 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11351 f44535;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13468(C11351 c11351) {
        this.f44535 = c11351;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C11351 c11351 = this.f44535;
        boolean zContains = c11351.f38300.contains(editable.toString().trim());
        c11351.f38298 = zContains;
        if (zContains) {
            if (!c11351.f38294 || c11351.f38299) {
                return;
            }
            c11351.f38299 = true;
            c11351.m47200(3).setVisibility(0);
            return;
        }
        if (c11351.f38299) {
            c11351.f38299 = false;
            c11351.m47200(3).setVisibility(8);
        }
    }
}
