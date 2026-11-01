package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6640 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13427 f22420;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2800 f22421;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17617 f22422;

    public C6640(C2800 c2800, C17617 c17617) {
        this.f22421 = c2800;
        this.f22422 = c17617;
        this.f22420 = new C13427(c2800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m18011(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "entries", "password", "overwrite");
        String strM22723 = C8758.m22723(jSONObject, "password");
        boolean zM22724 = C8758.m22724(jSONObject, "overwrite");
        C2800 c2800 = this.f22421;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(C8758.m22723(jSONObject, MotionUtils.EASING_TYPE_PATH), c3070M8504, MotionUtils.EASING_TYPE_PATH);
        C0995 c0995 = new C0995(strM8495);
        try {
            try {
                ArrayList arrayListM18001 = m18001(C8758.m22715(jSONObject, "entries"), c3070M8504);
                ArrayList arrayList = new ArrayList();
                arrayList.add(strM8495);
                Iterator it = arrayListM18001.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2406) it.next()).f9671);
                }
                C11268 c11268M8506 = c2800.m8506(arrayList);
                try {
                    c2800.m8504().m9209(strM8495);
                    C8758.m22717(c2800, strM8495, false);
                    C2455 c2455M7447 = C2455.m7447(c2800.m8508(strM8495), false);
                    try {
                        c2455M7447.m7474(strM22723);
                        C22163 c22163M18004 = m18004(c2455M7447, arrayListM18001, strM8495, strM22723, c0995);
                        m18008(c22163M18004, strM8495, zM22724, c0995);
                        m18006(c2455M7447, c22163M18004, strM8495, zM22724, c0995);
                        c2455M7447.close();
                        c11268M8506.close();
                        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM8495).add("completedFiles", c0995.f4649).add("createdDirectories", c0995.f4652).add("warnings", c0995.f4653);
                    } catch (Throwable th) {
                        try {
                            c2455M7447.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c11268M8506.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                C12731 c12731M31631 = C12731.m31631("ZIP_IO_ERROR", "The storage backend failed during ZIP extraction", "fatal", null, JSON.object());
                if (c0995.f4648) {
                    c12731M31631.f42468.put("changed", true).put("stateKnown", false);
                }
                c0995.m3808(c12731M31631);
                throw c12731M31631;
            }
        } catch (IOException e) {
            C12731 c12731M18010 = m18010(e);
            c0995.m3808(c12731M18010);
            throw c12731M18010;
        } catch (C12731 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f42472)) {
                e = C12731.m31627("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", "warning", e.f42471, e.f42468);
            }
            c0995.m3808(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18001(JSONArray jSONArray, C3070 c3070) throws C12731 {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String strM22723 = null;
            try {
                JSONObject jSONObjectM22716 = C8758.m22716("entries", jSONArray.get(i));
                C8758.m22721(jSONObjectM22716, "entryPath", "destinationPath");
                String strM22724 = C8758.m22723(jSONObjectM22716, "entryPath");
                try {
                    strM22723 = C8758.m22723(jSONObjectM22716, "destinationPath");
                    boolean z = true;
                    C8758.m22722(strM22724, "entryPath", true);
                    if (!strM22724.isEmpty() && !strM22724.endsWith("/")) {
                        z = false;
                    }
                    if (z != strM22723.endsWith("/")) {
                        throw C8758.m22718(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "Directory mappings require trailing slashes on both paths");
                    }
                    String strM17474 = C6370.m17474(c3070, strM22723, "destinationPath", false);
                    c3070.m9207(strM17474);
                    if (!z) {
                        c3070.m9210(strM17474);
                    }
                    arrayList.add(new C2406(strM22724, i, strM17474, z));
                } catch (C12731 e) {
                    e = e;
                    str = strM22723;
                    strM22723 = strM22724;
                    JSONArray jSONArrayArray = JSON.array(i);
                    JSONObject jSONObject = e.f42468;
                    jSONObject.put("operationIndexes", jSONArrayArray);
                    if (strM22723 != null) {
                        jSONObject.put("entryPaths", JSON.array(strM22723));
                    }
                    if (str != null) {
                        jSONObject.put("destinationPath", str);
                    }
                    throw e;
                }
            } catch (C12731 e2) {
                e = e2;
                str = null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22163 m18004(C2455 c2455, ArrayList arrayList, String str, String str2, C0995 c0995) throws C12731 {
        C1044 c1044;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        C1044 c1045 = new C1044(c2455.m7466());
        ArrayList<C12107> arrayList3 = new ArrayList(c2455.m7466());
        C23846.sort(arrayList3, C7618.comparing(new C12964(2)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C2406 c2406 = (C2406) it3.next();
            C8758.m22720();
            c0995.f4651 = new C5229(null, c2406.f9672, c2406.f9671, c2406.f9673, c2406.f9670);
            C12107 entry = c2455.getEntry(c2406.f9672);
            if (!c2406.f9673) {
                c1044 = c1045;
                arrayList2 = arrayList3;
                it = it3;
                if (entry == null) {
                    throw C8758.m22718(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist");
                }
                m18007(entry);
                if (entry.m30133() && str2.isEmpty()) {
                    throw C8758.m22718(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                }
                C5229 c5229 = new C5229(entry, entry.getName(), c2406.f9671, false, c2406.f9670);
                c0995.f4651 = c5229;
                m18005(linkedHashMap, c5229, str);
            } else {
                if (!c2406.f9672.isEmpty() && entry == null && c1045.m25250(c2406.f9672) == null) {
                    throw C8758.m22718(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist");
                }
                if (entry != null) {
                    m18007(entry);
                }
                m18005(linkedHashMap, c0995.f4651, str);
                for (C12107 c12107 : arrayList3) {
                    if (c12107.getName().startsWith(c2406.f9672) && !c12107.getName().equals(c2406.f9672)) {
                        C1044 c1046 = c1045;
                        c0995.f4651 = new C5229(c12107, c12107.getName(), c2406.f9671, c12107.isDirectory(), c2406.f9670);
                        m18007(c12107);
                        String strSubstring = c12107.getName().substring(c2406.f9672.length());
                        boolean zIsDirectory = c12107.isDirectory();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = arrayList3;
                            if (i > strSubstring.length()) {
                                Iterator it4 = it3;
                                try {
                                    String strM15307 = C5553.m15307(strSubstring, zIsDirectory);
                                    if (zIsDirectory && !strM15307.isEmpty()) {
                                        strM15307 = strM15307 + "/";
                                    }
                                    if (!c12107.isDirectory() || !strM15307.isEmpty()) {
                                        String str3 = c2406.f9671;
                                        C5229 c52210 = new C5229(c12107, c12107.getName(), C6370.m17479("/".equals(str3) ? C15489.m37076(str3, strM15307) : C1679.m5594(str3, "/", strM15307), "destinationPath"), c12107.isDirectory(), c2406.f9670);
                                        c0995.f4651 = c52210;
                                        if (c12107.m30133() && str2.isEmpty()) {
                                            throw C8758.m22718(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                                        }
                                        m18005(linkedHashMap, c52210, str);
                                    }
                                    it3 = it4;
                                    arrayList3 = arrayList4;
                                    c1045 = c1046;
                                    break;
                                } catch (IOException unused) {
                                    throw C8758.m22718(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The ZIP entry has an unsafe extraction path");
                                }
                            }
                            if (i < strSubstring.length()) {
                                it2 = it3;
                                if (strSubstring.charAt(i) == '/' || strSubstring.charAt(i) == '\\') {
                                }
                                i++;
                                it3 = it2;
                                arrayList3 = arrayList4;
                            } else {
                                it2 = it3;
                            }
                            if (i - i2 == 2 && strSubstring.charAt(i2) == '.' && strSubstring.charAt(i2 + 1) == '.') {
                                throw C8758.m22718(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The extraction path contains a parent directory segment");
                            }
                            i2 = i + 1;
                            i++;
                            it3 = it2;
                            arrayList3 = arrayList4;
                        }
                    }
                }
                c1044 = c1045;
                arrayList2 = arrayList3;
                it = it3;
            }
            it3 = it;
            arrayList3 = arrayList2;
            c1045 = c1044;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (C5229 c52211 : linkedHashMap.values()) {
            c0995.f4651 = c52211;
            if (c52211.f18134) {
                linkedHashMap2.put(m18000(c52211.f18131), c52211);
            } else {
                arrayList5.add(c52211);
            }
            for (String strM18009 = m18009(c52211.f18131); strM18009 != null; strM18009 = m18009(strM18009)) {
                C5229 c52212 = (C5229) linkedHashMap.get(m18000(strM18009));
                if (c52212 != null && !c52212.f18134) {
                    throw m18003(c52212, c52211, strM18009);
                }
            }
            if (!c52211.f18134) {
                String strM180010 = m18009(c52211.f18131);
                if (strM180010 == null) {
                    throw C8758.m22718(JSON.object(), "FILE_PARENT_NOT_FOUND", "The output has no parent directory");
                }
                C9735.putIfAbsent(linkedHashMap2, m18000(strM180010), new C5229(null, c52211.f18130, strM180010, true, c52211.f18132));
            }
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.values());
        C23846.sort(arrayList6, C7618.comparingInt(new C4523()));
        return new C22163(arrayList6, arrayList5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18008(C22163 c22163, String str, boolean z, C0995 c0995) throws C12731 {
        C2800 c2800 = this.f22421;
        C3070 c3070M8504 = c2800.m8504();
        c3070M8504.m9209(str);
        for (C5229 c5229 : (ArrayList) c22163.f72489) {
            C8758.m22720();
            c0995.f4651 = c5229;
            c3070M8504.m9207(c5229.f18131);
            this.f22420.m32920(c5229.f18131);
        }
        for (C5229 c52210 : (ArrayList) c22163.f72490) {
            C8758.m22720();
            c0995.f4651 = c52210;
            c3070M8504.m9207(c52210.f18131);
            c3070M8504.m9210(c52210.f18131);
            int i = C11580.f38937[c2800.m8503(c52210.f18131).m16196().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw C8758.m22718(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "A directory cannot be used as an extracted file destination");
                    }
                    throw C12731.m31631("FILE_UNSUPPORTED_TYPE", "Extraction destinations must be regular files or missing paths", "fatal", null, JSON.object());
                }
            } else if (!z) {
                throw C8758.m22718(JSON.object(), "FILE_ALREADY_EXISTS", "An extraction destination exists and overwrite is false");
            }
            if (c2800.m8508(c52210.f18131).mo33989().mo1799(EnumC17217.CREATE_FILE_EXCLUSIVE) == EnumC16512.UNSUPPORTED) {
                throw C12731.m31631("FILE_BACKEND_UNSUPPORTED", "The destination backend cannot safely create temporary extraction files", "fatal", null, JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18006(C2455 c2455, C22163 c22163, String str, boolean z, C0995 c0995) throws C12731 {
        C2800 c2800;
        Iterator it = ((ArrayList) c22163.f72489).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2800 = this.f22421;
            if (!zHasNext) {
                break;
            }
            C5229 c5229 = (C5229) it.next();
            c0995.f4651 = c5229;
            C8758.m22720();
            c2800.m8504().m9209(str);
            c0995.f4648 = true;
            C1431 c1431M32921 = this.f22420.m32921(c5229.f18131);
            c0995.f4648 = false;
            c0995.f4652 += c1431M32921.f5885;
            c0995.m3807(c1431M32921.f5882);
        }
        for (C5229 c52210 : (ArrayList) c22163.f72490) {
            c0995.f4651 = c52210;
            C8758.m22720();
            C3070 c3070M8504 = c2800.m8504();
            c3070M8504.m9209(str);
            c0995.f4648 = true;
            C19735 c19735M40991 = this.f22422.m40991(c52210.f18131, z, c3070M8504, new C13697(c2455, c52210, str));
            c0995.f4648 = false;
            c0995.f4649++;
            c0995.m3807(c19735M40991.f63418);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m17999(C12107 c12107, C2455 c2455) throws C12731 {
        try {
            return new C3817(c2455.m7478(c12107));
        } catch (IOException e) {
            throw m18010(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18007(C12107 c12107) throws C12731 {
        if ((c12107.m30125() & 61440) == 40960) {
            throw C12731.m31631("ZIP_UNSUPPORTED_ENTRY", "Symbolic link entries cannot be extracted by this tool", "fatal", null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18005(LinkedHashMap linkedHashMap, C5229 c5229, String str) throws C12731 {
        if (C5553.m15330(str, c5229.f18131)) {
            throw C8758.m22718(JSON.object(), "ZIP_SOURCE_DESTINATION_CONFLICT", "Extraction cannot replace its source ZIP");
        }
        C5229 c52210 = (C5229) C9735.putIfAbsent(linkedHashMap, m18000(c5229.f18131), c5229);
        if (c52210 != null) {
            throw m18003(c52210, c5229, c5229.f18131);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m18003(C5229 c5229, C5229 c52210, String str) {
        JSONArray jSONArrayArray = JSON.array(c5229.f18132);
        if (c52210.f18132 != c5229.f18132) {
            jSONArrayArray.add(c52210.f18132);
        }
        JSONArray jSONArrayArray2 = JSON.array(c5229.f18130);
        if (!c52210.f18130.equals(c5229.f18130)) {
            jSONArrayArray2.add(c52210.f18130);
        }
        return C8758.m22718(JSON.object().add("entryPaths", jSONArrayArray2).add("operationIndexes", jSONArrayArray).add("destinationPath", str), "ZIP_DESTINATION_CONFLICT", "Multiple ZIP entries require the same destination or a file as a parent directory");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18000(String str) {
        String strM15306 = C5553.m15306(str);
        if (strM15306 == null) {
            return str;
        }
        return "shared-storage:" + strM15306.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18009(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m18010(IOException iOException) {
        if ((iOException instanceof InterruptedIOException) || Thread.currentThread().isInterrupted()) {
            return C8758.m22718(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
        if (iOException instanceof C17978) {
            return C8758.m22718(JSON.object(), "ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry");
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented")) {
            return C12731.m31631("ZIP_UNSUPPORTED", "The ZIP uses an unsupported archive, compression, or encryption feature", "fatal", null, JSON.object());
        }
        return C8758.m22718(JSON.object(), "ZIP_READ_FAILED", "The ZIP file or entry could not be read and verified");
    }
}
