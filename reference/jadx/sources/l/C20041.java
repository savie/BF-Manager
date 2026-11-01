package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20041 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14022 f64179;

    public C20041(C12610 c12610, C14022 c14022) {
        this.f64179 = c14022;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7768 m45407(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        EnumC18351 enumC18351M37142 = c15530.m37142();
        boolean zEquals = EnumC18351.POST.equals(enumC18351M37142);
        C14022 c14022 = this.f64179;
        if (zEquals) {
            try {
                C15808 c15808M45401 = m45401(c15530);
                String strM43080 = C18629.m43080(c15808M45401.f51168);
                if (TextUtils.isEmpty(strM43080)) {
                    enumC10591 = EnumC10591.BAD_REQUEST;
                    strM39264 = C16737.m39264(R.string.MT_Protector, "targetPath");
                } else {
                    List list = c15808M45401.f51167;
                    if (list == null || list.isEmpty()) {
                        enumC10591 = EnumC10591.BAD_REQUEST;
                        strM39264 = C16737.m39264(R.string.MT_Protector, "entries");
                    } else {
                        try {
                            LinkedHashMap linkedHashMapM33940 = c14022.m33940(c14022.m33934(strM43080, list));
                            if (linkedHashMapM33940 != null) {
                                return C12610.m31383(linkedHashMapM33940);
                            }
                            enumC10591 = EnumC10591.INTERNAL_ERROR;
                            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException e) {
                            EnumC10591 enumC10592 = EnumC10591.CONFLICT;
                            String message = e.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = C16737.m39288(R.string.MT_Protector);
                            }
                            return C12610.m31384(enumC10592, message);
                        }
                    }
                }
            } catch (IOException | C1320 | C21173 unused) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
        } else if (EnumC18351.GET.equals(enumC18351M37142)) {
            String strM14444 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14444)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM33941 = c14022.m33940(strM14444);
                if (linkedHashMapM33941 != null) {
                    return C12610.m31383(linkedHashMapM33941);
                }
                enumC10591 = EnumC10591.NOT_FOUND;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC18351.PUT.equals(enumC18351M37142)) {
            try {
                C20746 c20746M45404 = m45404(c15530);
                if (TextUtils.isEmpty(c20746M45404.f67501)) {
                    enumC10591 = EnumC10591.BAD_REQUEST;
                    strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
                } else if (TextUtils.isEmpty(c20746M45404.f67502)) {
                    enumC10591 = EnumC10591.BAD_REQUEST;
                    strM39264 = C16737.m39264(R.string.MT_Protector, "conflictId");
                } else {
                    String str = c20746M45404.f67500;
                    if (!TextUtils.equals(str, "replace") && !TextUtils.equals(str, RadialViewGroup.SKIP_TAG) && !TextUtils.equals(str, "keep_both")) {
                        enumC10591 = EnumC10591.BAD_REQUEST;
                        strM39264 = C16737.m39264(R.string.MT_Protector, "action");
                    } else if (c14022.m33940(c20746M45404.f67501) == null) {
                        enumC10591 = EnumC10591.NOT_FOUND;
                        strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                    } else {
                        this.f64179.m33938(c20746M45404.f67501, c20746M45404.f67502, c20746M45404.f67500, c20746M45404.f67503, c20746M45404.f67499);
                        LinkedHashMap linkedHashMapM33942 = c14022.m33940(c20746M45404.f67501);
                        if (linkedHashMapM33942 != null) {
                            return C12610.m31383(linkedHashMapM33942);
                        }
                        enumC10591 = EnumC10591.NOT_FOUND;
                        strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (IOException | C1320 | C21173 unused2) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC18351.DELETE.equals(enumC18351M37142)) {
            String strM14445 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14445)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else if (c14022.m33933(strM14445)) {
                LinkedHashMap linkedHashMapM33943 = c14022.m33940(strM14445);
                if (linkedHashMapM33943 != null) {
                    return C12610.m31383(linkedHashMapM33943);
                }
                enumC10591 = EnumC10591.NOT_FOUND;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            } else {
                enumC10591 = EnumC10591.NOT_FOUND;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        }
        return C12610.m31384(enumC10591, strM39264);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7768 m45405(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        } else {
            String strM14444 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14444)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else {
                try {
                    LinkedHashMap linkedHashMapM33939 = this.f64179.m33939(strM14444);
                    return linkedHashMapM33939 == null ? C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM33939);
                } catch (IOException e) {
                    return m45403(strM14444, e);
                }
            }
        }
        return C12610.m31384(enumC10591, strM39264);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m45406(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        if (EnumC18351.POST.equals(c15530.m37142())) {
            String strM14444 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14444)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else {
                String strM45402 = m45402(C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(strM45402)) {
                    enumC10591 = EnumC10591.BAD_REQUEST;
                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                } else {
                    LinkedHashMap linkedHashMapM33936 = this.f64179.m33936(strM14444, strM45402);
                    if (linkedHashMapM33936 != null) {
                        return C12610.m31383(linkedHashMapM33936);
                    }
                    enumC10591 = EnumC10591.NOT_FOUND;
                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                }
            }
        } else {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        }
        return C12610.m31384(enumC10591, strM39264);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7768 m45408(C15530 c15530) throws Throwable {
        C7768 c7768M31384;
        EnumC10591 enumC10591;
        String strM39264;
        if (EnumC18351.POST.equals(c15530.m37142())) {
            String strM14444 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14444)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else {
                String strM45402 = m45402(C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH));
                if (!TextUtils.isEmpty(strM45402)) {
                    String strM14445 = C5244.m14444(c15530, "armToken");
                    if (TextUtils.isEmpty(strM14445)) {
                        enumC10591 = EnumC10591.BAD_REQUEST;
                        strM39264 = C16737.m39264(R.string.MT_Protector, "armToken");
                    } else {
                        try {
                            try {
                                LinkedHashMap linkedHashMapM33937 = this.f64179.m33937(strM14444, strM45402, strM14445, C5244.m14446(c15530), c15530.m37136());
                                if (linkedHashMapM33937 == null) {
                                    C7768 c7768M31385 = C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
                                    c7768M31385.m20446();
                                    return c7768M31385;
                                }
                                C7768 c7768M31383 = C12610.m31383(linkedHashMapM33937);
                                c7768M31383.m20446();
                                return c7768M31383;
                            } catch (IOException e) {
                                c7768M31384 = m45403(strM14444, e);
                            } catch (C23569 e2) {
                                c7768M31384 = C12610.m31384(EnumC10591.BAD_REQUEST, e2.getMessage());
                            }
                        } catch (C13712 e3) {
                            c7768M31384 = C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(e3.f45217, e3.f45216));
                        }
                    }
                    c7768M31384.m20446();
                    return c7768M31384;
                }
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        }
        c7768M31384 = C12610.m31384(enumC10591, strM39264);
        c7768M31384.m20446();
        return c7768M31384;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m45409(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        } else {
            String strM14444 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14444)) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM33935 = this.f64179.m33935(strM14444);
                if (linkedHashMapM33935 == null) {
                    enumC10591 = EnumC10591.NOT_FOUND;
                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                } else {
                    return C12610.m31383(linkedHashMapM33935);
                }
            }
        }
        return C12610.m31384(enumC10591, strM39264);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C15808 m45401(C15530 c15530) {
        ArrayList arrayList;
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C15808 c15808 = new C15808();
        c15808.f51168 = C13316.m32829(jSONObjectM32824, "targetPath");
        try {
            JSONArray jSONArray = jSONObjectM32824.getJSONArray("entries");
            if (jSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C9458 c9458 = new C9458();
                        c9458.f32009 = C13316.m32829(jSONObject, MotionUtils.EASING_TYPE_PATH);
                        c9458.f32010 = C13316.m32829(jSONObject, "type");
                        c9458.f32012 = C13316.m32830(jSONObject, "size");
                        c9458.f32011 = C13316.m32830(jSONObject, "time");
                        c9458.f32008 = C13316.m32828(jSONObject, "topLevel");
                        arrayList2.add(c9458);
                    } catch (RuntimeException e) {
                        throw C13316.m32827(e);
                    }
                }
                arrayList = arrayList2;
            }
            c15808.f51167 = arrayList;
            return c15808;
        } catch (RuntimeException e2) {
            throw C13316.m32827(e2);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C20746 m45404(C15530 c15530) {
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C20746 c20746 = new C20746();
        c20746.f67501 = C13316.m32829(jSONObjectM32824, "taskId");
        c20746.f67502 = C13316.m32829(jSONObjectM32824, "conflictId");
        c20746.f67500 = C13316.m32829(jSONObjectM32824, "action");
        c20746.f67503 = C13316.m32828(jSONObjectM32824, "applyAll");
        c20746.f67499 = C13316.m32828(jSONObjectM32824, "moveToRecycleBin");
        return c20746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45402(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = str.replace('\\', '/');
        while (strReplace.startsWith("./")) {
            strReplace = strReplace.substring(2);
        }
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        while (true) {
            if (!strReplace.endsWith("/") || strReplace.length() <= 1) {
                break;
            }
            strReplace = C20630.m46498(1, 0, strReplace);
        }
        if (TextUtils.isEmpty(strReplace) || ".".equals(strReplace)) {
            return "";
        }
        for (String str2 : strReplace.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                return "";
            }
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7768 m45403(String str, IOException iOException) {
        LinkedHashMap linkedHashMapM33940 = this.f64179.m33940(str);
        if (linkedHashMapM33940 != null && Boolean.TRUE.equals(linkedHashMapM33940.get("done"))) {
            return C12610.m31383(linkedHashMapM33940);
        }
        EnumC10591 enumC10591 = EnumC10591.CONFLICT;
        String message = iOException.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = C16737.m39288(R.string.MT_Protector);
        }
        return C12610.m31384(enumC10591, message);
    }
}
