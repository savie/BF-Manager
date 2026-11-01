package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5863 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f20009;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f20010;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f20011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15070 f20012 = new C15070();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3662 f20013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20014;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1590 f20015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f20016;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20017;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16073(C6111 c6111, List list) {
        C3662 c3662;
        int i;
        int i2;
        return this.f20014 && this.f20009 == c6111.m17000() && this.f20011 == this.f20009.mo2395() && this.f20016 == list && this.f20015 == c6111.f20794 && (c3662 = this.f20013) == c6111.f20764.f41308 && c3662 != null && (i = this.f20017) >= 0 && i <= (i2 = this.f20010) && i2 < c3662.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16074(InterfaceC19759 interfaceC19759, boolean z, float[] fArr, int i) {
        int iMo23603 = interfaceC19759.mo23603(z);
        int iMo23592 = interfaceC19759.mo23592(z);
        int iM10804 = this.f20013.m10804(iMo23603);
        if (iM10804 != -1) {
            float fM17870 = this.f20015.m17870();
            int iM10801 = this.f20013.m10801(iM10804);
            if (iMo23603 == iMo23592) {
                float fM17880 = this.f20015.m17880() / 16.0f;
                float f = iM10801 * fM17870;
                fArr[i] = f - fM17880;
                fArr[i + 1] = f + fM17880;
                return true;
            }
            if (iMo23592 > iMo23603 + 1 && (iM10804 = this.f20013.m10804(iMo23592 - 1)) == -1) {
                return false;
            }
            int iM10812 = this.f20013.m10812(iM10804);
            fArr[i] = iM10801 * fM17870;
            fArr[i + 1] = (iM10812 + 1) * fM17870;
            return true;
        }
        if (iMo23603 != this.f20013.m10803().f47319 + 1) {
            return false;
        }
        float fM17871 = this.f20015.m17870();
        float fM17881 = this.f20015.m17880() / 16.0f;
        float size = this.f20013.size() * fM17871;
        fArr[i] = (size - fM17881) - fM17881;
        fArr[i + 1] = size;
        return true;
    }
}
