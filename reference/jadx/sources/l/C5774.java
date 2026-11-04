package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5774 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f19836;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C16960 c16960 = this.f19836;
        if (c16960.f55402.isShowing()) {
            c16960.show();
        }
    }

    public C5774(C16960 c16960) {
        this.f19836 = c16960;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f19836.dismiss();
    }
}
