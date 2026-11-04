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

/* JADX INFO: renamed from: l.ۤ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11143 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] f35112;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f35113;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] f35114;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String f35115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28098(String str, String str2, String str3) throws IOException {
        String str4 = str2;
        if (str4.equals("zh")) {
            str4 = "zh-CHS";
        }
        if (str3.equals("zh")) {
            str3 = "zh-CHS";
        }
        if (f35113 == null) {
            String headerField = new C20094("https://fanyi.youdao.com/", false).m46224().getHeaderField("Set-Cookie");
            if (headerField == null) {
                throw new IOException("Can not get cookie");
            }
            int iIndexOf = headerField.indexOf(59);
            if (iIndexOf != -1) {
                headerField = headerField.substring(0, iIndexOf);
            }
            f35113 = headerField;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C20094 c20094 = new C20094("https://dict.youdao.com/webtranslate/key?keyid=webfanyi-key-getter-2025&sign=" + C15022.m36172("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis + "&product=webfanyi&key=yU5nT5dK3eZ1pI4j") + "&client=fanyideskweb&product=webfanyi&appVersion=1.0.0&vendor=web&pointParam=client,mysticTime,product&mysticTime=" + jCurrentTimeMillis + "&keyfrom=fanyi.web&mid=1&screen=1&model=1&network=wifi&abtest=0&yduuid=abcdefg", false);
            c20094.m46227("Cookie", f35113);
            c20094.m46227("Referer", "https://fanyi.youdao.com/");
            JSONObject jSONObject = new JSONObject(c20094.m46226());
            if (jSONObject.getInt("code") != 0) {
                throw new IOException(jSONObject.getString("msg"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(e.m);
            f35115 = jSONObject2.getString("secretKey");
            f35114 = C15022.m36174().digest(jSONObject2.getString("aesKey").getBytes());
            f35112 = C15022.m36174().digest(jSONObject2.getString("aesIv").getBytes());
        }
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C20094 c20095 = new C20094("https://dict.youdao.com/webtranslate", true);
            c20095.m46227("Cookie", f35113);
            c20095.m46227("Referer", "https://fanyi.youdao.com/");
            c20095.m46225(am.aC, str);
            c20095.m46225("from", str4);
            c20095.m46225("to", str3);
            c20095.m46225("useTerm", "false");
            c20095.m46225("domain", "0");
            c20095.m46225("dictResult", "true");
            c20095.m46225("keyid", "webfanyi");
            c20095.m46225("sign", C15022.m36172("client=fanyideskweb&mysticTime=" + jCurrentTimeMillis2 + "&product=webfanyi&key=" + f35115));
            c20095.m46225("client", "fanyideskweb");
            c20095.m46225("product", "webfanyi");
            c20095.m46225("appVersion", "1.0.0");
            c20095.m46225("vendor", "web");
            c20095.m46225("pointParam", "client,mysticTime,product");
            c20095.m46225("mysticTime", String.valueOf(jCurrentTimeMillis2));
            c20095.m46225("keyfrom", "fanyi.web");
            c20095.m46225("mid", "1");
            c20095.m46225("screen", "1");
            c20095.m46225("model", "1");
            c20095.m46225("network", "wifi");
            c20095.m46225("abtest", "0");
            c20095.m46225("yduuid", "abcdefg");
            byte[] bArrDecode = Base64.decode(c20095.m46226().replace('_', '/').replace('-', '+'), 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f35114, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f35112);
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
                f35113 = null;
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
