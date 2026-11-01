package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۖ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2850 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1439 f10777;

    public C2850(C1439 c1439) {
        this.f10777 = c1439;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C1439 c1439 = this.f10777;
        c1439.m5025();
        if (c1439.f5905 || c1439.f5899 == null) {
            return;
        }
        c1439.f5899.mo2810(string);
    }
}
