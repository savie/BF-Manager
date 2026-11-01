package l;

/* JADX INFO: renamed from: l.۫ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I97D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12154 implements Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f40676 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40677;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23006 f40678;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f40679;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40680;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40680 - ((C12154) obj).f40680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12154 m30235(int i, String str) {
        if (str.startsWith("parseColor(")) {
            str = str.replace(" ", "");
        }
        String str2 = str + "::" + i;
        ConcurrentMapC13783 concurrentMapC13783 = f40676;
        C12154 c12154 = (C12154) concurrentMapC13783.get(str2);
        if (c12154 != null) {
            return c12154;
        }
        C12154 c12155 = new C12154(str, i);
        concurrentMapC13783.put(str2, c12155);
        return c12155;
    }

    public C12154(String str, int i) {
        this.f40679 = str;
        this.f40680 = i;
        if (str.startsWith("parseColor(")) {
            this.f40678 = C23006.m50871(str);
            this.f40677 = 0;
        } else {
            this.f40678 = null;
            this.f40677 = C16387.m38583(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23006 m30236() {
        C23006 c23006 = this.f40678;
        C13638.requireNonNull(c23006);
        return c23006;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12154.class == obj.getClass()) {
            C12154 c12154 = (C12154) obj;
            if (this.f40680 == c12154.f40680 && this.f40679.equals(c12154.f40679)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f40679, Integer.valueOf(this.f40680));
    }
}
