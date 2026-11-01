package l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22719 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f74010;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21307 f74011;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f74012;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10912 f74013;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C13734 f74014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14440 f74015;

    public C22719(C6490 c6490) {
        Map mapUnmodifiableMap;
        this.f74015 = c6490.f21886;
        this.f74010 = c6490.f21887;
        C5972 c5972 = c6490.f21888;
        c5972.getClass();
        this.f74013 = new C10912(c5972);
        this.f74011 = c6490.f21885;
        Map map = c6490.f21884;
        byte[] bArr = C0140.f1168;
        if (map.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C0561.unmodifiableMap(new LinkedHashMap(map));
        }
        this.f74012 = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14440 m50355() {
        return this.f74015;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m50359() {
        return this.f74010;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10912 m50360() {
        return this.f74013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50357(String str) {
        return this.f74013.m27345(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21307 m50358() {
        return this.f74011;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6490 m50362() {
        C6490 c6490 = new C6490();
        Map linkedHashMap = Collections.EMPTY_MAP;
        c6490.f21884 = linkedHashMap;
        c6490.f21886 = this.f74015;
        c6490.f21887 = this.f74010;
        c6490.f21885 = this.f74011;
        Map map = this.f74012;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        c6490.f21884 = linkedHashMap;
        c6490.f21888 = this.f74013.m27346();
        return c6490;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13734 m50361() {
        C13734 c13734 = this.f74014;
        if (c13734 != null) {
            return c13734;
        }
        C13734 c13734M33476 = C13734.m33476(this.f74013);
        this.f74014 = c13734M33476;
        return c13734M33476;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m50356() {
        return this.f74015.m34734();
    }

    public final String toString() {
        return "Request{method=" + this.f74010 + ", url=" + this.f74015 + ", tags=" + this.f74012 + '}';
    }
}
