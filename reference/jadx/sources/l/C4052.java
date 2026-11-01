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

/* JADX INFO: renamed from: l.ۘܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4052 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f14951 = new ArrayList();

    static {
        m11556("png", "89 50 4E 47");
        m11556("jpg", "FF D8 FF");
        m11556("gif", "47 49 46 38");
        m11556("webp", "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38");
        m11556("bmp", "42 4D");
        m11556("bmp", "42 41");
        m11556("bmp", "43 49");
        m11556("bmp", "43 50");
        m11556("bmp", "49 43");
        m11556("bmp", "50 54");
        m11556("mp4", "00 00 00 ?? 66 74 79 70 69 73 6F 36");
        m11556("mp4", "00 00 00 ?? 66 74 79 70 6D 70 34 32");
        m11556("m4a", "00 00 00 ?? 66 74 79 70 4D 34 41 20");
        m11556("mp3", "49 44 33");
        m11556("ogg", "4F 67 67 53");
        m11556("wav", "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
        m11556("ttf", "00 01 00 00");
        m11556("ttc", "74 74 63 66");
        m11556("otf", "4F 54 54 4F");
        f14950 = Pattern.compile("\\s*<!doctype *(\\w+)[ >]", 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11554(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11555(byte[] bArr) {
        String lowerCase = "plist";
        Iterator it = f14951.iterator();
        while (true) {
            if (it.hasNext()) {
                C1230 c1230 = (C1230) it.next();
                if (C1230.m4429(c1230, bArr)) {
                    lowerCase = c1230.f5393;
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
                if (C6851.m18466("<html>", str)) {
                    lowerCase = "html";
                    break;
                }
                Matcher matcher = f14950.matcher(str);
                if (matcher.lookingAt()) {
                    lowerCase = matcher.group(1).toLowerCase();
                    break;
                }
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    Stack stack = new Stack();
                    C13226 c13226 = null;
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2) {
                            C13226 c13227 = new C13226(xmlPullParserNewPullParser.getName());
                            if (c13226 == null) {
                                c13226 = c13227;
                            } else {
                                ((C13226) stack.peek()).f43979.add(c13227);
                            }
                            stack.push(c13227);
                        } else if (next == 3) {
                            stack.pop();
                        }
                    }
                    if (c13226 != null) {
                        String str2 = c13226.f43980;
                        if (!str2.equals("svg")) {
                            if (!str2.equals("plist")) {
                                if (!str2.equals("kml") && ((!str2.equals("Placemark") || !c13226.m32712()) && (!str2.equals("Folder") || !c13226.m32710()))) {
                                    if (str2.equals("Document") && c13226.m32711("name")) {
                                        Iterator it2 = c13226.f43979.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                C13226 c13228 = (C13226) it2.next();
                                                if (!c13228.f43980.equals("Placemark") || !c13228.m32712()) {
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
            int i = 8;
            while (bArr.length - i >= 8) {
                int iM11554 = m11554(i, bArr);
                int iM11555 = m11554(i + 4, bArr);
                int i2 = i + 8;
                if (iM11555 == 1852855395) {
                    return ".9.png";
                }
                i = i2 + iM11554 + 4;
            }
        }
        if (lowerCase != null) {
            return ".".concat(lowerCase);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11556(String str, String str2) {
        f14951.add(new C1230(str, str2));
    }
}
