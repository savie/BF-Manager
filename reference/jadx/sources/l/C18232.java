package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ᩳᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18232 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f58209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19644 f58210;

    public C18232(C19644 c19644, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f58210 = c19644;
        this.f58209 = dialogInterfaceC19356;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f58210.f63083.isEmpty()) {
            this.f58209.dismiss();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f58209.dismiss();
    }
}
