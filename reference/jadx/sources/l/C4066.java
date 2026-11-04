package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4066 extends AbstractC16146 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21220 f13883;

    @Override // l.AbstractC16146, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1771(C17969 c17969, Locale locale) {
        C17969 c179610 = (C17969) c17969.m51064();
        C21220 c21220 = this.f13883;
        Iterator it = ((Map) c21220.f67724.get(EnumC14506.TYPEVAR)).keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC22664) it.next()).m51064().toString().equals(c179610.toString())) {
                i++;
            }
        }
        if (i < 1) {
            throw new AssertionError("Missing type variable in where clause: " + c179610);
        }
        if (i != 1) {
            if (((C24204) c21220.f39234).f78407.contains(EnumC6304.UNIQUE_TYPEVAR_NAMES)) {
                return mo13132(locale, "compiler.misc.type.var", c17969.toString(), Integer.valueOf(C21220.m48376(c21220, c17969, EnumC14506.TYPEVAR)));
            }
        }
        return c17969.toString();
    }

    public C4066(C21220 c21220) {
        this.f13883 = c21220;
    }

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1770(C14018 c14018, Object obj) {
        Locale locale = (Locale) obj;
        C21220 c21220 = this.f13883;
        if (((C24204) c21220.f39234).f78407.contains(EnumC6304.WHERE_CLAUSES)) {
            return mo13132(locale, "compiler.misc.captured.type", Integer.valueOf(C21220.m48376(c21220, c14018, EnumC14506.CAPTURED)));
        }
        return super.m38325(c14018, locale);
    }

    @Override // l.AbstractC16146
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo13132(Locale locale, String str, Object... objArr) {
        return this.f13883.f39235.mo12282(locale, str, objArr);
    }

    @Override // l.AbstractC16146
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo13136(C14018 c14018) {
        return C12669.m31437(C21220.m48376(this.f13883, c14018, EnumC14506.CAPTURED), "", new StringBuilder());
    }

    @Override // l.AbstractC16146, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1766(AbstractC22664 abstractC22664, Locale locale) {
        return abstractC22664 == this.f13883.f67728.f48241 ? mo13132(locale, "compiler.misc.type.null", new Object[0]) : super.mo1766(abstractC22664, locale);
    }

    @Override // l.AbstractC16146, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1768(C10510 c10510, Locale locale) {
        if (c10510.mo18914()) {
            C21220 c21220 = this.f13883;
            if (((C24204) c21220.f39234).f78407.contains(EnumC6304.WHERE_CLAUSES)) {
                return mo13132(locale, "compiler.misc.intersection.type", Integer.valueOf(C21220.m48376(c21220, c10510, EnumC14506.INTERSECTION)));
            }
        }
        return super.mo1768(c10510, locale);
    }

    @Override // l.AbstractC16146
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo13135(C10510 c10510, boolean z, Locale locale) {
        AbstractC22970 abstractC22970 = c10510.f73596;
        if (abstractC22970.f38072.length() != 0) {
            C21220 c21220 = this.f13883;
            C24204 c24204 = (C24204) c21220.f39234;
            if (c24204.f78407.contains(EnumC6304.SIMPLE_NAMES)) {
                if (z) {
                    return c21220.f67730.m30649(abstractC22970).toString();
                }
                return abstractC22970.f38072.toString();
            }
        }
        return super.mo13135(c10510, z, locale);
    }

    @Override // l.AbstractC16146, l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo7183(C24550 c24550, Locale locale) {
        if (c24550.f38067.mo18914()) {
            return (String) c24550.f38067.mo9324(this, locale);
        }
        C21220 c21220 = this.f13883;
        String strM30649 = c21220.f67730.m30649(c24550);
        if (strM30649.length() != 0) {
            C24204 c24204 = (C24204) c21220.f39234;
            if (c24204.f78407.contains(EnumC6304.SIMPLE_NAMES)) {
                return strM30649;
            }
        }
        return super.mo7183(c24550, locale);
    }

    @Override // l.AbstractC16146, l.InterfaceC2087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo7179(C10377 c10377, Locale locale) {
        String string = (String) c10377.f38069.mo16953(this, locale);
        if (c10377.m26693()) {
            return string;
        }
        AbstractC19728 abstractC19728 = c10377.f38072;
        if (abstractC19728 != abstractC19728.f63499.f73707.f49865) {
            string = abstractC19728.toString();
        }
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
