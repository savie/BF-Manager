package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۜ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6634 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m17995(C15530 c15530) {
        if (EnumC18351.GET.equals(c15530.m37142())) {
            String strM14444 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
            if (strM14444 != null && !strM14444.isEmpty()) {
                return C12610.m31383(m17992(AbstractC11462.m28608(strM14444)));
            }
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m17994(C15530 c15530) {
        JSONObject jSONObjectM32824;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM32824 = C13316.m32824(c15530);
        } catch (IOException | RuntimeException | C21173 unused) {
            jSONObjectM32824 = null;
        }
        if (jSONObjectM32824 == null) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        if (m17993(jSONObjectM32824, MotionUtils.EASING_TYPE_PATH)) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, MotionUtils.EASING_TYPE_PATH));
        }
        if (m17993(jSONObjectM32824, "enabled")) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "enabled"));
        }
        try {
            JSONValue jSONValue = jSONObjectM32824.get(MotionUtils.EASING_TYPE_PATH);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("string required"));
            }
            String strAsString = jSONValue.asString();
            if (strAsString.isEmpty()) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
            String strM28608 = AbstractC11462.m28608(strAsString);
            JSONValue jSONValue2 = jSONObjectM32824.get("enabled");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            if (!jSONValue2.asBoolean()) {
                C0674.f2833.remove("local:" + strM28608);
                C0674.m3028();
                return C12610.m31383(m17992(strM28608));
            }
            if (m17993(jSONObjectM32824, e.s)) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, e.s));
            }
            if (m17993(jSONObjectM32824, "reverse")) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "reverse"));
            }
            try {
                JSONValue jSONValue3 = jSONObjectM32824.get(e.s);
                if (jSONValue3 == null || !jSONValue3.isString()) {
                    throw C13316.m32827((RuntimeException) new IllegalArgumentException("string required"));
                }
                String strAsString2 = jSONValue3.asString();
                JSONValue jSONValue4 = jSONObjectM32824.get("reverse");
                if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                    throw C13316.m32827((RuntimeException) new IllegalArgumentException("boolean required"));
                }
                try {
                    C0674.f2833.put(C0252.m1693("local:", strM28608), Integer.valueOf(C3386.m10040(C15102.m36179(strAsString2), jSONValue4.asBoolean())));
                    C0674.m3028();
                    return C12610.m31383(m17992(strM28608));
                } catch (RuntimeException unused2) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, e.s));
                }
            } catch (RuntimeException unused3) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
        } catch (RuntimeException unused4) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m17992(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C22863 c22863M36178 = C15102.m36178(str);
        linkedHashMap2.put("enabled", Boolean.valueOf(c22863M36178 != null));
        if (c22863M36178 == null) {
            c22863M36178 = new C22863(0, false);
        }
        int i = c22863M36178.f74365;
        String str2 = "name";
        if (i != 0) {
            if (i == 1) {
                str2 = "date";
            } else if (i == 2) {
                str2 = "size";
            } else if (i == 3) {
                str2 = "type";
            }
        }
        linkedHashMap2.put(e.s, str2);
        linkedHashMap2.put("reverse", Boolean.valueOf(c22863M36178.f74366));
        linkedHashMap.put("folder", linkedHashMap2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17993(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }
}
