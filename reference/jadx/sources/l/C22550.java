package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩸ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes.dex */
public final class C22550 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15090 f72896;

    public C22550(ActivityC15090 activityC15090) {
        this.f72896 = activityC15090;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ActivityC15090 activityC15090 = this.f72896;
        activityC15090.f49249.setVisibility(activityC15090.f49251.getCount() == 0 ? 0 : 8);
    }
}
