package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۡۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9101 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f29571;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6865 f29572;

    public C9101(C6865 c6865, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f29572 = c6865;
        this.f29571 = dialogInterfaceC8327;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f29572.f22796.isEmpty()) {
            this.f29571.dismiss();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f29571.dismiss();
    }
}
