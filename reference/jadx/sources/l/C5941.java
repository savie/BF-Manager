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

/* JADX INFO: renamed from: l.ۚ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5941 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Logger f20314 = Logger.getLogger("SvgTree");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float[] f20316;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public DecimalFormat f20319;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20322;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f20326;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f20329;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13792 f20331;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f20327 = -1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f20317 = -1.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23841 f20324 = new C23841();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f20325 = 1.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f20315 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f20321 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f20318 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f20320 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f20328 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f20323 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f20330 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m17278() {
        return this.f20327;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m17281() {
        return this.f20317;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m17282() {
        this.f20322 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m17292() {
        this.f20326 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m17261() {
        return this.f20316;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17287() {
        this.f20331.mo4140(new C23841());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17283() {
        this.f20331.mo4141();
        if (!this.f20315.isEmpty() || this.f20322) {
            return;
        }
        m17269("No vector content found", (Node) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Document m17264(String str, ArrayList arrayList, byte[] bArr) {
        this.f20329 = str;
        try {
            return C21603.m49134(arrayList, bArr);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17265() {
        f20314.log(Level.FINE, "file: " + this.f20329);
        this.f20331.mo15616("");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17288(C13792 c13792) {
        this.f20331 = c13792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17269(String str, Node node) {
        m17270(str, node, EnumC13398.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17270(String str, Node node, EnumC13398 enumC13398) {
        C12128.m30309(!str.isEmpty());
        this.f20315.add(new C20111(enumC13398, node == null ? 0 : C21603.m49133(node).m43315() + 1, str));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m17290() {
        ArrayList<C20111> arrayList = this.f20315;
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (C20111 c20111 : arrayList) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c20111.f64618.name());
            int i = c20111.f64620;
            sb2.append(i == 0 ? "" : C13645.m33382(i, " @ line "));
            sb2.append(": ");
            sb2.append(c20111.f64619);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17285() {
        return this.f20322;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double m17284(String str) {
        float[] fArr = this.f20316;
        return m17260(str, fArr == null ? -1.0f : fArr[2]);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m17280(String str) {
        float[] fArr = this.f20316;
        return m17260(str, fArr == null ? -1.0f : fArr[3]);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17274(Element element) {
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        EnumC15635 enumC15635 = EnumC15635.PIXEL;
        EnumC15635 enumC15636 = enumC15635;
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String strTrim = nodeItem.getNodeName().trim();
            String strTrim2 = nodeItem.getNodeValue().trim();
            int length2 = strTrim2.length();
            EnumC15635 enumC15637 = EnumC15635.PIXEL;
            if (strTrim2.substring(Math.max(strTrim2.length() - 2, 0)).matches("em|ex|px|in|cm|mm|pt|pc")) {
                length2 -= 2;
            } else if (strTrim2.endsWith("%")) {
                length2--;
                enumC15637 = EnumC15635.PERCENTAGE;
            }
            if ("width".equals(strTrim)) {
                this.f20327 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC15635 = enumC15637;
            } else if ("height".equals(strTrim)) {
                this.f20317 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC15636 = enumC15637;
            } else if ("viewBox".equals(strTrim)) {
                this.f20316 = new float[4];
                String[] strArrSplit = strTrim2.split("[ ,]+");
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f20316;
                    if (i2 < fArr.length) {
                        fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                        i2++;
                    }
                }
            }
        }
        float[] fArr2 = this.f20316;
        if (fArr2 == null) {
            float f = this.f20327;
            if (f > 0.0f) {
                float f2 = this.f20317;
                if (f2 > 0.0f) {
                    this.f20316 = new float[]{0.0f, 0.0f, f, f2};
                } else if ((this.f20327 >= 0.0f || this.f20317 < 0.0f) && fArr2 != null) {
                    this.f20327 = fArr2[2];
                    this.f20317 = fArr2[3];
                }
            } else if (this.f20327 >= 0.0f) {
                this.f20327 = fArr2[2];
                this.f20317 = fArr2[3];
            } else {
                this.f20327 = fArr2[2];
                this.f20317 = fArr2[3];
            }
        } else if (this.f20327 >= 0.0f) {
            this.f20327 = fArr2[2];
            this.f20317 = fArr2[3];
        } else {
            this.f20327 = fArr2[2];
            this.f20317 = fArr2[3];
        }
        EnumC15635 enumC15638 = EnumC15635.PERCENTAGE;
        if (enumC15635 == enumC15638) {
            float f3 = this.f20327;
            if (f3 > 0.0f) {
                this.f20327 = (this.f20316[2] * f3) / 100.0f;
            }
        }
        if (enumC15636 == enumC15638) {
            float f4 = this.f20317;
            if (f4 > 0.0f) {
                this.f20317 = (this.f20316[3] * f4) / 100.0f;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m17260(String str, double d) {
        if (str.endsWith("%")) {
            return (Double.parseDouble(str.substring(0, str.length() - 1)) / 100.0d) * d;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17289(AbstractC23095 abstractC23095, String str) {
        this.f20321.put(str, abstractC23095);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC23095 m17277(String str) {
        return (AbstractC23095) this.f20321.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17271(C13792 c13792) {
        this.f20320.add(c13792);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet m17279() {
        return this.f20320;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17267(String str) {
        this.f20318.add(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m17291(String str) {
        return this.f20318.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17273(AbstractC23095 abstractC23095, C13792 c13792, String str) {
        this.f20328.put(abstractC23095, Pair.create(c13792, str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set m17276() {
        return this.f20328.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17272(AbstractC23095 abstractC23095, String str) {
        HashMap map = this.f20323;
        if (map.containsKey(str)) {
            ((Set) map.get(str)).add(abstractC23095);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(abstractC23095);
        map.put(str, hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17268(String str, String str2) {
        this.f20330.put(str, str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17286(String str) {
        return (String) this.f20330.get(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m17275() {
        return this.f20323.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13792 m17263(AbstractC23095 abstractC23095) {
        return this.f20331.m33703(abstractC23095);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17262(double d) {
        if (this.f20319 == null) {
            float[] fArr = this.f20316;
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
            this.f20319 = decimalFormat;
        }
        return C4560.m14325(this.f20319.format(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17266(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (this.f20331 == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        outputStreamWriter.write("\n");
        if (this.f20326) {
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("xmlns:aapt=\"http://schemas.android.com/aapt\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:width=\"");
        float f = this.f20327;
        float f2 = this.f20325;
        outputStreamWriter.write(m17262(f * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:height=\"");
        outputStreamWriter.write(m17262(this.f20317 * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportWidth=\"");
        float[] fArr = this.f20316;
        outputStreamWriter.write(m17262(fArr == null ? -1.0f : fArr[2]));
        outputStreamWriter.write("\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportHeight=\"");
        float[] fArr2 = this.f20316;
        outputStreamWriter.write(m17262(fArr2 != null ? fArr2[3] : -1.0f));
        outputStreamWriter.write("\">");
        outputStreamWriter.write("\n");
        float[] fArr3 = this.f20316;
        C23841 c23841 = new C23841(-fArr3[0], -fArr3[1]);
        C23841 c23842 = this.f20324;
        c23842.m53189(c23841);
        this.f20331.mo4143(c23842);
        f20314.log(Level.FINE, "matrix=" + c23842);
        this.f20331.mo4138(outputStreamWriter, EnumC7687.f25319);
        outputStreamWriter.write("</vector>");
        outputStreamWriter.write("\n");
        outputStreamWriter.close();
    }
}
