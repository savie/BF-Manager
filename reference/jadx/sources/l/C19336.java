package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19336 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f62450;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3476 f62451;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f62452;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10385 f62453;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f62454;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336(C10385 c10385, C24975 c24975, int i, InterfaceC3476 interfaceC3476) {
        super(c24975, i);
        this.f62453 = c10385;
        this.f62451 = interfaceC3476;
        this.f62452 = -1;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2989(C8565 c8565) {
        C17515 c17515;
        int i;
        do {
            int i2 = this.f62450 + 1;
            this.f62450 = i2;
            C10385 c10385 = this.f62453;
            C22737 c22737 = c10385.f33021;
            if (i2 > c22737.f73783) {
                c22737.f73780 = c8565.m23001();
                m14148();
                return null;
            }
            Iterator it = c10385.f33019;
            c17515 = new C17515(c22737.f73785, c8565, c22737, this.f62454, this.f62451, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c17515.f56940;
            this.f62454 = i;
            if (!c10385.f33020) {
                break;
            }
        } while (this.f62452 == i);
        this.f62452 = i;
        return c17515;
    }
}
