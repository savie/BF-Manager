package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13017 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3573 f41685 = new C21968();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0580 f41686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f41687;

    public C13017(C22209 c22209, C0580 c0580) {
        this.f41687 = c22209;
        this.f41686 = c0580;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m32443(JSONObject jSONObject) throws C10186 {
        C8060.m21954(jSONObject, "outputPath", "sources", "overwrite", "level", "password");
        String strM21956 = C8060.m21956(jSONObject, "outputPath");
        boolean zM21957 = C8060.m21957(jSONObject, "overwrite");
        int iM21947 = C8060.m21947(jSONObject, "level", 0, 9);
        int i = iM21947 == 0 ? 0 : 8;
        String strM21957 = C8060.m21956(jSONObject, "password");
        C22209 c22209 = this.f41687;
        C9113 c9113M50227 = c22209.m50227();
        String strM50226 = C22209.m50226(strM21956, c9113M50227, "outputPath");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM21948 = C8060.m21948(jSONObject, "sources");
        for (int i2 = 0; i2 < jSONArrayM21948.size(); i2++) {
            try {
                JSONObject jSONObjectM21949 = C8060.m21949("sources", jSONArrayM21948.get(i2));
                C8060.m21954(jSONObjectM21949, "sourcePath", "entryPath");
                arrayList.add(m32441(jSONObjectM21949, c9113M50227));
            } catch (C10186 e) {
                e.f32602.put(MotionUtils.EASING_TYPE_PATH, strM50226).put("operationIndexes", JSON.array(i2));
                throw e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(strM50226);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C19730) it.next()).f63501);
        }
        try {
            C19225 c19225M50229 = c22209.m50229(arrayList2);
            try {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList3.add(C9550.m24974(m32437((C19730) arrayList.get(i3), strM50226, c9113M50227, i3), false));
                }
                JSONObject jSONObjectM32436 = m32436(strM50226, zM21957, c9113M50227, m32439(Collections.EMPTY_LIST, arrayList3), null, strM21957, i, iM21947);
                c19225M50229.close();
                return jSONObjectM32436;
            } catch (Throwable th) {
                try {
                    c19225M50229.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (C10186 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f32601)) {
                e = C8060.m21951(e.f32602, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
            }
            e.f32602.put(MotionUtils.EASING_TYPE_PATH, strM50226);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject m32444(JSONObject jSONObject) throws Throwable {
        String str;
        String str2;
        Throwable th;
        String str3 = "overwrite";
        String str4 = "entryPath";
        String str5 = MotionUtils.EASING_TYPE_PATH;
        String str6 = "operations";
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "operations", "password");
        String strM21956 = C8060.m21956(jSONObject, "password");
        C22209 c22209 = this.f41687;
        C9113 c9113M50227 = c22209.m50227();
        String strM50226 = C22209.m50226(C8060.m21956(jSONObject, MotionUtils.EASING_TYPE_PATH), c9113M50227, MotionUtils.EASING_TYPE_PATH);
        c9113M50227.m24268(strM50226);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM50226);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayM21948 = C8060.m21948(jSONObject, "operations");
        int i = 0;
        while (true) {
            String str7 = strM21956;
            C22209 c222010 = c22209;
            if (i < jSONArrayM21948.size()) {
                try {
                    JSONObject jSONObjectM21949 = C8060.m21949(str6, jSONArrayM21948.get(i));
                    JSONArray jSONArray = jSONArrayM21948;
                    String strM21957 = C8060.m21956(jSONObjectM21949, "type");
                    String str8 = str6;
                    String strM21958 = C8060.m21956(jSONObjectM21949, str4);
                    str = str5;
                    try {
                        C8060.m21955(strM21958, str4, strM21957.equals("add"));
                        if (strM21957.equals("add")) {
                            C8060.m21954(jSONObjectM21949, "type", "sourcePath", str4, str3);
                            C19730 c19730M32441 = m32441(jSONObjectM21949, c9113M50227);
                            arrayList2.add(new C10779(strM21957, strM21958, "", C8060.m21957(jSONObjectM21949, str3), c19730M32441));
                            arrayList.add(c19730M32441.f63501);
                        } else {
                            if (strM21957.equals("delete")) {
                                boolean zEndsWith = strM21958.endsWith("/");
                                C8060.m21954(jSONObjectM21949, zEndsWith ? new String[]{"type", str4, "recursive"} : new String[]{"type", str4});
                                arrayList2.add(new C10779(strM21957, strM21958, "", zEndsWith && C8060.m21957(jSONObjectM21949, "recursive"), null));
                            } else {
                                if (!strM21957.equals("rename")) {
                                    throw C8060.m21952(JSON.value(strM21957), "type", "Expected add, delete, or rename");
                                }
                                boolean zEndsWith2 = strM21958.endsWith("/");
                                C8060.m21954(jSONObjectM21949, zEndsWith2 ? new String[]{"type", str4, "newEntryPath", "mergeDirectories"} : new String[]{"type", str4, "newEntryPath"});
                                String strM21959 = C8060.m21956(jSONObjectM21949, "newEntryPath");
                                C8060.m21955(strM21959, "newEntryPath", false);
                                if (zEndsWith2 != strM21959.endsWith("/")) {
                                    throw C8060.m21952(JSON.value(strM21959), "newEntryPath", "Renaming must preserve the entry type");
                                }
                                arrayList2.add(new C10779(strM21957, strM21958, strM21959, zEndsWith2 && C8060.m21957(jSONObjectM21949, "mergeDirectories"), null));
                            }
                            i++;
                            jSONArrayM21948 = jSONArray;
                            strM21956 = str7;
                            c22209 = c222010;
                            str6 = str8;
                            str5 = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        i++;
                        jSONArrayM21948 = jSONArray;
                        strM21956 = str7;
                        c22209 = c222010;
                        str6 = str8;
                        str5 = str;
                        str3 = str3;
                        str4 = str4;
                    } catch (C10186 e) {
                        e = e;
                        e.f32602.put(str, strM50226).put("operationIndexes", JSON.array(i));
                        throw e;
                    }
                } catch (C10186 e2) {
                    e = e2;
                    str = str5;
                }
            } else {
                try {
                    C19225 c19225M50229 = c222010.m50229(arrayList);
                    int i2 = 0;
                    try {
                        try {
                            try {
                                C8060.m21950(c222010, strM50226, false);
                                C22941 c22941M51704 = C22941.m51704(c222010.m50232(strM50226), false);
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < arrayList2.size()) {
                                        C10779 c10779 = (C10779) arrayList2.get(i2);
                                        String str9 = c10779.f34207;
                                        String str10 = c10779.f34205;
                                        boolean z = c10779.f34209;
                                        ArrayList arrayList4 = arrayList2;
                                        int iHashCode = str9.hashCode();
                                        String str11 = str5;
                                        if (iHashCode != -1335458389) {
                                            if (iHashCode != -934594754) {
                                                if (iHashCode == 96417) {
                                                    try {
                                                        if (str9.equals("add")) {
                                                            arrayList3.add(C9550.m24974(m32437(c10779.f34208, strM50226, c9113M50227, i2), z));
                                                            i2++;
                                                            arrayList2 = arrayList4;
                                                            str5 = str11;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            c22941M51704.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                throw new AssertionError(c10779.f34207);
                                            }
                                            if (!str9.equals("rename")) {
                                                throw new AssertionError(c10779.f34207);
                                            }
                                            arrayList3.add(C9550.m24972(str10, c10779.f34206, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str11;
                                        } else {
                                            if (!str9.equals("delete")) {
                                                throw new AssertionError(c10779.f34207);
                                            }
                                            arrayList3.add(C9550.m24973(str10, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str11;
                                        }
                                    }
                                    JSONObject jSONObjectM32436 = m32436(strM50226, true, c9113M50227, m32439(c22941M51704.m51742(), arrayList3), c22941M51704, str7, 8, -1);
                                    c22941M51704.close();
                                    c19225M50229.close();
                                    return jSONObjectM32436;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    c19225M50229.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            c19225M50229.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = str;
                        throw C10186.m26306("ZIP_IO_ERROR", C11958.m29932(e, new StringBuilder("ZIP I/O failed: ")), "fatal", null, JSON.object().add(str2, strM50226));
                    } catch (C10186 e4) {
                        e = e4;
                        if ("FILE_OPERATION_INTERRUPTED".equals(e.f32601)) {
                            e = C8060.m21951(e.f32602, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
                        }
                        e.f32602.put(str, strM50226);
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    str2 = str5;
                } catch (C10186 e6) {
                    e = e6;
                    str = str5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m32436(String str, boolean z, C9113 c9113, C7314 c7314, C22941 c22941, String str2, int i, int i2) throws C10186 {
        if (c22941 != null && !c7314.f24092) {
            C8060.m21953();
            C22209 c22209 = this.f41687;
            C9113 c9113M50227 = c22209.m50227();
            c9113M50227.m24268(str);
            c9113M50227.m24270(str);
            c9113M50227.m24269(str);
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("size", C8060.m21950(c22209, str, false).m6566()).add("changed", false).add("warnings", JSON.array());
        }
        C16241 c16241M2661 = this.f41686.m2661(str, z, c9113, new C14025(this, c22941, c7314, i, i2, str2, str));
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, c16241M2661.f52790).add("size", c16241M2661.f52791).add("changed", c16241M2661.f52787).add("warnings", c16241M2661.f52789);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19730 m32441(JSONObject jSONObject, C9113 c9113) throws C10186 {
        String strM21956 = C8060.m21956(jSONObject, "sourcePath");
        String strM21957 = C8060.m21956(jSONObject, "entryPath");
        boolean z = true;
        C8060.m21955(strM21957, "entryPath", true);
        boolean zEndsWith = strM21956.endsWith("/");
        if (!strM21957.isEmpty() && !strM21957.endsWith("/")) {
            z = false;
        }
        if (zEndsWith != z) {
            throw C8060.m21952(JSON.value(strM21957), "entryPath", "Source and ZIP destination must declare the same file or directory type");
        }
        return new C19730(C22209.m50219(strM21956, c9113, "sourcePath"), strM21957, zEndsWith);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m32437(C19730 c19730, String str, C9113 c9113, int i) throws C10186 {
        C19730 c19731;
        C22209 c22209;
        C22209 c222010 = this.f41687;
        try {
            if (C14584.m35211(c19730.f63501, str) || (c19730.f63500 && C0470.m2302(str, c19730.f63501))) {
                throw C8060.m21951(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(c19730);
            while (!arrayDeque.isEmpty()) {
                C8060.m21953();
                c19731 = (C19730) arrayDeque.removeFirst();
                try {
                    String str2 = c19731.f63501;
                    boolean z = c19731.f63500;
                    String str3 = c19731.f63502;
                    c9113.m24268(str2);
                    C1907 c1907M21950 = C8060.m21950(c222010, str2, z);
                    AbstractC22044 abstractC22044M50232 = c222010.m50232(str2);
                    if (z) {
                        c22209 = c222010;
                        try {
                            List<C1907> listMo29161 = abstractC22044M50232.mo4298().mo29161(c1907M21950);
                            if (!listMo29161.isEmpty() || str3.isEmpty()) {
                                c19730 = c19731;
                            } else {
                                c19730 = c19731;
                                try {
                                    linkedHashMap.put(str3, new C22714(abstractC22044M50232, true, c1907M21950.m6568()));
                                } catch (C10186 e) {
                                    e = e;
                                    c19731 = c19730;
                                    e.f32602.put("sourcePath", c19731.f63501).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c19731.f63502));
                                    throw e;
                                }
                            }
                            for (C1907 c1907 : listMo29161) {
                                AbstractC22044 abstractC22044M6565 = c1907.m6565();
                                boolean z2 = c1907.m6567() == EnumC13093.DIRECTORY;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(abstractC22044M6565.getName());
                                sb.append(z2 ? "/" : "");
                                String string = sb.toString();
                                C8060.m21955(string, "entryPath", false);
                                arrayDeque.addLast(new C19730(abstractC22044M6565.mo4294(), string, z2));
                            }
                        } catch (C22790 e2) {
                            c19730 = c19731;
                            throw C22209.m50224(e2);
                        }
                    } else {
                        try {
                            if (C14584.m35211(str2, str)) {
                                throw C8060.m21951(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
                            }
                            linkedHashMap.put(str3, new C22714(abstractC22044M50232, false, c1907M21950.m6568()));
                            c19730 = c19731;
                            c22209 = c222010;
                        } catch (C10186 e3) {
                            e = e3;
                            e.f32602.put("sourcePath", c19731.f63501).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c19731.f63502));
                            throw e;
                        }
                    }
                    c222010 = c22209;
                } catch (C10186 e4) {
                    e = e4;
                    c19730 = c19731;
                }
            }
            return linkedHashMap;
        } catch (C10186 e5) {
            e = e5;
            c19731 = c19730;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7314 m32439(Collection collection, ArrayList arrayList) throws C10186 {
        try {
            return C7314.m20055(collection, arrayList);
        } catch (C2839 e) {
            JSONArray jSONArrayArray = JSON.array();
            Iterator it = e.f9350.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add(((Integer) it.next()).intValue());
            }
            JSONArray jSONArrayArray2 = JSON.array();
            Iterator it2 = e.f9351.iterator();
            while (it2.hasNext()) {
                jSONArrayArray2.add((String) it2.next());
            }
            throw C8060.m21951(JSON.object().add("operationIndexes", jSONArrayArray).add("entryPaths", jSONArrayArray2), e.f9349, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m32440(int i, IOException iOException, String str) {
        return C10186.m26306("ZIP_SOURCE_READ_FAILED", C11958.m29932(iOException, new StringBuilder("Failed to read ZIP source content: ")), "fatal", null, JSON.object().add("operationIndexes", JSON.array(i)).add("entryPaths", JSON.array(str)));
    }
}
