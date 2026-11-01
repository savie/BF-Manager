package l;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.ۤ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8HP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10606 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f36259 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f36260 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f36258 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19072 m26771(String str) {
        try {
            return m26773(str);
        } catch (NumberFormatException | C22861 | XmlPullParserException unused) {
            C0303.m1848("Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C19072 m26773(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C18689.m43173(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C22861.m50610("Couldn't find xmp metadata", (Throwable) null);
        }
        AbstractC22433 abstractC22433Of = AbstractC22433.of();
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (C18689.m43173(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strM43172 = C18689.m43172(xmlPullParserNewPullParser, f36259[i2]);
                    if (strM43172 != null) {
                        if (Integer.parseInt(strM43172) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strM43173 = C18689.m43172(xmlPullParserNewPullParser, f36260[i3]);
                                if (strM43173 != null) {
                                    j = Long.parseLong(strM43173);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i < 2) {
                                String strM43174 = C18689.m43172(xmlPullParserNewPullParser, f36258[i]);
                                if (strM43174 != null) {
                                    abstractC22433Of = AbstractC22433.of((Object) new C18366("image/jpeg", 0L, 0L), (Object) new C18366("video/mp4", Long.parseLong(strM43174), 0L));
                                    break;
                                }
                                i++;
                            } else {
                                abstractC22433Of = AbstractC22433.of();
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            if (C18689.m43173(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC22433Of = m26772(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C18689.m43173(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC22433Of = m26772(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C18689.m43174(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC22433Of.isEmpty()) {
            break loop0;
        }
        return new C19072(j, abstractC22433Of);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m26772(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C18689.m43173(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM43172 = C18689.m43172(xmlPullParser, strConcat3);
                String strM43173 = C18689.m43172(xmlPullParser, strConcat4);
                String strM43174 = C18689.m43172(xmlPullParser, strConcat5);
                String strM43175 = C18689.m43172(xmlPullParser, strConcat6);
                if (strM43172 == null || strM43173 == null) {
                    return AbstractC22433.of();
                }
                c4793.m52163(new C18366(strM43172, strM43174 != null ? Long.parseLong(strM43174) : 0L, strM43175 != null ? Long.parseLong(strM43175) : 0L));
            }
        } while (!C18689.m43174(xmlPullParser, strConcat2));
        return c4793.m13309();
    }
}
