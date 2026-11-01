package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2565 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10119;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10120;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13626 f10121;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f10122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13626 f10123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f10124;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Comparator f10118 = C7618.comparing(new C19929(3));

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Comparator f10117 = C21023.thenComparing(C7618.comparing(new C5008(2)), new C11739(0));

    public C2565(String str) {
        C13638.requireNonNull(str);
        this.f10124 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2565.class != obj.getClass()) {
            return false;
        }
        return this.f10124.equals(((C2565) obj).f10124);
    }

    public final int hashCode() {
        return this.f10124.hashCode();
    }
}
