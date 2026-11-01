package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ܳᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14704 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Uri f48029;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f48030;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6236 f48031;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f48032;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f48033;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f48034;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f48035;

    public C14704(Uri uri, String str, C6236 c6236, List list, AbstractC22433 abstractC22433, Object obj, long j) {
        this.f48029 = uri;
        this.f48033 = C6632.m17989(str);
        this.f48031 = c6236;
        this.f48030 = list;
        this.f48032 = abstractC22433;
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        for (int i2 = 0; i2 < abstractC22433.size(); i2++) {
            C4515 c4515 = (C4515) abstractC22433.get(i2);
            c4515.getClass();
            c4793.m52163(new C9765(new C3413(c4515)));
        }
        c4793.m13309();
        this.f48035 = obj;
        this.f48034 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14704)) {
            return false;
        }
        C14704 c14704 = (C14704) obj;
        return this.f48029.equals(c14704.f48029) && C13638.equals(this.f48033, c14704.f48033) && C13638.equals(this.f48031, c14704.f48031) && this.f48030.equals(c14704.f48030) && this.f48032.equals(c14704.f48032) && C13638.equals(this.f48035, c14704.f48035) && this.f48034 == c14704.f48034;
    }

    public final int hashCode() {
        int iHashCode = this.f48029.hashCode() * 31;
        String str = this.f48033;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C6236 c6236 = this.f48031;
        int iHashCode3 = (this.f48032.hashCode() + ((this.f48030.hashCode() + ((iHashCode2 + (c6236 == null ? 0 : c6236.hashCode())) * 961)) * 961)) * 31;
        Object obj = this.f48035;
        return (int) ((((long) (iHashCode3 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f48034);
    }

    static {
        C9023.m23358(0, 1, 2, 3, 4);
        C17983.m41806(5);
        C17983.m41806(6);
        C17983.m41806(7);
    }
}
