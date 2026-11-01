package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16558 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4603 f53182;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19670 f53184;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12325 f53187;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f53186 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f53183 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f53185 = new HashMap();

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        boolean z;
        C21825 c21825M48588 = C21825.m48588();
        C19670 c19670 = this.f53184;
        c19670.f63146 = c21825M48588;
        c19670.f63140 = C21825.m48588();
        c19670.f63151 = C21825.m48588();
        C0356.forEach(c18255.f58254, new C0473(1, this));
        c19670.f63146 = c19670.f63146.m48589();
        c19670.f63140 = c19670.f63140.m48589();
        c19670.f63151 = c19670.f63151.m48589();
        if (c19670.f63134.m48595() && ((C6948) c19670.f63134.f70876).f23370.contains(EnumC23177.MANDATED)) {
            c19670.f63146 = c19670.f63146.m48597((AbstractC21765) c19670.f63134.f70876);
        }
        C21825 c21825 = c19670.f63146;
        C12325 c12325 = this.f53187;
        C21825 c21825M48583 = C21825.m48583((Iterable) C9735.getOrDefault(c12325.f41183, c19670, Collections.EMPTY_SET));
        c21825.getClass();
        c19670.f63146 = c21825M48583.m48594(c21825);
        for (C4125 c4125 : c19670.f63140) {
            C17549 c17549 = (C17549) this.f53185.get(c4125);
            C21825 c21826 = c4125.f15098;
            C22492 c22492 = c4125.f15099;
            Iterator it = c21826.iterator();
            while (it.hasNext()) {
                C7675 c7675M52724 = ((C22492) it.next()).m52724();
                if (c7675M52724.f25392 != c19670) {
                    C20414 c20414 = c12325.f41202;
                    c17549.getClass();
                    C19670 c19671 = c7675M52724.f25392;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(c17549, new C5909("compiler", "service.implementation.not.in.right.module", c19671));
                }
                C7675 c7675M52725 = c22492.m52724();
                boolean z2 = c7675M52725.f25392 == c19670;
                boolean z3 = c19670.f63148.get(c7675M52725.f25396) == c7675M52725;
                if (z2 && !z3) {
                    Iterator it2 = c19670.f63142.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (c7675M52725 == ((C5537) it2.next()).f18986) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        Iterator it3 = c19670.f63151.iterator();
                        while (it3.hasNext()) {
                            if (c22492 == ((C15416) it3.next()).f50252) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        C20414 c20415 = c12325.f41202;
                        c17549.getClass();
                        C14065 c14065 = C9768.f32836;
                        c20415.m48204(c17549, new C14065("compiler", "service.provided.but.not.exported.or.used", c22492));
                    }
                }
            }
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1979(C17219 c17219) {
        boolean z;
        C12325 c12325;
        C7675 c7675 = c17219.f54879.f18986;
        c7675.mo49994();
        AbstractC9462 abstractC9462 = c7675.f25395;
        abstractC9462.getClass();
        Iterable iterableMo3802 = abstractC9462.mo3802((Predicate) null, EnumC10167.RECURSIVE);
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = ((C0288) iterableMo3802).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC23903 abstractC23903 = (AbstractC23903) it.next();
            if (abstractC23903.f77452 == EnumC10477.f35865) {
                C22492 c22492 = (C22492) abstractC23903;
                if (abstractC23903.f77451.mo1180() || c22492.f73422.mo6760() == EnumC11347.CLASS) {
                    c21825M48588 = C21825.m48588();
                    z = true;
                    break;
                } else if (c22492.f73422.mo6760() == EnumC11347.SOURCE) {
                    c21825M48588 = c21825M48588.m48597(c22492.f73422);
                }
            }
        }
        Iterator it2 = c21825M48588.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c12325 = this.f53187;
            if (!zHasNext) {
                break;
            } else if (C16949.m39705((C16949) c12325.f41191.f31543, (InterfaceC2173) it2.next()) == c17219.f54879.f18986.f25396) {
                z = true;
                break;
            }
        }
        if (!z) {
            C20414 c20414 = c12325.f41202;
            AbstractC5930 abstractC5930 = c17219.f54878;
            abstractC5930.getClass();
            C7675 c7676 = c17219.f54879.f18986;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "package.empty.or.not.found", c7676));
        }
        C19670 c19670 = this.f53184;
        c19670.f63146 = c19670.f63146.m48597(c17219.f54879);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1982(C19667 c19667) {
        this.f53187.f41189.m47295((InterfaceC12260) c19667.f63121, c19667.f63122.f5571);
        C19670 c19670 = this.f53184;
        c19670.f63146 = c19670.f63146.m48597(c19667.f63122);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1980(C17549 c17549) {
        C18258 c18258;
        C18258 c18259;
        C12325 c12325 = this.f53187;
        C6761 c6761 = c12325.f41185;
        AbstractC5930 abstractC5930 = c17549.f55774;
        AbstractC16579 abstractC16579 = c12325.f41213.f14275;
        C4603 c4603 = this.f53182;
        AbstractC16579 abstractC16579M18326 = c6761.m18326(abstractC5930, c4603, abstractC16579);
        C22492 c22492 = (C22492) abstractC16579M18326.f53222;
        HashMap map = this.f53183;
        boolean z = true;
        if (map.containsKey(c22492)) {
            C20414 c20414 = c12325.f41202;
            abstractC5930.getClass();
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "repeated.provides.for.service", c22492));
        }
        C19003 c19003 = new C19003();
        for (AbstractC5930 abstractC5931 : c17549.f55773) {
            Object obj = c4603.f16299;
            Object obj2 = c4603.f16299;
            boolean z2 = ((C22990) obj).f74724;
            try {
                ((C22990) obj).f74724 = z;
                AbstractC16579 abstractC16579M18327 = c12325.f41185.m18326(abstractC5931, c4603, c12325.f41213.f14275);
                ((C22990) obj2).f74724 = z2;
                C22492 c22493 = (C22492) abstractC16579M18327.f53222;
                if ((c22493.f77447 & 1) == 0) {
                    C20414 c20415 = c12325.f41202;
                    abstractC5931.getClass();
                    AbstractC23903 abstractC23903M52708 = c22493.m52708();
                    C5909 c59010 = C23879.f77204;
                    c20415.m48199(abstractC5931, new C5909("compiler", "not.def.public", c22493, abstractC23903M52708));
                }
                c22493.mo49994();
                AbstractC9462 abstractC9462 = c22493.f73417;
                AbstractC11242 abstractC11242 = c12325.f41197.f77651;
                C16973 c16973 = new C16973(4);
                abstractC9462.getClass();
                Iterator it = abstractC9462.mo3803(abstractC11242, c16973, EnumC10167.RECURSIVE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c18258 = null;
                        break;
                    }
                    c18258 = (C18258) ((AbstractC23903) it.next());
                    if (c18258.mo22992() && (c18258.f77447 & 1) != 0 && c18258.m42455().isEmpty()) {
                        break;
                    }
                }
                if (c18258 != null) {
                    if (!c12325.f41193.m52413(c18258.f77449.mo16235(), abstractC16579M18326, true)) {
                        C20414 c20416 = c12325.f41202;
                        abstractC5931.getClass();
                        c20416.m48199(abstractC5931, C23879.f77308);
                    }
                } else if (!c12325.f41193.m52413(abstractC16579M18327, abstractC16579M18326, true)) {
                    C20414 c20417 = c12325.f41202;
                    abstractC5931.getClass();
                    c20417.m48199(abstractC5931, C23879.f77335);
                } else {
                    c22493.mo49994();
                    if ((c22493.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        C20414 c20418 = c12325.f41202;
                        abstractC5931.getClass();
                        C5909 c59011 = C23879.f77204;
                        c20418.m48199(abstractC5931, new C5909("compiler", "service.implementation.is.abstract", c22493));
                    } else if (c22493.m52725()) {
                        C20414 c20419 = c12325.f41202;
                        abstractC5931.getClass();
                        C5909 c59012 = C23879.f77204;
                        c20419.m48199(abstractC5931, new C5909("compiler", "service.implementation.is.inner", c22493));
                    } else {
                        c22493.mo49994();
                        Iterator it2 = c22493.f73417.m9327(c12325.f41197.f77632).iterator();
                        do {
                            if (!it2.hasNext()) {
                                c18259 = null;
                                break;
                            }
                            c18259 = (C18258) ((AbstractC23903) it2.next());
                        } while (!c18259.m42455().isEmpty());
                        if (c18259 == null) {
                            C20414 c204110 = c12325.f41202;
                            abstractC5931.getClass();
                            C5909 c59013 = C23879.f77204;
                            c204110.m48199(abstractC5931, new C5909("compiler", "service.implementation.doesnt.have.a.no.args.constructor", c22493));
                        } else if ((c18259.f77447 & 1) == 0) {
                            C20414 c204111 = c12325.f41202;
                            abstractC5931.getClass();
                            C5909 c59014 = C23879.f77204;
                            c204111.m48199(abstractC5931, new C5909("compiler", "service.implementation.no.args.constructor.not.public", c22493));
                        }
                    }
                }
                if (abstractC16579M18327.m39001(EnumC6617.CLASS)) {
                    if (((Set) C9735.computeIfAbsent(map, c22492, new C22907(4))).add(c22493)) {
                        c19003.m43723(c22493);
                    } else {
                        C20414 c204112 = c12325.f41202;
                        abstractC5931.getClass();
                        C5909 c59015 = C23879.f77204;
                        c204112.m48199(abstractC5931, new C5909("compiler", "duplicate.provides", c22492, c22493));
                    }
                }
                z = true;
                c4603 = c4603;
            } catch (Throwable th) {
                ((C22990) obj2).f74724 = z2;
                throw th;
            }
        }
        if (!abstractC16579M18326.m39001(EnumC6617.CLASS) || c19003.isEmpty()) {
            return;
        }
        C4125 c4125 = new C4125(c22492, c19003.m43726());
        C19670 c19670 = this.f53184;
        c19670.f63140 = c19670.f63140.m48597(c4125);
        c19670.f63146 = c19670.f63146.m48597(c4125);
        this.f53185.put(c4125, c17549);
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1978(C6260 c6260) {
        C6948 c6948 = c6260.f21223;
        AbstractC5930 abstractC5930 = c6260.f21222;
        if (c6948 != null) {
            C12325 c12325 = this.f53187;
            if (c12325.m30630().contains(c6260.f21223.f23371)) {
                C21017 c21017 = c12325.f41189;
                abstractC5930.getClass();
                C19670 c19670 = c6260.f21223.f23371;
                c21017.getClass();
                C2672 c2672 = new C2672(abstractC5930);
                C19670 c19671 = this.f53184;
                c21017.m47273(c2672, c19671, c19670);
                c12325.f41189.m47299(abstractC5930, c19671, c6260.f21223.f23371);
                c12325.f41189.m47294(abstractC5930, c6260.f21223);
                c19671.f63146 = c19671.f63146.m48597(c6260.f21223);
            }
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1977(C3833 c3833) {
        C12325 c12325 = this.f53187;
        C6761 c6761 = c12325.f41185;
        AbstractC5930 abstractC5930 = c3833.f14206;
        AbstractC16579 abstractC16579M18326 = c6761.m18326(abstractC5930, this.f53182, c12325.f41213.f14275);
        if ((C3128.m9471(abstractC5930).mo20276() & 16384) != 0) {
            C20414 c20414 = c12325.f41202;
            abstractC5930.getClass();
            AbstractC0618 abstractC0618 = abstractC16579M18326.f53222;
            C5909 c5909 = C23879.f77204;
            c20414.m48199(abstractC5930, new C5909("compiler", "service.definition.is.enum", abstractC0618));
            return;
        }
        if (abstractC16579M18326.m39001(EnumC6617.CLASS)) {
            C22492 c22492 = (C22492) abstractC16579M18326.f53222;
            if (this.f53186.add(c22492)) {
                C15416 c15416 = new C15416(c22492);
                C19670 c19670 = this.f53184;
                c19670.f63151 = c19670.f63151.m48597(c15416);
                c19670.f63146 = c19670.f63146.m48597(c15416);
                return;
            }
            C20414 c20415 = c12325.f41202;
            C5909 c59010 = C23879.f77204;
            c20415.m48199(c3833, new C5909("compiler", "duplicate.uses", c22492));
        }
    }

    public C16558(C12325 c12325, C19670 c19670, C4603 c4603) {
        this.f53187 = c12325;
        this.f53184 = c19670;
        this.f53182 = c4603;
    }
}
