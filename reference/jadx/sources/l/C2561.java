package l;

import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۖܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String f10110;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] f10111;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f10112;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] f10113;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7999(String str, String str2, String str3) throws IOException {
        String str4 = str2;
        if (str4.equals("zh")) {
            str4 = "zh-CHS";
        }
        if (str3.equals("zh")) {
            str3 = "zh-CHS";
        }
        if (f10112 == null) {
            String headerField = new C22318("https://fanyi.youdao.com/", false).m49486().getHeaderField("Set-Cookie");
            if (headerField == null) {
                throw new IOException("Can not get cookie");
            }
            int iIndexOf = headerField.indexOf(59);
            if (iIndexOf != -1) {
                headerField = headerField.substring(0, iIndexOf);
            }
            f10112 = headerField;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C22318 c22318 = new C22318("https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign=" + C22253.m49414("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis + "&product=webfanyi&key=yU5nT5dK3eZ1pI4j") + "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime=" + jCurrentTimeMillis + "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg", false);
            c22318.m49489("Cookie", f10112);
            c22318.m49489("Referer", "https://fanyi.youdao.com/");
            JSONObject jSONObject = new JSONObject(c22318.m49488());
            if (jSONObject.getInt("code") != 0) {
                throw new IOException(jSONObject.getString("msg"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(e.m);
            f10110 = jSONObject2.getString("secretKey");
            f10113 = C22253.m49416().digest(jSONObject2.getString("aesKey").getBytes());
            f10111 = C22253.m49416().digest(jSONObject2.getString("aesIv").getBytes());
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C22318 c22319 = new C22318("https://dict.youdao.com/webtranslate", true);
            c22319.m49489("Cookie", f10112);
            c22319.m49489("Referer", "https://fanyi.youdao.com/");
            c22319.m49487(am.aC, str);
            c22319.m49487("from", str4);
            c22319.m49487("to", str3);
            c22319.m49487("useTerm", "false");
            c22319.m49487("domain", "0");
            c22319.m49487("dictResult", "true");
            c22319.m49487("keyid", "webfanyi");
            c22319.m49487("sign", C22253.m49414("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis2 + "&product=webfanyi&key=" + f10110));
            c22319.m49487("client", "fanyideskweb");
            c22319.m49487("product", "webfanyi");
            c22319.m49487("appVersion", "1.0.0");
            c22319.m49487("vendor", "web");
            c22319.m49487("pointParam", "client,mysticTime,product");
            c22319.m49487("mysticTime", String.valueOf(jCurrentTimeMillis2));
            c22319.m49487("keyfrom", "fanyi.web");
            c22319.m49487("mid", "1");
            c22319.m49487("screen", "1");
            c22319.m49487("model", "1");
            c22319.m49487("network", "wifi");
            c22319.m49487("abtest", "0");
            c22319.m49487("yduuid", "abcdefg");
            byte[] bArrDecode = Base64.decode(c22319.m49488().replace('_', '/').replace('-', '+'), 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f10113, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f10111);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            JSONObject jSONObject3 = new JSONObject(new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8));
            int i = jSONObject3.getInt("code");
            if (i == 0) {
                JSONArray jSONArray = jSONObject3.getJSONArray("translateResult");
                StringBuilder sb = new StringBuilder();
                int size = jSONArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append(jSONArray.getJSONArray(i2).getJSONObject(0).getString("tgt"));
                }
                return sb.toString();
            }
            if (i == 50) {
                f10112 = null;
            }
            throw new IOException(jSONObject3.toString());
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
