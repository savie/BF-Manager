package l;

import android.app.Application;
import android.content.res.Configuration;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15123 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49397 = Pattern.compile("(?is)(<title\\b[^>]*>).*?(</title>)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f49396 = Pattern.compile("(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"'])(.*?)(\\2[^>]*>)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m36247(C15530 c15530) {
        ByteArrayInputStream byteArrayInputStream;
        EnumC18351 enumC18351M37142 = c15530.m37142();
        if (EnumC18351.GET.equals(enumC18351M37142) || EnumC18351.HEAD.equals(enumC18351M37142)) {
            String strM37143 = c15530.m37143();
            if (TextUtils.isEmpty(strM37143) || "/".equals(strM37143)) {
                strM37143 = "index.html";
            }
            if (strM37143.startsWith("/")) {
                strM37143 = strM37143.substring(1);
            }
            if (TextUtils.isEmpty(strM37143)) {
                strM37143 = "index.html";
            } else {
                if (strM37143.startsWith("/") || strM37143.contains("\\") || strM37143.indexOf(0) >= 0) {
                    strM37143 = null;
                    break;
                }
                for (String str : strM37143.split("/")) {
                    if (str.isEmpty() || ".".equals(str) || "..".equals(str)) {
                        strM37143 = null;
                        break;
                    }
                }
            }
            if (strM37143 != null) {
                C22884 c22884M36245 = m36245(strM37143, false);
                if (c22884M36245 == null && !"index.html".equals(strM37143)) {
                    c22884M36245 = m36245("index.html", true);
                }
                if (c22884M36245 != null) {
                    if (EnumC18351.HEAD.equals(enumC18351M37142)) {
                        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        byteArrayInputStream = new ByteArrayInputStream(c22884M36245.f74422);
                    }
                    C7768 c7768M39638 = AbstractC16940.m39638(EnumC10591.OK, c22884M36245.f74423, byteArrayInputStream, c22884M36245.f74422.length);
                    c7768M39638.m20449(enumC18351M37142);
                    c7768M39638.m20448("Cache-Control", c22884M36245.f74424);
                    c7768M39638.m20448("Referrer-Policy", "no-referrer");
                    return c7768M39638;
                }
                return AbstractC16940.m39639(EnumC10591.NOT_FOUND, "text/plain", "");
            }
            return AbstractC16940.m39639(EnumC10591.NOT_FOUND, "text/plain", "");
        }
        return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C22884 m36245(String str, boolean z) {
        String str2;
        try {
            InputStream inputStreamOpen = C16737.m39286().open("web-manager/".concat(str));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    return null;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (z || "index.html".equals(str) || !str.startsWith("assets/")) {
                    str2 = "no-cache";
                } else {
                    String strSubstring = str.substring(str.lastIndexOf(47) + 1);
                    int iLastIndexOf = strSubstring.lastIndexOf(46);
                    int iLastIndexOf2 = strSubstring.lastIndexOf(45, iLastIndexOf);
                    if (iLastIndexOf <= 0 || iLastIndexOf2 < 0 || iLastIndexOf - iLastIndexOf2 <= 8) {
                        str2 = "no-cache";
                    } else {
                        str2 = "public, max-age=31536000, immutable";
                    }
                }
                if (z || "index.html".equals(str)) {
                    Charset charset = StandardCharsets.UTF_8;
                    byteArray = m36244(new String(byteArray, charset)).getBytes(charset);
                }
                C22884 c22884 = new C22884(m36246(str), byteArray, str2);
                inputStreamOpen.close();
                return c22884;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36244(String str) {
        Locale localeM18163 = C6730.m18163(C16737.m39277());
        String strM48091 = C21472.m48091(localeM18163);
        Application applicationM39277 = C16737.m39277();
        Configuration configuration = new Configuration(applicationM39277.getResources().getConfiguration());
        configuration.setLocale(localeM18163);
        configuration.setLayoutDirection(localeM18163);
        String strM1693 = C0252.m1693(strM48091.startsWith("zh-") ? "MT" : "MT ", applicationM39277.createConfigurationContext(configuration).getString(R.string.MT_Protector));
        Matcher matcher = f49397.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + matcher.group(1) + strM1693.replace(a.p, "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") + matcher.group(2) + str.substring(matcher.end());
        }
        if ("zh-rCN".equals(strM48091)) {
            strM48091 = "zh-CN";
        } else if ("zh-rTW".equals(strM48091)) {
            strM48091 = "zh-TW";
        } else if ("in".equals(strM48091)) {
            strM48091 = "id";
        }
        Matcher matcher2 = f49396.matcher(str);
        if (!matcher2.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, matcher2.start()));
        sb.append(matcher2.group(1));
        sb.append(matcher2.group(2));
        sb.append(strM48091);
        sb.append(matcher2.group(4));
        return C0242.m1616(matcher2.end(), str, sb);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m36246(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.endsWith(".html")) {
            return "text/html; charset=UTF-8";
        }
        if (lowerCase.endsWith(".js") || lowerCase.endsWith(".mjs")) {
            return "application/javascript; charset=UTF-8";
        }
        if (lowerCase.endsWith(".css")) {
            return "text/css; charset=UTF-8";
        }
        if (lowerCase.endsWith(".json") || lowerCase.endsWith(".map")) {
            return "application/json; charset=UTF-8";
        }
        if (lowerCase.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (lowerCase.endsWith(".png")) {
            return "image/png";
        }
        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
            return "image/jpeg";
        }
        if (lowerCase.endsWith(".webp")) {
            return "image/webp";
        }
        if (lowerCase.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (lowerCase.endsWith(".woff")) {
            return "font/woff";
        }
        if (lowerCase.endsWith(".woff2")) {
            return "font/woff2";
        }
        return lowerCase.endsWith(".txt") ? "text/plain; charset=UTF-8" : "application/octet-stream";
    }
}
