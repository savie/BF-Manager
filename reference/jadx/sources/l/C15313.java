package l;

/* JADX INFO: renamed from: l.ܶܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G53U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15313 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f49890 = new Object[40];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49891 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m36671() {
        return this.f49890[this.f49891];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m36673() {
        Object[] objArr = this.f49890;
        int i = this.f49891;
        Object obj = objArr[i];
        this.f49891 = i - 1;
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36672(C14277 c14277) {
        int i = this.f49891 + 1;
        this.f49891 = i;
        Object[] objArr = this.f49890;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            this.f49890 = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        this.f49890[this.f49891] = c14277;
    }
}
