package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QK */
/* JADX INFO: loaded from: classes.dex */
public final class C25208 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C14769 f81449 = C14769.of((Object) null);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C14769 f81450 = C14769.of((Object) null);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f81455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f81451 = f81449;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14769 f81453 = C14769.m35543();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14769 f81452 = C14769.m35543();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 f81454 = C14769.m35543();

    public C25208(AbstractC11781 abstractC11781) {
        this.f81455 = abstractC11781;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 m56203() {
        C14769 c14769 = this.f81451;
        return (c14769 == f81450 || c14769 == f81449) ? C14769.m35543() : c14769;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 m56205() {
        return this.f81453;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m56195() {
        return this.f81452;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m56189() {
        return this.f81454;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m56199(C14769 c14769) {
        C11972.m30026(m56198() || this.f81451 == f81449);
        c14769.getClass();
        this.f81451 = c14769;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m56194(C14769 c14769) {
        c14769.getClass();
        this.f81453 = c14769;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m56197(C14769 c14769) {
        c14769.getClass();
        this.f81452 = c14769;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m56201(C14769 c14769) {
        c14769.getClass();
        this.f81454 = c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56192(C25208 c25208) {
        c25208.getClass();
        C14769 c14769M35543 = c25208.f81451;
        if (c14769M35543 == f81450 || c14769M35543 == f81449) {
            c14769M35543 = C14769.m35543();
        }
        m56199(c14769M35543);
        AbstractC11781 abstractC11781 = this.f81455;
        if ((abstractC11781.mo29591() & 2147483648L) != 0) {
            C11972.m30026(c25208.f81455.f38066 == EnumC13603.f43218);
            C18499 c18499 = new C18499();
            for (C24638 c24638 : c25208.f81453) {
                if (!c24638.f77371.f19183.m48863()) {
                    c18499.m43089(c24638);
                }
            }
            m56194(c18499.m43093());
        } else {
            m56194(c25208.f81453);
        }
        if (abstractC11781.f38066 == EnumC13603.f43213) {
            m56197(c25208.f81452);
            m56201(c25208.f81454);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m56193() {
        this.f81451 = f81450;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m56200() {
        return this.f81453.isEmpty();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m56198() {
        return this.f81451 == f81450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56190(C14769 c14769) {
        C14769 c14769M35543 = this.f81451;
        if (c14769M35543 == f81450 || c14769M35543 == f81449) {
            c14769M35543 = C14769.m35543();
        }
        this.f81451 = c14769M35543;
        if (c14769.isEmpty()) {
            return;
        }
        if (this.f81451.isEmpty()) {
            this.f81451 = c14769;
            return;
        }
        C14769 c147610 = this.f81451;
        c147610.getClass();
        this.f81451 = c14769.m35549(c147610);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m56206(C14769 c14769) {
        if (c14769.isEmpty()) {
            return;
        }
        if (this.f81453.isEmpty()) {
            this.f81453 = c14769;
            return;
        }
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C24638 c24638 = (C24638) it.next();
            if (!this.f81453.contains(c24638)) {
                this.f81453 = this.f81453.m35546(c24638);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56196(C14769 c14769) {
        if (c14769.isEmpty()) {
            return;
        }
        if (this.f81452.isEmpty()) {
            this.f81452 = c14769;
            return;
        }
        C14769 c147610 = this.f81452;
        c147610.getClass();
        this.f81452 = c14769.m35549(c147610);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56204(C14769 c14769) {
        if (c14769.isEmpty()) {
            return;
        }
        if (this.f81454.isEmpty()) {
            this.f81454 = c14769;
            return;
        }
        C14769 c147610 = this.f81454;
        c147610.getClass();
        this.f81454 = c14769.m35549(c147610);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m56202() {
        return this.f81451 == f81449 || m56198() || this.f81451.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m56188(C14769 c14769, C23892 c23892) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C23892 c23893 = (C23892) it.next();
            if (c23893 != c23892) {
                c18499.m43089(c23893);
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56191(C23892 c23892) {
        if (this.f81451.contains(c23892)) {
            this.f81451 = m56188(this.f81451, c23892);
            return;
        }
        for (C23892 c23893 : this.f81451) {
            boolean zM53395 = c23893.m53395();
            C14769 c14769 = c23893.f77372;
            if (zM53395 && !c14769.isEmpty()) {
                C5558 c5558 = (C5558) c14769.get(0);
                if (((C10377) c5558.f19300).f38072.mo9945(b.d)) {
                    Object obj = c5558.f19301;
                    if (obj instanceof C17924) {
                        AbstractC21654[] abstractC21654Arr = ((C17924) obj).f58709;
                        if (abstractC21654Arr.length != 0) {
                            AbstractC21654 abstractC21654 = abstractC21654Arr[0];
                            if ((abstractC21654 instanceof C23892) && abstractC21654.f69124 == c23892.f69124) {
                                this.f81451 = m56188(this.f81451, c23893);
                            }
                        }
                    }
                }
            }
        }
    }
}
