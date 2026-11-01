package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۢܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I81B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f32478;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f32479;

    public C9659(String str, String str2) {
        this.f32478 = str;
        this.f32479 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m24559() throws IOException {
        ArrayList arrayList = new ArrayList();
        String strM24558 = m24558("/buckets");
        C6490 c6490 = new C6490();
        c6490.m17686("https://uc.qiniuapi.com/buckets");
        c6490.m17680("Authorization", "Qiniu " + strM24558);
        c6490.m17685();
        try {
            C18485 c18485Execute = C16737.m39297().m14157(c6490.m17678()).execute();
            try {
                if (!c18485Execute.m42863()) {
                    if (c18485Execute.m42858() != 401 && c18485Execute.m42858() != 403) {
                        throw new IOException("Request failed: " + c18485Execute.m42858() + " " + c18485Execute.m42868());
                    }
                    throw new C8142(R.string.MT_Protector);
                }
                AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
                C13638.requireNonNull(abstractC19191M42860);
                String strM44053 = abstractC19191M42860.m44053();
                ArrayList<String> arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(strM44053);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(jSONArray.getString(i));
                }
                c18485Execute.close();
                for (String str : arrayList2) {
                    String strM1693 = C0252.m1693("/v2/bucketInfo?bucket=", str);
                    String strM1694 = C0252.m1693("https://uc.qiniuapi.com", strM1693);
                    String strM24559 = m24558(strM1693);
                    C6490 c6491 = new C6490();
                    c6491.m17686(strM1694);
                    c6491.m17680("Authorization", "Qiniu " + strM24559);
                    c6491.m17685();
                    try {
                        C18485 c18485Execute2 = C16737.m39297().m14157(c6491.m17678()).execute();
                        try {
                            if (!c18485Execute2.m42863()) {
                                throw new IOException("Request failed: " + c18485Execute2.m42858() + " " + c18485Execute2.m42868());
                            }
                            AbstractC19191 abstractC19191M42861 = c18485Execute2.m42860();
                            C13638.requireNonNull(abstractC19191M42861);
                            String string = new JSONObject(abstractC19191M42861.m44053()).getString("region");
                            c18485Execute2.close();
                            string.getClass();
                            switch (string) {
                                case "z0":
                                    string = "cn-east-1";
                                    break;
                                case "z1":
                                    string = "cn-north-1";
                                    break;
                                case "z2":
                                    string = "cn-south-1";
                                    break;
                                case "as0":
                                    string = "ap-southeast-1";
                                    break;
                                case "na0":
                                    string = "us-north-1";
                                    break;
                            }
                            arrayList.add(new C23770(str, string, C16523.m38890("s3.", string, ".qiniucs.com")));
                        } catch (Throwable th) {
                            try {
                                c18485Execute2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (JSONException e) {
                        throw new IOException(e);
                    }
                    throw new IOException(e);
                }
                return arrayList;
            } catch (Throwable th3) {
                try {
                    c18485Execute.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m24558(String str) {
        String strM21055 = C7997.m21055("GET ", str, "\nHost: uc.qiniuapi.com", "\n\n");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM21055.getBytes(charset);
        String str2 = this.f32479;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            return C1694.m5622(new StringBuilder(), this.f32478, ":", C8324.getEncoder().encodeToString(mac.doFinal(bytes)).replace('+', '-').replace('/', '_'));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
