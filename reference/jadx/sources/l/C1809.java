package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C1809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13298 f6156;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Throwable f6157;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f6158 = new ArrayList(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6293(Throwable th) {
        Throwable th2 = this.f6157;
        if (th2 == null) {
            this.f6157 = th;
        } else if (th2 != th) {
            th2.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m6292(boolean z) {
        ArrayList<Throwable> arrayList = this.f6158;
        for (Throwable th : arrayList) {
            Error error = (Error) C23438.m52636(th, Error.class);
            if (error != null) {
                m6291(error);
                return error;
            }
            if (C23438.m52653(th)) {
                m6291(th);
                return th;
            }
        }
        Throwable th2 = this.f6157;
        if (th2 != null) {
            m6291(th2);
            return th2;
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        m6291(th3);
        return th3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m6291(Throwable th) {
        Throwable th2 = this.f6157;
        if (th2 != null && th2 != th) {
            th.addSuppressed(th2);
        }
        for (Throwable th3 : this.f6158) {
            if (th3 != th) {
                th.addSuppressed(th3);
            }
        }
    }
}
