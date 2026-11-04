package l;

import android.content.pm.Signature;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes2.dex */
public class C4560 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Class m14317(InterfaceC7040 interfaceC7040) {
        C15243.m36590(interfaceC7040, "<this>");
        Class clsMo16466 = ((InterfaceC8292) interfaceC7040).mo16466();
        if (!clsMo16466.isPrimitive()) {
            return clsMo16466;
        }
        String name = clsMo16466.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals(ClassTransform.DOUBLE) ? clsMo16466 : Double.class;
            case 104431:
                return !name.equals(ClassTransform.INTEGER) ? clsMo16466 : Integer.class;
            case 3039496:
                return !name.equals(ClassTransform.BYTE) ? clsMo16466 : Byte.class;
            case 3052374:
                return !name.equals(ClassTransform.CHARACTER) ? clsMo16466 : Character.class;
            case 3327612:
                return !name.equals(ClassTransform.LONG) ? clsMo16466 : Long.class;
            case 3625364:
                return !name.equals(ClassTransform.VOID) ? clsMo16466 : Void.class;
            case 64711720:
                return !name.equals(ClassTransform.BOOLEAN) ? clsMo16466 : Boolean.class;
            case 97526364:
                return !name.equals(ClassTransform.FLOAT) ? clsMo16466 : Float.class;
            case 109413500:
                return !name.equals(ClassTransform.SHORT) ? clsMo16466 : Short.class;
            default:
                return clsMo16466;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Signature m14311(String str) {
        try {
            C22941 c22941 = new C22941(str);
            try {
                for (C8002 c8002 : c22941.m51742()) {
                    String name = c8002.getName();
                    if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                        Signature signature = new Signature(new C7349(c22941.m51731(c8002, (C3374) null)).m20170()[0].getEncoded());
                        c22941.close();
                        return signature;
                    }
                }
                c22941.close();
                return null;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m14325(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            if (iLastIndexOf == 0) {
                iLastIndexOf = 2;
            }
            int iM50646 = C22463.m50646(iLastIndexOf, str);
            int length = iM50646 >= 0 ? iM50646 : str.length();
            while (true) {
                int i = length - 1;
                if (i <= iLastIndexOf) {
                    length = i;
                    break;
                }
                if (str.charAt(i) != '0') {
                    break;
                }
                length = i;
            }
            if (iM50646 < 0) {
                return str.substring(0, length);
            }
            if (iM50646 != length) {
                return str.substring(0, length) + str.substring(iM50646);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Class m14318(C13512 c13512) {
        Class clsMo16466 = c13512.mo16466();
        C15243.m36587((Object) clsMo16466, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo16466;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m14321(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m14313(C0231 c0231) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObjectObject = JSON.object();
        String str = c0231.f1476;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str);
        String str2 = c0231.f1478;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("locator", C4375.m13906("zip_entry", c0231.f1475, (String) null, (String) null, (String) null, (String) null));
        long j = c0231.f1479;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("entrySize", j).add("bytesPatched", c0231.f1474);
        JSONArray jSONArrayArray = JSON.array();
        ArrayList arrayList = c0231.f1477;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C18130 c18130 = (C18130) it.next();
            jSONArrayArray.add(JSON.object().add("byteOffset", c18130.f59299).add("bytesPatched", c18130.f59301).add("beforeHex", m14319(c18130.f59300)).add("afterHex", m14319(c18130.f59298)));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patches", jSONArrayArray);
        JSONArray jSONArrayArray2 = JSON.array();
        if (arrayList.isEmpty()) {
            jSONObject = jSONObjectAdd4;
            jSONArray = jSONArrayArray2;
        } else {
            C18130 c18131 = (C18130) arrayList.get(0);
            long j2 = c18131.f59299;
            long j3 = c18131.f59301;
            Iterator it2 = arrayList.iterator();
            long jMax = j2 + j3;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C18130 c18132 = (C18130) it2.next();
                long jMin = Math.min(j2, c18132.f59299);
                jMax = Math.max(jMax, ((long) c18132.f59299) + ((long) c18132.f59301));
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
                jSONArray.add(C2729.m9064(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", C4375.m13906("zip_entry", c0231.f1475, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", (int) j2).add("maxBytes", (int) jMin3), "mt_apk_read_bytes", "inspect", "Read back the window starting at the first patched offset. For sparse patches outside this window, call mt_apk_read_bytes again using data.patches[].byteOffset."));
            }
            jSONObject = jSONObject2;
        }
        return C15300.m36728(jSONObject, jSONArray);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m14322(int i, int[] iArr) {
        return ((1 << (i & 31)) & iArr[i >> 5]) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m14326(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14320(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m14314(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectAdd = C8008.m21874(jSONObject, "actualHex", C8008.m21874(jSONObject, "expectedHex", C8008.m21874(jSONObject, "reason", C8008.m21874(jSONObject, "entryName", jSONObjectObject, "entryName"), "reason").add("byteOffset", m14316(jSONObject.get("byteOffset"))).add("endByteOffset", m14316(jSONObject.get("endByteOffset"))).add("entrySize", m14316(jSONObject.get("entrySize"))), "expectedHex"), "actualHex").add("firstRange", m14315(jSONObject.getJSONObject("firstRange"))).add("secondRange", m14315(jSONObject.getJSONObject("secondRange")));
        JSONArray jSONArray = c10186.f32599;
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_read_bytes".equals(string) || "mt_apk_workspace_open".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m14316(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m14315(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("byteOffset", m14316(jSONObject.get("byteOffset"))).add("endByteOffset", m14316(jSONObject.get("endByteOffset")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14319(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m14324() {
        return C10932.m27734("Result for mt_apk_patch_bytes. data describes the patched byte ranges in one ZIP entry and nextActions contains a mt_apk_read_bytes read-back action for the window starting at the first patched offset. A corrupt workspace whose source APK remains accessible may return an mt_apk_workspace_open retry action.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id used for this patch.")).add("editSessionId", C10932.m27743("string", "Edit session id that was modified.")).add("locator", C10932.m27743("string", "Patched zip_entry locator.")).add("entrySize", C10932.m27740("integer", "Entry size after patch; equal-length replacement keeps it unchanged.")).add("bytesPatched", C10932.m27740("integer", "Total requested byte count covered by all patch ranges, including no-op replacements.")).add("patches", C22121.m50076("type", "array", "description", "Applied patch ranges sorted by byteOffset. Hex strings are uppercase without spaces and can be reused as expectedHex.").add("items", C22783.m51386(JSON.object().add("byteOffset", C10932.m27740("integer", "0-based patched byte offset.")).add("bytesPatched", C10932.m27740("integer", "Patched byte count for this range.")).add("beforeHex", C10932.m27740("string", "Original bytes before patch, uppercase hex without spaces.")), "string", "Replacement bytes after patch, uppercase hex without spaces.", "afterHex", "One applied patch range."))), "Successful patch_bytes data."), C10932.m27741(C10932.m27731(JSON.object().add("entryName", C10932.m27743("string", "Rejected ZIP entry name, or null.")).add("reason", C10932.m27743("string", "Unsupported-entry reason token such as resources_arsc, dex_entry, axml_entry, directory, or not_raw_zip_entry, or null for non-unsupported errors. not_raw_zip_entry means the current entry view is not raw ZIP bytes.")).add("byteOffset", C10932.m27743("integer", "Rejected byte offset, or null.")).add("endByteOffset", C10932.m27743("integer", "Exclusive rejected end offset, or null.")).add("entrySize", C10932.m27743("integer", "Entry size for range errors, or null.")).add("expectedHex", C10932.m27743("string", "Expected uppercase hex for a mismatch, or null.")).add("actualHex", C10932.m27743("string", "Actual uppercase hex read at byteOffset for a mismatch, or null.")).add("firstRange", C10932.m27739(m14312())).add("secondRange", C10932.m27739(m14312())), "patch_bytes diagnostics.")), C10932.m27737("Successful patch_bytes returns a read_bytes verification action starting at the first patched offset; mismatch errors may also return read_bytes for the actual window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "inspect"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m14323(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = i & 31;
        int i3 = i >> 5;
        while (true) {
            if (i3 >= length) {
                return -1;
            }
            int i4 = iArr[i3];
            if (i4 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i2) - 1)) & i4);
                int i5 = iNumberOfTrailingZeros != 32 ? iNumberOfTrailingZeros : -1;
                if (i5 >= 0) {
                    return (i3 << 5) + i5;
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m14312() {
        return C10932.m27731(JSON.object().add("byteOffset", C10932.m27743("integer", "Range start byte offset.")).add("endByteOffset", C10932.m27743("integer", "Exclusive range end byte offset.")), "A rejected half-open byte range.");
    }
}
