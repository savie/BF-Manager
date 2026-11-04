package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10725 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Throwable f34062;

    public C10725(Throwable th) {
        C15243.m36590(th, "exception");
        this.f34062 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10725) {
            return C15243.m36589(this.f34062, ((C10725) obj).f34062);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34062.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f34062 + ')';
    }
}
