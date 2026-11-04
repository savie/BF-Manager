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

/* JADX INFO: renamed from: l.ۨᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15385 f40236;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22209 f40237;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0580 f40238;

    public C12534(C22209 c22209, C0580 c0580) {
        this.f40237 = c22209;
        this.f40238 = c0580;
        this.f40236 = new C15385(c22209);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m31152(JSONObject jSONObject) throws C10186 {
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "entries", "password", "overwrite");
        String strM21956 = C8060.m21956(jSONObject, "password");
        boolean zM21957 = C8060.m21957(jSONObject, "overwrite");
        C22209 c22209 = this.f40237;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(C8060.m21956(jSONObject, MotionUtils.EASING_TYPE_PATH), c9113M50227, MotionUtils.EASING_TYPE_PATH);
        C23723 c23723 = new C23723(strM50219);
        try {
            try {
                ArrayList arrayListM31142 = m31142(C8060.m21948(jSONObject, "entries"), c9113M50227);
                ArrayList arrayList = new ArrayList();
                arrayList.add(strM50219);
                Iterator it = arrayListM31142.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C17009) it.next()).f55575);
                }
                C19225 c19225M50229 = c22209.m50229(arrayList);
                try {
                    c22209.m50227().m24268(strM50219);
                    C8060.m21950(c22209, strM50219, false);
                    C22941 c22941M51704 = C22941.m51704(c22209.m50232(strM50219), false);
                    try {
                        c22941M51704.m51730(strM21956);
                        C16263 c16263M31145 = m31145(c22941M51704, arrayListM31142, strM50219, strM21956, c23723);
                        m31148(c16263M31145, strM50219, zM21957, c23723);
                        m31149(c22941M51704, c16263M31145, strM50219, zM21957, c23723);
                        c22941M51704.close();
                        c19225M50229.close();
                        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM50219).add("completedFiles", c23723.f76911).add("createdDirectories", c23723.f76915).add("warnings", c23723.f76913);
                    } catch (Throwable th) {
                        try {
                            c22941M51704.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c19225M50229.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                C10186 c10186M26306 = C10186.m26306("ZIP_IO_ERROR", "The storage backend failed during ZIP extraction", "fatal", null, JSON.object());
                if (c23723.f76916) {
                    c10186M26306.f32602.put("changed", true).put("stateKnown", false);
                }
                c23723.m52995(c10186M26306);
                throw c10186M26306;
            }
        } catch (IOException e) {
            C10186 c10186M31151 = m31151(e);
            c23723.m52995(c10186M31151);
            throw c10186M31151;
        } catch (C10186 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f32601)) {
                e = C10186.m26302("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", "warning", e.f32599, e.f32602);
            }
            c23723.m52995(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31142(JSONArray jSONArray, C9113 c9113) throws C10186 {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String strM21956 = null;
            try {
                JSONObject jSONObjectM21949 = C8060.m21949("entries", jSONArray.get(i));
                C8060.m21954(jSONObjectM21949, "entryPath", "destinationPath");
                String strM21957 = C8060.m21956(jSONObjectM21949, "entryPath");
                try {
                    strM21956 = C8060.m21956(jSONObjectM21949, "destinationPath");
                    boolean z = true;
                    C8060.m21955(strM21957, "entryPath", true);
                    if (!strM21957.isEmpty() && !strM21957.endsWith("/")) {
                        z = false;
                    }
                    if (z != strM21956.endsWith("/")) {
                        throw C8060.m21951(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "Directory mappings require trailing slashes on both paths");
                    }
                    String strM2299 = C0470.m2299(c9113, strM21956, "destinationPath", false);
                    c9113.m24270(strM2299);
                    if (!z) {
                        c9113.m24269(strM2299);
                    }
                    arrayList.add(new C17009(strM21957, i, strM2299, z));
                } catch (C10186 e) {
                    e = e;
                    str = strM21956;
                    strM21956 = strM21957;
                    JSONArray jSONArrayArray = JSON.array(i);
                    JSONObject jSONObject = e.f32602;
                    jSONObject.put("operationIndexes", jSONArrayArray);
                    if (strM21956 != null) {
                        jSONObject.put("entryPaths", JSON.array(strM21956));
                    }
                    if (str != null) {
                        jSONObject.put("destinationPath", str);
                    }
                    throw e;
                }
            } catch (C10186 e2) {
                e = e2;
                str = null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16263 m31145(C22941 c22941, ArrayList arrayList, String str, String str2, C23723 c23723) throws C10186 {
        C13244 c13244;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        C13244 c13245 = new C13244(c22941.m51742());
        ArrayList<C8002> arrayList3 = new ArrayList(c22941.m51742());
        C12884.sort(arrayList3, C2661.comparing(new C6360(1)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C17009 c17009 = (C17009) it3.next();
            C8060.m21953();
            c23723.f76912 = new C17755(null, c17009.f55576, c17009.f55575, c17009.f55577, c17009.f55578);
            C8002 entry = c22941.getEntry(c17009.f55576);
            if (!c17009.f55577) {
                c13244 = c13245;
                arrayList2 = arrayList3;
                it = it3;
                if (entry == null) {
                    throw C8060.m21951(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist");
                }
                m31147(entry);
                if (entry.m21856() && str2.isEmpty()) {
                    throw C8060.m21951(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                }
                C17755 c17755 = new C17755(entry, entry.getName(), c17009.f55575, false, c17009.f55578);
                c23723.f76912 = c17755;
                m31146(linkedHashMap, c17755, str);
            } else {
                if (!c17009.f55576.isEmpty() && entry == null && c13245.m18364(c17009.f55576) == null) {
                    throw C8060.m21951(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist");
                }
                if (entry != null) {
                    m31147(entry);
                }
                m31146(linkedHashMap, c23723.f76912, str);
                for (C8002 c8002 : arrayList3) {
                    if (c8002.getName().startsWith(c17009.f55576) && !c8002.getName().equals(c17009.f55576)) {
                        C13244 c13246 = c13245;
                        c23723.f76912 = new C17755(c8002, c8002.getName(), c17009.f55575, c8002.isDirectory(), c17009.f55578);
                        m31147(c8002);
                        String strSubstring = c8002.getName().substring(c17009.f55576.length());
                        boolean zIsDirectory = c8002.isDirectory();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = arrayList3;
                            if (i > strSubstring.length()) {
                                Iterator it4 = it3;
                                try {
                                    String strM35187 = C14584.m35187(strSubstring, zIsDirectory);
                                    if (zIsDirectory && !strM35187.isEmpty()) {
                                        strM35187 = strM35187 + "/";
                                    }
                                    if (!c8002.isDirectory() || !strM35187.isEmpty()) {
                                        String str3 = c17009.f55575;
                                        C17755 c17756 = new C17755(c8002, c8002.getName(), C0470.m2304("/".equals(str3) ? C14483.m34972(str3, strM35187) : C20196.m46451(str3, "/", strM35187), "destinationPath"), c8002.isDirectory(), c17009.f55578);
                                        c23723.f76912 = c17756;
                                        if (c8002.m21856() && str2.isEmpty()) {
                                            throw C8060.m21951(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                                        }
                                        m31146(linkedHashMap, c17756, str);
                                    }
                                    it3 = it4;
                                    arrayList3 = arrayList4;
                                    c13245 = c13246;
                                    break;
                                } catch (IOException unused) {
                                    throw C8060.m21951(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The ZIP entry has an unsafe extraction path");
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
                                throw C8060.m21951(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The extraction path contains a parent directory segment");
                            }
                            i2 = i + 1;
                            i++;
                            it3 = it2;
                            arrayList3 = arrayList4;
                        }
                    }
                }
                c13244 = c13245;
                arrayList2 = arrayList3;
                it = it3;
            }
            it3 = it;
            arrayList3 = arrayList2;
            c13245 = c13244;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (C17755 c17757 : linkedHashMap.values()) {
            c23723.f76912 = c17757;
            if (c17757.f58312) {
                linkedHashMap2.put(m31141(c17757.f58309), c17757);
            } else {
                arrayList5.add(c17757);
            }
            for (String strM31150 = m31150(c17757.f58309); strM31150 != null; strM31150 = m31150(strM31150)) {
                C17755 c17758 = (C17755) linkedHashMap.get(m31141(strM31150));
                if (c17758 != null && !c17758.f58312) {
                    throw m31144(c17758, c17757, strM31150);
                }
            }
            if (!c17757.f58312) {
                String strM31151 = m31150(c17757.f58309);
                if (strM31151 == null) {
                    throw C8060.m21951(JSON.object(), "FILE_PARENT_NOT_FOUND", "The output has no parent directory");
                }
                C11392.putIfAbsent(linkedHashMap2, m31141(strM31151), new C17755(null, c17757.f58313, strM31151, true, c17757.f58311));
            }
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.values());
        C12884.sort(arrayList6, C2661.comparingInt(new C2094()));
        return new C16263(arrayList6, arrayList5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31148(C16263 c16263, String str, boolean z, C23723 c23723) throws C10186 {
        C22209 c22209 = this.f40237;
        C9113 c9113M50227 = c22209.m50227();
        c9113M50227.m24268(str);
        for (C17755 c17755 : (ArrayList) c16263.f52849) {
            C8060.m21953();
            c23723.f76912 = c17755;
            c9113M50227.m24270(c17755.f58309);
            this.f40236.m36857(c17755.f58309);
        }
        for (C17755 c17756 : (ArrayList) c16263.f52850) {
            C8060.m21953();
            c23723.f76912 = c17756;
            c9113M50227.m24270(c17756.f58309);
            c9113M50227.m24269(c17756.f58309);
            int i = C25215.f81465[c22209.m50234(c17756.f58309).m6567().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw C8060.m21951(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "A directory cannot be used as an extracted file destination");
                    }
                    throw C10186.m26306("FILE_UNSUPPORTED_TYPE", "Extraction destinations must be regular files or missing paths", "fatal", null, JSON.object());
                }
            } else if (!z) {
                throw C8060.m21951(JSON.object(), "FILE_ALREADY_EXISTS", "An extraction destination exists and overwrite is false");
            }
            if (c22209.m50232(c17756.f58309).mo4298().mo8788(EnumC5636.CREATE_FILE_EXCLUSIVE) == EnumC15330.UNSUPPORTED) {
                throw C10186.m26306("FILE_BACKEND_UNSUPPORTED", "The destination backend cannot safely create temporary extraction files", "fatal", null, JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31149(C22941 c22941, C16263 c16263, String str, boolean z, C23723 c23723) throws C10186 {
        C22209 c22209;
        Iterator it = ((ArrayList) c16263.f52849).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c22209 = this.f40237;
            if (!zHasNext) {
                break;
            }
            C17755 c17755 = (C17755) it.next();
            c23723.f76912 = c17755;
            C8060.m21953();
            c22209.m50227().m24268(str);
            c23723.f76916 = true;
            C19861 c19861M36858 = this.f40236.m36858(c17755.f58309);
            c23723.f76916 = false;
            c23723.f76915 += c19861M36858.f63891;
            c23723.m52994(c19861M36858.f63892);
        }
        for (C17755 c17756 : (ArrayList) c16263.f52850) {
            c23723.f76912 = c17756;
            C8060.m21953();
            C9113 c9113M50227 = c22209.m50227();
            c9113M50227.m24268(str);
            c23723.f76916 = true;
            C16241 c16241M2661 = this.f40238.m2661(c17756.f58309, z, c9113M50227, new C11788(c22941, c17756, str));
            c23723.f76916 = false;
            c23723.f76911++;
            c23723.m52994(c16241M2661.f52789);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m31140(C8002 c8002, C22941 c22941) throws C10186 {
        try {
            return new C20739(c22941.m51733(c8002));
        } catch (IOException e) {
            throw m31151(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31147(C8002 c8002) throws C10186 {
        if ((c8002.m21828() & 61440) == 40960) {
            throw C10186.m26306("ZIP_UNSUPPORTED_ENTRY", "Symbolic link entries cannot be extracted by this tool", "fatal", null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31146(LinkedHashMap linkedHashMap, C17755 c17755, String str) throws C10186 {
        if (C14584.m35211(str, c17755.f58309)) {
            throw C8060.m21951(JSON.object(), "ZIP_SOURCE_DESTINATION_CONFLICT", "Extraction cannot replace its source ZIP");
        }
        C17755 c17756 = (C17755) C11392.putIfAbsent(linkedHashMap, m31141(c17755.f58309), c17755);
        if (c17756 != null) {
            throw m31144(c17756, c17755, c17755.f58309);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m31144(C17755 c17755, C17755 c17756, String str) {
        JSONArray jSONArrayArray = JSON.array(c17755.f58311);
        if (c17756.f58311 != c17755.f58311) {
            jSONArrayArray.add(c17756.f58311);
        }
        JSONArray jSONArrayArray2 = JSON.array(c17755.f58313);
        if (!c17756.f58313.equals(c17755.f58313)) {
            jSONArrayArray2.add(c17756.f58313);
        }
        return C8060.m21951(JSON.object().add("entryPaths", jSONArrayArray2).add("operationIndexes", jSONArrayArray).add("destinationPath", str), "ZIP_DESTINATION_CONFLICT", "Multiple ZIP entries require the same destination or a file as a parent directory");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31141(String str) {
        String strM35186 = C14584.m35186(str);
        if (strM35186 == null) {
            return str;
        }
        return "shared-storage:" + strM35186.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m31150(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m31151(IOException iOException) {
        if ((iOException instanceof InterruptedIOException) || Thread.currentThread().isInterrupted()) {
            return C8060.m21951(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
        if (iOException instanceof C16227) {
            return C8060.m21951(JSON.object(), "ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry");
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented")) {
            return C10186.m26306("ZIP_UNSUPPORTED", "The ZIP uses an unsupported archive, compression, or encryption feature", "fatal", null, JSON.object());
        }
        return C8060.m21951(JSON.object(), "ZIP_READ_FAILED", "The ZIP file or entry could not be read and verified");
    }
}
