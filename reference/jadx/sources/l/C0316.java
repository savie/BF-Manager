package l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.֡ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8HZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0316 implements InterfaceC18961 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16416 f1718;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f1719;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f1720;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f1721;

    public C0316(String str, boolean z, C16416 c16416) {
        C20782.m47565((z && TextUtils.isEmpty(str)) ? false : true);
        this.f1718 = c16416;
        this.f1720 = str;
        this.f1719 = z;
        this.f1721 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m1991(C6283 c6283) {
        return C17469.m40975(this.f1718.mo3996(), c6283.m17959() + "&signedRequest=" + C7116.m19481(c6283.m17958()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m1990(UUID uuid, C3299 c3299) throws C10010 {
        String str;
        String strM10892 = c3299.m10892();
        if (this.f1719 || TextUtils.isEmpty(strM10892)) {
            strM10892 = this.f1720;
        }
        String str2 = strM10892;
        if (TextUtils.isEmpty(str2)) {
            C11941 c11941 = new C11941();
            Uri uri = Uri.EMPTY;
            c11941.m29911(uri);
            throw new C10010(c11941.m29908(), uri, AbstractC17589.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C19158.f61987;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C19158.f61986.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f1721) {
            map.putAll(this.f1721);
        }
        return C17469.m40975(this.f1718.mo3996(), str2, c3299.m10891(), map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1989(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f1721) {
            this.f1721.put(str, str2);
        }
    }
}
