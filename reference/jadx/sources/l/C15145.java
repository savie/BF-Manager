package l;

/* JADX INFO: renamed from: l.ܶۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15145 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String[] f49478;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f49479;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f49480;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49481;

    public C15145(boolean z) {
        this.f49480 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36312(C3854... c3854Arr) {
        if (!this.f49480) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c3854Arr.length];
        for (int i = 0; i < c3854Arr.length; i++) {
            strArr[i] = c3854Arr[i].f14407;
        }
        m36311(strArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36311(String... strArr) {
        if (!this.f49480) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f49479 = (String[]) strArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36313(EnumC10019... enumC10019Arr) {
        if (!this.f49480) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC10019Arr.length];
        for (int i = 0; i < enumC10019Arr.length; i++) {
            strArr[i] = enumC10019Arr[i].f34201;
        }
        m36314(strArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36314(String... strArr) {
        if (!this.f49480) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f49478 = (String[]) strArr.clone();
    }
}
