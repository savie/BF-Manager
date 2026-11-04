package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C75V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11722 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f37925;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f37926;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f37927;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f37928;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f37929;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Patch Native Instructions";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Patch executable ELF instructions using assembly source with a non-empty editSessionId. Prefer this to hand-encoding bytes for mt_apk_patch_bytes. Copy expectedHex from current mt_apk_read_bytes or mt_apk_native_disassemble output for the same editSessionId and locator; it both guards against stale reads and defines the equal-length patch window. file_offset is inside the SO entry, not the APK. Only loaded executable file-backed mappings can be patched. Alignment, instruction mode, assembly, length, and expected bytes are checked; a failure leaves the entry unchanged. Success returns assembledHex and afterHex including optional NOP padding, with nextActions to verify the result. This only validates local machine-code replacement, not control flow, stack balance, register conventions, relocations, or function semantics.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_patch_instructions";
    }

    public C11722(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f37927 = c1897;
        this.f37925 = c5033;
        this.f37926 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f37928;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create. The base workspace cannot be modified.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. Only zip_entry: ELF entries are accepted.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. The mapped effective virtual address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit; x86 has no additional alignment requirement.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"expectedHex\": {\n    \"type\": \"string\",\n    \"description\": \"Stale-view guard bytes currently present at the patch address. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it. For disassembly output, concatenate the byte columns of contiguous selected lines. Use non-empty even-length hex without spaces. This defines the equal-length patch window; runtime accepts at most 256 bytes.\"\n  },\n  \"replacementAssembly\": {\n    \"type\": \"string\",\n    \"description\": \"Assembly source text containing instructions and labels only, assembled at the effective virtual address. This is not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly; do not include wa, seek commands, patch commands, or file paths. Runtime accepts 1..4096 characters.\"\n  },\n  \"paddingMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"none\", \"nop\"],\n    \"description\": \"Use none to require exact assembled length, or nop to fill a shorter assembled result with architecture NOP bytes.\"\n  }\n}\n");
        this.f37928 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f37929;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM36991 = C15451.m36991();
        this.f37929 = jSONObjectM36991;
        return jSONObjectM36991;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15451.m36976(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        C1897 c1897 = this.f37927;
        final C8586 c8586M28276 = null;
        try {
            C16834.m39750();
            c8586M28276 = C11218.m28276(jSONObject);
            String str = c8586M28276.f28074;
            InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
            try {
                JSONObject jSONObject2 = (JSONObject) c1897.m6533(str, new InterfaceC15320() { // from class: l.ۚܺۚ
                    @Override // l.InterfaceC15320
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final JSONObject mo16829(C14069 c14069, C18282 c18282) {
                        return C11722.m29435(c18282, c8586M28276, this.f19800, c14069);
                    }
                });
                int i = C24294.f78630;
                C1238 c1238 = new C1238(jSONObject2);
                interfaceC18854M6559.close();
                c1897.m6556(str);
                return c1238;
            } catch (Throwable th) {
                try {
                    interfaceC18854M6559.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c8586M28276 != null) {
                c1897.m6556(c8586M28276.f28074);
            }
            int i2 = C24294.f78630;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m29435(final C18282 c18282, final C8586 c8586, final C11722 c11722, final C14069 c14069) {
        C25391 c25391 = c11722.f37926;
        String str = c8586.f28077;
        String str2 = c8586.f28075;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.֫ܺۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final Object mo7002(C17185 c17185) {
                return C15451.m36977(C13214.m32728(c14069, c18282, c11722.f37925, c17185, c8586));
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }
}
