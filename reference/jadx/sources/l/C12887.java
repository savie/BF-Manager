package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C74Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C12887 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31955(C18479 c18479) {
        String[] strArr = {"thumb", "arm"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF disassembly requires instructionMode=arm or instructionMode=thumb.", "fatal", m31947(c18479, strArr), m31949(c18479.f58892, c18479.f58883, c18479.f58882, c18479.f58888, c18479.f58890, c18479.f58891, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31960(C18479 c18479) {
        String[] strArr = {"thumb"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m31947(c18479, strArr), m31949(c18479.f58892, c18479.f58883, c18479.f58882, c18479.f58888, c18479.f58890, c18479.f58891, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31953(C7190 c7190) {
        String[] strArr = {"thumb", "arm"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF instruction patch requires instructionMode=arm or instructionMode=thumb.", "fatal", m31945(c7190, strArr), m31949(c7190.f23994, c7190.f23986, c7190.f23987, c7190.f23991, c7190.f23993, c7190.f23992, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31958(C7190 c7190) {
        String[] strArr = {"thumb"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m31945(c7190, strArr), m31949(c7190.f23994, c7190.f23986, c7190.f23987, c7190.f23991, c7190.f23993, c7190.f23992, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31954(C7896 c7896) {
        String[] strArr = {"thumb", "arm"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF function CFG requires instructionMode=arm or instructionMode=thumb.", "fatal", m31946(c7896, strArr), m31949(c7896.f25956, c7896.f25948, c7896.f25947, c7896.f25953, c7896.f25955, c7896.f25957, "arm32_mode_required", "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31959(C7896 c7896) {
        String[] strArr = {"thumb"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_ADDRESS_CONFLICT", "ARM instruction mode conflicts with odd Thumb address.", "fatal", m31946(c7896, strArr), m31949(c7896.f25956, c7896.f25948, c7896.f25947, c7896.f25953, c7896.f25955, c7896.f25957, "arm32_thumb_address_conflict", "odd virtual address indicates Thumb T-bit", strArr));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m31961(C19891 c19891) {
        String[] strArr = {"thumb", "arm"};
        return C12731.m31627("NATIVE_INSTRUCTION_MODE_REQUIRED", "ARM ELF xref scan requires instructionMode=thumb or instructionMode=arm.", "fatal", m31948(c19891, strArr), m31951(c19891, "arm32_mode_required", ("virtual".equals(c19891.f63770) && (c19891.f63763 & 1) == 1) ? "odd target virtual address does not identify source instruction mode" : "ARM32 file/even address does not identify ARM or Thumb", strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m31956(C19891 c19891) {
        String[] strArr = {"auto"};
        C12731 c12731M31626 = C12731.m31626("instructionMode must be auto for scanKind=data", "instructionMode", JSON.value(c19891.f63782), JSON.array("auto"), JSON.object().add("instructionMode", "auto"));
        JSONObject jSONObject = c12731M31626.f42468;
        for (JSONObject.Member member : m31951(c19891, "data_scan_requires_auto", "data scan does not decode instructions", strArr)) {
            jSONObject.put(member.getName(), member.getValue());
        }
        return c12731M31626.m31632(m31948(c19891, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31950(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        return JSON.object().add("workspaceId", m31952(jSONObject, "workspaceId")).add("editSessionId", m31952(jSONObject, "editSessionId")).add("locator", m31952(jSONObject, "locator")).add("addressKind", m31952(jSONObject, "addressKind")).add("address", m31952(jSONObject, "address")).add("instructionMode", m31952(jSONObject, "instructionMode")).add("reason", m31952(jSONObject, "reason")).add("addressModeHint", m31952(jSONObject, "addressModeHint")).add("retryInstructionModes", m31944(jSONObject.getJSONArray("retryInstructionModes")));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31957(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        return m31950(c12731).add("scanKind", m31952(jSONObject, "scanKind")).add("referenceKinds", m31944(jSONObject.getJSONArray("referenceKinds")));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m31962(C12731 c12731) {
        return !m31952(c12731.f42468, "reason").isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31951(C19891 c19891, String str, String str2, String[] strArr) {
        JSONObject jSONObjectAdd = m31949(c19891.f63778, c19891.f63762, c19891.f63780, c19891.f63770, c19891.f63772, c19891.f63782, str, str2, strArr).add("scanKind", c19891.f63779);
        List list = c19891.f63768;
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
    public static JSONObject m31949(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr) {
        JSONObject jSONObjectAdd = C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", str3).add("addressKind", str4).add("address", str5).add("instructionMode", str6).add("reason", str7).add("addressModeHint", str8);
        JSONArray jSONArrayArray = JSON.array();
        for (String str9 : strArr) {
            jSONArrayArray.add(str9);
        }
        return jSONObjectAdd.add("retryInstructionModes", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31947(C18479 c18479, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry as ARM" : "Retry with instructionMode=auto";
            }
            jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", c18479.f58892).add("editSessionId", c18479.f58883).add("locator", c18479.f58882).add("addressKind", c18479.f58888).add("address", c18479.f58890).add("instructionMode", str2).add("stopAtSymbolBoundary", c18479.f58887).add("maxBytes", c18479.f58889).add("maxInstructions", c18479.f58884), "mt_apk_native_disassemble", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31948(C19891 c19891, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry xref as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry xref as ARM" : "Retry xref with instructionMode=auto";
            }
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c19891.f63778).add("editSessionId", c19891.f63762).add("locator", c19891.f63780).add("addressKind", c19891.f63770).add("address", c19891.f63772).add("instructionMode", str2).add("scanKind", c19891.f63779);
            List list = c19891.f63768;
            JSONArray jSONArrayArray2 = JSON.array();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArrayArray2.add((String) it.next());
                }
            }
            jSONArrayArray.add(C11320.m28376(jSONObjectAdd.add("referenceKinds", jSONArrayArray2).add("maxScanBytes", c19891.f63775).add("limit", c19891.f63773), "mt_apk_native_xref", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31945(C7190 c7190, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry patch as Thumb";
            } else {
                str = "arm".equals(str2) ? "Retry patch as ARM" : "Retry patch with instructionMode=auto";
            }
            jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", c7190.f23994).add("editSessionId", c7190.f23986).add("locator", c7190.f23987).add("addressKind", c7190.f23991).add("address", c7190.f23993).add("instructionMode", str2).add("expectedHex", c7190.f23985).add("replacementAssembly", c7190.f23996).add("paddingMode", c7190.f23990), "mt_apk_native_patch_instructions", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31946(C7896 c7896, String[] strArr) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (String str2 : strArr) {
            if ("thumb".equals(str2)) {
                str = "Retry function CFG as Thumb; this new graph replaces the previous result";
            } else {
                str = "arm".equals(str2) ? "Retry function CFG as ARM; this new graph replaces the previous result" : "Retry function CFG with instructionMode=auto; this new graph replaces the previous result";
            }
            jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", c7896.f25956).add("editSessionId", c7896.f25948).add("locator", c7896.f25947).add("addressKind", c7896.f25953).add("address", c7896.f25955).add("instructionMode", str2).add("outputMode", c7896.f25958).add("maxAnalysisBytes", c7896.f25954).add("maxBlocks", c7896.f25949).add("maxInstructions", c7896.f25952), "mt_apk_native_analyze_control_flow", "retry", str));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31952(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m31944(JSONArray jSONArray) {
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
