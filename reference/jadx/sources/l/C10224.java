package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۤۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10224 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20807 f34900;

    public C10224(ActivityC20807 activityC20807) {
        this.f34900 = activityC20807;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ActivityC20807 activityC20807 = this.f34900;
        activityC20807.f67643.setVisibility(activityC20807.f67641.getCount() == 0 ? 0 : 8);
    }
}
