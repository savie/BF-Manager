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

/* JADX INFO: renamed from: l.ۢ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9464 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC10389 f32019 = new C5935();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17617 f32020;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f32021;

    public C9464(C2800 c2800, C17617 c17617) {
        this.f32021 = c2800;
        this.f32020 = c17617;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m24234(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, "outputPath", "sources", "overwrite", "level", "password");
        String strM22723 = C8758.m22723(jSONObject, "outputPath");
        boolean zM22724 = C8758.m22724(jSONObject, "overwrite");
        int iM22714 = C8758.m22714(jSONObject, "level", 0, 9);
        int i = iM22714 == 0 ? 0 : 8;
        String strM22724 = C8758.m22723(jSONObject, "password");
        C2800 c2800 = this.f32021;
        C3070 c3070M8504 = c2800.m8504();
        String strM8502 = C2800.m8502(strM22723, c3070M8504, "outputPath");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM22715 = C8758.m22715(jSONObject, "sources");
        for (int i2 = 0; i2 < jSONArrayM22715.size(); i2++) {
            try {
                JSONObject jSONObjectM22716 = C8758.m22716("sources", jSONArrayM22715.get(i2));
                C8758.m22721(jSONObjectM22716, "sourcePath", "entryPath");
                arrayList.add(m24232(jSONObjectM22716, c3070M8504));
            } catch (C12731 e) {
                e.f42468.put(MotionUtils.EASING_TYPE_PATH, strM8502).put("operationIndexes", JSON.array(i2));
                throw e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(strM8502);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C14403) it.next()).f47219);
        }
        try {
            C11268 c11268M8506 = c2800.m8506(arrayList2);
            try {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList3.add(C15814.m37587(m24228((C14403) arrayList.get(i3), strM8502, c3070M8504, i3), false));
                }
                JSONObject jSONObjectM24227 = m24227(strM8502, zM22724, c3070M8504, m24233(Collections.EMPTY_LIST, arrayList3), null, strM22724, i, iM22714);
                c11268M8506.close();
                return jSONObjectM24227;
            } catch (Throwable th) {
                try {
                    c11268M8506.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (C12731 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f42472)) {
                e = C8758.m22718(e.f42468, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
            }
            e.f42468.put(MotionUtils.EASING_TYPE_PATH, strM8502);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject m24235(JSONObject jSONObject) throws Throwable {
        String str;
        String str2;
        Throwable th;
        String str3 = "overwrite";
        String str4 = "entryPath";
        String str5 = MotionUtils.EASING_TYPE_PATH;
        String str6 = "operations";
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "operations", "password");
        String strM22723 = C8758.m22723(jSONObject, "password");
        C2800 c2800 = this.f32021;
        C3070 c3070M8504 = c2800.m8504();
        String strM8502 = C2800.m8502(C8758.m22723(jSONObject, MotionUtils.EASING_TYPE_PATH), c3070M8504, MotionUtils.EASING_TYPE_PATH);
        c3070M8504.m9209(strM8502);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM8502);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayM22715 = C8758.m22715(jSONObject, "operations");
        int i = 0;
        while (true) {
            String str7 = strM22723;
            C2800 c2801 = c2800;
            if (i < jSONArrayM22715.size()) {
                try {
                    JSONObject jSONObjectM22716 = C8758.m22716(str6, jSONArrayM22715.get(i));
                    JSONArray jSONArray = jSONArrayM22715;
                    String strM22724 = C8758.m22723(jSONObjectM22716, "type");
                    String str8 = str6;
                    String strM22725 = C8758.m22723(jSONObjectM22716, str4);
                    str = str5;
                    try {
                        C8758.m22722(strM22725, str4, strM22724.equals("add"));
                        if (strM22724.equals("add")) {
                            C8758.m22721(jSONObjectM22716, "type", "sourcePath", str4, str3);
                            C14403 c14403M24232 = m24232(jSONObjectM22716, c3070M8504);
                            arrayList2.add(new C10875(strM22724, strM22725, "", C8758.m22724(jSONObjectM22716, str3), c14403M24232));
                            arrayList.add(c14403M24232.f47219);
                        } else {
                            if (strM22724.equals("delete")) {
                                boolean zEndsWith = strM22725.endsWith("/");
                                C8758.m22721(jSONObjectM22716, zEndsWith ? new String[]{"type", str4, "recursive"} : new String[]{"type", str4});
                                arrayList2.add(new C10875(strM22724, strM22725, "", zEndsWith && C8758.m22724(jSONObjectM22716, "recursive"), null));
                            } else {
                                if (!strM22724.equals("rename")) {
                                    throw C8758.m22719(JSON.value(strM22724), "type", "Expected add, delete, or rename");
                                }
                                boolean zEndsWith2 = strM22725.endsWith("/");
                                C8758.m22721(jSONObjectM22716, zEndsWith2 ? new String[]{"type", str4, "newEntryPath", "mergeDirectories"} : new String[]{"type", str4, "newEntryPath"});
                                String strM22726 = C8758.m22723(jSONObjectM22716, "newEntryPath");
                                C8758.m22722(strM22726, "newEntryPath", false);
                                if (zEndsWith2 != strM22726.endsWith("/")) {
                                    throw C8758.m22719(JSON.value(strM22726), "newEntryPath", "Renaming must preserve the entry type");
                                }
                                arrayList2.add(new C10875(strM22724, strM22725, strM22726, zEndsWith2 && C8758.m22724(jSONObjectM22716, "mergeDirectories"), null));
                            }
                            i++;
                            jSONArrayM22715 = jSONArray;
                            strM22723 = str7;
                            c2800 = c2801;
                            str6 = str8;
                            str5 = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        i++;
                        jSONArrayM22715 = jSONArray;
                        strM22723 = str7;
                        c2800 = c2801;
                        str6 = str8;
                        str5 = str;
                        str3 = str3;
                        str4 = str4;
                    } catch (C12731 e) {
                        e = e;
                        e.f42468.put(str, strM8502).put("operationIndexes", JSON.array(i));
                        throw e;
                    }
                } catch (C12731 e2) {
                    e = e2;
                    str = str5;
                }
            } else {
                try {
                    C11268 c11268M8506 = c2801.m8506(arrayList);
                    int i2 = 0;
                    try {
                        try {
                            try {
                                C8758.m22717(c2801, strM8502, false);
                                C2455 c2455M7447 = C2455.m7447(c2801.m8508(strM8502), false);
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < arrayList2.size()) {
                                        C10875 c10875 = (C10875) arrayList2.get(i2);
                                        String str9 = c10875.f36980;
                                        String str10 = c10875.f36979;
                                        boolean z = c10875.f36978;
                                        ArrayList arrayList4 = arrayList2;
                                        int iHashCode = str9.hashCode();
                                        str = str5;
                                        if (iHashCode != -1335458389) {
                                            if (iHashCode != -934594754) {
                                                if (iHashCode == 96417) {
                                                    try {
                                                        if (str9.equals("add")) {
                                                            arrayList3.add(C15814.m37587(m24228(c10875.f36982, strM8502, c3070M8504, i2), z));
                                                            i2++;
                                                            arrayList2 = arrayList4;
                                                            str5 = str;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            c2455M7447.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                throw new AssertionError(c10875.f36980);
                                            }
                                            if (!str9.equals("rename")) {
                                                throw new AssertionError(c10875.f36980);
                                            }
                                            arrayList3.add(C15814.m37585(str10, c10875.f36981, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        } else {
                                            if (!str9.equals("delete")) {
                                                throw new AssertionError(c10875.f36980);
                                            }
                                            arrayList3.add(C15814.m37586(str10, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        }
                                    }
                                    JSONObject jSONObjectM24227 = m24227(strM8502, true, c3070M8504, m24233(c2455M7447.m7466(), arrayList3), c2455M7447, str7, 8, -1);
                                    c2455M7447.close();
                                    c11268M8506.close();
                                    return jSONObjectM24227;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str = str5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    c11268M8506.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str = str5;
                            th = th;
                            c11268M8506.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = str;
                        throw C12731.m31631("ZIP_IO_ERROR", C9013.m23329(e, new StringBuilder("ZIP I/O failed: ")), "fatal", null, JSON.object().add(str2, strM8502));
                    } catch (C12731 e4) {
                        e = e4;
                        if ("FILE_OPERATION_INTERRUPTED".equals(e.f42472)) {
                            e = C8758.m22718(e.f42468, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
                        }
                        e.f42468.put(str, strM8502);
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    str2 = str5;
                } catch (C12731 e6) {
                    e = e6;
                    str = str5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m24227(String str, boolean z, C3070 c3070, C16519 c16519, C2455 c2455, String str2, int i, int i2) throws C12731 {
        if (c2455 != null && !c16519.f53065) {
            C8758.m22720();
            C2800 c2800 = this.f32021;
            C3070 c3070M8504 = c2800.m8504();
            c3070M8504.m9209(str);
            c3070M8504.m9207(str);
            c3070M8504.m9210(str);
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("size", C8758.m22717(c2800, str, false).m16197()).add("changed", false).add("warnings", JSON.array());
        }
        C19735 c19735M40991 = this.f32020.m40991(str, z, c3070, new C12286(this, c2455, c16519, i, i2, str2, str));
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, c19735M40991.f63420).add("size", c19735M40991.f63416).add("changed", c19735M40991.f63417).add("warnings", c19735M40991.f63418);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14403 m24232(JSONObject jSONObject, C3070 c3070) throws C12731 {
        String strM22723 = C8758.m22723(jSONObject, "sourcePath");
        String strM22724 = C8758.m22723(jSONObject, "entryPath");
        boolean z = true;
        C8758.m22722(strM22724, "entryPath", true);
        boolean zEndsWith = strM22723.endsWith("/");
        if (!strM22724.isEmpty() && !strM22724.endsWith("/")) {
            z = false;
        }
        if (zEndsWith != z) {
            throw C8758.m22719(JSON.value(strM22724), "entryPath", "Source and ZIP destination must declare the same file or directory type");
        }
        return new C14403(C2800.m8495(strM22723, c3070, "sourcePath"), strM22724, zEndsWith);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m24228(C14403 c14403, String str, C3070 c3070, int i) throws C12731 {
        C14403 c14404;
        C2800 c2800;
        C2800 c2801 = this.f32021;
        try {
            if (C5553.m15330(c14403.f47219, str) || (c14403.f47218 && C6370.m17477(str, c14403.f47219))) {
                throw C8758.m22718(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(c14403);
            while (!arrayDeque.isEmpty()) {
                C8758.m22720();
                c14404 = (C14403) arrayDeque.removeFirst();
                try {
                    String str2 = c14404.f47219;
                    boolean z = c14404.f47218;
                    String str3 = c14404.f47220;
                    c3070.m9209(str2);
                    C5928 c5928M22717 = C8758.m22717(c2801, str2, z);
                    AbstractC20745 abstractC20745M8508 = c2801.m8508(str2);
                    if (z) {
                        c2800 = c2801;
                        try {
                            List<C5928> listMo27226 = abstractC20745M8508.mo33989().mo27226(c5928M22717);
                            if (!listMo27226.isEmpty() || str3.isEmpty()) {
                                c14403 = c14404;
                            } else {
                                c14403 = c14404;
                                try {
                                    linkedHashMap.put(str3, new C23575(abstractC20745M8508, true, c5928M22717.m16198()));
                                } catch (C12731 e) {
                                    e = e;
                                    c14404 = c14403;
                                    e.f42468.put("sourcePath", c14404.f47219).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c14404.f47220));
                                    throw e;
                                }
                            }
                            for (C5928 c5928 : listMo27226) {
                                AbstractC20745 abstractC20745M16195 = c5928.m16195();
                                boolean z2 = c5928.m16196() == EnumC12279.DIRECTORY;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(abstractC20745M16195.getName());
                                sb.append(z2 ? "/" : "");
                                String string = sb.toString();
                                C8758.m22722(string, "entryPath", false);
                                arrayDeque.addLast(new C14403(abstractC20745M16195.mo33986(), string, z2));
                            }
                        } catch (C20040 e2) {
                            c14403 = c14404;
                            throw C2800.m8500(e2);
                        }
                    } else {
                        try {
                            if (C5553.m15330(str2, str)) {
                                throw C8758.m22718(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
                            }
                            linkedHashMap.put(str3, new C23575(abstractC20745M8508, false, c5928M22717.m16198()));
                            c14403 = c14404;
                            c2800 = c2801;
                        } catch (C12731 e3) {
                            e = e3;
                            e.f42468.put("sourcePath", c14404.f47219).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c14404.f47220));
                            throw e;
                        }
                    }
                    c2801 = c2800;
                } catch (C12731 e4) {
                    e = e4;
                    c14403 = c14404;
                }
            }
            return linkedHashMap;
        } catch (C12731 e5) {
            e = e5;
            c14404 = c14403;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16519 m24233(Collection collection, ArrayList arrayList) throws C12731 {
        try {
            return C16519.m38851(collection, arrayList);
        } catch (C20047 e) {
            JSONArray jSONArrayArray = JSON.array();
            Iterator it = e.f64183.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add(((Integer) it.next()).intValue());
            }
            JSONArray jSONArrayArray2 = JSON.array();
            Iterator it2 = e.f64185.iterator();
            while (it2.hasNext()) {
                jSONArrayArray2.add((String) it2.next());
            }
            throw C8758.m22718(JSON.object().add("operationIndexes", jSONArrayArray).add("entryPaths", jSONArrayArray2), e.f64184, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m24231(int i, IOException iOException, String str) {
        return C12731.m31631("ZIP_SOURCE_READ_FAILED", C9013.m23329(iOException, new StringBuilder("Failed to read ZIP source content: ")), "fatal", null, JSON.object().add("operationIndexes", JSON.array(i)).add("entryPaths", JSON.array(str)));
    }
}
