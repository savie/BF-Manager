package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2928 extends AbstractC15343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9589;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f9590;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8894 f9591;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9592;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928(C8894 c8894, C24975 c24975, int i) {
        super(c24975, i);
        this.f9591 = c8894;
        this.f9592 = -1;
    }

    @Override // l.AbstractC15343
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2989(C8565 c8565) {
        C4091 c4091;
        int i;
        C8894 c8894 = this.f9591;
        C22737 c22737 = c8894.f29067;
        do {
            int i2 = this.f9589 + 1;
            this.f9589 = i2;
            if (i2 > c22737.f73781) {
                m14148();
                return null;
            }
            Iterator it = c8894.f29064;
            c4091 = new C4091(c22737.f73785, c8565, c22737, this.f9590, c8894.f29066, c8894.f29069, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c4091.f13940;
            this.f9590 = i;
            if (!c8894.f29068) {
                break;
            }
        } while (this.f9592 == i);
        this.f9592 = i;
        return c4091;
    }
}
