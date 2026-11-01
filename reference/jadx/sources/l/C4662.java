package l;

import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۙ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4662 extends AbstractC3956 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f16471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4662(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, EnumSet enumSet) {
        super(c0429, abstractC11242, enumC11368, enumSet);
        this.f16471 = c0429;
    }

    @Override // l.AbstractC3956
    /* JADX INFO: renamed from: ۙ */
    public final void mo5135(int i, AbstractC23903 abstractC23903) {
        C0429 c0429 = this.f16471;
        int i2 = c0429.f1990 + i;
        if (c0429.f1953 && !c0429.f1969) {
            char cM2248 = c0429.m2248();
            for (int i3 = 0; i3 < cM2248; i3++) {
                char cM2249 = c0429.m2248();
                c0429.m2248();
                char cM22410 = c0429.m2248();
                c0429.m2248();
                char cM22411 = c0429.m2248();
                if (cM2249 == 0) {
                    int[] iArr = c0429.f1974;
                    if (cM22411 >= iArr.length) {
                        c0429.f1974 = Arrays.copyOf(c0429.f1974, Math.max(cM22411 + 1, iArr.length + 8));
                    }
                    c0429.f1974[cM22411] = cM22410;
                }
            }
        }
        c0429.f1990 = i2;
    }
}
