package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 140K */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9771 implements InterfaceC15874, InterfaceC11203 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21825 f33464 = C21825.m48588();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo11218(Locale locale, String str, Object... objArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo11219(C20771 c20771);

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        EnumC15395 enumC15395 = c0350.f1776;
        sb.append(enumC15395);
        if (enumC15395 != EnumC15395.UNBOUND) {
            sb.append(m24871((AbstractC16579) c0350, false));
            sb.append((String) c0350.f1774.mo1928(this, locale));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24872(AbstractC0618 abstractC0618, Object obj) {
        return abstractC0618.f77453.toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11012(C2466 c2466, Object obj) {
        return c2466.f53222.mo20270().toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        return mo1767((AbstractC16579) c5954, (Locale) obj);
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24873(C6263 c6263, Object obj) {
        return c6263.f77453.toString();
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24874(C7675 c7675, Object obj) {
        Locale locale = (Locale) obj;
        if (c7675.m20275()) {
            return mo11218(locale, "compiler.misc.unnamed.package", new Object[0]);
        }
        return c7675.f25396.toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        AbstractC16579 abstractC16579 = c8777;
        while (abstractC16579.m39001(EnumC6617.ARRAY)) {
            abstractC16579 = ((C8777) abstractC16579).f30194;
        }
        sb.append((String) abstractC16579.mo1928(this, locale));
        for (AbstractC16579 abstractC165710 = c8777; abstractC165710.m39001(EnumC6617.ARRAY); abstractC165710 = ((C8777) abstractC165710).f30194) {
            sb.append(m24871(abstractC165710, true));
            sb.append("[]");
        }
        return sb.toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4813(C10229 c10229, Object obj) {
        Locale locale = (Locale) obj;
        if (c10229.m26017() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m24871((AbstractC16579) c10229, false));
            return C22697.m50267(sb, (String) c10229.f53121.mo1928(this, locale), "?");
        }
        return m24871((AbstractC16579) c10229, false) + ((String) c10229.m26017().mo1928(this, locale));
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24875(C10498 c10498, Object obj) {
        return mo4412((C18258) c10498, (Locale) obj);
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9280(C10894 c10894, Object obj) {
        Locale locale = (Locale) obj;
        return m24871((AbstractC16579) c10894, false) + "<" + m24881(c10894.f37076, locale) + ">" + ((String) c10894.f53121.mo1928(this, locale));
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11013(C11640 c11640, Object obj) {
        return mo1767((AbstractC16579) c11640, (Locale) obj);
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6581(C13757 c13757, Object obj) {
        Locale locale = (Locale) obj;
        return MotionUtils.EASING_TYPE_FORMAT_START + m24881(c13757.f45367, locale) + MotionUtils.EASING_TYPE_FORMAT_END + ((String) c13757.f45368.mo1928(this, locale));
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4414(AbstractC23903 abstractC23903, Object obj) {
        return abstractC23903.f77453.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24881(C21825 c21825, Locale locale) {
        C19003 c19003 = new C19003();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            c19003.m43723((String) ((AbstractC16579) it.next()).mo1928(this, locale));
        }
        return c19003.m43726().m48590(",");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m24880(C20771 c20771, Locale locale) {
        if (this.f33464.contains(c20771)) {
            return m24871((AbstractC16579) c20771, false) + mo11218(locale, "compiler.misc.type.captureof.1", mo11219(c20771));
        }
        try {
            this.f33464 = this.f33464.m48597(c20771);
            return m24871((AbstractC16579) c20771, false) + mo11218(locale, "compiler.misc.type.captureof", mo11219(c20771), (String) c20771.f67572.mo1928(this, locale));
        } finally {
            this.f33464 = this.f33464.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24871(AbstractC16579 abstractC16579, boolean z) {
        StringBuilder sb = new StringBuilder();
        C21825 c21825M39008 = abstractC16579.m39008();
        if (!c21825M39008.isEmpty()) {
            if (z) {
                sb.append(' ');
            }
            sb.append(c21825M39008);
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String mo1768(C0309 c0309, Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (c0309.mo1934().m39001(EnumC6617.CLASS) && c0309.f53222.f77448.f77452 == EnumC10477.f35865) {
            sb.append((String) c0309.mo1934().mo1928(this, locale));
            sb.append('.');
            sb.append(m24871((AbstractC16579) c0309, false));
            sb.append(mo24877(c0309, false, locale));
        } else {
            sb.append(m24871((AbstractC16579) c0309, false));
            sb.append(mo24877(c0309, true, locale));
        }
        if (c0309.mo1938().m48595()) {
            sb.append('<');
            sb.append(m24881(c0309.mo1938(), locale));
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String mo1769(C22929 c22929, Locale locale) {
        return mo1767((AbstractC16579) c22929, locale);
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String mo1767(AbstractC16579 abstractC16579, Locale locale) {
        AbstractC11242 abstractC11242;
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        if (abstractC0618 == null || (abstractC11242 = abstractC0618.f77453) == null) {
            return mo11218(locale, "compiler.misc.type.none", new Object[0]);
        }
        return abstractC11242.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo24877(C0309 c0309, boolean z, Locale locale) {
        AbstractC0618 abstractC0618 = c0309.f53222;
        if (abstractC0618.f77453.length() != 0 || (abstractC0618.mo20276() & 16777216) == 0) {
            if (abstractC0618.f77453.length() != 0) {
                return z ? abstractC0618.mo20270().toString() : abstractC0618.f77453.toString();
            }
            C0309 c03010 = (C0309) c0309.f53222.f77449;
            if (c03010 == null) {
                return mo11218(locale, "compiler.misc.anonymous.class", null);
            }
            C21825 c21825 = c03010.f1658;
            return (c21825 == null || !c21825.m48595()) ? mo11218(locale, "compiler.misc.anonymous.class", (String) c03010.f1654.mo1928(this, locale)) : mo11218(locale, "compiler.misc.anonymous.class", (String) ((AbstractC16579) c03010.f1658.f70876).mo1928(this, locale));
        }
        StringBuilder sb = new StringBuilder((String) c0309.f1654.mo1928(this, locale));
        for (C21825 c21826 = c0309.f1658; c21826.m48595(); c21826 = c21826.f70877) {
            sb.append('&');
            sb.append((String) ((AbstractC16579) c21826.f70876).mo1928(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24882(C21825 c21825, boolean z, Locale locale) {
        if (!z) {
            return m24881(c21825, locale);
        }
        StringBuilder sb = new StringBuilder();
        while (c21825.f70877.m48595()) {
            sb.append((String) ((AbstractC16579) c21825.f70876).mo1928(this, locale));
            c21825 = c21825.f70877;
            sb.append(',');
        }
        if (((AbstractC16579) c21825.f70876).m39001(EnumC6617.ARRAY)) {
            sb.append((String) ((C8777) c21825.f70876).f30194.mo1928(this, locale));
            if (((AbstractC16579) c21825.f70876).m39008().m48595()) {
                sb.append(' ');
                sb.append(((AbstractC16579) c21825.f70876).m39008());
                sb.append(' ');
            }
            sb.append("...");
        } else {
            sb.append((String) ((AbstractC16579) c21825.f70876).mo1928(this, locale));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String mo4413(C22492 c22492, Locale locale) {
        return c22492.f77453.isEmpty() ? mo11218(locale, "compiler.misc.anonymous.class", c22492.f73414) : c22492.f73419.toString();
    }

    @Override // l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String mo4412(C18258 c18258, Locale locale) {
        if (c18258.m42450()) {
            return c18258.f77448.f77453.toString();
        }
        AbstractC11242 abstractC11242 = c18258.f77453;
        String string = abstractC11242 == abstractC11242.f38032.f21322.f77632 ? c18258.f77448.f77453.toString() : abstractC11242.toString();
        AbstractC16579 abstractC16579 = c18258.f77449;
        if (abstractC16579 == null) {
            return string;
        }
        if (abstractC16579.m39001(EnumC6617.FORALL)) {
            string = "<" + m24881(c18258.f77449.mo1938(), locale) + ">" + string;
        }
        return C22697.m50267(C3012.m8976(string, MotionUtils.EASING_TYPE_FORMAT_START), m24882(c18258.f77449.mo33523(), (c18258.f77447 & 17179869184L) != 0, locale), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
