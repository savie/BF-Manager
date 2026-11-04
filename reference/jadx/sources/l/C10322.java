package l;

/* JADX INFO: renamed from: l.ۢᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f32923;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f32924;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f32925;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f32926;

    public C10322(boolean z) {
        this.f32924 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26594(C0628... c0628Arr) {
        if (!this.f32924) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c0628Arr.length];
        for (int i = 0; i < c0628Arr.length; i++) {
            strArr[i] = c0628Arr[i].f2470;
        }
        m26593(strArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26593(String... strArr) {
        if (!this.f32924) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f32923 = (String[]) strArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26595(EnumC13919... enumC13919Arr) {
        if (!this.f32924) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC13919Arr.length];
        for (int i = 0; i < enumC13919Arr.length; i++) {
            strArr[i] = enumC13919Arr[i].f44143;
        }
        m26596(strArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26596(String... strArr) {
        if (!this.f32924) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f32926 = (String[]) strArr.clone();
    }
}
