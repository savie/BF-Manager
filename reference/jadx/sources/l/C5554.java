package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۚ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3786 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5554 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7768 m15336(C15530 c15530) {
        if (EnumC18351.GET.equals(c15530.m37142())) {
            return C12610.m31383(m15334());
        }
        return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7768 m15338(C15530 c15530) {
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
        if (m15335(jSONObjectM32824, "showSystemHiddenFiles")) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "showSystemHiddenFiles"));
        }
        if (m15335(jSONObjectM32824, "showManuallyHiddenFiles")) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "showManuallyHiddenFiles"));
        }
        try {
            JSONValue jSONValue = jSONObjectM32824.get("showSystemHiddenFiles");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            JSONValue jSONValue2 = jSONObjectM32824.get("showManuallyHiddenFiles");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean2 = jSONValue2.asBoolean();
            if (C5383.m14951() != zAsBoolean) {
                C5383.m14953(zAsBoolean);
            }
            if (C5383.m14954() != zAsBoolean2) {
                C5383.m14947(zAsBoolean2);
            }
            return C12610.m31383(m15334());
        } catch (RuntimeException unused2) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m15337(C15530 c15530) {
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
        if (m15335(jSONObjectM32824, "paths")) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "paths"));
        }
        try {
            C5383.m14946(m15333(jSONObjectM32824.get("paths")));
            return C12610.m31383(m15334());
        } catch (RuntimeException unused2) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m15339(C15530 c15530) {
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
        if (m15335(jSONObjectM32824, TextBundle.TEXT_ENTRY)) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, TextBundle.TEXT_ENTRY));
        }
        try {
            JSONValue jSONValue = jSONObjectM32824.get(TextBundle.TEXT_ENTRY);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("string required"));
            }
            C5383.m14942(jSONValue.asString());
            return C12610.m31383(m15334());
        } catch (RuntimeException unused2) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m15334() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("showSystemHiddenFiles", Boolean.valueOf(C5383.m14951()));
        linkedHashMap.put("showManuallyHiddenFiles", Boolean.valueOf(C5383.m14954()));
        linkedHashMap.put("manuallyHiddenFilesText", C5383.m14943());
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15335(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15333(JSONValue jSONValue) {
        if (jSONValue == null || !jSONValue.isArray()) {
            throw C13316.m32827((RuntimeException) new IllegalArgumentException("array required"));
        }
        JSONArray jSONArrayAsArray = jSONValue.asArray();
        ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
        for (int i = 0; i < jSONArrayAsArray.size(); i++) {
            JSONValue jSONValue2 = jSONArrayAsArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("path string required"));
            }
            String strAsString = jSONValue2.asString();
            if (strAsString.isEmpty() || !strAsString.startsWith("/")) {
                throw C13316.m32827((RuntimeException) new IllegalArgumentException("absolute path required"));
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }
}
