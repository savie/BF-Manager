package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes.dex */
public final class C25368 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81904 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f81905;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f81906;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Uri f81907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f81908;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f81909;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f81910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f81911;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f81912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f81913;

    public /* synthetic */ C25368(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, int i3) {
        this(uri, j, i, bArr, map, j2, j3, str, i2);
    }

    static {
        C21616.m49139("media3.datasource");
    }

    public C25368(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        C20782.m47565(j + j2 >= 0);
        C20782.m47565(j2 >= 0);
        C20782.m47565(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f81907 = uri;
        this.f81905 = j;
        this.f81908 = i;
        this.f81912 = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f81913 = C4681.unmodifiableMap(new HashMap(map));
        this.f81909 = j2;
        this.f81910 = j3;
        this.f81911 = str;
        this.f81906 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11941 m56734() {
        return new C11941(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25368 m56735(long j, long j2) {
        if (j == 0 && this.f81910 == j2) {
            return this;
        }
        return new C25368(this.f81907, this.f81905, this.f81908, this.f81912, this.f81913, this.f81909 + j, j2, this.f81911, this.f81906);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f81908;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f81907);
        sb.append(", ");
        sb.append(this.f81909);
        sb.append(", ");
        sb.append(this.f81910);
        sb.append(", ");
        sb.append(this.f81911);
        sb.append(", ");
        return C12669.m31437(this.f81906, "]", sb);
    }
}
