package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩺ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3786 */
/* JADX INFO: loaded from: classes.dex */
public final class C24187 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18683 m54170(C3767 c3767) {
        if (EnumC12716.GET.equals(c3767.m12226())) {
            return C12802.m31750(m54165());
        }
        return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18683 m54168(C3767 c3767) {
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
        if (m54166(jSONObjectM48362, "showSystemHiddenFiles")) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "showSystemHiddenFiles"));
        }
        if (m54166(jSONObjectM48362, "showManuallyHiddenFiles")) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "showManuallyHiddenFiles"));
        }
        try {
            JSONValue jSONValue = jSONObjectM48362.get("showSystemHiddenFiles");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean = jSONValue.asBoolean();
            JSONValue jSONValue2 = jSONObjectM48362.get("showManuallyHiddenFiles");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean zAsBoolean2 = jSONValue2.asBoolean();
            if (C20174.m46411() != zAsBoolean) {
                C20174.m46414(zAsBoolean);
            }
            if (C20174.m46415() != zAsBoolean2) {
                C20174.m46408(zAsBoolean2);
            }
            return C12802.m31750(m54165());
        } catch (RuntimeException unused2) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m54167(C3767 c3767) {
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
        if (m54166(jSONObjectM48362, "paths")) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "paths"));
        }
        try {
            C20174.m46407(m54164(jSONObjectM48362.get("paths")));
            return C12802.m31750(m54165());
        } catch (RuntimeException unused2) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m54169(C3767 c3767) {
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
        if (m54166(jSONObjectM48362, TextBundle.TEXT_ENTRY)) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, TextBundle.TEXT_ENTRY));
        }
        try {
            JSONValue jSONValue = jSONObjectM48362.get(TextBundle.TEXT_ENTRY);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("string required"));
            }
            C20174.m46417(jSONValue.asString());
            return C12802.m31750(m54165());
        } catch (RuntimeException unused2) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m54165() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("showSystemHiddenFiles", Boolean.valueOf(C20174.m46411()));
        linkedHashMap.put("showManuallyHiddenFiles", Boolean.valueOf(C20174.m46415()));
        linkedHashMap.put("manuallyHiddenFilesText", C20174.m46404());
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m54166(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m54164(JSONValue jSONValue) {
        if (jSONValue == null || !jSONValue.isArray()) {
            throw C21203.m48365((RuntimeException) new IllegalArgumentException("array required"));
        }
        JSONArray jSONArrayAsArray = jSONValue.asArray();
        ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
        for (int i = 0; i < jSONArrayAsArray.size(); i++) {
            JSONValue jSONValue2 = jSONArrayAsArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("path string required"));
            }
            String strAsString = jSONValue2.asString();
            if (strAsString.isEmpty() || !strAsString.startsWith("/")) {
                throw C21203.m48365((RuntimeException) new IllegalArgumentException("absolute path required"));
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }
}
