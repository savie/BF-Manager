package l;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۧۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72V */
/* JADX INFO: loaded from: classes3.dex */
public final class C11401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f35865;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28751(String str) {
        int i;
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str.lastIndexOf(46);
        if (iLastIndexOf2 > iLastIndexOf && (i = iLastIndexOf2 + 1) < str.length()) {
            String str2 = (String) f35865.get(str.substring(i).toLowerCase(Locale.ROOT));
            if (str2 != null) {
                return str2;
            }
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? "application/octet-stream" : strGuessContentTypeFromName;
    }

    static {
        HashMap map = new HashMap();
        m28752(map, "text/html", "html", "htm", "shtml");
        m28752(map, "application/xhtml+xml", "xhtml", "xht");
        m28752(map, "multipart/related", "mhtml", "mht");
        m28752(map, "text/css", "css");
        m28752(map, "text/javascript", "js", "mjs", "cjs");
        m28752(map, "application/json", "json", "map");
        m28752(map, "application/manifest+json", "webmanifest");
        m28752(map, "application/xml", DocumentReader.RESERVED, "xsl", "xslt");
        m28752(map, "application/wasm", "wasm");
        m28752(map, "image/svg+xml", "svg", "svgz");
        m28752(map, "image/png", "png", "apng");
        m28752(map, "image/jpeg", "jpg", "jpeg", "jpe");
        m28752(map, "image/gif", "gif");
        m28752(map, "image/webp", "webp");
        m28752(map, "image/avif", "avif");
        m28752(map, "image/bmp", "bmp", "dib");
        m28752(map, "image/x-icon", "ico", "cur");
        m28752(map, "image/tiff", "tif", "tiff");
        m28752(map, "font/woff", "woff");
        m28752(map, "font/woff2", "woff2");
        m28752(map, "font/ttf", "ttf");
        m28752(map, "font/otf", "otf");
        m28752(map, "application/vnd.ms-fontobject", "eot");
        m28752(map, "audio/mpeg", "mp3", "mp2", "mpga");
        m28752(map, "audio/ogg", "oga", "ogg", "opus");
        m28752(map, "audio/wav", "wav");
        m28752(map, "audio/mp4", "m4a");
        m28752(map, "audio/aac", "aac");
        m28752(map, "audio/flac", "flac");
        m28752(map, "video/mp4", "mp4", "m4v");
        m28752(map, "video/webm", "webm");
        m28752(map, "video/ogg", "ogv");
        m28752(map, "video/mp2t", "ts", "m2ts");
        m28752(map, "application/vnd.apple.mpegurl", "m3u8");
        m28752(map, "text/vtt", "vtt");
        m28752(map, "application/pdf", "pdf");
        m28752(map, "text/plain", "txt", TextBundle.TEXT_ENTRY);
        m28752(map, "text/csv", "csv");
        f35865 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28752(HashMap map, String str, String... strArr) {
        for (String str2 : strArr) {
            map.put(str2, str);
        }
    }
}
