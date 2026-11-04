package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.utils.c;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2861 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f9433 = new StringBuilder();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f9434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f9435;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9411(JSONObject jSONObject, String str, String str2) {
        String strM15167 = C4967.m15167(jSONObject, str);
        if (!strM15167.isEmpty()) {
            return strM15167;
        }
        String strM15168 = C4967.m15167(jSONObject, str2);
        return strM15168.isEmpty() ? "" : C21576.m49059(R.string.MT_Protector, C21576.m49059(R.string.MT_Protector, new Object[0]), C4967.m15168(strM15168.length(), strM15168, true).f44494);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9431(JSONObject jSONObject, String str, int i, int i2) {
        if (C4967.m15167(jSONObject, str).isEmpty()) {
            m9412(i, C21576.m49059(i2, new Object[0]), false);
        } else {
            m9422(i, jSONObject, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9432(JSONObject jSONObject, EnumC8827 enumC8827) {
        String strM49059;
        long j;
        int i;
        int i2;
        long j2;
        String strM22393;
        ?? r3;
        long j3 = 0;
        int i3 = 3;
        if (C4967.m15167(jSONObject, "view").equals("resource_table_variants")) {
            JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "items");
            m9413(C21576.m49059(R.string.MT_Protector, Integer.valueOf(jSONArrayM20123.size())), false);
            ?? r4 = 0;
            int i4 = 0;
            while (i4 < Math.min(3, jSONArrayM20123.size())) {
                JSONObject jSONObjectM20134 = C7336.m20134(jSONArrayM20123, i4);
                String strM15167 = C4967.m15167(jSONObjectM20134, "packageId");
                String strM15168 = C4967.m15167(jSONObjectM20134, "packageName");
                ?? M46451 = C20196.m46451(strM15167, ":", strM15168);
                if (!M46451.equals(r4)) {
                    if (!strM15168.isEmpty()) {
                        r3 = r4;
                        strM15167 = strM15168;
                    }
                    r3 = r4;
                    m9438(strM15167);
                    r3 = M46451;
                }
                r3 = r4;
                String strM15169 = C4967.m15167(jSONObjectM20134, "typeName");
                String strM151610 = C4967.m15167(jSONObjectM20134, "variant");
                m9413(C7336.m20139(strM151610.equals("default") ? C21576.m49059(R.string.MT_Protector, strM15169) : C14483.m34972(strM15169, strM151610), " · ", C21576.m49059(R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObjectM20134, "entryCount", 0L)))), false);
                i4++;
                r4 = r3;
            }
            m9421(jSONArrayM20123.size());
            m9435(jSONObject);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        String[] strArr = {"items", "listing", "hits", "refs"};
        for (int i5 = 0; i5 < 4; i5++) {
            JSONValue jSONValue = jSONObject.get(strArr[i5]);
            if (jSONValue != null && jSONValue.isArray()) {
                jSONArray = jSONValue.asArray();
                break;
            }
        }
        if (C4967.m15167(jSONObject, "view").equals("resource_table")) {
            strM49059 = C21576.m49059(R.string.MT_Protector, Integer.valueOf(jSONArray.size()));
        } else {
            strM49059 = C21576.m49059(m9418(jSONObject) ? R.string.MT_Protector : R.string.MT_Protector, Integer.valueOf(jSONArray.size()));
        }
        m9413(strM49059, false);
        if (enumC8827 == EnumC8827.NONE) {
            m9425(jSONArray);
        } else {
            int i6 = 0;
            while (i6 < Math.min(i3, jSONArray.size())) {
                if (jSONArray.get(i6).isString()) {
                    String strAsString = jSONArray.get(i6).asString();
                    String strM15164 = C4967.m15164(c.e, strAsString);
                    int iIndexOf = strM15164.indexOf(32);
                    int iIndexOf2 = iIndexOf < 0 ? -1 : strM15164.indexOf(32, iIndexOf + 1);
                    int iIndexOf3 = iIndexOf2 < 0 ? -1 : strM15164.indexOf(32, iIndexOf2 + 1);
                    if (iIndexOf <= 0 || iIndexOf2 <= (i = iIndexOf + 1) || iIndexOf3 <= (i2 = iIndexOf2 + 1)) {
                        j = j3;
                        m9413(strM15164, false);
                    } else {
                        try {
                            j2 = Long.parseLong(enumC8827 == EnumC8827.FILE ? strM15164.substring(i, iIndexOf2) : strM15164.substring(0, iIndexOf));
                        } catch (NumberFormatException unused) {
                            j2 = -1;
                        }
                        String strSubstring = strM15164.substring(iIndexOf3 + 1);
                        if (enumC8827 == EnumC8827.FILE) {
                            String strSubstring2 = strM15164.substring(0, iIndexOf);
                            strSubstring2.getClass();
                            switch (strSubstring2) {
                                case "d":
                                    strM22393 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    break;
                                case "l":
                                    strM22393 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    break;
                                case "o":
                                    strM22393 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                    break;
                                default:
                                    if (j2 >= 0) {
                                        strM22393 = C8311.m22393(j2);
                                        break;
                                    } else {
                                        strM22393 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                        break;
                                    }
                                    break;
                            }
                            j = 0;
                        } else {
                            if (strAsString.endsWith("/")) {
                                strM22393 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                                j = 0;
                            } else {
                                j = 0;
                                strM22393 = j2 >= 0 ? C8311.m22393(j2) : "";
                            }
                            if (strM15164.substring(i2, iIndexOf3).equals("e")) {
                                strM22393 = C7336.m20139(strM22393, " · ", C21576.m49059(R.string.MT_Protector, new Object[0]));
                            }
                        }
                        m9413(C7336.m20139(strSubstring, " · ", strM22393), false);
                    }
                } else {
                    j = j3;
                }
                i6++;
                i3 = 3;
                j3 = j;
            }
            m9421(jSONArray.size());
        }
        m9435(jSONObject);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9445(JSONObject jSONObject) {
        String strSubstring;
        int iIndexOf;
        String strM15167 = C4967.m15167(jSONObject, "argument");
        if (strM15167.isEmpty() || strM15167.length() > 96) {
            return;
        }
        for (int i = 0; i < strM15167.length(); i++) {
            char cCharAt = strM15167.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '.' || cCharAt == '[' || cCharAt == ']'))) {
                return;
            }
        }
        String strM15168 = C4967.m15167(jSONObject, "badValueType");
        String strM15169 = C4967.m15167(jSONObject, "message");
        if (!strM15169.equals("Missing ".concat(strM15167)) && !strM15169.equals("Missing parameter: ".concat(strM15167))) {
            m9412(R.string.MT_Protector, strM15167, false);
            if (strM15168.equals("string") || strM15168.equals("number") || strM15168.equals(ClassTransform.BOOLEAN) || strM15168.equals("object") || strM15168.equals("array") || strM15168.equals("null")) {
                m9412(R.string.MT_Protector, strM15168, false);
            }
            if (C4967.m15171(strM15167)) {
                return;
            }
            String strM151610 = C4967.m15167(jSONObject, "badValue");
            if ((strM15168.equals("number") && m9417(strM151610)) || (strM15168.equals(ClassTransform.BOOLEAN) && (strM151610.equals("true") || strM151610.equals("false")))) {
                m9412(R.string.MT_Protector, strM151610, false);
            }
            JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "allowedValues");
            if (!jSONArrayM20123.isEmpty()) {
                m9426(jSONArrayM20123, R.string.MT_Protector);
                return;
            }
            String strConcat = strM15167.concat(" must be between ");
            if (!strM15169.startsWith(strConcat) || (iIndexOf = (strSubstring = strM15169.substring(strConcat.length())).indexOf(" and ")) <= 0) {
                return;
            }
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            String strSubstring3 = strSubstring.substring(iIndexOf + 5);
            if (m9417(strSubstring2) && m9417(strSubstring3)) {
                m9413(C21576.m49059(R.string.MT_Protector, strSubstring2, strSubstring3), false);
                return;
            }
            return;
        }
        m9413(C21576.m49059(R.string.MT_Protector, strM15167), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9447(JSONObject jSONObject, boolean z) {
        String strM15167 = C4967.m15167(jSONObject, z ? "destinationPath" : "sourcePath");
        String strM15168 = C4967.m15167(jSONObject, "entryPath");
        JSONValue jSONValue = jSONObject.get("entryPath");
        if (jSONValue != null && jSONValue.isString() && strM15168.isEmpty()) {
            strM15168 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        }
        String str = z ? strM15168 : strM15167;
        if (!z) {
            strM15167 = strM15168;
        }
        C14047 c14047M15168 = C4967.m15168(220, str, true);
        C14047 c14047M15169 = C4967.m15168(220, strM15167, true);
        m9413(c14047M15168.f44494 + " → " + c14047M15169.f44494, c14047M15169.f44495);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9412(int i, String str, boolean z) {
        m9413(C21576.m49059(R.string.MT_Protector, C21576.m49059(i, new Object[0]), C4967.m15168(str.length(), str, true).f44494), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9424(int i, Object... objArr) {
        m9413(C21576.m49059(i, objArr), false);
    }

    public C2861(int i) {
        this.f9434 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9443(int i, String str) {
        m9412(i, str, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9429(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayM20123 = C7336.m20123(jSONObject2, "results");
        JSONArray jSONArrayM20124 = C7336.m20123(C7336.m20135(jSONObject), "adds");
        boolean z = !jSONArrayM20123.isEmpty() && jSONArrayM20123.size() <= 200;
        long j = 0;
        int i = 0;
        int i2 = 0;
        long size = 0;
        while (z && i < jSONArrayM20123.size()) {
            JSONObject jSONObjectM20134 = C7336.m20134(jSONArrayM20123, i);
            long jM20133 = C7336.m20133(jSONObjectM20134, "index", -1L);
            String strM15167 = (jM20133 < j || jM20133 >= ((long) jSONArrayM20124.size())) ? "" : C4967.m15167(C7336.m20134(jSONArrayM20124, (int) jM20133), "kind");
            if (strM15167.equals("resource")) {
                i2++;
            } else if (!strM15167.equals("variant")) {
                z = false;
            }
            size += (long) C7336.m20123(jSONObjectM20134, "values").size();
            i++;
            j = 0;
        }
        if (!z) {
            m9413(C21576.m49059(R.string.MT_Protector, Integer.valueOf(jSONArrayM20123.size())), false);
            return;
        }
        if (i2 > 0) {
            m9413(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i2)), false);
        }
        if (size > 0) {
            m9413(C21576.m49059(R.string.MT_Protector, Long.valueOf(size)), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9419(JSONObject jSONObject) {
        ?? r10;
        String strM49059;
        boolean z;
        String strM490510;
        boolean z2;
        JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "results");
        long jM20133 = C7336.m20133(jSONObject, "changedCount", 0L);
        long jM20134 = C7336.m20133(jSONObject, "noOpCount", 0L);
        HashSet hashSet = new HashSet();
        boolean z3 = !jSONArrayM20123.isEmpty() && jSONArrayM20123.size() <= 200;
        for (int i = 0; z3 && i < jSONArrayM20123.size(); i++) {
            JSONObject jSONObjectM20134 = C7336.m20134(jSONArrayM20123, i);
            String strM15167 = C4967.m15167(jSONObjectM20134, "locator");
            if (strM15167.isEmpty() || !(C7336.m20121(jSONObjectM20134, "changed") || C7336.m20104(jSONObjectM20134, "changed"))) {
                z3 = false;
            } else if (C7336.m20121(jSONObjectM20134, "changed")) {
                hashSet.add(strM15167);
            }
        }
        if (C7336.m20104(jSONObject, "changed") || jM20133 == 0) {
            r10 = 0;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else {
            if (z3) {
                z2 = false;
                m9413(C21576.m49059(R.string.MT_Protector, Integer.valueOf(hashSet.size())), false);
            } else {
                z2 = false;
            }
            Object[] objArr = new Object[1];
            objArr[z2 ? 1 : 0] = Long.valueOf(jM20133);
            strM49059 = C21576.m49059(R.string.MT_Protector, objArr);
            r10 = z2;
        }
        m9413(strM49059, (boolean) r10);
        if (jM20134 > 0) {
            Object[] objArr2 = new Object[1];
            objArr2[r10] = Long.valueOf(jM20134);
            m9413(C21576.m49059(R.string.MT_Protector, objArr2), (boolean) r10);
        }
        for (int i2 = 0; i2 < Math.min(3, jSONArrayM20123.size()); i2++) {
            JSONObject jSONObjectM20135 = C7336.m20134(jSONArrayM20123, i2);
            m9438("");
            m9422(R.string.MT_Protector, jSONObjectM20135, "locator");
            m9422(R.string.MT_Protector, jSONObjectM20135, "variant");
            if (C7336.m20121(jSONObjectM20135, "changed")) {
                z = false;
                strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            } else {
                z = false;
                if (C7336.m20104(jSONObjectM20135, "changed")) {
                    strM490510 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                }
            }
            m9413(strM490510, z);
        }
        m9421(jSONArrayM20123.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9427(JSONObject jSONObject) {
        JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "patches");
        boolean z = !jSONArrayM20123.isEmpty() && jSONArrayM20123.size() <= 200;
        long length = 0;
        for (int i = 0; z && i < jSONArrayM20123.size(); i++) {
            JSONObject jSONObjectM20134 = C7336.m20134(jSONArrayM20123, i);
            JSONValue jSONValue = jSONObjectM20134.get("beforeHex");
            JSONValue jSONValue2 = jSONObjectM20134.get("afterHex");
            if (jSONValue == null || jSONValue2 == null || !jSONValue.isString() || !jSONValue2.isString()) {
                z = false;
                break;
            }
            String strAsString = jSONValue.asString();
            String strAsString2 = jSONValue2.asString();
            length += (long) strAsString.length();
            z = !strAsString.isEmpty() && strAsString.length() % 2 == 0 && length <= 131072 && strAsString.equalsIgnoreCase(strAsString2);
        }
        if (z) {
            m9413(C21576.m49059(R.string.MT_Protector, new Object[0]), false);
        }
        m9413(C21576.m49059(R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObject, "bytesPatched", 0L))), false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0170  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9430(JSONObject jSONObject, String str) {
        String strM49059;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2123511115:
                if (str.equals("mt_file_create_directory")) {
                    b = 0;
                }
                break;
            case -1763539933:
                if (str.equals("mt_file_transfer_cancel")) {
                    b = 1;
                }
                break;
            case -1174937436:
                if (str.equals("mt_file_delete_directory")) {
                    b = 2;
                }
                break;
            case -1070178551:
                if (str.equals("mt_file_patch_bytes")) {
                    b = 3;
                }
                break;
            case -299333417:
                if (str.equals("mt_file_edit_text")) {
                    b = 4;
                }
                break;
            case -207074976:
                if (str.equals("mt_file_write_bytes")) {
                    b = 5;
                }
                break;
            case 250516771:
                if (str.equals("mt_file_replace_text")) {
                    b = 6;
                }
                break;
            case 386458560:
                if (str.equals("mt_file_copy")) {
                    b = 7;
                }
                break;
            case 386756636:
                if (str.equals("mt_file_move")) {
                    b = 8;
                }
                break;
            case 462356615:
                if (str.equals("mt_file_append_text")) {
                    b = 9;
                }
                break;
            case 714809027:
                if (str.equals("mt_apk_copy_entry")) {
                    b = 10;
                }
                break;
            case 769908445:
                if (str.equals("mt_file_truncate_bytes")) {
                    b = 11;
                }
                break;
            case 1011302619:
                if (str.equals("mt_file_transfer_create_upload")) {
                    b = 12;
                }
                break;
            case 1063038178:
                if (str.equals("mt_file_transfer_create_download")) {
                    b = cb.k;
                }
                break;
            case 1234286962:
                if (str.equals("mt_zip_create")) {
                    b = cb.f82047l;
                }
                break;
            case 1432121425:
                if (str.equals("mt_file_append_bytes")) {
                    b = 15;
                }
                break;
            case 1569313483:
                if (str.equals("mt_zip_extract")) {
                    b = 16;
                }
                break;
            case 1747734847:
                if (str.equals("mt_zip_update")) {
                    b = 17;
                }
                break;
            case 1941193293:
                if (str.equals("mt_file_transfer_get")) {
                    b = 18;
                }
                break;
            case 2038747958:
                if (str.equals("mt_file_delete")) {
                    b = 19;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                m9416(R.string.MT_Protector, jSONObject, "completedFiles");
                m9416(R.string.MT_Protector, jSONObject, "createdDirectories");
                m9416(R.string.MT_Protector, jSONObject, "deletedFiles");
                m9416(R.string.MT_Protector, jSONObject, "deletedDirectories");
                if (C7336.m20121(jSONObject, "changed")) {
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                } else {
                    if (C7336.m20104(jSONObject, "changed") && C7336.m20121(jSONObject, "stateKnown")) {
                        strM49059 = C21576.m49059(str.startsWith("mt_file_transfer_") ? R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
                    }
                    if (C7336.m20104(jSONObject, "stateKnown")) {
                        m9413(C21576.m49059(R.string.MT_Protector, new Object[0]), false);
                    }
                }
                m9413(strM49059, false);
                if (C7336.m20104(jSONObject, "stateKnown")) {
                    m9413(C21576.m49059(R.string.MT_Protector, new Object[0]), false);
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m9416(int i, JSONObject jSONObject, String str) {
        long jM20133 = C7336.m20133(jSONObject, str, 0L);
        if (jM20133 > 0) {
            m9413(C21576.m49059(i, Long.valueOf(jM20133)), false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9446(JSONObject jSONObject, String str) {
        int i;
        boolean z = str.equals("mt_file_transfer_create_upload") || str.equals("mt_file_transfer_create_download");
        String strM15167 = C4967.m15167(jSONObject, "direction");
        String strM15168 = C4967.m15167(jSONObject, "state");
        boolean zEquals = strM15167.equals("upload");
        strM15168.getClass();
        switch (strM15168) {
            case "completed":
                if (!str.equals("mt_file_transfer_cancel") || !strM15167.equals("upload")) {
                    i = !zEquals ? R.string.MT_Protector : R.string.MT_Protector;
                    break;
                } else {
                    i = R.string.MT_Protector;
                    break;
                }
                break;
            case "expired":
                if (zEquals) {
                    i = R.string.MT_Protector;
                    break;
                } else {
                    i = R.string.MT_Protector;
                    break;
                }
                break;
            case "failed":
                if (zEquals) {
                    i = R.string.MT_Protector;
                    break;
                } else {
                    i = R.string.MT_Protector;
                    break;
                }
                break;
            case "ready":
                if (z) {
                    i = R.string.MT_Protector;
                    break;
                } else {
                    i = !zEquals ? R.string.MT_Protector : R.string.MT_Protector;
                    break;
                }
                break;
            case "cancelled":
                if (strM15167.equals("download")) {
                    i = R.string.MT_Protector;
                    break;
                } else {
                    i = R.string.MT_Protector;
                    break;
                }
                break;
            case "receiving":
                i = R.string.MT_Protector;
                break;
            case "cancelling":
                if (zEquals) {
                    i = R.string.MT_Protector;
                    break;
                } else {
                    i = R.string.MT_Protector;
                    break;
                }
                break;
            case "publishing":
                i = R.string.MT_Protector;
                break;
            case "sending":
                i = R.string.MT_Protector;
                break;
            default:
                i = R.string.MT_Protector;
                break;
        }
        m9413(C21576.m49059(i, new Object[0]), false);
        JSONObject jSONObjectM20142 = C7336.m20142(jSONObject, d.O);
        if (!jSONObjectM20142.isEmpty()) {
            if (C4967.m15167(jSONObjectM20142, "code").equals("TRANSFER_DIGEST_MISMATCH")) {
                m9413(C21576.m49059(R.string.MT_Protector, new Object[0]), false);
                m9430(C7336.m20142(jSONObjectM20142, "diagnostics"), str);
            } else {
                m9413(C7336.m20137(jSONObjectM20142, str), false);
            }
        }
        m9422(R.string.MT_Protector, jSONObject, MotionUtils.EASING_TYPE_PATH);
        if (z) {
            m9422(R.string.mcp_log_l_transfer_id, jSONObject, "transferId");
        }
        if (!z && jSONObject.get("bytesTransferred") != null && jSONObject.get("size") != null) {
            m9413(C21576.m49059((strM15168.equals("cancelled") && strM15167.equals("download")) ? R.string.MT_Protector : R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObject, "bytesTransferred", 0L)), Long.valueOf(C7336.m20133(jSONObject, "size", 0L))), false);
        }
        m9422(R.string.MT_Protector, jSONObject, "sha256");
        int size = C7336.m20123(jSONObject, "warnings").size();
        if (size == 0) {
            size = C7336.m20123(C7336.m20142(jSONObjectM20142, "diagnostics"), "warnings").size();
        }
        if (size > 0) {
            m9413(C21576.m49059(R.string.MT_Protector, Integer.valueOf(size)), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9428(JSONObject jSONObject, int i) {
        String strM49059;
        JSONValue jSONValue = jSONObject.get("writeText");
        if (jSONValue != null && jSONValue.isString()) {
            String strAsString = jSONValue.asString();
            if (strAsString.isEmpty()) {
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            } else if (C4967.m15168(220, strAsString, true).f44494.isEmpty()) {
                strM49059 = C21576.m49059(R.string.MT_Protector, Integer.valueOf(strAsString.length()));
            }
            m9412(i, strM49059, false);
            return;
        }
        m9422(i, jSONObject, "writeText");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9423(int i, String str) {
        m9438(C7336.m20139(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i + 1)), " · ", C7336.m20119(str)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9438(String str) {
        StringBuilder sb = this.f9433;
        if (sb.length() > 0 && this.f9434 - sb.length() > 2) {
            sb.append('\n');
        }
        m9413(str, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9434(String str) {
        m9413(str, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9448(String str) {
        m9413(str, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9413(String str, boolean z) {
        if (str.isEmpty()) {
            return;
        }
        StringBuilder sb = this.f9433;
        int length = sb.length();
        int i = this.f9434;
        if (length >= i) {
            return;
        }
        boolean z2 = true;
        if (sb.length() <= 0 || i - sb.length() > 1) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            int iMin = Math.min(600, i - sb.length());
            sb.append(C4967.m15164(iMin, str));
            if (!z && str.length() <= iMin) {
                z2 = false;
            }
            this.f9435 = z2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m9417(String str) {
        if (!str.isEmpty() && str.length() <= 64) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '-' || cCharAt == '.' || cCharAt == 'e' || cCharAt == 'E') {
                }
            }
            try {
                double d = Double.parseDouble(str);
                if (!Double.isNaN(d) && !Double.isInfinite(d)) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9436(JSONArray jSONArray) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 < Math.min(3, jSONArray.size())) {
                JSONObject jSONObjectM20134 = C7336.m20134(jSONArray, i2);
                String strM15167 = C4967.m15167(jSONObjectM20134, "reason");
                strM15167.getClass();
                switch (strM15167) {
                    case "file_unreadable":
                        i = R.string.MT_Protector;
                        break;
                    case "metadata_unavailable":
                        i = R.string.MT_Protector;
                        break;
                    case "name_match_failed":
                        i = R.string.MT_Protector;
                        break;
                    case "content_search_failed":
                        i = R.string.MT_Protector;
                        break;
                    case "directory_unreadable":
                        i = R.string.MT_Protector;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != 0) {
                    m9413(C21576.m49059(i, Long.valueOf(C7336.m20133(jSONObjectM20134, "count", 0L))), false);
                }
                i2++;
            } else {
                m9421(jSONArray.size());
                return;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9422(int i, JSONObject jSONObject, String str) {
        boolean z;
        String string;
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull() || jSONValue.isObject() || jSONValue.isArray()) {
            return;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -1806862302:
                if (str.equals("queryType")) {
                    b = 0;
                }
                break;
            case -1669290262:
                if (str.equals("patternType")) {
                    b = 1;
                }
                break;
            case -1501136556:
                if (str.equals("paddingMode")) {
                    b = 2;
                }
                break;
            case -1423461020:
                if (str.equals(am.Q)) {
                    b = 3;
                }
                break;
            case -1377554008:
                if (str.equals("addressKind")) {
                    b = 4;
                }
                break;
            case -1218329423:
                if (str.equals("contentPatternType")) {
                    b = 5;
                }
                break;
            case -937730209:
                if (str.equals("namePatternType")) {
                    b = 6;
                }
                break;
            case -922849603:
                if (str.equals("nameMatchMode")) {
                    b = 7;
                }
                break;
            case -890769487:
                if (str.equals("scanKind")) {
                    b = 8;
                }
                break;
            case -880905839:
                if (str.equals("target")) {
                    b = 9;
                }
                break;
            case 3553:
                if (str.equals("op")) {
                    b = 10;
                }
                break;
            case 3292052:
                if (str.equals("kind")) {
                    b = 11;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    b = 12;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    b = cb.k;
                }
                break;
            case 3619493:
                if (str.equals("view")) {
                    b = cb.f82047l;
                }
                break;
            case 236785797:
                if (str.equals("variant")) {
                    b = 15;
                }
                break;
            case 429975159:
                if (str.equals("replaceMode")) {
                    b = 16;
                }
                break;
            case 613817608:
                if (str.equals("matchMode")) {
                    b = 17;
                }
                break;
            case 1177250119:
                if (str.equals("itemKind")) {
                    b = 18;
                }
                break;
            case 1536729937:
                if (str.equals("instructionMode")) {
                    b = 19;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (jSONValue.isString()) {
            string = jSONValue.asString();
        } else if (jSONValue.isBoolean()) {
            string = C21576.m49059(jSONValue.asBoolean() ? R.string.MT_Protector : R.string.MT_Protector, new Object[0]);
        } else {
            string = jSONValue.toString();
        }
        C14047 c14047M15168 = C4967.m15168(220, string, true);
        String strM20119 = c14047M15168.f44494;
        if (jSONValue.isString() && str.equals("replacementMode")) {
            strM20119.getClass();
            if (strM20119.equals("template")) {
                strM20119 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            } else if (strM20119.equals("literal")) {
                strM20119 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        } else if (jSONValue.isString() && z) {
            strM20119 = C7336.m20119(strM20119);
        }
        if (jSONValue.isString() && str.equals("locator")) {
            strM20119 = C7336.m20138(strM20119);
        }
        if (strM20119.isEmpty()) {
            return;
        }
        m9412(i, strM20119, c14047M15168.f44495);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9442(JSONObject jSONObject) {
        if (jSONObject.get("encoding") != null) {
            m9431(jSONObject, "encoding", R.string.MT_Protector, R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m9415(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull() || jSONValue.isObject() || jSONValue.isArray()) {
            return "";
        }
        return C4967.m15168(220, jSONValue.isString() ? jSONValue.asString() : jSONValue.toString(), true).f44494;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9439(JSONObject jSONObject) {
        if (jSONObject.get("startLine") != null) {
            m9413(C21576.m49059(R.string.MT_Protector, m9415(jSONObject, "startLine"), m9415(jSONObject, "limit")), false);
        }
        if (C7336.m20133(jSONObject, "startColumn", 0L) != 0) {
            m9422(R.string.MT_Protector, jSONObject, "startColumn");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9449(JSONObject jSONObject) {
        if (jSONObject.get("size") == null || jSONObject.get("size").isNull()) {
            return;
        }
        m9413(C21576.m49059(R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObject, "size", 0L))), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9426(JSONArray jSONArray, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(3, jSONArray.size()); i2++) {
            if (jSONArray.get(i2).isString()) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(C7336.m20119(C4967.m15168(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, jSONArray.get(i2).asString(), true).f44494));
            }
        }
        if (sb.length() > 0) {
            m9412(i, sb.toString(), false);
        }
        m9421(jSONArray.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9421(int i) {
        if (i > 3) {
            m9420();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9420() {
        if (this.f9435) {
            return;
        }
        m9413("…", false);
        this.f9435 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9425(JSONArray jSONArray) {
        String strAsString;
        for (int i = 0; i < Math.min(3, jSONArray.size()); i++) {
            JSONValue jSONValue = jSONArray.get(i);
            if (jSONValue.isString()) {
                strAsString = jSONValue.asString();
            } else {
                if (jSONValue.isObject()) {
                    JSONObject jSONObjectM20135 = C7336.m20135(jSONValue.asObject());
                    if (C4967.m15167(jSONObjectM20135, "arrayName").isEmpty()) {
                        String[] strArr = {MotionUtils.EASING_TYPE_PATH, "sourceLocator", "locator", "demangledName", "name", "javaName", "sourceVirtualAddress"};
                        String strM20139 = "";
                        for (int i2 = 0; i2 < 7; i2++) {
                            strM20139 = C4967.m15167(jSONObjectM20135, strArr[i2]);
                            if (!strM20139.isEmpty()) {
                                break;
                            }
                        }
                        JSONObject jSONObjectM20142 = C7336.m20142(jSONObjectM20135, "hit");
                        String strM15167 = C4967.m15167(jSONObjectM20142, "kind");
                        if (strM15167.equals("native_symbol_name") || strM15167.equals("native_string")) {
                            JSONObject jSONObjectM20143 = C7336.m20142(jSONObjectM20142, "nativeLocation");
                            String strM15168 = C4967.m15167(jSONObjectM20143, "demangledName");
                            if (strM15168.isEmpty()) {
                                strM15168 = C4967.m15167(jSONObjectM20143, "name");
                            }
                            m9413(C7336.m20139(C7336.m20139(C7336.m20138(strM20139), " · ", strM15168), " · ", m9411(jSONObjectM20143, "virtualAddress", "fileOffset")), false);
                            JSONValue jSONValue2 = jSONObjectM20142.get("snippet");
                            if (jSONValue2 != null && jSONValue2.isString()) {
                                strAsString = jSONValue2.asString();
                            }
                        } else {
                            if (C4967.m15167(jSONObjectM20135, "locator").startsWith("resource:")) {
                                JSONObject jSONObject = jSONObjectM20142.isEmpty() ? jSONObjectM20135 : jSONObjectM20142;
                                String strM15169 = C4967.m15167(jSONObject, "name");
                                if (!strM15169.isEmpty()) {
                                    strM20139 = C7336.m20139(C4967.m15167(jSONObject, "type"), "/", strM15169);
                                }
                            }
                            String strM151610 = C4967.m15167(jSONObjectM20135, "appLabel");
                            if (!strM151610.isEmpty()) {
                                if (!C4967.m15167(jSONObjectM20135, "packageName").isEmpty()) {
                                    strM20139 = C4967.m15167(jSONObjectM20135, "packageName");
                                }
                                strM20139 = C7336.m20139(strM151610, " · ", strM20139);
                            }
                            String strM151611 = C4967.m15167(jSONObjectM20135, TextBundle.TEXT_ENTRY);
                            if (strM151611.isEmpty()) {
                                strM151611 = C4967.m15167(jSONObjectM20142, TextBundle.TEXT_ENTRY);
                            }
                            strAsString = C7336.m20139(C7336.m20138(strM20139), " · ", strM151611);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C4967.m15167(jSONObjectM20135, "arrayName"));
                        sb.append("[");
                        strAsString = C7336.m20139(C7336.m20139(C2764.m9137(sb, C7336.m20133(jSONObjectM20135, "arrayIndex", 0L), "]"), " · ", C7336.m20139(m9411(jSONObjectM20135, "slotVirtualAddress", "slotFileOffset"), " → ", m9411(jSONObjectM20135, "targetVirtualAddress", "targetFileOffset"))), " · ", C4967.m15167(jSONObjectM20135, "targetInstructionMode"));
                    }
                }
            }
            m9413(strAsString, false);
        }
        m9421(jSONArray.size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9444(JSONArray jSONArray) {
        for (int i = 0; i < Math.min(3, jSONArray.size()); i++) {
            JSONObject jSONObjectM20134 = C7336.m20134(jSONArray, i);
            JSONValue jSONValue = jSONObjectM20134.get(b.d);
            if (jSONValue != null && jSONValue.isString()) {
                String strAsString = jSONValue.asString();
                String strM15167 = C4967.m15167(jSONObjectM20134, "key");
                C14047 c14047M15168 = C4967.m15168(600, strAsString, !strM15167.isEmpty());
                String strM20139 = c14047M15168.f44494;
                if (!strM15167.isEmpty()) {
                    strM20139 = C7336.m20139(C4967.m15168(strM15167.length(), strM15167, true).f44494, ": ", strM20139);
                }
                m9413(strM20139, c14047M15168.f44495);
                if (C7336.m20121(jSONObjectM20134, "valueTruncated")) {
                    m9420();
                }
            }
        }
        m9421(jSONArray.size());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m9440(JSONObject jSONObject) {
        JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "fields");
        JSONArray jSONArrayM20124 = C7336.m20123(jSONObject, "methods");
        m9412(R.string.MT_Protector, String.valueOf(jSONArrayM20123.size()), false);
        m9412(R.string.MT_Protector, String.valueOf(jSONArrayM20124.size()), false);
        m9435(jSONObject);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m9441(JSONObject jSONObject) {
        String strM49059;
        JSONArray jSONArrayM20123 = C7336.m20123(jSONObject, "items");
        m9413(C21576.m49059(m9418(jSONObject) ? R.string.MT_Protector : R.string.MT_Protector, Integer.valueOf(jSONArrayM20123.size())), false);
        for (int i = 0; i < Math.min(3, jSONArrayM20123.size()); i++) {
            JSONObject jSONObjectM20134 = C7336.m20134(jSONArrayM20123, i);
            m9413(C7336.m20139(C7336.m20139(C4967.m15167(jSONObjectM20134, "appLabel"), " · ", C4967.m15167(jSONObjectM20134, "packageName")), " · ", C4967.m15167(jSONObjectM20134, "versionName")), false);
        }
        m9421(jSONArrayM20123.size());
        Iterator it = C7336.m20123(jSONObject, "warnings").iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if (C4967.m15167(jSONObjectAsObject, "code").equals("installed_apps_permission_denied")) {
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            } else if (C4967.m15167(jSONObjectAsObject, "code").equals("metadata_unavailable")) {
                strM49059 = C21576.m49059(R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObjectAsObject, "count", 0L)));
            }
            m9413(strM49059, false);
        }
        m9435(jSONObject);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m9418(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("hasMore");
        if (jSONValue == null) {
            jSONValue = C7336.m20142(jSONObject, "pagination").get("hasMore");
        }
        return jSONValue != null && jSONValue.isBoolean() && jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m9435(JSONObject jSONObject) {
        if (m9418(jSONObject)) {
            m9413(C21576.m49059(R.string.MT_Protector, new Object[0]), false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9433(JSONObject jSONObject, boolean z) {
        JSONObject jSONObjectM20142 = C7336.m20142(jSONObject, "textWindow");
        if (jSONObjectM20142.isEmpty()) {
            jSONObjectM20142 = jSONObject;
        }
        m9413(C21576.m49059(R.string.MT_Protector, Long.valueOf(C7336.m20133(jSONObjectM20142, "returnedLineCount", 0L))), false);
        if (z) {
            JSONValue jSONValue = jSONObjectM20142.get(TextBundle.TEXT_ENTRY);
            if (jSONValue != null && jSONValue.isString()) {
                m9413(jSONValue.asString(), false);
            }
            if (C7336.m20121(jSONObjectM20142, "lineTruncated")) {
                m9420();
            }
        }
        m9435(jSONObject);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9437(JSONObject jSONObject) {
        JSONObject jSONObjectM20142 = C7336.m20142(jSONObject, "byteWindow");
        if (jSONObjectM20142.isEmpty()) {
            jSONObjectM20142 = jSONObject;
        }
        m9413(C21576.m49059(R.string.MT_Protector, Long.valueOf(Math.max(0L, C7336.m20133(jSONObjectM20142, "nextByteOffset", 0L) - C7336.m20133(jSONObjectM20142, "byteOffset", 0L))), Long.valueOf(C7336.m20133(jSONObjectM20142, "totalBytes", 0L))), false);
        m9435(jSONObject);
    }

    public final String toString() {
        return C4967.m15164(this.f9434, this.f9433.toString());
    }
}
