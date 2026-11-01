package l;

import android.database.ContentObserver;

/* JADX INFO: renamed from: l.ۛ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBKJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6347 extends ContentObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21407;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17636 f21408;

    public C6347(C17636 c17636, int i) {
        super(null);
        this.f21408 = c17636;
        this.f21407 = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f21408 != null) {
            C17636.m41010(this.f21407);
        }
    }
}
