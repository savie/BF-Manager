package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21220 extends C12204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumMap f67724;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24705 f67725;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19991 f67726;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC1584 f67727;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14764 f67728;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC7329 f67729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12269 f67730;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21220 m48377(C4747 c4747) {
        C21220 c21220 = (C21220) c4747.m14642(C21220.class);
        return c21220 == null ? new C21220(c4747) : c21220;
    }

    public C21220(C4747 c4747) {
        AbstractC3782 abstractC3782 = (AbstractC3782) C7312.m20023(c4747).m20051();
        this.f39235 = abstractC3782;
        abstractC3782.getConfiguration();
        this.f39234 = new C20409();
        this.f67727 = new C3320(this);
        this.f67729 = new C20474(this);
        abstractC3782.f12958 = new C4066(this);
        this.f67728 = C14764.m35506(c4747);
        this.f67726 = C19991.m45972(c4747);
        this.f67725 = C24705.m55066(c4747);
        C23721.m52973(c4747);
        this.f67724 = new EnumMap(EnumC14506.class);
        C13015 c13015M32421 = C13015.m32421(c4747);
        abstractC3782.getConfiguration();
        C24204 c24204 = new C24204();
        c24204.f78407 = abstractC3782 instanceof C23458 ? EnumSet.noneOf(EnumC6304.class) : EnumSet.of(EnumC6304.SIMPLE_NAMES, EnumC6304.WHERE_CLAUSES, EnumC6304.UNIQUE_TYPEVAR_NAMES);
        String strM32422 = c13015M32421.m32422("diags.formatterOptions");
        if (strM32422 != null) {
            for (String str : strM32422.split(",")) {
                if (str.equals("-where")) {
                    c24204.f78407.remove(EnumC6304.WHERE_CLAUSES);
                } else if (str.equals("where")) {
                    c24204.f78407.add(EnumC6304.WHERE_CLAUSES);
                }
                if (str.equals("-simpleNames")) {
                    c24204.f78407.remove(EnumC6304.SIMPLE_NAMES);
                } else if (str.equals("simpleNames")) {
                    c24204.f78407.add(EnumC6304.SIMPLE_NAMES);
                }
                if (str.equals("-disambiguateTvars")) {
                    c24204.f78407.remove(EnumC6304.UNIQUE_TYPEVAR_NAMES);
                } else if (str.equals("disambiguateTvars")) {
                    c24204.f78407.add(EnumC6304.UNIQUE_TYPEVAR_NAMES);
                }
            }
        }
        this.f39234 = c24204;
        for (EnumC14506 enumC14506 : EnumC14506.values()) {
            this.f67724.put(enumC14506, new LinkedHashMap());
        }
    }

    @Override // l.InterfaceC20162
    /* JADX INFO: renamed from: ᩷ */
    public final String mo12290(C17007 c17007, Locale locale) {
        EnumMap enumMap;
        AbstractC3782 abstractC3782 = this.f39235;
        StringBuilder sb = new StringBuilder();
        this.f67730 = new C12269();
        EnumC14506[] enumC14506ArrValues = EnumC14506.values();
        int length = enumC14506ArrValues.length;
        int i = 0;
        while (true) {
            enumMap = this.f67724;
            if (i >= length) {
                break;
            }
            ((Map) enumMap.get(enumC14506ArrValues[i])).clear();
            i++;
        }
        m48379(c17007);
        sb.append(abstractC3782.mo12290(c17007, locale));
        if (((C24204) this.f39234).f78407.contains(EnumC6304.WHERE_CLAUSES)) {
            C14769 c14769M35543 = C14769.m35543();
            for (EnumC14506 enumC14506 : EnumC14506.values()) {
                C14769 c14769M35544 = C14769.m35543();
                Iterator it = ((Map) enumMap.get(enumC14506)).entrySet().iterator();
                while (it.hasNext()) {
                    C17007 c17008 = (C17007) ((Map.Entry) it.next()).getValue();
                    c14769M35544.getClass();
                    c14769M35544 = new C14769(c17008, c14769M35544);
                }
                if (!c14769M35544.isEmpty()) {
                    String strM35018 = enumC14506.m35018();
                    if (c14769M35544.m35551() > 1) {
                        strM35018 = C14483.m34972(strM35018, ".1");
                    }
                    C13278 c13278 = new C13278(this.f67726.m45980(strM35018, ((Map) enumMap.get(enumC14506)).keySet()), c14769M35544.m35554());
                    c14769M35543.getClass();
                    c14769M35543 = new C14769(c13278, c14769M35543);
                }
            }
            C14769 c14769M35554 = c14769M35543.m35554();
            String strM12275 = abstractC3782 instanceof C23458 ? "" : AbstractC3782.m12275(2);
            Iterator it2 = c14769M35554.iterator();
            while (it2.hasNext()) {
                String strMo12290 = abstractC3782.mo12290((C17007) it2.next(), locale);
                if (strMo12290.length() > 0) {
                    sb.append("\n" + strM12275 + strMo12290);
                }
            }
        }
        return sb.toString();
    }

    @Override // l.InterfaceC20162
    /* JADX INFO: renamed from: ۙ */
    public final String mo43485(C17007 c17007, Locale locale) {
        this.f67730 = new C12269();
        m48379(c17007);
        return this.f39235.mo43485(c17007, locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48379(C17007 c17007) {
        for (Object obj : c17007.m40085()) {
            if (obj != null) {
                m48378(obj);
            }
        }
        if (c17007 instanceof C13278) {
            Iterator it = c17007.mo32825().iterator();
            while (it.hasNext()) {
                m48379((C17007) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48378(Object obj) {
        if (!(obj instanceof AbstractC22664)) {
            if (!(obj instanceof AbstractC11781)) {
                if (obj instanceof C17007) {
                    m48379((C17007) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    Iterable iterable = (Iterable) obj;
                    if (obj instanceof InterfaceC24329) {
                        return;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        m48378(it.next());
                    }
                    return;
                }
                return;
            }
            AbstractC7329 abstractC7329 = this.f67729;
            abstractC7329.getClass();
            ((AbstractC11781) obj).mo16953(abstractC7329, (Locale) null);
            return;
        }
        AbstractC1584 abstractC1584 = this.f67727;
        abstractC1584.getClass();
        ((AbstractC22664) obj).mo9324(abstractC1584, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48376(C21220 c21220, AbstractC22664 abstractC22664, EnumC14506 enumC14506) {
        int i = 1;
        for (AbstractC22664 abstractC22665 : ((Map) c21220.f67724.get(enumC14506)).keySet()) {
            if (abstractC22665.f73596 == abstractC22664.f73596) {
                return i;
            }
            if (enumC14506 != EnumC14506.TYPEVAR || abstractC22665.toString().equals(abstractC22664.toString())) {
                i++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC20162
    public final InterfaceC11211 getConfiguration() {
        return (C24204) this.f39234;
    }
}
