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

/* JADX INFO: renamed from: l.ᩴۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19711 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12252 f63450;

    public C19711(C12802 c12802, C12252 c12252) {
        this.f63450 = c12252;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18683 m45403(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        EnumC12716 enumC12716M12226 = c3767.m12226();
        boolean zEquals = EnumC12716.POST.equals(enumC12716M12226);
        C12252 c12252 = this.f63450;
        if (zEquals) {
            try {
                C22695 c22695M45399 = m45399(c3767);
                String strM22375 = C8284.m22375(c22695M45399.f73678);
                if (TextUtils.isEmpty(strM22375)) {
                    enumC21667 = EnumC21667.BAD_REQUEST;
                    strM49059 = C21576.m49059(R.string.MT_Protector, "targetPath");
                } else {
                    List list = c22695M45399.f73677;
                    if (list == null || list.isEmpty()) {
                        enumC21667 = EnumC21667.BAD_REQUEST;
                        strM49059 = C21576.m49059(R.string.MT_Protector, "entries");
                    } else {
                        try {
                            LinkedHashMap linkedHashMapM30625 = c12252.m30625(c12252.m30619(strM22375, list));
                            if (linkedHashMapM30625 != null) {
                                return C12802.m31750(linkedHashMapM30625);
                            }
                            enumC21667 = EnumC21667.INTERNAL_ERROR;
                            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                        } catch (RuntimeException e) {
                            EnumC21667 enumC21668 = EnumC21667.CONFLICT;
                            String message = e.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = C21576.m49088(R.string.MT_Protector);
                            }
                            return C12802.m31751(enumC21668, message);
                        }
                    }
                }
            } catch (IOException | C0784 | C14489 unused) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
        } else if (EnumC12716.GET.equals(enumC12716M12226)) {
            String strM53547 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53547)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM30626 = c12252.m30625(strM53547);
                if (linkedHashMapM30626 != null) {
                    return C12802.m31750(linkedHashMapM30626);
                }
                enumC21667 = EnumC21667.NOT_FOUND;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC12716.PUT.equals(enumC12716M12226)) {
            try {
                C10760 c10760M45400 = m45400(c3767);
                if (TextUtils.isEmpty(c10760M45400.f34164)) {
                    enumC21667 = EnumC21667.BAD_REQUEST;
                    strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
                } else if (TextUtils.isEmpty(c10760M45400.f34163)) {
                    enumC21667 = EnumC21667.BAD_REQUEST;
                    strM49059 = C21576.m49059(R.string.MT_Protector, "conflictId");
                } else {
                    String str = c10760M45400.f34162;
                    if (!TextUtils.equals(str, "replace") && !TextUtils.equals(str, RadialViewGroup.SKIP_TAG) && !TextUtils.equals(str, "keep_both")) {
                        enumC21667 = EnumC21667.BAD_REQUEST;
                        strM49059 = C21576.m49059(R.string.MT_Protector, "action");
                    } else if (c12252.m30625(c10760M45400.f34164) == null) {
                        enumC21667 = EnumC21667.NOT_FOUND;
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                    } else {
                        this.f63450.m30623(c10760M45400.f34164, c10760M45400.f34163, c10760M45400.f34162, c10760M45400.f34165, c10760M45400.f34166);
                        LinkedHashMap linkedHashMapM30627 = c12252.m30625(c10760M45400.f34164);
                        if (linkedHashMapM30627 != null) {
                            return C12802.m31750(linkedHashMapM30627);
                        }
                        enumC21667 = EnumC21667.NOT_FOUND;
                        strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                    }
                }
            } catch (IOException | C0784 | C14489 unused2) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else if (EnumC12716.DELETE.equals(enumC12716M12226)) {
            String strM53548 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53548)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else if (c12252.m30626(strM53548)) {
                LinkedHashMap linkedHashMapM30628 = c12252.m30625(strM53548);
                if (linkedHashMapM30628 != null) {
                    return C12802.m31750(linkedHashMapM30628);
                }
                enumC21667 = EnumC21667.NOT_FOUND;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            } else {
                enumC21667 = EnumC21667.NOT_FOUND;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
        return C12802.m31751(enumC21667, strM49059);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18683 m45405(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else {
            String strM53547 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53547)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else {
                try {
                    LinkedHashMap linkedHashMapM30624 = this.f63450.m30624(strM53547);
                    return linkedHashMapM30624 == null ? C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM30624);
                } catch (IOException e) {
                    return m45398(strM53547, e);
                }
            }
        }
        return C12802.m31751(enumC21667, strM49059);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m45401(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        if (EnumC12716.POST.equals(c3767.m12226())) {
            String strM53547 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53547)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else {
                String strM45397 = m45397(C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(strM45397)) {
                    enumC21667 = EnumC21667.BAD_REQUEST;
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                } else {
                    LinkedHashMap linkedHashMapM30621 = this.f63450.m30621(strM53547, strM45397);
                    if (linkedHashMapM30621 != null) {
                        return C12802.m31750(linkedHashMapM30621);
                    }
                    enumC21667 = EnumC21667.NOT_FOUND;
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                }
            }
        } else {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
        return C12802.m31751(enumC21667, strM49059);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18683 m45402(C3767 c3767) throws Throwable {
        C18683 c18683M31751;
        EnumC21667 enumC21667;
        String strM49059;
        if (EnumC12716.POST.equals(c3767.m12226())) {
            String strM53547 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53547)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else {
                String strM45397 = m45397(C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH));
                if (!TextUtils.isEmpty(strM45397)) {
                    String strM53548 = C23991.m53547(c3767, "armToken");
                    if (TextUtils.isEmpty(strM53548)) {
                        enumC21667 = EnumC21667.BAD_REQUEST;
                        strM49059 = C21576.m49059(R.string.MT_Protector, "armToken");
                    } else {
                        try {
                            try {
                                LinkedHashMap linkedHashMapM30622 = this.f63450.m30622(strM53547, strM45397, strM53548, C23991.m53545(c3767), c3767.m12227());
                                if (linkedHashMapM30622 == null) {
                                    C18683 c18683M31752 = C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
                                    c18683M31752.m43438();
                                    return c18683M31752;
                                }
                                C18683 c18683M31750 = C12802.m31750(linkedHashMapM30622);
                                c18683M31750.m43438();
                                return c18683M31750;
                            } catch (IOException e) {
                                c18683M31751 = m45398(strM53547, e);
                            } catch (C16727 e2) {
                                c18683M31751 = C12802.m31751(EnumC21667.BAD_REQUEST, e2.getMessage());
                            }
                        } catch (C20261 e3) {
                            c18683M31751 = C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(e3.f65065, e3.f65064));
                        }
                    }
                    c18683M31751.m43438();
                    return c18683M31751;
                }
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
        c18683M31751 = C12802.m31751(enumC21667, strM49059);
        c18683M31751.m43438();
        return c18683M31751;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m45404(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else {
            String strM53547 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53547)) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, "taskId");
            } else {
                LinkedHashMap linkedHashMapM30620 = this.f63450.m30620(strM53547);
                if (linkedHashMapM30620 == null) {
                    enumC21667 = EnumC21667.NOT_FOUND;
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                } else {
                    return C12802.m31750(linkedHashMapM30620);
                }
            }
        }
        return C12802.m31751(enumC21667, strM49059);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C22695 m45399(C3767 c3767) {
        ArrayList arrayList;
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C22695 c22695 = new C22695();
        c22695.f73678 = C21203.m48367(jSONObjectM48362, "targetPath");
        try {
            JSONArray jSONArray = jSONObjectM48362.getJSONArray("entries");
            if (jSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C23441 c23441 = new C23441();
                        c23441.f75874 = C21203.m48367(jSONObject, MotionUtils.EASING_TYPE_PATH);
                        c23441.f75876 = C21203.m48367(jSONObject, "type");
                        c23441.f75877 = C21203.m48368(jSONObject, "size");
                        c23441.f75875 = C21203.m48368(jSONObject, "time");
                        c23441.f75878 = C21203.m48366(jSONObject, "topLevel");
                        arrayList2.add(c23441);
                    } catch (RuntimeException e) {
                        throw C21203.m48365(e);
                    }
                }
                arrayList = arrayList2;
            }
            c22695.f73677 = arrayList;
            return c22695;
        } catch (RuntimeException e2) {
            throw C21203.m48365(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C10760 m45400(C3767 c3767) {
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C10760 c10760 = new C10760();
        c10760.f34164 = C21203.m48367(jSONObjectM48362, "taskId");
        c10760.f34163 = C21203.m48367(jSONObjectM48362, "conflictId");
        c10760.f34162 = C21203.m48367(jSONObjectM48362, "action");
        c10760.f34165 = C21203.m48366(jSONObjectM48362, "applyAll");
        c10760.f34166 = C21203.m48366(jSONObjectM48362, "moveToRecycleBin");
        return c10760;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45397(String str) {
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
            strReplace = C1402.m5124(1, 0, strReplace);
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
    private C18683 m45398(String str, IOException iOException) {
        LinkedHashMap linkedHashMapM30625 = this.f63450.m30625(str);
        if (linkedHashMapM30625 != null && Boolean.TRUE.equals(linkedHashMapM30625.get("done"))) {
            return C12802.m31750(linkedHashMapM30625);
        }
        EnumC21667 enumC21667 = EnumC21667.CONFLICT;
        String message = iOException.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = C21576.m49088(R.string.MT_Protector);
        }
        return C12802.m31751(enumC21667, message);
    }
}
