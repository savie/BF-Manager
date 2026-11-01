package l;

/* JADX INFO: renamed from: l.ۙ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public final class C4891 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f17177;

    public C4891(C11948 c11948) {
        int iMo9278 = c11948.f40070 == null ? -1 : c11948.f40070.mo9278();
        if (iMo9278 == -1 || c11948.f40073 == null) {
            this.f17176 = -1;
            this.f17177 = -1;
        } else {
            this.f17177 = c11948.f40073.m49096(iMo9278);
            this.f17176 = c11948.f40073.m49094(iMo9278, true);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m13613() {
        return this.f17177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13612() {
        return this.f17176;
    }
}
