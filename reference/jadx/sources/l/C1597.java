package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C75V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1597 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f6454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f6455;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f6456;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f6457;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f6458;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_patch_instructions";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Patch executable ELF instructions using assembly source with a non-empty editSessionId. Prefer this to hand-encoding bytes for mt_apk_patch_bytes. Copy expectedHex from current mt_apk_read_bytes or mt_apk_native_disassemble output for the same editSessionId and locator; it both guards against stale reads and defines the equal-length patch window. file_offset is inside the SO entry, not the APK. Only loaded executable file-backed mappings can be patched. Alignment, instruction mode, assembly, length, and expected bytes are checked; a failure leaves the entry unchanged. Success returns assembledHex and afterHex including optional NOP padding, with nextActions to verify the result. This only validates local machine-code replacement, not control flow, stack balance, register conventions, relocations, or function semantics.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Patch Native Instructions";
    }

    public C1597(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f6456 = c7845;
        this.f6455 = c20212;
        this.f6457 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f6458;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. The mapped effective virtual address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit; x86 has no additional alignment requirement.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"expectedHex\": {\n    \"type\": \"string\",\n    \"description\": \"Stale-view guard bytes currently present at the patch address. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it. Use non-empty even-length hex without spaces. This defines the equal-length patch window; runtime accepts at most 256 bytes.\"\n  },\n  \"replacementAssembly\": {\n    \"type\": \"string\",\n    \"description\": \"Assembly source text containing instructions and labels only, assembled at the effective virtual address. This is not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly; do not include wa, seek commands, patch commands, or file paths. Runtime accepts 1..4096 characters.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"nop\"],\n    \"description\": \"Use none to require exact assembled length, or nop to fill a shorter assembled result with architecture NOP bytes.\"\n  }\n}\n");
        this.f6458 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f6454;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16042 = C5831.m16042();
        this.f6454 = jSONObjectM16042;
        return jSONObjectM16042;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C5831.m16020(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        C7845 c7845 = this.f6456;
        final C7190 c7190M38552 = null;
        try {
            C11755.m29361();
            c7190M38552 = C16363.m38552(jSONObject);
            String str = c7190M38552.f23994;
            InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
            try {
                JSONObject jSONObject2 = (JSONObject) c7845.m20700(str, new InterfaceC21250() { // from class: l.᩻ۙ۬
                    @Override // l.InterfaceC21250
                    /* JADX INFO: renamed from: ۙ */
                    public final JSONObject mo33699(C21956 c21956, C14952 c14952) {
                        return C1597.m5440(c14952, c7190M38552, this.f75990, c21956);
                    }
                });
                int i = C23044.f74862;
                C17669 c17669 = new C17669(jSONObject2);
                interfaceC7855M20724.close();
                c7845.m20720(str);
                return c17669;
            } catch (Throwable th) {
                try {
                    interfaceC7855M20724.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c7190M38552 != null) {
                c7845.m20720(c7190M38552.f23994);
            }
            int i2 = C23044.f74862;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m5440(final C14952 c14952, final C7190 c7190, final C1597 c1597, final C21956 c21956) {
        C9308 c9308 = c1597.f6457;
        String str = c7190.f23986;
        String str2 = c7190.f23989;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.ܳۙ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C5831.m16022(C10771.m27073(c21956, c14952, c1597.f6455, c2956, c7190));
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }
}
