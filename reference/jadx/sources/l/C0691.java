package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0691 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2589;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3476 f2590;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f2591;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1239 f2592;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8149 f2593;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2594;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691(C8149 c8149, C24975 c24975, int i, AbstractC1239 abstractC1239, InterfaceC3476 interfaceC3476) {
        super(c24975, i);
        this.f2593 = c8149;
        this.f2592 = abstractC1239;
        this.f2590 = interfaceC3476;
        this.f2591 = -1;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2989(C8565 c8565) {
        C17515 c17515;
        int i;
        do {
            int i2 = this.f2589 + 1;
            this.f2589 = i2;
            C8149 c8149 = this.f2593;
            C22737 c22737 = c8149.f26902;
            if (i2 > c22737.f73782) {
                c22737.f73777 = c8565.m23001();
                m14148();
                return null;
            }
            Iterator it = c8149.f26903;
            c17515 = new C17515(c22737.f73785, c8565, c22737, this.f2594, this.f2592, this.f2590, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c17515.f56940;
            this.f2594 = i;
            if (!c8149.f26900) {
                break;
            }
        } while (this.f2591 == i);
        this.f2591 = i;
        return c17515;
    }
}
