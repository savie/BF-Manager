package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ᩳۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17971 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19383 f57482;

    public C17971(C19383 c19383) {
        this.f57482 = c19383;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f57482.m44417();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f57482.m44417();
    }
}
