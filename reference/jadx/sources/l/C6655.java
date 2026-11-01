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

/* JADX INFO: renamed from: l.ۜۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f22474 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m18037(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        EnumC10591 enumC10592;
        String strM39265;
        int i;
        EnumC18351 enumC18351M37142 = c15530.m37142();
        if (EnumC18351.GET.equals(enumC18351M37142)) {
            String strM14444 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
            if (!TextUtils.isEmpty(strM14444)) {
                C1010 c1010M18030 = m18030(strM14444, true);
                C7768 c7768 = c1010M18030.f4696;
                if (c7768 != null) {
                    return c7768;
                }
                try {
                    C13914 c13914M15088 = C5446.m15088(new C16881(c1010M18030.f4698.mo7989()), -1, new C14681());
                    if (c13914M15088 == null) {
                        return C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(R.string.MT_Protector, new Object[0]));
                    }
                    if (c13914M15088.f45834 != null) {
                        m18033(c13914M15088);
                        return C12610.m31384(EnumC10591.PAYLOAD_TOO_LARGE, C16737.m39264(R.string.MT_Protector, new Object[0]));
                    }
                    CharSequence charSequence = c13914M15088.f45831;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    return m18032(m18029(c1010M18030, c13914M15088), charSequence);
                } catch (C4987 e) {
                    e = e;
                    return C12610.m31384(EnumC10591.INTERNAL_ERROR, e.getMessage());
                } catch (C8142 e2) {
                    e = e2;
                    return C12610.m31384(EnumC10591.INTERNAL_ERROR, e.getMessage());
                } catch (Exception unused) {
                    return C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
            }
            enumC10592 = EnumC10591.BAD_REQUEST;
            strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        } else if (EnumC18351.PUT.equals(enumC18351M37142)) {
            try {
                C13006 c13006M18036 = m18036(c15530);
                if (TextUtils.isEmpty(c13006M18036.f43374)) {
                    enumC10592 = EnumC10591.BAD_REQUEST;
                    strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                } else if (c13006M18036.f43377 == null) {
                    enumC10592 = EnumC10591.BAD_REQUEST;
                    strM39265 = C16737.m39264(R.string.MT_Protector, TextBundle.TEXT_ENTRY);
                } else if (TextUtils.isEmpty(c13006M18036.f43375)) {
                    enumC10592 = EnumC10591.BAD_REQUEST;
                    strM39265 = C16737.m39264(R.string.MT_Protector, "lineBreak");
                } else if (TextUtils.isEmpty(c13006M18036.f43372)) {
                    enumC10592 = EnumC10591.BAD_REQUEST;
                    strM39265 = C16737.m39264(R.string.MT_Protector, "parametersToken");
                } else {
                    String str = c13006M18036.f43375;
                    if ("\n".equals(str) || "\r\n".equals(str) || "\r".equals(str)) {
                        String strM43078 = C18629.m43078(c13006M18036.f43374);
                        try {
                            C3832 c3832M18031 = m18031(c13006M18036.f43372);
                            if (strM43078.equals(c3832M18031.f14205)) {
                                if (c13006M18036.f43376) {
                                    if (c3832M18031.f14204.f7648 != 0 || (i = c13006M18036.f43373) < 0 || i >= C22037.f71434) {
                                        enumC10592 = EnumC10591.BAD_REQUEST;
                                        strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                    } else {
                                        c3832M18031.f14204.f7652 = c13006M18036.f43373;
                                    }
                                }
                                C1010 c1010M18031 = m18030(strM43078, false);
                                C7768 c7769 = c1010M18031.f4696;
                                if (c7769 != null) {
                                    return c7769;
                                }
                                try {
                                    C10386.m26280(new C16881(c1010M18031.f4698.mo7989()), c13006M18036.f43377, c13006M18036.f43375, c3832M18031.f14204);
                                    AbstractC20745 abstractC20745M15313 = C5553.m15313(strM43078, new String[0]);
                                    HashMap map = new HashMap();
                                    map.put("item", C3811.m11101(new C6794(abstractC20745M15313)));
                                    return C12610.m31383(map);
                                } catch (Exception unused2) {
                                    enumC10591 = EnumC10591.INTERNAL_ERROR;
                                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                                    return C12610.m31384(enumC10591, strM39264);
                                }
                            }
                            enumC10592 = EnumC10591.BAD_REQUEST;
                            strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException unused3) {
                            enumC10591 = EnumC10591.BAD_REQUEST;
                            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                        }
                    } else {
                        enumC10592 = EnumC10591.BAD_REQUEST;
                        strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (RuntimeException | C11595 | C13712 unused4) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC10592 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39265 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        }
        return C12610.m31384(enumC10592, strM39265);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m18029(C1010 c1010, C13914 c13914) {
        int i;
        ?? arrayList;
        HashMap map = new HashMap();
        String str = c1010.f4697;
        map.put(MotionUtils.EASING_TYPE_PATH, str);
        InterfaceC2557 interfaceC2557 = c1010.f4698;
        map.put("name", interfaceC2557.getName());
        map.put("lineBreak", c13914.f45832);
        C2063 c2063 = c13914.f45833;
        String strM48955 = "?";
        if (c2063 != null) {
            if (c2063.m6571()) {
                strM48955 = "AXML";
            } else if (c2063.m6572()) {
                strM48955 = "ABX";
            } else if (c2063.m6567()) {
                strM48955 = "Class";
            } else {
                int i2 = c2063.f7652;
                if (i2 >= 0 && i2 < C22037.f71434) {
                    strM48955 = C22037.m48955(i2);
                }
            }
        }
        map.put("textFormatName", strM48955);
        String str2 = "unknown";
        if (c2063 != null) {
            if (c2063.f7648 == 0) {
                str2 = TextBundle.TEXT_ENTRY;
            } else if (c2063.m6571()) {
                str2 = "axml";
            } else if (c2063.m6572()) {
                str2 = "abx";
            } else if (c2063.m6567()) {
                str2 = Name.LABEL;
            }
        }
        map.put("textFormatType", str2);
        if (c2063 == null || c2063.f7648 != 0 || (i = c2063.f7652) < 0 || i >= C22037.f71434) {
            i = -1;
        }
        map.put("charsetIndex", Integer.valueOf(i));
        if (c2063 == null || c2063.f7648 != 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(C22037.f71434);
            for (int i3 = 0; i3 < C22037.f71434; i3++) {
                HashMap map2 = new HashMap();
                map2.put("index", Integer.valueOf(i3));
                map2.put("name", C22037.m48955(i3));
                arrayList.add(map2);
            }
        }
        map.put("availableCharsets", arrayList);
        C11018 c11018 = new C11018();
        c11018.writeInt(1297373268);
        c11018.writeInt(1);
        c11018.m27786(str);
        c2063.m6570(c11018);
        byte[] bArrM27798 = c11018.m27798();
        map.put("parametersToken", Base64.encodeToString(bArrM27798, 11) + "." + Base64.encodeToString(m18035(bArrM27798), 11));
        map.put("size", Long.valueOf(interfaceC2557.getSize()));
        map.put("time", C5319.m14744(interfaceC2557.getTime()));
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m18032(HashMap map, CharSequence charSequence) {
        byte[] bytes = C13316.m32823((Map) map).toString().getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = C12441.m30911(bytes.length, "\n", new StringBuilder("MTTEXTREAD/1\n")).getBytes(StandardCharsets.US_ASCII);
        int length = bytes2.length + bytes.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        System.arraycopy(bytes, 0, bArr, bytes2.length, bytes.length);
        return AbstractC16940.m39638(EnumC10591.OK, "application/vnd.mt.text-file+raw; charset=UTF-8", new C22178(bArr, charSequence), ((long) length) + ((long) C23967.m52794(charSequence)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1010 m18030(String str, boolean z) {
        String strM43078 = C18629.m43078(str);
        C6794 c6794M32110 = C12985.m32110(strM43078);
        if (c6794M32110 == null || !c6794M32110.mo7989().mo33975()) {
            return C1010.m3836(strM43078, C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0])));
        }
        if (c6794M32110.isDirectory()) {
            return C1010.m3836(strM43078, C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0])));
        }
        if (z && c6794M32110.getSize() > 5242880) {
            return C1010.m3836(strM43078, C12610.m31384(EnumC10591.PAYLOAD_TOO_LARGE, C16737.m39264(R.string.MT_Protector, new Object[0])));
        }
        return C1010.m3835(strM43078, c6794M32110);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18033(C13914 c13914) {
        ArrayList arrayList = c13914.f45834;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC20745) it.next()).mo24647();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C13006 m18036(C15530 c15530) {
        String strM37138;
        C13006 c13006 = new C13006();
        c13006.f43374 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
        if (c15530.m37141()) {
            strM37138 = c15530.m37138();
        } else {
            if (C5244.m14445(c15530)) {
                throw new IllegalArgumentException("Transfer-Encoding is not supported");
            }
            strM37138 = C5244.m14440(c15530, C5244.m14446(c15530)).f9706;
        }
        c13006.f43377 = strM37138;
        c13006.f43375 = C5244.m14444(c15530, "lineBreak");
        c13006.f43372 = C5244.m14439(c15530, "X-MT-Text-Parameters-Token");
        String strM14444 = C5244.m14444(c15530, "charsetIndex");
        if (TextUtils.isEmpty(strM14444)) {
            return c13006;
        }
        c13006.f43376 = true;
        try {
            c13006.f43373 = Integer.parseInt(strM14444);
            return c13006;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("charsetIndex is invalid", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3832 m18031(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(46);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf >= str.length() - 1) {
            throw new IllegalArgumentException("Invalid token");
        }
        byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
        if (!MessageDigest.isEqual(m18035(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
            throw new IllegalArgumentException("Invalid token signature");
        }
        C17367 c17367M40441 = C17367.m40441(bArrDecode);
        if (c17367M40441.readInt() != 1297373268 || c17367M40441.readInt() != 1) {
            throw new IllegalArgumentException("Invalid token version");
        }
        String strM40458 = c17367M40441.m40458();
        C2063 c2063 = new C2063(c17367M40441);
        if (c17367M40441.available() != 0) {
            throw new IllegalArgumentException("Unexpected token tail");
        }
        return new C3832(strM40458, c2063);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m18034() {
        synchronized (f22474) {
            SharedPreferences sharedPreferences = C16737.m39277().getSharedPreferences("remote_text", 0);
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
    public static byte[] m18035(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(m18034(), "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
