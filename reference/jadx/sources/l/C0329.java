package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0329 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19670 f1725;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12325 f1727;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashSet f1728 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f1726 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f1729 = new HashMap();

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1977(C3833 c3833) {
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1980(C17549 c17549) {
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1981(C18255 c18255) {
        C19670 c19670 = c18255.f58256;
        C6171.m17171(c19670);
        this.f1725 = c19670;
        if (c18255.mo11527() == EnumC13195.OPEN) {
            this.f1725.f63137.add(EnumC18964.OPEN);
        }
        C19670 c19671 = this.f1725;
        c19671.f77447 |= c18255.f58252.f70567 & 131072;
        c19671.f63134 = C21825.m48588();
        this.f1725.f63142 = C21825.m48588();
        this.f1725.f63145 = C21825.m48588();
        C0356.forEach(c18255.f58254, new C20230(1, this));
        C19670 c19672 = this.f1725;
        c19672.f63134 = c19672.f63134.m48589();
        C19670 c19673 = this.f1725;
        c19673.f63142 = c19673.f63142.m48589();
        C19670 c19674 = this.f1725;
        c19674.f63145 = c19674.f63145.m48589();
        AbstractC11242 abstractC11242 = this.f1725.f77453;
        C12325 c12325 = this.f1727;
        if (abstractC11242 == c12325.f41197.f77580) {
            return;
        }
        Iterator it = this.f1725.f63134.iterator();
        while (it.hasNext()) {
            if (((C6948) it.next()).f23371.f77453 == c12325.f41197.f77580) {
                return;
            }
        }
        C6948 c6948 = new C6948(c12325.f41213.m11146(c12325.f41197.f77580), EnumSet.of(EnumC23177.MANDATED));
        C19670 c19675 = this.f1725;
        c19675.f63134 = c19675.f63134.m48597(c6948);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1978(C6260 c6260) {
        AbstractC5930 abstractC5930 = c6260.f21222;
        AbstractC11242 abstractC11242M9460 = C3128.m9460(abstractC5930);
        C12325 c12325 = this.f1727;
        C19670 c19670M52639 = c12325.f41180.m52639(abstractC11242M9460);
        C3128.m9464(c19670M52639, abstractC5930);
        if (c19670M52639.f77452 != EnumC10477.f35868) {
            C20414 c20414 = c12325.f41202;
            abstractC5930.getClass();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "module.not.found", c19670M52639));
            ((HashSet) c12325.f41184).add(c19670M52639);
            return;
        }
        HashSet hashSet = this.f1728;
        if (hashSet.contains(c19670M52639)) {
            C20414 c20415 = c12325.f41202;
            abstractC5930.getClass();
            C5909 c59010 = C23879.f77204;
            c20415.m48199(abstractC5930, new C5909("compiler", "duplicate.requires", c19670M52639));
            return;
        }
        hashSet.add(c19670M52639);
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC23177.class);
        if (c6260.f21221) {
            if (c19670M52639 == c12325.f41213.f14235 && c12325.f41195.compareTo(EnumC11909.JDK10) >= 0) {
                C20414 c20416 = c12325.f41202;
                AbstractC11242 abstractC11242 = c12325.f41197.f77579;
                C5909 c59011 = C23879.f77204;
                c20416.m48199(c6260, new C5909("compiler", "modifier.not.allowed.here", abstractC11242));
            } else {
                enumSetNoneOf.add(EnumC23177.TRANSITIVE);
            }
        }
        if (c6260.f21224) {
            if (c19670M52639 == c12325.f41213.f14235 && c12325.f41195.compareTo(EnumC11909.JDK10) >= 0) {
                C20414 c20417 = c12325.f41202;
                EnumSet enumSetOf = EnumSet.of(EnumC18943.f61315);
                C5909 c59012 = C23879.f77204;
                c20417.m48199(c6260, new C5909("compiler", "mod.not.allowed.here", enumSetOf));
            } else {
                enumSetNoneOf.add(EnumC23177.STATIC_PHASE);
            }
        }
        C6948 c6948 = new C6948(c19670M52639, enumSetNoneOf);
        c6260.f21223 = c6948;
        C19670 c19670 = this.f1725;
        c19670.f63134 = c19670.f63134.m48597(c6948);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1979(C17219 c17219) {
        C21825 c21825M48583;
        AbstractC5930 abstractC5930 = c17219.f54878;
        C21825 c21825 = c17219.f54880;
        AbstractC11242 abstractC11242M9460 = C3128.m9460(abstractC5930);
        C12325 c12325 = this.f1727;
        C7675 c7675M11157 = c12325.f41213.m11157(this.f1725, abstractC11242M9460);
        c12325.f41185.getClass();
        new C9004(c7675M11157).mo7248(abstractC5930);
        C20086 c20086 = new C20086();
        HashMap map = this.f1726;
        C21825<C5537> c21826 = (C21825) C9735.computeIfAbsent(map, c7675M11157, c20086);
        for (C5537 c5537 : c21826) {
            C20414 c20414 = c12325.f41202;
            abstractC5930.getClass();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "conflicting.exports", c7675M11157));
        }
        if (c21825 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                AbstractC5930 abstractC5931 = (AbstractC5930) it.next();
                C19670 c19670M52639 = c12325.f41180.m52639(C3128.m9460(abstractC5931));
                C3128.m9464(c19670M52639, abstractC5931);
                C21017 c21017 = c12325.f41189;
                abstractC5931.getClass();
                c21017.m47279(abstractC5931, c19670M52639);
                Iterator it2 = c21826.iterator();
                while (it2.hasNext()) {
                    C21825 c21827 = ((C5537) it2.next()).f18987;
                    if (c21827 != null) {
                        Iterator it3 = c21827.iterator();
                        while (it3.hasNext()) {
                            if (c19670M52639 == ((C19670) it3.next())) {
                                C20414 c20415 = c12325.f41202;
                                C5909 c59010 = C23879.f77204;
                                c20415.m48199(abstractC5931, new C5909("compiler", "conflicting.exports.to.module", c19670M52639));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c19670M52639)) {
                    C20414 c20416 = c12325.f41202;
                    C5909 c59011 = C23879.f77204;
                    c20416.m48199(abstractC5931, new C5909("compiler", "conflicting.exports.to.module", c19670M52639));
                }
                it = it4;
            }
            c21825M48583 = C21825.m48583((Iterable) linkedHashSet);
        } else {
            c21825M48583 = null;
        }
        if (c21825M48583 == null || !c21825M48583.isEmpty()) {
            C5537 c5538 = new C5537(c7675M11157, c21825M48583, EnumSet.noneOf(EnumC22471.class));
            C19670 c19670 = this.f1725;
            c19670.f63142 = c19670.f63142.m48597(c5538);
            c17219.f54879 = c5538;
            map.put(c7675M11157, c21826.m48597(c5538));
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1982(C19667 c19667) {
        C21825 c21825M48583;
        AbstractC5930 abstractC5930 = c19667.f63121;
        C21825 c21825 = c19667.f63123;
        AbstractC11242 abstractC11242M9460 = C3128.m9460(abstractC5930);
        C12325 c12325 = this.f1727;
        C7675 c7675M11157 = c12325.f41213.m11157(this.f1725, abstractC11242M9460);
        c12325.f41185.getClass();
        new C9004(c7675M11157).mo7248(abstractC5930);
        if (this.f1725.f63137.contains(EnumC18964.OPEN)) {
            c12325.f41202.m48199(c19667, C23879.f77350);
        }
        C18663 c18663 = new C18663(8);
        HashMap map = this.f1729;
        C21825<C1303> c21826 = (C21825) C9735.computeIfAbsent(map, c7675M11157, c18663);
        for (C1303 c1303 : c21826) {
            C20414 c20414 = c12325.f41202;
            abstractC5930.getClass();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "conflicting.opens", c7675M11157));
        }
        if (c21825 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = c21825.iterator();
            while (it.hasNext()) {
                AbstractC5930 abstractC5931 = (AbstractC5930) it.next();
                C19670 c19670M52639 = c12325.f41180.m52639(C3128.m9460(abstractC5931));
                C3128.m9464(c19670M52639, abstractC5931);
                C21017 c21017 = c12325.f41189;
                abstractC5931.getClass();
                c21017.m47279(abstractC5931, c19670M52639);
                Iterator it2 = c21826.iterator();
                while (it2.hasNext()) {
                    C21825 c21827 = ((C1303) it2.next()).f5572;
                    if (c21827 != null) {
                        Iterator it3 = c21827.iterator();
                        while (it3.hasNext()) {
                            if (c19670M52639 == ((C19670) it3.next())) {
                                C20414 c20415 = c12325.f41202;
                                C5909 c59010 = C23879.f77204;
                                c20415.m48199(abstractC5931, new C5909("compiler", "conflicting.opens.to.module", c19670M52639));
                            }
                            it2 = it2;
                            it = it;
                        }
                    }
                    it2 = it2;
                    it = it;
                }
                Iterator it4 = it;
                if (!linkedHashSet.add(c19670M52639)) {
                    C20414 c20416 = c12325.f41202;
                    C5909 c59011 = C23879.f77204;
                    c20416.m48199(abstractC5931, new C5909("compiler", "conflicting.opens.to.module", c19670M52639));
                }
                it = it4;
            }
            c21825M48583 = C21825.m48583((Iterable) linkedHashSet);
        } else {
            c21825M48583 = null;
        }
        if (c21825M48583 == null || !c21825M48583.isEmpty()) {
            C1303 c1304 = new C1303(c7675M11157, c21825M48583, EnumSet.noneOf(EnumC13299.class));
            C19670 c19670 = this.f1725;
            c19670.f63145 = c19670.f63145.m48597(c1304);
            c19667.f63122 = c1304;
            map.put(c7675M11157, c21826.m48597(c1304));
        }
    }

    public C0329(C12325 c12325) {
        this.f1727 = c12325;
    }
}
