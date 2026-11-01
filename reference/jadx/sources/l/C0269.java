package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.֡۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes2.dex */
public final class C0269 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f1556;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f1557;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f1558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f1559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f1560;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Boolean f1561;

    public C0269(boolean z, String str, String str2, long j, String str3, Boolean bool) {
        this.f1558 = z;
        this.f1557 = str;
        this.f1559 = str2;
        this.f1556 = j;
        this.f1560 = str3;
        this.f1561 = bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0269 m1771(C1360 c1360) {
        Map map = c1360.f5708;
        String strM30488 = C12265.m30488("ETag", map);
        String strM30489 = C12265.m30488("Last-Modified", map);
        Uri uri = c1360.f5707;
        return new C0269(true, strM30488, strM30489, -1L, uri == null ? null : C12265.m30487(uri), null);
    }
}
