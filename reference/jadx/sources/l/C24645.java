package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C74Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24645 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m54994(C19028 c19028) {
        String[] strArr = {"thumb", "arm"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF disassembly requires instructionMode=arm or instructionMode=thumb.", "fatal", m54986(c19028, strArr), m54987(c19028.f61650, c19028.f61649, c19028.f61645, c19028.f61643, c19028.f61648, c19028.f61646, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m54999(C19028 c19028) {
        String[] strArr = {"thumb"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m54986(c19028, strArr), m54987(c19028.f61650, c19028.f61649, c19028.f61645, c19028.f61643, c19028.f61648, c19028.f61646, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m54992(C8586 c8586) {
        String[] strArr = {"thumb", "arm"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF instruction patch requires instructionMode=arm or instructionMode=thumb.", "fatal", m54984(c8586, strArr), m54987(c8586.f28074, c8586.f28077, c8586.f28067, c8586.f28070, c8586.f28076, c8586.f28069, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m54997(C8586 c8586) {
        String[] strArr = {"thumb"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m54984(c8586, strArr), m54987(c8586.f28074, c8586.f28077, c8586.f28067, c8586.f28070, c8586.f28076, c8586.f28069, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m54993(C10077 c10077) {
        String[] strArr = {"thumb", "arm"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF function CFG requires instructionMode=arm or instructionMode=thumb.", "fatal", m54985(c10077, strArr), m54987(c10077.f32310, c10077.f32313, c10077.f32308, c10077.f32306, c10077.f32312, c10077.f32309, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m54998(C10077 c10077) {
        String[] strArr = {"thumb"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m54985(c10077, strArr), m54987(c10077.f32310, c10077.f32313, c10077.f32308, c10077.f32306, c10077.f32312, c10077.f32309, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m54996(C5253 c5253) {
        String[] strArr = {"thumb", "arm"};
        return C10186.m26302("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF xref scan requires instructionMode=thumb or instructionMode=arm.", "fatal", m54983(c5253, strArr), m54988(c5253, "arm32_mode_required", ("virtual".equals(c5253.f18507) && (c5253.f18504 & 1) == 1) ? "odd target virtual address does not identify source instruction mode" : "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m54991(C5253 c5253) {
        String[] strArr = {"auto"};
        C10186 c10186M26301 = C10186.m26301("instructionMode must be auto for scanKind=data", "instructionMode", JSON.value(c5253.f18523), JSON.array("auto"), JSON.object().add("instructionMode", "auto"));
        JSONObject jSONObject = c10186M26301.f32602;
        for (JSONObject.Member member : m54988(c5253, "data_scan_requires_auto", "data scan does not decode instructions", strArr)) {
            jSONObject.put(member.getName(), member.getValue());
        }
        return c10186M26301.m26307(m54983(c5253, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m54989(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        return JSON.object().add("workspaceId", m54990(jSONObject, "workspaceId")).add("editSessionId", m54990(jSONObject, "editSessionId")).add("locator", m54990(jSONObject, "locator")).add("addressKind", m54990(jSONObject, "addressKind")).add("address", m54990(jSONObject, "address")).add("instructionMode", m54990(jSONObject, "instructionMode")).add("reason", m54990(jSONObject, "reason")).add("addressModeHint", m54990(jSONObject, "addressModeHint")).add("retryInstructionModes", m54982(jSONObject.getJSONArray("retryInstructionModes")));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m54995(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        return m54989(c10186).add("scanKind", m54990(jSONObject, "scanKind")).add("referenceKinds", m54982(jSONObject.getJSONArray("referenceKinds")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m55000(C10186 c10186) {
        return !m54990(c10186.f32602, "reason").isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m54988(C5253 c5253, String str, String str2, String[] strArr) {
        JSONObject jSONObjectAdd = m54987(c5253.f18518, c5253.f18501, c5253.f18515, c5253.f18507, c5253.f18519, c5253.f18523, str, str2, strArr).add("scanKind", c5253.f18503);
        List list = c5253.f18509;
        JSONArray jSONArrayArray = JSON.array();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add((String) it.next());
            }
        }
        return jSONObjectAdd.add("referenceKinds", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m54987(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr) {
        JSONObject jSONObjectAdd = C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", str3).add("addressKind", str4).add("address", str5).add("instructionMode", str6).add("reason", str7).add("addressModeHint", str8);
        JSONArray jSONArrayArray = JSON.array();
        for (String str9 : strArr) {
            jSONArrayArray.add(str9);
        }
        return jSONObjectAdd.add("retryInstructionModes", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m54986(C19028 c19028, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry as ARM" : "Retry with instructionMode=auto";
            }
            jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", c19028.f61650).add("editSessionId", c19028.f61649).add("locator", c19028.f61645).add("addressKind", c19028.f61643).add("address", c19028.f61648).add("instructionMode", str2).add("stopAtSymbolBoundary", c19028.f61644).add("maxBytes", c19028.f61642).add("maxInstructions", c19028.f61640), "mt_apk_native_disassemble", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m54983(C5253 c5253, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry xref as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry xref as ARM" : "Retry xref with instructionMode=auto";
            }
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c5253.f18518).add("editSessionId", c5253.f18501).add("locator", c5253.f18515).add("addressKind", c5253.f18507).add("address", c5253.f18519).add("instructionMode", str2).add("scanKind", c5253.f18503);
            List list = c5253.f18509;
            JSONArray jSONArrayArray2 = JSON.array();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArrayArray2.add((String) it.next());
                }
            }
            jSONArrayArray.add(C2729.m9064(jSONObjectAdd.add("referenceKinds", jSONArrayArray2).add("maxScanBytes", c5253.f18513).add("limit", c5253.f18514), "mt_apk_native_xref", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m54984(C8586 c8586, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry patch as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry patch as ARM" : "Retry patch with instructionMode=auto";
            }
            jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", c8586.f28074).add("editSessionId", c8586.f28077).add("locator", c8586.f28067).add("addressKind", c8586.f28070).add("address", c8586.f28076).add("instructionMode", str2).add("expectedHex", c8586.f28072).add("replacementAssembly", c8586.f28078).add("paddingMode", c8586.f28071), "mt_apk_native_patch_instructions", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m54985(C10077 c10077, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry function CFG as Thumb; this new graph replaces the previous result";
            } else {
                str = "arm".equals(str2) ? "Retry function CFG as ARM; this new graph replaces the previous result" : "Retry function CFG with instructionMode=auto; this new graph replaces the previous result";
            }
            jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", c10077.f32310).add("editSessionId", c10077.f32313).add("locator", c10077.f32308).add("addressKind", c10077.f32306).add("address", c10077.f32312).add("instructionMode", str2).add("outputMode", c10077.f32314).add("maxAnalysisBytes", c10077.f32305).add("maxBlocks", c10077.f32303).add("maxInstructions", c10077.f32307), "mt_apk_native_analyze_control_flow", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54990(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m54982(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONValue jSONValue = (JSONValue) it.next();
                if (jSONValue.isString()) {
                    jSONArrayArray.add(jSONValue.asString());
                }
            }
        }
        return jSONArrayArray;
    }
}
