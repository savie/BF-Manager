package l;

/* JADX INFO: renamed from: l.ܶ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I97D */
/* JADX INFO: loaded from: classes4.dex */
public final class C16449 implements Comparable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f53342 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f53343;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4868 f53344;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f53345;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f53346;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f53346 - ((C16449) obj).f53346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16449 m39003(int i, String str) {
        if (str.startsWith("parseColor(")) {
            str = str.replace(" ", "");
        }
        String str2 = str + "::" + i;
        ConcurrentMapC17249 concurrentMapC17249 = f53342;
        C16449 c16449 = (C16449) concurrentMapC17249.get(str2);
        if (c16449 != null) {
            return c16449;
        }
        C16449 c164410 = new C16449(str, i);
        concurrentMapC17249.put(str2, c164410);
        return c164410;
    }

    public C16449(String str, int i) {
        this.f53343 = str;
        this.f53346 = i;
        if (str.startsWith("parseColor(")) {
            this.f53344 = C4868.m14913(str);
            this.f53345 = 0;
        } else {
            this.f53344 = null;
            this.f53345 = C17941.m41877(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4868 m39004() {
        C4868 c4868 = this.f53344;
        C17359.requireNonNull(c4868);
        return c4868;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16449.class == obj.getClass()) {
            C16449 c16449 = (C16449) obj;
            if (this.f53346 == c16449.f53346 && this.f53343.equals(c16449.f53343)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f53343, Integer.valueOf(this.f53346));
    }
}
