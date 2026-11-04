package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.֡ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6L2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0602 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22209 f2399;

    public C0602(C22209 c22209) {
        this.f2399 = c22209;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2715(JSONObject jSONObject) throws C10186 {
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "recursive", "simple", "cursor", "limit");
        final String strM21956 = C8060.m21956(jSONObject, "entryPath");
        C8060.m21955(strM21956, "entryPath", true);
        final boolean zM21957 = C8060.m21957(jSONObject, "recursive");
        final boolean zM21958 = C8060.m21957(jSONObject, "simple");
        final String strM21957 = C8060.m21956(jSONObject, "cursor");
        final int iM21947 = C8060.m21947(jSONObject, "limit", 1, 1000);
        if (!strM21956.isEmpty() && !strM21956.endsWith("/")) {
            throw C8060.m21952(JSON.value(strM21956), "entryPath", "A ZIP directory path must end with /; use an empty string for the root");
        }
        return m2707(jSONObject, strM21956, false, new InterfaceC18501() { // from class: l.ۘᩳۚ
            @Override // l.InterfaceC18501
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final JSONObject mo13826(String str, C22941 c22941, C1907 c1907, C9113 c9113) {
                return C0602.m2711(strM21956, zM21957, strM21957, iM21947, zM21958, str, c22941, c1907, c9113);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m2711(String str, boolean z, String str2, int i, boolean z2, String str3, C22941 c22941, C1907 c1907, C9113 c9113) throws C10186 {
        int i2;
        boolean z3;
        String str4;
        C13244 c13244 = new C13244(c22941.m51742());
        if (!str.isEmpty() && c22941.getEntry(str) == null && c13244.m18364(str) == null) {
            throw m2714("ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist", str3, str);
        }
        String strM36182 = C15022.m36182(C15022.m36179().digest(C22121.m50076("layout", "zip-list-v2", MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("recursive", z).add("size", c1907.m6566()).add("modifiedAt", c1907.m6568()).add(am.bp, c9113.f29602).toString().getBytes(StandardCharsets.UTF_8)));
        String str5 = "The ZIP cursor is no longer valid; restart with cursor=\"\"";
        if (!str2.isEmpty()) {
            int iIndexOf = str2.indexOf(46);
            if (iIndexOf > 0 && iIndexOf <= 10 && str2.substring(iIndexOf + 1).equals(strM36182)) {
                try {
                    int i3 = Integer.parseInt(str2.substring(0, iIndexOf));
                    i2 = (i3 > 0 && Integer.toString(i3).equals(str2.substring(0, iIndexOf))) ? i3 : 0;
                } catch (NumberFormatException unused) {
                }
            }
            throw m2714("ZIP_INVALID_CURSOR", "The ZIP cursor is no longer valid; restart with cursor=\"\"", str3, str);
        }
        JSONArray jSONArrayArray = JSON.array();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c13244.m18365(str, C2661.comparing(new C6360(1))).iterator());
        int i4 = 0;
        while (true) {
            if (arrayDeque.isEmpty()) {
                z3 = false;
                break;
            }
            C8060.m21953();
            Iterator it = (Iterator) arrayDeque.peek();
            if (it.hasNext()) {
                C8002 c8002 = (C8002) it.next();
                int i5 = i4 + 1;
                if (i4 < i2) {
                    str5 = str5;
                } else {
                    if (jSONArrayArray.size() == i) {
                        z3 = true;
                        i4 = i5;
                        break;
                    }
                    String strSubstring = c8002.getName().substring(str.length());
                    if (z2) {
                        str5 = str5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        long size = c8002.getSize();
                        String str6 = "-";
                        sb.append(size >= 0 ? Long.toString(size) : "-");
                        sb.append(" ");
                        long jM21838 = c8002.m21838();
                        sb.append(jM21838 >= 0 ? Long.toString(jM21838) : "-");
                        sb.append(" ");
                        if (!c8002.isDirectory() && c8002.m21856()) {
                            str6 = "e";
                        }
                        strSubstring = C12669.m31438(sb, str6, " ", strSubstring);
                    }
                    jSONArrayArray.add(strSubstring);
                }
                if (z && c8002.isDirectory()) {
                    arrayDeque.push(c13244.m18365(c8002.getName(), C2661.comparing(new C6360(1))).iterator());
                }
                i4 = i5;
                str5 = str5;
            } else {
                arrayDeque.pop();
            }
        }
        if (i2 > i4) {
            throw m2714("ZIP_INVALID_CURSOR", str5, str3, str);
        }
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str).add("listing", jSONArrayArray);
        JSONObject jSONObjectAdd2 = JSON.object().add("hasMore", z3);
        if (z3) {
            str4 = (jSONArrayArray.size() + i2) + "." + strM36182;
        } else {
            str4 = "";
        }
        return jSONObjectAdd.add("pagination", jSONObjectAdd2.add("nextCursor", str4));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2716(JSONObject jSONObject) throws C10186 {
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "encoding", "startLine", "startColumn", "limit", "maxChars");
        final String strM21956 = C8060.m21956(jSONObject, "entryPath");
        C8060.m21955(strM21956, "entryPath", false);
        final String strM21957 = C8060.m21956(jSONObject, "password");
        final String strM21958 = C8060.m21956(jSONObject, "encoding");
        final long jM18216 = C6437.m18216(jSONObject, "startLine", 0L, 9007199254740991L);
        final long jM18217 = C6437.m18216(jSONObject, "startColumn", 0L, 9007199254740991L);
        final int iM21947 = C8060.m21947(jSONObject, "limit", 1, 2000);
        final int iM21948 = C8060.m21947(jSONObject, "maxChars", 2, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        return m2707(jSONObject, strM21956, false, new InterfaceC18501() { // from class: l.ۛᩳۚ
            @Override // l.InterfaceC18501
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo13826(String str, C22941 c22941, C1907 c1907, C9113 c9113) {
                return C0602.m2709(strM21956, strM21957, strM21958, jM18216, jM18217, iM21947, iM21948, str, c22941);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m2709(String str, String str2, String str3, long j, long j2, int i, int i2, String str4, C22941 c22941) throws C10186 {
        try {
            C21485 c21485 = new C21485(c22941.m51727(m2712(c22941, str4, str, str2)));
            try {
                C9616 c9616M20273 = C7380.m20273(c21485, str3, j, j2, i, i2);
                c21485.close();
                if (c9616M20273.f31103) {
                    return C22121.m50076(MotionUtils.EASING_TYPE_PATH, str4, "entryPath", str).add(TextBundle.TEXT_ENTRY, c9616M20273.f31102).add("encoding", c9616M20273.f31099).add("startLine", j).add("startColumn", j2).add("nextLine", c9616M20273.f31104).add("nextColumn", c9616M20273.f31105).add("returnedLineCount", c9616M20273.f31098).add("returnedCodePoints", c9616M20273.f31100).add("hasMore", c9616M20273.f31107);
                }
                C10186 c10186M2714 = m2714("ZIP_OFFSET_OUT_OF_RANGE", "The requested text position is outside the ZIP entry", str4, str);
                c10186M2714.f32602.add("finalLine", c9616M20273.f31101).add("finalColumn", c9616M20273.f31106);
                throw c10186M2714;
            } catch (Throwable th) {
                try {
                    c21485.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (CharacterCodingException | C10362 unused) {
            throw m2714("ZIP_TEXT_DECODE_FAILED", "The ZIP entry is not valid in the selected text encoding", str4, str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject m2717(JSONObject jSONObject) throws C10186 {
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "byteOffset", "maxBytes");
        final String strM21956 = C8060.m21956(jSONObject, "entryPath");
        C8060.m21955(strM21956, "entryPath", false);
        final String strM21957 = C8060.m21956(jSONObject, "password");
        final long jM18216 = C6437.m18216(jSONObject, "byteOffset", 0L, 9007199254740991L);
        final int iM21947 = C8060.m21947(jSONObject, "maxBytes", 1, 65536);
        return m2707(jSONObject, strM21956, false, new InterfaceC18501() { // from class: l.᩺ᩳۚ
            @Override // l.InterfaceC18501
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo13826(String str, C22941 c22941, C1907 c1907, C9113 c9113) {
                return C0602.m2708(strM21956, strM21957, iM21947, jM18216, str, c22941);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m2708(String str, String str2, int i, long j, String str3, C22941 c22941) throws C10186, IOException {
        C8002 c8002M2712 = m2712(c22941, str3, str, str2);
        byte[] bArrCopyOf = new byte[i];
        C21485 c21485 = new C21485(c22941.m51727(c8002M2712));
        long j2 = 0;
        while (true) {
            if (j2 < j) {
                try {
                    int i2 = c21485.read(bArrCopyOf, 0, (int) Math.min(i, j - j2));
                    if (i2 < 0) {
                        C10186 c10186M2714 = m2714("ZIP_OFFSET_OUT_OF_RANGE", "The byte offset is past the end of the ZIP entry", str3, str);
                        c10186M2714.f32602.add("size", j2);
                        throw c10186M2714;
                    }
                    j2 += (long) i2;
                } catch (Throwable th) {
                    try {
                        c21485.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                int i3 = 0;
                while (i3 < i) {
                    int i4 = c21485.read(bArrCopyOf, i3, i - i3);
                    if (i4 < 0) {
                        break;
                    }
                    i3 += i4;
                }
                boolean z = c21485.read() >= 0;
                long jM18217 = C6437.m18217("byteOffset", j, i3);
                long size = z ? c8002M2712.getSize() : jM18217;
                if (size < 0 || size > 9007199254740991L) {
                    size = -1;
                }
                long j3 = size;
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("byteOffset", j);
                if (i3 != i) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("hex", C16973.m40022(bArrCopyOf)).add("nextByteOffset", jM18217).add("totalBytes", j3).add("hasMore", z);
                c21485.close();
                return jSONObjectAdd2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final JSONObject m2718(JSONObject jSONObject) {
        C8060.m21954(jSONObject, MotionUtils.EASING_TYPE_PATH, "password");
        final String strM21956 = C8060.m21956(jSONObject, "password");
        return m2707(jSONObject, "", true, new InterfaceC18501() { // from class: l.ܰᩳۚ
            @Override // l.InterfaceC18501
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo13826(String str, C22941 c22941, C1907 c1907, C9113 c9113) {
                return C0602.m2710(strM21956, str, c22941);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m2710(String str, String str2, C22941 c22941) throws C10186 {
        int i = 0;
        try {
            byte[] bArr = new byte[65536];
            for (C8002 c8002 : c22941.m51734()) {
                c8002.getName();
                C8060.m21953();
                if (!c8002.isDirectory()) {
                    if (c8002.m21856() && str.isEmpty()) {
                        throw m2714("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str2, c8002.getName());
                    }
                    c22941.m51730(str);
                    C21485 c21485 = new C21485(c22941.m51733(c8002));
                    while (c21485.read(bArr) >= 0) {
                        try {
                            C8060.m21953();
                        } catch (Throwable th) {
                            try {
                                c21485.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c21485.close();
                    i++;
                }
            }
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("checkedEntries", i);
        } catch (IOException e) {
            C10186 c10186M2713 = m2713(e, str2, "", true);
            c10186M2713.f32602.put("checkedEntries", 0);
            throw c10186M2713;
        } catch (RuntimeException unused) {
            C10186 c10186M2714 = m2714("ZIP_TEST_FAILED", "The ZIP test could not be completed", str2, "");
            c10186M2714.f32602.put("checkedEntries", 0);
            throw c10186M2714;
        } catch (C10186 e2) {
            e2.f32602.put(MotionUtils.EASING_TYPE_PATH, str2).put("entryPath", "").put("checkedEntries", 0);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m2707(JSONObject jSONObject, String str, boolean z, InterfaceC18501 interfaceC18501) throws C10186 {
        boolean z2;
        C22209 c22209 = this.f2399;
        C9113 c9113M50227 = c22209.m50227();
        String strM50219 = C22209.m50219(C8060.m21956(jSONObject, MotionUtils.EASING_TYPE_PATH), c9113M50227, MotionUtils.EASING_TYPE_PATH);
        try {
            C19225 c19225M50228 = c22209.m50228(strM50219);
            try {
                C8060.m21953();
                C1907 c1907M21950 = C8060.m21950(c22209, strM50219, false);
                JSONObject jSONObject2 = null;
                try {
                    try {
                        C22941 c22941M51704 = C22941.m51704(c1907M21950.m6565(), z);
                        try {
                            try {
                                JSONObject jSONObjectMo13826 = interfaceC18501.mo13826(strM50219, c22941M51704, c1907M21950, c9113M50227);
                                C8060.m21953();
                                C1907 c1907M50234 = c22209.m50234(strM50219);
                                if (c1907M50234.m6567() != EnumC13093.REGULAR || c1907M21950.m6566() != c1907M50234.m6566() || c1907M21950.m6568() != c1907M50234.m6568()) {
                                    throw m2714("ZIP_CHANGED_DURING_READ", "The ZIP file changed during this read; start again", strM50219, str);
                                }
                                c22209.m50227().m24268(strM50219);
                                c22941M51704.close();
                                c19225M50228.close();
                                return jSONObjectMo13826;
                            } catch (IOException e) {
                                e = e;
                                z2 = true;
                                C10186 c10186M2713 = m2713(e, strM50219, str, z && !z2 && ((e instanceof ZipException) || (e instanceof EOFException)));
                                if (z && "ZIP_READ_FAILED".equals(c10186M2713.f32601)) {
                                    c10186M2713 = m2714("ZIP_TEST_FAILED", "The ZIP test could not be completed", strM50219, str);
                                }
                                if (z && 0 != 0) {
                                    c10186M2713.f32602.put("checkedEntries", jSONObject2.getInt("checkedEntries"));
                                }
                                throw c10186M2713;
                            }
                        } catch (Throwable th) {
                            try {
                                c22941M51704.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (RuntimeException unused) {
                        throw m2714(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP operation could not be completed", strM50219, str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
            } catch (Throwable th3) {
                try {
                    c19225M50228.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C10186 e3) {
            e = e3;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f32601)) {
                e = m2714("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", strM50219, str);
            }
            JSONObject jSONObject3 = e.f32602;
            jSONObject3.put(MotionUtils.EASING_TYPE_PATH, strM50219);
            if (jSONObject3.get("entryPath") == null) {
                jSONObject3.put("entryPath", str);
            }
            if (z && jSONObject3.get("checkedEntries") == null) {
                jSONObject3.put("checkedEntries", 0);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8002 m2712(C22941 c22941, String str, String str2, String str3) throws C10186 {
        C8002 entry = c22941.getEntry(str2);
        if (entry == null) {
            throw m2714("ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist", str, str2);
        }
        if (entry.isDirectory()) {
            throw m2714("ZIP_ENTRY_IS_DIRECTORY", "A directory cannot be read as file content", str, str2);
        }
        if (entry.m21856() && str3.isEmpty()) {
            throw m2714("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str, entry.getName());
        }
        c22941.m51730(str3);
        return entry;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2713(IOException iOException, String str, String str2, boolean z) {
        if (Thread.currentThread().isInterrupted()) {
            return m2714("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
        }
        boolean z2 = false;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof InterruptedIOException) {
                return m2714("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
            }
            if (cause instanceof C7278) {
                z2 = true;
            }
        }
        if (z2) {
            return m2714(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP storage could not be read", str, str2);
        }
        if (iOException instanceof C16227) {
            return m2714("ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry", str, str2);
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented") || lowerCase.contains("requires a dictionary")) {
            return C10186.m26306("ZIP_UNSUPPORTED", "The ZIP uses an unsupported compression, encryption, or archive feature", "fatal", null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "entryPath", str2));
        }
        return m2714(z ? "ZIP_INVALID" : "ZIP_READ_FAILED", z ? "ZIP structure, length, checksum, or authentication validation failed" : "The ZIP file or entry could not be read", str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m2714(String str, String str2, String str3, String str4) {
        return C8060.m21951(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str4), str, str2);
    }
}
