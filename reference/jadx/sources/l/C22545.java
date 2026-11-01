package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C22545 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f73520;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C7022 c7022 = this.f73520;
        if (c7022.f23602.isShowing()) {
            c7022.show();
        }
    }

    public C22545(C7022 c7022) {
        this.f73520 = c7022;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f73520.dismiss();
    }
}
