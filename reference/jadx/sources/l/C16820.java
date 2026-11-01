package l;

/* JADX INFO: renamed from: l.ܽᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes4.dex */
public class C16820 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f53842;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53843;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f53844;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f53845;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f53846;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f53847;

    static {
        new C16820(new C0591());
        C9023.m23358(0, 1, 2, 3, 4);
        C17983.m41806(5);
        C17983.m41806(6);
        C17983.m41806(7);
    }

    public C16820(C0591 c0591) {
        String str = C17983.f57504;
        this.f53844 = c0591.f2568;
        this.f53846 = c0591.f2570;
        this.f53842 = c0591.f2566;
        this.f53845 = c0591.f2569;
        this.f53847 = c0591.f2571;
        this.f53843 = c0591.f2567;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16820)) {
            return false;
        }
        C16820 c16820 = (C16820) obj;
        return this.f53844 == c16820.f53844 && this.f53846 == c16820.f53846 && this.f53842 == c16820.f53842 && this.f53845 == c16820.f53845 && this.f53847 == c16820.f53847 && this.f53843 == c16820.f53843;
    }

    public final int hashCode() {
        long j = this.f53844;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f53846;
        return ((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f53842 ? 1 : 0)) * 31) + (this.f53845 ? 1 : 0)) * 31) + (this.f53847 ? 1 : 0)) * 31) + (this.f53843 ? 1 : 0);
    }
}
