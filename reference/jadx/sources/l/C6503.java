package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P75X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6503 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5033 f21836;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25391 f21837;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1897 f21838;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f21839;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f21840;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List Native ELF Items";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List the first page of one ELF detail list. Start with mt_apk_native_inspect and copy a nextActions call; for later pages use mt_apk_continue with the returned action arguments. mt_apk_native_inspect.counts is unfiltered. This tool returns items and pagination.totalAvailableCount after applying namePrefix; zero means no items match that filter, not necessarily that the ELF has no items of this kind. Use namePrefix=\"\" and limit=100 initially. For initArray/finiArray, disassemble targetVirtualAddress when available, otherwise targetFileOffset, using targetInstructionMode and stopAtSymbolBoundary=true. If neither target address exists, inspect the slot bytes with mt_apk_read_bytes: convert slotFileOffset to decimal byteOffset and use maxBytes=pointerSize. A missing library name is returned as an empty string. See input fields for item kinds and filtering rules.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_native_list_items";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m18355(C6503 c6503, boolean z, C13806 c13806, JSONValue jSONValue, int i, C17185 c17185) throws C10186 {
        String strM42757;
        String str = c13806.f43790;
        long j = c17185.f56012;
        long j2 = c17185.f56015;
        if (!z || !str.isEmpty() || (c13806.f43789 == j2 && c13806.f43781 == j)) {
            String str2 = c17185.f56010;
            try {
                try {
                    C5033 c5033 = c6503.f21836;
                    String str3 = c13806.f43786;
                    String str4 = c13806.f43784;
                    boolean z2 = c13806.f43783;
                    int i2 = c13806.f43791;
                    int i3 = c13806.f43782;
                    int i4 = c13806.f43785;
                    c5033.getClass();
                    C22652 c22652M25421 = C9752.m25421(str2, str3, str4, z2, i2, i3, i4);
                    try {
                        m18358(c13806, c22652M25421, z, jSONValue);
                        long size = ((long) c22652M25421.f73566) + ((long) c22652M25421.f73565.size());
                        int i5 = c22652M25421.f73564;
                        if (size >= i5) {
                            strM42757 = null;
                        } else {
                            String str5 = c13806.f43787;
                            JSONObject jSONObjectAdd = JSON.object().add("locator", c13806.f43780).add("itemKind", c13806.f43786).add("namePrefix", c13806.f43784).add("demangle", c13806.f43783);
                            if (!str.isEmpty()) {
                                j2 = 0;
                            }
                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                            if (!str.isEmpty()) {
                                j = 0;
                            }
                            strM42757 = C18326.m42757("native_items", str5, str, i, jSONObjectAdd2.add("entryCrc", j).add("totalCount", i5).add("recommendedLimit", c13806.f43782).add("limitMax", 500), JSON.object().add("offset", (int) size));
                        }
                        return C15451.m36978(c13806, c22652M25421, strM42757);
                    } catch (IllegalArgumentException unused) {
                        if (z) {
                            throw m18357(jSONValue);
                        }
                        throw m18359();
                    }
                } catch (IllegalArgumentException unused2) {
                }
            } catch (RuntimeException unused3) {
                throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            throw m18357(jSONValue);
        }
    }

    public C6503(C1897 c1897) {
        C5033 c5033 = new C5033();
        C25391 c25391 = new C25391();
        this.f21838 = c1897;
        this.f21836 = c5033;
        this.f21837 = c25391;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f21839;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session view; pass an empty string to read the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"itemKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"neededLibraries\", \"sections\", \"segments\", \"imports\", \"symbols\", \"entries\", \"initArray\", \"finiArray\", \"relocations\"],\n    \"description\": \"ELF list to read. Prefer copying this from the mt_apk_native_inspect result's nextActions. For manual calls, use one of neededLibraries, sections, segments, imports, symbols, entries, initArray, finiArray, or relocations; if mt_apk_native_inspect reported count 0 for that itemKind, this returns an empty page. entries means all loader-recognized entry point records with stable entryN names, including program, init, fini, and preinit entries when present. initArray and finiArray separately read .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.\"\n  },\n  \"namePrefix\": {\n    \"type\": \"string\",\n    \"description\": \"Case-sensitive literal prefix for the returned item name only. Pass an empty string for no filter. entries uses stable generated entryN names; other named item kinds keep their raw ELF names. It does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter; the so file is selected only by locator. initArray/finiArray items have no name, so non-empty namePrefix matches no items.\"\n  },\n  \"demangle\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, add demangledName for imports, symbols, and relocations when C++ Itanium demangling succeeds. namePrefix still matches only name. This has no effect for entries, initArray, or finiArray. Pass false by default; use true when readable C++ symbols help interpretation.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size. Pass 100 by default; valid range is 1..500.\"\n  }\n}\n");
        this.f21839 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f21840;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_native_list_items. One filtered ELF detail page. Read filterHint before interpreting an empty page; use nextActions to continue.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("itemKind", C10932.m27740("string", "ELF item kind returned on this page.")).add("namePrefix", C10932.m27740("string", "Case-sensitive literal prefix for the returned item name only. Empty string means no filter; it does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter. entries uses generated entryN names; initArray/finiArray items have no name, so non-empty namePrefix matches no items.")).add("demangle", C10932.m27740(ClassTransform.BOOLEAN, "Whether imports, symbols, and relocations include best-effort C++ demangledName values. This flag does not affect pagination, counts, or namePrefix filtering, and has no effect for entries, initArray, or finiArray.")).add("filterHint", C22783.m51386(JSON.object().add("code", C10932.m27740("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=name_prefix_not_applicable means itemKind has no name field and non-empty namePrefix filtered out every item. Empty code/message means no hint applies.")).add("items", C22121.m50076("type", "array", "description", "ELF items for data.itemKind. neededLibraries items use {name}; sections and segments use the section shape; imports use the import shape; symbols and entries use the symbol shape. entries contain all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present, and use stable generated entryN names. initArray and finiArray use the .init_array/.fini_array pointer-slot shape, may describe the same lifecycle target with slot metadata, and have no name field. imports, symbols, and relocations may include demangledName and library=\"\" when ELF metadata does not identify a source shared library; entries always use an empty demangledName and library. relocations use the relocation shape.").add("items", JSON.object().add("anyOf", JSON.array().add(C22783.m51386(JSON.object(), "string", "Needed library name.", "name", "Needed shared library item.")).add(C22783.m51386(JSON.object().add("name", C10932.m27740("string", "Name.")).add("type", C10932.m27740("string", "Type.")).add("arch", C10932.m27740("string", "Architecture.")).add("virtualAddress", C10932.m27743("string", "Virtual address, or null.")).add("fileOffset", C10932.m27743("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C10932.m27740("integer", "File size.")).add("virtualSize", C10932.m27740("integer", "Virtual size.")).add("permissions", C10932.m27740("integer", "Permission bitset.")).add("flags", C10932.m27740("integer", "Flag bitset.")).add(e.m, C10932.m27740(ClassTransform.BOOLEAN, "Whether this range is data.")), ClassTransform.BOOLEAN, "Whether this item is a segment.", "segment", "ELF section or segment item.")).add(C22783.m51386(JSON.object().add("name", C10932.m27740("string", "Import name.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled import name when requested and different from name, otherwise empty string.")).add("library", C10932.m27740("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C10932.m27740("string", "Binding.")).add("type", C10932.m27740("string", "Type.")).add("className", C10932.m27740("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java class name.")).add("descriptor", C10932.m27740("string", "ELF/analyzer descriptor metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java method descriptor.")).add("ordinal", C10932.m27740("integer", "Ordinal.")).add("inSectionHeader", C10932.m27740(ClassTransform.BOOLEAN, "Whether the import is in a section header.")), ClassTransform.BOOLEAN, "Always true for the imports itemKind because this list represents ELF imports; do not use it to infer the provider library.", "imported", "ELF import item.")).add(C22783.m51386(JSON.object().add("name", C10932.m27740("string", "Raw ELF symbol name, or a stable generated entryN name for an entries item.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled symbol name when requested and different from name; always empty for entries.")).add("className", C10932.m27740("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO symbols usually leave this empty; do not treat it as a Dex/Java class name.")).add("library", C10932.m27740("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C10932.m27740("string", "Binding.")).add("type", C10932.m27740("string", "Type.")).add("imported", C10932.m27740(ClassTransform.BOOLEAN, "Whether this item is imported.")).add("virtualAddress", C10932.m27743("string", "Virtual address, or null.")).add("fileOffset", C10932.m27743("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C10932.m27740("integer", "Symbol size.")), "integer", "Symbol bit width reported by ELF metadata.", "symbolBits", "ELF symbol or entry item.")).add(C22783.m51386(JSON.object().add("arrayName", C10932.m27740("string", ".init_array or .fini_array.")).add("arrayIndex", C10932.m27740("integer", "0-based item offset within the current itemKind view.")).add("slotVirtualAddress", C10932.m27743("string", "Array slot virtual address, or null.")).add("slotFileOffset", C10932.m27743("string", "Array slot ELF file offset within the zip_entry bytes, or null. Convert this 0x hex string to decimal before passing it as mt_apk_read_bytes.byteOffset.")).add("targetVirtualAddress", C10932.m27743("string", "Target function virtual address, or null. Prefer this for mt_apk_native_disassemble with addressKind=virtual when non-null.")).add("targetFileOffset", C10932.m27743("string", "Target function ELF file offset within the zip_entry bytes, or null. Use this for mt_apk_native_disassemble with addressKind=file_offset only when targetVirtualAddress is null.")).add("targetInstructionMode", C10932.m27740("string", "Instruction mode to pass to mt_apk_native_disassemble with targetVirtualAddress or targetFileOffset: auto, arm, or thumb.")), "integer", "Pointer slot size in bytes: 4 for ELF32, 8 for ELF64.", "pointerSize", "ELF init/fini array pointer slot item.")).add(C22783.m51386(JSON.object().add("name", C10932.m27740("string", "Relocation name.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled relocation name when requested and different from name, otherwise empty string.")).add("library", C10932.m27740("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("type", C10932.m27740("integer", "Analyzer relocation category, not the architecture-specific ELF relocation code. Use numericType to identify ELF relocation semantics.")).add("numericType", C10932.m27740("integer", "Architecture-specific ELF relocation code, interpreted using the ELF architecture, such as R_AARCH64_RELATIVE.")).add("virtualAddress", C10932.m27743("string", "Virtual address, or null.")).add("fileOffset", C10932.m27743("string", "ELF file offset within the zip_entry bytes, or null.")).add("addend", C10932.m27740("integer", "Relocation addend.")).add("additive", C10932.m27740(ClassTransform.BOOLEAN, "Whether the relocation is additive.")), ClassTransform.BOOLEAN, "Whether the relocation is IFUNC.", "ifunc", "ELF relocation item."))))).add("pagination", C10932.m27736("Number of filtered items returned on this page.", "Maximum limit accepted by mt_apk_continue for later native item pages.", "Total item count after applying data.namePrefix, or null when unknown.")), "One native ELF item list page. data.itemKind determines the item shape."), C10932.m27741(C10932.m27731(JSON.object(), "No tool-specific diagnostics.")), C10932.m27737("nextActions contains mt_apk_continue only when data.pagination.hasMore=true; otherwise it is empty.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue")));
        this.f21840 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws Throwable {
        C13806 c13806M28274;
        C1897 c1897 = this.f21838;
        try {
            c13806M28274 = C11218.m28274(jSONObject);
            try {
                C1238 c1238M18356 = m18356(c13806M28274, false, jSONObject.get("nextCursor"));
                c1897.m6556(c13806M28274.f43787);
                int i = C24294.f78630;
                return c1238M18356;
            } catch (Throwable th) {
                th = th;
                if (c13806M28274 != null) {
                    c1897.m6556(c13806M28274.f43787);
                }
                int i2 = C24294.f78630;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c13806M28274 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m18361(C14596 c14596, JSONObject jSONObject) {
        JSONObject jSONObject2 = c14596.f45982;
        C1897 c1897 = this.f21838;
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM18360 = m18360(c14596, jSONObject);
            String string3 = jSONObject2.getString("locator", "");
            String string4 = jSONObject2.getString("itemKind", "");
            JSONValue jSONValue = jSONObject.get("nextCursor");
            JSONValue jSONValue2 = jSONObject2.get("namePrefix");
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw m18357(jSONValue);
            }
            String strAsString = jSONValue2.asString();
            JSONValue jSONValue3 = jSONObject.get("nextCursor");
            JSONValue jSONValue4 = jSONObject2.get("demangle");
            if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                throw m18357(jSONValue3);
            }
            boolean zAsBoolean = jSONValue4.asBoolean();
            if (!string3.startsWith("zip_entry:") || string3.length() == 10 || !C10717.m27303(string4)) {
                throw m18357(jSONObject.get("nextCursor"));
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
                                    C1238 c1238M18356 = m18356(new C13806(string, string2, string3, string3.substring(10), string4, strAsString, zAsBoolean, iM18360, c14596.f45980.getInt("offset", -1), i, j, j2), true, jSONObject.get("nextCursor"));
                                    if (!string.isEmpty()) {
                                        c1897.m6556(string);
                                    }
                                    int i2 = C24294.f78630;
                                    return c1238M18356;
                                }
                                throw m18357(jSONValue7);
                            } catch (RuntimeException unused) {
                                throw m18357(jSONValue7);
                            }
                        }
                        throw m18357(jSONValue6);
                    } catch (RuntimeException unused2) {
                        throw m18357(jSONValue6);
                    }
                }
                throw m18357(jSONValue5);
            } catch (RuntimeException unused3) {
                throw m18357(jSONValue5);
            }
            if (!string.isEmpty()) {
                c1897.m6556(string);
            }
            int i3 = C24294.f78630;
            throw th;
        } catch (Throwable th) {
            if (!string.isEmpty()) {
                c1897.m6556(string);
            }
            int i4 = C24294.f78630;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C1238 m18356(final C13806 c13806, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c13806.f43791 < 0) {
            if (z) {
                throw m18357(jSONValue);
            }
            throw m18359();
        }
        C1897 c1897 = this.f21838;
        InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
        try {
            C1238 c1238 = new C1238((JSONObject) c1897.m6534(c13806.f43787, new InterfaceC19796() { // from class: l.᩵ܺۚ
                @Override // l.InterfaceC19796
                /* JADX INFO: renamed from: ۙ */
                public final JSONObject mo5413(C14069 c14069, C18282 c18282) {
                    return C6503.m18354(this.f66284, c13806, z, jSONValue, c14069, c18282);
                }
            }));
            interfaceC18854M6559.close();
            return c1238;
        } catch (Throwable th) {
            try {
                interfaceC18854M6559.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m18354(final C6503 c6503, final C13806 c13806, final boolean z, final JSONValue jSONValue, C14069 c14069, C18282 c18282) throws C10186 {
        String str = c13806.f43790;
        final int iM42610 = c18282.m42610(c14069, str);
        if (z) {
            C18326.m42760(jSONValue.asString(), iM42610, c13806.f43787, str);
        }
        C25391 c25391 = c6503.f21837;
        String str2 = c13806.f43788;
        InterfaceC11964 interfaceC11964 = new InterfaceC11964() { // from class: l.ۨܺۚ
            @Override // l.InterfaceC11964
            /* JADX INFO: renamed from: ۙ */
            public final Object mo7002(C17185 c17185) {
                return C6503.m18355(this.f40048, z, c13806, jSONValue, iM42610, c17185);
            }
        };
        c25391.getClass();
        return (JSONObject) C25391.m56749(c14069, c18282, str, str2, interfaceC11964);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18358(C13806 c13806, C22652 c22652, boolean z, JSONValue jSONValue) throws C10186 {
        String str;
        int i;
        String str2 = c13806.f43786;
        int i2 = c13806.f43782;
        String str3 = c22652.f73562;
        int i3 = c22652.f73566;
        int i4 = c22652.f73564;
        List<InterfaceC21906> list = c22652.f73565;
        if (!str2.equals(str3) || i3 != c13806.f43791 || c22652.f73563 != i2 || i4 < 0 || list.size() > i2 || i3 < 0) {
            throw C15451.m36986();
        }
        if (i3 > i4) {
            if (z) {
                throw m18357(jSONValue);
            }
            throw m18359();
        }
        int i5 = c13806.f43785;
        if (i5 >= 0 && i4 != i5) {
            throw C15451.m36986();
        }
        long size = ((long) i3) + ((long) list.size());
        long j = i4;
        if (size > j) {
            throw C15451.m36986();
        }
        if (size < j && list.size() < i2) {
            throw C15451.m36986();
        }
        for (InterfaceC21906 interfaceC21906 : list) {
            if (interfaceC21906 instanceof C13482) {
                str = ((C13482) interfaceC21906).f42892;
            } else if (interfaceC21906 instanceof C17430) {
                str = ((C17430) interfaceC21906).f56694;
            } else {
                str = interfaceC21906 instanceof C15192 ? ((C15192) interfaceC21906).f49597 : null;
            }
            if (str != null && str.length() > 4096) {
                throw C15451.m36986();
            }
            if (interfaceC21906 instanceof C4752) {
                C4752 c4752 = (C4752) interfaceC21906;
                if (c4752.f16694 < 0 || ((i = c4752.f16696) != 4 && i != 8)) {
                    throw C15451.m36986();
                }
                String str4 = c4752.f16698;
                if (!"auto".equals(str4) && !"arm".equals(str4) && !"thumb".equals(str4)) {
                    throw C15451.m36986();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m18360(C14596 c14596, JSONObject jSONObject) throws C10186 {
        int i = c14596.f45979;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM31240 = C12556.m31240(jSONValue);
            if (iM31240 >= 1 && iM31240 <= i) {
                return iM31240;
            }
            throw C10186.m26301("Invalid limit", "limit", JSON.value(iM31240), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C10186 m18359() {
        return C10186.m26301("Invalid offset", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m18357(JSONValue jSONValue) {
        return C10186.m26301("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36730(c10186, JSON.NULL, JSON.array());
    }
}
