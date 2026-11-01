package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2217 extends AbstractC0806 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f7984;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f7985;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6263 f7986;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f7987;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12802 f7988;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumMap f7989;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18258 f7990;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21825 f7991;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217(C12802 c12802, C22489 c22489) {
        super(c12802, c22489);
        this.f7988 = c12802;
        C14586 c14586 = (C14586) c12802.f42641.f70876;
        int[] iArr = C16702.f53496;
        AbstractC8774 abstractC8774 = c14586.f47735;
        int i = iArr[abstractC8774.mo1803().ordinal()];
        if (i == 5) {
            C6263 c6263 = ((C6656) abstractC8774).f22475;
            this.f7986 = c6263;
            this.f7984 = c6263;
        } else if (i == 9) {
            this.f7986 = null;
            this.f7984 = C3128.m9471(((C3812) abstractC8774).f14145);
        } else {
            this.f7986 = null;
            this.f7984 = null;
        }
        AbstractC23903 abstractC23903 = this.f3411;
        if (abstractC23903.f77452 == EnumC10477.f35879) {
            this.f7990 = new C3295(this.f3411.m52720(), (C18258) abstractC23903.mo17330(abstractC23903.f77448));
        } else {
            this.f7990 = new C18258(4098L, null, null, abstractC23903.m52720());
        }
        EnumMap enumMap = new EnumMap(EnumC3628.class);
        this.f7989 = enumMap;
        enumMap.put(EnumC3628.PARAM, new LinkedHashMap());
        enumMap.put(EnumC3628.LOCAL_VAR, new LinkedHashMap());
        enumMap.put(EnumC3628.CAPTURED_VAR, new LinkedHashMap());
        enumMap.put(EnumC3628.CAPTURED_THIS, new LinkedHashMap());
        enumMap.put(EnumC3628.CAPTURED_OUTER_THIS, new LinkedHashMap());
        this.f7987 = new HashSet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6836(AbstractC23903 abstractC23903, EnumC3628 enumC3628) {
        AbstractC23903 c4334;
        C22492 c22492M31795;
        C12802 c12802 = this.f7988;
        C22680 c22680 = c12802.f42638;
        if (enumC3628 == EnumC3628.CAPTURED_THIS && abstractC23903 != null && abstractC23903.f77452 == EnumC10477.f35865 && !c12802.f42642.isEmpty() && (c22492M31795 = c12802.m31795()) != null && c12802.f42642.contains(c22492M31795)) {
            C6171.m17176(abstractC23903 != c22492M31795);
            enumC3628 = EnumC3628.CAPTURED_OUTER_THIS;
        }
        Map mapM6832 = m6832(enumC3628);
        if (mapM6832.containsKey(abstractC23903)) {
            return;
        }
        int iOrdinal = enumC3628.ordinal();
        C18258 c18258 = this.f7990;
        if (iOrdinal == 0) {
            C6263 c6263 = new C6263((abstractC23903.mo20276() & 16) | 8589934592L, abstractC23903.f77453, c22680.f73852.m52402(abstractC23903.f77449), c18258);
            C6263 c6264 = (C6263) abstractC23903;
            c6263.f21226 = c6264.f21226;
            if (c6264.m17331()) {
                c6263.m17327(EnumC1923.EXCEPTION_PARAMETER);
            }
            c4334 = c6263;
        } else if (iOrdinal == 1) {
            C11391 c11391 = new C11391(abstractC23903.mo20276() & 16, abstractC23903.f77453, abstractC23903.f77449, c18258, abstractC23903);
            C6263 c6265 = (C6263) abstractC23903;
            c11391.f21226 = c6265.f21226;
            if (c6265.m17331()) {
                c11391.m17327(EnumC1923.EXCEPTION_PARAMETER);
            }
            c4334 = c11391;
        } else if (iOrdinal == 2) {
            c4334 = new C4334(abstractC23903.f77453, c22680.f73852.m52402(abstractC23903.f77449), c18258, abstractC23903);
        } else if (iOrdinal == 3) {
            c4334 = abstractC23903;
        } else if (iOrdinal == 4) {
            C23942 c23942 = c22680.f73845;
            String str = new String(abstractC23903.mo50003().toString().replace('.', '$') + ((Object) c22680.f73845.f77606));
            AbstractC6302 abstractC6302 = c23942.f77631;
            abstractC6302.getClass();
            char[] charArray = str.toCharArray();
            c4334 = new C13508(abstractC6302.mo17390(charArray, charArray.length), c22680.f73852.m52402(abstractC23903.f77449), c18258, abstractC23903);
        } else {
            C6171.m17174(enumC3628.name());
            throw null;
        }
        if (c4334 != abstractC23903 && enumC3628.m10729()) {
            c4334.m52726(abstractC23903.mo20271());
            c4334.m52712(abstractC23903.mo50009());
        }
        mapM6832.put(abstractC23903, c4334);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m6832(EnumC3628 enumC3628) {
        Map map = (Map) this.f7989.get(enumC3628);
        C6171.m17171(map);
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m6834(final C3107 c3107) {
        C22680 c22680 = this.f7988.f42638;
        for (EnumC3628 enumC3628 : EnumC3628.values()) {
            Map mapM6832 = m6832(enumC3628);
            if (enumC3628.ordinal() != 4) {
                if (mapM6832.containsKey(c3107.f11716)) {
                    C3107 c3107M14586 = c22680.f73854.m14586((AbstractC23903) mapM6832.get(c3107.f11716));
                    c3107M14586.f30190 = c3107.f30190;
                    return c3107M14586;
                }
            } else {
                C11521 c11521Reduce = C9030.stream(mapM6832.keySet()).filter(new Predicate() { // from class: l.֫ܳۤ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C2217 c2217 = this.f7120;
                        c2217.getClass();
                        return c3107.f11716.m52704(((AbstractC23903) obj).f77449.f53222, c2217.f7988.f42638.f73852);
                    }
                }).reduce(new C9647());
                if (c11521Reduce.isPresent()) {
                    C3107 c3107M14587 = c22680.f73854.m14586((AbstractC23903) mapM6832.get(c11521Reduce.get()));
                    c3107M14587.f30190 = c3107.f11716.f77448.f77449;
                    C23570 c23570M14625 = c22680.f73854.m14625(c3107M14587, c3107.f11715);
                    c23570M14625.f30190 = c3107.f30190;
                    C3128.m9464(c3107.f11716, c23570M14625);
                    return c23570M14625;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3107 m6833(C23570 c23570) {
        AbstractC11242 abstractC11242 = c23570.f76356;
        C22680 c22680 = this.f7988.f42638;
        C6171.m17176(abstractC11242 == c22680.f73845.f77533);
        Map map = (Map) this.f7989.get(EnumC3628.CAPTURED_OUTER_THIS);
        if (!map.containsKey(c23570.f76355.f77448)) {
            return null;
        }
        C3107 c3107M14586 = c22680.f73854.m14586((AbstractC23903) map.get(c23570.f76355.f77448));
        c3107M14586.f30190 = c23570.f76355.f77448.f77449;
        return c3107M14586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6835(C8378 c8378) {
        C6171.m17176(c8378.f29095.f30190.f53222.m52727() && c8378.f29093 == null);
        Map map = (Map) this.f7989.get(EnumC3628.CAPTURED_OUTER_THIS);
        AbstractC16579 abstractC16579Mo1934 = c8378.f29095.f30190.mo1934();
        if (map.containsKey(abstractC16579Mo1934.f53222)) {
            C3107 c3107M14586 = this.f7988.f42638.f73854.m14586((AbstractC23903) map.get(abstractC16579Mo1934.f53222));
            c3107M14586.f30190 = abstractC16579Mo1934;
            c8378.f29093 = c3107M14586;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m6831() {
        AbstractC11242 abstractC11242M28211;
        C12802 c12802 = this.f7988;
        C22680 c22680 = c12802.f42638;
        if (this.f7991 != null) {
            return;
        }
        C18258 c18258 = this.f7990;
        boolean zM52721 = c18258.f77448.m52721();
        boolean zIsEmpty = m6832(EnumC3628.CAPTURED_THIS).isEmpty();
        AbstractC23903 abstractC23903 = this.f3411;
        long j = (abstractC23903.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 562949953425408L | (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & abstractC23903.f77448.f77447) | 2;
        c18258.f77447 = (zIsEmpty ? 8L : zM52721 ? 8796093022208L : 0L) | j;
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        Iterator it = m6832(EnumC3628.CAPTURED_VAR).values().iterator();
        while (it.hasNext()) {
            C6263 c6263 = (C6263) ((AbstractC23903) it.next());
            c19003.m43723(c22680.f73854.m14594(c6263, (AbstractC5930) null));
            c19004.m43723(c6263);
        }
        Iterator it2 = m6832(EnumC3628.CAPTURED_OUTER_THIS).values().iterator();
        while (it2.hasNext()) {
            C6263 c6264 = (C6263) ((AbstractC23903) it2.next());
            c19003.m43723(c22680.f73854.m14594(c6264, (AbstractC5930) null));
            c19004.m43723(c6264);
        }
        Iterator it3 = m6832(EnumC3628.PARAM).values().iterator();
        while (it3.hasNext()) {
            C6263 c6265 = (C6263) ((AbstractC23903) it3.next());
            c19003.m43723(c22680.f73854.m14594(c6265, (AbstractC5930) null));
            c19004.m43723(c6265);
        }
        this.f7991 = c19003.m43726();
        c18258.f58259 = c19004.m43726();
        boolean zM3376 = m3376();
        AbstractC1696 abstractC1696 = this.f3413;
        if (!zM3376) {
            AbstractC11242 abstractC11242 = c22680.f73845.f77621;
            C23942 c23942 = c22680.f73845;
            StringBuilder sb = new StringBuilder();
            sb.append(m3374());
            sb.append("$");
            int i = c12802.f42639;
            c12802.f42639 = i + 1;
            sb.append(i);
            abstractC11242M28211 = abstractC11242.m28211(c23942.f77631.m17389(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) c22680.f73845.f77621);
            sb2.append(m3374());
            sb2.append('$');
            StringBuilder sb3 = new StringBuilder();
            C6171.m17176((abstractC23903.f77449 == null && c12802.m31799() == null) ? false : true);
            AbstractC16579 abstractC16579 = abstractC23903.f77449;
            if (abstractC16579 != null) {
                sb3.append(c22680.m50213(abstractC16579, true));
                sb3.append(":");
            }
            sb3.append((CharSequence) c22680.f73852.m52385(((C22489) abstractC1696).f30190.f53222).f77448.mo50003());
            sb3.append(" ");
            AbstractC23903 abstractC23904 = this.f7984;
            if (abstractC23904 != null) {
                sb3.append((CharSequence) abstractC23904.mo50003());
                sb3.append("=");
            }
            for (AbstractC23903 abstractC23905 : m6832(EnumC3628.CAPTURED_VAR).keySet()) {
                if (abstractC23905 != this.f7986) {
                    sb3.append(c22680.m50213(abstractC23905.f77449, true));
                    sb3.append(" ");
                    sb3.append((CharSequence) abstractC23905.mo50003());
                    sb3.append(",");
                }
            }
            sb2.append(Integer.toHexString(sb3.toString().hashCode()));
            sb2.append('$');
            sb2.append(c12802.f42644.m48799(sb2));
            abstractC11242M28211 = c22680.f73845.f77631.m17389(sb2.toString());
        }
        c18258.f77453 = abstractC11242M28211;
        c18258.f77449 = c22680.f73852.m52370(c22680.f73852.m52402(((C22489) abstractC1696).m5634(c22680.f73852)), C3128.m9446(this.f7991));
    }
}
