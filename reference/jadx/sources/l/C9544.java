package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۡܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9544 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7308 f30894;

    public C9544(C7308 c7308) {
        this.f30894 = c7308;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C7308 c7308 = this.f30894;
        c7308.m20004();
        if (c7308.f24055 || c7308.f24053 == null) {
            return;
        }
        c7308.f24053.mo8153(string);
    }
}
