package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes.dex */
public final class C23091 extends AbstractC9771 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21679 f75036;

    @Override // l.AbstractC9771, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final String mo1769(C22929 c22929, Locale locale) {
        C22929 c229210 = (C22929) c22929.m39007();
        C21679 c21679 = this.f75036;
        Iterator it = ((Map) c21679.f70316.get(EnumC15330.TYPEVAR)).keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC16579) it.next()).m39007().toString().equals(c229210.toString())) {
                i++;
            }
        }
        if (i < 1) {
            throw new AssertionError("Missing type variable in where clause: " + c229210);
        }
        if (i != 1) {
            if (((C6862) c21679.f13667).f23143.contains(EnumC4039.UNIQUE_TYPEVAR_NAMES)) {
                return mo11218(locale, "compiler.misc.type.var", c22929.toString(), Integer.valueOf(C21679.m48419(c21679, c22929, EnumC15330.TYPEVAR)));
            }
        }
        return c22929.toString();
    }

    public C23091(C21679 c21679) {
        this.f75036 = c21679;
    }

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11014(C20771 c20771, Object obj) {
        Locale locale = (Locale) obj;
        C21679 c21679 = this.f75036;
        if (((C6862) c21679.f13667).f23143.contains(EnumC4039.WHERE_CLAUSES)) {
            return mo11218(locale, "compiler.misc.captured.type", Integer.valueOf(C21679.m48419(c21679, c20771, EnumC15330.CAPTURED)));
        }
        return super.m24880(c20771, locale);
    }

    @Override // l.AbstractC9771
    /* JADX INFO: renamed from: ۙ */
    public final String mo11218(Locale locale, String str, Object... objArr) {
        return this.f75036.f13668.mo15110(locale, str, objArr);
    }

    @Override // l.AbstractC9771
    /* JADX INFO: renamed from: ۙ */
    public final String mo11219(C20771 c20771) {
        return C12441.m30911(C21679.m48419(this.f75036, c20771, EnumC15330.CAPTURED), "", new StringBuilder());
    }

    @Override // l.AbstractC9771, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final String mo1767(AbstractC16579 abstractC16579, Locale locale) {
        return abstractC16579 == this.f75036.f70320.f14228 ? mo11218(locale, "compiler.misc.type.null", new Object[0]) : super.mo1767(abstractC16579, locale);
    }

    @Override // l.AbstractC9771, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final String mo1768(C0309 c0309, Locale locale) {
        if (c0309.mo12731()) {
            C21679 c21679 = this.f75036;
            if (((C6862) c21679.f13667).f23143.contains(EnumC4039.WHERE_CLAUSES)) {
                return mo11218(locale, "compiler.misc.intersection.type", Integer.valueOf(C21679.m48419(c21679, c0309, EnumC15330.INTERSECTION)));
            }
        }
        return super.mo1768(c0309, locale);
    }

    @Override // l.AbstractC9771
    /* JADX INFO: renamed from: ۙ */
    public final String mo24877(C0309 c0309, boolean z, Locale locale) {
        AbstractC0618 abstractC0618 = c0309.f53222;
        if (abstractC0618.f77453.length() != 0) {
            C21679 c21679 = this.f75036;
            C6862 c6862 = (C6862) c21679.f13667;
            if (c6862.f23143.contains(EnumC4039.SIMPLE_NAMES)) {
                if (z) {
                    return c21679.f70315.m32701(abstractC0618).toString();
                }
                return abstractC0618.f77453.toString();
            }
        }
        return super.mo24877(c0309, z, locale);
    }

    @Override // l.AbstractC9771, l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ */
    public final String mo4413(C22492 c22492, Locale locale) {
        if (c22492.f77449.mo12731()) {
            return (String) c22492.f77449.mo1928(this, locale);
        }
        C21679 c21679 = this.f75036;
        String strM32701 = c21679.f70315.m32701(c22492);
        if (strM32701.length() != 0) {
            C6862 c6862 = (C6862) c21679.f13667;
            if (c6862.f23143.contains(EnumC4039.SIMPLE_NAMES)) {
                return strM32701;
            }
        }
        return super.mo4413(c22492, locale);
    }

    @Override // l.AbstractC9771, l.InterfaceC11203
    /* JADX INFO: renamed from: ۙ */
    public final String mo4412(C18258 c18258, Locale locale) {
        String string = (String) c18258.f77448.mo2879(this, locale);
        if (c18258.m42450()) {
            return string;
        }
        AbstractC11242 abstractC11242 = c18258.f77453;
        if (abstractC11242 != abstractC11242.f38032.f21322.f77632) {
            string = abstractC11242.toString();
        }
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
