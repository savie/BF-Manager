package l;

import android.util.Xml;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.۫᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f42636;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ArrayList f42637 = new ArrayList();

    static {
        m32976("png", "89 50 4E 47");
        m32976("jpg", "FF D8 FF");
        m32976("gif", "47 49 46 38");
        m32976("webp", "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38");
        m32976("bmp", "42 4D");
        m32976("bmp", "42 41");
        m32976("bmp", "43 49");
        m32976("bmp", "43 50");
        m32976("bmp", "49 43");
        m32976("bmp", "50 54");
        m32976("mp4", "00 00 00 ?? 66 74 79 70 69 73 6F 36");
        m32976("mp4", "00 00 00 ?? 66 74 79 70 6D 70 34 32");
        m32976("m4a", "00 00 00 ?? 66 74 79 70 4D 34 41 20");
        m32976("mp3", "49 44 33");
        m32976("ogg", "4F 67 67 53");
        m32976("wav", "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
        m32976("ttf", "00 01 00 00");
        m32976("ttc", "74 74 63 66");
        m32976("otf", "4F 54 54 4F");
        f42636 = Pattern.compile("\\s*<!doctype *(\\w+)[ >]", 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32974(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32975(byte[] bArr) {
        String lowerCase = "plist";
        Iterator it = f42637.iterator();
        while (true) {
            if (it.hasNext()) {
                C20089 c20089 = (C20089) it.next();
                if (C20089.m46223(c20089, bArr)) {
                    lowerCase = c20089.f64567;
                    break;
                }
            } else {
                String str = new String(bArr, StandardCharsets.UTF_8);
                if (str.startsWith("-----BEGIN CERTIFICATE-----")) {
                    lowerCase = "cer";
                    break;
                }
                if (str.startsWith("-----BEGIN PRIVATE KEY-----")) {
                    lowerCase = "key";
                    break;
                }
                int i = C24276.f78588;
                if (AbstractC21292.f67895.m48533("<html>", str)) {
                    lowerCase = "html";
                    break;
                }
                Matcher matcher = f42636.matcher(str);
                if (matcher.lookingAt()) {
                    lowerCase = matcher.group(1).toLowerCase();
                    break;
                }
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    Stack stack = new Stack();
                    C15613 c15613 = null;
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2) {
                            C15613 c15614 = new C15613(xmlPullParserNewPullParser.getName());
                            if (c15613 == null) {
                                c15613 = c15614;
                            } else {
                                ((C15613) stack.peek()).f50734.add(c15614);
                            }
                            stack.push(c15614);
                        } else if (next == 3) {
                            stack.pop();
                        }
                    }
                    if (c15613 != null) {
                        String str2 = c15613.f50735;
                        if (!str2.equals("svg")) {
                            if (!str2.equals("plist")) {
                                if (!str2.equals("kml") && ((!str2.equals("Placemark") || !c15613.m37345()) && (!str2.equals("Folder") || !c15613.m37343()))) {
                                    if (str2.equals("Document") && c15613.m37344("name")) {
                                        Iterator it2 = c15613.f50734.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                C15613 c15615 = (C15613) it2.next();
                                                if (!c15615.f50735.equals("Placemark") || !c15615.m37345()) {
                                                }
                                            }
                                        }
                                    }
                                    lowerCase = DocumentReader.RESERVED;
                                    break;
                                }
                                lowerCase = "kml";
                                break;
                            }
                            break;
                        }
                        lowerCase = "svg";
                        break;
                    }
                    try {
                        Object objNextValue = new JSONTokener(str).nextValue();
                        if (!(objNextValue instanceof JSONObject) && !(objNextValue instanceof JSONArray)) {
                            lowerCase = null;
                            break;
                        }
                        lowerCase = "json";
                        break;
                    } catch (Throwable unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (lowerCase != null && lowerCase.equals("png")) {
            int i2 = 8;
            while (bArr.length - i2 >= 8) {
                int iM32974 = m32974(i2, bArr);
                int iM32975 = m32974(i2 + 4, bArr);
                int i3 = i2 + 8;
                if (iM32975 == 1852855395) {
                    return ".9.png";
                }
                i2 = i3 + iM32974 + 4;
            }
        }
        if (lowerCase != null) {
            return ".".concat(lowerCase);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32976(String str, String str2) {
        f42637.add(new C20089(str, str2));
    }
}
