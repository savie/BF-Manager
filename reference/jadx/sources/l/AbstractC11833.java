package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ۨܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 855A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11833 implements Comparable {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo4462(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4463(C4651 c4651);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo4464(AbstractC11833 abstractC11833);

    /* JADX INFO: renamed from: ᩸ */
    public abstract EnumC18182 mo4465();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11833 m29516(C12063 c12063, C13825 c13825) {
        byte bM33645 = c13825.m33645();
        EnumC18182 enumC18182M42307 = EnumC18182.m42307((byte) (bM33645 & bo.j));
        byte b = (byte) ((bM33645 & 255) >> 5);
        switch (C13950.f45902[enumC18182M42307.ordinal()]) {
            case 1:
                return new C9241(c13825);
            case 2:
                return new C23122(c13825, b);
            case 3:
                return new C2889(c13825, b);
            case 4:
                return new C1248(c13825, b);
            case 5:
                return new C13244(c13825, b);
            case 6:
                return new C22416(c13825, b);
            case 7:
                return new C4776(c13825, b);
            case 8:
                return new C15361(c12063, c13825, b);
            case 9:
                return new C21710(c12063, c13825, b);
            case 10:
                return new C5482(c12063, c13825, b);
            case 11:
                return new C4070(c12063, c13825, b);
            case 12:
                return new C2659(c12063, c13825, b);
            case 13:
                return new C14180(c12063, c13825);
            case 14:
                return new C10652(c12063, c13825);
            case 15:
                return C6893.f23199;
            case 16:
                if (b == 0) {
                    return C1478.f6009;
                }
                if (b == 1) {
                    return C1478.f6008;
                }
                C1478 c1478 = C1478.f6008;
                throw new RuntimeException("valueArg must be either 0 or 1");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11833 m29515(C12063 c12063, AbstractC11833 abstractC11833) {
        int i = 0;
        C14655[] c14655Arr = null;
        switch (C13950.f45902[abstractC11833.mo4465().ordinal()]) {
            case 1:
                return new C9241(((C9241) abstractC11833).f31400);
            case 2:
                return new C23122(((C23122) abstractC11833).f75091);
            case 3:
                return new C2889(((C2889) abstractC11833).f10890);
            case 4:
                return new C1248(((C1248) abstractC11833).f5426);
            case 5:
                return new C13244(((C13244) abstractC11833).f44002);
            case 6:
                return new C22416(((C22416) abstractC11833).f73146);
            case 7:
                return new C4776(((C4776) abstractC11833).f16792);
            case 8:
                return new C15361(C14655.m35175(((C15361) abstractC11833).f50036.m35176(), c12063));
            case 9:
                return new C21710(C1953.m6312(((C21710) abstractC11833).f70398.m6314(), c12063));
            case 10:
                return new C5482(((C5482) abstractC11833).f18867.m43562(c12063));
            case 11:
                return new C4070(((C4070) abstractC11833).f14967.m45812(c12063));
            case 12:
                return new C2659(((C2659) abstractC11833).f10326.m43562(c12063));
            case 13:
                AbstractC11833[] abstractC11833Arr = ((C14180) abstractC11833).f75657;
                int length = abstractC11833Arr.length;
                AbstractC11833[] abstractC11833Arr2 = new AbstractC11833[length];
                while (i < length) {
                    abstractC11833Arr2[i] = m29515(c12063, abstractC11833Arr[i]);
                    i++;
                }
                return new C14180(abstractC11833Arr2);
            case 14:
                C10652 c10652 = (C10652) abstractC11833;
                C1953 c1953M6312 = C1953.m6312(c10652.f19460.m6314(), c12063);
                C14655[] c14655Arr2 = c10652.f19459;
                if (c14655Arr2 != null) {
                    int length2 = c14655Arr2.length;
                    C14655[] c14655Arr3 = new C14655[length2];
                    while (i < length2) {
                        c14655Arr3[i] = C14655.m35175(c14655Arr2[i].m35176(), c12063);
                        i++;
                    }
                    c14655Arr = c14655Arr3;
                }
                return new C10652(c1953M6312, c14655Arr, c10652.m15746(c12063));
            case 15:
                return C6893.f23199;
            case 16:
                if (((C1478) abstractC11833).f6010) {
                    return C1478.f6008;
                }
                return C1478.f6009;
            default:
                return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC11833 abstractC11833) {
        int iCompareTo = mo4465().compareTo(abstractC11833.mo4465());
        return iCompareTo == 0 ? mo4464(abstractC11833) : iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof AbstractC11833) && compareTo((AbstractC11833) obj) == 0;
    }
}
