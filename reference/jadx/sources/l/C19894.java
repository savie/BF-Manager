package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6ET */
/* JADX INFO: loaded from: classes5.dex */
public final class C19894 implements InterfaceC4232 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f63999;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7150 f64001;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f64002;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10132 f64003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Iterator f64006;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4601 f64007;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Predicate f64008;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f64000 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f64005 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f64004 = false;

    public final String toString() {
        return "ArgsListUpdateCallback";
    }

    public C19894(C10132 c10132, C7150 c7150, List list, AbstractC1566 abstractC1566, boolean z) {
        this.f64003 = c10132;
        this.f64001 = c7150;
        this.f64006 = list.iterator();
        this.f63999 = abstractC1566;
        this.f64002 = z;
    }

    @Override // l.InterfaceC4232
    /* JADX INFO: renamed from: ۙ */
    public final EnumC4695 mo11179(EnumC4695 enumC4695) {
        AbstractC16481 abstractC16481;
        C19894 c19894;
        do {
            if (this.f64000 || enumC4695 != EnumC4695.REJECT) {
                if (enumC4695 != EnumC4695.SAME) {
                    this.f64005 = false;
                }
                Predicate predicate = this.f64008;
                do {
                    Iterator it = this.f64006;
                    if (!it.hasNext()) {
                        abstractC16481 = null;
                        break;
                    }
                    abstractC16481 = (AbstractC16481) it.next();
                    if (predicate == null) {
                        break;
                    }
                } while (!predicate.test(abstractC16481));
                if (abstractC16481 == null) {
                    EnumC4695 enumC4696 = this.f64005 ? EnumC4695.SAME : EnumC4695.CHANGED;
                    C4601 c4601 = this.f64007;
                    if (c4601 != null) {
                        c4601.mo11179(enumC4696);
                    }
                    return enumC4696;
                }
                if (this.f64004) {
                    this.f64004 = false;
                    c19894 = this;
                } else {
                    c19894 = null;
                }
                boolean z = this.f64002;
                AbstractC1566 abstractC1566 = this.f63999;
                C7150 c7150 = this.f64001;
                if (!z) {
                    enumC4695 = this.f64003.m26141(c7150, abstractC16481, abstractC1566, c19894);
                } else {
                    c7150.m19716(new C13861(abstractC16481, abstractC1566, true, c19894));
                    enumC4695 = null;
                }
            } else {
                C4601 c4602 = this.f64007;
                if (c4602 != null) {
                    c4602.mo11179(enumC4695);
                }
                return enumC4695;
            }
        } while (enumC4695 != null);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4695 m45789() {
        this.f64004 = true;
        return mo11179(EnumC4695.SAME);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45791(C4601 c4601) {
        this.f64007 = c4601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45790(Predicate predicate) {
        this.f64008 = predicate;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45792() {
        this.f64000 = true;
    }
}
