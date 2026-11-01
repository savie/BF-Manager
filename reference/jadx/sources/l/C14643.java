package l;

/* JADX INFO: renamed from: l.ܳܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14643 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f47884;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f47885;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f47886;

    public C14643(C23815 c23815) {
        this.f47886 = c23815.f77007;
        this.f47885 = c23815.f77006;
        this.f47884 = c23815.f77005;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23815 m35155() {
        return new C23815(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14643)) {
            return false;
        }
        C14643 c14643 = (C14643) obj;
        return this.f47886 == c14643.f47886 && this.f47885 == c14643.f47885 && this.f47884 == c14643.f47884;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f47886), Float.valueOf(this.f47885), Long.valueOf(this.f47884));
    }
}
