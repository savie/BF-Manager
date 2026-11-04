package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10561 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f33550;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24907 f33551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f33552;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5515 f33553;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19512 f33554;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Uri f33555;

    public C10561(Uri uri, long j, C24907 c24907, long j2, C19512 c19512, C5515 c5515) {
        this.f33555 = uri;
        this.f33552 = j;
        this.f33551 = c24907;
        this.f33550 = j2;
        this.f33554 = c19512;
        this.f33553 = c5515;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10561)) {
            return false;
        }
        C10561 c10561 = (C10561) obj;
        return this.f33552 == c10561.f33552 && this.f33550 == c10561.f33550 && C17359.equals(this.f33555, c10561.f33555) && C17359.equals(this.f33551, c10561.f33551) && C17359.equals(this.f33554, c10561.f33554) && C17359.equals(this.f33553, c10561.f33553);
    }

    public final int hashCode() {
        long j = this.f33552;
        long j2 = this.f33550;
        return C17359.hashCode(this.f33553) + ((C17359.hashCode(this.f33554) + ((C17359.hashCode(this.f33551) + ((C17359.hashCode(this.f33555) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33555, Long.valueOf(this.f33552), this.f33551, Long.valueOf(this.f33550), this.f33554, this.f33553};
        String[] strArrSplit = "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".length() == 0 ? new String[0] : "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10561.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m27012() {
        return this.f33550;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Uri m27013() {
        return this.f33555;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m27014() {
        return this.f33552;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24907 m27015() {
        return this.f33551;
    }
}
