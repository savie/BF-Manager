package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18969 implements InterfaceC22760 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44060(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m44063(int i, int i2, int i3) {
        m44061(i, i2, i3);
        return i3 >= 5 ? i2 : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m44064(int i, int i2, int i3) {
        m44061(i, i2, i3);
        return i3 >= 5 ? i : i2;
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        C14270 c14270 = new C14270();
        c14270.m34619(System.currentTimeMillis());
        c19929.m45857(c14270);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m44066(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return "…" + str.substring((str.length() - i) + 1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000f. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44062(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        m44061(i, i2, i3);
        if (fArr == null || fArr.length < 9) {
            throw new IllegalArgumentException("Matrix output must contain at least 9 elements");
        }
        float f6 = -1.0f;
        switch (i3) {
            case 2:
                f = 0.0f;
                f2 = i;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
            case 3:
                float f7 = i2;
                f = 0.0f;
                f2 = i;
                f3 = f7;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 4:
                f3 = i2;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 5:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 6:
                f = -1.0f;
                f2 = i2;
                f3 = 0.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 7:
                f2 = i2;
                f3 = i;
                f = -1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            case 8:
                f3 = i;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            default:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
        }
        fArr[0] = f6;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f3;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m44059(String str, boolean z) {
        try {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return Class.forName(str, true, ClassLoader.getSystemClassLoader());
            }
        } catch (Throwable th) {
            if (z) {
                System.err.println("Caught " + th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44058(C12163 c12163) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c12163.f39099).add("editSessionId", c12163.f39093).add("runBuildChecks", c12163.f39098).add("pendingCompileCount", c12163.f39103).add("failedCount", c12163.f39091);
        ArrayList<C17384> arrayList = c12163.f39095;
        JSONArray jSONArrayArray = JSON.array();
        for (C17384 c17384 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add("locator", C4375.m13967(c17384.f56533, c17384.f56535)).add("className", c17384.f56532).add("errorCode", c17384.f56539).add("message", c17384.f56536);
            Integer num = c17384.f56537;
            JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c17384.f56538;
            jSONArrayArray.add(jSONObjectAdd3.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return C15300.m36728(jSONObjectAdd.add("failures", jSONArrayArray).add("buildCheckStatus", c12163.f39101).add("changedDexEntries", C12556.m31235(c12163.f39102)).add("changedClassCount", c12163.f39094).add("deletedClassCount", c12163.f39097).add("addedZipEntries", C12556.m31235(c12163.f39092)).add("changedZipEntries", C12556.m31235(c12163.f39100)).add("deletedZipEntries", C12556.m31235(c12163.f39096)), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44061(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Image dimensions must be positive");
        }
        if (i3 < 1 || i3 > 8) {
            throw new IllegalArgumentException("EXIF orientation must be between 1 and 8");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m44065() {
        return C10932.m27734("Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id used for this edit check.")).add("editSessionId", C10932.m27740("string", "Edit session id used for this edit check.")).add("runBuildChecks", C10932.m27740(ClassTransform.BOOLEAN, "Whether this call ran pre-build content checks.")).add("pendingCompileCount", C10932.m27740("integer", "Number of edited Smali or AXML targets still awaiting validation.")).add("failedCount", C10932.m27740("integer", "Current Smali compile or AXML encode failure count.")).add("failures", m44057()).add("buildCheckStatus", C10932.m27740("string", "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope.")).add("changedDexEntries", C10932.m27742("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C10932.m27740("integer", "Modified or deleted class count included in the check.")).add("deletedClassCount", C10932.m27740("integer", "Deleted class count included in the check.")).add("addedZipEntries", C10932.m27742("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C10932.m27742("Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C10932.m27742("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful mt_apk_session_check data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null.")).add("editSessionId", C10932.m27743("string", "Edit session id, or null.")).add("runBuildChecks", C10932.m27740(ClassTransform.BOOLEAN, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false.")).add("overlaySaved", C10932.m27740(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", m44057()), "mt_apk_session_check diagnostics.")), C10932.m27737("mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions.", C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry"), C10932.m27732(C16237.m38550(), "mt_apk_read_text", "retry"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "retry"), C10932.m27732(C16237.m38549(), "mt_apk_list_entries", "verify_workspace"), C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "verify_workspace"), C10932.m27732(C16237.m38547(), "mt_apk_resource_list", "verify_workspace"), C10932.m27732(C16237.m38542(), "mt_apk_dex_read_class_outline", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m44057() {
        return C22121.m50076("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits.").add("items", C10932.m27731(JSON.object().add("locator", C10932.m27743("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C10932.m27743("string", "Dex class descriptor.")).add("errorCode", C10932.m27743("string", "Failure code.")).add("message", C10932.m27743("string", "Compiler error message.")).add("line", C10932.m27743("integer", "0-based line, or null.")).add("column", C10932.m27743("integer", "0-based column, or null.")), "One edit session prepare failure."));
    }
}
