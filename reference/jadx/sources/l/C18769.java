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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18769 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f60969 = Pattern.compile("(?is)(<title\\b[^>]*>).*?(</title>)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60968 = Pattern.compile("(?is)(<html\\b[^>]*?\\blang\\s*=\\s*)([\"'])(.*?)(\\2[^>]*>)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m43569(C3767 c3767) {
        ByteArrayInputStream byteArrayInputStream;
        EnumC12716 enumC12716M12226 = c3767.m12226();
        if (EnumC12716.GET.equals(enumC12716M12226) || EnumC12716.HEAD.equals(enumC12716M12226)) {
            String strM12228 = c3767.m12228();
            if (TextUtils.isEmpty(strM12228) || "/".equals(strM12228)) {
                strM12228 = "index.html";
            }
            if (strM12228.startsWith("/")) {
                strM12228 = strM12228.substring(1);
            }
            if (TextUtils.isEmpty(strM12228)) {
                strM12228 = "index.html";
            } else {
                if (strM12228.startsWith("/") || strM12228.contains("\\") || strM12228.indexOf(0) >= 0) {
                    strM12228 = null;
                    break;
                }
                for (String str : strM12228.split("/")) {
                    if (str.isEmpty() || ".".equals(str) || "..".equals(str)) {
                        strM12228 = null;
                        break;
                    }
                }
            }
            if (strM12228 != null) {
                C7582 c7582M43567 = m43567(strM12228, false);
                if (c7582M43567 == null && !"index.html".equals(strM12228)) {
                    c7582M43567 = m43567("index.html", true);
                }
                if (c7582M43567 != null) {
                    if (EnumC12716.HEAD.equals(enumC12716M12226)) {
                        byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        byteArrayInputStream = new ByteArrayInputStream(c7582M43567.f25049);
                    }
                    C18683 c18683M5421 = AbstractC1530.m5421(EnumC21667.OK, c7582M43567.f25050, byteArrayInputStream, c7582M43567.f25049.length);
                    c18683M5421.m43441(enumC12716M12226);
                    c18683M5421.m43440("Cache-Control", c7582M43567.f25051);
                    c18683M5421.m43440("Referrer-Policy", "no-referrer");
                    return c18683M5421;
                }
                return AbstractC1530.m5422(EnumC21667.NOT_FOUND, "text/plain", "");
            }
            return AbstractC1530.m5422(EnumC21667.NOT_FOUND, "text/plain", "");
        }
        return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7582 m43567(String str, boolean z) {
        String str2;
        try {
            InputStream inputStreamOpen = C21576.m49086().open("web-manager/".concat(str));
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
                    byteArray = m43566(new String(byteArray, charset)).getBytes(charset);
                }
                C7582 c7582 = new C7582(m43568(str), byteArray, str2);
                inputStreamOpen.close();
                return c7582;
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
    public static String m43566(String str) {
        Locale localeM14705 = C4767.m14705(C21576.m49084());
        String strM25595 = C9818.m25595(localeM14705);
        Application applicationM49084 = C21576.m49084();
        Configuration configuration = new Configuration(applicationM49084.getResources().getConfiguration());
        configuration.setLocale(localeM14705);
        configuration.setLayoutDirection(localeM14705);
        String strM56409 = C25272.m56409(strM25595.startsWith("zh-") ? "MT" : "MT ", applicationM49084.createConfigurationContext(configuration).getString(R.string.MT_Protector));
        Matcher matcher = f60969.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + matcher.group(1) + strM56409.replace(a.p, "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") + matcher.group(2) + str.substring(matcher.end());
        }
        if ("zh-rCN".equals(strM25595)) {
            strM25595 = "zh-CN";
        } else if ("zh-rTW".equals(strM25595)) {
            strM25595 = "zh-TW";
        } else if ("in".equals(strM25595)) {
            strM25595 = "id";
        }
        Matcher matcher2 = f60968.matcher(str);
        if (!matcher2.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, matcher2.start()));
        sb.append(matcher2.group(1));
        sb.append(matcher2.group(2));
        sb.append(strM25595);
        sb.append(matcher2.group(4));
        return ExternalValue$$ExternalSyntheticOutline0.m(matcher2.end(), str, sb);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m43568(String str) {
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
