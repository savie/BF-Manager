package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12325 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C15147 f41179 = new C15147(0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23882 f41180;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f41181;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11492 f41182;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f41183;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6761 f41185;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f41186;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f41187;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21017 f41189;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f41190;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9285 f41191;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f41192;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23800 f41193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f41194;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC11909 f41195;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f41196;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23942 f41197;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f41198;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f41199;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC14128 f41200;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2714 f41201;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20414 f41202;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f41203;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f41206;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f41207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f41209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f41211;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C19670 f41212;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3836 f41213;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f41210 = new HashSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f41205 = new HashSet();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Set f41188 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final HashSet f41184 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 f41208 = new C7385(this);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f41204 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30623(C12325 c12325, AbstractC23903 abstractC23903) {
        c12325.getClass();
        C19670 c19670 = (C19670) abstractC23903;
        c19670.mo49994();
        C4603 c4603M28678 = c12325.f41182.m28678(c19670);
        C16558 c16558 = new C16558(c12325, c19670, c4603M28678);
        C20414 c20414 = c12325.f41202;
        InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603M28678.f16295.f34725);
        C18255 c18255M25899 = c4603M28678.f16295.m25899();
        C2714 c2714 = c12325.f41201;
        c18255M25899.getClass();
        InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c18255M25899);
        try {
            c16558.mo1981(c18255M25899);
        } finally {
            c20414.m48202(interfaceC2173M48202);
            c2714.m8270(interfaceC12260M8270);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m30624(C12325 c12325, C19670 c19670) {
        c12325.getClass();
        c19670.mo49994();
        return !c19670.f77453.m28218(c12325.f41192) && C9030.stream(c19670.f63142).anyMatch(new C22908());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12325 m30599(C12343 c12343) {
        C12325 c12325 = (C12325) c12343.m30655(C12325.class);
        return c12325 == null ? new C12325(c12343) : c12325;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30632(String... strArr) {
        this.f41210.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30631(C21825 c21825) {
        C6171.m17176(!this.f41207);
        try {
            this.f41207 = true;
            C6171.m17178(this.f41188);
            m30612(c21825, new C2445(0, this), (C22492) null);
        } finally {
            this.f41207 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30601(final C12325 c12325, Set set) {
        InterfaceC5046 interfaceC5046Filter;
        ?? r3;
        Predicate c15951;
        Predicate c9375;
        C6171.m17178(c12325.f41188);
        C6171.m17178(c12325.f41211);
        c12325.f41188 = set;
        HashSet hashSet = c12325.f41210;
        String str = c12325.f41196;
        C20414 c20414 = c12325.f41202;
        HashSet hashSet2 = c12325.f41205;
        C23942 c23942 = c12325.f41197;
        C3836 c3836 = c12325.f41213;
        C6171.m17171(set);
        C6171.m17178(c12325.f41211);
        String str2 = c12325.f41190;
        int i = 0;
        final LinkedHashSet linkedHashSetM30598 = null;
        if (str2 != null || !hashSet2.isEmpty()) {
            HashSet<C19670> hashSet3 = new HashSet();
            if (str2 != null) {
                for (String str3 : str2.split(",")) {
                    if (c12325.m30610(str3)) {
                        hashSet3.add(c3836.m11146(c23942.f77631.m17389(str3)));
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                hashSet3.add(c3836.m11146(c23942.f77631.m17389((String) it.next())));
            }
            linkedHashSetM30598 = c12325.m30598(hashSet3, c12325.f41188, (LinkedHashSet) null);
            linkedHashSetM30598.addAll(c12325.f41188);
            if (c12325.f41209) {
                for (C19670 c19670 : hashSet3) {
                    if (!linkedHashSetM30598.contains(c19670)) {
                        c20414.m48195(EnumC0597.OPTIONS, C9768.m24751(EnumC19730.f63404, c19670));
                    }
                }
            }
        }
        Predicate predicate = new Predicate() { // from class: l.۠ۢۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C8512.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                return C8512.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C12325.m30611(this.f28343, linkedHashSetM30598, (C19670) obj);
            }
        };
        C19380 c19380 = new C19380(i);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c12325.f41188.contains(c3836.f14288)) {
            int i2 = 3;
            if (c12325.f41200.m34163()) {
                c15951 = new C1612(i2);
            } else {
                C19670 c19670M11154 = c3836.m11154(c12325.f41194);
                if (c19670M11154 != null && (linkedHashSetM30598 == null || linkedHashSetM30598.contains(c19670M11154))) {
                    c9375 = new C9375(2, c12325);
                    linkedHashSet.add(c19670M11154);
                } else {
                    c15951 = new C15951(i2);
                }
                for (C19670 c19671 : new HashSet(c3836.m11144())) {
                    try {
                        if (!c19380.test(c19671) && predicate.test(c19671) && c9375.test(c19671)) {
                            c19671.mo49994();
                            if (!c19671.f63144.contains(EnumC8381.DO_NOT_RESOLVE_BY_DEFAULT)) {
                                linkedHashSet.add(c19671);
                            }
                        }
                    } catch (C4146 e) {
                        c12325.f41189.m47261((InterfaceC12260) null, e);
                    }
                }
            }
            c9375 = c15951;
            while (r9.hasNext()) {
                if (!c19380.test(c19671)) {
                }
            }
        }
        linkedHashSet.addAll(c12325.f41188);
        if (str != null || !hashSet.isEmpty()) {
            HashSet<String> hashSet4 = new HashSet();
            hashSet4.addAll(hashSet);
            if (str != null) {
                hashSet4.addAll(Arrays.asList(str.split(",")));
            }
            for (String str4 : hashSet4) {
                str4.getClass();
                if (str4.equals("ALL-SYSTEM")) {
                    interfaceC5046Filter = C9030.stream(new HashSet(c3836.m11144())).filter(c19380.and(predicate));
                } else if (str4.equals("ALL-MODULE-PATH")) {
                    interfaceC5046Filter = C9030.stream(new HashSet(c3836.m11144())).filter(c19380.mo9645negate().and(predicate));
                } else if (c12325.m30610(str4)) {
                    AbstractC6302 abstractC6302 = c23942.f77631;
                    abstractC6302.getClass();
                    char[] charArray = str4.toCharArray();
                    interfaceC5046Filter = C11397.of(c3836.m11146(abstractC6302.mo17390(charArray, charArray.length)));
                }
                interfaceC5046Filter.forEach(new Consumer() { // from class: l.ۡۢۤ
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C1455.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        C19670 c19672 = (C19670) obj;
                        linkedHashSet.add(c19672);
                        Set set2 = linkedHashSetM30598;
                        if (set2 != null) {
                            set2.add(c19672);
                        }
                    }
                });
            }
        }
        LinkedHashSet linkedHashSetM30599 = c12325.m30598(linkedHashSet, c12325.f41188, linkedHashSetM30598);
        linkedHashSetM30599.add(c3836.f14288);
        InterfaceC5046 interfaceC5046Stream = C9030.stream(linkedHashSetM30599);
        C15147 c15147 = f41179;
        if (interfaceC5046Stream.anyMatch(c15147)) {
            r3 = 0;
            C9030.stream(c3836.m11144()).filter(c15147).forEach(new C10208(0 == true ? 1 : 0, linkedHashSetM30599));
        } else {
            r3 = 0;
        }
        String str5 = (String) C9030.stream(linkedHashSetM30599).filter(new C5268(r3)).map(new C22202(r3)).collect(C1890.joining(","));
        if (!str5.isEmpty()) {
            C14065 c14065 = C9768.f32836;
            Object[] objArr = new Object[1];
            objArr[r3] = str5;
            c20414.m48201(new C14065("compiler", "incubating.modules", objArr));
        }
        c12325.f41211 = linkedHashSetM30599;
        c12325.f41207 = r3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30634(C22492 c22492, C21825 c21825) {
        C6171.m17176((this.f41188 == null && !this.f41207 && this.f41198) ? false : true);
        return m30612(c21825, new C1034(), c22492);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30612(C21825 c21825, Consumer consumer, C22492 c22492) {
        if (!this.f41198) {
            Iterator it = c21825.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C3836 c3836 = this.f41213;
                if (zHasNext) {
                    ((C10164) it.next()).f34730 = c3836.f14249;
                } else {
                    this.f41212 = c3836.f14249;
                    return true;
                }
            }
        } else {
            C20414 c20414 = this.f41202;
            int i = c20414.f66177;
            try {
                LinkedHashSet linkedHashSetM30620 = m30620(c22492, c21825);
                m30609(c21825, linkedHashSetM30620, c22492);
                consumer.n(linkedHashSetM30620);
                Iterator it2 = linkedHashSetM30620.iterator();
                while (it2.hasNext()) {
                    ((C19670) it2.next()).mo49994();
                }
            } catch (C4146 e) {
                this.f41189.m47261((InterfaceC12260) null, e);
            }
            return c20414.f66177 == i;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 m30635() {
        return this.f41208;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19670 m30637() {
        return this.f41212;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m30629() {
        return this.f41211 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private LinkedHashSet m30620(C22492 c22492, C21825 c21825) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C10164 c10164 = (C10164) it.next();
            InterfaceC2173 interfaceC2173 = c10164.f34725;
            C20414 c20414 = this.f41202;
            InterfaceC2173 interfaceC2173M48202 = c20414.m48202(interfaceC2173);
            try {
                m30600(c10164, c22492, linkedHashSet);
                c20414.m48202(interfaceC2173M48202);
            } catch (Throwable th) {
                c20414.m48202(interfaceC2173M48202);
                throw th;
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30600(C10164 c10164, C22492 c22492, LinkedHashSet linkedHashSet) {
        AbstractC8774 abstractC8774;
        C19670 c19670M11146;
        boolean zMo6761 = c10164.f34725.mo6761("module-info", EnumC11347.SOURCE);
        C18255 c18255M25899 = c10164.m25899();
        boolean z = this.f41203;
        C20414 c20414 = this.f41202;
        if (c18255M25899 == null) {
            if (zMo6761 && z) {
                if (!c10164.f34727.isEmpty()) {
                    abstractC8774 = c10164;
                    abstractC8774 = (AbstractC8774) c10164.f34727.f70876;
                }
                abstractC8774 = c10164;
                abstractC8774.getClass();
                c20414.m48199(abstractC8774, C23879.f77309);
                return;
            }
            return;
        }
        C18255 c18255M258910 = c10164.m25899();
        if (!zMo6761) {
            c18255M258910.getClass();
            c20414.m48199(c18255M258910, C23879.f77262);
        }
        AbstractC11242 abstractC11242M9460 = C3128.m9460(c18255M258910.f58253);
        if (c22492 != null) {
            c19670M11146 = (C19670) c22492.f77448;
            C6171.m17171(c19670M11146.f77453);
            AbstractC11242 abstractC11242M9461 = C3128.m9460(c18255M258910.f58253);
            AbstractC11242 abstractC11242 = c19670M11146.f77453;
            if (abstractC11242 != abstractC11242M9461) {
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c18255M258910, new C5909("compiler", "module.name.mismatch", abstractC11242M9460, abstractC11242));
            }
        } else {
            c19670M11146 = this.f41213.m11146(abstractC11242M9460);
            InterfaceC2173 interfaceC2173 = c19670M11146.f63139.f73415;
            if (interfaceC2173 != null && interfaceC2173 != c10164.f34725) {
                C5909 c59010 = C23879.f77204;
                c20414.m48199(c18255M258910, new C5909("compiler", "duplicate.module", c19670M11146));
                return;
            }
        }
        c19670M11146.f77451 = new C20791(this, c10164);
        c19670M11146.f63139.f73415 = c10164.f34725;
        c18255M258910.f58256 = c19670M11146;
        if (z || linkedHashSet.isEmpty()) {
            linkedHashSet.add(c19670M11146);
        } else {
            c20414.m48199(c10164, C23879.f77303);
        }
        C4603 c4603 = new C4603(c18255M258910, null);
        c4603.f16295 = c10164;
        this.f41182.m28680(c19670M11146, c4603);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:175:0x0388  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163 A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #3 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #3 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016f A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #3 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30609(C21825 c21825, LinkedHashSet linkedHashSet, C22492 c22492) {
        C23882 c23882;
        InterfaceC4290 interfaceC4290;
        InterfaceC2173 interfaceC2173M48202;
        String str;
        C12325 c12325;
        char c;
        InterfaceC4290 interfaceC4290Mo32958;
        C19670 c19670M11146;
        InterfaceC2173 interfaceC2173Mo32950;
        AbstractC11242 abstractC11242M17389;
        C12325 c12326 = this;
        boolean z = c12326.f41203;
        C23882 c23883 = c12326.f41180;
        C23942 c23942 = c12326.f41197;
        C20414 c20414 = c12326.f41202;
        C3836 c3836 = c12326.f41213;
        InterfaceC13464 interfaceC13464 = c12326.f41206;
        if (z) {
            Iterator it = c21825.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C10164 c10164 = (C10164) it.next();
                if (c10164.f34727.isEmpty()) {
                    c10164.f34730 = c3836.f14288;
                } else {
                    InterfaceC2173 interfaceC2173M48203 = c20414.m48202(c10164.f34725);
                    try {
                        try {
                            InterfaceC4290 interfaceC4290M30621 = c12326.m30621(c10164);
                            EnumC3584 enumC3584 = EnumC3584.PATCH_MODULE_PATH;
                            if (interfaceC13464.mo32953(enumC3584)) {
                                c = 0;
                                interfaceC4290Mo32958 = interfaceC13464.mo32958(enumC3584, c10164.f34725);
                            } else {
                                c = 0;
                                interfaceC4290Mo32958 = null;
                            }
                            if (interfaceC4290Mo32958 != null) {
                                AbstractC11242 abstractC11242M173810 = c23942.f77631.m17389(interfaceC13464.mo32946(interfaceC4290Mo32958));
                                C19670 c19670M52639 = c23883.m52639(abstractC11242M173810);
                                c10164.f34730 = c19670M52639;
                                linkedHashSet.add(c19670M52639);
                                z2 |= (c19670M52639.f77447 & 4503599627370496L) != 0;
                                if (interfaceC4290M30621 != null && abstractC11242M173810 != (abstractC11242M17389 = c23942.f77631.m17389(interfaceC13464.mo32946(interfaceC4290M30621)))) {
                                    C5909 c5909 = C23879.f77204;
                                    Object[] objArr = new Object[2];
                                    objArr[c] = abstractC11242M173810;
                                    objArr[1] = abstractC11242M17389;
                                    c20414.m48199(c10164, new C5909("compiler", "file.patched.and.msp", objArr));
                                }
                                c23883 = c23883;
                                c23942 = c23942;
                            } else {
                                it = it;
                                if (interfaceC4290M30621 != null) {
                                    if (c10164.m25899() != null && ((interfaceC2173Mo32950 = interfaceC13464.mo32950(interfaceC4290M30621, "module-info", EnumC11347.SOURCE)) == null || !interfaceC13464.mo22150(interfaceC2173Mo32950, c10164.f34725))) {
                                        c20414.m48199(c10164, C23879.f77191);
                                    }
                                    AbstractC11242 abstractC11242M173811 = c23942.f77631.m17389(interfaceC13464.mo32946(interfaceC4290M30621));
                                    C18255 c18255M25899 = c10164.m25899();
                                    if (c18255M25899 != null) {
                                        C19670 c19670 = c18255M25899.f58256;
                                        AbstractC11242 abstractC11242 = c19670.f77453;
                                        if (abstractC11242 != abstractC11242M173811) {
                                            AbstractC5930 abstractC5930 = c18255M25899.f58253;
                                            C5909 c59010 = C23879.f77204;
                                            Object[] objArr2 = new Object[2];
                                            objArr2[c] = abstractC11242;
                                            objArr2[1] = abstractC11242M173811;
                                            c20414.m48199(abstractC5930, new C5909("compiler", "module.name.mismatch", objArr2));
                                        }
                                        c19670M11146 = c19670;
                                    } else {
                                        c23883 = c23883;
                                        if (c10164.m25894() == null) {
                                            c20414.m48199(c10164, C23879.f77272);
                                        }
                                        c19670M11146 = c3836.m11146(abstractC11242M173811);
                                    }
                                    if (c19670M11146.f63138 == null) {
                                        c19670M11146.f63138 = interfaceC4290M30621;
                                        if (interfaceC13464.mo32953(enumC3584)) {
                                            c19670M11146.f63143 = interfaceC13464.mo32957(enumC3584, c19670M11146.f77453.toString());
                                        }
                                        EnumC3584 enumC3585 = EnumC3584.CLASS_OUTPUT;
                                        if (interfaceC13464.mo32953(enumC3585)) {
                                            InterfaceC4290 interfaceC4290Mo32957 = interfaceC13464.mo32957(enumC3585, c19670M11146.f77453.toString());
                                            if (c19670M11146.f63143 == null) {
                                                c19670M11146.f63152 = interfaceC4290Mo32957;
                                            } else {
                                                c19670M11146.f63136 = interfaceC4290Mo32957;
                                            }
                                        }
                                    }
                                    c10164.f34730 = c19670M11146;
                                    linkedHashSet.add(c19670M11146);
                                } else {
                                    c23883 = c23883;
                                    c23942 = c23942;
                                    if (c22492 != null) {
                                        C19670 c19671 = c22492.m52724().f25392;
                                        C19670 c19672 = c3836.f14288;
                                        if (c19671 == c19672) {
                                            c10164.f34730 = c19672;
                                        } else {
                                            if (c10164.m25899() != null) {
                                                c20414.m48199(c10164, C23879.f77191);
                                            } else {
                                                c20414.m48199(c10164, C23879.f77295);
                                            }
                                            c10164.f34730 = c3836.f14216;
                                        }
                                    } else {
                                        if (c10164.m25899() != null) {
                                            c20414.m48199(c10164, C23879.f77191);
                                        } else {
                                            c20414.m48199(c10164, C23879.f77295);
                                        }
                                        c10164.f34730 = c3836.f14216;
                                    }
                                }
                            }
                            c20414.m48202(interfaceC2173M48203);
                            c12326 = this;
                            it = it;
                            c23942 = c23942;
                            c23883 = c23883;
                        } catch (IOException e) {
                            throw new Error(e);
                        }
                    } catch (Throwable th) {
                        c20414.m48202(interfaceC2173M48203);
                        throw th;
                    }
                }
            }
            C23882 c23884 = c23883;
            if (!z2) {
                m30596();
            }
            C19670 c19673 = c3836.f14288;
            C19670 c19674 = c3836.f14288;
            if (c19673.f63138 == null) {
                c23884.m52640();
                c12325 = this;
                c19673.f77451 = new C15853(c12325);
                c19674.f63138 = EnumC3584.SOURCE_PATH;
                c19674.f63152 = EnumC3584.CLASS_PATH;
            } else {
                c12325 = this;
            }
            c12325.f41212 = c19674;
            return;
        }
        C19670 c19675 = null;
        if (c12326.f41212 == null) {
            if (interfaceC13464.mo32953(EnumC3584.PATCH_MODULE_PATH)) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = c21825.iterator();
                while (it2.hasNext()) {
                    try {
                        InterfaceC4290 interfaceC4290Mo32959 = interfaceC13464.mo32958(EnumC3584.PATCH_MODULE_PATH, ((C10164) it2.next()).f34725);
                        if (interfaceC4290Mo32959 != null) {
                            linkedHashSet2.add(interfaceC13464.mo32946(interfaceC4290Mo32959));
                        }
                    } catch (IOException e2) {
                        throw new Error(e2);
                    }
                }
                int size = linkedHashSet2.size();
                if (size == 0) {
                    str = null;
                } else if (size != 1) {
                    C5909 c59011 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "too.many.patched.modules", linkedHashSet2));
                    str = null;
                } else {
                    str = (String) linkedHashSet2.iterator().next();
                }
            } else {
                str = null;
            }
            int size2 = linkedHashSet.size();
            if (size2 == 0) {
                try {
                    c12326.f41212 = c23883.m52642();
                } catch (C4146 e3) {
                    c12326.f41189.m47261((InterfaceC12260) null, e3);
                    c12326.f41212 = c3836.f14288;
                }
                C19670 c19676 = c12326.f41212;
                if (c19676 != c3836.f14288) {
                    c23882 = c23883;
                    m30596();
                    c12326.f41212.mo49994();
                    C19670 c19677 = c12326.f41212;
                    c19677.f77451 = new C1188(c12326);
                    c19677.f63138 = EnumC3584.SOURCE_PATH;
                } else if (str != null) {
                    AbstractC6302 abstractC6302 = c23942.f77631;
                    abstractC6302.getClass();
                    char[] charArray = str.toCharArray();
                    AbstractC11242 abstractC11242Mo17390 = abstractC6302.mo17390(charArray, charArray.length);
                    c23882 = c23883;
                    C19670 c19670M526310 = c23882.m52639(abstractC11242Mo17390);
                    c12326.f41212 = c19670M526310;
                    c19670M526310.f63136 = EnumC3584.CLASS_OUTPUT;
                    if ((4503599627370496L & c19670M526310.f77447) == 0) {
                        m30596();
                    }
                } else {
                    c23882 = c23883;
                    c23882.m52640();
                    c19676.f77451 = new C15853(c12326);
                    C19670 c19678 = c12326.f41212;
                    c19678.f63138 = EnumC3584.SOURCE_PATH;
                    c19678.f63152 = EnumC3584.CLASS_PATH;
                }
                linkedHashSet.add(c12326.f41212);
            } else {
                if (size2 != 1) {
                    C6171.m17174("too many modules");
                    throw null;
                }
                m30596();
                C19670 c19679 = (C19670) linkedHashSet.iterator().next();
                c12326.f41212 = c19679;
                c19679.f63138 = EnumC3584.SOURCE_PATH;
                EnumC3584 enumC3586 = EnumC3584.PATCH_MODULE_PATH;
                if (interfaceC13464.mo32953(enumC3586)) {
                    try {
                        C19670 c196710 = c12326.f41212;
                        c196710.f63143 = interfaceC13464.mo32957(enumC3586, c196710.f77453.toString());
                    } catch (IOException e4) {
                        throw new Error(e4);
                    }
                }
                C19670 c196711 = c12326.f41212;
                if (c196711.f63143 == null) {
                    c196711.f63152 = EnumC3584.CLASS_OUTPUT;
                } else {
                    c196711.f63136 = EnumC3584.CLASS_OUTPUT;
                }
                c23882 = c23883;
            }
        } else {
            c23882 = c23883;
            if (linkedHashSet.size() == 1) {
                c19675 = (C19670) linkedHashSet.iterator().next();
                c19675.mo49994();
                c19675.f77451 = new C21778(8, c12326);
            } else {
                C6171.m17176(linkedHashSet.isEmpty());
                C6171.m17171(c22492);
                c19675 = c22492.m52724().f25392;
                linkedHashSet.add(c19675);
            }
        }
        C19670 c196712 = c12326.f41212;
        C19670 c196713 = c3836.f14288;
        C19670 c196714 = c3836.f14288;
        if (c196712 != c196713) {
            c23882.m52640();
            c196713.f77451 = new C15853(c12326);
            c196714.f63152 = EnumC3584.CLASS_PATH;
        }
        if (c19675 == null) {
            c19675 = c12326.f41212;
        }
        Iterator it3 = c21825.iterator();
        while (it3.hasNext()) {
            C10164 c10165 = (C10164) it3.next();
            C19670 c196715 = c12326.f41212;
            if (c196715 != c196714) {
                InterfaceC4290 interfaceC4291 = c196715.f63138;
                EnumC3584 enumC3587 = EnumC3584.SOURCE_PATH;
                if (interfaceC4291 == enumC3587 && interfaceC13464.mo32953(enumC3587)) {
                    try {
                        InterfaceC2173 interfaceC2173 = c10165.f34725;
                        if (!interfaceC13464.mo32954(c19675.f63138, (InterfaceC3458) interfaceC2173) && ((interfaceC4290 = c19675.f63143) == null || !interfaceC13464.mo32954(interfaceC4290, (InterfaceC3458) interfaceC2173))) {
                            EnumC3584 enumC3588 = EnumC3584.SOURCE_OUTPUT;
                            if (interfaceC13464.mo32953(enumC3588)) {
                                if (!interfaceC13464.mo32954((InterfaceC4290) enumC3588, (InterfaceC3458) interfaceC2173)) {
                                    interfaceC2173M48202 = c20414.m48202(c10165.f34725);
                                    try {
                                        c20414.m48199(c10165, C23879.f77321);
                                        c20414.m48202(interfaceC2173M48202);
                                    } catch (Throwable th2) {
                                        c20414.m48202(interfaceC2173M48202);
                                        throw th2;
                                    }
                                }
                            } else if (interfaceC13464.mo32954((InterfaceC4290) EnumC3584.CLASS_OUTPUT, (InterfaceC3458) interfaceC2173)) {
                                continue;
                            } else {
                                interfaceC2173M48202 = c20414.m48202(c10165.f34725);
                                c20414.m48199(c10165, C23879.f77321);
                                c20414.m48202(interfaceC2173M48202);
                            }
                        }
                    } catch (IOException e5) {
                        throw new Error(e5);
                    }
                }
            }
            c10165.f34730 = c19675;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private InterfaceC4290 m30621(C10164 c10164) {
        InterfaceC2173 interfaceC2173 = c10164.f34725;
        EnumC3584 enumC3584 = EnumC3584.MODULE_SOURCE_PATH;
        InterfaceC13464 interfaceC13464 = this.f41206;
        InterfaceC4290 interfaceC4290Mo32958 = interfaceC13464.mo32958(enumC3584, interfaceC2173);
        if (interfaceC4290Mo32958 != null) {
            return interfaceC4290Mo32958;
        }
        EnumC3584 enumC3585 = EnumC3584.SOURCE_OUTPUT;
        if (!interfaceC13464.mo32953(enumC3585)) {
            enumC3585 = EnumC3584.CLASS_OUTPUT;
        }
        return interfaceC13464.mo32958(enumC3585, interfaceC2173);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m30596() {
        String str = this.f41196;
        if (str == null || !Arrays.asList(str.split(",")).contains("ALL-MODULE-PATH")) {
            return;
        }
        this.f41202.m48197(C23879.f77275);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m30594(C12325 c12325, C19670 c19670) {
        InterfaceC13464 interfaceC13464 = c12325.f41206;
        try {
            C19003 c19003 = new C19003();
            C19003 c19004 = new C19003();
            HashSet hashSet = new HashSet();
            Iterator it = interfaceC13464.mo32947(c19670.f63152, "", (Set) EnumSet.of(EnumC11347.CLASS), true).iterator();
            while (it.hasNext()) {
                String strMo32948 = interfaceC13464.mo32948(c19670.f63152, (InterfaceC2173) it.next());
                String strSubstring = strMo32948.lastIndexOf(46) != -1 ? strMo32948.substring(0, strMo32948.lastIndexOf(46)) : "";
                if (hashSet.add(strSubstring)) {
                    C5537 c5537 = new C5537(c12325.f41213.m11157(c19670, c12325.f41197.f77631.m17389(strSubstring)), null);
                    c19003.m43723(c5537);
                    c19004.m43723(c5537);
                }
            }
            c19670.f63142 = c19004.m43726();
            c19670.f63140 = C21825.m48588();
            c19670.f63134 = C21825.m48588();
            c19670.f63151 = C21825.m48588();
            c19670.f63146 = c19003.m43726();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m30630() {
        C6171.m17171(this.f41211);
        return this.f41211;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m30611(C12325 c12325, Set set, C19670 c19670) {
        if (set == null) {
            c12325.f41180.m52641(c19670);
            return c19670.f77452 != EnumC10477.f35866;
        }
        c12325.getClass();
        return set.contains(c19670);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m30625(C19670 c19670) {
        c19670.mo49994();
        return C9030.stream(c19670.f63142).anyMatch(new C21496(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30633(C19670 c19670) {
        LinkedHashSet linkedHashSet = this.f41211;
        return linkedHashSet == null || linkedHashSet.contains(c19670);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashSet m30598(HashSet hashSet, Set set, LinkedHashSet linkedHashSet) {
        C19670 c19670;
        boolean z;
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825M48589 = C21825.m48588();
        for (Object obj : hashSet) {
            if (set.contains(obj)) {
                c21825M48588 = c21825M48588.m48597(obj);
            } else {
                c21825M48589 = c21825M48589.m48597(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C3836 c3836 = this.f41213;
        linkedHashSet2.add(c3836.f14235);
        C21825 c21825M48597 = c21825M48589;
        C21825 c21825M48598 = c21825M48588;
        while (true) {
            if (!c21825M48598.m48595() && !c21825M48597.m48595()) {
                return linkedHashSet2;
            }
            try {
                if (c21825M48598.m48595()) {
                    c19670 = (C19670) c21825M48598.f70876;
                    c21825M48598 = c21825M48598.f70877;
                    z = true;
                } else {
                    c19670 = (C19670) c21825M48597.f70876;
                    c21825M48597 = c21825M48597.f70877;
                    z = false;
                }
                if ((linkedHashSet == null || linkedHashSet.contains(c19670)) && linkedHashSet2.add(c19670) && c19670 != c3836.f14288 && (c19670.f77447 & 4503599627370496L) == 0) {
                    c19670.mo49994();
                    if (c19670.f77452 == EnumC10477.f35866) {
                        if (!z) {
                            try {
                                if (hashSet.contains(c19670)) {
                                }
                            } catch (C4146 e) {
                                e = e;
                                this.f41189.m47261((InterfaceC12260) null, e);
                            }
                        }
                        if (this.f41184.add(c19670)) {
                            C20414 c20414 = this.f41202;
                            C5909 c5909 = C23879.f77204;
                            c20414.m48197(new C5909("compiler", "module.not.found", c19670));
                        }
                    }
                    for (C6948 c6948 : c19670.f63134) {
                        if (c6948.f23371 != c3836.f14235) {
                            if ((c6948.f23370.contains(EnumC23177.TRANSITIVE) && z) || set.contains(c19670)) {
                                c21825M48598 = c21825M48598.m48597(c6948.f23371);
                            } else {
                                c21825M48597 = c21825M48597.m48597(c6948.f23371);
                            }
                        }
                    }
                }
            } catch (C4146 e2) {
                e = e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m30618(final C19670 c19670) {
        HashMap map;
        Object obj;
        String[] strArrSplit;
        int length;
        int i;
        String str;
        String[] strArr;
        C19670 c19670M11146;
        if (this.f41207) {
            c19670.f77451 = new InterfaceC13320() { // from class: l.ᩴۢۤ
                @Override // l.InterfaceC13320
                /* JADX INFO: renamed from: ۙ */
                public final void mo1179(AbstractC23903 abstractC23903) {
                    this.f60611.m30618(c19670);
                }

                @Override // l.InterfaceC13320
                /* JADX INFO: renamed from: ۨ */
                public final /* synthetic */ boolean mo1180() {
                    return false;
                }
            };
            return;
        }
        long j = c19670.f77447 & 4503599627370496L;
        C3836 c3836 = this.f41213;
        if (j != 0) {
            C19003 c19003 = new C19003();
            c19003.addAll(c19670.f63146);
            C19003 c19004 = new C19003();
            for (C19670 c19671 : m30630()) {
                if (c19671 != c3836.f14288 && c19671 != c19670) {
                    C6948 c6948 = new C6948(c19671, (c19671.f77447 & 4503599627370496L) != 0 ? EnumSet.of(EnumC23177.TRANSITIVE) : EnumSet.noneOf(EnumC23177.class));
                    c19003.m43723(c6948);
                    c19004.m43723(c6948);
                }
            }
            C6948 c6949 = new C6948(c3836.f14288, EnumSet.noneOf(EnumC23177.class));
            c19003.m43723(c6949);
            c19004.m43723(c6949);
            c19670.f63134 = c19004.m43726();
            c19670.f63146 = c19003.m43726();
        }
        C6171.m17171(c19670.f63134);
        LinkedHashMap linkedHashMap = this.f41183;
        int i2 = 1;
        C20414 c20414 = this.f41202;
        if (linkedHashMap == null) {
            this.f41183 = new LinkedHashMap();
            String str2 = this.f41187;
            if (str2 != null) {
                Pattern patternCompile = Pattern.compile("([^=]+)=(.*)");
                String[] strArrSplit2 = str2.split("\u0000+");
                int length2 = strArrSplit2.length;
                int i3 = 0;
                while (i3 < length2) {
                    String str3 = strArrSplit2[i3];
                    if (!str3.isEmpty()) {
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(i2);
                            String strGroup2 = matcher.group(2);
                            if (m30610(strGroup)) {
                                C23942 c23942 = this.f41197;
                                C19670 c19670M11147 = c3836.m11146(c23942.f77631.m17389(strGroup));
                                boolean zContains = this.f41211.contains(c19670M11147);
                                boolean z = this.f41209;
                                if (zContains) {
                                    if (this.f41181) {
                                        strArrSplit = strGroup2.split("[ ,]+", -1);
                                        length = strArrSplit.length;
                                        i = 0;
                                        while (i < length) {
                                            str = strArrSplit[i];
                                            String[] strArr2 = strArrSplit2;
                                            if (str.equals("ALL-UNNAMED")) {
                                                c19670M11146 = c3836.f14288;
                                                strArr = strArrSplit;
                                            } else {
                                                if (m30610(str)) {
                                                    AbstractC6302 abstractC6302 = c23942.f77631;
                                                    abstractC6302.getClass();
                                                    char[] charArray = str.toCharArray();
                                                    strArr = strArrSplit;
                                                    c19670M11146 = c3836.m11146(abstractC6302.mo17390(charArray, charArray.length));
                                                    if (!this.f41211.contains(c19670M11146)) {
                                                        if (z) {
                                                            c20414.m48195(EnumC0597.OPTIONS, C9768.m24751(EnumC19730.f63368, c19670M11146));
                                                        }
                                                    }
                                                    i++;
                                                    strArrSplit2 = strArr2;
                                                    strArrSplit = strArr;
                                                    c23942 = c23942;
                                                } else {
                                                    strArr = strArrSplit;
                                                }
                                                i++;
                                                strArrSplit2 = strArr2;
                                                strArrSplit = strArr;
                                                c23942 = c23942;
                                            }
                                            ((Set) C9735.computeIfAbsent(this.f41183, c19670M11147, new C13030(0))).add(new C6948(c19670M11146, EnumSet.of(EnumC23177.EXTRA)));
                                            i++;
                                            strArrSplit2 = strArr2;
                                            strArrSplit = strArr;
                                            c23942 = c23942;
                                        }
                                    } else {
                                        int i4 = i2;
                                        if ((c19670M11147.f77447 & 9007199254740992L) != 0) {
                                            C5909 c5909 = C23879.f77204;
                                            Object[] objArr = new Object[i4];
                                            objArr[0] = c19670M11147;
                                            c20414.m48197(new C5909("compiler", "add.reads.with.release", objArr));
                                        } else {
                                            strArrSplit = strGroup2.split("[ ,]+", -1);
                                            length = strArrSplit.length;
                                            i = 0;
                                            while (i < length) {
                                                str = strArrSplit[i];
                                                String[] strArr3 = strArrSplit2;
                                                if (str.equals("ALL-UNNAMED")) {
                                                    c19670M11146 = c3836.f14288;
                                                    strArr = strArrSplit;
                                                } else {
                                                    if (m30610(str)) {
                                                        strArr = strArrSplit;
                                                    } else {
                                                        AbstractC6302 abstractC6303 = c23942.f77631;
                                                        abstractC6303.getClass();
                                                        char[] charArray2 = str.toCharArray();
                                                        strArr = strArrSplit;
                                                        c19670M11146 = c3836.m11146(abstractC6303.mo17390(charArray2, charArray2.length));
                                                        if (!this.f41211.contains(c19670M11146)) {
                                                            if (z) {
                                                                c20414.m48195(EnumC0597.OPTIONS, C9768.m24751(EnumC19730.f63368, c19670M11146));
                                                            }
                                                        }
                                                        i++;
                                                        strArrSplit2 = strArr3;
                                                        strArrSplit = strArr;
                                                        c23942 = c23942;
                                                    }
                                                    i++;
                                                    strArrSplit2 = strArr3;
                                                    strArrSplit = strArr;
                                                    c23942 = c23942;
                                                }
                                                ((Set) C9735.computeIfAbsent(this.f41183, c19670M11147, new C13030(0))).add(new C6948(c19670M11146, EnumSet.of(EnumC23177.EXTRA)));
                                                i++;
                                                strArrSplit2 = strArr3;
                                                strArrSplit = strArr;
                                                c23942 = c23942;
                                            }
                                        }
                                    }
                                } else if (z) {
                                    c20414.m48201(C9768.m24751(EnumC19730.f63368, c19670M11147));
                                }
                            }
                        }
                    }
                    i3++;
                    i2 = 1;
                    strArrSplit2 = strArrSplit2;
                }
            }
        }
        C21825 c21825 = c19670.f63134;
        C21825 c21825M48583 = C21825.m48583((Iterable) C9735.getOrDefault(this.f41183, c19670, Collections.EMPTY_SET));
        c21825.getClass();
        C21825 c21825M48594 = c21825M48583.m48594(c21825);
        c19670.f63134 = c21825M48594;
        while (c21825M48594.m48595()) {
            if (!m30630().contains(((C6948) c21825M48594.f70876).f23371)) {
                C4603 c4603M28678 = this.f41182.m28678(c19670);
                if (c4603M28678 != null) {
                    InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603M28678.f16295.f34725);
                    try {
                        AbstractC8774 abstractC8774 = c4603M28678.f16296;
                        C19670 c19672 = ((C6948) c21825M48594.f70876).f23371;
                        C5909 c59010 = C23879.f77204;
                        c20414.m48199(abstractC8774, new C5909("compiler", "module.not.found", c19672));
                        c20414.m48202(interfaceC2173M48202);
                    } catch (Throwable th) {
                        c20414.m48202(interfaceC2173M48202);
                        throw th;
                    }
                } else {
                    C6171.m17176((c19670.f77447 & 4503599627370496L) == 0);
                }
                c19670.f63134 = C21825.m48585((C6948) c21825M48594.f70876, c19670.f63134);
            }
            c21825M48594 = c21825M48594.f70877;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        Iterator it = c19670.f63134.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f41204;
            if (!zHasNext) {
                break;
            }
            C6948 c69410 = (C6948) it.next();
            final C19670 c19673 = c69410.f23371;
            c19673.mo49994();
            linkedHashSet.add(c19673);
            Set set = (Set) map.get(c19673);
            if (set == null) {
                obj = set;
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                C21825 c21825Of = C21825.of((Object) c19673);
                while (c21825Of.m48595()) {
                    final C19670 c19674 = (C19670) c21825Of.f70876;
                    c21825Of = c21825Of.f70877;
                    if (hashSet3.add(c19674)) {
                        hashSet2.add(c19674);
                        c19674.mo49994();
                        if (c19674 != c3836.f14288) {
                            C6171.m17172(c19674.f63134, new Supplier() { // from class: l.ۘۢۤ
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return c19674 + ".requires == null; " + c19673;
                                }
                            });
                            for (C6948 c69411 : c19674.f63134) {
                                if (c69411.f23370.contains(EnumC23177.TRANSITIVE)) {
                                    c21825Of = c21825Of.m48597(c69411.f23371);
                                }
                            }
                        } else {
                            Iterator it2 = m30630().iterator();
                            while (it2.hasNext()) {
                                c21825Of = c21825Of.m48597((C19670) it2.next());
                            }
                        }
                    }
                }
                hashSet2.remove(c19673);
                obj = hashSet2;
            }
            obj = set;
            linkedHashSet.addAll(obj);
            if (c69410.f23370.contains(EnumC23177.TRANSITIVE)) {
                hashSet.add(c19673);
                hashSet.addAll(obj);
            }
        }
        map.put(c19670, hashSet);
        m30608(c19670, linkedHashSet);
        Iterator it3 = c19670.f63142.iterator();
        while (it3.hasNext()) {
            C7675 c7675 = ((C5537) it3.next()).f18986;
            if (c7675 != null) {
                c7675.f25392 = c19670;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30604(C12325 c12325, C19670 c19670, HashMap map, C19670 c19671, Set set) {
        if (c19670.f63150.contains(c19671)) {
            c12325.m30607(c19670, map, c19671, set);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30607(C19670 c19670, HashMap map, C19670 c19671, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5537 c5537 = (C5537) it.next();
            C21825 c21825 = c5537.f18987;
            C7675 c7675 = c5537.f18986;
            if (c21825 == null || c21825.contains(c19670)) {
                AbstractC11242 abstractC11242 = c7675.f25396;
                C19670 c19672 = (C19670) map.get(abstractC11242);
                if (c19672 != null && c19672 != c19671) {
                    C4603 c4603M28678 = this.f41182.m28678(c19670);
                    AbstractC8774 abstractC8774 = null;
                    C20414 c20414 = this.f41202;
                    InterfaceC2173 interfaceC2173M48202 = c4603M28678 != null ? c20414.m48202(c4603M28678.f16295.f34725) : null;
                    if (c4603M28678 != null) {
                        abstractC8774 = c4603M28678.f16296;
                        abstractC8774.getClass();
                    }
                    try {
                        if (c19670.m44806()) {
                            C5909 c5909 = C23879.f77204;
                            c20414.m48199(abstractC8774, new C5909("compiler", "package.clash.from.requires.in.unnamed", abstractC11242, c19672, c19671));
                        } else {
                            C5909 c59010 = C23879.f77204;
                            c20414.m48199(abstractC8774, new C5909("compiler", "package.clash.from.requires", c19670, abstractC11242, c19672, c19671));
                        }
                        if (c4603M28678 != null) {
                            c20414.m48202(interfaceC2173M48202);
                        }
                    } catch (Throwable th) {
                        if (c4603M28678 != null) {
                            c20414.m48202(interfaceC2173M48202);
                        }
                        throw th;
                    }
                } else {
                    map.put(abstractC11242, c19671);
                    c19670.f63148.put(c7675.f25396, c7675);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30608(final C19670 c19670, HashSet hashSet) {
        String[] strArr;
        C19670 c19670M11146;
        LinkedHashMap linkedHashMap = this.f41186;
        C3836 c3836 = this.f41213;
        if (linkedHashMap == null) {
            this.f41186 = new LinkedHashMap();
            HashSet hashSet2 = new HashSet();
            String str = this.f41199;
            if (str != null) {
                Pattern patternCompile = Pattern.compile("([^/]+)/([^=]+)=(.*)");
                String[] strArrSplit = str.split("\u0000+");
                int length = strArrSplit.length;
                char c = 0;
                int i = 0;
                while (i < length) {
                    String str2 = strArrSplit[i];
                    if (str2.isEmpty()) {
                        strArr = strArrSplit;
                    } else {
                        Matcher matcher = patternCompile.matcher(str2);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            String strGroup2 = matcher.group(2);
                            String strGroup3 = matcher.group(3);
                            if (m30610(strGroup)) {
                                AbstractC6302 abstractC6302 = this.f41197.f77631;
                                C19670 c19670M11147 = c3836.m11146(abstractC6302.m17389(strGroup));
                                if (!m30626(c19670M11147, hashSet2) || !m30610(strGroup2)) {
                                    strArr = strArrSplit;
                                } else if (!this.f41181 && (c19670M11147.f77447 & 9007199254740992L) != 0) {
                                    C5909 c5909 = C23879.f77204;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = c19670M11147;
                                    this.f41202.m48197(new C5909("compiler", "add.exports.with.release", objArr));
                                    strArr = strArrSplit;
                                } else {
                                    C7675 c7675M11157 = c3836.m11157(c19670M11147, abstractC6302.m17389(strGroup2));
                                    c7675M11157.f25392 = c19670M11147;
                                    C21825 c21825M48588 = C21825.m48588();
                                    String[] strArrSplit2 = strGroup3.split("[ ,]+");
                                    int length2 = strArrSplit2.length;
                                    int i2 = 0;
                                    while (i2 < length2) {
                                        String str3 = strArrSplit2[i2];
                                        String[] strArr2 = strArrSplit;
                                        if (str3.equals("ALL-UNNAMED")) {
                                            c19670M11146 = c3836.f14288;
                                        } else {
                                            if (m30610(str3)) {
                                                char[] charArray = str3.toCharArray();
                                                c19670M11146 = c3836.m11146(abstractC6302.mo17390(charArray, charArray.length));
                                                if (!m30626(c19670M11146, hashSet2)) {
                                                }
                                            }
                                            i2++;
                                            strArrSplit = strArr2;
                                        }
                                        c21825M48588 = c21825M48588.m48597(c19670M11146);
                                        i2++;
                                        strArrSplit = strArr2;
                                    }
                                    strArr = strArrSplit;
                                    ((Set) C9735.computeIfAbsent(this.f41186, c19670M11147, new C22057(6))).add(new C5537(c7675M11157, c21825M48588));
                                }
                            } else {
                                strArr = strArrSplit;
                            }
                        } else {
                            strArr = strArrSplit;
                        }
                    }
                    i++;
                    c = 0;
                    strArrSplit = strArr;
                }
            }
        }
        c19670.f63148 = new LinkedHashMap();
        c19670.f63150 = new HashSet(hashSet);
        final HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C19670 c19671 = (C19670) it.next();
            if (c19671 != c3836.f14288) {
                m30607(c19670, map, c19671, c19671.f63142);
            }
        }
        C9735.forEach(this.f41186, new BiConsumer() { // from class: l.ۜۢۤ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C12325.m30604(this.f22539, c19670, map, (C19670) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C2866.$default$andThen(this, biConsumer);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m30626(C19670 c19670, HashSet hashSet) {
        if (this.f41211.contains(c19670)) {
            return true;
        }
        if (hashSet.contains(c19670)) {
            return false;
        }
        if (this.f41209) {
            this.f41202.m48195(EnumC0597.OPTIONS, C9768.m24751(EnumC19730.f63353, c19670));
        }
        hashSet.add(c19670);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30602(C12325 c12325, C18255 c18255) {
        for (AbstractC20042 abstractC20042 : c18255.f58254) {
            if (abstractC20042.m22847(EnumC18651.f60570)) {
                C6260 c6260 = (C6260) abstractC20042;
                if (c6260.f21223 != null) {
                    HashSet hashSet = new HashSet();
                    C21825 c21825Of = C21825.of((Object) c6260.f21223.f23371);
                    while (c21825Of.m48595()) {
                        final C19670 c19670 = (C19670) c21825Of.f70876;
                        c21825Of = c21825Of.f70877;
                        if (hashSet.add(c19670)) {
                            c19670.mo49994();
                            if ((c19670.f77447 & 4503599627370496L) == 0) {
                                C6171.m17172(c19670.f63134, new Supplier() { // from class: l.ᩳۢۤ
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c19670.toString();
                                    }
                                });
                                for (C6948 c6948 : c19670.f63134) {
                                    if (!c6948.f23370.contains(EnumC23177.EXTRA)) {
                                        c21825Of = c21825Of.m48597(c6948.f23371);
                                    }
                                }
                            }
                        }
                    }
                    if (hashSet.contains(c18255.f58256)) {
                        C20414 c20414 = c12325.f41202;
                        AbstractC5930 abstractC5930 = c6260.f21222;
                        abstractC5930.getClass();
                        C19670 c19671 = c6260.f21223.f23371;
                        C5909 c5909 = C23879.f77204;
                        c20414.m48199(abstractC5930, new C5909("compiler", "cyclic.requires", c19671));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30610(String str) {
        return EnumC12508.m31072(str, EnumC11909.m29707(this.f41195));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m30636() {
        this.f41211 = null;
        this.f41188 = null;
        this.f41212 = null;
        this.f41184.clear();
    }

    public C12325(C12343 c12343) {
        c12343.m30657(C12325.class, this);
        this.f41202 = C20414.m46161(c12343);
        C23942 c23942M52776 = C23942.m52776(c12343);
        this.f41197 = c23942M52776;
        this.f41213 = C3836.m11131(c12343);
        this.f41185 = C6761.m18268(c12343);
        this.f41189 = C21017.m47211(c12343);
        this.f41201 = C2714.m8268(c12343);
        this.f41182 = C11492.m28677(c12343);
        this.f41180 = C23882.m52634(c12343);
        this.f41193 = C23800.m52336(c12343);
        InterfaceC13464 interfaceC13464 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        this.f41206 = interfaceC13464;
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f41195 = enumC11909M29706;
        this.f41200 = EnumC14128.m34159(c12343);
        this.f41198 = EnumC14026.f46096.m33945(enumC11909M29706);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f41181 = c14770M35395.m35405(EnumC19730.f63388);
        this.f41209 = c14770M35395.m35409(EnumC19730.f63399, "-" + EnumC0597.OPTIONS.f2616);
        boolean zMo32953 = interfaceC13464.mo32953(EnumC3584.MODULE_SOURCE_PATH);
        this.f41203 = zMo32953;
        C11450.m28569(c12343).f38546 = zMo32953;
        C22822.m50514(c12343).f74249 = zMo32953;
        AbstractC6302 abstractC6302 = c23942M52776.f77631;
        abstractC6302.getClass();
        char[] charArray = "java.se".toCharArray();
        this.f41194 = abstractC6302.mo17390(charArray, charArray.length);
        char[] charArray2 = "java.".toCharArray();
        this.f41192 = abstractC6302.mo17390(charArray2, charArray2.length);
        this.f41199 = c14770M35395.m35398(EnumC19730.f63353);
        this.f41187 = c14770M35395.m35398(EnumC19730.f63368);
        this.f41196 = c14770M35395.m35398(EnumC19730.f63330);
        this.f41190 = c14770M35395.m35398(EnumC19730.f63404);
    }
}
