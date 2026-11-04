package l;

/* JADX INFO: renamed from: l.ۢ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2349 f31592;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2349 f31593;

    public C9805(C2349 c2349, C2349 c23410) {
        this.f31592 = c2349;
        this.f31593 = c23410;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C2349 c2349 = this.f31592;
        sb.append(c2349);
        C2349 c23410 = this.f31593;
        if (c2349.equals(c23410)) {
            str = "";
        } else {
            str = ", " + c23410;
        }
        return C8947.m23910(sb, str, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9805.class == obj.getClass()) {
            C9805 c9805 = (C9805) obj;
            if (this.f31592.equals(c9805.f31592) && this.f31593.equals(c9805.f31593)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31593.hashCode() + (this.f31592.hashCode() * 31);
    }
}
