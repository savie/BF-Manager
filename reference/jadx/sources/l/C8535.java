package l;

/* JADX INFO: renamed from: l.۠ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27884;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23393 f27885;

    public C8535(C7044 c7044, AbstractC8036 abstractC8036) {
        this.f27884 = abstractC8036.f26658;
        this.f27885 = c7044.f23243.m34514();
    }

    public final int hashCode() {
        return this.f27884 << (this.f27885.hashCode() + 16);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8535)) {
            return false;
        }
        C8535 c8535 = (C8535) obj;
        return this.f27884 == c8535.f27884 && this.f27885 == c8535.f27885;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C23393 c23393 = this.f27885;
        sb.append(c23393.m52573().getName());
        sb.append(" @ ");
        sb.append(c23393.m52574(this.f27884));
        return sb.toString();
    }
}
