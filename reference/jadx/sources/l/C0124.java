package l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֡ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0124 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f1077 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m1279(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        EnumC21667 enumC21668;
        String strM490510;
        int i;
        EnumC12716 enumC12716M12226 = c3767.m12226();
        if (EnumC12716.GET.equals(enumC12716M12226)) {
            String strM53547 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
            if (!TextUtils.isEmpty(strM53547)) {
                C14293 c14293M1272 = m1272(strM53547, true);
                C18683 c18683 = c14293M1272.f45134;
                if (c18683 != null) {
                    return c18683;
                }
                try {
                    C5902 c5902M56480 = C25294.m56480(new C9431(c14293M1272.f45136.mo8093()), -1, new C8730());
                    if (c5902M56480 == null) {
                        return C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(R.string.MT_Protector, new Object[0]));
                    }
                    if (c5902M56480.f20206 != null) {
                        m1275(c5902M56480);
                        return C12802.m31751(EnumC21667.PAYLOAD_TOO_LARGE, C21576.m49059(R.string.MT_Protector, new Object[0]));
                    }
                    CharSequence charSequence = c5902M56480.f20207;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    return m1274(m1271(c14293M1272, c5902M56480), charSequence);
                } catch (C3090 e) {
                    e = e;
                    return C12802.m31751(EnumC21667.INTERNAL_ERROR, e.getMessage());
                } catch (C4866 e2) {
                    e = e2;
                    return C12802.m31751(EnumC21667.INTERNAL_ERROR, e.getMessage());
                } catch (Exception unused) {
                    return C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
            }
            enumC21668 = EnumC21667.BAD_REQUEST;
            strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else if (EnumC12716.PUT.equals(enumC12716M12226)) {
            try {
                C21007 c21007M1278 = m1278(c3767);
                if (TextUtils.isEmpty(c21007M1278.f67174)) {
                    enumC21668 = EnumC21667.BAD_REQUEST;
                    strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                } else if (c21007M1278.f67173 == null) {
                    enumC21668 = EnumC21667.BAD_REQUEST;
                    strM490510 = C21576.m49059(R.string.MT_Protector, TextBundle.TEXT_ENTRY);
                } else if (TextUtils.isEmpty(c21007M1278.f67172)) {
                    enumC21668 = EnumC21667.BAD_REQUEST;
                    strM490510 = C21576.m49059(R.string.MT_Protector, "lineBreak");
                } else if (TextUtils.isEmpty(c21007M1278.f67176)) {
                    enumC21668 = EnumC21667.BAD_REQUEST;
                    strM490510 = C21576.m49059(R.string.MT_Protector, "parametersToken");
                } else {
                    String str = c21007M1278.f67172;
                    if ("\n".equals(str) || "\r\n".equals(str) || "\r".equals(str)) {
                        String strM22373 = C8284.m22373(c21007M1278.f67174);
                        try {
                            C18023 c18023M1273 = m1273(c21007M1278.f67176);
                            if (strM22373.equals(c18023M1273.f59020)) {
                                if (c21007M1278.f67175) {
                                    if (c18023M1273.f59019.f74804 != 0 || (i = c21007M1278.f67171) < 0 || i >= C2448.f7865) {
                                        enumC21668 = EnumC21667.BAD_REQUEST;
                                        strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    } else {
                                        c18023M1273.f59019.f74803 = c21007M1278.f67171;
                                    }
                                }
                                C14293 c14293M1273 = m1272(strM22373, false);
                                C18683 c18684 = c14293M1273.f45134;
                                if (c18684 != null) {
                                    return c18684;
                                }
                                try {
                                    C0681.m2963(new C9431(c14293M1273.f45136.mo8093()), c21007M1278.f67173, c21007M1278.f67172, c18023M1273.f59019);
                                    AbstractC22044 abstractC22044M35193 = C14584.m35193(strM22373, new String[0]);
                                    HashMap map = new HashMap();
                                    map.put("item", C7538.m20601(new C6004(abstractC22044M35193)));
                                    return C12802.m31750(map);
                                } catch (Exception unused2) {
                                    enumC21667 = EnumC21667.INTERNAL_ERROR;
                                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    return C12802.m31751(enumC21667, strM49059);
                                }
                            }
                            enumC21668 = EnumC21667.BAD_REQUEST;
                            strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException unused3) {
                            enumC21667 = EnumC21667.BAD_REQUEST;
                            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        }
                    } else {
                        enumC21668 = EnumC21667.BAD_REQUEST;
                        strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (RuntimeException | C12056 | C20261 unused4) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC21668 = EnumC21667.METHOD_NOT_ALLOWED;
            strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
        return C12802.m31751(enumC21668, strM490510);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m1271(C14293 c14293, C5902 c5902) {
        int i;
        ?? arrayList;
        HashMap map = new HashMap();
        String str = c14293.f45135;
        map.put(MotionUtils.EASING_TYPE_PATH, str);
        InterfaceC2386 interfaceC2386 = c14293.f45136;
        map.put("name", interfaceC2386.getName());
        map.put("lineBreak", c5902.f20204);
        C23056 c23056 = c5902.f20205;
        String strM8274 = "?";
        if (c23056 != null) {
            if (c23056.m51962()) {
                strM8274 = "AXML";
            } else if (c23056.m51963()) {
                strM8274 = "ABX";
            } else if (c23056.m51964()) {
                strM8274 = "Class";
            } else {
                int i2 = c23056.f74803;
                if (i2 >= 0 && i2 < C2448.f7865) {
                    strM8274 = C2448.m8274(i2);
                }
            }
        }
        map.put("textFormatName", strM8274);
        String str2 = "unknown";
        if (c23056 != null) {
            if (c23056.f74804 == 0) {
                str2 = TextBundle.TEXT_ENTRY;
            } else if (c23056.m51962()) {
                str2 = "axml";
            } else if (c23056.m51963()) {
                str2 = "abx";
            } else if (c23056.m51964()) {
                str2 = Name.LABEL;
            }
        }
        map.put("textFormatType", str2);
        if (c23056 == null || c23056.f74804 != 0 || (i = c23056.f74803) < 0 || i >= C2448.f7865) {
            i = -1;
        }
        map.put("charsetIndex", Integer.valueOf(i));
        if (c23056 == null || c23056.f74804 != 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(C2448.f7865);
            for (int i3 = 0; i3 < C2448.f7865; i3++) {
                HashMap map2 = new HashMap();
                map2.put("index", Integer.valueOf(i3));
                map2.put("name", C2448.m8274(i3));
                arrayList.add(map2);
            }
        }
        map.put("availableCharsets", arrayList);
        C6178 c6178 = new C6178();
        c6178.writeInt(1297373268);
        c6178.writeInt(1);
        c6178.m17800(str);
        c23056.m51961(c6178);
        byte[] bArrM17799 = c6178.m17799();
        map.put("parametersToken", Base64.encodeToString(bArrM17799, 11) + "." + Base64.encodeToString(m1277(bArrM17799), 11));
        map.put("size", Long.valueOf(interfaceC2386.getSize()));
        map.put("time", C22482.m50718(interfaceC2386.getTime()));
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m1274(HashMap map, CharSequence charSequence) {
        byte[] bytes = C21203.m48361((Map) map).toString().getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = C12669.m31437(bytes.length, "\n", new StringBuilder("MTTEXTREAD/1\n")).getBytes(StandardCharsets.US_ASCII);
        int length = bytes2.length + bytes.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        System.arraycopy(bytes, 0, bArr, bytes2.length, bytes.length);
        return AbstractC1530.m5421(EnumC21667.OK, "application/vnd.mt.text-file+raw; charset=UTF-8", new C3853(bArr, charSequence), ((long) length) + ((long) C21443.m48759(charSequence)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14293 m1272(String str, boolean z) {
        String strM22373 = C8284.m22373(str);
        C6004 c6004M1142 = C0080.m1142(strM22373);
        if (c6004M1142 == null || !c6004M1142.mo8093().mo2934()) {
            return C14293.m34701(strM22373, C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0])));
        }
        if (c6004M1142.isDirectory()) {
            return C14293.m34701(strM22373, C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0])));
        }
        if (z && c6004M1142.getSize() > 5242880) {
            return C14293.m34701(strM22373, C12802.m31751(EnumC21667.PAYLOAD_TOO_LARGE, C21576.m49059(R.string.MT_Protector, new Object[0])));
        }
        return C14293.m34700(strM22373, c6004M1142);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1275(C5902 c5902) {
        ArrayList arrayList = c5902.f20206;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC22044) it.next()).mo4296();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21007 m1278(C3767 c3767) {
        String strM12232;
        C21007 c21007 = new C21007();
        c21007.f67174 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
        if (c3767.m12229()) {
            strM12232 = c3767.m12232();
        } else {
            if (C23991.m53548(c3767)) {
                throw new IllegalArgumentException("Transfer-Encoding is not supported");
            }
            strM12232 = C23991.m53542(c3767, C23991.m53545(c3767)).f20820;
        }
        c21007.f67173 = strM12232;
        c21007.f67172 = C23991.m53547(c3767, "lineBreak");
        c21007.f67176 = C23991.m53541(c3767, "X-MT-Text-Parameters-Token");
        String strM53547 = C23991.m53547(c3767, "charsetIndex");
        if (TextUtils.isEmpty(strM53547)) {
            return c21007;
        }
        c21007.f67175 = true;
        try {
            c21007.f67171 = Integer.parseInt(strM53547);
            return c21007;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("charsetIndex is invalid", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18023 m1273(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(46);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid token");
        }
        byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
        if (!MessageDigest.isEqual(m1277(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
            throw new IllegalArgumentException("Invalid token signature");
        }
        C20348 c20348M46740 = C20348.m46740(bArrDecode);
        if (c20348M46740.readInt() != 1297373268 || c20348M46740.readInt() != 1) {
            throw new IllegalArgumentException("Invalid token version");
        }
        String strM46758 = c20348M46740.m46758();
        C23056 c23056 = new C23056(c20348M46740);
        if (c20348M46740.available() != 0) {
            throw new IllegalArgumentException("Unexpected token tail");
        }
        return new C18023(strM46758, c23056);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m1276() {
        synchronized (f1077) {
            SharedPreferences sharedPreferences = C21576.m49084().getSharedPreferences("remote_text", 0);
            String string = sharedPreferences.getString("parameters_hmac_key", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 11);
                    if (bArrDecode.length == 32) {
                        return bArrDecode;
                    }
                } catch (RuntimeException unused) {
                }
            }
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            sharedPreferences.edit().putString("parameters_hmac_key", Base64.encodeToString(bArr, 11)).commit();
            return bArr;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m1277(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(m1276(), "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
