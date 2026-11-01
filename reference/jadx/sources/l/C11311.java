package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8NR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11311 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f38169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38170;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f38171;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f38172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38173;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f38174;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11311 m28311(Map map) {
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
                        C0303.m1848("Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        C16523.m38891("Invalid bitrate header: ", str4);
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
                        C0303.m1848("Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        C16523.m38891("Invalid metadata interval: ", str5);
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
            return new C11311(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public C11311(int i, String str, String str2, String str3, boolean z, int i2) {
        C2023.m6507(i2 == -1 || i2 > 0);
        this.f38170 = i;
        this.f38173 = str;
        this.f38171 = str2;
        this.f38174 = str3;
        this.f38172 = z;
        this.f38169 = i2;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        String str = this.f38171;
        if (str != null) {
            c2398.m7319(str);
        }
        String str2 = this.f38173;
        if (str2 != null) {
            c2398.m7302(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11311.class == obj.getClass()) {
            C11311 c11311 = (C11311) obj;
            if (this.f38170 == c11311.f38170 && C13638.equals(this.f38173, c11311.f38173) && C13638.equals(this.f38171, c11311.f38171) && C13638.equals(this.f38174, c11311.f38174) && this.f38172 == c11311.f38172 && this.f38169 == c11311.f38169) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f38170 + 527) * 31;
        String str = this.f38173;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f38171;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f38174;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f38172 ? 1 : 0)) * 31) + this.f38169;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f38171 + "\", genre=\"" + this.f38173 + "\", bitrate=" + this.f38170 + ", metadataInterval=" + this.f38169;
    }
}
