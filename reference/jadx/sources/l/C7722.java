package l;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7722 implements InterfaceC16894 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f25540;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f25541;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f25542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25543;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f25544;

    public C7722(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        this.f25541 = str;
        this.f25544 = i;
        this.f25543 = i2;
        this.f25540 = i3;
        this.f25542 = str2;
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            map.putAll(headerFields);
        }
    }

    @Override // l.InterfaceC16894
    public final String a() {
        return this.f25541;
    }

    @Override // l.InterfaceC16894
    public final int b() {
        return this.f25544;
    }

    @Override // l.InterfaceC16894
    public final int c() {
        return this.f25543;
    }

    @Override // l.InterfaceC16894
    public final int d() {
        return this.f25540;
    }

    public final String toString() {
        return "c@" + hashCode() + "\ncontent = [" + this.f25541 + "]\nresponseSize = " + this.f25544 + "\nrequestSize = " + this.f25543 + "\nresultCode = " + this.f25540 + "\nerrorMsg = " + this.f25542;
    }
}
