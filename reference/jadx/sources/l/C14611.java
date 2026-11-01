package l;

import android.os.Bundle;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAEE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14611 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m35076(byte b) {
        return (byte) ((b & 255) >>> 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35086(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35080(C6079 c6079) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObjectObject = JSON.object();
        String str = c6079.f20592;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str);
        String str2 = c6079.f20591;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("locator", C17638.m41044("zip_entry", c6079.f20590, (String) null, (String) null, (String) null, (String) null));
        long j = c6079.f20587;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("entrySize", j).add("bytesPatched", c6079.f20588);
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c6079.f20589;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C17368 c17368 = (C17368) it.next();
            jSONArrayArray.add(JSON.object().add("byteOffset", c17368.f55264).add("bytesPatched", c17368.f55262).add("beforeHex", m35084(c17368.f55265)).add("afterHex", m35084(c17368.f55263)));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patches", jSONArrayArray);
        JSONArray jSONArrayArray2 = JSON.array();
        if (arrayList.isEmpty()) {
            jSONObject = jSONObjectAdd4;
            jSONArray = jSONArrayArray2;
        } else {
            C17368 c17369 = (C17368) arrayList.get(0);
            long j2 = c17369.f55264;
            long j3 = c17369.f55262;
            Iterator it2 = arrayList.iterator();
            long jMax = j2 + j3;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C17368 c173610 = (C17368) it2.next();
                long jMin = Math.min(j2, c173610.f55264);
                jMax = Math.max(jMax, ((long) c173610.f55264) + ((long) c173610.f55262));
                jSONObjectAdd4 = jSONObjectAdd4;
                it2 = it3;
                j2 = jMin;
            }
            JSONObject jSONObject2 = jSONObjectAdd4;
            long jMin2 = jMax - j2;
            long jMax2 = Math.max(0L, j - j2);
            if (jMin2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                jMin2 = Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, jMax2);
            }
            long jMin3 = Math.min(Math.max(jMin2, j3), jMax2);
            if (jMin3 <= 0 || jMin3 > 2147483647L) {
                jSONArray = jSONArrayArray2;
            } else {
                jSONArray = jSONArrayArray2;
                jSONArray.add(C11320.m28376(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", C17638.m41044("zip_entry", c6079.f20590, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", (int) j2).add("maxBytes", (int) jMin3), "mt_apk_read_bytes", "inspect", "Read back the window starting at the first patched offset. For sparse patches outside this window, call mt_apk_read_bytes again using data.patches[].byteOffset."));
            }
            jSONObject = jSONObject2;
        }
        return C0735.m3193(jSONObject, jSONArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC10377 m35085(C3320 c3320) {
        switch (c3320.mo9834()) {
            case 1:
                return C2614.f10224;
            case 2:
                return C5437.f18751;
            case 3:
                return C13199.f43918;
            case 4:
                return C4025.f14888;
            case 5:
                return C15316.f49899;
            case 6:
                return C21665.f70267;
            case 7:
                return C7554.f25057;
            case 8:
                return C12494.f41786;
            case 9:
                return C8260.f28720;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c3320.mo2376());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35078(C2460 c2460, int i, int i2) {
        c2460.m7510(i);
        if (c2460.m7503() < 5) {
            return -9223372036854775807L;
        }
        int iM7499 = c2460.m7499();
        if ((8388608 & iM7499) != 0 || ((2096896 & iM7499) >> 8) != i2 || (iM7499 & 32) == 0 || c2460.m7516() < 7 || c2460.m7503() < 7 || (c2460.m7516() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c2460.m7507(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static short m35089(int i, byte[] bArr) {
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35081(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectAdd = C11445.m28557(jSONObject, "actualHex", C11445.m28557(jSONObject, "expectedHex", C11445.m28557(jSONObject, "reason", C11445.m28557(jSONObject, "entryName", jSONObjectObject, "entryName"), "reason").add("byteOffset", m35083(jSONObject.get("byteOffset"))).add("endByteOffset", m35083(jSONObject.get("endByteOffset"))).add("entrySize", m35083(jSONObject.get("entrySize"))), "expectedHex"), "actualHex").add("firstRange", m35082(jSONObject.getJSONObject("firstRange"))).add("secondRange", m35082(jSONObject.getJSONObject("secondRange")));
        JSONArray jSONArray = c12731.f42471;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_read_bytes".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m35083(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m35087(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m35082(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("byteOffset", m35083(jSONObject.get("byteOffset"))).add("endByteOffset", m35083(jSONObject.get("endByteOffset")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35084(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35088() {
        return C4969.m13780("Result for mt_apk_patch_bytes. data describes the patched byte ranges in one ZIP entry and nextActions contains a mt_apk_read_bytes read-back action for the window starting at the first patched offset. A corrupt workspace whose source APK remains accessible may return an mt_apk_workspace_open retry action.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id used for this patch.")).add("editSessionId", C4969.m13789("string", "Edit session id that was modified.")).add("locator", C4969.m13789("string", "Patched zip_entry locator.")).add("entrySize", C4969.m13786("integer", "Entry size after patch; equal-length replacement keeps it unchanged.")).add("bytesPatched", C4969.m13786("integer", "Total requested byte count covered by all patch ranges, including no-op replacements.")).add("patches", C3184.m9603("type", "array", "description", "Applied patch ranges sorted by byteOffset. Hex strings are uppercase without spaces and can be reused as expectedHex.").add("items", C18828.m43457(JSON.object().add("byteOffset", C4969.m13786("integer", "0-based patched byte offset.")).add("bytesPatched", C4969.m13786("integer", "Patched byte count for this range.")).add("beforeHex", C4969.m13786("string", "Original bytes before patch, uppercase hex without spaces.")), "string", "Replacement bytes after patch, uppercase hex without spaces.", "afterHex", "One applied patch range."))), "Successful patch_bytes data."), C4969.m13787(C4969.m13777(JSON.object().add("entryName", C4969.m13789("string", "Rejected ZIP entry name, or null.")).add("reason", C4969.m13789("string", "Unsupported-entry reason token such as resources_arsc, dex_entry, axml_entry, directory, or not_raw_zip_entry, or null for non-unsupported errors. not_raw_zip_entry means the current entry view is not raw ZIP bytes.")).add("byteOffset", C4969.m13789("integer", "Rejected byte offset, or null.")).add("endByteOffset", C4969.m13789("integer", "Exclusive rejected end offset, or null.")).add("entrySize", C4969.m13789("integer", "Entry size for range errors, or null.")).add("expectedHex", C4969.m13789("string", "Expected uppercase hex for a mismatch, or null.")).add("actualHex", C4969.m13789("string", "Actual uppercase hex read at byteOffset for a mismatch, or null.")).add("firstRange", C4969.m13785(m35079())).add("secondRange", C4969.m13785(m35079())), "patch_bytes diagnostics.")), C4969.m13783("Successful patch_bytes returns a read_bytes verification action starting at the first patched offset; mismatch errors may also return read_bytes for the actual window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "inspect"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35077(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35079() {
        return C4969.m13777(JSON.object().add("byteOffset", C4969.m13789("integer", "Range start byte offset.")).add("endByteOffset", C4969.m13789("integer", "Exclusive range end byte offset.")), "A rejected half-open byte range.");
    }
}
