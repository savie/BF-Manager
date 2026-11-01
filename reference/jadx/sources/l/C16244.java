package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܺ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16244 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4603 f52387;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f52388 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16949 f52389;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52390;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C16949 c16949 = this.f52389;
        boolean z = false;
        for (AbstractC16579 abstractC16579M52432 = c16949.f54225.m52432(c8753.f30086.f77449); !z && abstractC16579M52432.m39001(EnumC6617.CLASS); abstractC16579M52432 = c16949.f54225.m52432(abstractC16579M52432)) {
            C4603 c4603M24141 = c16949.f54233.m24141(abstractC16579M52432.f53222.mo44804());
            if (c4603M24141 != null && this.f52387 != c4603M24141) {
                if (this.f52388.add(c4603M24141)) {
                    boolean z2 = this.f52390;
                    try {
                        mo7248(c4603M24141.f16296);
                        this.f52390 = z2;
                    } catch (Throwable th) {
                        this.f52390 = z2;
                        throw th;
                    }
                }
                z = true;
            }
        }
        super.mo1065(c8753);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        this.f52390 = true;
        super.mo3959(c22489);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        this.f52390 = true;
        super.mo3929(c6966);
    }

    public C16244(C16949 c16949, C4603 c4603) {
        this.f52389 = c16949;
        this.f52387 = c4603;
    }
}
