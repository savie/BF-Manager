package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15054 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7292 f49059;

    public C15054(C7292 c7292) {
        this.f49059 = c7292;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f49059.f24213.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.f49059.f24213.notifyDataSetInvalidated();
    }
}
