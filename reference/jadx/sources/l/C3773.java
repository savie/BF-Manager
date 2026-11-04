package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3773 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12942;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f12943;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12944;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f12945;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12946;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12947;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3773 m12244(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        int i3;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i4 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        C1896.m6517("Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        C22313.m50377("Invalid bitrate header: ", str4);
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
            i = i3;
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        C1896.m6517("Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        C22313.m50377("Invalid metadata interval: ", str5);
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z) {
            return new C3773(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public C3773(int i, String str, String str2, String str3, boolean z, int i2) {
        C20782.m47565(i2 == -1 || i2 > 0);
        this.f12942 = i;
        this.f12946 = str;
        this.f12945 = str2;
        this.f12944 = str3;
        this.f12943 = z;
        this.f12947 = i2;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12246(C18632 c18632) {
        String str = this.f12945;
        if (str != null) {
            c18632.m43374(str);
        }
        String str2 = this.f12946;
        if (str2 != null) {
            c18632.m43380(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3773.class == obj.getClass()) {
            C3773 c3773 = (C3773) obj;
            if (this.f12942 == c3773.f12942 && C17359.equals(this.f12946, c3773.f12946) && C17359.equals(this.f12945, c3773.f12945) && C17359.equals(this.f12944, c3773.f12944) && this.f12943 == c3773.f12943 && this.f12947 == c3773.f12947) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f12942 + 527) * 31;
        String str = this.f12946;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12945;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12944;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12943 ? 1 : 0)) * 31) + this.f12947;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f12945 + "\", genre=\"" + this.f12946 + "\", bitrate=" + this.f12942 + ", metadataInterval=" + this.f12947;
    }
}
