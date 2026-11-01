package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7304 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m19456() {
        return C3184.m9603("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C4969.m13786("string", "One warning message."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m19455() {
        return C4969.m13780("Result for mt_apk_copy_entry. data identifies the copied raw payload, the normalized local path, and any warnings. For workspace_to_local, nextActions checks destination file metadata; for local_to_edit_session, it reads up to the first 256 bytes. Neither action verifies the complete copied content; a corrupt workspace may return mt_apk_workspace_open for retry.", C18828.m43457(JSON.object().add("direction", C4969.m13784("Completed copy direction.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C4969.m13786("string", "Workspace containing the source or destination entry.")).add("editSessionId", C4969.m13786("string", "Empty for a base workspace read; otherwise the observed or modified edit session.")).add("locator", C4969.m13786("string", "Copied ordinary zip_entry locator.")).add("localPath", C4969.m13786("string", "Normalized absolute local source or destination path fixed for this call.")).add("warnings", m19456()), "integer", "Number of bytes copied.", "size", "Successful workspace entry payload copy."), C4969.m13787(C4969.m13777(JSON.object().add("direction", C4969.m13789("string", "Requested direction, or null when it could not be parsed.")).add("workspaceId", C4969.m13789("string", "Workspace id, or null for an argument error.")).add("editSessionId", C4969.m13789("string", "Edit session id, including an empty base sentinel, or null.")).add("locator", C4969.m13789("string", "Normalized zip_entry locator, or null when unavailable.")).add("localPath", C4969.m13789("string", "Normalized absolute local path, or null before path resolution.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether the logical destination may already have changed.")).add("operationMode", C4969.m13789("string", "atomic or best_effort when a publication guarantee was selected.")).add("stateKnown", C4969.m13786(ClassTransform.BOOLEAN, "Whether the final destination state is known.")).add("warnings", m19456()).add("bytesCopied", C4969.m13789("integer", "Bytes copied before failure; this does not mean those bytes reached the destination. Null when unknown.")).add("safeToRetry", C4969.m13786(ClassTransform.BOOLEAN, "Whether retrying the same copy arguments is safe.")), "Stable workspace entry copy failure context; unavailable values are null.")), C4969.m13783("Success returns mt_file_stat for the local destination or mt_apk_read_bytes for up to the first 256 entry bytes. Neither checks complete content equality. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open for retry.", C4969.m13778(C18828.m43457(JSON.object(), "string", "Normalized absolute copied local destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "inspect"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }
}
