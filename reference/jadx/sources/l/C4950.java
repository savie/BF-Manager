package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۙܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I81B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f17238;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f17239;

    public C4950(String str, String str2) {
        this.f17238 = str;
        this.f17239 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15153() throws IOException {
        ArrayList arrayList = new ArrayList();
        String strM15152 = m15152("/buckets");
        C0496 c0496 = new C0496();
        c0496.m2397("https://uc.qiniuapi.com/buckets");
        c0496.m2391("Authorization", "Qiniu " + strM15152);
        c0496.m2396();
        try {
            C9444 c9444Execute = C21576.m49093().m54450(c0496.m2389()).execute();
            try {
                if (!c9444Execute.m24819()) {
                    if (c9444Execute.m24820() != 401 && c9444Execute.m24820() != 403) {
                        throw new IOException("Request failed: " + c9444Execute.m24820() + " " + c9444Execute.m24825());
                    }
                    throw new C3090(R.string.MT_Protector);
                }
                AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
                C17359.requireNonNull(abstractC8699M24818);
                String strM23392 = abstractC8699M24818.m23392();
                ArrayList<String> arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(strM23392);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(jSONArray.getString(i));
                }
                c9444Execute.close();
                for (String str : arrayList2) {
                    String strM56409 = C25272.m56409("/v2/bucketInfo?bucket=", str);
                    String strM564010 = C25272.m56409("https://uc.qiniuapi.com", strM56409);
                    String strM15153 = m15152(strM56409);
                    C0496 c0497 = new C0496();
                    c0497.m2397(strM564010);
                    c0497.m2391("Authorization", "Qiniu " + strM15153);
                    c0497.m2396();
                    try {
                        C9444 c9444Execute2 = C21576.m49093().m54450(c0497.m2389()).execute();
                        try {
                            if (!c9444Execute2.m24819()) {
                                throw new IOException("Request failed: " + c9444Execute2.m24820() + " " + c9444Execute2.m24825());
                            }
                            AbstractC8699 abstractC8699M24819 = c9444Execute2.m24818();
                            C17359.requireNonNull(abstractC8699M24819);
                            String string = new JSONObject(abstractC8699M24819.m23392()).getString("region");
                            c9444Execute2.close();
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
                            arrayList.add(new C8373(str, string, C14442.m34865("s3.", string, ".qiniucs.com")));
                        } catch (Throwable th) {
                            try {
                                c9444Execute2.close();
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
                    c9444Execute.close();
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
    private String m15152(String str) {
        String strM = ExternalValue$$ExternalSyntheticOutline0.m("GET ", str, "\nHost: uc.qiniuapi.com", "\n\n");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM.getBytes(charset);
        String str2 = this.f17239;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            return C12669.m31438(new StringBuilder(), this.f17238, ":", C19069.getEncoder().encodeToString(mac.doFinal(bytes)).replace('+', '-').replace('/', '_'));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
