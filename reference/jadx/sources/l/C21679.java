package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21679 extends C3791 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC6160 f70314;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13213 f70315;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumMap f70316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC10540 f70317;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23549 f70318;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23800 f70319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3836 f70320;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21679 m48420(C12343 c12343) {
        C21679 c21679 = (C21679) c12343.m30655(C21679.class);
        return c21679 == null ? new C21679(c12343) : c21679;
    }

    public C21679(C12343 c12343) {
        AbstractC15165 abstractC15165 = (AbstractC15165) C20414.m46161(c12343).m46168();
        this.f13668 = abstractC15165;
        abstractC15165.getConfiguration();
        this.f13667 = new C12965();
        this.f70314 = new C22385(this);
        this.f70317 = new C1217(this);
        abstractC15165.f49526 = new C23091(this);
        this.f70320 = C3836.m11131(c12343);
        this.f70318 = C23549.m51906(c12343);
        this.f70319 = C23800.m52336(c12343);
        C22531.m50048(c12343);
        this.f70316 = new EnumMap(EnumC15330.class);
        C14770 c14770M35395 = C14770.m35395(c12343);
        abstractC15165.getConfiguration();
        C6862 c6862 = new C6862();
        c6862.f23143 = abstractC15165 instanceof C5451 ? EnumSet.noneOf(EnumC4039.class) : EnumSet.of(EnumC4039.SIMPLE_NAMES, EnumC4039.WHERE_CLAUSES, EnumC4039.UNIQUE_TYPEVAR_NAMES);
        String strM35397 = c14770M35395.m35397("diags.formatterOptions");
        if (strM35397 != null) {
            for (String str : strM35397.split(",")) {
                if (str.equals("-where")) {
                    c6862.f23143.remove(EnumC4039.WHERE_CLAUSES);
                } else if (str.equals("where")) {
                    c6862.f23143.add(EnumC4039.WHERE_CLAUSES);
                }
                if (str.equals("-simpleNames")) {
                    c6862.f23143.remove(EnumC4039.SIMPLE_NAMES);
                } else if (str.equals("simpleNames")) {
                    c6862.f23143.add(EnumC4039.SIMPLE_NAMES);
                }
                if (str.equals("-disambiguateTvars")) {
                    c6862.f23143.remove(EnumC4039.UNIQUE_TYPEVAR_NAMES);
                } else if (str.equals("disambiguateTvars")) {
                    c6862.f23143.add(EnumC4039.UNIQUE_TYPEVAR_NAMES);
                }
            }
        }
        this.f13667 = c6862;
        for (EnumC15330 enumC15330 : EnumC15330.values()) {
            this.f70316.put(enumC15330, new LinkedHashMap());
        }
    }

    @Override // l.InterfaceC17615
    /* JADX INFO: renamed from: ܰ */
    public final String mo36374(C11948 c11948, Locale locale) {
        EnumMap enumMap;
        AbstractC15165 abstractC15165 = this.f13668;
        StringBuilder sb = new StringBuilder();
        this.f70315 = new C13213();
        EnumC15330[] enumC15330ArrValues = EnumC15330.values();
        int length = enumC15330ArrValues.length;
        int i = 0;
        while (true) {
            enumMap = this.f70316;
            if (i >= length) {
                break;
            }
            ((Map) enumMap.get(enumC15330ArrValues[i])).clear();
            i++;
        }
        m48422(c11948);
        sb.append(abstractC15165.mo36374(c11948, locale));
        if (((C6862) this.f13667).f23143.contains(EnumC4039.WHERE_CLAUSES)) {
            C21825 c21825M48588 = C21825.m48588();
            for (EnumC15330 enumC15330 : EnumC15330.values()) {
                C21825 c21825M48589 = C21825.m48588();
                Iterator it = ((Map) enumMap.get(enumC15330)).entrySet().iterator();
                while (it.hasNext()) {
                    C11948 c11949 = (C11948) ((Map.Entry) it.next()).getValue();
                    c21825M48589.getClass();
                    c21825M48589 = new C21825(c11949, c21825M48589);
                }
                if (!c21825M48589.isEmpty()) {
                    String strM36712 = enumC15330.m36712();
                    if (c21825M48589.m48596() > 1) {
                        strM36712 = C15489.m37076(strM36712, ".1");
                    }
                    C1675 c1675 = new C1675(this.f70318.m51914(strM36712, ((Map) enumMap.get(enumC15330)).keySet()), c21825M48589.m48589());
                    c21825M48588.getClass();
                    c21825M48588 = new C21825(c1675, c21825M48588);
                }
            }
            C21825 c21825M485810 = c21825M48588.m48589();
            String strM36362 = abstractC15165 instanceof C5451 ? "" : AbstractC15165.m36362(2);
            Iterator it2 = c21825M485810.iterator();
            while (it2.hasNext()) {
                String strMo36374 = abstractC15165.mo36374((C11948) it2.next(), locale);
                if (strMo36374.length() > 0) {
                    sb.append("\n" + strM36362 + strMo36374);
                }
            }
        }
        return sb.toString();
    }

    @Override // l.InterfaceC17615
    /* JADX INFO: renamed from: ۙ */
    public final String mo15112(C11948 c11948, Locale locale) {
        this.f70315 = new C13213();
        m48422(c11948);
        return this.f13668.mo15112(c11948, locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48422(C11948 c11948) {
        for (Object obj : c11948.m29763()) {
            if (obj != null) {
                m48421(obj);
            }
        }
        if (c11948 instanceof C1675) {
            Iterator it = c11948.mo5589().iterator();
            while (it.hasNext()) {
                m48422((C11948) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48421(Object obj) {
        if (!(obj instanceof AbstractC16579)) {
            if (!(obj instanceof AbstractC23903)) {
                if (obj instanceof C11948) {
                    m48422((C11948) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    Iterable iterable = (Iterable) obj;
                    if (obj instanceof InterfaceC3800) {
                        return;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        m48421(it.next());
                    }
                    return;
                }
                return;
            }
            AbstractC10540 abstractC10540 = this.f70317;
            abstractC10540.getClass();
            ((AbstractC23903) obj).mo2879(abstractC10540, (Locale) null);
            return;
        }
        AbstractC6160 abstractC6160 = this.f70314;
        abstractC6160.getClass();
        ((AbstractC16579) obj).mo1928(abstractC6160, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48419(C21679 c21679, AbstractC16579 abstractC16579, EnumC15330 enumC15330) {
        int i = 1;
        for (AbstractC16579 abstractC165710 : ((Map) c21679.f70316.get(enumC15330)).keySet()) {
            if (abstractC165710.f53222 == abstractC16579.f53222) {
                return i;
            }
            if (enumC15330 != EnumC15330.TYPEVAR || abstractC165710.toString().equals(abstractC16579.toString())) {
                i++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC17615
    public final InterfaceC16910 getConfiguration() {
        return (C6862) this.f13667;
    }
}
