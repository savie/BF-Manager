package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20847 extends AbstractC24577 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f66743;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f66744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5816 f66745;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f66746;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public EnumMap f66747;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4439 f66748;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10377 f66749;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14769 f66750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20847(C4439 c4439, C16327 c16327) {
        super(c4439, c16327);
        this.f66748 = c4439;
        C11896 c11896 = (C11896) c4439.f15894.f48335;
        int[] iArr = C23085.f74870;
        AbstractC8036 abstractC8036 = c11896.f38321;
        int i = iArr[abstractC8036.mo2285().ordinal()];
        if (i == 5) {
            C5816 c5816 = ((C12510) abstractC8036).f40168;
            this.f66745 = c5816;
            this.f66746 = c5816;
        } else if (i == 9) {
            this.f66745 = null;
            this.f66746 = C11239.m28352(((C20605) abstractC8036).f66030);
        } else {
            this.f66745 = null;
            this.f66746 = null;
        }
        AbstractC11781 abstractC11781 = this.f79656;
        if (abstractC11781.f38066 == EnumC13603.f43218) {
            this.f66749 = new C17863(this.f79656.m29558(), (C10377) abstractC11781.mo16960(abstractC11781.f38069));
        } else {
            this.f66749 = new C10377(4098L, null, null, abstractC11781.m29558());
        }
        EnumMap enumMap = new EnumMap(EnumC14879.class);
        this.f66747 = enumMap;
        enumMap.put(EnumC14879.PARAM, new LinkedHashMap());
        enumMap.put(EnumC14879.LOCAL_VAR, new LinkedHashMap());
        enumMap.put(EnumC14879.CAPTURED_VAR, new LinkedHashMap());
        enumMap.put(EnumC14879.CAPTURED_THIS, new LinkedHashMap());
        enumMap.put(EnumC14879.CAPTURED_OUTER_THIS, new LinkedHashMap());
        this.f66744 = new HashSet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47674(AbstractC11781 abstractC11781, EnumC14879 enumC14879) {
        AbstractC11781 c16371;
        C24550 c24550M14120;
        C4439 c4439 = this.f66748;
        C18609 c18609 = c4439.f15895;
        if (enumC14879 == EnumC14879.CAPTURED_THIS && abstractC11781 != null && abstractC11781.f38066 == EnumC13603.f43213 && !c4439.f15893.isEmpty() && (c24550M14120 = c4439.m14120()) != null && c4439.f15893.contains(c24550M14120)) {
            C11972.m30026(abstractC11781 != c24550M14120);
            enumC14879 = EnumC14879.CAPTURED_OUTER_THIS;
        }
        Map mapM47671 = m47671(enumC14879);
        if (mapM47671.containsKey(abstractC11781)) {
            return;
        }
        int iOrdinal = enumC14879.ordinal();
        C10377 c10377 = this.f66749;
        if (iOrdinal == 0) {
            C5816 c5816 = new C5816((abstractC11781.mo29591() & 16) | 8589934592L, abstractC11781.f38072, c18609.f60504.m55132(abstractC11781.f38067), c10377);
            C5816 c5817 = (C5816) abstractC11781;
            c5816.f19997 = c5817.f19997;
            if (c5817.m16950()) {
                c5816.m16955(EnumC5296.EXCEPTION_PARAMETER);
            }
            c16371 = c5816;
        } else if (iOrdinal == 1) {
            C3693 c3693 = new C3693(abstractC11781.mo29591() & 16, abstractC11781.f38072, abstractC11781.f38067, c10377, abstractC11781);
            C5816 c5818 = (C5816) abstractC11781;
            c3693.f19997 = c5818.f19997;
            if (c5818.m16950()) {
                c3693.m16955(EnumC5296.EXCEPTION_PARAMETER);
            }
            c16371 = c3693;
        } else if (iOrdinal == 2) {
            c16371 = new C16371(abstractC11781.f38072, c18609.f60504.m55132(abstractC11781.f38067), c10377, abstractC11781);
        } else if (iOrdinal == 3) {
            c16371 = abstractC11781;
        } else if (iOrdinal == 4) {
            C15252 c15252 = c18609.f60496;
            String str = new String(abstractC11781.mo29575().toString().replace('.', '$') + ((Object) c18609.f60496.f49857));
            AbstractC22712 abstractC22712 = c15252.f49864;
            abstractC22712.getClass();
            char[] charArray = str.toCharArray();
            c16371 = new C23831(abstractC22712.mo2069(charArray, charArray.length), c18609.f60504.m55132(abstractC11781.f38067), c10377, abstractC11781);
        } else {
            C11972.m30024(enumC14879.name());
            throw null;
        }
        if (c16371 != abstractC11781 && enumC14879.m35821()) {
            c16371.m29585(abstractC11781.mo29568());
            c16371.m29569(abstractC11781.mo29597());
        }
        mapM47671.put(abstractC11781, c16371);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m47671(EnumC14879 enumC14879) {
        Map map = (Map) this.f66747.get(enumC14879);
        C11972.m30021(map);
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m47673(final C5887 c5887) {
        C18609 c18609 = this.f66748.f15895;
        for (EnumC14879 enumC14879 : EnumC14879.values()) {
            Map mapM47671 = m47671(enumC14879);
            if (enumC14879.ordinal() != 4) {
                if (mapM47671.containsKey(c5887.f20170)) {
                    C5887 c5887M37508 = c18609.f60514.m37508((AbstractC11781) mapM47671.get(c5887.f20170));
                    c5887M37508.f26659 = c5887.f26659;
                    return c5887M37508;
                }
            } else {
                C15867 c15867Reduce = C1170.stream(mapM47671.keySet()).filter(new Predicate() { // from class: l.᩻᩸ۘ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C20847 c20847 = this.f81782;
                        c20847.getClass();
                        return c5887.f20170.m29567(((AbstractC11781) obj).f38067.f73596, c20847.f66748.f15895.f60504);
                    }
                }).reduce(new C17117());
                if (c15867Reduce.isPresent()) {
                    C5887 c5887M37509 = c18609.f60514.m37508((AbstractC11781) mapM47671.get(c15867Reduce.get()));
                    c5887M37509.f26659 = c5887.f20170.f38069.f38067;
                    C23041 c23041M37544 = c18609.f60514.m37544(c5887M37509, c5887.f20169);
                    c23041M37544.f26659 = c5887.f26659;
                    C11239.m28356(c5887.f20170, c23041M37544);
                    return c23041M37544;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5887 m47672(C23041 c23041) {
        AbstractC19728 abstractC19728 = c23041.f74774;
        C18609 c18609 = this.f66748.f15895;
        C11972.m30026(abstractC19728 == c18609.f60496.f49836);
        Map map = (Map) this.f66747.get(EnumC14879.CAPTURED_OUTER_THIS);
        if (!map.containsKey(c23041.f74775.f38069)) {
            return null;
        }
        C5887 c5887M37508 = c18609.f60514.m37508((AbstractC11781) map.get(c23041.f74775.f38069));
        c5887M37508.f26659 = c23041.f74775.f38069.f38067;
        return c5887M37508;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47675(C18565 c18565) {
        C11972.m30026(c18565.f60323.f26659.f73596.m29586() && c18565.f60321 == null);
        Map map = (Map) this.f66747.get(EnumC14879.CAPTURED_OUTER_THIS);
        AbstractC22664 abstractC22664Mo23449 = c18565.f60323.f26659.mo23449();
        if (map.containsKey(abstractC22664Mo23449.f73596)) {
            C5887 c5887M37508 = this.f66748.f15895.f60514.m37508((AbstractC11781) map.get(abstractC22664Mo23449.f73596));
            c5887M37508.f26659 = abstractC22664Mo23449;
            c18565.f60321 = c5887M37508;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m47676() {
        AbstractC19728 abstractC19728M45430;
        C4439 c4439 = this.f66748;
        C18609 c18609 = c4439.f15895;
        if (this.f66750 != null) {
            return;
        }
        C10377 c10377 = this.f66749;
        boolean zM29587 = c10377.f38069.m29587();
        boolean zIsEmpty = m47671(EnumC14879.CAPTURED_THIS).isEmpty();
        AbstractC11781 abstractC11781 = this.f79656;
        long j = (abstractC11781.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 562949953425408L | (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & abstractC11781.f38069.f38071) | 2;
        c10377.f38071 = (zIsEmpty ? 8L : zM29587 ? 8796093022208L : 0L) | j;
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        Iterator it = m47671(EnumC14879.CAPTURED_VAR).values().iterator();
        while (it.hasNext()) {
            C5816 c5816 = (C5816) ((AbstractC11781) it.next());
            c18499.m43089(c18609.f60514.m37523(c5816, (AbstractC22295) null));
            c184910.m43089(c5816);
        }
        Iterator it2 = m47671(EnumC14879.CAPTURED_OUTER_THIS).values().iterator();
        while (it2.hasNext()) {
            C5816 c5817 = (C5816) ((AbstractC11781) it2.next());
            c18499.m43089(c18609.f60514.m37523(c5817, (AbstractC22295) null));
            c184910.m43089(c5817);
        }
        Iterator it3 = m47671(EnumC14879.PARAM).values().iterator();
        while (it3.hasNext()) {
            C5816 c5818 = (C5816) ((AbstractC11781) it3.next());
            c18499.m43089(c18609.f60514.m37523(c5818, (AbstractC22295) null));
            c184910.m43089(c5818);
        }
        this.f66750 = c18499.m43093();
        c10377.f33013 = c184910.m43093();
        boolean zM54896 = m54896();
        AbstractC15581 abstractC15581 = this.f79657;
        if (!zM54896) {
            AbstractC19728 abstractC19728 = c18609.f60496.f49749;
            C15252 c15252 = c18609.f60496;
            StringBuilder sb = new StringBuilder();
            sb.append(m54894());
            sb.append("$");
            int i = c4439.f15899;
            c4439.f15899 = i + 1;
            sb.append(i);
            abstractC19728M45430 = abstractC19728.m45430(c15252.f49864.m51194(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) c18609.f60496.f49749);
            sb2.append(m54894());
            sb2.append('$');
            StringBuilder sb3 = new StringBuilder();
            C11972.m30026((abstractC11781.f38067 == null && c4439.m14118() == null) ? false : true);
            AbstractC22664 abstractC22664 = abstractC11781.f38067;
            if (abstractC22664 != null) {
                sb3.append(c18609.m43275(abstractC22664, true));
                sb3.append(":");
            }
            sb3.append((CharSequence) c18609.f60504.m55092(((C16327) abstractC15581).f26659.f73596).f38069.mo29575());
            sb3.append(" ");
            AbstractC11781 abstractC11782 = this.f66746;
            if (abstractC11782 != null) {
                sb3.append((CharSequence) abstractC11782.mo29575());
                sb3.append("=");
            }
            for (AbstractC11781 abstractC11783 : m47671(EnumC14879.CAPTURED_VAR).keySet()) {
                if (abstractC11783 != this.f66745) {
                    sb3.append(c18609.m43275(abstractC11783.f38067, true));
                    sb3.append(" ");
                    sb3.append((CharSequence) abstractC11783.mo29575());
                    sb3.append(",");
                }
            }
            sb2.append(Integer.toHexString(sb3.toString().hashCode()));
            sb2.append('$');
            sb2.append(c4439.f15896.m18671(sb2));
            abstractC19728M45430 = c18609.f60496.f49864.m51194(sb2.toString());
        }
        c10377.f38072 = abstractC19728M45430;
        c10377.f38067 = c18609.f60504.m55102(c18609.f60504.m55132(((C16327) abstractC15581).m37319(c18609.f60504)), C11239.m28328(this.f66750));
    }
}
