package l;

import android.database.ContentObserver;

/* JADX INFO: renamed from: l.᩸ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: QBKJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22948 extends ContentObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11013 f74559;

    public C22948(C11013 c11013, int i) {
        super(null);
        this.f74559 = c11013;
        this.f74558 = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f74559 != null) {
            C11013.m27874(this.f74558);
        }
    }
}
