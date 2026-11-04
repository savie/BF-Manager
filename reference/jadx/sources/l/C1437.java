package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1437 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5038;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3476 f5039;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5040;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3476 f5041;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9639 f5042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5043;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437(C9639 c9639, C24975 c24975, int i, InterfaceC3476 interfaceC3476, InterfaceC3476 interfaceC3477) {
        super(c24975, i);
        this.f5042 = c9639;
        this.f5039 = interfaceC3476;
        this.f5041 = interfaceC3477;
        this.f5043 = -1;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2989(C8565 c8565) {
        C4091 c4091;
        int i;
        do {
            int i2 = this.f5038 + 1;
            this.f5038 = i2;
            C9639 c9639 = this.f5042;
            C22737 c22737 = c9639.f31160;
            if (i2 > c22737.f73776) {
                c22737.f73779 = c8565.m23001();
                m14148();
                return null;
            }
            Iterator it = c9639.f31161;
            c4091 = new C4091(c22737.f73785, c8565, c22737, this.f5040, this.f5039, this.f5041, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c4091.f13940;
            this.f5040 = i;
            if (!c9639.f31159) {
                break;
            }
        } while (this.f5043 == i);
        this.f5043 = i;
        return c4091;
    }
}
