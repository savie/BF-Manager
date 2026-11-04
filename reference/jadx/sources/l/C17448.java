package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes4.dex */
public final class C17448 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56747;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f56748;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Boolean f56749;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f56750;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f56751;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f56752;

    public C17448(boolean z, String str, String str2, long j, String str3, Boolean bool) {
        this.f56750 = z;
        this.f56747 = str;
        this.f56748 = str2;
        this.f56752 = j;
        this.f56751 = str3;
        this.f56749 = bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17448 m40947(C8213 c8213) {
        Map map = c8213.f27041;
        String strM52618 = C23416.m52618("ETag", map);
        String strM52619 = C23416.m52618("Last-Modified", map);
        Uri uri = c8213.f27042;
        return new C17448(true, strM52618, strM52619, -1L, uri == null ? null : C23416.m52617(uri), null);
    }
}
