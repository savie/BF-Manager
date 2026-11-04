package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۙܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4965 extends AbstractC0578 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19881 f17285;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2920 f17287;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet f17284 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f17283 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f17286 = new HashMap();

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2604(C5053 c5053) {
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2610(C20715 c20715) {
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        C2920 c2920 = c14835.f48524;
        C11972.m30021(c2920);
        this.f17287 = c2920;
        if (c14835.mo13304() == EnumC24287.OPEN) {
            this.f17287.f9552.add(EnumC1429.OPEN);
        }
        C2920 c2921 = this.f17287;
        c2921.f38071 |= c14835.f48525.f15825 & 131072;
        c2921.f9551 = C14769.m35543();
        this.f17287.f9546 = C14769.m35543();
        this.f17287.f9558 = C14769.m35543();
        C4937.forEach(c14835.f48523, new C7071(1, this));
        C2920 c2922 = this.f17287;
        c2922.f9551 = c2922.f9551.m35554();
        C2920 c2923 = this.f17287;
        c2923.f9546 = c2923.f9546.m35554();
        C2920 c2924 = this.f17287;
        c2924.f9558 = c2924.f9558.m35554();
        AbstractC19728 abstractC19728 = this.f17287.f38072;
        C19881 c19881 = this.f17285;
        if (abstractC19728 == c19881.f63962.f49807) {
            return;
        }
        Iterator it = this.f17287.f9551.iterator();
        while (it.hasNext()) {
            if (((C0180) it.next()).f1262.f38072 == c19881.f63962.f49807) {
                return;
            }
        }
        C0180 c0180 = new C0180(c19881.f63964.m35515(c19881.f63962.f49807), EnumSet.of(EnumC7638.MANDATED));
        C2920 c2925 = this.f17287;
        c2925.f9551 = c2925.f9551.m35552(c0180);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2612(C22207 c22207) {
        AbstractC22295 abstractC22295 = c22207.f71540;
        AbstractC19728 abstractC19728M28338 = C11239.m28338(abstractC22295);
        C19881 c19881 = this.f17285;
        C2920 c2920M55956 = c19881.f63976.m55956(abstractC19728M28338);
        C11239.m28356(c2920M55956, abstractC22295);
        if (c2920M55956.f38066 != EnumC13603.f43214) {
            C7312 c7312 = c19881.f63971;
            abstractC22295.getClass();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "module.not.found", c2920M55956));
            ((HashSet) c19881.f63970).add(c2920M55956);
            return;
        }
        HashSet hashSet = this.f17284;
        if (hashSet.contains(c2920M55956)) {
            C7312 c7313 = c19881.f63971;
            abstractC22295.getClass();
            C11040 c11041 = C22843.f74058;
            c7313.m34520(abstractC22295, new C11040("compiler", "duplicate.requires", c2920M55956));
            return;
        }
        hashSet.add(c2920M55956);
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC7638.class);
        if (c22207.f71542) {
            if (c2920M55956 == c19881.f63964.f48304 && c19881.f63953.compareTo(EnumC20820.JDK10) >= 0) {
                C7312 c7314 = c19881.f63971;
                AbstractC19728 abstractC19728 = c19881.f63962.f49806;
                C11040 c11042 = C22843.f74058;
                c7314.m34520(c22207, new C11040("compiler", "modifier.not.allowed.here", abstractC19728));
            } else {
                enumSetNoneOf.add(EnumC7638.TRANSITIVE);
            }
        }
        if (c22207.f71543) {
            if (c2920M55956 == c19881.f63964.f48304 && c19881.f63953.compareTo(EnumC20820.JDK10) >= 0) {
                C7312 c7315 = c19881.f63971;
                EnumSet enumSetOf = EnumSet.of(EnumC9128.f29638);
                C11040 c11043 = C22843.f74058;
                c7315.m34520(c22207, new C11040("compiler", "mod.not.allowed.here", enumSetOf));
            } else {
                enumSetNoneOf.add(EnumC7638.STATIC_PHASE);
            }
        }
        C0180 c0180 = new C0180(c2920M55956, enumSetNoneOf);
        c22207.f71541 = c0180;
        C2920 c2920 = this.f17287;
        c2920.f9551 = c2920.f9551.m35552(c0180);
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C5141 c5141) {
        C14769 c14769M35539;
        AbstractC22295 abstractC22295 = c5141.f17908;
        C14769 c14769 = c5141.f17909;
        AbstractC19728 abstractC19728M28338 = C11239.m28338(abstractC22295);
        C19881 c19881 = this.f17285;
        C14106 c14106M35529 = c19881.f63964.m35529(this.f17287, abstractC19728M28338);
        c19881.f63954.getClass();
        new C6848(c14106M35529).mo5474(abstractC22295);
        C9714 c9714 = new C9714(8);
        HashMap map = this.f17283;
        C14769<C24047> c147610 = (C14769) C11392.computeIfAbsent(map, c14106M35529, c9714);
        for (C24047 c24047 : c147610) {
            C7312 c7312 = c19881.f63971;
            abstractC22295.getClass();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "conflicting.exports", c14106M35529));
        }
        if (c14769 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c14769.iterator();
            while (it.hasNext()) {
                AbstractC22295 abstractC22296 = (AbstractC22295) it.next();
                C2920 c2920M55956 = c19881.f63976.m55956(C11239.m28338(abstractC22296));
                C11239.m28356(c2920M55956, abstractC22296);
                C22092 c22092 = c19881.f63967;
                abstractC22296.getClass();
                c22092.m50012(abstractC22296, c2920M55956);
                Iterator it2 = c147610.iterator();
                while (it2.hasNext()) {
                    C14769 c147611 = ((C24047) it2.next()).f77786;
                    if (c147611 != null) {
                        Iterator it3 = c147611.iterator();
                        while (it3.hasNext()) {
                            if (c2920M55956 == ((C2920) it3.next())) {
                                C7312 c7313 = c19881.f63971;
                                C11040 c11041 = C22843.f74058;
                                c7313.m34520(abstractC22296, new C11040("compiler", "conflicting.exports.to.module", c2920M55956));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c2920M55956)) {
                    C7312 c7314 = c19881.f63971;
                    C11040 c11042 = C22843.f74058;
                    c7314.m34520(abstractC22296, new C11040("compiler", "conflicting.exports.to.module", c2920M55956));
                }
                it = it4;
            }
            c14769M35539 = C14769.m35539((Iterable) linkedHashSet);
        } else {
            c14769M35539 = null;
        }
        if (c14769M35539 == null || !c14769M35539.isEmpty()) {
            C24047 c24048 = new C24047(c14106M35529, c14769M35539, EnumSet.noneOf(EnumC3909.class));
            C2920 c2920 = this.f17287;
            c2920.f9546 = c2920.f9546.m35552(c24048);
            c5141.f17907 = c24048;
            map.put(c14106M35529, c147610.m35552(c24048));
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2602(C0666 c0666) {
        C14769 c14769M35539;
        AbstractC22295 abstractC22295 = c0666.f2536;
        C14769 c14769 = c0666.f2537;
        AbstractC19728 abstractC19728M28338 = C11239.m28338(abstractC22295);
        C19881 c19881 = this.f17285;
        C14106 c14106M35529 = c19881.f63964.m35529(this.f17287, abstractC19728M28338);
        c19881.f63954.getClass();
        new C6848(c14106M35529).mo5474(abstractC22295);
        if (this.f17287.f9552.contains(EnumC1429.OPEN)) {
            c19881.f63971.m34520(c0666, C22843.f74208);
        }
        C17748 c17748 = new C17748(4);
        HashMap map = this.f17286;
        C14769<C14349> c147610 = (C14769) C11392.computeIfAbsent(map, c14106M35529, c17748);
        for (C14349 c14349 : c147610) {
            C7312 c7312 = c19881.f63971;
            abstractC22295.getClass();
            C11040 c11040 = C22843.f74058;
            c7312.m34520(abstractC22295, new C11040("compiler", "conflicting.opens", c14106M35529));
        }
        if (c14769 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c14769.iterator();
            while (it.hasNext()) {
                AbstractC22295 abstractC22296 = (AbstractC22295) it.next();
                C2920 c2920M55956 = c19881.f63976.m55956(C11239.m28338(abstractC22296));
                C11239.m28356(c2920M55956, abstractC22296);
                C22092 c22092 = c19881.f63967;
                abstractC22296.getClass();
                c22092.m50012(abstractC22296, c2920M55956);
                Iterator it2 = c147610.iterator();
                while (it2.hasNext()) {
                    C14769 c147611 = ((C14349) it2.next()).f45256;
                    if (c147611 != null) {
                        Iterator it3 = c147611.iterator();
                        while (it3.hasNext()) {
                            if (c2920M55956 == ((C2920) it3.next())) {
                                C7312 c7313 = c19881.f63971;
                                C11040 c11041 = C22843.f74058;
                                c7313.m34520(abstractC22296, new C11040("compiler", "conflicting.opens.to.module", c2920M55956));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c2920M55956)) {
                    C7312 c7314 = c19881.f63971;
                    C11040 c11042 = C22843.f74058;
                    c7314.m34520(abstractC22296, new C11040("compiler", "conflicting.opens.to.module", c2920M55956));
                }
                it = it4;
            }
            c14769M35539 = C14769.m35539((Iterable) linkedHashSet);
        } else {
            c14769M35539 = null;
        }
        if (c14769M35539 == null || !c14769M35539.isEmpty()) {
            C14349 c143410 = new C14349(c14106M35529, c14769M35539, EnumSet.noneOf(EnumC21063.class));
            C2920 c2920 = this.f17287;
            c2920.f9558 = c2920.f9558.m35552(c143410);
            c0666.f2535 = c143410;
            map.put(c14106M35529, c147610.m35552(c143410));
        }
    }

    public C4965(C19881 c19881) {
        this.f17285 = c19881;
    }
}
