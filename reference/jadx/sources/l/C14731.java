package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14731 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C21825 f48152 = C21825.of((Object) null);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C21825 f48153 = C21825.of((Object) null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f48154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f48155 = f48152;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21825 f48156 = C21825.m48588();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21825 f48157 = C21825.m48588();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 f48158 = C21825.m48588();

    public C14731(AbstractC23903 abstractC23903) {
        this.f48154 = abstractC23903;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 m35289() {
        C21825 c21825 = this.f48155;
        return (c21825 == f48153 || c21825 == f48152) ? C21825.m48588() : c21825;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 m35277() {
        return this.f48156;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21825 m35285() {
        return this.f48157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m35279() {
        return this.f48158;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35291(C21825 c21825) {
        C6171.m17176(m35276() || this.f48155 == f48152);
        c21825.getClass();
        this.f48155 = c21825;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m35288(C21825 c21825) {
        c21825.getClass();
        this.f48156 = c21825;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m35275(C21825 c21825) {
        c21825.getClass();
        this.f48157 = c21825;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35283(C21825 c21825) {
        c21825.getClass();
        this.f48158 = c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35281(C14731 c14731) {
        c14731.getClass();
        C21825 c21825M48588 = c14731.f48155;
        if (c21825M48588 == f48153 || c21825M48588 == f48152) {
            c21825M48588 = C21825.m48588();
        }
        m35291(c21825M48588);
        AbstractC23903 abstractC23903 = this.f48154;
        if ((abstractC23903.mo20276() & 2147483648L) != 0) {
            C6171.m17176(c14731.f48154.f77452 == EnumC10477.f35879);
            C19003 c19003 = new C19003();
            for (C13278 c13278 : c14731.f48156) {
                if (!c13278.f39811.f37191.m18045()) {
                    c19003.m43723(c13278);
                }
            }
            m35288(c19003.m43726());
        } else {
            m35288(c14731.f48156);
        }
        if (abstractC23903.f77452 == EnumC10477.f35865) {
            m35275(c14731.f48157);
            m35283(c14731.f48158);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m35287() {
        this.f48155 = f48153;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m35292() {
        return this.f48156.isEmpty();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m35276() {
        return this.f48155 == f48153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35282(C21825 c21825) {
        C21825 c21825M48588 = this.f48155;
        if (c21825M48588 == f48153 || c21825M48588 == f48152) {
            c21825M48588 = C21825.m48588();
        }
        this.f48155 = c21825M48588;
        if (c21825.isEmpty()) {
            return;
        }
        if (this.f48155.isEmpty()) {
            this.f48155 = c21825;
            return;
        }
        C21825 c21826 = this.f48155;
        c21826.getClass();
        this.f48155 = c21825.m48594(c21826);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35278(C21825 c21825) {
        if (c21825.isEmpty()) {
            return;
        }
        if (this.f48156.isEmpty()) {
            this.f48156 = c21825;
            return;
        }
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C13278 c13278 = (C13278) it.next();
            if (!this.f48156.contains(c13278)) {
                this.f48156 = this.f48156.m48591(c13278);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35286(C21825 c21825) {
        if (c21825.isEmpty()) {
            return;
        }
        if (this.f48157.isEmpty()) {
            this.f48157 = c21825;
            return;
        }
        C21825 c21826 = this.f48157;
        c21826.getClass();
        this.f48157 = c21825.m48594(c21826);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35290(C21825 c21825) {
        if (c21825.isEmpty()) {
            return;
        }
        if (this.f48158.isEmpty()) {
            this.f48158 = c21825;
            return;
        }
        C21825 c21826 = this.f48158;
        c21826.getClass();
        this.f48158 = c21825.m48594(c21826);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m35284() {
        return this.f48155 == f48152 || m35276() || this.f48155.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m35274(C21825 c21825, C11867 c11867) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C11867 c11868 = (C11867) it.next();
            if (c11868 != c11867) {
                c19003.m43723(c11868);
            }
        }
        return c19003.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35280(C11867 c11867) {
        if (this.f48155.contains(c11867)) {
            this.f48155 = m35274(this.f48155, c11867);
            return;
        }
        for (C11867 c11868 : this.f48155) {
            boolean zM29575 = c11868.m29575();
            C21825 c21825 = c11868.f39809;
            if (zM29575 && !c21825.isEmpty()) {
                C2068 c2068 = (C2068) c21825.get(0);
                if (((C18258) c2068.f7664).f77453.mo28213(b.d)) {
                    Object obj = c2068.f7665;
                    if (obj instanceof C4810) {
                        AbstractC23156[] abstractC23156Arr = ((C4810) obj).f16902;
                        if (abstractC23156Arr.length != 0) {
                            AbstractC23156 abstractC23156 = abstractC23156Arr[0];
                            if ((abstractC23156 instanceof C11867) && abstractC23156.f75167 == c11867.f75167) {
                                this.f48155 = m35274(this.f48155, c11868);
                            }
                        }
                    }
                }
            }
        }
    }
}
