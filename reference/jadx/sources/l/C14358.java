package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ܰۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes4.dex */
public final class C14358 implements Comparable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C14358 f45276;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45277 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f45278;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f45279;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0812 f45280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f45281;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f45282;

    public /* synthetic */ C14358(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, str);
    }

    public C14358(int i, int i2, int i3, String str) {
        this.f45281 = i;
        this.f45278 = i2;
        this.f45279 = i3;
        this.f45282 = str;
        this.f45280 = C9015.m24070(new C3918(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34785() {
        return this.f45281;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m34788() {
        return this.f45278;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m34787() {
        return this.f45279;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C14358 c14358) {
        C15243.m36590(c14358, "other");
        Object value = this.f45280.getValue();
        C15243.m36591(value, "<get-bigInteger>(...)");
        Object value2 = c14358.f45280.getValue();
        C15243.m36591(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final String toString() {
        String str = this.f45282;
        String strM36593 = !C0878.m3584((CharSequence) str) ? C15243.m36593(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45281);
        sb.append('.');
        sb.append(this.f45278);
        sb.append('.');
        return C12669.m31437(this.f45279, strM36593, sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14358)) {
            return false;
        }
        C14358 c14358 = (C14358) obj;
        return this.f45281 == c14358.f45281 && this.f45278 == c14358.f45278 && this.f45279 == c14358.f45279;
    }

    public final int hashCode() {
        return ((((this.f45281 + 527) * 31) + this.f45278) * 31) + this.f45279;
    }

    static {
        new C14358(0, 0, 0, "");
        f45276 = new C14358(0, 1, 0, "");
        new C14358(1, 0, 0, "");
    }
}
