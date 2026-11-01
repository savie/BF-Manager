package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۫۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12257 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41008 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f41009;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map f41010;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f41011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41012;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f41013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f41014;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Uri f41015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f41016;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f41017;

    public /* synthetic */ C12257(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, int i3) {
        this(uri, j, i, bArr, map, j2, j3, str, i2);
    }

    static {
        C11572.m28868("media3.datasource");
    }

    public C12257(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        C2023.m6507(j + j2 >= 0);
        C2023.m6507(j2 >= 0);
        C2023.m6507(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f41015 = uri;
        this.f41011 = j;
        this.f41014 = i;
        this.f41016 = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f41010 = C0561.unmodifiableMap(new HashMap(map));
        this.f41009 = j2;
        this.f41017 = j3;
        this.f41013 = str;
        this.f41012 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16490 m30477() {
        return new C16490(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12257 m30476(long j, long j2) {
        if (j == 0 && this.f41017 == j2) {
            return this;
        }
        return new C12257(this.f41015, this.f41011, this.f41014, this.f41016, this.f41010, this.f41009 + j, j2, this.f41013, this.f41012);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f41014;
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
        sb.append(this.f41015);
        sb.append(", ");
        sb.append(this.f41009);
        sb.append(", ");
        sb.append(this.f41017);
        sb.append(", ");
        sb.append(this.f41013);
        sb.append(", ");
        return C12441.m30911(this.f41012, "]", sb);
    }
}
