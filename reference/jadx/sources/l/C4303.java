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

/* JADX INFO: renamed from: l.ۙ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4303 extends AbstractC21943 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Logger f15470 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC6910 f15471;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC3471 f15472;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11360 f15473;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RectF f15474;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f15475;

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo12108(C19121 c19121) {
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo12109() {
        return false;
    }

    static {
        C13261 c13261M18530 = AbstractC6910.m18530();
        c13261M18530.mo32741("x1", 0);
        c13261M18530.mo32741("y1", 1);
        c13261M18530.mo32741("x2", 2);
        c13261M18530.mo32741("y2", 3);
        f15471 = c13261M18530.mo32740();
    }

    public C4303(C6420 c6420, Element element, String str) {
        super(c6420, element, str);
        this.f15475 = new ArrayList();
        this.f15474 = new RectF();
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4303 mo12101() {
        C4303 c4303 = new C4303(this.f71178, this.f71177, this.f71179);
        c4303.m48770(this.f71181);
        c4303.f71180 = (C19121) this.f71180.clone();
        for (C21817 c21817 : this.f15475) {
            c4303.m12104(c21817.m48576(), c21817.m48579(), c21817.m48578());
        }
        return c4303;
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12103(String str) {
        Level level = Level.FINE;
        StringBuilder sbM8976 = C3012.m8976(str, "current gradient is :");
        sbM8976.append(this.f71179);
        f15470.log(level, sbM8976.toString());
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12107(C19121 c19121) {
        C19121 c19122 = this.f71176;
        c19122.m43933(c19121);
        c19122.m43927(this.f71180);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9823 m12100(String str, double d) {
        HashMap map = this.f71181;
        boolean z = false;
        if (!map.containsKey(str)) {
            return new C9823(d, false);
        }
        String strTrim = ((String) map.get(str)).trim();
        if (str.equals("r") && strTrim.startsWith("-")) {
            return new C9823(d, false);
        }
        try {
            if (strTrim.endsWith("%")) {
                d = Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) / 100.0d;
                z = true;
            } else {
                d = Double.parseDouble(strTrim);
            }
        } catch (NumberFormatException unused) {
            m48772("Unsupported coordinate value");
        }
        return new C9823(d, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12102(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        String str2;
        AbstractC6910 abstractC6910;
        C6420 c6420;
        double[] dArr;
        float f;
        AbstractC6910 abstractC6911;
        ArrayList<C21817> arrayList = this.f15475;
        if (arrayList.isEmpty()) {
            m48772("Gradient has no stop info");
            return;
        }
        Path path = new Path();
        C14888.m35584(C6294.m17372(this.f15473.m28465(), EnumC17583.SVG), path);
        RectF rectF = this.f15474;
        path.computeBounds(rectF, true);
        float f2 = rectF.top;
        double dM17599 = f2 - rectF.bottom;
        float f3 = rectF.left;
        double dM17588 = f3 - rectF.right;
        double d = f3;
        double d2 = f2;
        HashMap map = this.f71181;
        boolean zEquals = "userSpaceOnUse".equals((String) map.get("gradientUnits"));
        C6420 c6421 = this.f71178;
        if (zEquals) {
            dM17599 = c6421.m17599();
            dM17588 = c6421.m17588();
            d2 = 0.0d;
            d = 0.0d;
        }
        if (dM17588 == 0.0d || dM17599 == 0.0d) {
            return;
        }
        outputStreamWriter.write(str);
        if (this.f15472 == EnumC3471.FILL) {
            outputStreamWriter.write("<aapt:attr name=\"android:fillColor\">");
        } else {
            outputStreamWriter.write("<aapt:attr name=\"android:strokeColor\">");
        }
        String str3 = "\n";
        outputStreamWriter.write("\n");
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC19730.f63352);
        outputStreamWriter.write("<gradient ");
        if (map.containsKey("gradientTransform")) {
            m48768((String) map.get("gradientTransform"));
            if (!zEquals) {
                C19121 c19121 = new C19121(dM17588, dM17599);
                this.f71180.m43935(c19121);
                try {
                    c19121.m43920();
                    this.f71180.m43927(c19121);
                } catch (C9949 e) {
                    throw new Error(e);
                }
            }
        }
        if (zEquals) {
            this.f71180.m43935(this.f15473.f71176);
        }
        boolean zEquals2 = (map.containsKey("gradientType") ? (String) map.get("gradientType") : "linear").equals("linear");
        AbstractC6910 abstractC6912 = f15471;
        if (zEquals2) {
            double[] dArr2 = new double[4];
            dArr = new double[4];
            AbstractC0477 it = abstractC6912.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = str3;
                String str5 = (String) entry.getKey();
                AbstractC6910 abstractC6913 = abstractC6912;
                int iIntValue = ((Integer) entry.getValue()).intValue();
                C6420 c6422 = c6421;
                HashMap map2 = map;
                C9823 c9823M12100 = m12100(str5, iIntValue == 2 ? 1.0d : 0.0d);
                double dM24922 = c9823M12100.m24922();
                if (!zEquals || c9823M12100.m24923()) {
                    dM24922 = iIntValue % 2 == 0 ? (dM24922 * dM17588) + d : (dM24922 * dM17599) + d2;
                }
                dArr2[iIntValue] = dM24922;
                dArr[iIntValue] = dM24922;
                map = map2;
                if (!map.containsKey(str5)) {
                    map.put(str5, "");
                }
                c6421 = c6422;
                abstractC6912 = abstractC6913;
                str3 = str4;
            }
            str2 = str3;
            abstractC6910 = abstractC6912;
            this.f71180.m43936(dArr2, dArr, 2);
            c6420 = c6421;
        } else {
            str2 = "\n";
            abstractC6910 = abstractC6912;
            C9823 c9823M12101 = m12100("cx", 0.5d);
            double dM24923 = c9823M12101.m24922();
            if (!zEquals || c9823M12101.m24923()) {
                dM24923 = (dM24923 * dM17588) + d;
            }
            C9823 c9823M12102 = m12100("cy", 0.5d);
            double dM24924 = c9823M12102.m24922();
            if (!zEquals || c9823M12102.m24923()) {
                dM24924 = (dM24924 * dM17599) + d2;
            }
            C9823 c9823M12103 = m12100("r", 0.5d);
            double dM24925 = c9823M12103.m24922();
            if (!zEquals || c9823M12103.m24923()) {
                dM24925 *= Math.max(dM17599, dM17588);
            }
            double[] dArr3 = {dM24923, dM24924};
            this.f71180.m43936(new double[]{dM24923, dM24924}, dArr3, 1);
            C7126 c7126 = new C7126(dM24925, 0.0d);
            C7126 c7127 = new C7126(dM24925, 0.0d);
            this.f71180.m43926(c7126, c7127);
            c6420 = c6421;
            map.put("cx", c6420.m17573(dArr3[0]));
            map.put("cy", c6420.m17573(dArr3[1]));
            double d3 = 0.0d - c7127.f23829;
            double d4 = 0.0d - c7127.f23830;
            map.put("r", c6420.m17573(Math.sqrt((d4 * d4) + (d3 * d3))));
            dArr = dArr3;
        }
        AbstractC0477 it2 = C23934.f77518.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            String str8 = (String) map.get(str6);
            if (!str7.isEmpty() && str8 != null) {
                String strTrim = str8.trim();
                String strM48769 = m48769(strTrim, "#000000");
                if (strM48769 == null) {
                    abstractC6911 = abstractC6910;
                    Integer num = (Integer) abstractC6911.get(str6);
                    if (num != null) {
                        strTrim = c6420.m17573(dArr[num.intValue()]);
                    } else if (str6.equals("spreadMethod")) {
                        if (strTrim.equals("pad")) {
                            strTrim = "clamp";
                        } else if (strTrim.equals("reflect")) {
                            strTrim = "mirror";
                        } else if (strTrim.equals("repeat")) {
                            strTrim = "repeat";
                        } else {
                            m48772("Unsupported spreadMethod ".concat(strTrim));
                            strTrim = "clamp";
                        }
                    } else {
                        if (strTrim.endsWith("%")) {
                            strM48769 = c6420.m17573(m12100(str6, 0.0d).m24922());
                        }
                        String str9 = str2;
                        outputStreamWriter.write(str9);
                        outputStreamWriter.write(str);
                        outputStreamWriter.write(EnumC19730.f63352);
                        outputStreamWriter.write(ASN1Dump.TAB);
                        outputStreamWriter.write(str7);
                        outputStreamWriter.write("=\"");
                        outputStreamWriter.write(strTrim);
                        outputStreamWriter.write("\"");
                        str2 = str9;
                        abstractC6910 = abstractC6911;
                    }
                    String str10 = str2;
                    outputStreamWriter.write(str10);
                    outputStreamWriter.write(str);
                    outputStreamWriter.write(EnumC19730.f63352);
                    outputStreamWriter.write(ASN1Dump.TAB);
                    outputStreamWriter.write(str7);
                    outputStreamWriter.write("=\"");
                    outputStreamWriter.write(strTrim);
                    outputStreamWriter.write("\"");
                    str2 = str10;
                    abstractC6910 = abstractC6911;
                } else {
                    abstractC6911 = abstractC6910;
                }
                strTrim = strM48769;
                String str11 = str2;
                outputStreamWriter.write(str11);
                outputStreamWriter.write(str);
                outputStreamWriter.write(EnumC19730.f63352);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str7);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
                str2 = str11;
                abstractC6910 = abstractC6911;
            }
        }
        String str12 = str2;
        outputStreamWriter.write(62);
        outputStreamWriter.write(str12);
        String str13 = str + ASN1Dump.TAB;
        for (C21817 c21817 : arrayList) {
            String strM48576 = c21817.m48576();
            try {
                f = Float.parseFloat(c21817.m48578());
            } catch (NumberFormatException unused) {
                m48771("Unsupported opacity value");
                f = 1.0f;
            }
            int iM42699 = C18415.m42699(strM48576);
            int i = C17709.f56233;
            String str14 = String.format("#%08X", Integer.valueOf((iM42699 & 16777215) | (((int) (((iM42699 >> 24) & 255) * f)) << 24)));
            outputStreamWriter.write(str13);
            outputStreamWriter.write("<item android:offset=\"");
            outputStreamWriter.write(C12123.m30163(c21817.m48579()));
            outputStreamWriter.write("\"");
            outputStreamWriter.write(" android:color=\"");
            outputStreamWriter.write(str14);
            outputStreamWriter.write("\"/>");
            outputStreamWriter.write(str12);
            if (arrayList.size() == 1) {
                m48771("Gradient has only one color stop");
                outputStreamWriter.write(str13);
                outputStreamWriter.write("<item android:offset=\"1\"");
                outputStreamWriter.write(" android:color=\"");
                outputStreamWriter.write(str14);
                outputStreamWriter.write("\"/>");
                outputStreamWriter.write(str12);
            }
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC19730.f63352);
        outputStreamWriter.write("</gradient>");
        outputStreamWriter.write(str12);
        outputStreamWriter.write(str);
        outputStreamWriter.write("</aapt:attr>");
        outputStreamWriter.write(str12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12104(String str, String str2, String str3) {
        C21817 c21817 = new C21817(str, str2);
        c21817.m48577(str3);
        this.f15475.add(c21817);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12105(EnumC3471 enumC3471) {
        this.f15472 = enumC3471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12106(C11360 c11360) {
        this.f15473 = c11360;
    }
}
