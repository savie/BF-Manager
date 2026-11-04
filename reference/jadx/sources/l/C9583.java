package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9583 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17973 f31014;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31013 = new ArrayList(3);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f31015 = new ArrayList(3);

    public C9583(C17973 c17973) {
        this.f31014 = c17973;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17973 m25024() {
        return this.f31014;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m25023() {
        return this.f31013;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m25025() {
        return this.f31015;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C17973 c17973 = this.f31014;
        sb.append(c17973 == null ? "-" : c17973.m41926());
        sb.append(", a:");
        sb.append(this.f31013);
        sb.append(", u:");
        sb.append(this.f31015);
        sb.append('}');
        return sb.toString();
    }
}
