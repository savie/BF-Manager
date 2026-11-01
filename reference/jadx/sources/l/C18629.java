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

/* JADX INFO: renamed from: l.ᩴ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7BP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18629 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7340 f60396;

    public C18629(C12610 c12610, C7340 c7340) {
        this.f60396 = c7340;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m43082(C15530 c15530) {
        EnumC10591 enumC10591;
        String strM39264;
        EnumC18351 enumC18351M37142 = c15530.m37142();
        boolean zEquals = EnumC18351.POST.equals(enumC18351M37142);
        C7340 c7340 = this.f60396;
        if (!zEquals) {
            if (EnumC18351.GET.equals(enumC18351M37142)) {
                String strM14444 = C5244.m14444(c15530, "taskId");
                if (TextUtils.isEmpty(strM14444)) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "taskId"));
                }
                LinkedHashMap linkedHashMapM19620 = c7340.m19620(strM14444);
                return linkedHashMapM19620 == null ? C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM19620);
            }
            if (!EnumC18351.PUT.equals(enumC18351M37142)) {
                if (!EnumC18351.DELETE.equals(enumC18351M37142)) {
                    return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                String strM14445 = C5244.m14444(c15530, "taskId");
                if (TextUtils.isEmpty(strM14445)) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "taskId"));
                }
                if (!c7340.m19619(strM14445)) {
                    return C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM19621 = c7340.m19620(strM14445);
                return linkedHashMapM19621 == null ? C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM19621);
            }
            try {
                C21451 c21451M43081 = m43081(c15530);
                if (TextUtils.isEmpty(c21451M43081.f69734)) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "taskId"));
                }
                if (TextUtils.isEmpty(c21451M43081.f69735)) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "conflictId"));
                }
                if (C18727.m43263(c21451M43081.f69733) == -1) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "action"));
                }
                if (c7340.m19620(c21451M43081.f69734) == null) {
                    return C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                if (!this.f60396.m19618(c21451M43081.f69734, c21451M43081.f69735, c21451M43081.f69733, c21451M43081.f69736, c21451M43081.f69732)) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM19622 = c7340.m19620(c21451M43081.f69734);
                return linkedHashMapM19622 == null ? C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM19622);
            } catch (IOException | C1320 | C21173 unused) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
        }
        try {
            C17923 c17923M43079 = m43079(c15530);
            List list = c17923M43079.f56924;
            if (list == null || list.isEmpty()) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "paths"));
            }
            if (!"copy".equals(c17923M43079.f56925) && !"move".equals(c17923M43079.f56925) && !"delete".equals(c17923M43079.f56925)) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "type"));
            }
            if (!"delete".equals(c17923M43079.f56925) && TextUtils.isEmpty(c17923M43079.f56922)) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "targetPath"));
            }
            String str = "";
            if (!"delete".equals(c17923M43079.f56925)) {
                String str2 = c17923M43079.f56920;
                List list2 = c17923M43079.f56924;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    String str3 = "";
                    while (true) {
                        if (!it.hasNext()) {
                            String strM43080 = m43080(str2);
                            if (!TextUtils.isEmpty(strM43080)) {
                                if (!strM43080.equals(str3)) {
                                    break;
                                }
                                str = strM43080;
                                break;
                            }
                            str = str3;
                            break;
                        }
                        String strM43076 = m43076(m43078((String) it.next()));
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.equals(strM43076)) {
                                break;
                            }
                        } else {
                            str3 = strM43076;
                        }
                    }
                }
            }
            if (!"delete".equals(c17923M43079.f56925) && TextUtils.isEmpty(str)) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "sourcePath"));
            }
            ArrayList<InterfaceC2557> arrayList = new ArrayList(c17923M43079.f56924.size());
            Iterator it2 = c17923M43079.f56924.iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC2557 interfaceC2557M24620 = C21611.f70098.m24620((String) it2.next());
                    if (!"delete".equals(c17923M43079.f56925) && !str.equals(m43080(((C15404) interfaceC2557M24620).getParent()))) {
                        return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
                    }
                    arrayList.add(interfaceC2557M24620);
                } catch (IOException unused2) {
                    enumC10591 = EnumC10591.NOT_FOUND;
                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                    return C12610.m31384(enumC10591, strM39264);
                }
            }
            if ("delete".equals(c17923M43079.f56925)) {
                if (c17923M43079.f56921) {
                    for (InterfaceC2557 interfaceC2557 : arrayList) {
                        if (!m43077(interfaceC2557.mo7989())) {
                            return C12610.m31384(EnumC10591.CONFLICT, C16737.m39264(R.string.MT_Protector, interfaceC2557.getName()));
                        }
                    }
                }
                String strM19612 = c7340.m19612(c17923M43079.f56925);
                int i = C20725.f67443;
                C10142 c10142 = new C10142(C18021.class);
                c10142.m25771("ARG_PATHS", (String[]) c17923M43079.f56924.toArray(new String[0]));
                c10142.m25768("deleteFrom", C16737.m39288(R.string.MT_Protector));
                c10142.m25769("recycle", c17923M43079.f56921);
                c10142.m25769("speedMode", false);
                c10142.m25764(c17923M43079.f56924.size(), "minTotal");
                c10142.m25768("remoteTaskId", strM19612);
                c7340.m19613(c10142.m25778(), strM19612);
                LinkedHashMap linkedHashMapM19623 = c7340.m19620(strM19612);
                return linkedHashMapM19623 == null ? C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM19623);
            }
            String strM43081 = m43080(c17923M43079.f56922);
            if ("copy".equals(c17923M43079.f56925) && str.equals(strM43081)) {
                if (arrayList.size() != 1) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39288(R.string.MT_Protector));
                }
                if (TextUtils.isEmpty(c17923M43079.f56923)) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "replacedName"));
                }
                if (c17923M43079.f56923.contains("/") || c17923M43079.f56923.contains("\\")) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39288(R.string.MT_Protector));
                }
                if (C5553.m15313(C6730.m18162(strM43081, c17923M43079.f56923), new String[0]).mo33975()) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39288(R.string.MT_Protector));
                }
            }
            if ("move".equals(c17923M43079.f56925)) {
                if (str.equals(strM43081)) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39288(R.string.MT_Protector));
                }
                AbstractC20745 abstractC20745M15313 = C5553.m15313(strM43081, new String[0]);
                for (InterfaceC2557 interfaceC2558 : arrayList) {
                    if (interfaceC2558.isDirectory() && abstractC20745M15313.m46705(interfaceC2558.mo7989())) {
                        return C12610.m31384(EnumC10591.CONFLICT, C16737.m39264(R.string.MT_Protector, interfaceC2558.getName()));
                    }
                }
            }
            String strM19613 = c7340.m19612(c17923M43079.f56925);
            Class cls = "copy".equals(c17923M43079.f56925) ? C22961.class : C8144.class;
            int i2 = C20725.f67443;
            C10142 c10143 = new C10142(cls);
            c10143.m25771("ARG_PATHS", (String[]) c17923M43079.f56924.toArray(new String[0]));
            c10143.m25768("sourcePath", str);
            c10143.m25768("targetPath", strM43081);
            c10143.m25768("remoteTaskId", strM19613);
            if (!TextUtils.isEmpty(c17923M43079.f56923)) {
                c10143.m25768("replacedName", c17923M43079.f56923);
            }
            c7340.m19613(c10143.m25778(), strM19613);
            LinkedHashMap linkedHashMapM19624 = c7340.m19620(strM19613);
            return linkedHashMapM19624 == null ? C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(R.string.MT_Protector, new Object[0])) : C12610.m31383(linkedHashMapM19624);
        } catch (IOException | C1320 | C21173 unused3) {
            enumC10591 = EnumC10591.BAD_REQUEST;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17923 m43079(C15530 c15530) {
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C17923 c17923 = new C17923();
        c17923.f56924 = Collections.EMPTY_LIST;
        c17923.f56925 = C13316.m32829(jSONObjectM32824, "type");
        c17923.f56920 = C13316.m32829(jSONObjectM32824, "sourcePath");
        c17923.f56922 = C13316.m32829(jSONObjectM32824, "targetPath");
        c17923.f56923 = C13316.m32829(jSONObjectM32824, "replacedName");
        c17923.f56921 = C13316.m32828(jSONObjectM32824, "moveToRecycleBin");
        c17923.f56924 = C13316.m32826(jSONObjectM32824);
        return c17923;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21451 m43081(C15530 c15530) {
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C21451 c21451 = new C21451();
        c21451.f69734 = C13316.m32829(jSONObjectM32824, "taskId");
        c21451.f69735 = C13316.m32829(jSONObjectM32824, "conflictId");
        c21451.f69733 = C13316.m32829(jSONObjectM32824, "action");
        c21451.f69736 = C13316.m32828(jSONObjectM32824, "applyAll");
        c21451.f69732 = C13316.m32828(jSONObjectM32824, "moveToRecycleBin");
        return c21451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43077(AbstractC20745 abstractC20745) {
        return abstractC20745 != null && C20370.m46024() && abstractC20745.mo35233();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m43078(String str) {
        return TextUtils.isEmpty(str) ? "" : m43080(AbstractC11462.m28608(str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43080(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM28608 = AbstractC11462.m28608(str);
        if ("/".equals(strM28608)) {
            return "/";
        }
        while (strM28608.length() > 1 && strM28608.endsWith("/")) {
            strM28608 = C20630.m46498(1, 0, strM28608);
        }
        return strM28608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43076(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47)) <= 0) ? "/" : str.substring(0, iLastIndexOf);
    }
}
