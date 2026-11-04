package l;

/* JADX INFO: renamed from: l.ᩴܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G53U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19929 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f64101 = new Object[40];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64102 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m45856() {
        return this.f64101[this.f64102];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m45858() {
        Object[] objArr = this.f64101;
        int i = this.f64102;
        Object obj = objArr[i];
        this.f64102 = i - 1;
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45857(C14270 c14270) {
        int i = this.f64102 + 1;
        this.f64102 = i;
        Object[] objArr = this.f64101;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            this.f64101 = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        this.f64101[this.f64102] = c14270;
    }
}
