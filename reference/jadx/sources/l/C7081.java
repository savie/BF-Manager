package l;

import android.graphics.Path;
import android.graphics.RectF;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ۜۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7081 extends AbstractC23095 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Logger f23341 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17589 f23342;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC8572 f23343;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public RectF f23344;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5195 f23345;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f23346;

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4143(C23841 c23841) {
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15618() {
        return false;
    }

    static {
        C25049 c25049M41247 = AbstractC17589.m41247();
        c25049M41247.mo14569("x1", 0);
        c25049M41247.mo14569("y1", 1);
        c25049M41247.mo14569("x2", 2);
        c25049M41247.mo14569("y2", 3);
        f23342 = c25049M41247.mo14568();
    }

    public C7081(C5941 c5941, Element element, String str) {
        super(c5941, element, str);
        this.f23346 = new ArrayList();
        this.f23344 = new RectF();
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final C7081 mo4137() {
        C7081 c7081 = new C7081(this.f74889, this.f74886, this.f74887);
        c7081.m52000(this.f74888);
        c7081.f74890 = (C23841) this.f74890.clone();
        for (C16776 c16776 : this.f23346) {
            c7081.m19417(c16776.m39610(), c16776.m39613(), c16776.m39612());
        }
        return c7081;
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15616(String str) {
        Level level = Level.FINE;
        StringBuilder sbM10405 = C3188.m10405(str, "current gradient is :");
        sbM10405.append(this.f74887);
        f23341.log(level, sbM10405.toString());
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4140(C23841 c23841) {
        C23841 c23842 = this.f74891;
        c23842.m53184(c23841);
        c23842.m53179(this.f74890);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2606 m19416(String str, double d) {
        HashMap map = this.f74888;
        boolean z = false;
        if (!map.containsKey(str)) {
            return new C2606(d, false);
        }
        String strTrim = ((String) map.get(str)).trim();
        if (str.equals("r") && strTrim.startsWith("-")) {
            return new C2606(d, false);
        }
        try {
            if (strTrim.endsWith("%")) {
                d = Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) / 100.0d;
                z = true;
            } else {
                d = Double.parseDouble(strTrim);
            }
        } catch (NumberFormatException unused) {
            m52002("Unsupported coordinate value");
        }
        return new C2606(d, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4138(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        String str2;
        AbstractC17589 abstractC17589;
        C5941 c5941;
        double[] dArr;
        float f;
        AbstractC17589 abstractC175810;
        ArrayList<C16776> arrayList = this.f23346;
        if (arrayList.isEmpty()) {
            m52002("Gradient has no stop info");
            return;
        }
        Path path = new Path();
        C11906.m29787(C7827.m21343(this.f23345.m15619(), EnumC0369.SVG), path);
        RectF rectF = this.f23344;
        path.computeBounds(rectF, true);
        float f2 = rectF.top;
        double dM17281 = f2 - rectF.bottom;
        float f3 = rectF.left;
        double dM17278 = f3 - rectF.right;
        double d = f3;
        double d2 = f2;
        HashMap map = this.f74888;
        boolean zEquals = "userSpaceOnUse".equals((String) map.get("gradientUnits"));
        C5941 c5942 = this.f74889;
        if (zEquals) {
            dM17281 = c5942.m17281();
            dM17278 = c5942.m17278();
            d2 = 0.0d;
            d = 0.0d;
        }
        if (dM17278 == 0.0d || dM17281 == 0.0d) {
            return;
        }
        outputStreamWriter.write(str);
        if (this.f23343 == EnumC8572.FILL) {
            outputStreamWriter.write("<aapt:attr name=\"android:fillColor\">");
        } else {
            outputStreamWriter.write("<aapt:attr name=\"android:strokeColor\">");
        }
        String str3 = "\n";
        outputStreamWriter.write("\n");
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC7687.f25319);
        outputStreamWriter.write("<gradient ");
        if (map.containsKey("gradientTransform")) {
            m52003((String) map.get("gradientTransform"));
            if (!zEquals) {
                C23841 c23841 = new C23841(dM17278, dM17281);
                this.f74890.m53189(c23841);
                try {
                    c23841.m53182();
                    this.f74890.m53179(c23841);
                } catch (C20857 e) {
                    throw new Error(e);
                }
            }
        }
        if (zEquals) {
            this.f74890.m53189(this.f23345.f74891);
        }
        boolean zEquals2 = (map.containsKey("gradientType") ? (String) map.get("gradientType") : "linear").equals("linear");
        AbstractC17589 abstractC175811 = f23342;
        if (zEquals2) {
            double[] dArr2 = new double[4];
            dArr = new double[4];
            AbstractC4516 it = abstractC175811.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = str3;
                String str5 = (String) entry.getKey();
                AbstractC17589 abstractC175812 = abstractC175811;
                int iIntValue = ((Integer) entry.getValue()).intValue();
                C5941 c5943 = c5942;
                HashMap map2 = map;
                C2606 c2606M19416 = m19416(str5, iIntValue == 2 ? 1.0d : 0.0d);
                double dM8734 = c2606M19416.m8734();
                if (!zEquals || c2606M19416.m8735()) {
                    dM8734 = iIntValue % 2 == 0 ? (dM8734 * dM17278) + d : (dM8734 * dM17281) + d2;
                }
                dArr2[iIntValue] = dM8734;
                dArr[iIntValue] = dM8734;
                map = map2;
                if (!map.containsKey(str5)) {
                    map.put(str5, "");
                }
                c5942 = c5943;
                abstractC175811 = abstractC175812;
                str3 = str4;
            }
            str2 = str3;
            abstractC17589 = abstractC175811;
            this.f74890.m53190(dArr2, dArr, 2);
            c5941 = c5942;
        } else {
            str2 = "\n";
            abstractC17589 = abstractC175811;
            C2606 c2606M19417 = m19416("cx", 0.5d);
            double dM8735 = c2606M19417.m8734();
            if (!zEquals || c2606M19417.m8735()) {
                dM8735 = (dM8735 * dM17278) + d;
            }
            C2606 c2606M19418 = m19416("cy", 0.5d);
            double dM8736 = c2606M19418.m8734();
            if (!zEquals || c2606M19418.m8735()) {
                dM8736 = (dM8736 * dM17281) + d2;
            }
            C2606 c2606M19419 = m19416("r", 0.5d);
            double dM8737 = c2606M19419.m8734();
            if (!zEquals || c2606M19419.m8735()) {
                dM8737 *= Math.max(dM17281, dM17278);
            }
            double[] dArr3 = {dM8735, dM8736};
            this.f74890.m53190(new double[]{dM8735, dM8736}, dArr3, 1);
            C12652 c12652 = new C12652(dM8737, 0.0d);
            C12652 c12653 = new C12652(dM8737, 0.0d);
            this.f74890.m53178(c12652, c12653);
            c5941 = c5942;
            map.put("cx", c5941.m17262(dArr3[0]));
            map.put("cy", c5941.m17262(dArr3[1]));
            double d3 = 0.0d - c12653.f40565;
            double d4 = 0.0d - c12653.f40566;
            map.put("r", c5941.m17262(Math.sqrt((d4 * d4) + (d3 * d3))));
            dArr = dArr3;
        }
        AbstractC4516 it2 = C10063.f32282.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            String str8 = (String) map.get(str6);
            if (!str7.isEmpty() && str8 != null) {
                String strTrim = str8.trim();
                String strM51999 = m51999(strTrim, "#000000");
                if (strM51999 == null) {
                    abstractC175810 = abstractC17589;
                    Integer num = (Integer) abstractC175810.get(str6);
                    if (num != null) {
                        strTrim = c5941.m17262(dArr[num.intValue()]);
                    } else if (str6.equals("spreadMethod")) {
                        if (strTrim.equals("pad")) {
                            strTrim = "clamp";
                        } else if (strTrim.equals("reflect")) {
                            strTrim = "mirror";
                        } else if (strTrim.equals("repeat")) {
                            strTrim = "repeat";
                        } else {
                            m52002("Unsupported spreadMethod ".concat(strTrim));
                            strTrim = "clamp";
                        }
                    } else {
                        if (strTrim.endsWith("%")) {
                            strM51999 = c5941.m17262(m19416(str6, 0.0d).m8734());
                        }
                        String str9 = str2;
                        outputStreamWriter.write(str9);
                        outputStreamWriter.write(str);
                        outputStreamWriter.write(EnumC7687.f25319);
                        outputStreamWriter.write(ASN1Dump.TAB);
                        outputStreamWriter.write(str7);
                        outputStreamWriter.write("=\"");
                        outputStreamWriter.write(strTrim);
                        outputStreamWriter.write("\"");
                        str2 = str9;
                        abstractC17589 = abstractC175810;
                    }
                    String str10 = str2;
                    outputStreamWriter.write(str10);
                    outputStreamWriter.write(str);
                    outputStreamWriter.write(EnumC7687.f25319);
                    outputStreamWriter.write(ASN1Dump.TAB);
                    outputStreamWriter.write(str7);
                    outputStreamWriter.write("=\"");
                    outputStreamWriter.write(strTrim);
                    outputStreamWriter.write("\"");
                    str2 = str10;
                    abstractC17589 = abstractC175810;
                } else {
                    abstractC175810 = abstractC17589;
                }
                strTrim = strM51999;
                String str11 = str2;
                outputStreamWriter.write(str11);
                outputStreamWriter.write(str);
                outputStreamWriter.write(EnumC7687.f25319);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str7);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
                str2 = str11;
                abstractC17589 = abstractC175810;
            }
        }
        String str12 = str2;
        outputStreamWriter.write(62);
        outputStreamWriter.write(str12);
        String str13 = str + ASN1Dump.TAB;
        for (C16776 c16776 : arrayList) {
            String strM39610 = c16776.m39610();
            try {
                f = Float.parseFloat(c16776.m39612());
            } catch (NumberFormatException unused) {
                m52001("Unsupported opacity value");
                f = 1.0f;
            }
            int iM41727 = C17873.m41727(strM39610);
            int i = C17127.f55875;
            String str14 = String.format("#%08X", Integer.valueOf((iM41727 & 16777215) | (((int) (((iM41727 >> 24) & 255) * f)) << 24)));
            outputStreamWriter.write(str13);
            outputStreamWriter.write("<item android:offset=\"");
            outputStreamWriter.write(C4560.m14325(c16776.m39613()));
            outputStreamWriter.write("\"");
            outputStreamWriter.write(" android:color=\"");
            outputStreamWriter.write(str14);
            outputStreamWriter.write("\"/>");
            outputStreamWriter.write(str12);
            if (arrayList.size() == 1) {
                m52001("Gradient has only one color stop");
                outputStreamWriter.write(str13);
                outputStreamWriter.write("<item android:offset=\"1\"");
                outputStreamWriter.write(" android:color=\"");
                outputStreamWriter.write(str14);
                outputStreamWriter.write("\"/>");
                outputStreamWriter.write(str12);
            }
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC7687.f25319);
        outputStreamWriter.write("</gradient>");
        outputStreamWriter.write(str12);
        outputStreamWriter.write(str);
        outputStreamWriter.write("</aapt:attr>");
        outputStreamWriter.write(str12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19417(String str, String str2, String str3) {
        C16776 c16776 = new C16776(str, str2);
        c16776.m39611(str3);
        this.f23346.add(c16776);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19419(EnumC8572 enumC8572) {
        this.f23343 = enumC8572;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19418(C5195 c5195) {
        this.f23345 = c5195;
    }
}
