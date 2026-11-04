package l;

import com.google.android.material.motion.MotionUtils;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.֫ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1981 extends C5710 {
    public static final ConcurrentMapC17249 i = new ConcurrentMapC17249();
    public final EnumC10315 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public C1981(EnumC10315 enumC10315, boolean z) {
        super(AbstractC17577.e, "ZoneText(" + enumC10315 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (EnumC10315) C17359.requireNonNull(enumC10315, "textStyle");
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
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
    @Override // l.C5710, l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        ?? G;
        String[] strArr;
        AbstractC22338 abstractC22338 = (AbstractC22338) c16150.b(AbstractC17577.a);
        if (abstractC22338 == null) {
            return false;
        }
        String id = abstractC22338.getId();
        if (!(abstractC22338 instanceof C11149)) {
            InterfaceC9437 interfaceC9437 = c16150.a;
            String str = null;
            Map concurrentMapC17249 = null;
            if (this.f) {
                G = 2;
            } else if (interfaceC9437.d(EnumC8692.INSTANT_SECONDS)) {
                G = abstractC22338.S().g(C0358.S(interfaceC9437));
            } else {
                EnumC8692 enumC8692 = EnumC8692.EPOCH_DAY;
                if (interfaceC9437.d(enumC8692)) {
                    EnumC8692 enumC8693 = EnumC8692.NANO_OF_DAY;
                    if (interfaceC9437.d(enumC8693)) {
                        C19003 c19003Of = C19003.of(C7816.d0(interfaceC9437.C(enumC8692)), C10052.V(interfaceC9437.C(enumC8693)));
                        Object objE = abstractC22338.S().e(c19003Of);
                        if ((objE instanceof C6391 ? (C6391) objE : null) == null) {
                            C21307 c21307S = abstractC22338.S();
                            c19003Of.getClass();
                            C23084 c23084S = C23084.S(c19003Of, null, abstractC22338);
                            G = c21307S.g(C0358.ofEpochSecond(c23084S.Q(), c23084S.toLocalTime().getNano()));
                        } else {
                            G = 2;
                        }
                    } else {
                        G = 2;
                    }
                } else {
                    G = 2;
                }
            }
            Locale locale = c16150.b.b;
            EnumC10315 enumC10315 = EnumC10315.NARROW;
            EnumC10315 enumC10316 = this.e;
            if (enumC10316 != enumC10315) {
                ConcurrentMapC17249 concurrentMapC172410 = i;
                SoftReference softReference = (SoftReference) concurrentMapC172410.get(id);
                if (softReference == null || (concurrentMapC17249 = (Map) softReference.get()) == null || (strArr = (String[]) concurrentMapC17249.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                    if (concurrentMapC17249 == null) {
                        concurrentMapC17249 = new ConcurrentMapC17249();
                    }
                    concurrentMapC17249.put(locale, strArr2);
                    concurrentMapC172410.put(id, new SoftReference(concurrentMapC17249));
                    strArr = strArr2;
                }
                if (G == 0) {
                    str = strArr[enumC10316.a + 1];
                } else if (G == 1) {
                    str = strArr[enumC10316.a + 3];
                } else {
                    str = strArr[enumC10316.a + 5];
                }
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }

    @Override // l.C5710
    public final C22118 a(C25102 c25102) {
        C22118 c22118;
        if (this.e == EnumC10315.NARROW) {
            return super.a(c25102);
        }
        Locale locale = c25102.a.b;
        boolean z = c25102.b;
        Set set = C0424.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c22118 = (C22118) ((SoftReference) entry.getValue()).get()) != null) {
            return c22118;
        }
        C22118 c22119 = c25102.b ? new C22118("", null, null) : new C4964("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c22119.a(str, str);
                HashMap map2 = (HashMap) AbstractC9569.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) AbstractC9569.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) AbstractC9569.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC9569.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) AbstractC9569.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == EnumC10315.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    c22119.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c22119)));
        return c22119;
    }
}
