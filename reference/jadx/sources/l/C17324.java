package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ܽۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17324 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f56416;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f56417;

    public C17324(C1626 c1626, C1626 c1627) {
        this.f56417 = c1626;
        this.f56416 = c1627;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1626 c1626 = this.f56417;
        if (c1626.m5765()) {
            c1626.m5769(false);
            C0385.m2188(this.f56416, -1, 0, -1, -1);
        }
    }
}
