package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩷ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes.dex */
public final class C21893 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15179 f70730;

    public C21893(C15179 c15179) {
        this.f70730 = c15179;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f70730.m36509();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f70730.m36509();
    }
}
