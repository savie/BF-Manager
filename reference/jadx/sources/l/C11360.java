package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۨ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11360 extends AbstractC21943 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Logger f38320 = Logger.getLogger("SvgLeafNode");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f38321;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4303 f38322;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4303 f38323;

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12109() {
        return false;
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC21943 mo12101() {
        C11360 c11360 = new C11360(this.f71178, this.f71177, this.f71179);
        c11360.m48770(this.f71181);
        c11360.f71180 = (C19121) this.f71180.clone();
        c11360.f38321 = this.f38321;
        return c11360;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private double m28464(String str) {
        double d;
        String str2 = (String) this.f71181.get(str);
        if (str2 != null) {
            try {
                if (str2.endsWith("%")) {
                    d = Double.parseDouble(str2.substring(0, str2.length() - 1)) / 100.0d;
                } else {
                    d = Double.parseDouble(str2);
                }
            } catch (NumberFormatException unused) {
                d = 1.0d;
            }
        } else {
            d = 1.0d;
        }
        return Math.min(Math.max(d, 0.0d), 1.0d);
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12103(String str) {
        Level level = Level.FINE;
        StringBuilder sbM23356 = C9023.m23356(str);
        String str2 = this.f38321;
        if (str2 == null) {
            str2 = " null pathData ";
        }
        sbM23356.append(str2);
        String str3 = this.f71179;
        if (str3 == null) {
            str3 = " null name ";
        }
        sbM23356.append(str3);
        f38320.log(level, sbM23356.toString());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28466(String str) {
        this.f38321 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m28465() {
        return this.f38321;
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ */
    public final void mo12108(C19121 c19121) {
        String str = this.f38321;
        if (str == null || str.isEmpty()) {
            return;
        }
        C21237[] c21237ArrM17372 = C6294.m17372(this.f38321, EnumC17583.SVG);
        C19121 c19122 = this.f71176;
        c19122.m43935(c19121);
        boolean zM47714 = C21237.m47714(c21237ArrM17372);
        if (!c19122.m43930() || zM47714) {
            C21237.m47712(c19122, c21237ArrM17372);
        }
        this.f38321 = C21237.m47710(c21237ArrM17372, this.f71178);
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12107(C19121 c19121) {
        String str;
        C19121 c19122 = this.f71176;
        c19122.m43933(c19121);
        c19122.m43927(this.f71180);
        HashMap map = this.f71181;
        if ("non-scaling-stroke".equals(map.get("vector-effect")) || (c19122.m43931() & 6) == 0 || (str = (String) map.get("stroke-width")) == null) {
            return;
        }
        try {
            double d = Double.parseDouble(str);
            double dM43921 = c19122.m43921();
            if (dM43921 != 0.0d) {
                map.put("stroke-width", this.f71178.m17573(d * Math.sqrt(Math.abs(dM43921))));
            }
            if ((c19122.m43931() & 4) != 0) {
                m48771("Scaling of the stroke width is approximate");
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12102(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        C4303 c4303;
        String str2 = this.f38321;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        HashMap map = this.f71181;
        String str3 = (String) map.get("fill");
        String str4 = (String) map.get("stroke");
        Level level = Level.FINE;
        Logger logger = f38320;
        logger.log(level, "fill color " + str3);
        boolean z = "none".equals(str3) || "#00000000".equals(str3);
        boolean z2 = str4 == null || "none".equals(str4);
        if (z && z2) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("<path");
        outputStreamWriter.write("\n");
        if (str3 == null && this.f38323 == null) {
            logger.log(level, "Adding default fill color");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:fillColor=\"#FF000000\"");
            outputStreamWriter.write("\n");
        }
        if (!z2 && !map.containsKey("stroke-width") && this.f38322 == null) {
            logger.log(level, "Adding default stroke width");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:strokeWidth=\"1\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:pathData=\"" + this.f38321 + "\"");
        double dM28464 = m28464("opacity");
        double dM28465 = m28464("fill-opacity");
        double dM28466 = m28464("stroke-opacity");
        String strM4721 = C1323.m4721(dM28465 * dM28464);
        if (strM4721.equals("1")) {
            map.remove("fill-opacity");
        } else {
            map.put("fill-opacity", strM4721);
        }
        String strM4722 = C1323.m4721(dM28466 * dM28464);
        if (strM4722.equals("1")) {
            map.remove("stroke-opacity");
        } else {
            map.put("stroke-opacity", strM4722);
        }
        map.remove("opacity");
        for (Map.Entry entry : map.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) C23934.f77514.get(str5);
            if (!str6.isEmpty()) {
                String strTrim = ((String) entry.getValue()).trim();
                String strM48769 = m48769(strTrim, "#000000");
                if (strM48769 == null) {
                    if (str5.equals("fill") || str5.equals("stroke")) {
                        if (strTrim.startsWith("url(#") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                            AbstractC21943 abstractC21943M17590 = this.f71178.m17590(C20630.m46498(1, 5, strTrim));
                            if (abstractC21943M17590 instanceof C4303) {
                                c4303 = (C4303) abstractC21943M17590;
                            } else {
                                c4303 = null;
                            }
                        } else {
                            c4303 = null;
                        }
                        if (c4303 != null) {
                            C4303 c4303Mo12101 = c4303.mo12101();
                            c4303Mo12101.m12106(this);
                            if (str5.equals("fill")) {
                                c4303Mo12101.m12105(EnumC3471.FILL);
                                this.f38323 = c4303Mo12101;
                            } else {
                                c4303Mo12101.m12105(EnumC3471.STROKE);
                                this.f38322 = c4303Mo12101;
                            }
                        }
                    }
                    if (strTrim.endsWith("px")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 2).trim();
                    }
                } else {
                    strTrim = strM48769;
                }
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str6);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
            }
        }
        if (this.f38323 == null && this.f38322 == null) {
            outputStreamWriter.write(47);
        }
        outputStreamWriter.write(62);
        outputStreamWriter.write("\n");
        C4303 c4304 = this.f38323;
        if (c4304 != null) {
            c4304.mo12102(outputStreamWriter, C15489.m37076(str, EnumC19730.f63352));
        }
        C4303 c4305 = this.f38322;
        if (c4305 != null) {
            c4305.mo12102(outputStreamWriter, C15489.m37076(str, EnumC19730.f63352));
        }
        if (this.f38323 == null && this.f38322 == null) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</path>");
        outputStreamWriter.write("\n");
    }
}
