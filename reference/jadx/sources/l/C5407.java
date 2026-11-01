package l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۚܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8HZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5407 implements InterfaceC1173 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f18669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10846 f18670;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f18671;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f18672;

    public C5407(String str, boolean z, C10846 c10846) {
        C2023.m6507((z && TextUtils.isEmpty(str)) ? false : true);
        this.f18670 = c10846;
        this.f18672 = str;
        this.f18671 = z;
        this.f18669 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m14978(C9912 c9912) {
        return C17672.m41149(this.f18670.mo4000(), c9912.m25113() + "&signedRequest=" + C17983.m41834(c9912.m25112()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m14977(UUID uuid, C24023 c24023) throws C13169 {
        String str;
        String strM52863 = c24023.m52863();
        if (this.f18671 || TextUtils.isEmpty(strM52863)) {
            strM52863 = this.f18672;
        }
        String str2 = strM52863;
        if (TextUtils.isEmpty(str2)) {
            C16490 c16490 = new C16490();
            Uri uri = Uri.EMPTY;
            c16490.m38756(uri);
            throw new C13169(c16490.m38753(), uri, AbstractC6910.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C1297.f5563;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C1297.f5561.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f18669) {
            map.putAll(this.f18669);
        }
        return C17672.m41149(this.f18670.mo4000(), str2, c24023.m52862(), map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14976(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f18669) {
            this.f18669.put(str, str2);
        }
    }
}
