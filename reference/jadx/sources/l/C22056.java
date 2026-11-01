package l;

/* JADX INFO: renamed from: l.᩹ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8EK */
/* JADX INFO: loaded from: classes.dex */
public final class C22056 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f71476;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f71477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f71478;

    public C22056(C12884 c12884, String str, String str2, String str3) {
        this.f71476 = c12884.m31942(str);
        this.f71478 = c12884.m31942(str2);
        this.f71477 = c12884.m31942(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22056.class == obj.getClass()) {
            C22056 c22056 = (C22056) obj;
            if (this.f71476 == c22056.f71476 && this.f71478 == c22056.f71478 && this.f71477 == c22056.f71477) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f71476 * 31) + this.f71478) * 31) + this.f71477;
    }
}
