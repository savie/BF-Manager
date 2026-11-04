package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6KZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20476 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m46979(String str, boolean z) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", z ? "Normalized absolute source ZIP path." : "Normalized absolute output ZIP path."));
        if (z) {
            jSONObjectAdd.add("completedFiles", C10932.m27740("integer", "Number of files successfully extracted.")).add("createdDirectories", C10932.m27740("integer", "Number of directories created by this call."));
        } else {
            jSONObjectAdd.add("size", C10932.m27740("integer", "Final ZIP file size in bytes.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether the output file changed."));
        }
        jSONObjectAdd.add("warnings", C10932.m27742("Non-fatal metadata, cleanup, or notification issues."));
        JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27743("string", "Normalized archive path, when available.")).add("entryPaths", C10932.m27742("ZIP paths involved in the failure.")).add("operationIndexes", C22121.m50076("type", "array", "description", "Zero-based indexes in operations, sources, or entries for this tool; empty for a whole-call failure.").add("items", C10932.m27740("integer", "Zero-based request item index."))).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether destination changes occurred or may have occurred.")).add("stateKnown", C10932.m27740(ClassTransform.BOOLEAN, "Whether the destination state after failure is known.")).add("operationMode", C10932.m27743("string", "Write guarantee: atomic replaces a target in one step; best_effort may leave a changed target after failure; non_atomic may leave completed files and directories from the batch. Null when not applicable. Always inspect changed and stateKnown before retrying.")).add("warnings", C10932.m27742("Non-fatal issues observed before the failure."));
        if (z) {
            jSONObjectAdd2.add("destinationPath", C10932.m27743("string", "Destination involved in the failure: normalized absolute path when resolved, otherwise original input; null when unavailable.")).add("completedFiles", C10932.m27740("integer", "Files successfully written before stopping.")).add("createdDirectories", C10932.m27740("integer", "Directories created before stopping."));
        } else {
            jSONObjectAdd2.add("sourcePath", C10932.m27743("string", "Absolute local source path that failed, possibly a child of a directory mapping; null when unavailable or unrelated to a source."));
        }
        return C10932.m27734(C14442.m34865("Result for ", str, "."), C10932.m27731(jSONObjectAdd, "ZIP operation result."), C10932.m27741(C10932.m27731(jSONObjectAdd2, "ZIP write failure details.")), C10932.m27733("No automatic follow-up action; correct the request or inspect the reported state before retrying."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m46980(C10186 c10186, boolean z) {
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectObject = JSON.object();
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectObject.add(MotionUtils.EASING_TYPE_PATH, jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("entryPaths");
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entryPaths", jSONArray == null ? JSON.array() : new JSONArray(jSONArray));
        JSONArray jSONArray2 = jSONObject.getJSONArray("operationIndexes");
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("operationIndexes", jSONArray2 == null ? JSON.array() : new JSONArray(jSONArray2)).add("changed", jSONObject.getBoolean("changed", false)).add("stateKnown", jSONObject.getBoolean("stateKnown", true));
        JSONValue jSONValue2 = jSONObject.get("operationMode");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("operationMode", jSONValue2);
        JSONArray jSONArray3 = jSONObject.getJSONArray("warnings");
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("warnings", jSONArray3 == null ? JSON.array() : new JSONArray(jSONArray3));
        if (z) {
            JSONValue jSONValue3 = jSONObject.get("destinationPath");
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            jSONObjectAdd5.add("destinationPath", jSONValue3).add("completedFiles", jSONObject.getLong("completedFiles", 0L)).add("createdDirectories", jSONObject.getLong("createdDirectories", 0L));
        } else {
            JSONValue jSONValue4 = jSONObject.get("sourcePath");
            if (jSONValue4 == null) {
                jSONValue4 = JSON.NULL;
            }
            jSONObjectAdd5.add("sourcePath", jSONValue4);
        }
        return C15300.m36730(c10186, jSONObjectAdd5, c10186.f32599);
    }
}
