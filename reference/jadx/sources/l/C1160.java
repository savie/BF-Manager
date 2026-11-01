package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P75X */
/* JADX INFO: loaded from: classes2.dex */
public final class C1160 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject f5186;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20212 f5187;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7845 f5188;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9308 f5189;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f5190;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_native_list_items";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "List the first page of one ELF detail list. Start with mt_apk_native_inspect and copy a nextActions call; for later pages use mt_apk_continue with the returned action arguments. mt_apk_native_inspect.counts is unfiltered. This tool returns items and pagination.totalAvailableCount after applying namePrefix; zero means no items match that filter, not necessarily that the ELF has no items of this kind. Use namePrefix=\"\" and limit=100 initially. For initArray/finiArray, disassemble targetVirtualAddress when available, otherwise targetFileOffset, using targetInstructionMode and stopAtSymbolBoundary=true. If neither target address exists, inspect the slot bytes with mt_apk_read_bytes: convert slotFileOffset to decimal byteOffset and use maxBytes=pointerSize. A missing library name is returned as an empty string. See input fields for item kinds and filtering rules.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "List Native ELF Items";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4260(C1160 c1160, boolean z, C15658 c15658, JSONValue jSONValue, int i, C2956 c2956) throws C12731 {
        String strM43390;
        String str = c15658.f50855;
        long j = c2956.f11081;
        long j2 = c2956.f11084;
        if (!z || !str.isEmpty() || (c15658.f50862 == j2 && c15658.f50857 == j)) {
            String str2 = c2956.f11082;
            try {
                try {
                    C20212 c20212 = c1160.f5187;
                    String str3 = c15658.f50864;
                    String str4 = c15658.f50859;
                    boolean z2 = c15658.f50860;
                    int i2 = c15658.f50865;
                    int i3 = c15658.f50861;
                    int i4 = c15658.f50854;
                    c20212.getClass();
                    C16014 c16014M36654 = C15308.m36654(str2, str3, str4, z2, i2, i3, i4);
                    try {
                        m4263(c15658, c16014M36654, z, jSONValue);
                        long size = ((long) c16014M36654.f51834) + ((long) c16014M36654.f51838.size());
                        int i5 = c16014M36654.f51836;
                        if (size >= i5) {
                            strM43390 = null;
                        } else {
                            String str5 = c15658.f50863;
                            JSONObject jSONObjectAdd = JSON.object().add("locator", c15658.f50856).add("itemKind", c15658.f50864).add("namePrefix", c15658.f50859).add("demangle", c15658.f50860);
                            if (!str.isEmpty()) {
                                j2 = 0;
                            }
                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                            if (!str.isEmpty()) {
                                j = 0;
                            }
                            strM43390 = C18810.m43390("native_items", str5, str, i, jSONObjectAdd2.add("entryCrc", j).add("totalCount", i5).add("recommendedLimit", c15658.f50861).add("limitMax", 500), JSON.object().add("offset", (int) size));
                        }
                        return C5831.m16021(c15658, c16014M36654, strM43390);
                    } catch (IllegalArgumentException unused) {
                        if (z) {
                            throw m4261(jSONValue);
                        }
                        throw m4258();
                    }
                } catch (IllegalArgumentException unused2) {
                }
            } catch (RuntimeException unused3) {
                throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            throw m4261(jSONValue);
        }
    }

    public C1160(C7845 c7845) {
        C20212 c20212 = new C20212();
        C9308 c9308 = new C9308();
        this.f5188 = c7845;
        this.f5187 = c20212;
        this.f5189 = c9308;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f5190;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session view; pass an empty string to read the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"itemKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"neededLibraries\", \"sections\", \"segments\", \"imports\", \"symbols\", \"entries\", \"initArray\", \"finiArray\", \"relocations\"],\n    \"description\": \"ELF list to read. Prefer copying this from the mt_apk_native_inspect result's nextActions. For manual calls, use one of neededLibraries, sections, segments, imports, symbols, entries, initArray, finiArray, or relocations; if mt_apk_native_inspect reported count 0 for that itemKind, this returns an empty page. entries means all loader-recognized entry point records with stable entryN names, including program, init, fini, and preinit entries when present. initArray and finiArray separately read .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.\"\n  },\n  \"namePrefix\": {\n    \"type\": \"string\",\n    \"description\": \"Case-sensitive literal prefix for the returned item name only. Pass an empty string for no filter. entries uses stable generated entryN names; other named item kinds keep their raw ELF names. It does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter; the so file is selected only by locator. initArray/finiArray items have no name, so non-empty namePrefix matches no items.\"\n  },\n  \"demangle\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, add demangledName for imports, symbols, and relocations when C++ Itanium demangling succeeds. namePrefix still matches only name. This has no effect for entries, initArray, or finiArray. Pass false by default; use true when readable C++ symbols help interpretation.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size. Pass 100 by default; valid range is 1..500.\"\n  }\n}\n");
        this.f5190 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f5186;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_native_list_items. One filtered ELF detail page. Read filterHint before interpreting an empty page; use nextActions to continue.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("itemKind", C4969.m13786("string", "ELF item kind returned on this page.")).add("namePrefix", C4969.m13786("string", "Case-sensitive literal prefix for the returned item name only. Empty string means no filter; it does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter. entries uses generated entryN names; initArray/finiArray items have no name, so non-empty namePrefix matches no items.")).add("demangle", C4969.m13786(ClassTransform.BOOLEAN, "Whether imports, symbols, and relocations include best-effort C++ demangledName values. This flag does not affect pagination, counts, or namePrefix filtering, and has no effect for entries, initArray, or finiArray.")).add("filterHint", C18828.m43457(JSON.object().add("code", C4969.m13786("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=name_prefix_not_applicable means itemKind has no name field and non-empty namePrefix filtered out every item. Empty code/message means no hint applies.")).add("items", C3184.m9603("type", "array", "description", "ELF items for data.itemKind. neededLibraries items use {name}; sections and segments use the section shape; imports use the import shape; symbols and entries use the symbol shape. entries contain all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present, and use stable generated entryN names. initArray and finiArray use the .init_array/.fini_array pointer-slot shape, may describe the same lifecycle target with slot metadata, and have no name field. imports, symbols, and relocations may include demangledName and library=\"\" when ELF metadata does not identify a source shared library; entries always use an empty demangledName and library. relocations use the relocation shape.").add("items", JSON.object().add("anyOf", JSON.array().add(C18828.m43457(JSON.object(), "string", "Needed library name.", "name", "Needed shared library item.")).add(C18828.m43457(JSON.object().add("name", C4969.m13786("string", "Name.")).add("type", C4969.m13786("string", "Type.")).add("arch", C4969.m13786("string", "Architecture.")).add("virtualAddress", C4969.m13789("string", "Virtual address, or null.")).add("fileOffset", C4969.m13789("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C4969.m13786("integer", "File size.")).add("virtualSize", C4969.m13786("integer", "Virtual size.")).add("permissions", C4969.m13786("integer", "Permission bitset.")).add("flags", C4969.m13786("integer", "Flag bitset.")).add(e.m, C4969.m13786(ClassTransform.BOOLEAN, "Whether this range is data.")), ClassTransform.BOOLEAN, "Whether this item is a segment.", "segment", "ELF section or segment item.")).add(C18828.m43457(JSON.object().add("name", C4969.m13786("string", "Import name.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled import name when requested and different from name, otherwise empty string.")).add("library", C4969.m13786("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C4969.m13786("string", "Binding.")).add("type", C4969.m13786("string", "Type.")).add("className", C4969.m13786("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java class name.")).add("descriptor", C4969.m13786("string", "ELF/analyzer descriptor metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java method descriptor.")).add("ordinal", C4969.m13786("integer", "Ordinal.")).add("inSectionHeader", C4969.m13786(ClassTransform.BOOLEAN, "Whether the import is in a section header.")), ClassTransform.BOOLEAN, "Always true for the imports itemKind because this list represents ELF imports; do not use it to infer the provider library.", "imported", "ELF import item.")).add(C18828.m43457(JSON.object().add("name", C4969.m13786("string", "Raw ELF symbol name, or a stable generated entryN name for an entries item.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled symbol name when requested and different from name; always empty for entries.")).add("className", C4969.m13786("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO symbols usually leave this empty; do not treat it as a Dex/Java class name.")).add("library", C4969.m13786("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C4969.m13786("string", "Binding.")).add("type", C4969.m13786("string", "Type.")).add("imported", C4969.m13786(ClassTransform.BOOLEAN, "Whether this item is imported.")).add("virtualAddress", C4969.m13789("string", "Virtual address, or null.")).add("fileOffset", C4969.m13789("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C4969.m13786("integer", "Symbol size.")), "integer", "Symbol bit width reported by ELF metadata.", "symbolBits", "ELF symbol or entry item.")).add(C18828.m43457(JSON.object().add("arrayName", C4969.m13786("string", ".init_array or .fini_array.")).add("arrayIndex", C4969.m13786("integer", "0-based item offset within the current itemKind view.")).add("slotVirtualAddress", C4969.m13789("string", "Array slot virtual address, or null.")).add("slotFileOffset", C4969.m13789("string", "Array slot ELF file offset within the zip_entry bytes, or null. Convert this 0x hex string to decimal before passing it as mt_apk_read_bytes.byteOffset.")).add("targetVirtualAddress", C4969.m13789("string", "Target function virtual address, or null. Prefer this for mt_apk_native_disassemble with addressKind=virtual when non-null.")).add("targetFileOffset", C4969.m13789("string", "Target function ELF file offset within the zip_entry bytes, or null. Use this for mt_apk_native_disassemble with addressKind=file_offset only when targetVirtualAddress is null.")).add("targetInstructionMode", C4969.m13786("string", "Instruction mode to pass to mt_apk_native_disassemble with targetVirtualAddress or targetFileOffset: auto, arm, or thumb.")), "integer", "Pointer slot size in bytes: 4 for ELF32, 8 for ELF64.", "pointerSize", "ELF init/fini array pointer slot item.")).add(C18828.m43457(JSON.object().add("name", C4969.m13786("string", "Relocation name.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled relocation name when requested and different from name, otherwise empty string.")).add("library", C4969.m13786("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("type", C4969.m13786("integer", "Relocation type.")).add("numericType", C4969.m13786("integer", "Numeric relocation type.")).add("virtualAddress", C4969.m13789("string", "Virtual address, or null.")).add("fileOffset", C4969.m13789("string", "ELF file offset within the zip_entry bytes, or null.")).add("addend", C4969.m13786("integer", "Relocation addend.")).add("additive", C4969.m13786(ClassTransform.BOOLEAN, "Whether the relocation is additive.")), ClassTransform.BOOLEAN, "Whether the relocation is IFUNC.", "ifunc", "ELF relocation item."))))).add("pagination", C4969.m13782("Number of filtered items returned on this page.", "Maximum limit accepted by mt_apk_continue for later native item pages.", "Total item count after applying data.namePrefix, or null when unknown.")), "One native ELF item list page. data.itemKind determines the item shape."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-specific diagnostics.")), C4969.m13783("nextActions contains mt_apk_continue only when data.pagination.hasMore=true; otherwise it is empty.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue")));
        this.f5186 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws Throwable {
        C15658 c15658M38537;
        C7845 c7845 = this.f5188;
        try {
            c15658M38537 = C16363.m38537(jSONObject);
            try {
                C17669 c17669M4262 = m4262(c15658M38537, false, jSONObject.get("nextCursor"));
                c7845.m20720(c15658M38537.f50863);
                int i = C23044.f74862;
                return c17669M4262;
            } catch (Throwable th) {
                th = th;
                if (c15658M38537 != null) {
                    c7845.m20720(c15658M38537.f50863);
                }
                int i2 = C23044.f74862;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c15658M38537 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m4265(C21632 c21632, JSONObject jSONObject) {
        JSONObject jSONObject2 = c21632.f70156;
        C7845 c7845 = this.f5188;
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM4264 = m4264(c21632, jSONObject);
            String string3 = jSONObject2.getString("locator", "");
            String string4 = jSONObject2.getString("itemKind", "");
            JSONValue jSONValue = jSONObject.get("nextCursor");
            JSONValue jSONValue2 = jSONObject2.get("namePrefix");
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw m4261(jSONValue);
            }
            String strAsString = jSONValue2.asString();
            JSONValue jSONValue3 = jSONObject.get("nextCursor");
            JSONValue jSONValue4 = jSONObject2.get("demangle");
            if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                throw m4261(jSONValue3);
            }
            boolean zAsBoolean = jSONValue4.asBoolean();
            if (!string3.startsWith("zip_entry:") || string3.length() == 10 || !C20952.m47128(string4)) {
                throw m4261(jSONObject.get("nextCursor"));
            }
            JSONValue jSONValue5 = jSONObject.get("nextCursor");
            try {
                long j = jSONObject2.getLong("entrySize", -1L);
                if (j >= 0) {
                    JSONValue jSONValue6 = jSONObject.get("nextCursor");
                    try {
                        long j2 = jSONObject2.getLong("entryCrc", -1L);
                        if (j2 >= 0) {
                            JSONValue jSONValue7 = jSONObject.get("nextCursor");
                            try {
                                int i = jSONObject2.getInt("totalCount", -1);
                                if (i >= 0) {
                                    C17669 c17669M4262 = m4262(new C15658(string, string2, string3, string3.substring(10), string4, strAsString, zAsBoolean, iM4264, c21632.f70155.getInt("offset", -1), i, j, j2), true, jSONObject.get("nextCursor"));
                                    if (!string.isEmpty()) {
                                        c7845.m20720(string);
                                    }
                                    int i2 = C23044.f74862;
                                    return c17669M4262;
                                }
                                throw m4261(jSONValue7);
                            } catch (RuntimeException unused) {
                                throw m4261(jSONValue7);
                            }
                        }
                        throw m4261(jSONValue6);
                    } catch (RuntimeException unused2) {
                        throw m4261(jSONValue6);
                    }
                }
                throw m4261(jSONValue5);
            } catch (RuntimeException unused3) {
                throw m4261(jSONValue5);
            }
            if (!string.isEmpty()) {
                c7845.m20720(string);
            }
            int i3 = C23044.f74862;
            throw th;
        } catch (Throwable th) {
            if (!string.isEmpty()) {
                c7845.m20720(string);
            }
            int i4 = C23044.f74862;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17669 m4262(final C15658 c15658, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c15658.f50865 < 0) {
            if (z) {
                throw m4261(jSONValue);
            }
            throw m4258();
        }
        C7845 c7845 = this.f5188;
        InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
        try {
            C17669 c17669 = new C17669((JSONObject) c7845.m20699(c15658.f50863, new InterfaceC14901() { // from class: l.ۚܰ۬
                @Override // l.InterfaceC14901
                /* JADX INFO: renamed from: ۙ */
                public final JSONObject mo14279(C21956 c21956, C14952 c14952) {
                    return C1160.m4259(this.f18622, c15658, z, jSONValue, c21956, c14952);
                }
            }));
            interfaceC7855M20724.close();
            return c17669;
        } catch (Throwable th) {
            try {
                interfaceC7855M20724.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m4259(final C1160 c1160, final C15658 c15658, final boolean z, final JSONValue jSONValue, C21956 c21956, C14952 c14952) throws C12731 {
        String str = c15658.f50855;
        final int iM35888 = c14952.m35888(c21956, str);
        if (z) {
            C18810.m43393(jSONValue.asString(), iM35888, c15658.f50863, str);
        }
        C9308 c9308 = c1160.f5189;
        String str2 = c15658.f50858;
        InterfaceC1545 interfaceC1545 = new InterfaceC1545() { // from class: l.᩹ܰ۬
            @Override // l.InterfaceC1545
            /* JADX INFO: renamed from: ۙ */
            public final Object mo5330(C2956 c2956) {
                return C1160.m4260(this.f72903, z, c15658, jSONValue, iM35888, c2956);
            }
        };
        c9308.getClass();
        return (JSONObject) C9308.m23879(c21956, c14952, str, str2, interfaceC1545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4263(C15658 c15658, C16014 c16014, boolean z, JSONValue jSONValue) throws C12731 {
        String str;
        int i;
        String str2 = c15658.f50864;
        int i2 = c15658.f50861;
        String str3 = c16014.f51835;
        int i3 = c16014.f51834;
        int i4 = c16014.f51836;
        List<InterfaceC7546> list = c16014.f51838;
        if (!str2.equals(str3) || i3 != c15658.f50865 || c16014.f51837 != i2 || i4 < 0 || list.size() > i2 || i3 < 0) {
            throw C5831.m16032();
        }
        if (i3 > i4) {
            if (z) {
                throw m4261(jSONValue);
            }
            throw m4258();
        }
        int i5 = c15658.f50854;
        if (i5 >= 0 && i4 != i5) {
            throw C5831.m16032();
        }
        long size = ((long) i3) + ((long) list.size());
        long j = i4;
        if (size > j) {
            throw C5831.m16032();
        }
        if (size < j && list.size() < i2) {
            throw C5831.m16032();
        }
        for (InterfaceC7546 interfaceC7546 : list) {
            if (interfaceC7546 instanceof C8958) {
                str = ((C8958) interfaceC7546).f30693;
            } else if (interfaceC7546 instanceof C14603) {
                str = ((C14603) interfaceC7546).f47786;
            } else {
                str = interfaceC7546 instanceof C0490 ? ((C0490) interfaceC7546).f2175 : null;
            }
            if (str != null && str.length() > 4096) {
                throw C5831.m16032();
            }
            if (interfaceC7546 instanceof C10369) {
                C10369 c10369 = (C10369) interfaceC7546;
                if (c10369.f35535 < 0 || ((i = c10369.f35537) != 4 && i != 8)) {
                    throw C5831.m16032();
                }
                String str4 = c10369.f35540;
                if (!"auto".equals(str4) && !"arm".equals(str4) && !"thumb".equals(str4)) {
                    throw C5831.m16032();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m4264(C21632 c21632, JSONObject jSONObject) throws C12731 {
        int i = c21632.f70153;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM26321 = C10413.m26321(jSONValue);
            if (iM26321 >= 1 && iM26321 <= i) {
                return iM26321;
            }
            throw C12731.m31626("Invalid limit", "limit", JSON.value(iM26321), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C12731 m4258() {
        return C12731.m31626("Invalid offset", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m4261(JSONValue jSONValue) {
        return C12731.m31626("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3195(c12731, JSON.NULL, JSON.array());
    }
}
