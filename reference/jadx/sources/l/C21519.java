package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C21519 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri f69913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f69914;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15620 f69915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16325 f69916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18697 f69917;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f69918;

    public C21519(Uri uri, long j, C16325 c16325, long j2, C18697 c18697, C15620 c15620) {
        this.f69913 = uri;
        this.f69918 = j;
        this.f69916 = c16325;
        this.f69914 = j2;
        this.f69917 = c18697;
        this.f69915 = c15620;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21519)) {
            return false;
        }
        C21519 c21519 = (C21519) obj;
        return this.f69918 == c21519.f69918 && this.f69914 == c21519.f69914 && C13638.equals(this.f69913, c21519.f69913) && C13638.equals(this.f69916, c21519.f69916) && C13638.equals(this.f69917, c21519.f69917) && C13638.equals(this.f69915, c21519.f69915);
    }

    public final int hashCode() {
        long j = this.f69918;
        long j2 = this.f69914;
        return C13638.hashCode(this.f69915) + ((C13638.hashCode(this.f69917) + ((C13638.hashCode(this.f69916) + ((C13638.hashCode(this.f69913) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f69913, Long.valueOf(this.f69918), this.f69916, Long.valueOf(this.f69914), this.f69917, this.f69915};
        String[] strArrSplit = "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".length() == 0 ? new String[0] : "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C21519.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri m48239() {
        return this.f69913;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48240() {
        return this.f69914;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16325 m48241() {
        return this.f69916;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m48242() {
        return this.f69918;
    }
}
