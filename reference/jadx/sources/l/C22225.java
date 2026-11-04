package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩷ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes.dex */
public final class C22225 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19987 f71605;

    public C22225(C19987 c19987) {
        this.f71605 = c19987;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C19987.m45937(this.f71605);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        C19987.m45937(this.f71605);
    }
}
