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

/* JADX INFO: renamed from: l.֡ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0541 extends C20298 {
    public static final ConcurrentMapC13783 i = new ConcurrentMapC13783();
    public final EnumC4069 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public C0541(EnumC4069 enumC4069, boolean z) {
        super(AbstractC23702.e, "ZoneText(" + enumC4069 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (EnumC4069) C13638.requireNonNull(enumC4069, "textStyle");
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
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
    @Override // l.C20298, l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        ?? G;
        String[] strArr;
        AbstractC9114 abstractC9114 = (AbstractC9114) c11126.b(AbstractC23702.a);
        if (abstractC9114 == null) {
            return false;
        }
        String strK = abstractC9114.k();
        if (!(abstractC9114 instanceof C2678)) {
            InterfaceC21584 interfaceC21584 = c11126.a;
            String str = null;
            Map concurrentMapC13783 = null;
            if (this.f) {
                G = 2;
            } else if (interfaceC21584.e(EnumC18762.INSTANT_SECONDS)) {
                G = abstractC9114.W().g(C18285.W(interfaceC21584));
            } else {
                EnumC18762 enumC18762 = EnumC18762.EPOCH_DAY;
                if (interfaceC21584.e(enumC18762)) {
                    EnumC18762 enumC18763 = EnumC18762.NANO_OF_DAY;
                    if (interfaceC21584.e(enumC18763)) {
                        C1952 c1952Y = C1952.Y(C18991.i0(interfaceC21584.G(enumC18762)), C3363.a0(interfaceC21584.G(enumC18763)));
                        Object objE = abstractC9114.W().e(c1952Y);
                        if ((objE instanceof C13263 ? (C13263) objE : null) == null) {
                            C15380 c15380W = abstractC9114.W();
                            C10525 c10525W = C10525.W(c1952Y, abstractC9114, null);
                            G = c15380W.g(C18285.ofEpochSecond(c10525W.U(), c10525W.b().d));
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
            Locale locale = c11126.b.b;
            EnumC4069 enumC4069 = EnumC4069.NARROW;
            EnumC4069 enumC40610 = this.e;
            if (enumC40610 != enumC4069) {
                ConcurrentMapC13783 concurrentMapC13784 = i;
                SoftReference softReference = (SoftReference) concurrentMapC13784.get(strK);
                if (softReference == null || (concurrentMapC13783 = (Map) softReference.get()) == null || (strArr = (String[]) concurrentMapC13783.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strK);
                    String[] strArr2 = {strK, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strK, strK};
                    if (concurrentMapC13783 == null) {
                        concurrentMapC13783 = new ConcurrentMapC13783();
                    }
                    concurrentMapC13783.put(locale, strArr2);
                    concurrentMapC13784.put(strK, new SoftReference(concurrentMapC13783));
                    strArr = strArr2;
                }
                if (G == 0) {
                    str = strArr[enumC40610.a + 1];
                } else if (G == 1) {
                    str = strArr[enumC40610.a + 3];
                } else {
                    str = strArr[enumC40610.a + 5];
                }
            }
            if (str != null) {
                strK = str;
            }
        }
        sb.append(strK);
        return true;
    }

    @Override // l.C20298
    public final C19593 a(C12537 c12537) {
        C19593 c19593;
        if (this.e == EnumC4069.NARROW) {
            return super.a(c12537);
        }
        Locale locale = c12537.a.b;
        boolean z = c12537.b;
        Set set = C18201.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c19593 = (C19593) ((SoftReference) entry.getValue()).get()) != null) {
            return c19593;
        }
        C19593 c19594 = c12537.b ? new C19593("", null, null) : new C8304("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c19594.a(str, str);
                HashMap map2 = (HashMap) AbstractC23121.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) AbstractC23121.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) AbstractC23121.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC23121.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) AbstractC23121.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == EnumC4069.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    c19594.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c19594)));
        return c19594;
    }
}
