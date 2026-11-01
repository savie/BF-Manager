package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes3.dex */
public final class C10190 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9587 f34816;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Throwable f34817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34818 = new ArrayList(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25965(Throwable th) {
        Throwable th2 = this.f34817;
        if (th2 == null) {
            this.f34817 = th;
        } else if (th2 != th) {
            th2.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m25964(boolean z) {
        ArrayList<Throwable> arrayList = this.f34818;
        for (Throwable th : arrayList) {
            Error error = (Error) C16540.m38921(th, Error.class);
            if (error != null) {
                m25963(error);
                return error;
            }
            if (C16540.m38938(th)) {
                m25963(th);
                return th;
            }
        }
        Throwable th2 = this.f34817;
        if (th2 != null) {
            m25963(th2);
            return th2;
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        m25963(th3);
        return th3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m25963(Throwable th) {
        Throwable th2 = this.f34817;
        if (th2 != null && th2 != th) {
            th.addSuppressed(th2);
        }
        for (Throwable th3 : this.f34818) {
            if (th3 != th) {
                th.addSuppressed(th3);
            }
        }
    }
}
