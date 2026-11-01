package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.util.Xml;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۖܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2591 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2156 m8058(final AbstractC1886 abstractC1886, final C6453 c6453) {
        m8064(c6453);
        C14588 c14588Mo5283 = abstractC1886.mo5283();
        final C0475 c0475 = C0475.f2151;
        C16704.m39180(c14588Mo5283, c0475);
        C7531 c7531M39177 = C16704.m39177(abstractC1886, c0475);
        try {
            C10854 c10854M51915 = C23554.m51915(c7531M39177, new InterfaceC17203() { // from class: l.ۛ᩻۬
                @Override // l.InterfaceC17203
                public final BitmapFactory.Options read() {
                    return C2591.m8057(c6453, abstractC1886, c0475);
                }
            });
            c7531M39177.m20055();
            c7531M39177.close();
            abstractC1886.m6137(c14588Mo5283);
            m8064(c6453);
            return new C2156(c14588Mo5283, c10854M51915);
        } catch (Throwable th) {
            try {
                c7531M39177.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ BitmapFactory.Options m8057(C6453 c6453, AbstractC1886 abstractC1886, C0475 c0475) throws InterruptedIOException {
        m8064(c6453);
        return C16704.m39181(abstractC1886, c0475);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0295  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:27:0x0099, B:28:0x00a0, B:74:0x0114, B:75:0x0117, B:53:0x00eb, B:55:0x00f3, B:57:0x00f7, B:59:0x00fb, B:60:0x00fd, B:61:0x00fe, B:62:0x0105, B:63:0x0106, B:64:0x0108, B:65:0x0109, B:66:0x010b, B:40:0x00da, B:41:0x00dd), top: B:183:0x0099 }] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r21.m6137(r7);
        l.AbstractC1886.m6135(r28);
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9919 m8059(l.AbstractC1886 r21, l.C2156 r22, final l.C0745 r23, long r24, final long r26, final l.C22682 r28) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2591.m8059(l.֫ܳ۬, l.֫᩻۬, l.֡᩻۬, long, long, l.᩺֫۬):l.ۢ᩻۬");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8068(String str, int i, byte[] bArr) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8062(int i, int i2, byte[] bArr) {
        for (int i3 = 0; i3 < 3; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (i3 * 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x025a A[Catch: XmlPullParserException -> 0x06fe, TryCatch #10 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:11:0x0062, B:12:0x0069, B:17:0x0073, B:20:0x0085, B:22:0x008b, B:25:0x0092, B:26:0x0099, B:27:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:35:0x00b6, B:42:0x00c4, B:46:0x00ce, B:278:0x047a, B:47:0x00e1, B:49:0x00e9, B:52:0x0106, B:54:0x010e, B:56:0x0116, B:58:0x011e, B:60:0x0124, B:62:0x012a, B:64:0x0132, B:66:0x0138, B:71:0x0142, B:74:0x0150, B:76:0x0158, B:81:0x0162, B:84:0x016a, B:87:0x0172, B:89:0x0178, B:91:0x017e, B:94:0x0186, B:95:0x01a5, B:97:0x01ab, B:99:0x01de, B:102:0x01e7, B:150:0x0279, B:152:0x027f, B:154:0x0285, B:155:0x028e, B:157:0x0294, B:159:0x029c, B:160:0x029f, B:162:0x02a5, B:164:0x02ab, B:167:0x02b4, B:169:0x02ba, B:171:0x02c0, B:173:0x02c6, B:175:0x02cc, B:177:0x02d2, B:179:0x02d8, B:184:0x02e7, B:189:0x02f7, B:191:0x02fd, B:193:0x0303, B:195:0x030b, B:197:0x0313, B:204:0x032d, B:207:0x0339, B:209:0x0343, B:211:0x034b, B:213:0x0353, B:215:0x0359, B:217:0x0361, B:224:0x037c, B:226:0x0382, B:231:0x0392, B:233:0x039c, B:247:0x03e2, B:239:0x03b8, B:240:0x03bf, B:242:0x03c5, B:244:0x03d1, B:245:0x03dc, B:246:0x03e1, B:234:0x03a7, B:235:0x03ac, B:198:0x0317, B:200:0x031f, B:248:0x03f2, B:249:0x03f9, B:104:0x01f7, B:106:0x01fd, B:144:0x025f, B:114:0x0217, B:135:0x0241, B:138:0x024a, B:140:0x0252, B:142:0x025a, B:145:0x0264, B:251:0x03ff, B:252:0x0406, B:253:0x0407, B:255:0x041c, B:256:0x0423, B:259:0x0431, B:261:0x0435, B:262:0x0438, B:269:0x0446, B:271:0x0460, B:275:0x0470, B:276:0x0477, B:281:0x0495, B:285:0x04da, B:416:0x06f6, B:417:0x06fd), top: B:423:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:402:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:404:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:406:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:408:0x06de  */
    /* JADX WARN: Code duplicated, block: B:410:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:412:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:414:0x06f2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9919 m8060(AbstractC1886 abstractC1886, C14588 c14588, C11330 c11330, C0745 c0745, long j, C22682 c22682) throws Throwable {
        C5270 c5270;
        Picture pictureM29085;
        C20502 c20502M8061;
        C20502 c20502M8062;
        Bitmap bitmapCreateBitmap;
        C20502 c20502M8063;
        C5270 c5271;
        C5270 c5272;
        C5270 c5273;
        C5270 c5274;
        boolean z;
        C5270 c5275;
        int i;
        int i2;
        long j2;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        byte[] bArr = c11330.f38230;
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            int i3 = 0;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            int i4 = 1;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int i5 = c11330.f38229;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i5), null);
            C3567 c3567 = new C3567(0);
            ArrayDeque arrayDeque = new ArrayDeque();
            HashMap map = new HashMap();
            arrayDeque.push(c3567);
            int eventType = xmlPullParserNewPullParser.getEventType();
            int i6 = 0;
            int i7 = 0;
            long j3 = 0;
            long length = 0;
            long j4 = 0;
            int i8 = 0;
            boolean z2 = false;
            boolean z3 = true;
            while (eventType != i4) {
                m8064(c22682);
                if (eventType == 10 && xmlPullParserNewPullParser.getText().contains("<!ENTITY")) {
                    throw new C4708("SVG entity declarations are not supported");
                }
                if (eventType == 2) {
                    if (i8 == 0) {
                        String namespace = xmlPullParserNewPullParser.getNamespace();
                        if (!"svg".equals(xmlPullParserNewPullParser.getName()) || (namespace != null && !namespace.isEmpty() && !"http://www.w3.org/2000/svg".equals(namespace))) {
                            throw new IOException("Image XML root is not SVG");
                        }
                    }
                    i8++;
                    if (i8 > 8192 || (i6 = i6 + 1) > 64) {
                        throw new C14858("SVG structure exceeds safe render limits");
                    }
                    String name = xmlPullParserNewPullParser.getName();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    boolean z4 = namespace2 == null || namespace2.isEmpty() || "http://www.w3.org/2000/svg".equals(namespace2);
                    if (i7 != 0 || (z4 && !C17288.m40251(name))) {
                        i7++;
                    } else if (!z4) {
                        arrayDeque.push((C3567) arrayDeque.peek());
                        i5 = i5;
                        bArr = bArr;
                        arrayDeque = arrayDeque;
                        c3567 = c3567;
                    } else {
                        if ("image".equals(name)) {
                            throw new C4708("SVG embedded images are not supported");
                        }
                        C3567 c3568 = new C3567(i3);
                        ArrayList arrayList2 = c3568.f13139;
                        String str5 = "radialGradient";
                        String str6 = "pattern";
                        String str7 = "mask";
                        c3568.f13137 = "defs".equals(name) || "symbol".equals(name) || "marker".equals(name) || "clipPath".equals(name) || "pattern".equals(name) || "mask".equals(name) || "view".equals(name) || "linearGradient".equals(name) || "radialGradient".equals(name);
                        boolean z5 = "title".equals(name) || "desc".equals(name) || "style".equals(name);
                        if ("style".equals(name)) {
                            z2 = true;
                        }
                        if ("mask".equals(name) || "pattern".equals(name) || MessageHandler.Properties.Filter.equals(name) || "style".equals(name)) {
                            z3 = false;
                        }
                        ((C3567) arrayDeque.peek()).f13138.add(c3568);
                        arrayDeque.push(c3568);
                        int i9 = 0;
                        ArrayList arrayList3 = arrayList2;
                        int i10 = i7;
                        long j5 = j4;
                        boolean z6 = false;
                        while (i9 < xmlPullParserNewPullParser.getAttributeCount()) {
                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i9);
                            String str8 = str6;
                            String strTrim = xmlPullParserNewPullParser.getAttributeValue(i9).trim();
                            HashMap map2 = map;
                            boolean z7 = z5;
                            String str9 = str5;
                            String str10 = name;
                            int i11 = i9;
                            c3568.f13135 += (long) strTrim.length();
                            long jMax = Math.max(j5, strTrim.length());
                            if ("d".equals(attributeName) || "points".equals(attributeName)) {
                                int i12 = 0;
                                boolean z8 = false;
                                boolean z9 = false;
                                long j6 = 0;
                                while (i12 < strTrim.length()) {
                                    char cCharAt = strTrim.charAt(i12);
                                    long j7 = jMax;
                                    if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                                        if (cCharAt == '-' || cCharAt == '+') {
                                            if (i12 != 0) {
                                                int i13 = i12 - 1;
                                                if (strTrim.charAt(i13) != 'e' && strTrim.charAt(i13) != 'E') {
                                                    j6++;
                                                    z9 = false;
                                                }
                                            } else {
                                                j6++;
                                                z9 = false;
                                            }
                                        } else if ((cCharAt != 'e' && cCharAt != 'E') || !z8) {
                                            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                                                j6++;
                                            }
                                            z8 = false;
                                            z9 = false;
                                        }
                                        i12++;
                                        jMax = j7;
                                    } else {
                                        if (!z8 || (cCharAt == '.' && z9)) {
                                            j6++;
                                        }
                                        if (cCharAt == '.') {
                                            z9 = true;
                                        }
                                    }
                                    z8 = true;
                                    i12++;
                                    jMax = j7;
                                }
                                j2 = jMax;
                                j3 += j6;
                                c3568.f13134 += j6;
                            } else {
                                length += (long) strTrim.length();
                                j2 = jMax;
                            }
                            if (j3 > 262144 || length > 1048576) {
                                throw new C14858("SVG data exceeds safe parse limits");
                            }
                            if ("opacity".equals(attributeName) && C17288.m40246(strTrim)) {
                                c3568.f13136 = Math.max(c3568.f13136, 1);
                            }
                            if (str7.equals(attributeName) && !"none".equals(strTrim)) {
                                c3568.f13136 = 3;
                            }
                            if ("style".equals(attributeName) && (strTrim.contains("opacity") || strTrim.contains(str7))) {
                                z2 = true;
                            }
                            if ("opacity".equals(attributeName) || str7.equals(attributeName) || MessageHandler.Properties.Filter.equals(attributeName) || ("style".equals(attributeName) && (strTrim.contains("opacity") || strTrim.contains(str7) || strTrim.contains(MessageHandler.Properties.Filter)))) {
                                z3 = false;
                            }
                            String attributePrefix = xmlPullParserNewPullParser.getAttributePrefix(i11);
                            String attributeNamespace = xmlPullParserNewPullParser.getAttributeNamespace(i11);
                            if (z7 || z6 || !(attributePrefix == null || attributePrefix.isEmpty() || DocumentReader.RESERVED.equals(attributePrefix))) {
                                map = map2;
                            } else {
                                if ("id".equals(attributeName)) {
                                    map = map2;
                                    if (!map.containsKey(strTrim)) {
                                        map.put(strTrim, c3568);
                                    }
                                } else {
                                    map = map2;
                                    if (DocumentReader.RESERVED.equals(attributePrefix) && "space".equals(attributeName)) {
                                    }
                                }
                                z6 = true;
                            }
                            if ("href".equals(attributeName)) {
                                str3 = str10;
                                if ("use".equals(str3) || "tref".equals(str3) || "textPath".equals(str3) || "linearGradient".equals(str3)) {
                                    str = str7;
                                    str4 = str8;
                                    str2 = str9;
                                } else {
                                    str2 = str9;
                                    if (str2.equals(str3)) {
                                        str = str7;
                                        str4 = str8;
                                    } else {
                                        str = str7;
                                        str4 = str8;
                                        if (!str4.equals(str3)) {
                                            str8 = str4;
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (attributeNamespace == null || attributeNamespace.isEmpty()) {
                                    str8 = str4;
                                } else {
                                    str8 = str4;
                                    if (!"http://www.w3.org/1999/xlink".equals(attributeNamespace)) {
                                        arrayList = arrayList3;
                                    }
                                }
                                String strM40250 = C17288.m40250(strTrim);
                                if (!strM40250.startsWith("#")) {
                                    throw new C4708("SVG external resources are not supported");
                                }
                                arrayList = arrayList3;
                                arrayList.add(strM40250.substring(1));
                            } else {
                                str = str7;
                                arrayList = arrayList3;
                                str2 = str9;
                                str3 = str10;
                            }
                            if (!z7) {
                                C17288.m40247(attributeName, strTrim, arrayList);
                                for (int size = arrayList.size(); size < arrayList.size(); size++) {
                                    String str11 = (String) arrayList.get(size);
                                    if (!str11.startsWith("#")) {
                                        throw new C4708("SVG external resources are not supported");
                                    }
                                    arrayList.set(size, str11.substring(1));
                                }
                            }
                            i9 = i11 + 1;
                            arrayList3 = arrayList;
                            name = str3;
                            str6 = str8;
                            str7 = str;
                            z5 = z7;
                            str5 = str2;
                            j5 = j2;
                        }
                        j4 = j5;
                        i7 = i10;
                    }
                    i6 = i6;
                    i8 = i8;
                } else {
                    i5 = i5;
                    bArr = bArr;
                    arrayDeque = arrayDeque;
                    c3567 = c3567;
                    int i14 = i7;
                    if (eventType == 3) {
                        i6--;
                        if (i14 > 0) {
                            i7 = i14 - 1;
                        } else {
                            arrayDeque.pop();
                        }
                    } else if (i14 == 0 && i8 > 0 && (eventType == 4 || eventType == 5)) {
                        ((C3567) arrayDeque.peek()).f13135 += (long) xmlPullParserNewPullParser.getText().length();
                        if (!xmlPullParserNewPullParser.isWhitespace()) {
                            length += (long) xmlPullParserNewPullParser.getText().length();
                        }
                        if (length > 1048576) {
                            throw new C14858("SVG text exceeds safe parse limits");
                        }
                    }
                    i7 = i14;
                }
                eventType = xmlPullParserNewPullParser.nextToken();
                i3 = 0;
                i4 = 1;
                i5 = i5;
                bArr = bArr;
                arrayDeque = arrayDeque;
                c3567 = c3567;
            }
            int i15 = i5;
            byte[] bArr2 = bArr;
            C3567 c3569 = c3567;
            if (i8 == 0) {
                throw new IOException("SVG root element is missing");
            }
            long[] jArr = {0, 0, 0, 0, 0};
            m8063(c3569, map, new HashSet(), jArr, 0, 0, z2, c22682);
            long j8 = (j4 * 2) + (length * 2) + (j3 * 32) + (((long) i8) * 512) + 65536;
            int i16 = (int) jArr[3];
            int i17 = i16 + 1;
            long j9 = jArr[0];
            int i18 = (int) j9;
            long j10 = jArr[2];
            boolean z10 = z3 && j9 <= 128 && jArr[1] <= 16 && j10 <= 16384;
            C20502 c20502M8064 = m8061(c0745, j8);
            try {
                C11644 c11644M29081 = C11644.m29081(new ByteArrayInputStream(bArr2, 0, i15));
                m8064(c22682);
                RectF rectFM29095 = c11644M29081.m29095();
                float fM29084 = c11644M29081.m29084();
                float fM29096 = c11644M29081.m29096();
                if (fM29084 <= 0.0f && rectFM29095 != null) {
                    fM29084 = rectFM29095.width();
                }
                if (fM29096 <= 0.0f && rectFM29095 != null) {
                    fM29096 = rectFM29095.height();
                }
                int iM8055 = m8055(fM29084);
                int iM8056 = m8055(fM29096);
                C0475.f2151.m2343(iM8055, iM8056);
                if (rectFM29095 == null) {
                    c11644M29081.m29089(iM8055, iM8056);
                }
                boolean z11 = !C17288.m40249(c11644M29081) && Build.VERSION.SDK_INT >= 28 && z10;
                c20502M8063 = z11 ? m8061(c0745, z11 ? (((long) i18) * 256) + (j10 * 8) + 65536 : 0L) : null;
                try {
                    long jMin = Math.min(j, c0745.m3238() - c0745.m3241());
                    int i19 = 1;
                    while (i19 <= 32768) {
                        if (C16704.m39173(iM8055, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX || C16704.m39173(iM8056, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                            z = z11;
                        } else {
                            z = z11;
                            if (C16704.m39174(iM8055, iM8056, i19) * ((long) i17) <= jMin) {
                                int iM39173 = (int) C16704.m39173(iM8055, i19);
                                int iM39174 = (int) C16704.m39173(iM8056, i19);
                                long j11 = ((long) iM39173) * ((long) iM39174) * 4;
                                c20502M8061 = m8061(c0745, ((long) i16) * j11);
                                try {
                                    c20502M8062 = m8061(c0745, j11);
                                    try {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iM39173, iM39174, Bitmap.Config.ARGB_8888);
                                        try {
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            float f = iM8055;
                                            float f2 = iM8056;
                                            canvas.scale(iM39173 / f, iM39174 / f2);
                                            c11644M29081.m29091(canvas, new RectF(0.0f, 0.0f, f, f2));
                                            m8064(c22682);
                                            if (!c20502M8062.m46302(bitmapCreateBitmap.getAllocationByteCount())) {
                                                throw new C10354("SVG raster allocation exceeds budget");
                                            }
                                            if (z) {
                                                try {
                                                    pictureM29085 = c11644M29081.m29085(iM8055, iM8056);
                                                    try {
                                                        m8064(c22682);
                                                        i = iM8055;
                                                        i2 = iM8056;
                                                        c5275 = new C5270(null, pictureM29085, iM8055, iM8056, i17, c20502M8063);
                                                        c20502M8063 = null;
                                                    } catch (C8116 e) {
                                                        e = e;
                                                        c5270 = null;
                                                        try {
                                                            throw new IOException("SVG could not be parsed", e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (bitmapCreateBitmap != null) {
                                                                bitmapCreateBitmap.recycle();
                                                            }
                                                            if (c20502M8062 != null) {
                                                                c20502M8062.close();
                                                            }
                                                            if (c20502M8061 != null) {
                                                                c20502M8061.close();
                                                            }
                                                            if (c5270 != null) {
                                                                c5270.m14552((C20502) null);
                                                            }
                                                            if (pictureM29085 != null) {
                                                                pictureM29085.beginRecording(1, 1);
                                                                pictureM29085.endRecording();
                                                            }
                                                            if (c20502M8063 != null) {
                                                                c20502M8063.close();
                                                            }
                                                            if (c20502M8064 != null) {
                                                                c20502M8064.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c5270 = null;
                                                        if (bitmapCreateBitmap != null) {
                                                            bitmapCreateBitmap.recycle();
                                                        }
                                                        if (c20502M8062 != null) {
                                                            c20502M8062.close();
                                                        }
                                                        if (c20502M8061 != null) {
                                                            c20502M8061.close();
                                                        }
                                                        if (c5270 != null) {
                                                            c5270.m14552((C20502) null);
                                                        }
                                                        if (pictureM29085 != null) {
                                                            pictureM29085.beginRecording(1, 1);
                                                            pictureM29085.endRecording();
                                                        }
                                                        if (c20502M8063 != null) {
                                                            c20502M8063.close();
                                                        }
                                                        if (c20502M8064 != null) {
                                                            c20502M8064.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (C8116 e2) {
                                                    e = e2;
                                                    c5274 = null;
                                                    c5270 = c5274;
                                                    pictureM29085 = null;
                                                    throw new IOException("SVG could not be parsed", e);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c5270 = null;
                                                    pictureM29085 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c20502M8062 != null) {
                                                        c20502M8062.close();
                                                    }
                                                    if (c20502M8061 != null) {
                                                        c20502M8061.close();
                                                    }
                                                    if (c5270 != null) {
                                                        c5270.m14552((C20502) null);
                                                    }
                                                    if (pictureM29085 != null) {
                                                        pictureM29085.beginRecording(1, 1);
                                                        pictureM29085.endRecording();
                                                    }
                                                    if (c20502M8063 != null) {
                                                        c20502M8063.close();
                                                    }
                                                    if (c20502M8064 != null) {
                                                        c20502M8064.close();
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i = iM8055;
                                                i2 = iM8056;
                                                c5275 = new C5270(c11644M29081, null, i, i2, i17, c20502M8064);
                                                c20502M8064 = null;
                                            }
                                            C20502 c20502 = c20502M8064;
                                            C20502 c20503 = c20502M8063;
                                            C5270 c5276 = c5275;
                                            try {
                                                C9919 c9919 = new C9919(new C20937(abstractC1886.mo5281(), i, i2, 1, "image/svg+xml", c14588), bitmapCreateBitmap, c20502M8062, c5276);
                                                c20502M8061.close();
                                                if (c20503 != null) {
                                                    c20503.close();
                                                }
                                                if (c20502 != null) {
                                                    c20502.close();
                                                }
                                                return c9919;
                                            } catch (C8116 e3) {
                                                e = e3;
                                                c5274 = c5276;
                                                c20502M8063 = c20503;
                                                c20502M8064 = c20502;
                                                c5270 = c5274;
                                                pictureM29085 = null;
                                                throw new IOException("SVG could not be parsed", e);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c5270 = c5276;
                                                c20502M8063 = c20503;
                                                c20502M8064 = c20502;
                                                pictureM29085 = null;
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                }
                                                if (c20502M8062 != null) {
                                                    c20502M8062.close();
                                                }
                                                if (c20502M8061 != null) {
                                                    c20502M8061.close();
                                                }
                                                if (c5270 != null) {
                                                    c5270.m14552((C20502) null);
                                                }
                                                if (pictureM29085 != null) {
                                                    pictureM29085.beginRecording(1, 1);
                                                    pictureM29085.endRecording();
                                                }
                                                if (c20502M8063 != null) {
                                                    c20502M8063.close();
                                                }
                                                if (c20502M8064 != null) {
                                                    c20502M8064.close();
                                                }
                                                throw th;
                                            }
                                        } catch (C8116 e4) {
                                            e = e4;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c5270 = null;
                                            pictureM29085 = null;
                                        }
                                    } catch (C8116 e5) {
                                        e = e5;
                                        c5274 = null;
                                        bitmapCreateBitmap = null;
                                        c5270 = c5274;
                                        pictureM29085 = null;
                                        throw new IOException("SVG could not be parsed", e);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        c5273 = null;
                                        pictureM29085 = null;
                                        c5270 = c5273;
                                        bitmapCreateBitmap = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c20502M8062 != null) {
                                            c20502M8062.close();
                                        }
                                        if (c20502M8061 != null) {
                                            c20502M8061.close();
                                        }
                                        if (c5270 != null) {
                                            c5270.m14552((C20502) null);
                                        }
                                        if (pictureM29085 != null) {
                                            pictureM29085.beginRecording(1, 1);
                                            pictureM29085.endRecording();
                                        }
                                        if (c20502M8063 != null) {
                                            c20502M8063.close();
                                        }
                                        if (c20502M8064 != null) {
                                            c20502M8064.close();
                                        }
                                        throw th;
                                    }
                                } catch (C8116 e6) {
                                    e = e6;
                                    c5272 = null;
                                    c5274 = c5272;
                                    c20502M8062 = null;
                                    bitmapCreateBitmap = null;
                                    c5270 = c5274;
                                    pictureM29085 = null;
                                    throw new IOException("SVG could not be parsed", e);
                                } catch (Throwable th7) {
                                    th = th7;
                                    c5271 = null;
                                    pictureM29085 = null;
                                    c5273 = c5271;
                                    c20502M8062 = null;
                                    c5270 = c5273;
                                    bitmapCreateBitmap = null;
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    if (c20502M8062 != null) {
                                        c20502M8062.close();
                                    }
                                    if (c20502M8061 != null) {
                                        c20502M8061.close();
                                    }
                                    if (c5270 != null) {
                                        c5270.m14552((C20502) null);
                                    }
                                    if (pictureM29085 != null) {
                                        pictureM29085.beginRecording(1, 1);
                                        pictureM29085.endRecording();
                                    }
                                    if (c20502M8063 != null) {
                                        c20502M8063.close();
                                    }
                                    if (c20502M8064 != null) {
                                        c20502M8064.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        i19 *= 2;
                        z11 = z;
                        iM8055 = iM8055;
                        iM8056 = iM8056;
                    }
                    throw new C10354("Animation frames do not fit allocation limit");
                } catch (C8116 e7) {
                    e = e7;
                    c5272 = null;
                    c20502M8061 = null;
                } catch (Throwable th8) {
                    th = th8;
                    c5271 = null;
                    pictureM29085 = null;
                    c20502M8061 = null;
                }
            } catch (C8116 e8) {
                e = e8;
                c20502M8061 = null;
                c20502M8062 = null;
                bitmapCreateBitmap = null;
                pictureM29085 = null;
                c5270 = null;
                c20502M8063 = null;
            } catch (Throwable th9) {
                th = th9;
                c5270 = null;
                pictureM29085 = null;
                c20502M8061 = null;
                c20502M8062 = null;
                bitmapCreateBitmap = null;
                c20502M8063 = null;
            }
        } catch (XmlPullParserException e9) {
            throw new IOException("SVG XML could not be parsed", e9);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8063(C3567 c3567, HashMap map, HashSet hashSet, long[] jArr, int i, int i2, boolean z, C22682 c22682) throws C14858, InterruptedIOException {
        m8064(c22682);
        long j = jArr[0] + 1;
        jArr[0] = j;
        if (j > X931RNG.BLOCK64_RESEED_MAX || i > 64 || !hashSet.add(c3567)) {
            throw new C14858("SVG references exceed safe render limits");
        }
        jArr[1] = Math.max(jArr[1], i);
        jArr[2] = jArr[2] + c3567.f13135;
        long j2 = jArr[4] + c3567.f13134;
        jArr[4] = j2;
        if (j2 > 1048576) {
            throw new C14858("SVG expanded geometry exceeds safe render limits");
        }
        int i3 = i2 + ((!z || i <= 0) ? c3567.f13136 : 3);
        jArr[3] = Math.max(jArr[3], i3);
        for (C3567 c3568 : c3567.f13138) {
            if (!c3568.f13137 || z) {
                m8063(c3568, map, hashSet, jArr, i + 1, i3, z, c22682);
            }
        }
        Iterator it = c3567.f13139.iterator();
        while (it.hasNext()) {
            C3567 c3569 = (C3567) map.get((String) it.next());
            if (c3569 != null) {
                m8063(c3569, map, hashSet, jArr, i + 1, i3, z, c22682);
            }
        }
        hashSet.remove(c3567);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8055(float f) throws IOException {
        if (f <= 0.0f || Float.isInfinite(f) || f > 1000000.0f) {
            throw new IOException("Image has no finite dimensions");
        }
        return Math.max(1, (int) Math.ceil(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20502 m8061(C0745 c0745, long j) throws C10354 {
        C20502 c20502M3239 = c0745.m3239(j);
        if (c20502M3239 != null) {
            return c20502M3239;
        }
        throw new C10354("Special image reservation exceeds budget");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8064(InterfaceC5614 interfaceC5614) throws InterruptedIOException {
        if (interfaceC5614.mo2357()) {
            throw new InterruptedIOException("Image decode cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8065(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() + i <= bArr.length) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8056(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m8067(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | m8056(i, bArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m8066(int i, byte[] bArr) {
        return ((((long) bArr[i + 3]) & 255) << 24) | (((long) m8067(i, bArr)) & 16777215);
    }
}
