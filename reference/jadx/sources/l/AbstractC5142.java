package l;

import android.util.Pair;

/* JADX INFO: renamed from: l.ۙ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5142 extends AbstractC24755 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17910 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19764 f17911;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17912;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract int mo15536(int i);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC24755 mo15537(int i);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract int mo15538(int i);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract int mo15539(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo15540(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo15542(Object obj);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract Object mo15544(int i);

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1634 mo15535(Object obj, C1634 c1634) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo15542 = mo15542(obj2);
        int iMo15538 = mo15538(iMo15542);
        mo15537(iMo15542).mo15535(obj3, c1634);
        c1634.f5657 += iMo15538;
        c1634.f5658 = obj;
        return c1634;
    }

    public AbstractC5142(InterfaceC19764 interfaceC19764) {
        this.f17911 = interfaceC19764;
        this.f17912 = interfaceC19764.getLength();
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15533(int i, int i2, boolean z) {
        int iMo15536 = mo15536(i);
        int iMo15538 = mo15538(iMo15536);
        int iMo15533 = mo15537(iMo15536).mo15533(i - iMo15538, i2 == 2 ? 0 : i2, z);
        if (iMo15533 != -1) {
            return iMo15538 + iMo15533;
        }
        int iM15532 = m15532(iMo15536, z);
        while (iM15532 != -1 && mo15537(iM15532).m55264()) {
            iM15532 = m15532(iM15532, z);
        }
        if (iM15532 != -1) {
            return mo15537(iM15532).mo15534(z) + mo15538(iM15532);
        }
        if (i2 == 2) {
            return mo15534(z);
        }
        return -1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo15541(int i, int i2, boolean z) {
        AbstractC5142 abstractC5142;
        int iMo45525;
        int iMo15536 = mo15536(i);
        int iMo15538 = mo15538(iMo15536);
        int iMo15541 = mo15537(iMo15536).mo15541(i - iMo15538, i2 == 2 ? 0 : i2, z);
        if (iMo15541 != -1) {
            return iMo15538 + iMo15541;
        }
        InterfaceC19764 interfaceC19764 = this.f17911;
        if (z) {
            iMo45525 = interfaceC19764.mo45525(iMo15536);
            abstractC5142 = this;
        } else if (iMo15536 > 0) {
            abstractC5142 = this;
            iMo45525 = iMo15536 - 1;
        } else {
            abstractC5142 = this;
            iMo45525 = -1;
        }
        while (iMo45525 != -1 && abstractC5142.mo15537(iMo45525).m55264()) {
            if (z) {
                iMo45525 = interfaceC19764.mo45525(iMo45525);
            } else if (iMo45525 > 0) {
                iMo45525--;
            } else {
                abstractC5142 = abstractC5142;
                iMo45525 = -1;
            }
        }
        if (iMo45525 != -1) {
            return abstractC5142.mo15537(iMo45525).mo15543(z) + abstractC5142.mo15538(iMo45525);
        }
        if (i2 == 2) {
            return abstractC5142.mo15543(z);
        }
        return -1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo15543(boolean z) {
        int i = this.f17912;
        if (i != 0) {
            InterfaceC19764 interfaceC19764 = this.f17911;
            int iMo45521 = z ? interfaceC19764.mo45521() : i - 1;
            while (mo15537(iMo45521).m55264()) {
                if (z) {
                    iMo45521 = interfaceC19764.mo45525(iMo45521);
                } else {
                    iMo45521 = iMo45521 > 0 ? iMo45521 - 1 : -1;
                }
                if (iMo45521 == -1) {
                }
            }
            return mo15537(iMo45521).mo15543(z) + mo15538(iMo45521);
        }
        return -1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo15534(boolean z) {
        if (this.f17912 != 0) {
            int iMo45523 = z ? this.f17911.mo45523() : 0;
            while (mo15537(iMo45523).m55264()) {
                iMo45523 = m15532(iMo45523, z);
                if (iMo45523 == -1) {
                }
            }
            return mo15537(iMo45523).mo15534(z) + mo15538(iMo45523);
        }
        return -1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C11328 mo1592(int i, C11328 c11328, long j) {
        int iMo15536 = mo15536(i);
        int iMo15538 = mo15538(iMo15536);
        int iMo15539 = mo15539(iMo15536);
        mo15537(iMo15536).mo1592(i - iMo15538, c11328, j);
        Object objMo15544 = mo15544(iMo15536);
        if (!C11328.f35682.equals(c11328.f35698)) {
            objMo15544 = Pair.create(objMo15544, c11328.f35698);
        }
        c11328.f35698 = objMo15544;
        c11328.f35697 += iMo15539;
        c11328.f35687 += iMo15539;
        return c11328;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C1634 mo1591(int i, C1634 c1634, boolean z) {
        int iMo15540 = mo15540(i);
        int iMo15538 = mo15538(iMo15540);
        mo15537(iMo15540).mo1591(i - mo15539(iMo15540), c1634, z);
        c1634.f5657 += iMo15538;
        if (z) {
            Object objMo15544 = mo15544(iMo15540);
            Object obj = c1634.f5658;
            obj.getClass();
            c1634.f5658 = Pair.create(objMo15544, obj);
        }
        return c1634;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final int mo1588(Object obj) {
        int iMo1588;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo15542 = mo15542(obj2);
        if (iMo15542 == -1 || (iMo1588 = mo15537(iMo15542).mo1588(obj3)) == -1) {
            return -1;
        }
        return mo15539(iMo15542) + iMo1588;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1589(int i) {
        int iMo15540 = mo15540(i);
        return Pair.create(mo15544(iMo15540), mo15537(iMo15540).mo1589(i - mo15539(iMo15540)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15532(int i, boolean z) {
        if (z) {
            return this.f17911.mo45524(i);
        }
        if (i < this.f17912 - 1) {
            return i + 1;
        }
        return -1;
    }
}
