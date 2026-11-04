package l;

/* JADX INFO: renamed from: l.ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f53257 = new Object[256];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53258;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m38977() {
        int i = this.f53258;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f53257;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f53258 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38979(C2243 c2243) {
        int i = this.f53258;
        Object[] objArr = this.f53257;
        if (i < objArr.length) {
            objArr[i] = c2243;
            this.f53258 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38978(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f53258;
            Object[] objArr2 = this.f53257;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f53258 = i3 + 1;
            }
        }
    }
}
