package l;

/* JADX INFO: renamed from: l.ܰ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14860 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22868[] f48572;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f48573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1985[] f48574;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f48575;

    public C14860(C24975 c24975) {
        this.f48573 = new String[Math.min(c24975.f80872, 65535)];
        this.f48575 = new String[Math.min(c24975.f80877, 65535)];
        this.f48574 = new C1985[Math.min(c24975.f80881, 65535)];
        this.f48572 = new C22868[Math.min(c24975.f80878, 65535)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35788(int i) {
        String[] strArr = this.f48573;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35791(int i, String str) {
        if (str.length() > 512) {
            return;
        }
        String[] strArr = this.f48573;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m35792(int i) {
        String[] strArr = this.f48575;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35794(int i, String str) {
        String[] strArr = this.f48575;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1985 m35793(C24975 c24975, int i) {
        C1985[] c1985Arr = this.f48574;
        if (i >= c1985Arr.length) {
            return new C1985(c24975, i);
        }
        C1985 c1985 = c1985Arr[i];
        if (c1985 != null) {
            return c1985;
        }
        C1985 c1986 = new C1985(c24975, i);
        c1985Arr[i] = c1986;
        return c1986;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22868 m35789(C24975 c24975, int i) {
        C22868[] c22868Arr = this.f48572;
        if (i >= c22868Arr.length) {
            return new C22868(c24975, i);
        }
        C22868 c22868 = c22868Arr[i];
        if (c22868 != null) {
            return c22868;
        }
        C22868 c22869 = new C22868(c24975, i);
        c22868Arr[i] = c22869;
        return c22869;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35790() {
        this.f48574 = null;
        this.f48572 = null;
    }
}
