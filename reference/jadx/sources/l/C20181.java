package l;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.ᩴ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8HP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20181 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f64814 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f64815 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f64813 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5265 m46431(String str) {
        try {
            return m46432(str);
        } catch (NumberFormatException | C2970 | XmlPullParserException unused) {
            C1896.m6517("Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5265 m46432(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C13827.m33740(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C2970.m9688("Couldn't find xmp metadata", (Throwable) null);
        }
        AbstractC1928 abstractC1928Of = AbstractC1928.of();
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (C13827.m33740(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strM33739 = C13827.m33739(xmlPullParserNewPullParser, f64814[i2]);
                    if (strM33739 != null) {
                        if (Integer.parseInt(strM33739) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strM337310 = C13827.m33739(xmlPullParserNewPullParser, f64815[i3]);
                                if (strM337310 != null) {
                                    j = Long.parseLong(strM337310);
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
                                String strM337311 = C13827.m33739(xmlPullParserNewPullParser, f64813[i]);
                                if (strM337311 != null) {
                                    abstractC1928Of = AbstractC1928.of((Object) new C13818("image/jpeg", 0L, 0L), (Object) new C13818("video/mp4", Long.parseLong(strM337311), 0L));
                                    break;
                                }
                                i++;
                            } else {
                                abstractC1928Of = AbstractC1928.of();
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            if (C13827.m33740(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC1928Of = m46430(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C13827.m33740(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC1928Of = m46430(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C13827.m33741(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC1928Of.isEmpty()) {
            break loop0;
        }
        return new C5265(j, abstractC1928Of);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m46430(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C13827.m33740(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM33739 = C13827.m33739(xmlPullParser, strConcat3);
                String strM337310 = C13827.m33739(xmlPullParser, strConcat4);
                String strM337311 = C13827.m33739(xmlPullParser, strConcat5);
                String strM337312 = C13827.m33739(xmlPullParser, strConcat6);
                if (strM33739 == null || strM337310 == null) {
                    return AbstractC1928.of();
                }
                c22811.m19807(new C13818(strM33739, strM337311 != null ? Long.parseLong(strM337311) : 0L, strM337312 != null ? Long.parseLong(strM337312) : 0L));
            }
        } while (!C13827.m33741(xmlPullParser, strConcat2));
        return c22811.m51441();
    }
}
