package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16039 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14547 f52025;

    public C16039(C14547 c14547) {
        this.f52025 = c14547;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f52025.f45854.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.f52025.f45854.notifyDataSetInvalidated();
    }
}
