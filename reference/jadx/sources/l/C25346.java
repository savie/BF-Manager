package l;

/* JADX INFO: renamed from: l.᩻᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes.dex */
public class C25346 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f81824;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f81825;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f81826;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f81827;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f81828;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f81829;

    static {
        new C25346(new C11919());
        C4794.m14773(0, 1, 2, 3, 4);
        C7116.m19499(5);
        C7116.m19499(6);
        C7116.m19499(7);
    }

    public C25346(C11919 c11919) {
        String str = C7116.f23455;
        this.f81827 = c11919.f38407;
        this.f81828 = c11919.f38408;
        this.f81829 = c11919.f38409;
        this.f81825 = c11919.f38405;
        this.f81826 = c11919.f38406;
        this.f81824 = c11919.f38404;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25346)) {
            return false;
        }
        C25346 c25346 = (C25346) obj;
        return this.f81827 == c25346.f81827 && this.f81828 == c25346.f81828 && this.f81829 == c25346.f81829 && this.f81825 == c25346.f81825 && this.f81826 == c25346.f81826 && this.f81824 == c25346.f81824;
    }

    public final int hashCode() {
        long j = this.f81827;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f81828;
        return ((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f81829 ? 1 : 0)) * 31) + (this.f81825 ? 1 : 0)) * 31) + (this.f81826 ? 1 : 0)) * 31) + (this.f81824 ? 1 : 0);
    }
}
