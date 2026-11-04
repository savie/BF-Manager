package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19382 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Comparator f62618 = C2661.comparing(new C18061(3));

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Comparator f62619 = C8627.thenComparing(C2661.comparing(new C7620(4)), new C8195(0));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f62621;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f62622;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C9378 f62623;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9378 f62624;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62625;

    public C19382(String str) {
        C17359.requireNonNull(str);
        this.f62622 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19382.class != obj.getClass()) {
            return false;
        }
        return this.f62622.equals(((C19382) obj).f62622);
    }

    public final int hashCode() {
        return this.f62622.hashCode();
    }
}
