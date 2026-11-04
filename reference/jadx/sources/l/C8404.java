package l;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C8404 implements InterfaceC11144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f27522;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27523;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f27524;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27526;

    public C8404(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        this.f27522 = str;
        this.f27525 = i;
        this.f27523 = i2;
        this.f27526 = i3;
        this.f27524 = str2;
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            map.putAll(headerFields);
        }
    }

    @Override // l.InterfaceC11144
    public final String a() {
        return this.f27522;
    }

    @Override // l.InterfaceC11144
    public final int b() {
        return this.f27525;
    }

    @Override // l.InterfaceC11144
    public final int c() {
        return this.f27523;
    }

    @Override // l.InterfaceC11144
    public final int d() {
        return this.f27526;
    }

    public final String toString() {
        return "c@" + hashCode() + "\ncontent = [" + this.f27522 + "]\nresponseSize = " + this.f27525 + "\nrequestSize = " + this.f27523 + "\nresultCode = " + this.f27526 + "\nerrorMsg = " + this.f27524;
    }
}
