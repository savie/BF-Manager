package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩷᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O6XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21187 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0219 f68970;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2800 f68971;

    public C21187(C2800 c2800) {
        C0219 c0219 = new C0219();
        this.f68971 = c2800;
        this.f68970 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7782 m47638(String str) {
        C2800 c2800 = this.f68971;
        C3070 c3070M8504 = c2800.m8504();
        String strM8502 = C2800.m8502(str, c3070M8504, MotionUtils.EASING_TYPE_PATH);
        C11268 c11268M8509 = c2800.m8509(strM8502);
        try {
            C7782 c7782M47634 = m47634(strM8502, c3070M8504);
            c11268M8509.close();
            return c7782M47634;
        } catch (Throwable th) {
            try {
                c11268M8509.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7782 m47634(String str, C3070 c3070) throws C12731 {
        String str2;
        C3070 c3070M8504;
        String str3;
        C10605 c10605;
        boolean z;
        boolean z2;
        C12731 c12731M47635;
        C2800 c2800 = this.f68971;
        AbstractC20745 abstractC20745M8508 = c2800.m8508(str);
        m47637(m47633(abstractC20745M8508), str);
        m47636(abstractC20745M8508, c3070.f11560);
        String parent = abstractC20745M8508.getParent();
        do {
            C3070 c3070M8505 = c2800.m8504();
            c3070M8505.m9207(str);
            str2 = c3070M8505.f11560;
            if (parent != null) {
                c3070M8505.m9207(parent);
            }
            c3070M8505.m9210(str);
            AbstractC20745 abstractC20745M8509 = c2800.m8508(str);
            c2800.m8507(abstractC20745M8509, new C14817(str, str2));
            m47637(m47633(abstractC20745M8509), str);
            m47636(abstractC20745M8509, str2);
            c3070M8504 = c2800.m8504();
            str3 = c3070M8504.f11560;
        } while (!str2.equals(str3));
        AbstractC20745 abstractC20745M85010 = c2800.m8508(str);
        c2800.m8507(abstractC20745M85010, new C14817(str, str3));
        m47637(m47633(abstractC20745M85010), str);
        EnumC16512 enumC16512M47636 = m47636(abstractC20745M85010, str3);
        String str4 = enumC16512M47636 == EnumC16512.ATOMIC ? "atomic" : "best_effort";
        JSONArray<JSONValue> jSONArrayArray = JSON.array();
        try {
            abstractC20745M85010.mo33989().mo8392();
            c12731M47635 = null;
            z = true;
            z2 = true;
        } catch (C20040 e) {
            try {
                C5928 c5928Mo8394 = c2800.m8508(str).mo33989().mo8394();
                if (c5928Mo8394.m16196() == EnumC12279.MISSING) {
                    c10605 = new C10605(true, true);
                } else if (c5928Mo8394.m16196() == EnumC12279.REGULAR) {
                    c10605 = new C10605(false, true);
                } else {
                    c10605 = new C10605(true, false);
                }
            } catch (RuntimeException | C20040 unused) {
                boolean z3 = enumC16512M47636 == EnumC16512.ATOMIC;
                c10605 = new C10605(!z3, z3);
            }
            C12731 c12731M8500 = C2800.m8500(e);
            C12731 c12731M31627 = e.m45399() != EnumC15807.IO_ERROR ? c12731M8500 : C12731.m31627("FILE_DELETE_FAILED", "Failed to permanently delete the local file.", "warning", (JSONArray) null, new JSONObject(c12731M8500.f42468));
            String str5 = c3070M8504.f11560;
            z = c10605.f36256;
            z2 = c10605.f36257;
            c12731M47635 = m47635(c12731M31627, str, str5, str4, z, z2, jSONArrayArray);
        }
        if (z || !z2) {
            try {
                this.f68970.getClass();
                C2664.m8195();
                C22252.m49404(str);
                C11838.m29532();
            } catch (RuntimeException unused2) {
                for (JSONValue jSONValue : jSONArrayArray) {
                    if (!jSONValue.isString() || !"File change notification could not be completed.".equals(jSONValue.asString())) {
                    }
                }
                jSONArrayArray.add("File change notification could not be completed.");
            }
        }
        if (c12731M47635 != null) {
            throw m47635(c12731M47635, str, c3070M8504.f11560, str4, z, z2, jSONArrayArray);
        }
        return new C7782(new JSONArray(jSONArrayArray), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5928 m47633(AbstractC20745 abstractC20745) throws C12731 {
        try {
            return abstractC20745.mo33989().mo8394();
        } catch (C20040 e) {
            this.f68971.getClass();
            throw C2800.m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47637(C5928 c5928, String str) throws C12731 {
        int i = C9194.f31270[c5928.m16196().ordinal()];
        C2800 c2800 = this.f68971;
        if (i == 2) {
            c2800.getClass();
            throw C2800.m8501(str);
        }
        if (i == 3) {
            throw C0280.m1794(c5928, c2800, "FILE_NOT_REGULAR", "Directory paths must be deleted with mt_file_delete_directory.", str);
        }
        if (i == 4) {
            throw C0280.m1794(c5928, c2800, "FILE_IS_SYMLINK", "Symbolic links are not accepted by mt_file_delete.", str);
        }
        if (i == 5) {
            throw C0280.m1794(c5928, c2800, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16512 m47636(AbstractC20745 abstractC20745, String str) throws C12731 {
        EnumC16512 enumC16512Mo1799 = abstractC20745.mo33989().mo1799(EnumC17217.DELETE_FILE_OR_LINK);
        if (enumC16512Mo1799 != EnumC16512.UNSUPPORTED) {
            return enumC16512Mo1799;
        }
        throw C12731.m31631("FILE_BACKEND_UNSUPPORTED", "The file backend does not support checked permanent deletion.", "fatal", null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, abstractC20745.mo33986(), "policyRevision", str).add("operation", "delete_file").add("backendReason", "unsupported").add("changed", false).add("operationMode", JSON.NULL).add("stateKnown", true).add("warnings", new JSONArray(JSON.array())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m47635(C12731 c12731, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObject = c12731.f42468;
        JSONArray jSONArray2 = c12731.f42471;
        String str4 = c12731.f42475;
        String str5 = c12731.f42472;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        if (c12731.f42469) {
            return C12731.m31627(str5, c12731.getMessage(), str4, jSONArray2, jSONObject2);
        }
        return C12731.m31631(str5, c12731.getMessage(), str4, jSONArray2, jSONObject2);
    }
}
