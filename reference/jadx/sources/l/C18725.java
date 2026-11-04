package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩳ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77A */
/* JADX INFO: loaded from: classes4.dex */
public final class C18725 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m43545(C3767 c3767) {
        if (EnumC12716.GET.equals(c3767.m12226())) {
            String strM53547 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
            if (strM53547 != null && !strM53547.isEmpty()) {
                return C12802.m31750(m43542(AbstractC7364.m20187(strM53547)));
            }
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m43544(C3767 c3767) {
        JSONObject jSONObjectM48362;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        try {
            jSONObjectM48362 = C21203.m48362(c3767);
        } catch (IOException | RuntimeException | C0784 unused) {
            jSONObjectM48362 = null;
        }
        if (jSONObjectM48362 == null) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        if (m43543(jSONObjectM48362, MotionUtils.EASING_TYPE_PATH)) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, MotionUtils.EASING_TYPE_PATH));
        }
        if (m43543(jSONObjectM48362, "enabled")) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "enabled"));
        }
        try {
            JSONValue jSONValue = jSONObjectM48362.get(MotionUtils.EASING_TYPE_PATH);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("string required"));
            }
            String strAsString = jSONValue.asString();
            if (strAsString.isEmpty()) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
            String strM20187 = AbstractC7364.m20187(strAsString);
            JSONValue jSONValue2 = jSONObjectM48362.get("enabled");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            if (!jSONValue2.asBoolean()) {
                C17423.f56652.remove("local:" + strM20187);
                C17423.m40912();
                return C12802.m31750(m43542(strM20187));
            }
            if (m43543(jSONObjectM48362, e.s)) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, e.s));
            }
            if (m43543(jSONObjectM48362, "reverse")) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "reverse"));
            }
            try {
                JSONValue jSONValue3 = jSONObjectM48362.get(e.s);
                if (jSONValue3 == null || !jSONValue3.isString()) {
                    throw C21203.m48365((RuntimeException) new IllegalArgumentException("string required"));
                }
                String strAsString2 = jSONValue3.asString();
                JSONValue jSONValue4 = jSONObjectM48362.get("reverse");
                if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                    throw C21203.m48365((RuntimeException) new IllegalArgumentException("boolean required"));
                }
                try {
                    C17423.f56652.put(C25272.m56409("local:", strM20187), Integer.valueOf(C14118.m34281(C0826.m3317(strAsString2), jSONValue4.asBoolean())));
                    C17423.m40912();
                    return C12802.m31750(m43542(strM20187));
                } catch (RuntimeException unused2) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, e.s));
                }
            } catch (RuntimeException unused3) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
        } catch (RuntimeException unused4) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m43542(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C9774 c9774M3316 = C0826.m3316(str);
        linkedHashMap2.put("enabled", Boolean.valueOf(c9774M3316 != null));
        if (c9774M3316 == null) {
            c9774M3316 = new C9774(0, false);
        }
        int i = c9774M3316.f31510;
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
        linkedHashMap2.put("reverse", Boolean.valueOf(c9774M3316.f31511));
        linkedHashMap.put("folder", linkedHashMap2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43543(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }
}
