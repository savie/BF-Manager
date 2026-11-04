package l;

/* JADX INFO: renamed from: l.ۧᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11786 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38087;

    public C11786(C17007 c17007) {
        int iMo7191 = c17007.f55563 == null ? -1 : c17007.f55563.mo7191();
        if (iMo7191 == -1 || c17007.f55562 == null) {
            this.f38086 = -1;
            this.f38087 = -1;
        } else {
            this.f38087 = c17007.f55562.m52574(iMo7191);
            this.f38086 = c17007.f55562.m52572(iMo7191, true);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29625() {
        return this.f38087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29624() {
        return this.f38086;
    }
}
