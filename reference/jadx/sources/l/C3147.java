package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۗۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 173H */
/* JADX INFO: loaded from: classes2.dex */
public class C3147 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f10205;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f10206;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f10207;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f10208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f10209;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f10210;

    public C3147(String str, long j, long j2, long j3, File file) {
        this.f10208 = str;
        this.f10209 = j;
        this.f10206 = j2;
        this.f10210 = file != null;
        this.f10207 = file;
        this.f10205 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3147 c3147) {
        String str = c3147.f10208;
        String str2 = this.f10208;
        if (!str2.equals(str)) {
            return str2.compareTo(c3147.f10208);
        }
        long j = this.f10209 - c3147.f10209;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f10209);
        sb.append(", ");
        return C2764.m9137(sb, this.f10206, "]");
    }
}
