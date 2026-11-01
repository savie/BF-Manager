package l;

import java.io.File;

/* JADX INFO: renamed from: l.֫᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 173H */
/* JADX INFO: loaded from: classes2.dex */
public class C2065 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f7656;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f7657;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final File f7658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f7659;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f7660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f7661;

    public C2065(String str, long j, long j2, long j3, File file) {
        this.f7656 = str;
        this.f7660 = j;
        this.f7657 = j2;
        this.f7661 = file != null;
        this.f7658 = file;
        this.f7659 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2065 c2065) {
        String str = c2065.f7656;
        String str2 = this.f7656;
        if (!str2.equals(str)) {
            return str2.compareTo(c2065.f7656);
        }
        long j = this.f7660 - c2065.f7660;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f7660);
        sb.append(", ");
        return C15037.m36023(sb, this.f7657, "]");
    }
}
