package l;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۤۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J72V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10010 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f34188;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25285(String str) {
        int i;
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        if (iLastIndexOf2 > iLastIndexOf && (i = iLastIndexOf2 + 1) < str.length()) {
            String str2 = (String) f34188.get(str.substring(i).toLowerCase(Locale.ROOT));
            if (str2 != null) {
                return str2;
            }
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? "application/octet-stream" : strGuessContentTypeFromName;
    }

    static {
        HashMap map = new HashMap();
        m25286(map, "text/html", "html", "htm", "shtml");
        m25286(map, "application/xhtml+xml", "xhtml", "xht");
        m25286(map, "multipart/related", "mhtml", "mht");
        m25286(map, "text/css", "css");
        m25286(map, "text/javascript", "js", "mjs", "cjs");
        m25286(map, "application/json", "json", "map");
        m25286(map, "application/manifest+json", "webmanifest");
        m25286(map, "application/xml", DocumentReader.RESERVED, "xsl", "xslt");
        m25286(map, "application/wasm", "wasm");
        m25286(map, "image/svg+xml", "svg", "svgz");
        m25286(map, "image/png", "png", "apng");
        m25286(map, "image/jpeg", "jpg", "jpeg", "jpe");
        m25286(map, "image/gif", "gif");
        m25286(map, "image/webp", "webp");
        m25286(map, "image/avif", "avif");
        m25286(map, "image/bmp", "bmp", "dib");
        m25286(map, "image/x-icon", "ico", "cur");
        m25286(map, "image/tiff", "tif", "tiff");
        m25286(map, "font/woff", "woff");
        m25286(map, "font/woff2", "woff2");
        m25286(map, "font/ttf", "ttf");
        m25286(map, "font/otf", "otf");
        m25286(map, "application/vnd.ms-fontobject", "eot");
        m25286(map, "audio/mpeg", "mp3", "mp2", "mpga");
        m25286(map, "audio/ogg", "oga", "ogg", "opus");
        m25286(map, "audio/wav", "wav");
        m25286(map, "audio/mp4", "m4a");
        m25286(map, "audio/aac", "aac");
        m25286(map, "audio/flac", "flac");
        m25286(map, "video/mp4", "mp4", "m4v");
        m25286(map, "video/webm", "webm");
        m25286(map, "video/ogg", "ogv");
        m25286(map, "video/mp2t", "ts", "m2ts");
        m25286(map, "application/vnd.apple.mpegurl", "m3u8");
        m25286(map, "text/vtt", "vtt");
        m25286(map, "application/pdf", "pdf");
        m25286(map, "text/plain", "txt", TextBundle.TEXT_ENTRY);
        m25286(map, "text/csv", "csv");
        f34188 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25286(HashMap map, String str, String... strArr) {
        for (String str2 : strArr) {
            map.put(str2, str);
        }
    }
}
