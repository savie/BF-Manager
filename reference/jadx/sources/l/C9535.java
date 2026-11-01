package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9535 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m24381(C20896 c20896) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c20896.f67893).add("editSessionId", c20896.f67890).add("runBuildChecks", c20896.f67892).add("pendingCompileCount", c20896.f67895).add("failedCount", c20896.f67885);
        ArrayList<C19485> arrayList = c20896.f67888;
        JSONArray jSONArrayArray = JSON.array();
        for (C19485 c19485 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add("locator", C17638.m41088(c19485.f62713, c19485.f62707)).add("className", c19485.f62710).add("errorCode", c19485.f62708).add("message", c19485.f62715);
            Integer num = c19485.f62711;
            JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c19485.f62714;
            jSONArrayArray.add(jSONObjectAdd3.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return C0735.m3193(jSONObjectAdd.add("failures", jSONArrayArray).add("buildCheckStatus", c20896.f67891).add("changedDexEntries", C10413.m26314(c20896.f67884)).add("changedClassCount", c20896.f67889).add("deletedClassCount", c20896.f67894).add("addedZipEntries", C10413.m26314(c20896.f67886)).add("changedZipEntries", C10413.m26314(c20896.f67887)).add("deletedZipEntries", C10413.m26314(c20896.f67883)), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24384(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m24385() {
        return C4969.m13780("Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id used for this edit check.")).add("editSessionId", C4969.m13786("string", "Edit session id used for this edit check.")).add("runBuildChecks", C4969.m13786(ClassTransform.BOOLEAN, "Whether this call ran pre-build content checks.")).add("pendingCompileCount", C4969.m13786("integer", "Number of edited Smali or AXML targets still awaiting validation.")).add("failedCount", C4969.m13786("integer", "Current Smali compile or AXML encode failure count.")).add("failures", m24380()).add("buildCheckStatus", C4969.m13786("string", "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope.")).add("changedDexEntries", C4969.m13788("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C4969.m13786("integer", "Modified or deleted class count included in the check.")).add("deletedClassCount", C4969.m13786("integer", "Deleted class count included in the check.")).add("addedZipEntries", C4969.m13788("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C4969.m13788("Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C4969.m13788("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful mt_apk_session_check data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null.")).add("editSessionId", C4969.m13789("string", "Edit session id, or null.")).add("runBuildChecks", C4969.m13786(ClassTransform.BOOLEAN, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false.")).add("overlaySaved", C4969.m13786(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", m24380()), "mt_apk_session_check diagnostics.")), C4969.m13783("mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions.", C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry"), C4969.m13778(C13530.m33069(), "mt_apk_read_text", "retry"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33058(), "mt_apk_list", "verify_workspace"), C4969.m13778(C13530.m33057(), "mt_apk_dex_read_class_outline", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m24380() {
        return C3184.m9603("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13789("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C4969.m13789("string", "Dex class descriptor.")).add("errorCode", C4969.m13789("string", "Failure code.")).add("message", C4969.m13789("string", "Compiler error message.")).add("line", C4969.m13789("integer", "0-based line, or null.")).add("column", C4969.m13789("integer", "0-based column, or null.")), "One edit session prepare failure."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24383(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24382(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }
}
