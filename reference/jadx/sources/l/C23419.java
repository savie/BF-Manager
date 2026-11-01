package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩻ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F762 */
/* JADX INFO: loaded from: classes.dex */
public final class C23419 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9308 f75823;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f75824;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public JSONObject f75825;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12130 f75826;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f75827;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7845 f75828;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_disassemble";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Disassemble an instruction window from an executable ELF mapping. Use mt_apk_native_map_address when unsure whether an address is code. file_offset means an offset inside the SO entry, not the APK. Pass editSessionId=\"\" for the base APK. The result disassemblyText uses \"0x<hex-address>: <hex-bytes> <assembly>\"; displayed addresses are virtual addresses with the 0x prefix and no leading zero padding. Machine bytes are contiguous lowercase hex in original byte order. archBits is the ELF bit width, while instructionSet and instructionWidth describe the decoded instructions. Missing symbol metadata falls back to the requested byte window. If incompleteInstructionAtEnd=true, retry the same address with a larger maxBytes. When hasMore=true, copy the purpose=continue action from nextActions and call its tool, mt_apk_native_disassemble, with its complete arguments for the next window. Do not pass this action to mt_apk_continue. To edit code, first disassemble the same location with a non-empty editSessionId, then use mt_apk_native_patch_instructions. Use addressKind=virtual, effectiveAddress or any displayed address copied unchanged, and resolvedInstructionMode. Build expectedHex by concatenating the byte columns of contiguous selected lines, at most 256 bytes. Use mt_apk_patch_bytes only when exact raw machine bytes are intentionally required.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Disassemble Native Bytes";
    }

    public C23419(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f75828 = c7845;
        this.f75824 = c20212;
        this.f75823 = c9308;
        this.f75826 = new C12130();
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f75827;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to disassemble the edited session view; pass an empty string to disassemble the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"stopAtSymbolBoundary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether to stop before the end of the containing best-effort sized ELF symbol when available. Use true when following an xref/source address for containing-symbol context; use false for a normal maxBytes-bounded window without a symbol-end cap. This does not move the start address back to the symbol start.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes in the instruction window. Valid range is 1..4096.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum instructions to include in disassemblyText. Valid range is 1..200.\"\n  }\n}\n");
        this.f75827 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f75825;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM16044 = C5831.m16044();
        this.f75825 = jSONObjectM16044;
        return jSONObjectM16044;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        final C18479 c18479M38549;
        C7845 c7845 = this.f75828;
        try {
            c18479M38549 = C16363.m38549(jSONObject);
            try {
                String str = c18479M38549.f58892;
                InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
                try {
                    C17669 c17669 = new C17669((JSONObject) c7845.m20699(str, new InterfaceC14901() { // from class: l.ۛۗ֨
                        @Override // l.InterfaceC14901
                        /* JADX INFO: renamed from: ۙ */
                        public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                            return C23419.m51563(this.f19632, c18479M38549, c21956, c14952);
                        }
                    }));
                    interfaceC7855M20724.close();
                    c7845.m20720(str);
                    int i = C23044.f74862;
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
                th = th3;
                if (c18479M38549 != null) {
                    c7845.m20720(c18479M38549.f58892);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c18479M38549 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m51563(final C23419 c23419, final C18479 c18479, C21956 c21956, C14952 c14952) {
        C9308 c9308 = c23419.f75823;
        String str = c18479.f58883;
        String str2 = c18479.f58886;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.ۧۗ֨
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                C23419 c234110 = this.f36550;
                return C17068.m39853(c234110.f75824, c2956, c18479, c234110.f75826);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONValue jSONValueM31950;
        if (C12887.m31962(c12731)) {
            jSONValueM31950 = C12887.m31950(c12731);
        } else {
            jSONValueM31950 = JSON.NULL;
        }
        return C0735.m3195(c12731, jSONValueM31950, c12731.f42471);
    }
}
