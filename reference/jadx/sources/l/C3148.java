package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3148 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m10288() {
        return C22121.m50076("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C10932.m27740("string", "One warning message."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m10287() {
        return C10932.m27734("Result for mt_apk_copy_entry. data identifies the copied raw payload, the normalized local path, and any warnings. For workspace_to_local, nextActions checks destination file metadata; for local_to_edit_session, it reads up to the first 256 bytes. Neither action verifies the complete copied content; a corrupt workspace may return mt_apk_workspace_open for retry.", C22783.m51386(JSON.object().add("direction", C10932.m27738("Completed copy direction.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C10932.m27740("string", "Workspace containing the source or destination entry.")).add("editSessionId", C10932.m27740("string", "Empty for a base workspace read; otherwise the observed or modified edit session.")).add("locator", C10932.m27740("string", "Copied ordinary zip_entry locator.")).add("localPath", C10932.m27740("string", "Normalized absolute local source or destination path fixed for this call.")).add("warnings", m10288()), "integer", "Number of bytes copied.", "size", "Successful workspace entry payload copy."), C10932.m27741(C10932.m27731(JSON.object().add("direction", C10932.m27743("string", "Requested direction, or null when it could not be parsed.")).add("workspaceId", C10932.m27743("string", "Workspace id, or null for an argument error.")).add("editSessionId", C10932.m27743("string", "Edit session id, including an empty base sentinel, or null.")).add("locator", C10932.m27743("string", "Normalized zip_entry locator, or null when unavailable.")).add("localPath", C10932.m27743("string", "Normalized absolute local path, or null before path resolution.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether the logical destination may already have changed.")).add("operationMode", C10932.m27743("string", "atomic replaces the destination in one step; best_effort may leave a changed destination after failure. Null when not applicable. Inspect changed and stateKnown before retrying.")).add("stateKnown", C10932.m27740(ClassTransform.BOOLEAN, "Whether the final destination state is known.")).add("warnings", m10288()).add("bytesCopied", C10932.m27743("integer", "Bytes copied before failure; this does not mean those bytes reached the destination. Null when unknown.")).add("safeToRetry", C10932.m27740(ClassTransform.BOOLEAN, "Whether retrying the same copy arguments is safe.")), "Stable workspace entry copy failure context; unavailable values are null.")), C10932.m27737("Success returns mt_file_stat for the local destination or mt_apk_read_bytes for up to the first 256 entry bytes. Neither checks complete content equality. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open for retry.", C10932.m27732(C22783.m51386(JSON.object(), "string", "Normalized absolute copied local destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "inspect"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }
}
