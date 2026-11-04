package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16394 f66800;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f66801;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f66802;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f66803;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f66804;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f66805;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f66806;

    public C20870(Uri uri, String str, C16394 c16394, List list, AbstractC1928 abstractC1928, Object obj, long j) {
        this.f66802 = uri;
        this.f66801 = C9681.m25264(str);
        this.f66800 = c16394;
        this.f66806 = list;
        this.f66804 = abstractC1928;
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        for (int i2 = 0; i2 < abstractC1928.size(); i2++) {
            C4462 c4462 = (C4462) abstractC1928.get(i2);
            c4462.getClass();
            c22811.m19807(new C6700(new C24600(c4462)));
        }
        c22811.m51441();
        this.f66803 = obj;
        this.f66805 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20870)) {
            return false;
        }
        C20870 c20870 = (C20870) obj;
        return this.f66802.equals(c20870.f66802) && C17359.equals(this.f66801, c20870.f66801) && C17359.equals(this.f66800, c20870.f66800) && this.f66806.equals(c20870.f66806) && this.f66804.equals(c20870.f66804) && C17359.equals(this.f66803, c20870.f66803) && this.f66805 == c20870.f66805;
    }

    public final int hashCode() {
        int iHashCode = this.f66802.hashCode() * 31;
        String str = this.f66801;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C16394 c16394 = this.f66800;
        int iHashCode3 = (this.f66804.hashCode() + ((this.f66806.hashCode() + ((iHashCode2 + (c16394 == null ? 0 : c16394.hashCode())) * 961)) * 961)) * 31;
        Object obj = this.f66803;
        return (int) ((((long) (iHashCode3 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f66805);
    }

    static {
        C4794.m14773(0, 1, 2, 3, 4);
        C7116.m19499(5);
        C7116.m19499(6);
        C7116.m19499(7);
    }
}
