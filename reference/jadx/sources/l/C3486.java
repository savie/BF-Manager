package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3486 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f12039;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10132 f12040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10878 f12041 = new C10878();

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "FixTypesVisitor";
    }

    static {
        C16980.m40037(C3486.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f12040 = c1610.m5685();
        this.f12041.mo8439(c1610);
        int i = 0;
        int i2 = 3;
        this.f12039 = Arrays.asList(new C5724(i, this), new C15309(i2, this), new C11689(i, this), new C15135(i2, this), new C24665(i2, this), new Function() { // from class: l.᩻ܳ᩵
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(C3486.m11470(this.f81238, (C2551) obj));
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }, new C16910(i, this), new C17656(i, this), new C6361(this), new C16164(i, this));
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524() || m11473(c2551)) {
            return;
        }
        try {
            Iterator it = this.f12039.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Function) it.next()).apply(c2551)).booleanValue() && m11473(c2551)) {
                    return;
                }
            }
        } catch (Exception e) {
            C23977.m53506(c2551, "Types fix failed", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11473(C2551 c2551) {
        Iterator it = c2551.m8490().iterator();
        while (it.hasNext()) {
            if (!((C17973) it.next()).m41943().m51445().mo5564()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11465(C2551 c2551, C17973 c17973) {
        C15867 c15867M11463 = m11463(c17973.m41943().m51443());
        if (c15867M11463.isEmpty()) {
            return false;
        }
        EnumC4695 enumC4695M26140 = this.f12040.m26140(c2551, c17973, (AbstractC1566) c15867M11463.get());
        return enumC4695M26140 != EnumC4695.REJECT && enumC4695M26140 == EnumC4695.CHANGED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15867 m11463(LinkedHashSet linkedHashSet) {
        return C1170.stream(linkedHashSet).map(new C3900(8)).filter(new C22075(0)).max(this.f12040.m26142().m23402());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m11461(AbstractC1566 abstractC1566, C17973 c17973) {
        if (abstractC1566.m5554()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = m11461(abstractC1566.mo5557(), (C17973) null).iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1566.m5528((AbstractC1566) it.next()));
            }
            return arrayList;
        }
        if (c17973 != null) {
            Iterator it2 = c17973.m41943().m51443().iterator();
            while (it2.hasNext()) {
                AbstractC1566 type = ((InterfaceC20640) it2.next()).getType();
                if (type.mo5543() || type.m5554()) {
                    return Collections.EMPTY_LIST;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (EnumC12006 enumC12006 : abstractC1566.mo5560()) {
            if (enumC12006 != EnumC12006.VOID) {
                arrayList2.add(AbstractC1566.m5536(enumC12006));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean m11468(C2551 c2551) {
        boolean z;
        boolean zM11465;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        for (C17973 c17973 : c2551.m8490()) {
            if (c17973.m41942()) {
                z = false;
            } else {
                AbstractC1566 abstractC1566M51445 = c17973.m41943().m51445();
                if (abstractC1566M51445.mo5564()) {
                    z = false;
                } else {
                    try {
                        zM11465 = m11465(c2551, c17973);
                    } catch (C2631 e) {
                        throw e;
                    } catch (Exception e2) {
                        c2551.m31134("Failed to calculate best type for var: " + c17973, e2);
                        zM11465 = false;
                    }
                    if (!zM11465) {
                        List listM11461 = m11461(abstractC1566M51445, c17973);
                        if (listM11461.isEmpty()) {
                            z2 = false;
                            break;
                        }
                        Iterator it = listM11461.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (this.f12040.m26140(c2551, c17973, (AbstractC1566) it.next()) == EnumC4695.CHANGED) {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = c17973.m41943().m51443().iterator();
                            while (it2.hasNext()) {
                                AbstractC1566 type = ((InterfaceC20640) it2.next()).getType();
                                if (type.mo5564() && type.mo5543()) {
                                    linkedHashSet.add(type);
                                }
                            }
                            if (linkedHashSet.isEmpty()) {
                                z3 = false;
                                break;
                            }
                            C21681 c21681M5691 = c2551.mo8527().m5691();
                            Iterator it3 = linkedHashSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                Iterator it4 = c21681M5691.m49227(((AbstractC1566) it3.next()).mo5570()).iterator();
                                while (it4.hasNext()) {
                                    if (this.f12040.m26144(c2551, c17973, AbstractC1566.m5538((String) it4.next())) == EnumC4695.CHANGED) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            if (!z3) {
                                z = false;
                            }
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                z4 = true;
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m11471(C3486 c3486, C2551 c2551) {
        boolean z = true;
        for (C17973 c17973 : c2551.m8490()) {
            if (!c17973.m41943().m51445().mo5564() && !c17973.m41942()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = c17973.m41943().m51443().iterator();
                while (it.hasNext()) {
                    AbstractC1566 type = ((InterfaceC20640) it.next()).getType();
                    if (type.mo5564() && type.mo5543()) {
                        linkedHashSet.add(type);
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AbstractC1566 abstractC1566 = (AbstractC1566) it2.next();
                            if (abstractC1566.mo5543() && abstractC1566.m5552()) {
                                if (c3486.f12040.m26144(c2551, c17973, abstractC1566.m5569() ? AbstractC1566.f5426 : AbstractC1566.m5538(abstractC1566.mo5570())) == EnumC4695.CHANGED) {
                                    c2551.m31133("Type inference failed for " + c17973.m41926() + ". Raw type applied. Possible types: " + C4123.m13221(linkedHashSet, ", "));
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
                break;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m11460(C3486 c3486, C2551 c2551) {
        boolean z;
        C10878 c10878 = c3486.f12041;
        try {
            List listM8490 = c2551.m8490();
            int size = listM8490.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                z = true;
                if (i >= size) {
                    break;
                }
                if (m11466(c2551, (C17973) listM8490.get(i), true)) {
                    z2 = true;
                }
                i++;
            }
            if (!z2) {
                return Boolean.FALSE;
            }
            C22821.m51450(c2551);
            c10878.m27626(c2551);
            c10878.m27625(c2551);
            Iterator it = c2551.m8490().iterator();
            while (it.hasNext()) {
                if (m11466(c2551, (C17973) it.next(), false)) {
                    z = false;
                }
            }
            if (!z) {
                c10878.m27626(c2551);
                c10878.m27625(c2551);
                c2551.m31138("Type inference incomplete: some casts might be missing");
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            c2551.m31134("Type inference fix 'apply assigned field type' failed", e);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11466(C2551 c2551, C17973 c17973, boolean z) {
        C18959 c18959M41951;
        EnumC24203 type;
        boolean z2;
        C21219 c21219;
        AbstractC16481 abstractC16481Mo13131;
        InterfaceC21197 interfaceC21197M19301;
        C3319 c3319M11462;
        boolean z3 = false;
        if (!c17973.m41943().m51445().mo5564() && !c17973.m41942() && (c18959M41951 = c17973.m41951()) != null && ((type = c18959M41951.getType()) == EnumC24203.IGET || type == EnumC24203.SGET)) {
            AbstractC1566 abstractC1566M17531 = c18959M41951.m44027().m17531();
            z3 = true;
            if (z) {
                Iterator it = c17973.m41946().iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    C18959 c18959M39118 = ((C6041) it.next()).m39118();
                    if (!C8314.m22411(c18959M39118, EnumC24203.INVOKE) || (abstractC16481Mo13131 = (c21219 = (C21219) c18959M39118).mo13131()) == null) {
                        z2 = false;
                    } else if ((abstractC16481Mo13131 instanceof C6041 ? C17359.equals(((C6041) abstractC16481Mo13131).m17530(), c17973) : false) && (interfaceC21197M19301 = c2551.mo8527().m5683().m19301(c21219)) != null) {
                        AbstractC1566 type2 = interfaceC21197M19301.mo8532().m49700().getType();
                        int i = -1;
                        int i2 = 0;
                        for (AbstractC16481 abstractC16481 : c21219.m44023()) {
                            if (abstractC16481 != abstractC16481Mo13131) {
                                i++;
                                abstractC16481.getClass();
                                if (abstractC16481 instanceof C6041) {
                                    AbstractC1566 abstractC1566 = (AbstractC1566) interfaceC21197M19301.mo8537().get(i);
                                    AbstractC1566 type3 = abstractC16481.getType();
                                    AbstractC1566 abstractC1566M10106 = c2551.mo8527().m5692().m10106(abstractC1566M17531, type2, abstractC1566);
                                    if (abstractC1566M10106 != null && !abstractC1566M10106.equals(type3) && (c3319M11462 = m11462(c2551, (C6041) abstractC16481, abstractC1566M10106)) != null) {
                                        c3319M11462.mo17866(EnumC1763.EXPLICIT_CAST);
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (i2 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z4 = true;
                    }
                }
                return z4;
            }
            c17973.m41948(abstractC1566M17531);
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11474(C3486 c3486, C2551 c2551) {
        int i;
        C10878 c10878 = c3486.f12041;
        Iterator it = c2551.m8490().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            LinkedHashSet linkedHashSetM51443 = ((C17973) it.next()).m41943().m51443();
            if (C6823.m19003(linkedHashSetM51443, new C1995(0))) {
                List listM19008 = C6823.m19008(linkedHashSetM51443, new C5273(2));
                if (listM19008.isEmpty()) {
                    i = 0;
                } else {
                    AbstractC1566 abstractC1566 = (AbstractC1566) c3486.m11463(linkedHashSetM51443).orElse(AbstractC1566.f5420);
                    if (abstractC1566.m5569()) {
                        List listMo5549 = abstractC1566.mo5549();
                        if (listMo5549.size() != 1) {
                            i = 0;
                        } else {
                            AbstractC1566 abstractC1567 = (AbstractC1566) listMo5549.get(0);
                            Iterator it2 = listM19008.iterator();
                            int i3 = 0;
                            while (it2.hasNext()) {
                                C0503 c0503 = (C0503) ((InterfaceC20640) it2.next());
                                EnumC7215 enumC7215M23403 = c3486.f12040.m26142().m23403(abstractC1567, c0503.getType());
                                if (enumC7215M23403.m19813() || enumC7215M23403 == EnumC7215.NARROW_BY_GENERIC) {
                                    c0503.m2469().m10935(abstractC1566);
                                    i3++;
                                }
                            }
                            i = i3;
                        }
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
            i2 += i;
        }
        if (i2 == 0) {
            return false;
        }
        c10878.m27626(c2551);
        c10878.m27625(c2551);
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m11467(C3486 c3486, C2551 c2551) {
        C21943 c21943M52163;
        C10878 c10878 = c3486.f12041;
        List listM8490 = c2551.m8490();
        int size = listM8490.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C17973 c17973 = (C17973) listM8490.get(i);
            if (!c17973.m41943().m51445().mo5564() && !c17973.m41942()) {
                Iterator it = c17973.m41943().m51443().iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC1566 type = ((InterfaceC20640) it.next()).getType();
                        if (type.mo5564() && !type.equals(c17973.m41943().m51445()) && type.m5567()) {
                            c2551.mo8527().m5692().getClass();
                            if (((AbstractC1566) type.m5544((Function) new C25269(1, C3101.m10099(c2551)))) == null) {
                                C6041 c6041M41930 = c17973.m41930();
                                C18959 c18959M39118 = c6041M41930.m39118();
                                C3319 c3319 = null;
                                if (c18959M39118 != null && c18959M39118.getType() != EnumC24203.PHI && (c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508())) != null) {
                                    c18959M39118.m44031(c6041M41930.m17525(c2551));
                                    C6041 c6041Mo17528 = c6041M41930.mo17528();
                                    C6041 c6041Mo17529 = c18959M39118.m44027().mo17528();
                                    C3319 c33110 = new C3319(EnumC24203.CHECK_CAST, type, 1);
                                    c33110.m44031(c6041Mo17528);
                                    c33110.mo44014((AbstractC16481) c6041Mo17529);
                                    c33110.mo17866(EnumC1763.SYNTHETIC);
                                    int iM52196 = C23231.m52196(c21943M52163, c18959M39118);
                                    if (iM52196 != -1) {
                                        ((ArrayList) c21943M52163.mo1986()).add(iM52196 + 1, c33110);
                                        c3319 = c33110;
                                    }
                                }
                                if (c3319 != null) {
                                    c3319.mo17866(EnumC1763.SOFT_CAST);
                                    break;
                                }
                                ArrayList arrayListM41946 = c17973.m41946();
                                if (!arrayListM41946.isEmpty()) {
                                    int i4 = 0;
                                    for (C6041 c6041 : new ArrayList(arrayListM41946)) {
                                        C3319 c3319M11462 = m11462(c2551, c6041, c6041.m17531());
                                        if (c3319M11462 != null) {
                                            c3319M11462.mo17866(EnumC1763.SOFT_CAST);
                                            i4++;
                                        }
                                    }
                                    i3 = i4;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    i3 = 0;
                    break;
                }
                i2 += i3;
            }
            i++;
        }
        if (i2 == 0) {
            return false;
        }
        C22821.m51450(c2551);
        c10878.m27626(c2551);
        c10878.m27625(c2551);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3319 m11462(C2551 c2551, C6041 c6041, AbstractC1566 abstractC1566) {
        C21943 c21943M52162;
        C18959 c18959M39118 = c6041.m39118();
        if (c18959M39118 == null || c18959M39118.getType() == EnumC24203.PHI) {
            return null;
        }
        if ((c18959M39118.getType() == EnumC24203.IF && c18959M39118.mo44035(1).m39120()) || (c21943M52162 = C23231.m52162(c2551, c18959M39118)) == null) {
            return null;
        }
        C6041 c6041M17525 = c6041.m17525(c2551);
        C6041 c6041Mo17528 = c6041.mo17528();
        C3319 c3319 = new C3319(EnumC24203.CHECK_CAST, abstractC1566, 1);
        c3319.m44031(c6041M17525);
        c3319.mo44014((AbstractC16481) c6041Mo17528);
        c3319.mo17866(EnumC1763.SYNTHETIC);
        c18959M39118.mo14762(c6041, c3319.m44027().mo17528());
        int iM52196 = C23231.m52196(c21943M52162, c18959M39118);
        if (iM52196 == -1) {
            return null;
        }
        ((ArrayList) c21943M52162.mo1986()).add(iM52196, c3319);
        return c3319;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11458(C3486 c3486, C2551 c2551) {
        C21943 c21943M52163;
        C18959 c18959M39118;
        C18959 c18959M22403;
        C21943 c21943M52164;
        C10878 c10878 = c3486.f12041;
        boolean z = false;
        for (C17973 c17973 : new ArrayList(c2551.m8490())) {
            if (!c17973.m41943().m51445().mo5564() && !c17973.m41942()) {
                if (c17973.m41940().size() < 2 || (c18959M22403 = C8314.m22403(c17973.m41930().m17529(), EnumC24203.CONST)) == null || (c21943M52164 = C23231.m52163(c2551, c18959M22403, c2551.m8508())) == null) {
                    C18959 c18959M17529 = c17973.m41930().m17529();
                    if (C8314.m22411(c18959M17529, EnumC24203.CONST) && c17973.m41946().size() >= 2 && (c21943M52163 = C23231.m52163(c2551, c18959M17529, c2551.m8508())) != null) {
                        c18959M17529.m39418(EnumC1763.DONT_INLINE);
                        int iM52196 = C23231.m52196(c21943M52163, c18959M17529) + 1;
                        ArrayList arrayList = new ArrayList(c17973.m41946());
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            AbstractC16481 abstractC16481 = (C6041) arrayList.get(i);
                            abstractC16481.m39418(EnumC1763.DONT_INLINE_CONST);
                            if (i != 0 && (c18959M39118 = abstractC16481.m39118()) != null) {
                                C18959 c18959M44011 = c18959M17529.m44011(c2551);
                                ((ArrayList) c21943M52163.mo1986()).add(iM52196, c18959M44011);
                                c18959M39118.mo14762(abstractC16481, c18959M44011.m44027().mo17528());
                            }
                        }
                    }
                } else {
                    boolean z2 = true;
                    for (C18981 c18981 : c17973.m41940()) {
                        if (z2) {
                            z2 = false;
                        } else {
                            C18959 c18959M44012 = c18959M22403.m44011(c2551);
                            c18959M44012.mo17866(EnumC1763.SYNTHETIC);
                            int iM52197 = C23231.m52196(c21943M52164, c18959M22403);
                            if (iM52197 != -1) {
                                ((ArrayList) c21943M52164.mo1986()).add(iM52197 + 1, c18959M44012);
                            }
                            C6041 c6041 = null;
                            if (c18981.m44039() != 0) {
                                Iterator it = c18981.m44026().iterator();
                                while (it.hasNext()) {
                                    C6041 c6042 = (C6041) ((AbstractC16481) it.next());
                                    if (c6042.m17530() == c17973) {
                                        c6041 = c6042;
                                        break;
                                    }
                                }
                            }
                            c18981.mo14762(c6041, c18959M44012.m44027().mo17528());
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        C22821.m51450(c2551);
        c10878.m27626(c2551);
        c10878.m27625(c2551);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m11469(C3486 c3486, C2551 c2551) {
        C10878 c10878 = c3486.f12041;
        Iterator it = c2551.m8508().iterator();
        int iM11459 = 0;
        while (it.hasNext()) {
            C6566 c6566 = (C6566) ((C21943) it.next()).mo17862((InterfaceC2157) C11457.f36001);
            if (c6566 != null) {
                for (C18981 c18981 : (ArrayList) c6566.m18484()) {
                    Iterator it2 = c18981.m44026().iterator();
                    AbstractC1566 abstractC1566 = null;
                    AbstractC1566 abstractC1567 = null;
                    while (true) {
                        if (!it2.hasNext()) {
                            abstractC1566 = abstractC1567;
                            break;
                        }
                        AbstractC1566 type = ((AbstractC16481) it2.next()).getType();
                        if (abstractC1567 != null) {
                            if (!abstractC1567.equals(type)) {
                                break;
                            }
                        } else {
                            abstractC1567 = type;
                        }
                    }
                    iM11459 += ((abstractC1566 == null || !abstractC1566.mo5564()) && m11459(c2551, c18981, false) != 0) ? m11459(c2551, c18981, true) : 0;
                }
            }
        }
        if (iM11459 == 0) {
            return false;
        }
        C22821.m51450(c2551);
        c10878.m27626(c2551);
        c10878.m27625(c2551);
        if (m11473(c2551)) {
            return true;
        }
        return c3486.m11468(c2551);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11459(C2551 c2551, C18981 c18981, boolean z) {
        EnumC24203 type;
        int iM44039 = c18981.m44039();
        int i = 0;
        for (int i2 = 0; i2 < iM44039; i2++) {
            C6041 c6041Mo44035 = c18981.mo44035(i2);
            C21943 c21943M44090 = c18981.m44090(i2);
            C21943 c21943M11464 = m11464(c21943M44090);
            if (c21943M11464 == null) {
                c2551.m31133("Failed to insert an additional move for type inference into block " + c21943M44090);
                return 0;
            }
            C17973 c17973M17530 = c6041Mo44035.m17530();
            C18959 c18959M17529 = c17973M17530.m41930().m17529();
            if (c18959M17529 == null || ((type = c18959M17529.getType()) != EnumC24203.CONST && (type != EnumC24203.MOVE || c17973M17530.m41952() != 1))) {
                i++;
                if (z) {
                    C17973 c17973M17531 = c6041Mo44035.m17530();
                    int iM17532 = c6041Mo44035.m17532();
                    C6041 c6041M17524 = c6041Mo44035.m17524(iM17532, (C17973) null);
                    C17973 c17973M8497 = c2551.m8497(c6041M17524);
                    C6041 c6041M17525 = c6041Mo44035.m17524(iM17532, c17973M17531);
                    C18959 c18959 = new C18959(EnumC24203.MOVE, 1);
                    c18959.m44031(c6041M17524);
                    c18959.mo44014((AbstractC16481) c6041M17525);
                    c18959.mo17866(EnumC1763.SYNTHETIC);
                    ((ArrayList) c21943M11464.mo1986()).add(c18959);
                    c18981.mo14762(c6041Mo44035, c6041Mo44035.m17524(iM17532, c17973M8497));
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m11464(C21943 c21943) {
        c21943.getClass();
        if (!c21943.mo17865(EnumC1763.SYNTHETIC)) {
            C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
            if (c18959M52200 == null || !C25314.m56584(c18959M52200.getType())) {
                return c21943;
            }
            List listM49643 = c21943.m49643();
            if (listM49643.size() == 1) {
                return m11464((C21943) listM49643.get(0));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m11470(C3486 c3486, C2551 c2551) {
        boolean z;
        List list;
        List list2;
        C18959 c18959M39118;
        C21943 c21943M52163;
        List listMo1986;
        int iM47981;
        C10878 c10878 = c3486.f12041;
        List listM8490 = c2551.m8490();
        int size = listM8490.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            C17973 c17973 = (C17973) listM8490.get(i);
            C22813 c22813M41943 = c17973.m41943();
            if (!c22813M41943.m51445().mo5564()) {
                Iterator it = c22813M41943.m51443().iterator();
                boolean z3 = false;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z3) {
                            break;
                        }
                        boolean z4 = false;
                        for (C6041 c6041 : new ArrayList(c17973.m41946())) {
                            AbstractC1566 abstractC1566M17531 = c6041.m17531();
                            AbstractC1566 abstractC1566 = AbstractC1566.f5436;
                            if (abstractC1566M17531 == abstractC1566 || ((abstractC1566M17531.mo5564() && !abstractC1566M17531.m5556()) || (c18959M39118 = c6041.m39118()) == null || c18959M39118.getType() == EnumC24203.IF || (c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508())) == null || (iM47981 = C20993.m47981((listMo1986 = c21943M52163.mo1986()), c18959M39118)) == -1)) {
                                list2 = listM8490;
                            } else {
                                EnumC24203 type = c18959M39118.getType();
                                if (type == EnumC24203.CAST) {
                                    C4789 c4789M42792 = C18345.m42792(c18959M39118.m44027(), c6041.m17530().m41930().mo17528(), (AbstractC1566) ((C3319) c18959M39118).m10937());
                                    c4789M42792.mo17866(EnumC1763.SYNTHETIC);
                                    C23231.m52172(c2551, c21943M52163, iM47981, c4789M42792);
                                    list2 = listM8490;
                                } else {
                                    if (type == EnumC24203.ARITH) {
                                        C22711 c22711 = (C22711) c18959M39118;
                                        list2 = listM8490;
                                        if (c22711.m51191() == EnumC19727.XOR && c22711.m44039() == 2) {
                                            AbstractC16481 abstractC16481Mo44035 = c22711.mo44035(1);
                                            abstractC16481Mo44035.getClass();
                                            if ((abstractC16481Mo44035 instanceof C23195) && ((C23195) abstractC16481Mo44035).m52122() == 1) {
                                                C18959 c18959 = new C18959(EnumC24203.NOT, 1);
                                                c18959.mo44014((AbstractC16481) c6041.mo17528());
                                                EnumC1763 enumC1763 = EnumC1763.SYNTHETIC;
                                                c18959.mo17866(enumC1763);
                                                if (c22711.m44027().getType().m5548(EnumC12006.BOOLEAN)) {
                                                    c18959.m44031(c22711.m44027());
                                                } else {
                                                    C17227 c17227M39112 = AbstractC16481.m39112(c18959);
                                                    c17227M39112.mo1130(abstractC1566);
                                                    c18959 = C18345.m42792(c22711.m44027(), c17227M39112, AbstractC1566.f5429);
                                                    c18959.mo17866(enumC1763);
                                                }
                                                C23231.m52172(c2551, c21943M52163, iM47981, c18959);
                                            }
                                        }
                                    } else {
                                        list2 = listM8490;
                                    }
                                    C4789 c4789M42793 = C18345.m42792(c6041.m17525(c2551), c6041.m17530().m41930().mo17528(), abstractC1566M17531);
                                    c4789M42793.mo17866(EnumC1763.SYNTHETIC);
                                    ((ArrayList) listMo1986).add(iM47981, c4789M42793);
                                    c18959M39118.mo14762(c6041, c4789M42793.m44027().mo17528());
                                }
                                z4 = true;
                            }
                            listM8490 = list2;
                        }
                        list = listM8490;
                        z = z4;
                        break;
                    }
                    InterfaceC20640 interfaceC20640 = (InterfaceC20640) it.next();
                    AbstractC1566 type2 = interfaceC20640.getType();
                    int i2 = C23624.f76666[interfaceC20640.mo2468().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 && !type2.m5546()) {
                        }
                    } else if (type2.mo5566(EnumC12006.BOOLEAN)) {
                        z3 = true;
                    }
                    z = false;
                    list = listM8490;
                    break;
                }
            }
            z = false;
            list = listM8490;
            break;
            if (z) {
                z2 = true;
            }
            i++;
            listM8490 = list;
        }
        if (!z2) {
            return false;
        }
        C22821.m51450(c2551);
        c10878.m27626(c2551);
        c10878.m27625(c2551);
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m11472(C3486 c3486, C2551 c2551) {
        EnumC24203 type;
        boolean z = false;
        for (C17973 c17973 : c2551.m8490()) {
            if (!c17973.m41943().m51445().mo5564() && c17973.m41942()) {
                Iterator it = c17973.m41946().iterator();
                while (it.hasNext()) {
                    C18959 c18959M39118 = ((C6041) it.next()).m39118();
                    if (c18959M39118 != null && ((type = c18959M39118.getType()) == EnumC24203.AGET || type == EnumC24203.APUT)) {
                        c17973.m41948(c17973.m41941());
                        z = true;
                        break;
                    }
                }
            }
        }
        if (!z) {
            return false;
        }
        c3486.f12041.m27625(c2551);
        return true;
    }
}
