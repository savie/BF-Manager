package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۙ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5195 extends AbstractC23095 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Logger f18116 = Logger.getLogger("SvgLeafNode");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f18117;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7081 f18118;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7081 f18119;

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo15618() {
        return false;
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23095 mo4137() {
        C5195 c5195 = new C5195(this.f74889, this.f74886, this.f74887);
        c5195.m52000(this.f74888);
        c5195.f74890 = (C23841) this.f74890.clone();
        c5195.f18117 = this.f18117;
        return c5195;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private double m15615(String str) {
        double d;
        String str2 = (String) this.f74888.get(str);
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

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15616(String str) {
        Level level = Level.FINE;
        StringBuilder sbM27333 = C10732.m27333(str);
        String str2 = this.f18117;
        if (str2 == null) {
            str2 = " null pathData ";
        }
        sbM27333.append(str2);
        String str3 = this.f74887;
        if (str3 == null) {
            str3 = " null name ";
        }
        sbM27333.append(str3);
        f18116.log(level, sbM27333.toString());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15617(String str) {
        this.f18117 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m15619() {
        return this.f18117;
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4143(C23841 c23841) {
        String str = this.f18117;
        if (str == null || str.isEmpty()) {
            return;
        }
        C25333[] c25333ArrM21343 = C7827.m21343(this.f18117, EnumC0369.SVG);
        C23841 c23842 = this.f74891;
        c23842.m53189(c23841);
        boolean zM56614 = C25333.m56614(c25333ArrM21343);
        if (!c23842.m53186() || zM56614) {
            C25333.m56612(c23842, c25333ArrM21343);
        }
        this.f18117 = C25333.m56610(c25333ArrM21343, this.f74889);
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4140(C23841 c23841) {
        String str;
        C23841 c23842 = this.f74891;
        c23842.m53184(c23841);
        c23842.m53179(this.f74890);
        HashMap map = this.f74888;
        if ("non-scaling-stroke".equals(map.get("vector-effect")) || (c23842.m53187() & 6) == 0 || (str = (String) map.get("stroke-width")) == null) {
            return;
        }
        try {
            double d = Double.parseDouble(str);
            double dM53173 = c23842.m53173();
            if (dM53173 != 0.0d) {
                map.put("stroke-width", this.f74889.m17262(d * Math.sqrt(Math.abs(dM53173))));
            }
            if ((c23842.m53187() & 4) != 0) {
                m52001("Scaling of the stroke width is approximate");
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4138(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        C7081 c7081;
        String str2 = this.f18117;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        HashMap map = this.f74888;
        String str3 = (String) map.get("fill");
        String str4 = (String) map.get("stroke");
        Level level = Level.FINE;
        Logger logger = f18116;
        logger.log(level, "fill color " + str3);
        boolean z = "none".equals(str3) || "#00000000".equals(str3);
        boolean z2 = str4 == null || "none".equals(str4);
        if (z && z2) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("<path");
        outputStreamWriter.write("\n");
        if (str3 == null && this.f18118 == null) {
            logger.log(level, "Adding default fill color");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:fillColor=\"#FF000000\"");
            outputStreamWriter.write("\n");
        }
        if (!z2 && !map.containsKey("stroke-width") && this.f18119 == null) {
            logger.log(level, "Adding default stroke width");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:strokeWidth=\"1\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:pathData=\"" + this.f18117 + "\"");
        double dM15615 = m15615("opacity");
        double dM15616 = m15615("fill-opacity");
        double dM15617 = m15615("stroke-opacity");
        String strM15932 = C5306.m15932(dM15616 * dM15615);
        if (strM15932.equals("1")) {
            map.remove("fill-opacity");
        } else {
            map.put("fill-opacity", strM15932);
        }
        String strM15933 = C5306.m15932(dM15617 * dM15615);
        if (strM15933.equals("1")) {
            map.remove("stroke-opacity");
        } else {
            map.put("stroke-opacity", strM15933);
        }
        map.remove("opacity");
        for (Map.Entry entry : map.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) C10063.f32283.get(str5);
            if (!str6.isEmpty()) {
                String strTrim = ((String) entry.getValue()).trim();
                String strM51999 = m51999(strTrim, "#000000");
                if (strM51999 == null) {
                    if (str5.equals("fill") || str5.equals("stroke")) {
                        if (strTrim.startsWith("url(#") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                            AbstractC23095 abstractC23095M17277 = this.f74889.m17277(C1402.m5124(1, 5, strTrim));
                            if (abstractC23095M17277 instanceof C7081) {
                                c7081 = (C7081) abstractC23095M17277;
                            } else {
                                c7081 = null;
                            }
                        } else {
                            c7081 = null;
                        }
                        if (c7081 != null) {
                            C7081 c7081Mo4137 = c7081.mo4137();
                            c7081Mo4137.m19418(this);
                            if (str5.equals("fill")) {
                                c7081Mo4137.m19419(EnumC8572.FILL);
                                this.f18118 = c7081Mo4137;
                            } else {
                                c7081Mo4137.m19419(EnumC8572.STROKE);
                                this.f18119 = c7081Mo4137;
                            }
                        }
                    }
                    if (strTrim.endsWith("px")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 2).trim();
                    }
                } else {
                    strTrim = strM51999;
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
        if (this.f18118 == null && this.f18119 == null) {
            outputStreamWriter.write(47);
        }
        outputStreamWriter.write(62);
        outputStreamWriter.write("\n");
        C7081 c7082 = this.f18118;
        if (c7082 != null) {
            c7082.mo4138(outputStreamWriter, C14483.m34972(str, EnumC7687.f25319));
        }
        C7081 c7083 = this.f18119;
        if (c7083 != null) {
            c7083.mo4138(outputStreamWriter, C14483.m34972(str, EnumC7687.f25319));
        }
        if (this.f18118 == null && this.f18119 == null) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</path>");
        outputStreamWriter.write("\n");
    }
}
