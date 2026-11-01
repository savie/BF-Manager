package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4476 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f15924;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f15925;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15926;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4476(C22116 c22116, AbstractC16579 abstractC16579, int i) {
        super(c22116, C10039.m25336(abstractC16579));
        this.f15924 = c22116;
        C6171.m17176(i >= 0);
        this.f15925 = abstractC16579;
        this.f15926 = i;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        int i = this.f11189;
        C22116 c22116 = this.f15924;
        int i2 = this.f15926;
        if (i2 <= 3) {
            c22116.f71608.m25378((C10039.m25348(i) * 4) + 26 + i2);
        } else {
            c22116.f71608.m25363(C10039.m25348(i) + 21, i2);
        }
        return c22116.f71611[i];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ᩹ */
    public final void mo8879() {
        int i = this.f11189;
        C22116 c22116 = this.f15924;
        int i2 = this.f15926;
        if (i2 <= 3) {
            c22116.f71608.m25378((C10039.m25348(i) * 4) + 59 + i2);
        } else {
            c22116.f71608.m25363(C10039.m25348(i) + 54, i2);
        }
        c22116.f71608.m25352(i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12497(int i) {
        C22116 c22116 = this.f15924;
        int i2 = this.f11189;
        if (i2 == 0 && i >= -32768 && i <= 32767) {
            c22116.f71608.m25385(this.f15926, i);
            return;
        }
        mo5374();
        if (i >= 0) {
            new C1571(c22116, c22116.f71607.f14232, Integer.valueOf(i)).mo5374();
            c22116.f71608.m25378(96);
        } else {
            new C1571(c22116, c22116.f71607.f14232, Integer.valueOf(-i)).mo5374();
            c22116.f71608.m25378(100);
        }
        c22116.m49070(c22116.f71607.f14232).mo5375(i2);
        mo8879();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("localItem(type=");
        sb.append(this.f15925);
        sb.append("; reg=");
        return C12441.m30911(this.f15926, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
