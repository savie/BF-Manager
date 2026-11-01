package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۙ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4294 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11351 f15460;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C4294(C11351 c11351) {
        this.f15460 = c11351;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C11351 c11351 = this.f15460;
        boolean z = c11351.f38297 && string.contains("static") && string.contains("final");
        c11351.f38294 = z;
        if (z) {
            if (!c11351.f38298 || c11351.f38299) {
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
