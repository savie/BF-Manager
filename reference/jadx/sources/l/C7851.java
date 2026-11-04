package l;

/* JADX INFO: renamed from: l.۟ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7851 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26147;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f26148;

    public C7851(String str, int i) {
        this.f26148 = str;
        this.f26147 = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C7851.class == obj.getClass()) {
            C7851 c7851 = (C7851) obj;
            if (this.f26147 == c7851.f26147 && this.f26148.equals(c7851.f26148)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26148.hashCode() * 31) + this.f26147;
    }
}
