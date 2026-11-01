package l;

/* JADX INFO: renamed from: l.֡ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0247 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15313 f1473;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1474 = true;

    public C0247(C15313 c15313) {
        this.f1473 = c15313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1682() {
        synchronized (this) {
            this.f1473 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1683(String str) {
        synchronized (this) {
            if (this.f1473 != null) {
                C14277 c14277 = new C14277();
                c14277.m34466(str);
                this.f1473.m36672(c14277);
                this.f1474 = false;
                this.f1473 = null;
            }
        }
    }
}
