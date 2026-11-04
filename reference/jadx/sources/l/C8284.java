package l;

import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۠֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7BP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21949 f27242;

    public C8284(C12802 c12802, C21949 c21949) {
        this.f27242 = c21949;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m22377(C3767 c3767) {
        EnumC21667 enumC21667;
        String strM49059;
        EnumC12716 enumC12716M12226 = c3767.m12226();
        boolean zEquals = EnumC12716.POST.equals(enumC12716M12226);
        C21949 c21949 = this.f27242;
        if (!zEquals) {
            if (EnumC12716.GET.equals(enumC12716M12226)) {
                String strM53547 = C23991.m53547(c3767, "taskId");
                if (TextUtils.isEmpty(strM53547)) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "taskId"));
                }
                LinkedHashMap linkedHashMapM49673 = c21949.m49673(strM53547);
                return linkedHashMapM49673 == null ? C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM49673);
            }
            if (!EnumC12716.PUT.equals(enumC12716M12226)) {
                if (!EnumC12716.DELETE.equals(enumC12716M12226)) {
                    return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                String strM53548 = C23991.m53547(c3767, "taskId");
                if (TextUtils.isEmpty(strM53548)) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "taskId"));
                }
                if (!c21949.m49672(strM53548)) {
                    return C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM49674 = c21949.m49673(strM53548);
                return linkedHashMapM49674 == null ? C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM49674);
            }
            try {
                C9029 c9029M22376 = m22376(c3767);
                if (TextUtils.isEmpty(c9029M22376.f29387)) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "taskId"));
                }
                if (TextUtils.isEmpty(c9029M22376.f29386)) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "conflictId"));
                }
                if (C25154.m56064(c9029M22376.f29385) == -1) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "action"));
                }
                if (c21949.m49673(c9029M22376.f29387) == null) {
                    return C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                if (!this.f27242.m49671(c9029M22376.f29387, c9029M22376.f29386, c9029M22376.f29385, c9029M22376.f29388, c9029M22376.f29389)) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM49675 = c21949.m49673(c9029M22376.f29387);
                return linkedHashMapM49675 == null ? C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM49675);
            } catch (IOException | C0784 | C14489 unused) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
        }
        try {
            C2318 c2318M22374 = m22374(c3767);
            List list = c2318M22374.f7493;
            if (list == null || list.isEmpty()) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "paths"));
            }
            if (!"copy".equals(c2318M22374.f7491) && !"move".equals(c2318M22374.f7491) && !"delete".equals(c2318M22374.f7491)) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "type"));
            }
            if (!"delete".equals(c2318M22374.f7491) && TextUtils.isEmpty(c2318M22374.f7492)) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "targetPath"));
            }
            String str = "";
            if (!"delete".equals(c2318M22374.f7491)) {
                String str2 = c2318M22374.f7494;
                List list2 = c2318M22374.f7493;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    String str3 = "";
                    while (true) {
                        if (!it.hasNext()) {
                            String strM22375 = m22375(str2);
                            if (!TextUtils.isEmpty(strM22375)) {
                                if (!strM22375.equals(str3)) {
                                    break;
                                }
                                str = strM22375;
                                break;
                            }
                            str = str3;
                            break;
                        }
                        String strM22371 = m22371(m22373((String) it.next()));
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.equals(strM22371)) {
                                break;
                            }
                        } else {
                            str3 = strM22371;
                        }
                    }
                }
            }
            if (!"delete".equals(c2318M22374.f7491) && TextUtils.isEmpty(str)) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "sourcePath"));
            }
            ArrayList<InterfaceC2386> arrayList = new ArrayList(c2318M22374.f7493.size());
            Iterator it2 = c2318M22374.f7493.iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC2386 interfaceC2386M20843 = C11969.f38536.m20843((String) it2.next());
                    if (!"delete".equals(c2318M22374.f7491) && !str.equals(m22375(((C13352) interfaceC2386M20843).getParent()))) {
                        return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
                    }
                    arrayList.add(interfaceC2386M20843);
                } catch (IOException unused2) {
                    enumC21667 = EnumC21667.NOT_FOUND;
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                    return C12802.m31751(enumC21667, strM49059);
                }
            }
            if ("delete".equals(c2318M22374.f7491)) {
                if (c2318M22374.f7489) {
                    for (InterfaceC2386 interfaceC2386 : arrayList) {
                        if (!m22372(interfaceC2386.mo8093())) {
                            return C12802.m31751(EnumC21667.CONFLICT, C21576.m49059(R.string.MT_Protector, interfaceC2386.getName()));
                        }
                    }
                }
                String strM49665 = c21949.m49665(c2318M22374.f7491);
                int i = C13678.f43415;
                C8458 c8458 = new C8458(C11727.class);
                c8458.m22722("ARG_PATHS", (String[]) c2318M22374.f7493.toArray(new String[0]));
                c8458.m22719("deleteFrom", C21576.m49088(R.string.MT_Protector));
                c8458.m22720("recycle", c2318M22374.f7489);
                c8458.m22720("speedMode", false);
                c8458.m22715(c2318M22374.f7493.size(), "minTotal");
                c8458.m22719("remoteTaskId", strM49665);
                c21949.m49666(c8458.m22729(), strM49665);
                LinkedHashMap linkedHashMapM49676 = c21949.m49673(strM49665);
                return linkedHashMapM49676 == null ? C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM49676);
            }
            String strM22376 = m22375(c2318M22374.f7492);
            if ("copy".equals(c2318M22374.f7491) && str.equals(strM22376)) {
                if (arrayList.size() != 1) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49088(R.string.MT_Protector));
                }
                if (TextUtils.isEmpty(c2318M22374.f7490)) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "replacedName"));
                }
                if (c2318M22374.f7490.contains("/") || c2318M22374.f7490.contains("\\")) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49088(R.string.MT_Protector));
                }
                if (C14584.m35193(C11293.m28549(strM22376, c2318M22374.f7490), new String[0]).mo2934()) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49088(R.string.MT_Protector));
                }
            }
            if ("move".equals(c2318M22374.f7491)) {
                if (str.equals(strM22376)) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49088(R.string.MT_Protector));
                }
                AbstractC22044 abstractC22044M35193 = C14584.m35193(strM22376, new String[0]);
                for (InterfaceC2386 interfaceC2387 : arrayList) {
                    if (interfaceC2387.isDirectory() && abstractC22044M35193.m49851(interfaceC2387.mo8093())) {
                        return C12802.m31751(EnumC21667.CONFLICT, C21576.m49059(R.string.MT_Protector, interfaceC2387.getName()));
                    }
                }
            }
            String strM49666 = c21949.m49665(c2318M22374.f7491);
            Class cls = "copy".equals(c2318M22374.f7491) ? C5762.class : C16948.class;
            int i2 = C13678.f43415;
            C8458 c8459 = new C8458(cls);
            c8459.m22722("ARG_PATHS", (String[]) c2318M22374.f7493.toArray(new String[0]));
            c8459.m22719("sourcePath", str);
            c8459.m22719("targetPath", strM22376);
            c8459.m22719("remoteTaskId", strM49666);
            if (!TextUtils.isEmpty(c2318M22374.f7490)) {
                c8459.m22719("replacedName", c2318M22374.f7490);
            }
            c21949.m49666(c8459.m22729(), strM49666);
            LinkedHashMap linkedHashMapM49677 = c21949.m49673(strM49666);
            return linkedHashMapM49677 == null ? C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(R.string.MT_Protector, new Object[0])) : C12802.m31750(linkedHashMapM49677);
        } catch (IOException | C0784 | C14489 unused3) {
            enumC21667 = EnumC21667.BAD_REQUEST;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C2318 m22374(C3767 c3767) {
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C2318 c2318 = new C2318();
        c2318.f7493 = Collections.EMPTY_LIST;
        c2318.f7491 = C21203.m48367(jSONObjectM48362, "type");
        c2318.f7494 = C21203.m48367(jSONObjectM48362, "sourcePath");
        c2318.f7492 = C21203.m48367(jSONObjectM48362, "targetPath");
        c2318.f7490 = C21203.m48367(jSONObjectM48362, "replacedName");
        c2318.f7489 = C21203.m48366(jSONObjectM48362, "moveToRecycleBin");
        c2318.f7493 = C21203.m48364(jSONObjectM48362);
        return c2318;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9029 m22376(C3767 c3767) {
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C9029 c9029 = new C9029();
        c9029.f29387 = C21203.m48367(jSONObjectM48362, "taskId");
        c9029.f29386 = C21203.m48367(jSONObjectM48362, "conflictId");
        c9029.f29385 = C21203.m48367(jSONObjectM48362, "action");
        c9029.f29388 = C21203.m48366(jSONObjectM48362, "applyAll");
        c9029.f29389 = C21203.m48366(jSONObjectM48362, "moveToRecycleBin");
        return c9029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22372(AbstractC22044 abstractC22044) {
        return abstractC22044 != null && C19632.m45281() && abstractC22044.mo4292();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m22373(String str) {
        return TextUtils.isEmpty(str) ? "" : m22375(AbstractC7364.m20187(str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m22375(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM20187 = AbstractC7364.m20187(str);
        if ("/".equals(strM20187)) {
            return "/";
        }
        while (strM20187.length() > 1 && strM20187.endsWith("/")) {
            strM20187 = C1402.m5124(1, 0, strM20187);
        }
        return strM20187;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22371(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47)) <= 0) ? "/" : str.substring(0, iLastIndexOf);
    }
}
