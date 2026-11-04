package l;

import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16173 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f52505;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16173(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f52505 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        C11172 c11172 = this.f52505;
        int i2 = c11172.f35199 + i;
        if (c11172.f35187 && !c11172.f35185) {
            char cM28138 = c11172.m28138();
            for (int i3 = 0; i3 < cM28138; i3++) {
                char cM28139 = c11172.m28138();
                c11172.m28138();
                char cM281310 = c11172.m28138();
                c11172.m28138();
                char cM281311 = c11172.m28138();
                if (cM28139 == 0) {
                    int[] iArr = c11172.f35186;
                    if (cM281311 >= iArr.length) {
                        c11172.f35186 = Arrays.copyOf(c11172.f35186, Math.max(cM281311 + 1, iArr.length + 8));
                    }
                    c11172.f35186[cM281311] = cM281310;
                }
            }
        }
        c11172.f35199 = i2;
    }
}
