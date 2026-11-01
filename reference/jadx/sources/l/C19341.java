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

/* JADX INFO: renamed from: l.᩵۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I6L2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19341 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2800 f62366;

    public C19341(C2800 c2800) {
        this.f62366 = c2800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44333(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "recursive", "simple", "cursor", "limit");
        final String strM22723 = C8758.m22723(jSONObject, "entryPath");
        C8758.m22722(strM22723, "entryPath", true);
        final boolean zM22724 = C8758.m22724(jSONObject, "recursive");
        final boolean zM22725 = C8758.m22724(jSONObject, "simple");
        final String strM22724 = C8758.m22723(jSONObject, "cursor");
        final int iM22714 = C8758.m22714(jSONObject, "limit", 1, 1000);
        if (!strM22723.isEmpty() && !strM22723.endsWith("/")) {
            throw C8758.m22719(JSON.value(strM22723), "entryPath", "A ZIP directory path must end with /; use an empty string for the root");
        }
        return m44324(jSONObject, strM22723, false, new InterfaceC8052() { // from class: l.᩸۠۬
            @Override // l.InterfaceC8052
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo21182(String str, C2455 c2455, C5928 c5928, C3070 c3070) {
                return C19341.m44328(strM22723, zM22724, strM22724, iM22714, zM22725, str, c2455, c5928, c3070);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44328(String str, boolean z, String str2, int i, boolean z2, String str3, C2455 c2455, C5928 c5928, C3070 c3070) throws C12731 {
        int i2;
        boolean z3;
        String str4;
        C1044 c1044 = new C1044(c2455.m7466());
        if (!str.isEmpty() && c2455.getEntry(str) == null && c1044.m25250(str) == null) {
            throw m44331("ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist", str3, str);
        }
        String strM49424 = C22253.m49424(C22253.m49421().digest(C3184.m9603("layout", "zip-list-v2", MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("recursive", z).add("size", c5928.m16197()).add("modifiedAt", c5928.m16198()).add(am.bp, c3070.f11560).toString().getBytes(StandardCharsets.UTF_8)));
        String str5 = "The ZIP cursor is no longer valid; restart with cursor=\"\"";
        if (!str2.isEmpty()) {
            int iIndexOf = str2.indexOf(46);
            if (iIndexOf > 0 && iIndexOf <= 10 && str2.substring(iIndexOf + 1).equals(strM49424)) {
                try {
                    int i3 = Integer.parseInt(str2.substring(0, iIndexOf));
                    i2 = (i3 > 0 && Integer.toString(i3).equals(str2.substring(0, iIndexOf))) ? i3 : 0;
                } catch (NumberFormatException unused) {
                }
            }
            throw m44331("ZIP_INVALID_CURSOR", "The ZIP cursor is no longer valid; restart with cursor=\"\"", str3, str);
        }
        JSONArray jSONArrayArray = JSON.array();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1044.m25251(str, C7618.comparing(new C12964(2))).iterator());
        int i4 = 0;
        while (true) {
            if (arrayDeque.isEmpty()) {
                z3 = false;
                break;
            }
            C8758.m22720();
            Iterator it = (Iterator) arrayDeque.peek();
            if (it.hasNext()) {
                C12107 c12107 = (C12107) it.next();
                int i5 = i4 + 1;
                if (i4 < i2) {
                    str5 = str5;
                } else {
                    if (jSONArrayArray.size() == i) {
                        z3 = true;
                        i4 = i5;
                        break;
                    }
                    String strSubstring = c12107.getName().substring(str.length());
                    if (z2) {
                        str5 = str5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        long size = c12107.getSize();
                        String str6 = "-";
                        sb.append(size >= 0 ? Long.toString(size) : "-");
                        sb.append(" ");
                        long jM30138 = c12107.m30138();
                        sb.append(jM30138 >= 0 ? Long.toString(jM30138) : "-");
                        sb.append(" ");
                        if (!c12107.isDirectory() && c12107.m30133()) {
                            str6 = "e";
                        }
                        strSubstring = C1694.m5622(sb, str6, " ", strSubstring);
                    }
                    jSONArrayArray.add(strSubstring);
                }
                if (z && c12107.isDirectory()) {
                    arrayDeque.push(c1044.m25251(c12107.getName(), C7618.comparing(new C12964(2))).iterator());
                }
                i4 = i5;
                str5 = str5;
            } else {
                arrayDeque.pop();
            }
        }
        if (i2 > i4) {
            throw m44331("ZIP_INVALID_CURSOR", str5, str3, str);
        }
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str).add("listing", jSONArrayArray);
        JSONObject jSONObjectAdd2 = JSON.object().add("hasMore", z3);
        if (z3) {
            str4 = (jSONArrayArray.size() + i2) + "." + strM49424;
        } else {
            str4 = "";
        }
        return jSONObjectAdd.add("pagination", jSONObjectAdd2.add("nextCursor", str4));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44334(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "encoding", "startLine", "startColumn", "limit", "maxChars");
        final String strM22723 = C8758.m22723(jSONObject, "entryPath");
        C8758.m22722(strM22723, "entryPath", false);
        final String strM22724 = C8758.m22723(jSONObject, "password");
        final String strM22725 = C8758.m22723(jSONObject, "encoding");
        final long jM38376 = C16249.m38376(jSONObject, "startLine", 0L, 9007199254740991L);
        final long jM38377 = C16249.m38376(jSONObject, "startColumn", 0L, 9007199254740991L);
        final int iM22714 = C8758.m22714(jSONObject, "limit", 1, 2000);
        final int iM22715 = C8758.m22714(jSONObject, "maxChars", 2, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        return m44324(jSONObject, strM22723, false, new InterfaceC8052() { // from class: l.᩺۠۬
            @Override // l.InterfaceC8052
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo21182(String str, C2455 c2455, C5928 c5928, C3070 c3070) {
                return C19341.m44326(strM22723, strM22724, strM22725, jM38376, jM38377, iM22714, iM22715, str, c2455);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44326(String str, String str2, String str3, long j, long j2, int i, int i2, String str4, C2455 c2455) throws C12731 {
        try {
            C18635 c18635 = new C18635(c2455.m7471(m44329(c2455, str4, str, str2)));
            try {
                C1907 c1907M13676 = C4917.m13676(c18635, str3, j, j2, i, i2);
                c18635.close();
                if (c1907M13676.f7188) {
                    return C3184.m9603(MotionUtils.EASING_TYPE_PATH, str4, "entryPath", str).add(TextBundle.TEXT_ENTRY, c1907M13676.f7193).add("encoding", c1907M13676.f7191).add("startLine", j).add("startColumn", j2).add("nextLine", c1907M13676.f7197).add("nextColumn", c1907M13676.f7192).add("returnedLineCount", c1907M13676.f7190).add("returnedCodePoints", c1907M13676.f7195).add("hasMore", c1907M13676.f7189);
                }
                C12731 c12731M44331 = m44331("ZIP_OFFSET_OUT_OF_RANGE", "The requested text position is outside the ZIP entry", str4, str);
                c12731M44331.f42468.add("finalLine", c1907M13676.f7194).add("finalColumn", c1907M13676.f7196);
                throw c12731M44331;
            } catch (Throwable th) {
                try {
                    c18635.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (CharacterCodingException | C23781 unused) {
            throw m44331("ZIP_TEXT_DECODE_FAILED", "The ZIP entry is not valid in the selected text encoding", str4, str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44335(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "byteOffset", "maxBytes");
        final String strM22723 = C8758.m22723(jSONObject, "entryPath");
        C8758.m22722(strM22723, "entryPath", false);
        final String strM22724 = C8758.m22723(jSONObject, "password");
        final long jM38376 = C16249.m38376(jSONObject, "byteOffset", 0L, 9007199254740991L);
        final int iM22714 = C8758.m22714(jSONObject, "maxBytes", 1, 65536);
        return m44324(jSONObject, strM22723, false, new InterfaceC8052() { // from class: l.ܶ۠۬
            @Override // l.InterfaceC8052
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo21182(String str, C2455 c2455, C5928 c5928, C3070 c3070) {
                return C19341.m44325(strM22723, strM22724, iM22714, jM38376, str, c2455);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44325(String str, String str2, int i, long j, String str3, C2455 c2455) throws C12731, IOException {
        C12107 c12107M44329 = m44329(c2455, str3, str, str2);
        byte[] bArrCopyOf = new byte[i];
        C18635 c18635 = new C18635(c2455.m7471(c12107M44329));
        long j2 = 0;
        while (true) {
            if (j2 < j) {
                try {
                    int i2 = c18635.read(bArrCopyOf, 0, (int) Math.min(i, j - j2));
                    if (i2 < 0) {
                        C12731 c12731M44331 = m44331("ZIP_OFFSET_OUT_OF_RANGE", "The byte offset is past the end of the ZIP entry", str3, str);
                        c12731M44331.f42468.add("size", j2);
                        throw c12731M44331;
                    }
                    j2 += (long) i2;
                } catch (Throwable th) {
                    try {
                        c18635.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                int i3 = 0;
                while (i3 < i) {
                    int i4 = c18635.read(bArrCopyOf, i3, i - i3);
                    if (i4 < 0) {
                        break;
                    }
                    i3 += i4;
                }
                boolean z = c18635.read() >= 0;
                long jM38377 = C16249.m38377("byteOffset", j, i3);
                long size = z ? c12107M44329.getSize() : jM38377;
                if (size < 0 || size > 9007199254740991L) {
                    size = -1;
                }
                long j3 = size;
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("byteOffset", j);
                if (i3 != i) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("hex", C9754.m24738(bArrCopyOf)).add("nextByteOffset", jM38377).add("totalBytes", j3).add("hasMore", z);
                c18635.close();
                return jSONObjectAdd2;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44332(JSONObject jSONObject) throws C12731 {
        C8758.m22721(jSONObject, MotionUtils.EASING_TYPE_PATH, "password");
        final String strM22723 = C8758.m22723(jSONObject, "password");
        return m44324(jSONObject, "", true, new InterfaceC8052() { // from class: l.ᩳ۠۬
            @Override // l.InterfaceC8052
            /* JADX INFO: renamed from: ۙ */
            public final JSONObject mo21182(String str, C2455 c2455, C5928 c5928, C3070 c3070) {
                return C19341.m44327(strM22723, str, c2455);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44327(String str, String str2, C2455 c2455) throws C12731 {
        String name = "";
        int i = 0;
        try {
            byte[] bArr = new byte[65536];
            for (C12107 c12107 : c2455.m7468()) {
                name = c12107.getName();
                C8758.m22720();
                if (!c12107.isDirectory()) {
                    if (c12107.m30133() && str.isEmpty()) {
                        throw m44331("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str2, c12107.getName());
                    }
                    c2455.m7474(str);
                    C18635 c18635 = new C18635(c2455.m7478(c12107));
                    while (c18635.read(bArr) >= 0) {
                        try {
                            C8758.m22720();
                        } catch (Throwable th) {
                            try {
                                c18635.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c18635.close();
                    i++;
                }
            }
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("checkedEntries", i);
        } catch (IOException e) {
            C12731 c12731M44330 = m44330(e, str2, name, true);
            c12731M44330.f42468.put("checkedEntries", i);
            throw c12731M44330;
        } catch (RuntimeException unused) {
            C12731 c12731M44331 = m44331("ZIP_TEST_FAILED", "The ZIP test could not be completed", str2, name);
            c12731M44331.f42468.put("checkedEntries", i);
            throw c12731M44331;
        } catch (C12731 e2) {
            e2.f42468.put(MotionUtils.EASING_TYPE_PATH, str2).put("entryPath", name).put("checkedEntries", i);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m44324(JSONObject jSONObject, String str, boolean z, InterfaceC8052 interfaceC8052) throws C12731 {
        boolean z2;
        C2800 c2800 = this.f62366;
        C3070 c3070M8504 = c2800.m8504();
        String strM8495 = C2800.m8495(C8758.m22723(jSONObject, MotionUtils.EASING_TYPE_PATH), c3070M8504, MotionUtils.EASING_TYPE_PATH);
        try {
            C11268 c11268M8505 = c2800.m8505(strM8495);
            try {
                C8758.m22720();
                C5928 c5928M22717 = C8758.m22717(c2800, strM8495, false);
                JSONObject jSONObject2 = null;
                try {
                    try {
                        C2455 c2455M7447 = C2455.m7447(c5928M22717.m16195(), z);
                        try {
                            try {
                                JSONObject jSONObjectMo21182 = interfaceC8052.mo21182(strM8495, c2455M7447, c5928M22717, c3070M8504);
                                C8758.m22720();
                                C5928 c5928M8503 = c2800.m8503(strM8495);
                                if (c5928M8503.m16196() != EnumC12279.REGULAR || c5928M22717.m16197() != c5928M8503.m16197() || c5928M22717.m16198() != c5928M8503.m16198()) {
                                    throw m44331("ZIP_CHANGED_DURING_READ", "The ZIP file changed during this read; start again", strM8495, str);
                                }
                                c2800.m8504().m9209(strM8495);
                                c2455M7447.close();
                                c11268M8505.close();
                                return jSONObjectMo21182;
                            } catch (IOException e) {
                                e = e;
                                z2 = true;
                                C12731 c12731M44330 = m44330(e, strM8495, str, z && !z2 && ((e instanceof ZipException) || (e instanceof EOFException)));
                                if (z && "ZIP_READ_FAILED".equals(c12731M44330.f42472)) {
                                    c12731M44330 = m44331("ZIP_TEST_FAILED", "The ZIP test could not be completed", strM8495, str);
                                }
                                if (z && 0 != 0) {
                                    c12731M44330.f42468.put("checkedEntries", jSONObject2.getInt("checkedEntries"));
                                }
                                throw c12731M44330;
                            }
                        } catch (Throwable th) {
                            try {
                                c2455M7447.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (RuntimeException unused) {
                        throw m44331(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP operation could not be completed", strM8495, str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
            } catch (Throwable th3) {
                try {
                    c11268M8505.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C12731 e3) {
            e = e3;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f42472)) {
                e = m44331("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", strM8495, str);
            }
            JSONObject jSONObject3 = e.f42468;
            jSONObject3.put(MotionUtils.EASING_TYPE_PATH, strM8495);
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
    public static C12107 m44329(C2455 c2455, String str, String str2, String str3) throws C12731 {
        C12107 entry = c2455.getEntry(str2);
        if (entry == null) {
            throw m44331("ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist", str, str2);
        }
        if (entry.isDirectory()) {
            throw m44331("ZIP_ENTRY_IS_DIRECTORY", "A directory cannot be read as file content", str, str2);
        }
        if (entry.m30133() && str3.isEmpty()) {
            throw m44331("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str, entry.getName());
        }
        c2455.m7474(str3);
        return entry;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m44330(IOException iOException, String str, String str2, boolean z) {
        if (Thread.currentThread().isInterrupted()) {
            return m44331("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
        }
        boolean z2 = false;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof InterruptedIOException) {
                return m44331("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
            }
            if (cause instanceof C9513) {
                z2 = true;
            }
        }
        if (z2) {
            return m44331(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP storage could not be read", str, str2);
        }
        if (iOException instanceof C17978) {
            return m44331("ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry", str, str2);
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented") || lowerCase.contains("requires a dictionary")) {
            return C12731.m31631("ZIP_UNSUPPORTED", "The ZIP uses an unsupported compression, encryption, or archive feature", "fatal", null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "entryPath", str2));
        }
        return m44331(z ? "ZIP_INVALID" : "ZIP_READ_FAILED", z ? "ZIP structure, length, checksum, or authentication validation failed" : "The ZIP file or entry could not be read", str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m44331(String str, String str2, String str3, String str4) {
        return C8758.m22718(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str4), str, str2);
    }
}
