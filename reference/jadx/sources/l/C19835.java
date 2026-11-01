package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩶֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19835 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f63656;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19835(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f63656 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C0429 c0429 = this.f63656;
        int i2 = c0429.f1990 + i;
        if (c0429.f1953) {
            c0429.f1969 = true;
            int iM2232 = c0429.m2232();
            c0429.f1974 = new int[iM2232];
            c0429.f1950 = new int[iM2232];
            c0429.getClass();
            int i3 = 0;
            for (int i4 = 0; i4 < iM2232; i4++) {
                char cM2248 = c0429.m2248();
                char cM2249 = c0429.m2248();
                if ((36864 & cM2249) == 0) {
                    c0429.f1974[i3] = cM2248;
                    c0429.f1950[i3] = cM2249;
                    i3++;
                }
            }
        }
        c0429.f1990 = i2;
    }
}
