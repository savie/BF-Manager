package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֨ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0961 extends DataSetObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6606 f3783;

    public C0961(C6606 c6606) {
        this.f3783 = c6606;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C6606.m17925(this.f3783);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        C6606.m17925(this.f3783);
    }
}
