package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ܿۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17119 implements Comparable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C17119 f54584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54585 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f54586;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f54587;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5204 f54588;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f54589;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f54590;

    public /* synthetic */ C17119(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, str);
    }

    public C17119(int i, int i2, int i3, String str) {
        this.f54586 = i;
        this.f54589 = i2;
        this.f54587 = i3;
        this.f54590 = str;
        this.f54588 = C22138.m49098(new C12181(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39972() {
        return this.f54586;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m39975() {
        return this.f54589;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m39974() {
        return this.f54587;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C17119 c17119) {
        C13465.m32966(c17119, "other");
        Object value = this.f54588.getValue();
        C13465.m32967(value, "<get-bigInteger>(...)");
        Object value2 = c17119.f54588.getValue();
        C13465.m32967(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final String toString() {
        String str = this.f54590;
        String strM32959 = !C12529.m31145((CharSequence) str) ? C13465.m32959(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54586);
        sb.append('.');
        sb.append(this.f54589);
        sb.append('.');
        return C12441.m30911(this.f54587, strM32959, sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17119)) {
            return false;
        }
        C17119 c17119 = (C17119) obj;
        return this.f54586 == c17119.f54586 && this.f54589 == c17119.f54589 && this.f54587 == c17119.f54587;
    }

    public final int hashCode() {
        return ((((this.f54586 + 527) * 31) + this.f54589) * 31) + this.f54587;
    }

    static {
        new C17119(0, 0, 0, "");
        f54584 = new C17119(0, 1, 0, "");
        new C17119(1, 0, 0, "");
    }
}
