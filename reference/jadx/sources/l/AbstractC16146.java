package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 140K */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16146 implements InterfaceC4764, InterfaceC2087 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14769 f52435 = C14769.m35543();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo13132(Locale locale, String str, Object... objArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo13136(C14018 c14018);

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        AbstractC22664 abstractC22664 = c2832;
        while (abstractC22664.m51067(EnumC21172.ARRAY)) {
            abstractC22664 = ((C2832) abstractC22664).f9333;
        }
        sb.append((String) abstractC22664.mo9324(this, locale));
        for (AbstractC22664 abstractC22665 = c2832; abstractC22665.m51067(EnumC21172.ARRAY); abstractC22665 = ((C2832) abstractC22665).f9333) {
            sb.append(m38324(abstractC22665, true));
            sb.append("[]");
        }
        return sb.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10771(C3053 c3053, Object obj) {
        return mo1766((AbstractC22664) c3053, (Locale) obj);
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4102(C5291 c5291, Object obj) {
        Locale locale = (Locale) obj;
        return m38324((AbstractC22664) c5291, false) + "<" + m38326(c5291.f18620, locale) + ">" + ((String) c5291.f72657.mo9324(this, locale));
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7177(C5816 c5816, Object obj) {
        return c5816.f38072.toString();
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7178(C7395 c7395, Object obj) {
        return mo7179((C10377) c7395, (Locale) obj);
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1125(C8274 c8274, Object obj) {
        Locale locale = (Locale) obj;
        if (c8274.m22338() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m38324((AbstractC22664) c8274, false));
            return C8947.m23910(sb, (String) c8274.f72657.mo9324(this, locale), "?");
        }
        return m38324((AbstractC22664) c8274, false) + ((String) c8274.m22338().mo9324(this, locale));
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        EnumC18670 enumC18670 = c10729.f34073;
        sb.append(enumC18670);
        if (enumC18670 != EnumC18670.UNBOUND) {
            sb.append(m38324((AbstractC22664) c10729, false));
            sb.append((String) c10729.f34074.mo9324(this, locale));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7180(AbstractC11781 abstractC11781, Object obj) {
        return abstractC11781.f38072.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10772(C12748 c12748, Object obj) {
        return mo1766((AbstractC22664) c12748, (Locale) obj);
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7181(C14106 c14106, Object obj) {
        Locale locale = (Locale) obj;
        if (c14106.m34259()) {
            return mo13132(locale, "compiler.misc.unnamed.package", new Object[0]);
        }
        return c14106.f44619.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10773(C20207 c20207, Object obj) {
        return c20207.f73596.mo29582().toString();
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7182(AbstractC22970 abstractC22970, Object obj) {
        return abstractC22970.f38072.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2231(C23191 c23191, Object obj) {
        Locale locale = (Locale) obj;
        return MotionUtils.EASING_TYPE_FORMAT_START + m38326(c23191.f75155, locale) + MotionUtils.EASING_TYPE_FORMAT_END + ((String) c23191.f75156.mo9324(this, locale));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38326(C14769 c14769, Locale locale) {
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43089((String) ((AbstractC22664) it.next()).mo9324(this, locale));
        }
        return c18499.m43093().m35545(",");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m38325(C14018 c14018, Locale locale) {
        if (this.f52435.contains(c14018)) {
            return m38324((AbstractC22664) c14018, false) + mo13132(locale, "compiler.misc.type.captureof.1", mo13136(c14018));
        }
        try {
            this.f52435 = this.f52435.m35552(c14018);
            return m38324((AbstractC22664) c14018, false) + mo13132(locale, "compiler.misc.type.captureof", mo13136(c14018), (String) c14018.f44410.mo9324(this, locale));
        } finally {
            this.f52435 = this.f52435.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38324(AbstractC22664 abstractC22664, boolean z) {
        StringBuilder sb = new StringBuilder();
        C14769 c14769M51071 = abstractC22664.m51071();
        if (!c14769M51071.isEmpty()) {
            if (z) {
                sb.append(' ');
            }
            sb.append(c14769M51071);
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public String mo1768(C10510 c10510, Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (c10510.mo23449().m51067(EnumC21172.CLASS) && c10510.f73596.f38069.f38066 == EnumC13603.f43213) {
            sb.append((String) c10510.mo23449().mo9324(this, locale));
            sb.append('.');
            sb.append(m38324((AbstractC22664) c10510, false));
            sb.append(mo13135(c10510, false, locale));
        } else {
            sb.append(m38324((AbstractC22664) c10510, false));
            sb.append(mo13135(c10510, true, locale));
        }
        if (c10510.mo15882().m35550()) {
            sb.append('<');
            sb.append(m38326(c10510.mo15882(), locale));
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public String mo1771(C17969 c17969, Locale locale) {
        return mo1766((AbstractC22664) c17969, locale);
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public String mo1766(AbstractC22664 abstractC22664, Locale locale) {
        AbstractC19728 abstractC19728;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        if (abstractC22970 == null || (abstractC19728 = abstractC22970.f38072) == null) {
            return mo13132(locale, "compiler.misc.type.none", new Object[0]);
        }
        return abstractC19728.toString();
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo13135(C10510 c10510, boolean z, Locale locale) {
        AbstractC22970 abstractC22970 = c10510.f73596;
        if (abstractC22970.f38072.length() != 0 || (abstractC22970.mo29591() & 16777216) == 0) {
            if (abstractC22970.f38072.length() != 0) {
                return z ? abstractC22970.mo29582().toString() : abstractC22970.f38072.toString();
            }
            C10510 c10511 = (C10510) c10510.f73596.f38067;
            if (c10511 == null) {
                return mo13132(locale, "compiler.misc.anonymous.class", null);
            }
            C14769 c14769 = c10511.f33437;
            return (c14769 == null || !c14769.m35550()) ? mo13132(locale, "compiler.misc.anonymous.class", (String) c10511.f33442.mo9324(this, locale)) : mo13132(locale, "compiler.misc.anonymous.class", (String) ((AbstractC22664) c10511.f33437.f48335).mo9324(this, locale));
        }
        StringBuilder sb = new StringBuilder((String) c10510.f33442.mo9324(this, locale));
        for (C14769 c147610 = c10510.f33437; c147610.m35550(); c147610 = c147610.f48336) {
            sb.append('&');
            sb.append((String) ((AbstractC22664) c147610.f48335).mo9324(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38327(C14769 c14769, boolean z, Locale locale) {
        if (!z) {
            return m38326(c14769, locale);
        }
        StringBuilder sb = new StringBuilder();
        while (c14769.f48336.m35550()) {
            sb.append((String) ((AbstractC22664) c14769.f48335).mo9324(this, locale));
            c14769 = c14769.f48336;
            sb.append(',');
        }
        if (((AbstractC22664) c14769.f48335).m51067(EnumC21172.ARRAY)) {
            sb.append((String) ((C2832) c14769.f48335).f9333.mo9324(this, locale));
            if (((AbstractC22664) c14769.f48335).m51071().m35550()) {
                sb.append(' ');
                sb.append(((AbstractC22664) c14769.f48335).m51071());
                sb.append(' ');
            }
            sb.append("...");
        } else {
            sb.append((String) ((AbstractC22664) c14769.f48335).mo9324(this, locale));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public String mo7183(C24550 c24550, Locale locale) {
        return c24550.f38072.isEmpty() ? mo13132(locale, "compiler.misc.anonymous.class", c24550.f79578) : c24550.f79577.toString();
    }

    @Override // l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public String mo7179(C10377 c10377, Locale locale) {
        if (c10377.m26693()) {
            return c10377.f38069.f38072.toString();
        }
        AbstractC19728 abstractC19728 = c10377.f38072;
        String string = abstractC19728 == abstractC19728.f63499.f73707.f49865 ? c10377.f38069.f38072.toString() : abstractC19728.toString();
        AbstractC22664 abstractC22664 = c10377.f38067;
        if (abstractC22664 == null) {
            return string;
        }
        if (abstractC22664.m51067(EnumC21172.FORALL)) {
            string = "<" + m38326(c10377.f38067.mo15882(), locale) + ">" + string;
        }
        return C8947.m23910(C3188.m10405(string, MotionUtils.EASING_TYPE_FORMAT_START), m38327(c10377.f38067.mo50621(), (c10377.f38071 & 17179869184L) != 0, locale), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
