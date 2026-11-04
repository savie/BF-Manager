package l;

import java.util.List;

/* JADX INFO: renamed from: l.ᩴۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19721 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63468;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14763 f63469 = new C14763();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14540 f63470;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f63471;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f63472;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f63473;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6909 f63474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f63475;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63476;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45414(C24132 c24132, List list) {
        C6909 c6909;
        int i;
        int i2;
        return this.f63471 && this.f63472 == c24132.m54021() && this.f63468 == this.f63472.mo15344() && this.f63475 == list && this.f63470 == c24132.f78066 && (c6909 = this.f63474) == c24132.f78022.f43643 && c6909 != null && (i = this.f63473) >= 0 && i <= (i2 = this.f63476) && i2 < c6909.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45413(InterfaceC8966 interfaceC8966, boolean z, float[] fArr, int i) {
        int iMo20529 = interfaceC8966.mo20529(z);
        int iMo20530 = interfaceC8966.mo20530(z);
        int iM19167 = this.f63474.m19167(iMo20529);
        if (iM19167 != -1) {
            float fM16189 = this.f63470.m16189();
            int iM19185 = this.f63474.m19185(iM19167);
            if (iMo20529 == iMo20530) {
                float fM16210 = this.f63470.m16210() / 16.0f;
                float f = iM19185 * fM16189;
                fArr[i] = f - fM16210;
                fArr[i + 1] = f + fM16210;
                return true;
            }
            if (iMo20530 > iMo20529 + 1 && (iM19167 = this.f63474.m19167(iMo20530 - 1)) == -1) {
                return false;
            }
            int iM19179 = this.f63474.m19179(iM19167);
            fArr[i] = iM19185 * fM16189;
            fArr[i + 1] = (iM19179 + 1) * fM16189;
            return true;
        }
        if (iMo20529 != this.f63474.m19187().f45296 + 1) {
            return false;
        }
        float fM161810 = this.f63470.m16189();
        float fM16211 = this.f63470.m16210() / 16.0f;
        float size = this.f63474.size() * fM161810;
        fArr[i] = (size - fM16211) - fM16211;
        fArr[i + 1] = size;
        return true;
    }
}
