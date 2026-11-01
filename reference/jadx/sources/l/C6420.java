package l;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: l.ۜ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6420 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Logger f21738 = Logger.getLogger("SvgTree");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f21740;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f21743;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float[] f21745;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public DecimalFormat f21746;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21754;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C13477 f21755;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f21752 = -1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f21742 = -1.0f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19121 f21749 = new C19121();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f21753 = 1.0f;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21741 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f21739 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f21747 = new HashSet();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f21744 = new HashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f21748 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f21750 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f21751 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m17588() {
        return this.f21752;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m17599() {
        return this.f21742;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m17596() {
        this.f21754 = true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m17600() {
        this.f21743 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[] m17572() {
        return this.f21745;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17593() {
        this.f21755.mo12107(new C19121());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17597() {
        this.f21755.mo32975();
        if (!this.f21741.isEmpty() || this.f21754) {
            return;
        }
        m17580("No vector content found", (Node) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Document m17575(String str, ArrayList arrayList, byte[] bArr) {
        this.f21740 = str;
        try {
            return C16299.m38447(arrayList, bArr);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17576() {
        f21738.log(Level.FINE, "file: " + this.f21740);
        this.f21755.mo12103("");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17594(C13477 c13477) {
        this.f21755 = c13477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17580(String str, Node node) {
        m17581(str, node, EnumC3597.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17581(String str, Node node, EnumC3597 enumC3597) {
        C18304.m42517(!str.isEmpty());
        this.f21741.add(new C0775(enumC3597, node == null ? 0 : C16299.m38446(node).m29982() + 1, str));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m17570() {
        ArrayList<C0775> arrayList = this.f21741;
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (C0775 c0775 : arrayList) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0775.f3352.name());
            int i = c0775.f3353;
            sb2.append(i == 0 ? "" : C8479.m22141(i, " @ line "));
            sb2.append(": ");
            sb2.append(c0775.f3351);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17587() {
        return this.f21754;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double m17586(String str) {
        float[] fArr = this.f21745;
        return m17568(str, fArr == null ? -1.0f : fArr[2]);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m17598(String str) {
        float[] fArr = this.f21745;
        return m17568(str, fArr == null ? -1.0f : fArr[3]);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17585(Element element) {
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        EnumC12771 enumC12771 = EnumC12771.PIXEL;
        EnumC12771 enumC12772 = enumC12771;
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String strTrim = nodeItem.getNodeName().trim();
            String strTrim2 = nodeItem.getNodeValue().trim();
            int length2 = strTrim2.length();
            EnumC12771 enumC12773 = EnumC12771.PIXEL;
            if (strTrim2.substring(Math.max(strTrim2.length() - 2, 0)).matches("em|ex|px|in|cm|mm|pt|pc")) {
                length2 -= 2;
            } else if (strTrim2.endsWith("%")) {
                length2--;
                enumC12773 = EnumC12771.PERCENTAGE;
            }
            if ("width".equals(strTrim)) {
                this.f21752 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC12771 = enumC12773;
            } else if ("height".equals(strTrim)) {
                this.f21742 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC12772 = enumC12773;
            } else if ("viewBox".equals(strTrim)) {
                this.f21745 = new float[4];
                String[] strArrSplit = strTrim2.split("[ ,]+");
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f21745;
                    if (i2 < fArr.length) {
                        fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                        i2++;
                    }
                }
            }
        }
        float[] fArr2 = this.f21745;
        if (fArr2 == null) {
            float f = this.f21752;
            if (f > 0.0f) {
                float f2 = this.f21742;
                if (f2 > 0.0f) {
                    this.f21745 = new float[]{0.0f, 0.0f, f, f2};
                } else if ((this.f21752 >= 0.0f || this.f21742 < 0.0f) && fArr2 != null) {
                    this.f21752 = fArr2[2];
                    this.f21742 = fArr2[3];
                }
            } else if (this.f21752 >= 0.0f) {
                this.f21752 = fArr2[2];
                this.f21742 = fArr2[3];
            } else {
                this.f21752 = fArr2[2];
                this.f21742 = fArr2[3];
            }
        } else if (this.f21752 >= 0.0f) {
            this.f21752 = fArr2[2];
            this.f21742 = fArr2[3];
        } else {
            this.f21752 = fArr2[2];
            this.f21742 = fArr2[3];
        }
        EnumC12771 enumC12774 = EnumC12771.PERCENTAGE;
        if (enumC12771 == enumC12774) {
            float f3 = this.f21752;
            if (f3 > 0.0f) {
                this.f21752 = (this.f21745[2] * f3) / 100.0f;
            }
        }
        if (enumC12772 == enumC12774) {
            float f4 = this.f21742;
            if (f4 > 0.0f) {
                this.f21742 = (this.f21745[3] * f4) / 100.0f;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m17568(String str, double d) {
        if (str.endsWith("%")) {
            return (Double.parseDouble(str.substring(0, str.length() - 1)) / 100.0d) * d;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17595(AbstractC21943 abstractC21943, String str) {
        this.f21739.put(str, abstractC21943);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC21943 m17590(String str) {
        return (AbstractC21943) this.f21739.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17582(C13477 c13477) {
        this.f21744.add(c13477);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet m17569() {
        return this.f21744;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17578(String str) {
        this.f21747.add(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m17571(String str) {
        return this.f21747.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17584(AbstractC21943 abstractC21943, C13477 c13477, String str) {
        this.f21748.put(abstractC21943, Pair.create(c13477, str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set m17589() {
        return this.f21748.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17583(AbstractC21943 abstractC21943, String str) {
        HashMap map = this.f21750;
        if (map.containsKey(str)) {
            ((Set) map.get(str)).add(abstractC21943);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(abstractC21943);
        map.put(str, hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17579(String str, String str2) {
        this.f21751.put(str, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m17592(String str) {
        return (String) this.f21751.get(str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Set m17591() {
        return this.f21750.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13477 m17574(AbstractC21943 abstractC21943) {
        return this.f21755.m32976(abstractC21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17573(double d) {
        if (this.f21746 == null) {
            float[] fArr = this.f21745;
            int iFloor = 4 - ((int) Math.floor(Math.log10(Math.max(fArr != null ? fArr[3] : -1.0f, fArr == null ? -1.0f : fArr[2]))));
            StringBuilder sb = new StringBuilder("#");
            if (iFloor > 0) {
                if (iFloor > 6) {
                    iFloor = 6;
                }
                sb.append('.');
                for (int i = 0; i < iFloor; i++) {
                    sb.append('#');
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), new DecimalFormatSymbols(Locale.ROOT));
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            this.f21746 = decimalFormat;
        }
        return C12123.m30163(this.f21746.format(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17577(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (this.f21755 == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        outputStreamWriter.write("\n");
        if (this.f21743) {
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("xmlns:aapt=\"http://schemas.android.com/aapt\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:width=\"");
        float f = this.f21752;
        float f2 = this.f21753;
        outputStreamWriter.write(m17573(f * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:height=\"");
        outputStreamWriter.write(m17573(this.f21742 * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportWidth=\"");
        float[] fArr = this.f21745;
        outputStreamWriter.write(m17573(fArr == null ? -1.0f : fArr[2]));
        outputStreamWriter.write("\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportHeight=\"");
        float[] fArr2 = this.f21745;
        outputStreamWriter.write(m17573(fArr2 != null ? fArr2[3] : -1.0f));
        outputStreamWriter.write("\">");
        outputStreamWriter.write("\n");
        float[] fArr3 = this.f21745;
        C19121 c19121 = new C19121(-fArr3[0], -fArr3[1]);
        C19121 c19122 = this.f21749;
        c19122.m43935(c19121);
        this.f21755.mo12108(c19122);
        f21738.log(Level.FINE, "matrix=" + c19122);
        this.f21755.mo12102(outputStreamWriter, EnumC19730.f63352);
        outputStreamWriter.write("</vector>");
        outputStreamWriter.write("\n");
        outputStreamWriter.close();
    }
}
