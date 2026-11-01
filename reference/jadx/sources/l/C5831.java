package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.am;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 1761 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5831 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16025(C19185 c19185, C23775 c23775) {
        String str;
        int i;
        String str2 = c19185.f61956;
        String str3 = c19185.f61957;
        String str4 = c19185.f61958;
        JSONObject jSONObjectAdd = m16016(str2, str3, str4).add("type", c23775.f76897).add("arch", c23775.f76900).add(am.w, c23775.f76889).add("machine", c23775.f76902).add("abi", c23775.f76892).add(am.x, c23775.f76895).add("subsystem", c23775.f76896).add("interpreter", c23775.f76905).add("archBits", c23775.f76890).add("hasVirtualAddress", c23775.f76907).add("positionIndependent", c23775.f76904).add("nx", c23775.f76903).add("canary", c23775.f76893).add("baseAddress", m16028(c23775.f76898)).add("entryVirtualAddress", m16028(c23775.f76891)).add("entryFileOffset", m16028(c23775.f76899)).add("initVirtualAddress", m16028(c23775.f76901)).add("finiVirtualAddress", m16028(c23775.f76894));
        C11075 c11075 = c23775.f76906;
        String str5 = "neededLibraries";
        JSONObject jSONObjectAdd2 = JSON.object().add("neededLibraries", c11075.f37598);
        int i2 = c11075.f37594;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("sections", i2);
        int i3 = c11075.f37600;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("segments", i3);
        int i4 = c11075.f37599;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("imports", i4);
        int i5 = c11075.f37596;
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("symbols", i5);
        int i6 = c11075.f37597;
        String str6 = "entries";
        JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("entries", i6);
        int i7 = c11075.f37595;
        JSONObject jSONObjectAdd8 = jSONObjectAdd7.add("initArray", i7);
        int i8 = c11075.f37601;
        JSONObject jSONObjectAdd9 = jSONObjectAdd8.add("finiArray", i8);
        int i9 = c11075.f37602;
        JSONObject jSONObjectAdd10 = jSONObjectAdd.add("counts", jSONObjectAdd9.add("relocations", i9));
        JSONArray jSONArrayArray = JSON.array();
        int i10 = 0;
        while (i10 < 9) {
            String str7 = C20952.f68286[i10];
            C20952.m47129(str7);
            if (str5.equals(str7)) {
                str = str5;
                i = c11075.f37598;
            } else {
                str = str5;
                if ("sections".equals(str7)) {
                    i = i2;
                } else if ("segments".equals(str7)) {
                    i = i3;
                } else if ("imports".equals(str7)) {
                    i = i4;
                } else if ("symbols".equals(str7)) {
                    i = i5;
                } else if (str6.equals(str7)) {
                    i = i6;
                } else if ("initArray".equals(str7)) {
                    i = i7;
                } else {
                    i = "finiArray".equals(str7) ? i8 : i9;
                }
            }
            if (i > 0) {
                jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", str2).add("editSessionId", str3).add("locator", str4).add("itemKind", str7).add("namePrefix", "").add("demangle", false).add("limit", 100), "mt_apk_native_list_items", "inspect", "Read first page of native ".concat(str7)));
            }
            i10++;
            str5 = str;
            c11075 = c11075;
            str6 = str6;
        }
        return C0735.m3193(jSONObjectAdd10, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16021(C15658 c15658, C16014 c16014, String str) {
        Iterator it;
        String str2;
        String str3;
        boolean z;
        JSONObject jSONObjectAdd;
        String str4 = c15658.f50863;
        boolean z2 = str != null;
        String str5 = c15658.f50864;
        String str6 = c15658.f50859;
        String str7 = c15658.f50855;
        JSONObject jSONObjectM16016 = m16016(str4, str7, c15658.f50856);
        String str8 = c16014.f51835;
        List list = c16014.f51838;
        JSONObject jSONObjectAdd2 = jSONObjectM16016.add("itemKind", str8).add("namePrefix", str6).add("demangle", c15658.f50860).add("filterHint", (("initArray".equals(str5) || "finiArray".equals(str5)) && !str6.isEmpty()) ? C3184.m9603("code", "name_prefix_not_applicable", "message", "This itemKind has no name field, so a non-empty namePrefix filters out every item; retry with namePrefix=\"\" to read the list.") : C3184.m9603("code", "", "message", ""));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC7546 interfaceC7546 = (InterfaceC7546) it2.next();
            if (interfaceC7546 instanceof C20247) {
                jSONObjectAdd = JSON.object().add("name", ((C20247) interfaceC7546).f65688);
                str2 = str4;
                z = z2;
                str3 = str7;
                it = it2;
            } else {
                it = it2;
                if (interfaceC7546 instanceof C12486) {
                    C12486 c12486 = (C12486) interfaceC7546;
                    str2 = str4;
                    jSONObjectAdd = JSON.object().add("name", c12486.f41650).add("type", c12486.f41651).add("arch", c12486.f41652).add("virtualAddress", m16028(c12486.f41654)).add("fileOffset", m16028(c12486.f41658)).add("size", c12486.f41656).add("virtualSize", c12486.f41659).add("permissions", c12486.f41653).add("flags", c12486.f41655).add(e.m, c12486.f41657).add("segment", c12486.f41649);
                    z = z2;
                    str3 = str7;
                } else {
                    str2 = str4;
                    str3 = str7;
                    z = z2;
                    if (interfaceC7546 instanceof C8958) {
                        C8958 c8958 = (C8958) interfaceC7546;
                        jSONObjectAdd = JSON.object().add("name", c8958.f30688).add("demangledName", c8958.f30693).add("library", c8958.f30696).add("bind", c8958.f30691).add("type", c8958.f30690).add("className", c8958.f30695).add("descriptor", c8958.f30689).add("ordinal", c8958.f30694).add("inSectionHeader", c8958.f30692).add("imported", true);
                    } else if (interfaceC7546 instanceof C14603) {
                        C14603 c14603 = (C14603) interfaceC7546;
                        jSONObjectAdd = JSON.object().add("name", c14603.f47785).add("demangledName", c14603.f47786).add("className", c14603.f47791).add("library", c14603.f47794).add("bind", c14603.f47788).add("type", c14603.f47790).add("imported", c14603.f47789).add("virtualAddress", m16028(c14603.f47795)).add("fileOffset", m16028(c14603.f47792)).add("size", c14603.f47787).add("symbolBits", c14603.f47793);
                    } else if (interfaceC7546 instanceof C10369) {
                        C10369 c10369 = (C10369) interfaceC7546;
                        jSONObjectAdd = JSON.object().add("arrayName", c10369.f35539).add("arrayIndex", c10369.f35535).add("slotVirtualAddress", m16028(c10369.f35536)).add("slotFileOffset", m16028(c10369.f35534)).add("targetVirtualAddress", m16028(c10369.f35538)).add("targetFileOffset", m16028(c10369.f35533)).add("targetInstructionMode", c10369.f35540).add("pointerSize", c10369.f35537);
                    } else {
                        if (!(interfaceC7546 instanceof C0490)) {
                            throw new IllegalArgumentException("Unsupported native item type");
                        }
                        C0490 c0490 = (C0490) interfaceC7546;
                        jSONObjectAdd = JSON.object().add("name", c0490.f2178).add("demangledName", c0490.f2175).add("library", c0490.f2173).add("type", c0490.f2171).add("numericType", c0490.f2169).add("virtualAddress", m16028(c0490.f2174)).add("fileOffset", m16028(c0490.f2176)).add("addend", c0490.f2172).add("additive", c0490.f2177).add("ifunc", c0490.f2170);
                    }
                }
            }
            jSONArrayArray.add(jSONObjectAdd);
            it2 = it;
            str4 = str2;
            str7 = str3;
            z2 = z;
        }
        String str9 = str4;
        boolean z3 = z2;
        String str10 = str7;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("items", jSONArrayArray).add("pagination", m16027(z3, str, list.size(), 500, Long.valueOf(c16014.f51836)));
        JSONArray jSONArrayArray2 = JSON.array();
        if (z3) {
            jSONArrayArray2.add(C11320.m28376(C3184.m9603("workspaceId", str9, "editSessionId", str10).add("nextCursor", str).add("limit", c15658.f50861), "mt_apk_continue", "continue", "Continue native item page"));
        }
        return C0735.m3193(jSONObjectAdd3, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16018(C8602 c8602, C18129 c18129) throws C12731 {
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = m16016(c8602.f29705, c8602.f29706, c8602.f29711).add("addressKind", c8602.f29709).add("address", c8602.f29710);
        boolean z = c18129.f57969;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("found", z);
        m16041(c18129);
        m16047(c18129);
        JSONObject jSONObjectM16023 = z ? m16023(c18129) : m16039();
        C21657 c21657 = c18129.f57964;
        if (!c21657.f70213) {
            JSONObject jSONObjectAdd4 = JSON.object().add("found", false).add("name", "").add("demangledName", "").add("instructionMode", "");
            JSONValue jSONValue = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue).add("startFileOffset", jSONValue).add("offset", jSONValue).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("found", true).add("name", c21657.f70208).add("demangledName", c21657.f70209).add("instructionMode", c21657.f70211).add("startVirtualAddress", m16028(c21657.f70212)).add("startFileOffset", m16028(c21657.f70207)).add("offset", m16028(c21657.f70210)).add("size", c21657.f70214);
        }
        return C0735.m3193(jSONObjectAdd3.add("mapping", jSONObjectM16023.add("enclosingSymbol", jSONObjectAdd)), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16026(C19891 c19891, String str, boolean z, C18129 c18129, String str2, int i, String str3, String str4, C15496 c15496, String str5) throws C12731 {
        JSONObject jSONObjectM16014;
        Iterator it;
        String str6;
        JSONValue jSONValueAdd;
        String str7 = c19891.f63778;
        List list = c19891.f63768;
        String str8 = c19891.f63779;
        long j = c18129.f57970;
        int i2 = c15496.f50486;
        List list2 = c15496.f50491;
        boolean z2 = c15496.f50490;
        boolean z3 = str5 != null;
        String str9 = "";
        JSONObject jSONObjectM9603 = (!z || !("code".equals(str8) || "both".equals(str8)) || !list.contains(e.m) || j < 0 || j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) ? C3184.m9603("warningCode", "", "warning", "") : C3184.m9603("warningCode", "low_address_instruction_data_reference_noise", "warning", "Low target virtual addresses can be confused with ordinary instruction immediates; code/both instruction data refs may contain false positives. To inspect strings, tables, or pointer slots only, retry with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto.");
        if (z) {
            String str10 = c15496.f50487;
            if (z2 && z3) {
                throw m16032();
            }
            if (!z2 && !z3) {
                throw m16032();
            }
            if (!list2.isEmpty()) {
                jSONObjectM16014 = m16014(jSONObjectM9603, "refs_found", "This page contains direct references matching scanKind and referenceKinds; continue if pagination.hasMore is true.", str10);
            } else if (z3) {
                jSONObjectM16014 = m16014(jSONObjectM9603, "scan_incomplete", "This page has no refs, but scanning is not complete; continue with mt_apk_continue before concluding no references.", str10);
            } else {
                if (!z2) {
                    throw m16032();
                }
                jSONObjectM16014 = m16014(jSONObjectM9603, "no_refs_found", "This bounded direct-reference scan completed for the current scanKind, referenceKinds, and maxScanBytes, and found no direct references.", str10);
            }
        } else {
            if (!list2.isEmpty() || i2 != 0 || !z2 || z3) {
                throw m16032();
            }
            jSONObjectM16014 = m16014(jSONObjectM9603, "target_not_mapped", "No scan ran because the target has no loaded file-backed mapping; it may be a miss, virtual-only address, or non-loaded file bytes.", "target_not_mapped");
        }
        String str11 = c19891.f63762;
        JSONObject jSONObjectAdd = m16016(str7, str11, c19891.f63780).add("addressKind", c19891.f63770).add("address", c19891.f63772).add("instructionMode", c19891.f63782).add("resolvedInstructionMode", str).add("scanKind", str8);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArrayArray.add((String) it2.next());
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("referenceKinds", jSONArrayArray).add("targetMapped", z).add("targetVirtualAddress", z ? m16028(j) : JSON.NULL).add("targetFileOffset", z ? m16028(c18129.f57968) : JSON.NULL).add("mapping", m16023(c18129)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C23257 c23257 = (C23257) it3.next();
            String str12 = str9;
            JSONObject jSONObjectAdd3 = JSON.object().add("sourceVirtualAddress", m16028(c23257.f75446)).add("sourceFileOffset", m16028(c23257.f75450)).add("sourceKind", c23257.f75447).add("sourceSize", c23257.f75449);
            C18317 c18317 = c23257.f75453;
            if (c18317 != null) {
                String str13 = c18317.f58432;
                it = it3;
                if (m16036(str13, true)) {
                    String str14 = c18317.f58429;
                    str6 = str12;
                    if (!m16036(str14, false) || str14.equals(str13)) {
                        str14 = str6;
                    }
                    str11 = str11;
                    jSONValueAdd = C3184.m9603("name", str13, "demangledName", str14).add("startVirtualAddress", m16028(c18317.f58433)).add("startFileOffset", m16028(c18317.f58430)).add("offset", m16028(c18317.f58431)).add("size", c18317.f58428);
                }
                jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c23257.f75448).add(TextBundle.TEXT_ENTRY, c23257.f75451).add("referenceKind", c23257.f75452));
                it3 = it;
                str9 = str6;
                str7 = str7;
                str11 = str11;
            } else {
                it = it3;
            }
            str6 = str12;
            jSONValueAdd = JSON.NULL;
            jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c23257.f75448).add(TextBundle.TEXT_ENTRY, c23257.f75451).add("referenceKind", c23257.f75452));
            it3 = it;
            str9 = str6;
            str7 = str7;
            str11 = str11;
        }
        String str15 = str11;
        String str16 = str7;
        JSONObject jSONObjectAdd4 = jSONObjectAdd2.add("refs", jSONArrayArray2).add("scannedBytes", i2).add("scanComplete", z2).add("scanSummary", jSONObjectM16014).add("pagination", m16027(z3, str5, list2.size(), 200, null));
        JSONArray jSONArrayArray3 = JSON.array();
        if (z3) {
            jSONArrayArray3.add(C11320.m28376(C3184.m9603("workspaceId", str16, "editSessionId", str15).add("nextCursor", str5).add("limit", c19891.f63773), "mt_apk_continue", "continue", "Continue native xref scan"));
        }
        return C0735.m3193(jSONObjectAdd4, jSONArrayArray3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16024(C18479 c18479, String str, long j, C18129 c18129, String str2, int i, String str3, String str4, int i2, int i3, boolean z, List list, C17120 c17120, boolean z2, JSONValue jSONValue, JSONValue jSONValue2, JSONValue jSONValue3) {
        JSONObject jSONObjectAdd;
        String str5 = c18479.f58892;
        String str6 = c18479.f58883;
        String str7 = c18479.f58882;
        JSONObject jSONObjectAdd2 = m16016(str5, str6, str7).add("addressKind", c18479.f58888).add("address", c18479.f58890).add("instructionMode", c18479.f58891);
        boolean z3 = c18479.f58887;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("stopAtSymbolBoundary", z3).add("resolvedInstructionMode", str).add("effectiveAddress", m16028(j)).add("mapping", m16023(c18129));
        if (!c17120.f54594) {
            JSONObject jSONObjectAdd4 = JSON.object().add("requested", c17120.f54591).add("applied", false).add("endReached", false).add("name", "").add("demangledName", "");
            JSONValue jSONValue4 = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue4).add("endVirtualAddressExclusive", jSONValue4).add("offset", jSONValue4).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("requested", true).add("applied", true).add("endReached", c17120.f54596).add("name", c17120.f54595).add("demangledName", c17120.f54598).add("startVirtualAddress", m16028(c17120.f54593)).add("endVirtualAddressExclusive", m16028(c17120.f54592)).add("offset", m16028(c17120.f54599)).add("size", c17120.f54597);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd3.add("symbolBoundary", jSONObjectAdd).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4).add("bytesRead", i2).add("bytesConsumed", i3).add("incompleteInstructionAtEnd", z);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0186 c0186 = (C0186) it.next();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(C16363.m38542(c0186.f1304));
            sb.append(": ");
            sb.append(c0186.f1306);
            sb.append(' ');
            sb.append(c0186.f1303);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("disassemblyText", sb.toString()).add("instructionCount", list.size()).add("hasMore", z2).add("nextAddressKind", jSONValue).add("nextAddress", jSONValue2).add("nextInstructionMode", jSONValue3);
        JSONArray jSONArrayArray = JSON.array();
        if (z2) {
            jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", str5).add("editSessionId", str6).add("locator", str7).add("addressKind", jSONValue).add("address", jSONValue2).add("instructionMode", jSONValue3).add("stopAtSymbolBoundary", z3).add("maxBytes", c18479.f58889).add("maxInstructions", c18479.f58884), "mt_apk_native_disassemble", "continue", "Read the next contiguous instruction window"));
        }
        return C0735.m3193(jSONObjectAdd6, jSONArrayArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:213:0x0811 A[LOOP:5: B:192:0x07be->B:213:0x0811, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0831  */
    /* JADX WARN: Code duplicated, block: B:252:0x0816 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r3v49, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v51, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16017(C7896 c7896, String str, long j, C18129 c18129, String str2, int i, String str3, String str4, C5617 c5617) {
        String str5;
        int i2;
        ?? r9;
        ?? r35;
        String str6;
        int i3;
        int i4;
        int i5;
        C15710 c15710M16034;
        ?? r1;
        boolean z;
        C19943 c19943;
        int i6;
        ?? r36;
        int i7;
        long jMax;
        long j2;
        long j3;
        ?? r37;
        ?? r38;
        ?? r10;
        ?? r39;
        ?? r11;
        ?? r12;
        ?? r2;
        JSONArray jSONArrayArray;
        String str7;
        String str8;
        JSONArray jSONArrayArray2;
        JSONArray jSONArrayArray3;
        JSONArray jSONArrayArray4;
        ?? r310;
        String str9;
        ?? r311;
        int i8;
        long j4;
        Iterator it;
        String str10;
        boolean zEquals;
        boolean z2;
        String str11;
        List list;
        String str12;
        String str13 = c7896.f25957;
        String str14 = c7896.f25955;
        String str15 = c7896.f25953;
        List list2 = c5617.f19231;
        C11968 c11968 = c5617.f19223;
        List<C2794> list3 = c5617.f19225;
        List<C3312> list4 = c5617.f19224;
        String str16 = c7896.f25958;
        int i9 = c7896.f25952;
        int i10 = c7896.f25949;
        int i11 = c7896.f25954;
        String str17 = c7896.f25947;
        String str18 = c7896.f25948;
        String str19 = c7896.f25956;
        List list5 = list2;
        boolean zEquals2 = ErrorBundle.SUMMARY_ENTRY.equals(str16);
        C9664 c9664 = c5617.f19226;
        ?? r8 = c9664.f32487;
        int i12 = c9664.f32483;
        int i13 = c9664.f32486;
        int i14 = c9664.f32485;
        int i15 = c9664.f32489;
        if ("max_analysis_bytes_reached".equals(r8) || "max_blocks_reached".equals(r8) || "max_instructions_reached".equals(r8)) {
            if (i15 < 16 || i12 < 1 || i14 < 1) {
                str5 = str18;
                i2 = i15;
                r9 = "max_instructions_reached";
                r35 = "max_blocks_reached";
                str6 = str17;
                i3 = i10;
                i4 = i11;
                i5 = i9;
                c15710M16034 = m16034(c7896, (String) r8);
            } else {
                long j5 = c11968.f40108;
                if (j5 <= 0) {
                    c15710M16034 = m16034(c7896, (String) r8);
                    i2 = i15;
                    r9 = "max_instructions_reached";
                    r35 = "max_blocks_reached";
                    str5 = str18;
                    str6 = str17;
                    i3 = i10;
                    i4 = i11;
                    i5 = i9;
                } else {
                    double d = j5;
                    long jM16011 = m16011(d);
                    int i16 = i9;
                    double d2 = i12;
                    ?? r312 = "max_blocks_reached";
                    double d3 = i15;
                    long jM16012 = m16011((d2 / d3) * d);
                    double d4 = i14;
                    long jM16013 = m16011(Math.max((d4 / d3) * d, jM16012 * (d4 / d2)));
                    if ("max_analysis_bytes_reached".equals(r8)) {
                        i6 = i11;
                        jMax = Math.max(jM16011, ((long) i6) * 2);
                        i7 = i10;
                        r37 = r312;
                    } else {
                        i6 = i11;
                        if (r312.equals(r8)) {
                            r37 = r312;
                            i7 = i10;
                            jM16013 = Math.max(jM16013, ((long) i7) * 2);
                            jMax = jM16011;
                        } else {
                            i15 = i15;
                            ?? r13 = "max_instructions_reached";
                            i7 = i10;
                            if (r13.equals(r8)) {
                                r36 = r312;
                                i16 = i16;
                                j2 = jM16013;
                                jM16012 = Math.max(jM16012, ((long) i16) * 2);
                                j3 = jM16011;
                                r10 = r13;
                                r38 = r36;
                            } else {
                                r36 = r312;
                                jMax = jM16011;
                                r11 = r13;
                                r39 = r36;
                                j2 = jM16013;
                                j3 = jMax;
                                r10 = r11;
                                r38 = r39;
                            }
                        }
                        int i17 = i16;
                        i4 = i6;
                        long j6 = j2;
                        str5 = str18;
                        i2 = i15;
                        str6 = str17;
                        i3 = i7;
                        i5 = i17;
                        c15710M16034 = m16033(c7896, j3, j6, jM16012);
                        r9 = r10;
                        r35 = r38;
                    }
                    r11 = "max_instructions_reached";
                    r39 = r37;
                    j2 = jM16013;
                    j3 = jMax;
                    r10 = r11;
                    r38 = r39;
                    int i18 = i16;
                    i4 = i6;
                    long j7 = j2;
                    str5 = str18;
                    i2 = i15;
                    str6 = str17;
                    i3 = i7;
                    i5 = i18;
                    c15710M16034 = m16033(c7896, j3, j7, jM16012);
                    r9 = r10;
                    r35 = r38;
                }
            }
            r8.getClass();
            byte b = -1;
            switch (r8.hashCode()) {
                case -632178732:
                    ?? r3 = r35;
                    boolean zEquals3 = r8.equals(r3);
                    r1 = r3;
                    if (zEquals3) {
                        b = 0;
                        r1 = r3;
                    }
                    break;
                case 1722263731:
                    if (r8.equals(r9)) {
                        b = 1;
                    }
                    r1 = r35;
                    break;
                case 2113101462:
                    if (r8.equals("max_analysis_bytes_reached")) {
                        b = 2;
                    }
                    r1 = r35;
                    break;
                default:
                    r1 = r35;
                    break;
            }
            switch (b) {
                case 0:
                    if (c15710M16034.f50993 > i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 1:
                    if (c15710M16034.f50991 > i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    if (c15710M16034.f50994 > i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            c19943 = new C19943(c15710M16034.f50994, c15710M16034.f50993, c15710M16034.f50991, z, c15710M16034.f50992);
            r2 = r1;
            r12 = r9;
        } else {
            str5 = str18;
            str16 = str16;
            i12 = i12;
            i2 = i15;
            r12 = "max_instructions_reached";
            c11968 = c11968;
            str19 = str19;
            str6 = str17;
            c19943 = new C19943(c7896.f25954, c7896.f25949, c7896.f25952, false, false);
            r2 = "max_blocks_reached";
            i14 = i14;
        }
        String str20 = str19;
        String str21 = str5;
        int i19 = i12;
        JSONObject jSONObjectAdd = m16016(str20, str21, str6).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", str16).add("detailOmitted", zEquals2).add("resolvedInstructionMode", str).add("effectiveAddress", m16028(j)).add("mapping", m16023(c18129)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        C11968 c11969 = c11968;
        String str22 = "startVirtualAddress";
        String str23 = "startFileOffset";
        String str24 = str6;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("function", JSON.object().add("startVirtualAddress", m16028(c11969.f40103)).add("startFileOffset", m16028(c11969.f40106)).add("name", c11969.f40104).add("demangledName", c11969.f40107).add("symbolSize", c11969.f40108).add("startSource", c11969.f40110).add("boundarySource", c11969.f40109).add("boundaryEndVirtualAddress", m16028(c11969.f40105)));
        String str25 = "terminator";
        String str26 = "instructionCount";
        String str27 = "size";
        if (zEquals2) {
            jSONArrayArray = JSON.array();
        } else {
            jSONArrayArray = JSON.array();
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C3312 c3312 = (C3312) it2.next();
                jSONArrayArray.add(JSON.object().add("startVirtualAddress", m16028(c3312.f12235)).add("startFileOffset", m16028(c3312.f12233)).add("size", c3312.f12236).add("instructionCount", c3312.f12237).add("terminator", c3312.f12238).add("assemblyText", c3312.f12234));
                it2 = it3;
                c19943 = c19943;
                str20 = str20;
                str21 = str21;
            }
        }
        String str28 = str21;
        C19943 c19944 = c19943;
        String str29 = str20;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("blocks", jSONArrayArray);
        if (zEquals2) {
            jSONArrayArray2 = JSON.array();
            str7 = "terminator";
            str8 = "startFileOffset";
        } else {
            List list6 = c5617.f19227;
            JSONArray jSONArrayArray5 = JSON.array();
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                C4911 c4911 = (C4911) it4.next();
                jSONArrayArray5.add(JSON.object().add("fromVirtualAddress", m16028(c4911.f17229)).add("toVirtualAddress", m16028(c4911.f17230)).add("kind", c4911.f17231));
                it4 = it4;
                str23 = str23;
                str25 = str25;
            }
            str7 = str25;
            str8 = str23;
            jSONArrayArray2 = jSONArrayArray5;
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("edges", jSONArrayArray2);
        if (zEquals2) {
            jSONArrayArray3 = JSON.array();
        } else {
            jSONArrayArray3 = JSON.array();
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                C14085 c14085 = (C14085) it5.next();
                jSONArrayArray3.add(JSON.object().add("sourceVirtualAddress", m16028(c14085.f46252)).add("flowKind", c14085.f46251).add("targetVirtualAddress", m16028(c14085.f46250)).add("reason", c14085.f46253));
                it5 = it5;
                str27 = str27;
                str26 = str26;
                str22 = str22;
            }
        }
        String str30 = str26;
        String str31 = str22;
        String str32 = str27;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("externalFlows", jSONArrayArray3);
        if (zEquals2) {
            jSONArrayArray4 = JSON.array();
        } else {
            JSONArray jSONArrayArray6 = JSON.array();
            for (C2794 c2794 : list3) {
                JSONObject jSONObjectAdd6 = JSON.object().add("sourceVirtualAddress", m16028(c2794.f10646)).add("flowKind", c2794.f10647);
                if (c2794.f10650) {
                    jSONObjectAdd6.add("targetVirtualAddress", m16028(c2794.f10648));
                }
                jSONObjectAdd6.add("reason", c2794.f10649);
                jSONArrayArray6.add(jSONObjectAdd6);
            }
            jSONArrayArray4 = jSONArrayArray6;
        }
        JSONObject jSONObjectAdd7 = jSONObjectAdd5.add("unresolvedFlows", jSONArrayArray4);
        JSONObject jSONObjectAdd8 = JSON.object().add("controlFlowComplete", c9664.f32484);
        String str33 = c9664.f32487;
        JSONObject jSONObjectAdd9 = jSONObjectAdd7.add("analysisSummary", jSONObjectAdd8.add("completionReason", str33).add("meaning", m16030(str33)).add("bytesAnalyzed", i2).add("instructionsAnalyzed", i19));
        int i20 = i14;
        JSONObject jSONObjectAdd10 = JSON.object().add("blockCount", i20).add("edgeCount", i13).add("externalFlowCount", c9664.f32490).add("unresolvedFlowCount", c9664.f32488).add("terminatorCounts", JSON.object().add("fallthrough", m16010("fallthrough", list4)).add("conditional_jump", m16010("conditional_jump", list4)).add("jump", m16010("jump", list4)).add("indirect_jump", m16010("indirect_jump", list4)).add("return", m16010("return", list4)).add("trap", m16010("trap", list4)).add("invalid", m16010("invalid", list4)).add("budget_boundary", m16010("budget_boundary", list4)));
        String str34 = "return";
        String str35 = "instruction_mode_transition";
        ?? r29 = r12;
        JSONObject jSONObjectAdd11 = JSON.object().add("target_not_executable", m16043("target_not_executable", list3)).add("unaligned_or_overlapping_target", m16043("unaligned_or_overlapping_target", list3)).add("instruction_mode_transition", m16043("instruction_mode_transition", list3)).add(r2, m16043((String) r2, list3)).add("max_analysis_bytes_reached", m16043("max_analysis_bytes_reached", list3)).add(r12, m16043((String) r12, list3)).add("invalid_instruction", m16043("invalid_instruction", list3));
        String str36 = "indirect_target";
        JSONObject jSONObjectAdd12 = jSONObjectAdd10.add("unresolvedReasonCounts", jSONObjectAdd11.add("indirect_target", m16043("indirect_target", list3)));
        JSONArray jSONArrayArray7 = JSON.array();
        if (i20 == 0) {
            r311 = r2;
            str9 = "max_analysis_bytes_reached";
        } else {
            int iM16010 = m16010("conditional_jump", list4);
            int iM16011 = m16010("indirect_jump", list4);
            r310 = r2;
            int iM16012 = m16010("budget_boundary", list4);
            str9 = "max_analysis_bytes_reached";
            if (i20 > 1 && iM16010 == 0 && iM16011 == 0 && i13 == i20 - 1) {
                jSONArrayArray7.add("observed_linear");
            }
            if (iM16010 > 0 || i13 > i20) {
                jSONArrayArray7.add("observed_branchy");
            }
            if (iM16011 > 0 || (i20 >= 16 && iM16012 >= 4)) {
                r311 = r310;
                r311 = r310;
                jSONArrayArray7.add("observed_dispatcher_like");
                r311 = r310;
            }
        }
        r311 = r310;
        r311 = r310;
        r311 = r310;
        JSONObject jSONObjectAdd13 = jSONObjectAdd9.add("observedGraphSummary", jSONObjectAdd12.add("observedShapeHints", jSONArrayArray7));
        C3312 c3312M16031 = m16031(c5617);
        JSONObject jSONObjectAdd14 = jSONObjectAdd13.add("entryPreview", JSON.object().add("available", c3312M16031 != null).add(str31, c3312M16031 == null ? JSON.NULL : m16028(c3312M16031.f12235)).add("lines", c3312M16031 == null ? JSON.array() : m16012(16, c3312M16031.f12234)));
        ArrayList<C3312> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        m16035(arrayList, hashSet, m16031(c5617));
        Iterator it6 = list4.iterator();
        while (true) {
            i8 = 8;
            if (it6.hasNext()) {
                C3312 c3313 = (C3312) it6.next();
                if (arrayList.size() < 8) {
                    String str37 = c3313.f12238;
                    if ("budget_boundary".equals(str37) || "invalid".equals(str37) || "indirect_jump".equals(str37)) {
                        m16035(arrayList, hashSet, c3313);
                    }
                }
            }
        }
        if (arrayList.size() < 8) {
            int i21 = 0;
            for (C3312 c3314 : list4) {
                if (arrayList.size() < i8) {
                    long j8 = c3314.f12235 + c3314.f12236;
                    while (true) {
                        if (i21 < list5.size()) {
                            list = list5;
                            str11 = str35;
                            str12 = str36;
                            if (((C14085) list.get(i21)).f46252 < c3314.f12235) {
                                i21++;
                                str35 = str11;
                                str36 = str12;
                                list5 = list;
                            }
                        } else {
                            str11 = str35;
                            list = list5;
                            str12 = str36;
                        }
                    }
                    boolean z3 = i21 < list.size() && ((C14085) list.get(i21)).f46252 < j8;
                    String str38 = str34;
                    if (str38.equals(c3314.f12238) || z3) {
                        m16035(arrayList, hashSet, c3314);
                    }
                    str35 = str11;
                    str34 = str38;
                    str36 = str12;
                    list5 = list;
                    i8 = 8;
                }
            }
        }
        String str39 = str35;
        String str40 = str36;
        if (arrayList.size() < 8) {
            ArrayList<C3312> arrayList2 = new ArrayList(list4);
            C23846.sort(arrayList2, C21023.thenComparingLong(C21023.reversed(C7618.comparingLong(new C7242())), new C20648()));
            for (C3312 c3315 : arrayList2) {
                if (arrayList.size() < 8) {
                    m16035(arrayList, hashSet, c3315);
                }
            }
        }
        JSONArray jSONArrayArray8 = JSON.array();
        for (C3312 c3316 : arrayList) {
            jSONArrayArray8.add(JSON.object().add(str31, m16028(c3316.f12235)).add(str8, m16028(c3316.f12233)).add(str32, c3316.f12236).add(str30, c3316.f12237).add(str7, c3316.f12238).add("previewLines", m16012(4, c3316.f12234)));
        }
        JSONObject jSONObjectAdd15 = jSONObjectAdd14.add("notableBlocks", jSONArrayArray8);
        JSONArray jSONArrayArray9 = JSON.array();
        if (c19944.f63886) {
            jSONArrayArray9.add(C11320.m28376(C3184.m9603("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", ErrorBundle.SUMMARY_ENTRY).add("maxAnalysisBytes", c19944.f63885).add("maxBlocks", c19944.f63882).add("maxInstructions", c19944.f63884), "mt_apk_native_analyze_control_flow", "retry", c19944.f63883 ? "Retry CFG from the beginning with budgets clamped to public limits in summary mode; the new result replaces this partial graph and may still be incomplete." : "Retry CFG from the beginning with recommended budgets in summary mode; the new result replaces this partial graph."));
        } else if (!c9664.f32484 && j >= 0) {
            String str41 = c9664.f32487;
            Iterator it7 = list3.iterator();
            while (true) {
                if (it7.hasNext()) {
                    C2794 c2795 = (C2794) it7.next();
                    String str42 = c2795.f10649;
                    if (str41.equals(str42)) {
                        it = it7;
                    } else {
                        it = it7;
                        if ("unresolved_indirect_flow".equals(str41)) {
                            zEquals = str40.equals(str42);
                            str10 = str39;
                        } else {
                            if ("invalid_control_flow_target".equals(str41)) {
                                if (!"target_not_executable".equals(str42)) {
                                    str10 = str39;
                                    if ("unaligned_or_overlapping_target".equals(str42) || str10.equals(str42)) {
                                    }
                                }
                                zEquals = true;
                            } else {
                                str10 = str39;
                            }
                            zEquals = false;
                        }
                        if (zEquals) {
                            if (!str9.equals(str41) || r311.equals(str41) || r29.equals(str41)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j4 = ((!z2 || "invalid_instruction".equals(str41)) && c2795.f10650) ? c2795.f10648 : c2795.f10646;
                        } else {
                            str39 = str10;
                            it7 = it;
                        }
                    }
                    str10 = str39;
                    zEquals = true;
                    if (zEquals) {
                        str39 = str10;
                        it7 = it;
                    } else {
                        if (str9.equals(str41)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                        }
                    }
                } else {
                    j4 = j;
                }
            }
            jSONArrayArray9.add(C11320.m28376(C3184.m9603("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", "virtual").add("address", C16363.m38542(j4)).add("instructionMode", str).add("stopAtSymbolBoundary", false).add("maxBytes", 4096).add("maxInstructions", 200), "mt_apk_native_disassemble", "inspect", "Inspect a local instruction window because no larger CFG retry is available."));
        }
        return C0735.m3193(jSONObjectAdd15, jSONArrayArray9);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16022(C16415 c16415) {
        byte[] bArr = c16415.f52797;
        int length = bArr.length;
        C7190 c7190 = c16415.f52799;
        String str = c7190.f23994;
        String str2 = c7190.f23986;
        String str3 = c7190.f23987;
        JSONObject jSONObjectAdd = m16016(str, str2, str3).add("addressKind", c7190.f23991).add("address", c7190.f23993).add("instructionMode", c7190.f23992);
        String str4 = c16415.f52804;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("resolvedInstructionMode", str4);
        long j = c16415.f52798;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("effectiveAddress", m16028(j)).add("mapping", m16023(c16415.f52801)).add("arch", c16415.f52802).add("archBits", c16415.f52800).add("instructionSet", c16415.f52803).add("instructionWidth", c16415.f52794).add("patchedVirtualAddress", m16028(j));
        long j2 = c16415.f52796;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patchedFileOffset", m16028(j2)).add("bytesPatched", length).add("expectedHex", c7190.f23985);
        byte[] bArr2 = c16415.f52795;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("assembledHex", C16363.m38545(bArr2)).add("afterHex", C16363.m38545(bArr)).add("paddingMode", c7190.f23990).add("nopBytesInserted", length - bArr2.length);
        JSONArray jSONArrayArray = JSON.array();
        int length2 = bArr.length;
        jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("addressKind", "virtual").add("address", C16363.m38542(j)).add("instructionMode", str4).add("stopAtSymbolBoundary", false).add("maxBytes", Math.min(4096, Math.max(16, length2))).add("maxInstructions", 16), "mt_apk_native_disassemble", "inspect", "Disassemble the patched instruction window"));
        jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j2).add("maxBytes", length2), "mt_apk_read_bytes", "inspect", "Read back the exact patched byte window"));
        return C0735.m3193(jSONObjectAdd5, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16019(C12182 c12182) {
        byte[] bArr = c12182.f40769;
        int length = bArr.length;
        C20596 c20596 = c12182.f40767;
        String str = c20596.f67107;
        String str2 = c20596.f67098;
        String str3 = c20596.f67104;
        JSONObject jSONObjectAdd = m16016(str, str2, str3).add("addressKind", c20596.f67103).add("address", c20596.f67105).add("effectiveAddress", m16028(c12182.f40771)).add("mapping", m16023(c12182.f40770));
        long j = c12182.f40774;
        return C0735.m3193(jSONObjectAdd.add("patchedFileOffset", m16028(j)).add("textEncoding", "utf8").add("expectedTextByteCount", c20596.f67106.length).add("replacementTextByteCount", c20596.f67102.length).add("extraPaddingBytesConsumed", c12182.f40768).add("terminatorPreserved", c12182.f40772).add("bytesPatched", length).add("beforeHex", C16363.m38545(c12182.f40773)).add("afterHex", C16363.m38545(bArr)).add("paddingMode", c20596.f67099), JSON.array().add(C11320.m28376(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j).add("maxBytes", bArr.length), "mt_apk_read_bytes", "inspect", "Read back the exact patched native string byte window")));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m16041(C18129 c18129) throws C12731 {
        boolean z = c18129.f57969;
        boolean z2 = c18129.f57965;
        boolean z3 = c18129.f57971;
        if (!z) {
            if (z3 || z2) {
                throw m16032();
            }
        } else {
            if (z2 && !z3) {
                throw m16032();
            }
            if (c18129.f57970 >= 0 && c18129.f57968 >= 0) {
                long j = c18129.f57961;
                if (j >= 0) {
                    long j2 = c18129.f57972;
                    if (j2 >= 0 && j <= j2) {
                        return;
                    }
                }
            }
            throw m16037();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m16047(C18129 c18129) throws C12731 {
        C21657 c21657 = c18129.f57964;
        boolean z = c21657.f70213;
        long j = c21657.f70214;
        long j2 = c21657.f70210;
        long j3 = c21657.f70212;
        String str = c21657.f70209;
        String str2 = c21657.f70208;
        String str3 = c21657.f70211;
        if (!z) {
            if (!str2.isEmpty() || !str.isEmpty() || !str3.isEmpty() || j3 != 0 || c21657.f70207 != 0 || j2 != 0 || j != 0) {
                throw m16032();
            }
            return;
        }
        if (!c18129.f57969 || str2.isEmpty() || str3.isEmpty() || (!(str3.isEmpty() || "auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3) || "unknown".equals(str3)) || j3 < 0 || j2 < 0 || j <= 0 || j2 >= j || j3 > C17492.FOREVER_NS - j || j3 + j2 != c18129.f57970 || str.length() > 4096)) {
            throw m16032();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C12731 m16037() {
        return C12731.m31630("NATIVE_INVALID_ELF_MAPPING", "ELF address mapping is invalid.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m16032() {
        return C12731.m31630("NATIVE_ANALYZER_INVALID_RESULT", "Native ELF analysis returned an inconsistent result.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16016(String str, String str2, String str3) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16014(JSONObject jSONObject, String str, String str2, String str3) {
        return C3184.m9603("reason", str, "meaning", str2).add("completionReason", str3).add("warningCode", jSONObject.getString("warningCode", "")).add("warning", jSONObject.getString("warning", ""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16020(C12731 c12731) {
        JSONValue jSONValueAdd;
        boolean zM31962 = C12887.m31962(c12731);
        JSONObject jSONObject = c12731.f42468;
        if (!zM31962 && jSONObject.get("patchedFileOffset") == null && jSONObject.get("expectedBytes") == null && jSONObject.get("assembledBytes") == null && jSONObject.get("remainingBytes") == null && jSONObject.get("arch") == null && jSONObject.get("message") == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = (C12887.m31962(c12731) ? C12887.m31950(c12731) : JSON.object().add("workspaceId", m16046(jSONObject, "workspaceId")).add("editSessionId", m16046(jSONObject, "editSessionId")).add("locator", m16046(jSONObject, "locator")).add("addressKind", m16046(jSONObject, "addressKind")).add("address", m16046(jSONObject, "address")).add("instructionMode", m16046(jSONObject, "instructionMode")).add("reason", "").add("addressModeHint", "").add("retryInstructionModes", JSON.array())).add("patchedFileOffset", m16040(jSONObject, "patchedFileOffset")).add("expectedHex", m16040(jSONObject, "expectedHex")).add("actualHex", m16040(jSONObject, "actualHex")).add("expectedBytes", m16029(jSONObject, "expectedBytes")).add("assembledBytes", m16029(jSONObject, "assembledBytes")).add("paddingMode", m16040(jSONObject, "paddingMode")).add("remainingBytes", m16029(jSONObject, "remainingBytes")).add("instructionSet", m16040(jSONObject, "instructionSet")).add("instructionWidth", m16040(jSONObject, "instructionWidth")).add("arch", m16040(jSONObject, "arch")).add("bits", m16029(jSONObject, "bits")).add("message", m16040(jSONObject, "message"));
        }
        boolean zM31963 = C12887.m31962(c12731);
        JSONArray jSONArrayM16013 = c12731.f42471;
        if (!zM31963) {
            jSONArrayM16013 = m16013(jSONArrayM16013);
            if (jSONArrayM16013.size() <= 0) {
                if ("PATCH_EXPECTED_MISMATCH".equals(c12731.f42472)) {
                    String strM16046 = m16046(jSONObject, "workspaceId");
                    String strM16047 = m16046(jSONObject, "editSessionId");
                    String strM16048 = m16046(jSONObject, "locator");
                    JSONValue jSONValue = jSONObject.get("byteOffset");
                    int iAsInt = -1;
                    if (jSONValue != null && jSONValue.isNumber()) {
                        try {
                            iAsInt = jSONValue.asInt();
                        } catch (RuntimeException unused) {
                        }
                    }
                    String strM16049 = m16046(jSONObject, "expectedHex");
                    if (strM16046.isEmpty() || strM16047.isEmpty() || strM16048.isEmpty() || iAsInt < 0 || strM16049.length() < 2) {
                        jSONArrayM16013 = JSON.array();
                    } else {
                        jSONArrayM16013 = JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", strM16046, "editSessionId", strM16047).add("locator", strM16048).add("byteOffset", iAsInt).add("maxBytes", Math.max(1, strM16049.length() / 2)), "mt_apk_read_bytes", "retry", "Read current bytes at the stale native patch window, then retry mt_apk_native_patch_instructions with refreshed expectedHex."));
                    }
                } else {
                    jSONArrayM16013 = JSON.array();
                }
            }
        }
        return C0735.m3195(c12731, jSONValueAdd, jSONArrayM16013);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16045(C12731 c12731) {
        JSONValue jSONValueAdd;
        String str = c12731.f42472;
        JSONObject jSONObject = c12731.f42468;
        if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_LENGTH_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str) || "NATIVE_STRING_TOO_LARGE".equals(str) || "NATIVE_STRING_RANGE_OUT_OF_ENTRY".equals(str)) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", m16046(jSONObject, "workspaceId")).add("editSessionId", m16046(jSONObject, "editSessionId")).add("locator", m16046(jSONObject, "locator")).add("addressKind", m16046(jSONObject, "addressKind")).add("address", m16046(jSONObject, "address")).add("patchedFileOffset", m16040(jSONObject, "patchedFileOffset")).add("paddingMode", m16040(jSONObject, "paddingMode")).add("expectedText", m16040(jSONObject, "expectedText")).add("actualText", m16040(jSONObject, "actualText")).add("expectedHex", m16040(jSONObject, "expectedHex")).add("actualHex", m16040(jSONObject, "actualHex")).add("expectedTextByteCount", m16029(jSONObject, "expectedTextByteCount")).add("replacementTextByteCount", m16029(jSONObject, "replacementTextByteCount")).add("requiredPaddingBytes", m16029(jSONObject, "requiredPaddingBytes")).add("actualPaddingHex", m16040(jSONObject, "actualPaddingHex"));
            JSONValue jSONValue = jSONObject.get("terminatorRequired");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                jSONValue = JSON.NULL;
            }
            jSONValueAdd = jSONObjectAdd.add("terminatorRequired", jSONValue).add("bytesPatched", m16029(jSONObject, "bytesPatched")).add("limitBytes", m16029(jSONObject, "limitBytes")).add("endByteOffset", m16040(jSONObject, "endByteOffset")).add("entrySize", m16029(jSONObject, "entrySize"));
        } else {
            jSONValueAdd = JSON.NULL;
        }
        JSONArray jSONArrayM16013 = m16013(c12731.f42471);
        if (jSONArrayM16013.size() <= 0) {
            if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str)) {
                String strM16046 = m16046(jSONObject, "workspaceId");
                String strM16047 = m16046(jSONObject, "editSessionId");
                String strM16048 = m16046(jSONObject, "locator");
                JSONValue jSONValue2 = jSONObject.get("byteOffset");
                int iAsInt = -1;
                if (jSONValue2 != null && jSONValue2.isNumber()) {
                    try {
                        iAsInt = jSONValue2.asInt();
                    } catch (RuntimeException unused) {
                    }
                }
                String strM16049 = m16046(jSONObject, "paddingMode");
                String strM160410 = m16046(jSONObject, "actualHex");
                if (strM16046.isEmpty() || strM16047.isEmpty() || strM16048.isEmpty() || iAsInt < 0 || strM160410.length() < 2 || (strM160410.length() & 1) != 0) {
                    jSONArrayM16013 = JSON.array();
                } else {
                    boolean zEquals = "null_pad".equals(strM16049);
                    jSONArrayM16013 = JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", strM16046, "editSessionId", strM16047).add("locator", strM16048).add("byteOffset", iAsInt).add("maxBytes", zEquals ? 4096 : strM160410.length() / 2), "mt_apk_read_bytes", "retry", zEquals ? "Read up to the native string patch limit and stop at the first NUL, then retry mt_apk_native_patch_string with the bytes before that terminator as refreshed expectedText." : "Read the exact observed patch window, then retry mt_apk_native_patch_string only with refreshed expectedText derived from these bytes; do not include later bytes unless the fixed slot boundary is known independently."));
                }
            } else {
                jSONArrayM16013 = JSON.array();
            }
        }
        return C0735.m3195(c12731, jSONValueAdd, jSONArrayM16013);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m16013(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONValue m16040(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? JSON.NULL : JSON.value(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m16029(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m16046(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16010(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C3312) it.next()).f12238)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16043(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C2794) it.next()).f10649)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3312 m16031(C5617 c5617) {
        List<C3312> list = c5617.f19224;
        if (list.isEmpty()) {
            return null;
        }
        long j = c5617.f19223.f40103;
        for (C3312 c3312 : list) {
            if (c3312.f12235 == j) {
                return c3312;
            }
        }
        return (C3312) list.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16035(ArrayList arrayList, HashSet hashSet, C3312 c3312) {
        if (c3312 == null || arrayList.size() >= 8 || !hashSet.add(Long.valueOf(c3312.f12235))) {
            return;
        }
        arrayList.add(c3312);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m16012(int i, String str) {
        JSONArray jSONArrayArray = JSON.array();
        if (!str.isEmpty() && i > 0) {
            int i2 = 0;
            while (jSONArrayArray.size() < i && i2 < str.length()) {
                int iIndexOf = str.indexOf(10, i2);
                if (iIndexOf < 0) {
                    jSONArrayArray.add(str.substring(i2));
                    return jSONArrayArray;
                }
                jSONArrayArray.add(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16030(String str) {
        if ("complete".equals(str)) {
            return "All statically resolvable direct control flow within the selected function boundary was explored.";
        }
        if ("max_analysis_bytes_reached".equals(str)) {
            return "Reachable work remains, but maxAnalysisBytes prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public byte-budget limit has been reached.";
        }
        if ("max_blocks_reached".equals(str)) {
            return "Reachable block targets remain, but maxBlocks prevented scheduling another candidate. Use the CFG retry action to replace this partial graph when present; no retry action means the public block-budget limit has been reached.";
        }
        if ("max_instructions_reached".equals(str)) {
            return "Reachable work remains, but maxInstructions prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public instruction-budget limit has been reached.";
        }
        if ("invalid_instruction".equals(str)) {
            return "At least one reachable path stopped because an instruction could not be decoded.";
        }
        if ("unresolved_indirect_flow".equals(str)) {
            return "At least one reachable indirect jump target could not be resolved statically.";
        }
        if ("invalid_control_flow_target".equals(str)) {
            return "At least one reachable target was non-executable, overlapping, misaligned, or required a different instruction mode.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15710 m16034(C7896 c7896, String str) {
        int i = c7896.f25954;
        long j = i;
        long j2 = c7896.f25949;
        long j3 = c7896.f25952;
        if ("max_analysis_bytes_reached".equals(str)) {
            j = ((long) i) * 2;
        } else if ("max_blocks_reached".equals(str)) {
            j2 *= 2;
        } else if ("max_instructions_reached".equals(str)) {
            j3 *= 2;
        }
        return m16033(c7896, j, j2, j3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m16011(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        double d2 = d * 1.25d;
        return d2 >= 9.223372036854776E18d ? C17492.FOREVER_NS : (long) Math.ceil(d2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15710 m16033(C7896 c7896, long j, long j2, long j3) {
        return new C15710((int) Math.min(65536, Math.max(c7896.f25954, j)), (int) Math.min(4096, Math.max(c7896.f25949, j2)), (int) Math.min(10000, Math.max(c7896.f25952, j3)), j > 65536 || j2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || j3 > 10000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16023(C18129 c18129) throws C12731 {
        m16041(c18129);
        if (!c18129.f57969) {
            return m16039();
        }
        return JSON.object().add("sectionName", c18129.f57963).add("virtualAddress", m16028(c18129.f57970)).add("fileOffset", m16028(c18129.f57968)).add("rangeOffset", m16028(c18129.f57961)).add("size", c18129.f57972).add("isLoaded", c18129.f57971).add("isExecutable", c18129.f57965).add("segment", c18129.f57966);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16039() {
        JSONObject jSONObjectAdd = JSON.object().add("sectionName", "");
        JSONValue jSONValue = JSON.NULL;
        return jSONObjectAdd.add("virtualAddress", jSONValue).add("fileOffset", jSONValue).add("rangeOffset", jSONValue).add("size", 0).add("isLoaded", false).add("isExecutable", false).add("segment", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16027(boolean z, String str, int i, int i2, Long l2) {
        return JSON.object().add("hasMore", z).add("nextCursor", str == null ? JSON.NULL : JSON.value(str)).add("returnedCount", i).add("limitMax", i2).add("totalAvailableCount", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m16028(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value(C16363.m38542(j));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static JSONObject m16048() {
        return C4969.m13780("Result for mt_apk_native_map_address. ELF address mapping. Check found, mapping.isLoaded, and mapping.isExecutable before following an address. enclosingSymbol is best-effort context.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex.")).add("found", C4969.m13786(ClassTransform.BOOLEAN, "For virtual input, whether the address is in a loaded file-backed ELF range; virtual-only runtime bytes can still miss. For file_offset input, whether SO file bytes contain the offset. Check mapping.isLoaded before treating the mapped address as loaded at runtime.")).add("mapping", C4969.m13777(m16007().add("enclosingSymbol", C18828.m43457(JSON.object().add("found", C4969.m13786(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol contains the mapped virtual address.")).add("name", C4969.m13786("string", "Raw ELF symbol name, or empty string when not found.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled symbol name when available and different from name, otherwise empty string.")).add("instructionMode", C4969.m13786("string", "Best-effort mode hint for mt_apk_native_disassemble or mt_apk_native_analyze_control_flow: auto, arm, thumb, unknown, or empty string when not found. unknown is not a valid tool input; try thumb and arm separately.")).add("startVirtualAddress", C4969.m13789("string", "Symbol start virtual address, or null.")).add("startFileOffset", C4969.m13789("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C4969.m13789("string", "Offset from startVirtualAddress to the mapped virtual address, or null.")), "integer", "Symbol size in bytes, or 0 when not found.", "size", "Best-effort non-imported sized ELF symbol that contains mapping.virtualAddress. It may be a function or another symbol type, and does not guarantee exact function boundaries. When mapping.isExecutable=true and startVirtualAddress is not null, copy startVirtualAddress to mt_apk_native_analyze_control_flow.address and choose outputMode=summary for triage or outputMode=full when detail arrays are needed. instructionMode is only a follow-up hint: auto, arm, and thumb can be copied to mt_apk_native_disassemble or mt_apk_native_analyze_control_flow; unknown means try thumb and arm separately, and empty string means no hint is available.")), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable. enclosingSymbol is best-effort and uses only non-imported sized ELF symbols; enclosingSymbol.found=false may mean stripped symbols, missing symbol sizes, or unavailable symbol metadata, not that no function contains the address. enclosingSymbol.instructionMode is a best-effort follow-up hint, not proof of the symbol's real instruction state.")), "Address mapping result."), C4969.m13787(C4969.m13777(JSON.object(), "No tool-specific diagnostics.")), C4969.m13779("mt_apk_native_map_address nextActions is intentionally empty."));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16044() {
        return C4969.m13780("Result for mt_apk_native_disassemble. An instruction window in disassemblyText with address, mode, boundary, and continuation metadata. Check incompleteInstructionAtEnd before interpreting trailing bytes.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C4969.m13786("string", "Requested instruction mode.")).add("stopAtSymbolBoundary", C4969.m13786(ClassTransform.BOOLEAN, "Whether this window should use the containing best-effort sized ELF symbol end as an upper bound when available.")).add("resolvedInstructionMode", C4969.m13786("string", "Resolved instruction mode.")).add("effectiveAddress", C4969.m13789("string", "Effective virtual address.")).add("mapping", C4969.m13777(m16007(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("symbolBoundary", C18828.m43457(JSON.object().add("requested", C4969.m13786(ClassTransform.BOOLEAN, "Whether stopAtSymbolBoundary was requested.")).add("applied", C4969.m13786(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol end is available as an upper bound for this disassembly view.")).add("endReached", C4969.m13786(ClassTransform.BOOLEAN, "Whether bytesConsumed reaches endVirtualAddressExclusive in this response.")).add("name", C4969.m13786("string", "Raw ELF symbol name when applied, otherwise empty string.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled symbol name when applied and available, otherwise empty string.")).add("startVirtualAddress", C4969.m13789("string", "Symbol start virtual address, or null.")).add("endVirtualAddressExclusive", C4969.m13789("string", "Symbol end address, the first address after this symbol, or null.")).add("offset", C4969.m13789("string", "Offset from startVirtualAddress to data.effectiveAddress, or null.")), "integer", "Symbol size in bytes, or 0 when not applied.", "size", "Best-effort disassembly stop boundary. applied=true means a symbol end address is available as an upper bound for this view; maxBytes or maxInstructions may still stop the response earlier. Disassembly never crosses endVirtualAddressExclusive when applied=true. endReached=true only means this response consumed bytes up to that end address, not that a full function was disassembled.")).add("arch", C4969.m13786("string", "Architecture used for disassembly.")).add("archBits", C4969.m13786("integer", "ELF class/ABI bit width; ARM32 stays 32 even when decoding Thumb instructions.")).add("instructionSet", C4969.m13786("string", "Instruction set used for this disassembly: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C4969.m13786("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("bytesRead", C4969.m13786("integer", "Logical byte window length exposed for this response, capped by maxBytes and the current mapping or applied symbol boundary.")).add("bytesConsumed", C4969.m13786("integer", "Bytes represented by disassemblyText.")).add("incompleteInstructionAtEnd", C4969.m13786(ClassTransform.BOOLEAN, "Whether the byte window ended with leftover bytes that are too short to form one complete instruction. These leftover bytes are not counted in bytesConsumed; retry the same address with a larger maxBytes instead of treating this as invalid code.")).add("disassemblyText", C4969.m13786("string", "Compact instruction text. Each line is \"0x<hex-address>: <hex-bytes> <assembly>\"; addresses include the 0x prefix and can be copied directly with addressKind=virtual, addresses have no leading zero padding. Lines have no indentation and use one space between columns. Machine bytes are contiguous lowercase hex in original byte order, ready to concatenate into expectedHex. The address is the effective virtual address, not the input file offset or original odd Thumb address.")).add("instructionCount", C4969.m13786("integer", "Instruction count represented in disassemblyText.")).add("hasMore", C4969.m13786(ClassTransform.BOOLEAN, "Whether another contiguous window is available.")).add("nextAddressKind", C4969.m13789("string", "Value to pass as addressKind on the next mt_apk_native_disassemble call, or null.")).add("nextAddress", C4969.m13789("string", "Value to pass as address on the next mt_apk_native_disassemble call, or null.")).add("nextInstructionMode", C4969.m13789("string", "Value to pass as instructionMode on the next mt_apk_native_disassemble call, or null.")), "Disassembly result."), C4969.m13787(C4969.m13777(m16015("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_disassemble errors; diagnostics is null for unrelated argument or runtime errors.")), C4969.m13783("When data.hasMore=true, a purpose=continue action calls mt_apk_native_disassemble with complete arguments for the next window; otherwise success has no actions. ARM32 instructionMode errors may return mt_apk_native_disassemble retry actions; copy those arguments directly. Follow each action's tool and purpose, not mt_apk_continue. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C4969.m13778(C13530.m33067(), "mt_apk_native_disassemble", "continue"), C4969.m13778(C13530.m33067(), "mt_apk_native_disassemble", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16008() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex; odd ARM32 virtual input keeps the Thumb T-bit here.")).add("instructionMode", C4969.m13786("string", "Requested instruction mode.")).add("outputMode", C4969.m13784("Requested output mode: full or summary.", "full", ErrorBundle.SUMMARY_ENTRY)).add("detailOmitted", C4969.m13786(ClassTransform.BOOLEAN, "true only when outputMode=summary; blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while observed counts remain populated.")).add("resolvedInstructionMode", C4969.m13786("string", "Instruction mode used to decode this CFG.")).add("effectiveAddress", C4969.m13786("string", "Mapped virtual address for the request; ARM32 Thumb clears the T-bit.")).add("mapping", C4969.m13777(m16007(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C4969.m13786("string", "Architecture used for CFG decoding.")).add("archBits", C4969.m13786("integer", "ELF class/ABI bit width; ARM32 stays 32 for Thumb CFGs.")).add("instructionSet", C4969.m13786("string", "Instruction set used for this graph: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C4969.m13786("string", "Instruction width category: mixed16_32, fixed32, or variable.")).add("function", C18828.m43457(JSON.object().add("startVirtualAddress", C4969.m13786("string", "Function candidate start virtual address as lowercase 0x hex.")).add("startFileOffset", C4969.m13786("string", "Function candidate start ELF file offset as lowercase 0x hex.")).add("name", C4969.m13786("string", "Raw ELF symbol name, or empty string for requested_address fallback.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled name when available, otherwise empty string.")).add("symbolSize", C4969.m13786("integer", "Sized symbol byte length, or 0 for requested_address fallback.")).add("startSource", C4969.m13784("How the start was selected.", "function_symbol", "executable_symbol", "requested_address")).add("boundarySource", C4969.m13784("How the exclusive end boundary was selected.", "function_symbol", "executable_symbol", "executable_mapping")), "string", "Exclusive function boundary end as lowercase 0x hex.", "boundaryEndVirtualAddress", "Selected function candidate and exclusive analysis boundary. Symbol-based boundaries are best-effort ELF metadata; requested_address falls back to the initial executable mapping.")).add("blocks", C3184.m9603("type", "array", "description", "Basic-block details sorted by virtual address. In outputMode=full, this array contains the observed blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.blockCount for the observed count. assemblyText is compact factual disassembly without machine bytes; each line is 0xaddress: mnemonic operands.").add("items", C18828.m43457(JSON.object().add("startVirtualAddress", C4969.m13786("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C4969.m13786("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C4969.m13786("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C4969.m13786("integer", "Instruction lines in assemblyText.")).add("terminator", C4969.m13784("How this block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")), "string", "One line per instruction in the form 0xaddress: mnemonic operands; no machine bytes.", "assemblyText", "One returned basic block."))).add("edges", C3184.m9603("type", "array", "description", "Confirmed direct edge details. In outputMode=full, both endpoints are block starts present in blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.edgeCount for the observed count. Calls are not CFG edges.").add("items", C4969.m13777(JSON.object().add("fromVirtualAddress", C4969.m13786("string", "Source block start as lowercase 0x hex.")).add("toVirtualAddress", C4969.m13786("string", "Target block start as lowercase 0x hex.")).add("kind", C4969.m13784("Edge kind.", "fallthrough", "branch_true", "branch_false", "jump")), "One direct block edge."))).add("externalFlows", C3184.m9603("type", "array", "description", "Known direct exit details from the selected function. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.externalFlowCount for the observed count. These are expected exits and do not make controlFlowComplete false.").add("items", C4969.m13777(JSON.object().add("sourceVirtualAddress", C4969.m13786("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C4969.m13784("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C4969.m13786("string", "Known external target as lowercase 0x hex.")).add("reason", C4969.m13784("Why this target was not followed.", "outside_function_boundary", "other_function_symbol")), "One known external flow.")));
        JSONObject jSONObjectM13777 = C4969.m13777(JSON.object().add("sourceVirtualAddress", C4969.m13786("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C4969.m13784("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C4969.m13786("string", "Known target address as lowercase 0x hex.")).add("reason", C4969.m13784("Why the target was unresolved.", "target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction")), "Known target that could not become a returned block.");
        return C4969.m13780("Result for mt_apk_native_analyze_control_flow. A bounded function graph or summary. Read analysisSummary for completeness. Shape hints describe only the observed subgraph. Retry results replace the previous graph; never merge them.", C4969.m13777(jSONObjectAdd.add("unresolvedFlows", C3184.m9603("type", "array", "description", "Details for control-flow paths not converted into confirmed block edges. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.unresolvedFlowCount and observedGraphSummary.unresolvedReasonCounts for observed totals and reason counts. Read analysisSummary.completionReason before retrying or drawing conclusions.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM13777).add(C4969.m13777(JSON.object().add("sourceVirtualAddress", C4969.m13786("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C4969.m13781("indirect_jump", "Indirect jump flow.")).add("reason", C4969.m13781("indirect_target", "The target is not statically known.")), "Indirect jump whose target was not statically known.")).add(C4969.m13777(JSON.object().add("sourceVirtualAddress", C4969.m13786("string", "Function candidate start as lowercase 0x hex.")).add("flowKind", C4969.m13781("decode", "Entry decode flow.")).add("reason", C4969.m13781("invalid_instruction", "The entry instruction could not be decoded.")), "Function entry could not be decoded."))))).add("analysisSummary", C18828.m43457(JSON.object().add("controlFlowComplete", C4969.m13786(ClassTransform.BOOLEAN, "Whether all statically resolvable direct flow inside the selected boundary was explored with no unresolved flows.")).add("completionReason", C4969.m13784("Primary completion reason in fixed priority order.", "complete", "max_analysis_bytes_reached", "max_blocks_reached", "max_instructions_reached", "invalid_instruction", "unresolved_indirect_flow", "invalid_control_flow_target")).add("meaning", C4969.m13786("string", "Stable explanation of completionReason and retry semantics.")).add("bytesAnalyzed", C4969.m13786("integer", "Unique successfully decoded instruction bytes.")), "integer", "Unique successfully decoded instructions.", "instructionsAnalyzed", "CFG completeness and budget usage. controlFlowComplete is true only when completionReason=complete and observedGraphSummary.unresolvedFlowCount=0. Read observedGraphSummary for counts in both output modes. Budget retry results replace this graph and must not be merged; a budget reason without a retry action means its limiting budget is already at the public limit.")).add("observedGraphSummary", C4969.m13777(JSON.object().add("blockCount", C4969.m13786("integer", "Observed basic-block count; this can be lower than the consumed candidate budget.")).add("edgeCount", C4969.m13786("integer", "Observed confirmed direct edge count.")).add("externalFlowCount", C4969.m13786("integer", "Observed known external flow count.")).add("unresolvedFlowCount", C4969.m13786("integer", "Observed unresolved flow count.")).add("terminatorCounts", C18828.m43457(JSON.object().add("fallthrough", C4969.m13786("integer", "Observed fallthrough terminator count.")).add("conditional_jump", C4969.m13786("integer", "Observed conditional_jump terminator count.")).add("jump", C4969.m13786("integer", "Observed jump terminator count.")).add("indirect_jump", C4969.m13786("integer", "Observed indirect_jump terminator count.")).add("return", C4969.m13786("integer", "Observed return terminator count.")).add("trap", C4969.m13786("integer", "Observed trap terminator count.")).add("invalid", C4969.m13786("integer", "Observed invalid terminator count.")), "integer", "Observed budget_boundary terminator count.", "budget_boundary", "Observed basic-block terminator counts; all fields are present and 0 means no observed block used that terminator.")).add("unresolvedReasonCounts", C18828.m43457(JSON.object().add("target_not_executable", C4969.m13786("integer", "Observed target_not_executable count.")).add("unaligned_or_overlapping_target", C4969.m13786("integer", "Observed unaligned_or_overlapping_target count.")).add("instruction_mode_transition", C4969.m13786("integer", "Observed instruction_mode_transition count.")).add("max_blocks_reached", C4969.m13786("integer", "Observed max_blocks_reached count.")).add("max_analysis_bytes_reached", C4969.m13786("integer", "Observed max_analysis_bytes_reached count.")).add("max_instructions_reached", C4969.m13786("integer", "Observed max_instructions_reached count.")).add("invalid_instruction", C4969.m13786("integer", "Observed invalid_instruction count.")), "integer", "Observed indirect_target count.", "indirect_target", "Observed unresolved-flow reason counts; all fields are present and 0 means no observed unresolved flow used that reason.")).add("observedShapeHints", C4969.m13788("Conservative observed-only hints. Values may include observed_linear, observed_branchy, and observed_dispatcher_like. Empty array means no hint matched.")), "Observed CFG summary for the subgraph analyzed in this call. Counts remain populated in both output modes. In summary mode, the four detail array fields remain present but empty, so use these counts instead of their lengths. observedShapeHints are conservative hints about the observed subgraph only.")).add("entryPreview", C4969.m13777(JSON.object().add("available", C4969.m13786(ClassTransform.BOOLEAN, "Whether an entry or fallback first block was available.")).add("startVirtualAddress", C4969.m13789("string", "Preview block start address, or null when unavailable.")).add("lines", C4969.m13788("At most 16 original assemblyText lines from the entry or fallback first block.")), "Entry block preview copied from the original assemblyText lines without reparsing addresses or instructions.")).add("notableBlocks", C3184.m9603("type", "array", "description", "At most 8 representative observed blocks selected for summary triage. Preview lines are copied from original assemblyText without reparsing.").add("items", C4969.m13777(JSON.object().add("startVirtualAddress", C4969.m13789("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C4969.m13789("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C4969.m13786("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C4969.m13786("integer", "Instruction count reported for the full block.")).add("terminator", C4969.m13784("How this observed block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")).add("previewLines", C4969.m13788("At most 4 original assemblyText lines from this block.")), "One observed notable block preview."))), "Function-local direct static CFG result. Read analysisSummary before treating this graph as complete; a budget retry replaces this result rather than extending it."), C4969.m13787(C4969.m13777(m16015("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_analyze_control_flow errors; diagnostics is null for unrelated argument or runtime errors.")), C4969.m13783("Budget or ARM32 mode errors may return mt_apk_native_analyze_control_flow retry actions. A retry result replaces the previous graph and must not be merged. When no larger CFG retry is available, mt_apk_native_disassemble may inspect a local instruction window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open.", C4969.m13778(C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C4969.m13786("string", "ZIP entry locator for the native ELF.")).add("addressKind", C4969.m13784("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C4969.m13786("string", "Unsigned address string for a function symbol or an address inside the function candidate.")).add("instructionMode", C4969.m13784("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("outputMode", C4969.m13784("Output mode: full populates graph detail arrays; summary keeps the required detail arrays present but empty while observed counts remain populated.", "full", ErrorBundle.SUMMARY_ENTRY)).add("maxAnalysisBytes", C4969.m13786("integer", "Unique successfully decoded instruction-byte budget.")).add("maxBlocks", C4969.m13786("integer", "Candidate basic-block start budget.")), "integer", "Unique successfully decoded instruction budget.", "maxInstructions", "Arguments for mt_apk_native_analyze_control_flow."), "mt_apk_native_analyze_control_flow", "retry"), C4969.m13778(C13530.m33067(), "mt_apk_native_disassemble", "inspect"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static JSONObject m16042() {
        JSONObject jSONObjectM43457 = C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id that was modified.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed input address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex. ARM32 odd Thumb virtual input keeps bit0 here.")).add("instructionMode", C4969.m13786("string", "Requested instruction mode.")).add("resolvedInstructionMode", C4969.m13786("string", "Resolved instruction mode used for assembly and follow-up disassembly.")).add("effectiveAddress", C4969.m13789("string", "Effective virtual address used for mapping and assembly. Thumb virtual input clears the T-bit here.")).add("mapping", C4969.m13777(m16007(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C4969.m13786("string", "Architecture passed to the assembler.")).add("archBits", C4969.m13786("integer", "ELF class/ABI bit width; ARM32 stays 32 even when patching Thumb instructions.")).add("instructionSet", C4969.m13786("string", "Instruction set used for this patch: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C4969.m13786("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("patchedVirtualAddress", C4969.m13789("string", "Virtual address actually patched. This equals effectiveAddress and never includes the ARM Thumb T-bit.")).add("patchedFileOffset", C4969.m13789("string", "ELF file offset inside the zip_entry bytes that was patched.")).add("bytesPatched", C4969.m13786("integer", "Final equal-length byte count written to the edit session.")).add("expectedHex", C4969.m13786("string", "Expected bytes that were verified before writing, uppercase hex without spaces.")).add("assembledHex", C4969.m13786("string", "Raw bytes produced by the assembler before optional NOP padding, uppercase hex without spaces.")).add("afterHex", C4969.m13786("string", "Final bytes written after optional NOP padding, uppercase hex without spaces.")).add("paddingMode", C4969.m13786("string", "Padding mode used for this patch: none or nop.")), "integer", "Number of NOP padding bytes appended to assembledHex before writing.", "nopBytesInserted", "Native instruction patch result.");
        JSONObject jSONObjectM16015 = m16015("Stable instruction-mode reason token for retryable ARM32 patch errors. Empty string means this is not an instruction-mode retry error; ignore addressModeHint and retryInstructionModes and inspect the other diagnostics fields instead.", "Fixed ARM32 address hint string. Empty string means this is not an instruction-mode retry error.");
        jSONObjectM16015.add("patchedFileOffset", C4969.m13789("string", "Patch ELF file offset for expectedHex mismatch, or null.")).add("expectedHex", C4969.m13789("string", "Expected uppercase hex for a stale guard mismatch, or null.")).add("actualHex", C4969.m13789("string", "Actual uppercase hex read from the current edit session view, or null.")).add("expectedBytes", C4969.m13789("integer", "Patch window byte count for length errors, or null.")).add("assembledBytes", C4969.m13789("integer", "Assembler output byte count for length errors, or null.")).add("paddingMode", C4969.m13789("string", "Requested padding mode for length errors, or null.")).add("remainingBytes", C4969.m13789("integer", "Bytes left to fill when NOP padding is unavailable, or null.")).add("instructionSet", C4969.m13789("string", "Instruction set for NOP padding diagnostics, or null.")).add("instructionWidth", C4969.m13789("string", "Instruction width for NOP padding diagnostics, or null.")).add("arch", C4969.m13789("string", "Assembler architecture for assembly failures, or null.")).add("bits", C4969.m13789("integer", "Assembler bit width for assembly failures, or null.")).add("message", C4969.m13789("string", "Sanitized assembler failure message, or null."));
        return C4969.m13780("Result for mt_apk_native_patch_instructions. Verified instruction replacement. assembledHex contains assembled bytes; afterHex includes any NOP padding. Use nextActions for read-back or error recovery.", jSONObjectM43457, C4969.m13787(C4969.m13777(jSONObjectM16015, "native_patch_instructions diagnostics. diagnostics is null for unrelated argument errors. The instruction-mode fields reason, addressModeHint, and retryInstructionModes apply only to ARM32 retry errors; when reason is empty, ignore those fields and use expectedHex/actualHex, expectedBytes/assembledBytes, remainingBytes, or message to decide the next step.")), C4969.m13783("Successful native instruction patch returns disassemble and read_bytes verification actions. ARM32 instructionMode errors may return native patch retry actions; stale expectedHex errors may return read_bytes recovery. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C4969.m13778(C13530.m33067(), "mt_apk_native_disassemble", "inspect"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "inspect"), C4969.m13778(C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Non-empty edit session id returned by mt_apk_session_create.")).add("locator", C4969.m13786("string", "ZIP entry locator for the native ELF.")).add("addressKind", C4969.m13784("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C4969.m13786("string", "Unsigned target address string copied from the failed request. The effective address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit.")).add("instructionMode", C4969.m13784("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("expectedHex", C4969.m13786("string", "Stale-view guard bytes for the patch window. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it or use replacement bytes.")).add("replacementAssembly", C4969.m13786("string", "Assembly source text containing instructions and labels only, not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly.")).add("paddingMode", C4969.m13784("Padding mode: none or nop.", "none", "nop")), "Arguments for mt_apk_native_patch_instructions."), "mt_apk_native_patch_instructions", "retry"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16009() {
        return C4969.m13780("Result for mt_apk_native_patch_string. String patch result. beforeHex and afterHex cover the full byte window including padding or a final NUL. Use nextActions to verify the result.", C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id that was modified.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed input address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex.")).add("effectiveAddress", C4969.m13789("string", "Mapped virtual address used for context, or null when file_offset input is not mapped.")).add("mapping", C4969.m13777(m16007(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("patchedFileOffset", C4969.m13789("string", "Patched SO file offset inside the zip_entry bytes as lowercase 0x hex. Use nextActions[].arguments.byteOffset for decimal mt_apk_read_bytes input.")).add("textEncoding", C4969.m13786("string", "Always utf8; this is not an input option.")).add("expectedTextByteCount", C4969.m13786("integer", "UTF-8 byte count of expectedText.")).add("replacementTextByteCount", C4969.m13786("integer", "UTF-8 byte count of replacementText.")).add("extraPaddingBytesConsumed", C4969.m13786("integer", "Extra padding bytes consumed after expectedText when replacementText is longer; 0 when equal or shorter.")).add("terminatorPreserved", C4969.m13786(ClassTransform.BOOLEAN, "true only for successful null_pad patches; false for none and space_pad.")).add("bytesPatched", C4969.m13786("integer", "Complete patch window byte count, not actual changed byte count.")).add("beforeHex", C4969.m13786("string", "Complete bytes verified before writing, uppercase hex. Includes padding or final NUL when applicable.")).add("afterHex", C4969.m13786("string", "Complete bytes written, uppercase hex. Includes padding or final NUL when applicable.")), "string", "Padding mode used for this patch: none, null_pad, or space_pad.", "paddingMode", "Native UTF-8 string patch result."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string when unavailable.")).add("locator", C4969.m13786("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C4969.m13786("string", "Requested address kind, or empty string when unavailable.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("patchedFileOffset", C4969.m13789("string", "Patched SO file offset as lowercase 0x hex, or null.")).add("paddingMode", C4969.m13789("string", "Requested padding mode, or null.")).add("expectedText", C4969.m13789("string", "Expected UTF-8 text stale guard, or null.")).add("actualText", C4969.m13789("string", "Best-effort readable actual text prefix, or null. The exact bytes are in actualHex.")).add("expectedHex", C4969.m13789("string", "Expected full patch window bytes as uppercase hex, or null.")).add("actualHex", C4969.m13789("string", "Actual current bytes as uppercase hex, or null.")).add("expectedTextByteCount", C4969.m13789("integer", "UTF-8 byte count of expectedText, or null.")).add("replacementTextByteCount", C4969.m13789("integer", "UTF-8 byte count of replacementText, or null.")).add("requiredPaddingBytes", C4969.m13789("integer", "Padding bytes checked after expectedText, or null.")).add("actualPaddingHex", C4969.m13789("string", "Actual padding/terminator bytes as uppercase hex, or null.")).add("terminatorRequired", C4969.m13789(ClassTransform.BOOLEAN, "Whether null_pad required a final NUL terminator, or null.")).add("bytesPatched", C4969.m13789("integer", "Complete patch window byte count, or null.")).add("limitBytes", C4969.m13789("integer", "Maximum supported patch window bytes, or null.")).add("endByteOffset", C4969.m13789("string", "Exclusive end SO file offset as lowercase 0x hex, or null.")).add("entrySize", C4969.m13789("integer", "SO entry size in bytes, or null.")), "native_patch_string diagnostics. diagnostics is null for unrelated argument errors. actualText is only a readable best-effort prefix; use actualHex as the exact stale-guard fact.")), C4969.m13783("Successful native string patch returns one read_bytes verification action. Stale expectedText or padding errors use a 4096-byte recovery window only for null_pad; space_pad and none stay within the exact observed window because their slot boundary is not self-describing. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "inspect"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16038() {
        return C4969.m13780("Result for mt_apk_native_xref. Direct static references. Read scanSummary before interpreting empty refs or warnings; pagination.hasMore controls continuation. Results are not a complete caller graph.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK.")).add("locator", C4969.m13786("string", "zip_entry locator.")).add("addressKind", C4969.m13786("string", "Parsed input address kind: virtual or file_offset.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C4969.m13786("string", "Requested instruction mode.")).add("resolvedInstructionMode", C4969.m13786("string", "Resolved instruction mode used for scanning source instructions; data-only scans return auto.")).add("scanKind", C4969.m13786("string", "Scan domain used for this page: code, data, or both.")).add("referenceKinds", C4969.m13788("Reference kinds used for this scan, normalized in fixed order. Values are call, jump, data, and unknown; jump covers branch/jump instructions. In data phases only data refs are emitted.")).add("targetMapped", C4969.m13786(ClassTransform.BOOLEAN, "Whether the target has a loaded file-backed mapping usable for this xref scan. false may mean miss, virtual-only address, or mapping.isLoaded=false.")).add("targetVirtualAddress", C4969.m13789("string", "Mapped target virtual address when targetMapped=true, otherwise null. ARM32 odd virtual input clears bit0 only for an executable mapping; a loaded non-executable odd target stays exact. Executable ARM32 targets may still match odd Thumb function pointers when this value is even.")).add("targetFileOffset", C4969.m13789("string", "Mapped target ELF file offset within the zip_entry bytes when targetMapped=true, otherwise null.")).add("mapping", C4969.m13777(m16007(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C4969.m13786("string", "Architecture used for scanning.")).add("archBits", C4969.m13786("integer", "ELF class/ABI bit width; ARM32 stays 32 even when scanning Thumb instructions.")).add("instructionSet", C4969.m13786("string", "Instruction set used for source instructions: thumb, arm, aarch64, x86, or x86_64; data-only scans return an empty string.")).add("instructionWidth", C4969.m13786("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86; data-only scans return an empty string.")).add("refs", C3184.m9603("type", "array", "description", "Best-effort direct static references found on this page after applying data.scanKind and data.referenceKinds. Use data.scanSummary.reason, data.scanSummary.meaning, and data.scanSummary.completionReason to interpret empty refs; read data.scanSummary.warningCode and data.scanSummary.warning before trusting low-address instruction data refs. Do not treat empty refs alone as proof that no matching reference exists.").add("items", C18828.m43457(JSON.object().add("sourceVirtualAddress", C4969.m13789("string", "Source virtual address.")).add("sourceFileOffset", C4969.m13789("string", "Source ELF file offset within the zip_entry bytes; convert this 0x hex string to a decimal byteOffset before calling mt_apk_read_bytes.")).add("sourceKind", C4969.m13786("string", "Source kind: instruction, data_relocation, or data_pointer.")).add("sourceSize", C4969.m13786("integer", "Source byte size represented by bytes: instruction size for sourceKind=instruction, or data slot size for data_relocation/data_pointer.")).add("sourceSymbol", C4969.m13785(C4969.m13777(JSON.object().add("name", C4969.m13786("string", "Raw ELF symbol name.")).add("demangledName", C4969.m13786("string", "Best-effort C++ demangled name when available and different from name, otherwise empty string.")).add("startVirtualAddress", C4969.m13786("string", "Symbol start virtual address as a lowercase 0x hex string.")).add("startFileOffset", C4969.m13789("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C4969.m13786("string", "Offset from startVirtualAddress to this ref source address as a lowercase 0x hex string.")).add("size", C4969.m13786("integer", "Symbol size in bytes; this is best-effort metadata, not proof of an exact function boundary.")), "Best-effort non-imported sized ELF symbol containing this ref source address. null means no safe symbol context is available; stripped or malformed symbol metadata can cause null. For sourceKind=instruction, use startVirtualAddress with mt_apk_native_analyze_control_flow, copy xref data.resolvedInstructionMode to preserve ARM32 source mode, and choose outputMode=summary for triage or outputMode=full for detail arrays; use mt_apk_native_disassemble for exact bytes. For data sources, this is owner context for the slot or pointer, not a CFG function entry or caller relationship."))).add("bytes", C4969.m13786("string", "Source bytes as lowercase hex.")).add(TextBundle.TEXT_ENTRY, C4969.m13786("string", "Disassembled instruction text, relocation summary, or data pointer text, truncated to 512 characters.")), "string", "Reference kind: call, jump, data, or unknown. jump covers branch/jump instructions.", "referenceKind", "Native xref item."))).add("scannedBytes", C4969.m13786("integer", "Code/data-pointer bytes scanned on this page; relocation item scanning is not counted here and uses its own per-page budget.")).add("scanComplete", C4969.m13786(ClassTransform.BOOLEAN, "Whether this xref request has no more pages. Prefer data.scanSummary.reason, meaning, and completionReason to interpret empty refs and progress.")).add("scanSummary", C18828.m43457(JSON.object().add("reason", C4969.m13786("string", "Stable reason token: target_not_mapped, refs_found, scan_incomplete, or no_refs_found.")).add("meaning", C4969.m13786("string", "Short explanation of this page and whether to continue.")).add("completionReason", C4969.m13786("string", "Stable page-stop token: target_not_mapped, result_limit_reached, scan_budget_exhausted, relocation_page_budget_exhausted, or scan_space_exhausted.")).add("warningCode", C4969.m13786("string", "Stable warning token, or empty string when no warning applies. low_address_instruction_data_reference_noise means code/both instruction data refs may match ordinary immediates.")), "string", "Short warning text, or empty string when no warning applies.", "warning", "Stable explanation of this native xref page. reason is one of target_not_mapped, refs_found, scan_incomplete, or no_refs_found. completionReason explains why this page stopped: target_not_mapped means no scan ran; result_limit_reached means this page stopped after returning limit refs; scan_budget_exhausted means this page used maxScanBytes and can continue; relocation_page_budget_exhausted means this page used the relocation item page budget and can continue; scan_space_exhausted means the selected direct-reference scan space is exhausted, but it is not proof of a complete caller graph. data.scanSummary.warningCode and data.scanSummary.warning are empty unless this request has a known AI interpretation risk. Read meaning before treating empty refs as no references.")).add("pagination", C4969.m13782("Number of refs returned on this page.", "Maximum limit accepted by mt_apk_continue for later native xref pages.", "Always null for native xref because the tool does not pre-scan the whole SO; null means unknown, not zero. Use hasMore only as the continuation signal; use data.scanSummary to interpret scan meaning.")), "Native xref scan result."), C4969.m13787(C4969.m13777(m16015("Stable reason token: arm32_mode_required or data_scan_requires_auto.", "Fixed hint string: ARM32 file/even address does not identify ARM or Thumb, data scan does not decode instructions, odd target virtual address does not identify source instruction mode, or empty string when no mode hint is available.").add("scanKind", C4969.m13786("string", "Requested scan kind, or empty string when unavailable.")).add("referenceKinds", C4969.m13788("Requested reference kinds, or empty when unavailable.")), "Instruction mode diagnostics for ARM32/data-scan mt_apk_native_xref errors; diagnostics is null for unrelated argument or runtime errors.")), C4969.m13783("Success continuation uses mt_apk_continue when data.pagination.hasMore=true. ARM32 or data-scan instructionMode errors may return mt_apk_native_xref retry actions; copy those arguments directly. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue"), C4969.m13778(C18828.m43457(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id.")).add("editSessionId", C4969.m13786("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C4969.m13786("string", "ZIP entry locator for the native ELF.")).add("addressKind", C4969.m13784("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C4969.m13786("string", "Unsigned target address string copied from the failed request.")).add("instructionMode", C4969.m13784("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("scanKind", C4969.m13784("Scan domain: code, data, or both.", "code", e.m, "both")).add("referenceKinds", C3184.m9603("type", "array", "description", "Reference kinds to return.").add("items", C4969.m13784("Reference kind.", "call", "jump", e.m, "unknown"))).add("maxScanBytes", C4969.m13786("integer", "Maximum code/data-pointer bytes to consume on this xref page.")), "integer", "Maximum refs to return on this page.", "limit", "Arguments for mt_apk_native_xref."), "mt_apk_native_xref", "retry"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16015(String str, String str2) {
        return JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C4969.m13786("string", "Edit session id, or empty string for base APK or unavailable context.")).add("locator", C4969.m13786("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C4969.m13786("string", "Requested address kind, or empty string when unavailable.")).add("address", C4969.m13786("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("instructionMode", C4969.m13786("string", "Requested instruction mode, or empty string when unavailable.")).add("reason", C4969.m13786("string", str)).add("addressModeHint", C4969.m13786("string", str2)).add("retryInstructionModes", C4969.m13788("Instruction modes corresponding one-to-one with root nextActions retry actions, in the same order. Empty when no retry action is available."));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m16007() {
        return JSON.object().add("sectionName", C4969.m13786("string", "Section or segment name, or empty string on miss.")).add("virtualAddress", C4969.m13789("string", "Mapped virtual address, or null.")).add("fileOffset", C4969.m13789("string", "Mapped ELF file offset within the zip_entry bytes, or null.")).add("rangeOffset", C4969.m13789("string", "Offset inside mapped range, or null.")).add("size", C4969.m13786("integer", "Mapped range size, or 0 on miss.")).add("isLoaded", C4969.m13786(ClassTransform.BOOLEAN, "Whether this file-backed mapping belongs to a loaded ELF range. false means do not treat it as a runtime address; true does not make virtual-only bytes outside file backing mappable.")).add("isExecutable", C4969.m13786(ClassTransform.BOOLEAN, "Whether this loaded mapping is executable; do not disassemble when false.")).add("segment", C4969.m13786(ClassTransform.BOOLEAN, "Whether the mapping came from a segment; this does not mean the address is loaded."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16036(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if ((z && str.isEmpty()) || str.length() > 1024) {
            return false;
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str)).remaining() <= 1024;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }
}
