package l;

/* JADX INFO: renamed from: l.۬۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13882 extends C4666 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f44036;

    public C13882(Throwable th) {
        this.f44036 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13882) {
            return C15243.m36589(this.f44036, ((C13882) obj).f44036);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f44036;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // l.C4666
    public final String toString() {
        return "Closed(" + this.f44036 + ')';
    }
}
