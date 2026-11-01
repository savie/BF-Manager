package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩸۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21432 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Throwable f69689;

    public C21432(Throwable th) {
        C13465.m32966(th, "exception");
        this.f69689 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21432) {
            return C13465.m32965(this.f69689, ((C21432) obj).f69689);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69689.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f69689 + ')';
    }
}
