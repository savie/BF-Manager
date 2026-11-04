package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۚ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5999 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f20521;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23153 f20522;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1897 f20523;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public JSONObject f20524;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f20525;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25391 f20526;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Disassemble Native Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Disassemble an instruction window from an executable ELF mapping. Use mt_apk_native_map_address when unsure whether an address is code. file_offset is inside the SO entry, not the APK. Missing symbol metadata falls back to the requested byte window. If incompleteInstructionAtEnd=true, retry the same address with a larger maxBytes. For later windows, copy the purpose=continue action from nextActions and call mt_apk_native_disassemble with its complete arguments. Do not pass this action to mt_apk_continue. To edit code, disassemble in the edit session, then use mt_apk_native_patch_instructions with the returned addresses, instruction mode and bytes.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_disassemble";
    }

    public C5999(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f20523 = c1897;
        this.f20521 = c5033;
        this.f20526 = c25391;
        this.f20522 = new C23153();
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f20525;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to disassemble the edited session view; pass an empty string to disassemble the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. Non-ARM ELF requires auto. ARM32 auto only infers Thumb from odd virtual addresses; otherwise retry errors may offer explicit thumb and arm calls.\"\n  },\n  \"stopAtSymbolBoundary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether to stop before the end of the containing best-effort sized ELF symbol when available. Use true when following an xref/source address for containing-symbol context; use false for a normal maxBytes-bounded window without a symbol-end cap. This does not move the start address back to the symbol start.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes in the instruction window. Valid range is 1..4096.\"\n  },\n  \"maxInstructions\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum instructions to include in disassemblyText. Valid range is 1..200.\"\n  }\n}\n");
        this.f20525 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f20524;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM37000 = C15451.m37000();
        this.f20524 = jSONObjectM37000;
        return jSONObjectM37000;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        final C19028 c19028M28268;
        C1897 c1897 = this.f20523;
        try {
            c19028M28268 = C11218.m28268(jSONObject);
            try {
                String str = c19028M28268.f61650;
                InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
                try {
                    C1238 c1238 = new C1238((JSONObject) c1897.m6534(str, new InterfaceC19796() { // from class: l.ܳ᩻ۚ
                        @Override // l.InterfaceC19796
                        /* JADX INFO: renamed from: ۙ */
                        public final JSONObject mo5413(C14069 c14069, C18282 c18282) {
                            return C5999.m17430(this.f51008, c19028M28268, c14069, c18282);
                        }
                    }));
                    interfaceC18854M6559.close();
                    c1897.m6556(str);
                    int i = C24294.f78630;
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
                th = th3;
                if (c19028M28268 != null) {
                    c1897.m6556(c19028M28268.f61650);
                }
                int i2 = C24294.f78630;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c19028M28268 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m17430(final C5999 c5999, final C19028 c19028, C14069 c14069, C18282 c18282) {
        C25391 c25391 = c5999.f20526;
        String str = c19028.f61649;
        String str2 = c19028.f61647;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.۫᩻ۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                C5999 c59910 = this.f42837;
                return C20169.m46397(c59910.f20521, c17185, c19028, c59910.f20522);
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONValue jSONValueM54989;
        if (C24645.m55000(c10186)) {
            jSONValueM54989 = C24645.m54989(c10186);
        } else {
            jSONValueM54989 = JSON.NULL;
        }
        return C15300.m36730(c10186, jSONValueM54989, c10186.f32599);
    }
}
