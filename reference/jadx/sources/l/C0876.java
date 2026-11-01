package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876 implements InterfaceC12976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f3566;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0876 m3509(AbstractC22044 abstractC22044) {
        C0876 c0876 = abstractC22044.f71448;
        return c0876 != null ? c0876 : new C0876(abstractC22044);
    }

    public C0876(AbstractC22044 abstractC22044) {
        C9779.m24889(abstractC22044, "output");
        this.f3566 = abstractC22044;
        abstractC22044.f71448 = this;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m3511(int i, int i2) {
        this.f3566.mo14234(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3539(int i, long j) {
        this.f3566.mo14253(i, j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3533(int i, long j) {
        this.f3566.mo14236(i, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3515(float f, int i) {
        AbstractC22044 abstractC22044 = this.f3566;
        abstractC22044.getClass();
        abstractC22044.mo14234(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3517(int i, double d) {
        AbstractC22044 abstractC22044 = this.f3566;
        abstractC22044.getClass();
        abstractC22044.mo14236(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3518(int i, int i2) {
        this.f3566.mo14252(i, i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3529(int i, long j) {
        this.f3566.mo14253(i, j);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3532(int i, int i2) {
        this.f3566.mo14252(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3519(int i, long j) {
        this.f3566.mo14236(i, j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3538(int i, int i2) {
        this.f3566.mo14234(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3526(int i, boolean z) {
        this.f3566.mo14240(i, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3522(int i, String str) {
        this.f3566.mo14237(i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3525(int i, AbstractC23725 abstractC23725) {
        this.f3566.mo14239(i, abstractC23725);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m3547(int i, int i2) {
        this.f3566.mo14231(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3540(int i, Object obj) {
        this.f3566.mo14254(i, (InterfaceC23206) obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3541(int i, Object obj, InterfaceC6667 interfaceC6667) {
        this.f3566.mo14238(i, (InterfaceC23206) obj, interfaceC6667);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3520(int i, Object obj) {
        this.f3566.m48975(i, (InterfaceC23206) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3521(int i, Object obj, InterfaceC6667 interfaceC6667) {
        AbstractC22044 abstractC22044 = this.f3566;
        abstractC22044.mo14249(i, 3);
        interfaceC6667.mo18057(obj, (InterfaceC12976) abstractC22044.f71448);
        abstractC22044.mo14249(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3537(int i) {
        this.f3566.mo14249(i, 3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3516(int i) {
        this.f3566.mo14249(i, 4);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3534(int i, Object obj) {
        boolean z = obj instanceof AbstractC23725;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14255(i, (AbstractC23725) obj);
        } else {
            abstractC22044.mo14250(i, (InterfaceC23206) obj);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m3510(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48969 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM48969 += AbstractC22044.m48969(((Integer) list.get(i3)).intValue());
            }
            abstractC22044.mo14248(iM48969);
            while (i2 < list.size()) {
                abstractC22044.mo14251(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14252(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m3513(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 4;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14233(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14234(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m3536(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48969 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM48969 += AbstractC22044.m48969(((Long) list.get(i3)).longValue());
            }
            abstractC22044.mo14248(iM48969);
            while (i2 < list.size()) {
                abstractC22044.mo14256(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14253(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3528(int i, int i2) {
        this.f3566.mo14231(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3545(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48969 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM48969 += AbstractC22044.m48969(((Long) list.get(i3)).longValue());
            }
            abstractC22044.mo14248(iM48969);
            while (i2 < list.size()) {
                abstractC22044.mo14256(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14253(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m3512(int i, long j) {
        this.f3566.mo14253(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3530(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 8;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14242(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14236(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m3548(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 4;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14233(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            float fFloatValue = ((Float) list.get(i2)).floatValue();
            abstractC22044.getClass();
            abstractC22044.mo14234(i, Float.floatToRawIntBits(fFloatValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3543(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 8;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14242(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            double dDoubleValue = ((Double) list.get(i2)).doubleValue();
            abstractC22044.getClass();
            abstractC22044.mo14236(i, Double.doubleToRawLongBits(dDoubleValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3535(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48969 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM48969 += AbstractC22044.m48969(((Integer) list.get(i3)).intValue());
            }
            abstractC22044.mo14248(iM48969);
            while (i2 < list.size()) {
                abstractC22044.mo14251(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14252(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3527(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3++;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14232(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14240(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3542(int i, List list) {
        boolean z = list instanceof InterfaceC17935;
        AbstractC22044 abstractC22044 = this.f3566;
        int i2 = 0;
        if (z) {
            InterfaceC17935 interfaceC17935 = (InterfaceC17935) list;
            while (i2 < list.size()) {
                Object objMo21384 = interfaceC17935.mo21384(i2);
                if (objMo21384 instanceof String) {
                    abstractC22044.mo14237(i, (String) objMo21384);
                } else {
                    abstractC22044.mo14239(i, (AbstractC23725) objMo21384);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14237(i, (String) list.get(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3523(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f3566.mo14239(i, (AbstractC23725) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3546(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48959 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM48959 += AbstractC22044.m48959(((Integer) list.get(i3)).intValue());
            }
            abstractC22044.mo14248(iM48959);
            while (i2 < list.size()) {
                abstractC22044.mo14248(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14231(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m3514(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 4;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14233(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14234(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m3531(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC22044.f71447;
                i3 += 8;
            }
            abstractC22044.mo14248(i3);
            while (i2 < list.size()) {
                abstractC22044.mo14242(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC22044.mo14236(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m3549(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48959 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                iM48959 += AbstractC22044.m48959((iIntValue >> 31) ^ (iIntValue << 1));
            }
            abstractC22044.mo14248(iM48959);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC22044.mo14248((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC22044.mo14231(i, (iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m3544(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC22044 abstractC22044 = this.f3566;
        if (z) {
            abstractC22044.mo14249(i, 2);
            int iM48969 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                iM48969 += AbstractC22044.m48969((jLongValue >> 63) ^ (jLongValue << 1));
            }
            abstractC22044.mo14248(iM48969);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC22044.mo14256((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC22044.mo14253(i, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3524(int i, Map map) {
        AbstractC22044 abstractC22044 = this.f3566;
        abstractC22044.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC22044.mo14249(i, 2);
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
