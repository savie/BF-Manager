package l;

import android.util.Pair;

/* JADX INFO: renamed from: l.ᩴ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18979 extends AbstractC16511 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61434 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10273 f61435;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f61436;

    /* JADX INFO: renamed from: ֨ */
    public abstract AbstractC16511 mo24446(int i);

    /* JADX INFO: renamed from: ۖ */
    public abstract Object mo24447(int i);

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo24450(int i);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo24451(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo24452(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo24453(Object obj);

    /* JADX INFO: renamed from: ᩹ */
    public abstract int mo24454(int i);

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C20039 mo38826(Object obj, C20039 c20039) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo24453 = mo24453(obj2);
        int iMo24454 = mo24454(iMo24453);
        mo24446(iMo24453).mo38826(obj3, c20039);
        c20039.f64168 += iMo24454;
        c20039.f64174 = obj;
        return c20039;
    }

    public AbstractC18979(InterfaceC10273 interfaceC10273) {
        this.f61435 = interfaceC10273;
        this.f61436 = interfaceC10273.getLength();
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final int mo24006(int i, int i2, boolean z) {
        int iMo24451 = mo24451(i);
        int iMo24454 = mo24454(iMo24451);
        int iMo24006 = mo24446(iMo24451).mo24006(i - iMo24454, i2 == 2 ? 0 : i2, z);
        if (iMo24006 != -1) {
            return iMo24454 + iMo24006;
        }
        int iM43678 = m43678(iMo24451, z);
        while (iM43678 != -1 && mo24446(iM43678).m38828()) {
            iM43678 = m43678(iM43678, z);
        }
        if (iM43678 != -1) {
            return mo24446(iM43678).mo24007(z) + mo24454(iM43678);
        }
        if (i2 == 2) {
            return mo24007(z);
        }
        return -1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ܰ */
    public final int mo24008(int i, int i2, boolean z) {
        AbstractC18979 abstractC18979;
        int iMo23000;
        int iMo24451 = mo24451(i);
        int iMo24454 = mo24454(iMo24451);
        int iMo24008 = mo24446(iMo24451).mo24008(i - iMo24454, i2 == 2 ? 0 : i2, z);
        if (iMo24008 != -1) {
            return iMo24454 + iMo24008;
        }
        InterfaceC10273 interfaceC10273 = this.f61435;
        if (z) {
            iMo23000 = interfaceC10273.mo23000(iMo24451);
            abstractC18979 = this;
        } else if (iMo24451 > 0) {
            abstractC18979 = this;
            iMo23000 = iMo24451 - 1;
        } else {
            abstractC18979 = this;
            iMo23000 = -1;
        }
        while (iMo23000 != -1 && abstractC18979.mo24446(iMo23000).m38828()) {
            if (z) {
                iMo23000 = interfaceC10273.mo23000(iMo23000);
            } else if (iMo23000 > 0) {
                iMo23000--;
            } else {
                abstractC18979 = abstractC18979;
                iMo23000 = -1;
            }
        }
        if (iMo23000 != -1) {
            return abstractC18979.mo24446(iMo23000).mo24009(z) + abstractC18979.mo24454(iMo23000);
        }
        if (i2 == 2) {
            return abstractC18979.mo24009(z);
        }
        return -1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ܰ */
    public final int mo24009(boolean z) {
        int i = this.f61436;
        if (i != 0) {
            InterfaceC10273 interfaceC10273 = this.f61435;
            int iMo22996 = z ? interfaceC10273.mo22996() : i - 1;
            while (mo24446(iMo22996).m38828()) {
                if (z) {
                    iMo22996 = interfaceC10273.mo23000(iMo22996);
                } else {
                    iMo22996 = iMo22996 > 0 ? iMo22996 - 1 : -1;
                }
                if (iMo22996 == -1) {
                }
            }
            return mo24446(iMo22996).mo24009(z) + mo24454(iMo22996);
        }
        return -1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final int mo24007(boolean z) {
        if (this.f61436 != 0) {
            int iMo22998 = z ? this.f61435.mo22998() : 0;
            while (mo24446(iMo22998).m38828()) {
                iMo22998 = m43678(iMo22998, z);
                if (iMo22998 == -1) {
                }
            }
            return mo24446(iMo22998).mo24007(z) + mo24454(iMo22998);
        }
        return -1;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C0282 mo14810(int i, C0282 c0282, long j) {
        int iMo24451 = mo24451(i);
        int iMo24454 = mo24454(iMo24451);
        int iMo24450 = mo24450(iMo24451);
        mo24446(iMo24451).mo14810(i - iMo24454, c0282, j);
        Object objMo24447 = mo24447(iMo24451);
        if (!C0282.f1577.equals(c0282.f1591)) {
            objMo24447 = Pair.create(objMo24447, c0282.f1591);
        }
        c0282.f1591 = objMo24447;
        c0282.f1580 += iMo24450;
        c0282.f1587 += iMo24450;
        return c0282;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C20039 mo5920(int i, C20039 c20039, boolean z) {
        int iMo24452 = mo24452(i);
        int iMo24454 = mo24454(iMo24452);
        mo24446(iMo24452).mo5920(i - mo24450(iMo24452), c20039, z);
        c20039.f64168 += iMo24454;
        if (z) {
            Object objMo24447 = mo24447(iMo24452);
            Object obj = c20039.f64174;
            obj.getClass();
            c20039.f64174 = Pair.create(objMo24447, obj);
        }
        return c20039;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final int mo14959(Object obj) {
        int iMo14959;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo24453 = mo24453(obj2);
        if (iMo24453 == -1 || (iMo14959 = mo24446(iMo24453).mo14959(obj3)) == -1) {
            return -1;
        }
        return mo24450(iMo24453) + iMo14959;
    }

    @Override // l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14960(int i) {
        int iMo24452 = mo24452(i);
        return Pair.create(mo24447(iMo24452), mo24446(iMo24452).mo14960(i - mo24450(iMo24452)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43678(int i, boolean z) {
        if (z) {
            return this.f61435.mo22999(i);
        }
        if (i < this.f61436 - 1) {
            return i + 1;
        }
        return -1;
    }
}
