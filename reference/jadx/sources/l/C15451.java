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

/* JADX INFO: renamed from: l.ܳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1761 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15451 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36971(C1129 c1129, C16684 c16684) {
        String str;
        int i;
        String str2 = c1129.f4206;
        String str3 = c1129.f4203;
        String str4 = c1129.f4204;
        JSONObject jSONObjectAdd = m36970(str2, str3, str4).add("type", c16684.f53905).add("arch", c16684.f53916).add(am.w, c16684.f53909).add("machine", c16684.f53911).add("abi", c16684.f53903).add(am.x, c16684.f53902).add("subsystem", c16684.f53908).add("interpreter", c16684.f53913).add("archBits", c16684.f53917).add("hasVirtualAddress", c16684.f53919).add("positionIndependent", c16684.f53915).add("nx", c16684.f53918).add("canary", c16684.f53914).add("baseAddress", m36982(c16684.f53906)).add("entryVirtualAddress", m36982(c16684.f53901)).add("entryFileOffset", m36982(c16684.f53904)).add("initVirtualAddress", m36982(c16684.f53912)).add("finiVirtualAddress", m36982(c16684.f53907));
        C24890 c24890 = c16684.f53910;
        String str5 = "neededLibraries";
        JSONObject jSONObjectAdd2 = JSON.object().add("neededLibraries", c24890.f80531);
        int i2 = c24890.f80529;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("sections", i2);
        int i3 = c24890.f80527;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("segments", i3);
        int i4 = c24890.f80528;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("imports", i4);
        int i5 = c24890.f80525;
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("symbols", i5);
        int i6 = c24890.f80526;
        String str6 = "entries";
        JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("entries", i6);
        int i7 = c24890.f80533;
        JSONObject jSONObjectAdd8 = jSONObjectAdd7.add("initArray", i7);
        int i8 = c24890.f80532;
        JSONObject jSONObjectAdd9 = jSONObjectAdd8.add("finiArray", i8);
        int i9 = c24890.f80530;
        JSONObject jSONObjectAdd10 = jSONObjectAdd.add("counts", jSONObjectAdd9.add("relocations", i9));
        JSONArray jSONArrayArray = JSON.array();
        int i10 = 0;
        while (i10 < 9) {
            String str7 = C10717.f34032[i10];
            C10717.m27304(str7);
            if (str5.equals(str7)) {
                str = str5;
                i = c24890.f80531;
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
                jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", str2).add("editSessionId", str3).add("locator", str4).add("itemKind", str7).add("namePrefix", "").add("demangle", false).add("limit", 100), "mt_apk_native_list_items", "inspect", "Read first page of native ".concat(str7)));
            }
            i10++;
            str5 = str;
            c24890 = c24890;
            str6 = str6;
        }
        return C15300.m36728(jSONObjectAdd10, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36978(C13806 c13806, C22652 c22652, String str) {
        Iterator it;
        String str2;
        String str3;
        boolean z;
        JSONObject jSONObjectAdd;
        String str4 = c13806.f43787;
        boolean z2 = str != null;
        String str5 = c13806.f43786;
        String str6 = c13806.f43784;
        String str7 = c13806.f43790;
        JSONObject jSONObjectM36970 = m36970(str4, str7, c13806.f43780);
        String str8 = c22652.f73562;
        List list = c22652.f73565;
        JSONObject jSONObjectAdd2 = jSONObjectM36970.add("itemKind", str8).add("namePrefix", str6).add("demangle", c13806.f43783).add("filterHint", (("initArray".equals(str5) || "finiArray".equals(str5)) && !str6.isEmpty()) ? C22121.m50076("code", "name_prefix_not_applicable", "message", "This itemKind has no name field, so a non-empty namePrefix filters out every item; retry with namePrefix=\"\" to read the list.") : C22121.m50076("code", "", "message", ""));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC21906 interfaceC21906 = (InterfaceC21906) it2.next();
            if (interfaceC21906 instanceof C19668) {
                jSONObjectAdd = JSON.object().add("name", ((C19668) interfaceC21906).f63349);
                str2 = str4;
                z = z2;
                str3 = str7;
                it = it2;
            } else {
                it = it2;
                if (interfaceC21906 instanceof C5498) {
                    C5498 c5498 = (C5498) interfaceC21906;
                    str2 = str4;
                    jSONObjectAdd = JSON.object().add("name", c5498.f19127).add("type", c5498.f19118).add("arch", c5498.f19119).add("virtualAddress", m36982(c5498.f19122)).add("fileOffset", m36982(c5498.f19124)).add("size", c5498.f19120).add("virtualSize", c5498.f19128).add("permissions", c5498.f19125).add("flags", c5498.f19121).add(e.m, c5498.f19126).add("segment", c5498.f19123);
                    z = z2;
                    str3 = str7;
                } else {
                    str2 = str4;
                    str3 = str7;
                    z = z2;
                    if (interfaceC21906 instanceof C13482) {
                        C13482 c13482 = (C13482) interfaceC21906;
                        jSONObjectAdd = JSON.object().add("name", c13482.f42893).add("demangledName", c13482.f42892).add("library", c13482.f42894).add("bind", c13482.f42890).add("type", c13482.f42889).add("className", c13482.f42896).add("descriptor", c13482.f42897).add("ordinal", c13482.f42891).add("inSectionHeader", c13482.f42895).add("imported", true);
                    } else if (interfaceC21906 instanceof C17430) {
                        C17430 c17430 = (C17430) interfaceC21906;
                        jSONObjectAdd = JSON.object().add("name", c17430.f56690).add("demangledName", c17430.f56694).add("className", c17430.f56688).add("library", c17430.f56691).add("bind", c17430.f56686).add("type", c17430.f56689).add("imported", c17430.f56692).add("virtualAddress", m36982(c17430.f56695)).add("fileOffset", m36982(c17430.f56687)).add("size", c17430.f56685).add("symbolBits", c17430.f56693);
                    } else if (interfaceC21906 instanceof C4752) {
                        C4752 c4752 = (C4752) interfaceC21906;
                        jSONObjectAdd = JSON.object().add("arrayName", c4752.f16700).add("arrayIndex", c4752.f16694).add("slotVirtualAddress", m36982(c4752.f16699)).add("slotFileOffset", m36982(c4752.f16701)).add("targetVirtualAddress", m36982(c4752.f16695)).add("targetFileOffset", m36982(c4752.f16697)).add("targetInstructionMode", c4752.f16698).add("pointerSize", c4752.f16696);
                    } else {
                        if (!(interfaceC21906 instanceof C15192)) {
                            throw new IllegalArgumentException("Unsupported native item type");
                        }
                        C15192 c15192 = (C15192) interfaceC21906;
                        jSONObjectAdd = JSON.object().add("name", c15192.f49600).add("demangledName", c15192.f49597).add("library", c15192.f49601).add("type", c15192.f49594).add("numericType", c15192.f49599).add("virtualAddress", m36982(c15192.f49598)).add("fileOffset", m36982(c15192.f49596)).add("addend", c15192.f49595).add("additive", c15192.f49602).add("ifunc", c15192.f49603);
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
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("items", jSONArrayArray).add("pagination", m36981(z3, str, list.size(), 500, Long.valueOf(c22652.f73564)));
        JSONArray jSONArrayArray2 = JSON.array();
        if (z3) {
            jSONArrayArray2.add(C2729.m9064(C22121.m50076("workspaceId", str9, "editSessionId", str10).add("nextCursor", str).add("limit", c13806.f43782), "mt_apk_continue", "continue", "Continue native item page"));
        }
        return C15300.m36728(jSONObjectAdd3, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36974(C9331 c9331, C9007 c9007) throws C10186 {
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = m36970(c9331.f30337, c9331.f30341, c9331.f30338).add("addressKind", c9331.f30336).add("address", c9331.f30340);
        boolean z = c9007.f29351;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("found", z);
        m36994(c9007);
        m37003(c9007);
        JSONObject jSONObjectM36973 = z ? m36973(c9007) : m36992();
        C0804 c0804 = c9007.f29343;
        if (!c0804.f2852) {
            JSONObject jSONObjectAdd4 = JSON.object().add("found", false).add("name", "").add("demangledName", "").add("instructionMode", "");
            JSONValue jSONValue = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue).add("startFileOffset", jSONValue).add("offset", jSONValue).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("found", true).add("name", c0804.f2853).add("demangledName", c0804.f2846).add("instructionMode", c0804.f2848).add("startVirtualAddress", m36982(c0804.f2847)).add("startFileOffset", m36982(c0804.f2849)).add("offset", m36982(c0804.f2851)).add("size", c0804.f2850);
        }
        return C15300.m36728(jSONObjectAdd3.add("mapping", jSONObjectM36973.add("enclosingSymbol", jSONObjectAdd)), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36972(C5253 c5253, String str, boolean z, C9007 c9007, String str2, int i, String str3, String str4, C1023 c1023, String str5) throws C10186 {
        JSONObject jSONObjectM36968;
        Iterator it;
        String str6;
        JSONValue jSONValueAdd;
        String str7 = c5253.f18518;
        List list = c5253.f18509;
        String str8 = c5253.f18503;
        long j = c9007.f29349;
        int i2 = c1023.f3696;
        List list2 = c1023.f3703;
        boolean z2 = c1023.f3698;
        boolean z3 = str5 != null;
        String str9 = "";
        JSONObject jSONObjectM50076 = (!z || !("code".equals(str8) || "both".equals(str8)) || !list.contains(e.m) || j < 0 || j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) ? C22121.m50076("warningCode", "", "warning", "") : C22121.m50076("warningCode", "low_address_instruction_data_reference_noise", "warning", "Low target virtual addresses can be confused with ordinary instruction immediates; code/both instruction data refs may contain false positives. To inspect strings, tables, or pointer slots only, retry with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto.");
        if (z) {
            String str10 = c1023.f3697;
            if (z2 && z3) {
                throw m36986();
            }
            if (!z2 && !z3) {
                throw m36986();
            }
            if (!list2.isEmpty()) {
                jSONObjectM36968 = m36968(jSONObjectM50076, "refs_found", "This page contains direct references matching scanKind and referenceKinds; continue if pagination.hasMore is true.", str10);
            } else if (z3) {
                jSONObjectM36968 = m36968(jSONObjectM50076, "scan_incomplete", "This page has no refs, but scanning is not complete; continue with mt_apk_continue before concluding no references.", str10);
            } else {
                if (!z2) {
                    throw m36986();
                }
                jSONObjectM36968 = m36968(jSONObjectM50076, "no_refs_found", "This bounded direct-reference scan completed for the current scanKind, referenceKinds, and maxScanBytes, and found no direct references.", str10);
            }
        } else {
            if (!list2.isEmpty() || i2 != 0 || !z2 || z3) {
                throw m36986();
            }
            jSONObjectM36968 = m36968(jSONObjectM50076, "target_not_mapped", "No scan ran because the target has no loaded file-backed mapping; it may be a miss, virtual-only address, or non-loaded file bytes.", "target_not_mapped");
        }
        String str11 = c5253.f18501;
        JSONObject jSONObjectAdd = m36970(str7, str11, c5253.f18515).add("addressKind", c5253.f18507).add("address", c5253.f18519).add("instructionMode", c5253.f18523).add("resolvedInstructionMode", str).add("scanKind", str8);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArrayArray.add((String) it2.next());
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("referenceKinds", jSONArrayArray).add("targetMapped", z).add("targetVirtualAddress", z ? m36982(j) : JSON.NULL).add("targetFileOffset", z ? m36982(c9007.f29344) : JSON.NULL).add("mapping", m36973(c9007)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C9971 c9971 = (C9971) it3.next();
            String str12 = str9;
            JSONObject jSONObjectAdd3 = JSON.object().add("sourceVirtualAddress", m36982(c9971.f32055)).add("sourceFileOffset", m36982(c9971.f32054)).add("sourceKind", c9971.f32059).add("sourceSize", c9971.f32057);
            C2514 c2514 = c9971.f32056;
            if (c2514 != null) {
                String str13 = c2514.f8046;
                it = it3;
                if (m36990(str13, true)) {
                    String str14 = c2514.f8042;
                    str6 = str12;
                    if (!m36990(str14, false) || str14.equals(str13)) {
                        str14 = str6;
                    }
                    str11 = str11;
                    jSONValueAdd = C22121.m50076("name", str13, "demangledName", str14).add("startVirtualAddress", m36982(c2514.f8044)).add("startFileOffset", m36982(c2514.f8045)).add("offset", m36982(c2514.f8043)).add("size", c2514.f8047);
                }
                jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c9971.f32052).add(TextBundle.TEXT_ENTRY, c9971.f32053).add("referenceKind", c9971.f32058));
                it3 = it;
                str9 = str6;
                str7 = str7;
                str11 = str11;
            } else {
                it = it3;
            }
            str6 = str12;
            jSONValueAdd = JSON.NULL;
            jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c9971.f32052).add(TextBundle.TEXT_ENTRY, c9971.f32053).add("referenceKind", c9971.f32058));
            it3 = it;
            str9 = str6;
            str7 = str7;
            str11 = str11;
        }
        String str15 = str11;
        String str16 = str7;
        JSONObject jSONObjectAdd4 = jSONObjectAdd2.add("refs", jSONArrayArray2).add("scannedBytes", i2).add("scanComplete", z2).add("scanSummary", jSONObjectM36968).add("pagination", m36981(z3, str5, list2.size(), 200, null));
        JSONArray jSONArrayArray3 = JSON.array();
        if (z3) {
            jSONArrayArray3.add(C2729.m9064(C22121.m50076("workspaceId", str16, "editSessionId", str15).add("nextCursor", str5).add("limit", c5253.f18514), "mt_apk_continue", "continue", "Continue native xref scan"));
        }
        return C15300.m36728(jSONObjectAdd4, jSONArrayArray3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36979(C19028 c19028, String str, long j, C9007 c9007, String str2, int i, String str3, String str4, int i2, int i3, boolean z, List list, C19927 c19927, boolean z2, JSONValue jSONValue, JSONValue jSONValue2, JSONValue jSONValue3) {
        JSONObject jSONObjectAdd;
        String str5 = c19028.f61650;
        String str6 = c19028.f61649;
        String str7 = c19028.f61645;
        JSONObject jSONObjectAdd2 = m36970(str5, str6, str7).add("addressKind", c19028.f61643).add("address", c19028.f61648).add("instructionMode", c19028.f61646);
        boolean z3 = c19028.f61644;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("stopAtSymbolBoundary", z3).add("resolvedInstructionMode", str).add("effectiveAddress", m36982(j)).add("mapping", m36973(c9007));
        if (c19927.f64091) {
            jSONObjectAdd = C24579.m54898("requested", "applied", true, true).add("endReached", c19927.f64093).add("name", c19927.f64096).add("demangledName", c19927.f64097).add("startVirtualAddress", m36982(c19927.f64090)).add("endVirtualAddressExclusive", m36982(c19927.f64098)).add("offset", m36982(c19927.f64095)).add("size", c19927.f64092);
        } else {
            JSONObject jSONObjectAdd4 = JSON.object().add("requested", c19927.f64094).add("applied", false).add("endReached", false).add("name", "").add("demangledName", "");
            JSONValue jSONValue4 = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue4).add("endVirtualAddressExclusive", jSONValue4).add("offset", jSONValue4).add("size", 0);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd3.add("symbolBoundary", jSONObjectAdd).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4).add("bytesRead", i2).add("bytesConsumed", i3).add("incompleteInstructionAtEnd", z);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22165 c22165 = (C22165) it.next();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(C11218.m28261(c22165.f71387));
            sb.append(": ");
            sb.append(c22165.f71389);
            sb.append(' ');
            sb.append(c22165.f71390);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("disassemblyText", sb.toString()).add("instructionCount", list.size()).add("hasMore", z2).add("nextAddressKind", jSONValue).add("nextAddress", jSONValue2).add("nextInstructionMode", jSONValue3);
        JSONArray jSONArrayArray = JSON.array();
        if (z2) {
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", str5, "editSessionId", str6).add("locator", str7).add("addressKind", jSONValue).add("address", jSONValue2).add("instructionMode", jSONValue3).add("stopAtSymbolBoundary", z3).add("maxBytes", c19028.f61642).add("maxInstructions", c19028.f61640), "mt_apk_native_disassemble", "continue", "Read the next contiguous instruction window"));
        }
        return C15300.m36728(jSONObjectAdd6, jSONArrayArray);
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
    public static JSONObject m36975(C10077 c10077, String str, long j, C9007 c9007, String str2, int i, String str3, String str4, C4006 c4006) {
        String str5;
        int i2;
        ?? r9;
        ?? r35;
        String str6;
        int i3;
        int i4;
        int i5;
        C14201 c14201M36988;
        ?? r1;
        boolean z;
        C5011 c5011;
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
        String str13 = c10077.f32309;
        String str14 = c10077.f32312;
        String str15 = c10077.f32306;
        List list2 = c4006.f13689;
        C6244 c6244 = c4006.f13688;
        List<C24144> list3 = c4006.f13684;
        List<C3260> list4 = c4006.f13692;
        String str16 = c10077.f32314;
        int i9 = c10077.f32307;
        int i10 = c10077.f32303;
        int i11 = c10077.f32305;
        String str17 = c10077.f32308;
        String str18 = c10077.f32313;
        String str19 = c10077.f32310;
        List list5 = list2;
        boolean zEquals2 = ErrorBundle.SUMMARY_ENTRY.equals(str16);
        C23398 c23398 = c4006.f13685;
        ?? r8 = c23398.f75741;
        int i12 = c23398.f75742;
        int i13 = c23398.f75744;
        int i14 = c23398.f75739;
        int i15 = c23398.f75745;
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
                c14201M36988 = m36988(c10077, (String) r8);
            } else {
                long j5 = c6244.f21197;
                if (j5 <= 0) {
                    c14201M36988 = m36988(c10077, (String) r8);
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
                    long jM36965 = m36965(d);
                    int i16 = i9;
                    double d2 = i12;
                    ?? r312 = "max_blocks_reached";
                    double d3 = i15;
                    long jM36966 = m36965((d2 / d3) * d);
                    double d4 = i14;
                    long jM36967 = m36965(Math.max((d4 / d3) * d, jM36966 * (d4 / d2)));
                    if ("max_analysis_bytes_reached".equals(r8)) {
                        i6 = i11;
                        jMax = Math.max(jM36965, ((long) i6) * 2);
                        i7 = i10;
                        r37 = r312;
                    } else {
                        i6 = i11;
                        if (r312.equals(r8)) {
                            r37 = r312;
                            i7 = i10;
                            jM36967 = Math.max(jM36967, ((long) i7) * 2);
                            jMax = jM36965;
                        } else {
                            i15 = i15;
                            ?? r13 = "max_instructions_reached";
                            i7 = i10;
                            if (r13.equals(r8)) {
                                r36 = r312;
                                i16 = i16;
                                j2 = jM36967;
                                jM36966 = Math.max(jM36966, ((long) i16) * 2);
                                j3 = jM36965;
                                r10 = r13;
                                r38 = r36;
                            } else {
                                r36 = r312;
                                jMax = jM36965;
                                r11 = r13;
                                r39 = r36;
                                j2 = jM36967;
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
                        c14201M36988 = m36987(c10077, j3, j6, jM36966);
                        r9 = r10;
                        r35 = r38;
                    }
                    r11 = "max_instructions_reached";
                    r39 = r37;
                    j2 = jM36967;
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
                    c14201M36988 = m36987(c10077, j3, j7, jM36966);
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
                    if (c14201M36988.f44883 > i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 1:
                    if (c14201M36988.f44885 > i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    if (c14201M36988.f44884 > i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            c5011 = new C5011(z, c14201M36988.f44884, c14201M36988.f44883, c14201M36988.f44885, c14201M36988.f44882);
            r2 = r1;
            r12 = r9;
        } else {
            str5 = str18;
            str16 = str16;
            i12 = i12;
            i2 = i15;
            r12 = "max_instructions_reached";
            c6244 = c6244;
            str19 = str19;
            str6 = str17;
            c5011 = new C5011(false, c10077.f32305, c10077.f32303, c10077.f32307, false);
            r2 = "max_blocks_reached";
            i14 = i14;
        }
        String str20 = str19;
        String str21 = str5;
        int i19 = i12;
        JSONObject jSONObjectAdd = m36970(str20, str21, str6).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", str16).add("detailOmitted", zEquals2).add("resolvedInstructionMode", str).add("effectiveAddress", m36982(j)).add("mapping", m36973(c9007)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        C6244 c6245 = c6244;
        String str22 = "startVirtualAddress";
        String str23 = "startFileOffset";
        String str24 = str6;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("function", JSON.object().add("startVirtualAddress", m36982(c6245.f21199)).add("startFileOffset", m36982(c6245.f21201)).add("name", c6245.f21203).add("demangledName", c6245.f21198).add("symbolSize", c6245.f21197).add("startSource", c6245.f21200).add("boundarySource", c6245.f21202).add("boundaryEndVirtualAddress", m36982(c6245.f21196)));
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
                C3260 c3260 = (C3260) it2.next();
                jSONArrayArray.add(JSON.object().add("startVirtualAddress", m36982(c3260.f10597)).add("startFileOffset", m36982(c3260.f10599)).add("size", c3260.f10595).add("instructionCount", c3260.f10598).add("terminator", c3260.f10596).add("assemblyText", c3260.f10594));
                it2 = it3;
                c5011 = c5011;
                str20 = str20;
                str21 = str21;
            }
        }
        String str28 = str21;
        C5011 c5012 = c5011;
        String str29 = str20;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("blocks", jSONArrayArray);
        if (zEquals2) {
            jSONArrayArray2 = JSON.array();
            str7 = "terminator";
            str8 = "startFileOffset";
        } else {
            List list6 = c4006.f13690;
            JSONArray jSONArrayArray5 = JSON.array();
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                C20414 c20414 = (C20414) it4.next();
                jSONArrayArray5.add(JSON.object().add("fromVirtualAddress", m36982(c20414.f65417)).add("toVirtualAddress", m36982(c20414.f65418)).add("kind", c20414.f65419));
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
                C12209 c12209 = (C12209) it5.next();
                jSONArrayArray3.add(JSON.object().add("sourceVirtualAddress", m36982(c12209.f39239)).add("flowKind", c12209.f39238).add("targetVirtualAddress", m36982(c12209.f39241)).add("reason", c12209.f39240));
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
            for (C24144 c24144 : list3) {
                JSONObject jSONObjectAdd6 = JSON.object().add("sourceVirtualAddress", m36982(c24144.f78154)).add("flowKind", c24144.f78150);
                if (c24144.f78153) {
                    jSONObjectAdd6.add("targetVirtualAddress", m36982(c24144.f78152));
                }
                jSONObjectAdd6.add("reason", c24144.f78151);
                jSONArrayArray6.add(jSONObjectAdd6);
            }
            jSONArrayArray4 = jSONArrayArray6;
        }
        JSONObject jSONObjectAdd7 = jSONObjectAdd5.add("unresolvedFlows", jSONArrayArray4);
        JSONObject jSONObjectAdd8 = JSON.object().add("controlFlowComplete", c23398.f75746);
        String str33 = c23398.f75741;
        JSONObject jSONObjectAdd9 = jSONObjectAdd7.add("analysisSummary", jSONObjectAdd8.add("completionReason", str33).add("meaning", m36984(str33)).add("bytesAnalyzed", i2).add("instructionsAnalyzed", i19));
        int i20 = i14;
        JSONObject jSONObjectAdd10 = JSON.object().add("blockCount", i20).add("edgeCount", i13).add("externalFlowCount", c23398.f75743).add("unresolvedFlowCount", c23398.f75740).add("terminatorCounts", JSON.object().add("fallthrough", m36964("fallthrough", list4)).add("conditional_jump", m36964("conditional_jump", list4)).add("jump", m36964("jump", list4)).add("indirect_jump", m36964("indirect_jump", list4)).add("return", m36964("return", list4)).add("trap", m36964("trap", list4)).add("invalid", m36964("invalid", list4)).add("budget_boundary", m36964("budget_boundary", list4)));
        String str34 = "return";
        String str35 = "instruction_mode_transition";
        ?? r29 = r12;
        JSONObject jSONObjectAdd11 = JSON.object().add("target_not_executable", m36999("target_not_executable", list3)).add("unaligned_or_overlapping_target", m36999("unaligned_or_overlapping_target", list3)).add("instruction_mode_transition", m36999("instruction_mode_transition", list3)).add(r2, m36999((String) r2, list3)).add("max_analysis_bytes_reached", m36999("max_analysis_bytes_reached", list3)).add(r12, m36999((String) r12, list3)).add("invalid_instruction", m36999("invalid_instruction", list3));
        String str36 = "indirect_target";
        JSONObject jSONObjectAdd12 = jSONObjectAdd10.add("unresolvedReasonCounts", jSONObjectAdd11.add("indirect_target", m36999("indirect_target", list3)));
        JSONArray jSONArrayArray7 = JSON.array();
        if (i20 == 0) {
            r311 = r2;
            str9 = "max_analysis_bytes_reached";
        } else {
            int iM36964 = m36964("conditional_jump", list4);
            int iM36965 = m36964("indirect_jump", list4);
            r310 = r2;
            int iM36966 = m36964("budget_boundary", list4);
            str9 = "max_analysis_bytes_reached";
            if (i20 > 1 && iM36964 == 0 && iM36965 == 0 && i13 == i20 - 1) {
                jSONArrayArray7.add("observed_linear");
            }
            if (iM36964 > 0 || i13 > i20) {
                jSONArrayArray7.add("observed_branchy");
            }
            if (iM36965 > 0 || (i20 >= 16 && iM36966 >= 4)) {
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
        C3260 c3260M36985 = m36985(c4006);
        JSONObject jSONObjectAdd14 = jSONObjectAdd13.add("entryPreview", JSON.object().add("available", c3260M36985 != null).add(str31, c3260M36985 == null ? JSON.NULL : m36982(c3260M36985.f10597)).add("lines", c3260M36985 == null ? JSON.array() : m36966(16, c3260M36985.f10594)));
        ArrayList<C3260> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        m36989(arrayList, hashSet, m36985(c4006));
        Iterator it6 = list4.iterator();
        while (true) {
            i8 = 8;
            if (it6.hasNext()) {
                C3260 c3261 = (C3260) it6.next();
                if (arrayList.size() < 8) {
                    String str37 = c3261.f10596;
                    if ("budget_boundary".equals(str37) || "invalid".equals(str37) || "indirect_jump".equals(str37)) {
                        m36989(arrayList, hashSet, c3261);
                    }
                }
            }
        }
        if (arrayList.size() < 8) {
            int i21 = 0;
            for (C3260 c3262 : list4) {
                if (arrayList.size() < i8) {
                    long j8 = c3262.f10597 + c3262.f10595;
                    while (true) {
                        if (i21 < list5.size()) {
                            list = list5;
                            str11 = str35;
                            str12 = str36;
                            if (((C12209) list.get(i21)).f39239 < c3262.f10597) {
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
                    boolean z3 = i21 < list.size() && ((C12209) list.get(i21)).f39239 < j8;
                    String str38 = str34;
                    if (str38.equals(c3262.f10596) || z3) {
                        m36989(arrayList, hashSet, c3262);
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
            ArrayList<C3260> arrayList2 = new ArrayList(list4);
            C12884.sort(arrayList2, C8627.thenComparingLong(C8627.reversed(C2661.comparingLong(new C8981())), new C7490()));
            for (C3260 c3263 : arrayList2) {
                if (arrayList.size() < 8) {
                    m36989(arrayList, hashSet, c3263);
                }
            }
        }
        JSONArray jSONArrayArray8 = JSON.array();
        for (C3260 c3264 : arrayList) {
            jSONArrayArray8.add(JSON.object().add(str31, m36982(c3264.f10597)).add(str8, m36982(c3264.f10599)).add(str32, c3264.f10595).add(str30, c3264.f10598).add(str7, c3264.f10596).add("previewLines", m36966(4, c3264.f10594)));
        }
        JSONObject jSONObjectAdd15 = jSONObjectAdd14.add("notableBlocks", jSONArrayArray8);
        JSONArray jSONArrayArray9 = JSON.array();
        if (c5012.f17393) {
            jSONArrayArray9.add(C2729.m9064(C22121.m50076("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", ErrorBundle.SUMMARY_ENTRY).add("maxAnalysisBytes", c5012.f17391).add("maxBlocks", c5012.f17394).add("maxInstructions", c5012.f17392), "mt_apk_native_analyze_control_flow", "retry", c5012.f17390 ? "Retry CFG from the beginning with budgets clamped to public limits in summary mode; the new result replaces this partial graph and may still be incomplete." : "Retry CFG from the beginning with recommended budgets in summary mode; the new result replaces this partial graph."));
        } else if (!c23398.f75746 && j >= 0) {
            String str41 = c23398.f75741;
            Iterator it7 = list3.iterator();
            while (true) {
                if (it7.hasNext()) {
                    C24144 c24145 = (C24144) it7.next();
                    String str42 = c24145.f78151;
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
                            j4 = ((!z2 || "invalid_instruction".equals(str41)) && c24145.f78153) ? c24145.f78152 : c24145.f78154;
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
            jSONArrayArray9.add(C2729.m9064(C22121.m50076("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", "virtual").add("address", C11218.m28261(j4)).add("instructionMode", str).add("stopAtSymbolBoundary", false).add("maxBytes", 4096).add("maxInstructions", 200), "mt_apk_native_disassemble", "inspect", "Inspect a local instruction window because no larger CFG retry is available."));
        }
        return C15300.m36728(jSONObjectAdd15, jSONArrayArray9);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36977(C10976 c10976) {
        byte[] bArr = c10976.f34672;
        int length = bArr.length;
        C8586 c8586 = c10976.f34675;
        String str = c8586.f28074;
        String str2 = c8586.f28077;
        String str3 = c8586.f28067;
        JSONObject jSONObjectAdd = m36970(str, str2, str3).add("addressKind", c8586.f28070).add("address", c8586.f28076).add("instructionMode", c8586.f28069);
        String str4 = c10976.f34681;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("resolvedInstructionMode", str4);
        long j = c10976.f34678;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("effectiveAddress", m36982(j)).add("mapping", m36973(c10976.f34673)).add("arch", c10976.f34679).add("archBits", c10976.f34674).add("instructionSet", c10976.f34677).add("instructionWidth", c10976.f34676).add("patchedVirtualAddress", m36982(j));
        long j2 = c10976.f34671;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patchedFileOffset", m36982(j2)).add("bytesPatched", length).add("expectedHex", c8586.f28072);
        byte[] bArr2 = c10976.f34680;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("assembledHex", C11218.m28264(bArr2)).add("afterHex", C11218.m28264(bArr)).add("paddingMode", c8586.f28071).add("nopBytesInserted", length - bArr2.length);
        JSONArray jSONArrayArray = JSON.array();
        int length2 = bArr.length;
        jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("addressKind", "virtual").add("address", C11218.m28261(j)).add("instructionMode", str4).add("stopAtSymbolBoundary", false).add("maxBytes", Math.min(4096, Math.max(16, length2))).add("maxInstructions", 16), "mt_apk_native_disassemble", "inspect", "Disassemble the patched instruction window"));
        jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j2).add("maxBytes", length2), "mt_apk_read_bytes", "inspect", "Read back the exact patched byte window"));
        return C15300.m36728(jSONObjectAdd5, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36980(C22911 c22911) {
        byte[] bArr = c22911.f74454;
        int length = bArr.length;
        C7095 c7095 = c22911.f74457;
        String str = c7095.f23413;
        String str2 = c7095.f23412;
        String str3 = c7095.f23405;
        JSONObject jSONObjectAdd = m36970(str, str2, str3).add("addressKind", c7095.f23406).add("address", c7095.f23411).add("effectiveAddress", m36982(c22911.f74456)).add("mapping", m36973(c22911.f74459));
        long j = c22911.f74458;
        return C15300.m36728(jSONObjectAdd.add("patchedFileOffset", m36982(j)).add("textEncoding", "utf8").add("expectedTextByteCount", c7095.f23409.length).add("replacementTextByteCount", c7095.f23407.length).add("extraPaddingBytesConsumed", c22911.f74461).add("terminatorPreserved", c22911.f74455).add("bytesPatched", length).add("beforeHex", C11218.m28264(c22911.f74460)).add("afterHex", C11218.m28264(bArr)).add("paddingMode", c7095.f23403), JSON.array().add(C2729.m9064(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j).add("maxBytes", bArr.length), "mt_apk_read_bytes", "inspect", "Read back the exact patched native string byte window")));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m36994(C9007 c9007) throws C10186 {
        boolean z = c9007.f29351;
        boolean z2 = c9007.f29350;
        boolean z3 = c9007.f29348;
        if (!z) {
            if (z3 || z2) {
                throw m36986();
            }
        } else {
            if (z2 && !z3) {
                throw m36986();
            }
            if (c9007.f29349 >= 0 && c9007.f29344 >= 0) {
                long j = c9007.f29347;
                if (j >= 0) {
                    long j2 = c9007.f29353;
                    if (j2 >= 0 && j <= j2) {
                        return;
                    }
                }
            }
            throw m36998();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37003(C9007 c9007) throws C10186 {
        C0804 c0804 = c9007.f29343;
        boolean z = c0804.f2852;
        long j = c0804.f2850;
        long j2 = c0804.f2851;
        long j3 = c0804.f2847;
        String str = c0804.f2846;
        String str2 = c0804.f2853;
        String str3 = c0804.f2848;
        if (!z) {
            if (!str2.isEmpty() || !str.isEmpty() || !str3.isEmpty() || j3 != 0 || c0804.f2849 != 0 || j2 != 0 || j != 0) {
                throw m36986();
            }
            return;
        }
        if (!c9007.f29351 || str2.isEmpty() || str3.isEmpty() || (!(str3.isEmpty() || "auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3) || "unknown".equals(str3)) || j3 < 0 || j2 < 0 || j <= 0 || j2 >= j || j3 > C25227.FOREVER_NS - j || j3 + j2 != c9007.f29349 || str.length() > 4096)) {
            throw m36986();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C10186 m36998() {
        return C10186.m26305("NATIVE_INVALID_ELF_MAPPING", "ELF address mapping is invalid.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m36986() {
        return C10186.m26305("NATIVE_ANALYZER_INVALID_RESULT", "Native ELF analysis returned an inconsistent result.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36970(String str, String str2, String str3) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36968(JSONObject jSONObject, String str, String str2, String str3) {
        return C22121.m50076("reason", str, "meaning", str2).add("completionReason", str3).add("warningCode", jSONObject.getString("warningCode", "")).add("warning", jSONObject.getString("warning", ""));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36976(C10186 c10186) {
        JSONValue jSONValueAdd;
        boolean zM55000 = C24645.m55000(c10186);
        JSONObject jSONObject = c10186.f32602;
        if (!zM55000 && jSONObject.get("patchedFileOffset") == null && jSONObject.get("expectedBytes") == null && jSONObject.get("assembledBytes") == null && jSONObject.get("remainingBytes") == null && jSONObject.get("arch") == null && jSONObject.get("message") == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = (C24645.m55000(c10186) ? C24645.m54989(c10186) : JSON.object().add("workspaceId", m37002(jSONObject, "workspaceId")).add("editSessionId", m37002(jSONObject, "editSessionId")).add("locator", m37002(jSONObject, "locator")).add("addressKind", m37002(jSONObject, "addressKind")).add("address", m37002(jSONObject, "address")).add("instructionMode", m37002(jSONObject, "instructionMode")).add("reason", "").add("addressModeHint", "").add("retryInstructionModes", JSON.array())).add("patchedFileOffset", m36993(jSONObject, "patchedFileOffset")).add("expectedHex", m36993(jSONObject, "expectedHex")).add("actualHex", m36993(jSONObject, "actualHex")).add("expectedBytes", m36983(jSONObject, "expectedBytes")).add("assembledBytes", m36983(jSONObject, "assembledBytes")).add("paddingMode", m36993(jSONObject, "paddingMode")).add("remainingBytes", m36983(jSONObject, "remainingBytes")).add("instructionSet", m36993(jSONObject, "instructionSet")).add("instructionWidth", m36993(jSONObject, "instructionWidth")).add("arch", m36993(jSONObject, "arch")).add("bits", m36983(jSONObject, "bits")).add("message", m36993(jSONObject, "message"));
        }
        boolean zM55001 = C24645.m55000(c10186);
        JSONArray jSONArrayM36967 = c10186.f32599;
        if (!zM55001) {
            jSONArrayM36967 = m36967(jSONArrayM36967);
            if (jSONArrayM36967.size() <= 0) {
                if ("PATCH_EXPECTED_MISMATCH".equals(c10186.f32601)) {
                    String strM37002 = m37002(jSONObject, "workspaceId");
                    String strM37003 = m37002(jSONObject, "editSessionId");
                    String strM37004 = m37002(jSONObject, "locator");
                    JSONValue jSONValue = jSONObject.get("byteOffset");
                    int iAsInt = -1;
                    if (jSONValue != null && jSONValue.isNumber()) {
                        try {
                            iAsInt = jSONValue.asInt();
                        } catch (RuntimeException unused) {
                        }
                    }
                    String strM37005 = m37002(jSONObject, "expectedHex");
                    if (strM37002.isEmpty() || strM37003.isEmpty() || strM37004.isEmpty() || iAsInt < 0 || strM37005.length() < 2) {
                        jSONArrayM36967 = JSON.array();
                    } else {
                        jSONArrayM36967 = JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", strM37002, "editSessionId", strM37003).add("locator", strM37004).add("byteOffset", iAsInt).add("maxBytes", Math.max(1, strM37005.length() / 2)), "mt_apk_read_bytes", "retry", "Read current bytes at the stale native patch window, then retry mt_apk_native_patch_instructions with refreshed expectedHex."));
                    }
                } else {
                    jSONArrayM36967 = JSON.array();
                }
            }
        }
        return C15300.m36730(c10186, jSONValueAdd, jSONArrayM36967);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m37001(C10186 c10186) {
        JSONValue jSONValueAdd;
        String str = c10186.f32601;
        JSONObject jSONObject = c10186.f32602;
        if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_LENGTH_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str) || "NATIVE_STRING_TOO_LARGE".equals(str) || "NATIVE_STRING_RANGE_OUT_OF_ENTRY".equals(str)) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", m37002(jSONObject, "workspaceId")).add("editSessionId", m37002(jSONObject, "editSessionId")).add("locator", m37002(jSONObject, "locator")).add("addressKind", m37002(jSONObject, "addressKind")).add("address", m37002(jSONObject, "address")).add("patchedFileOffset", m36993(jSONObject, "patchedFileOffset")).add("paddingMode", m36993(jSONObject, "paddingMode")).add("expectedText", m36993(jSONObject, "expectedText")).add("actualText", m36993(jSONObject, "actualText")).add("expectedHex", m36993(jSONObject, "expectedHex")).add("actualHex", m36993(jSONObject, "actualHex")).add("expectedTextByteCount", m36983(jSONObject, "expectedTextByteCount")).add("replacementTextByteCount", m36983(jSONObject, "replacementTextByteCount")).add("requiredPaddingBytes", m36983(jSONObject, "requiredPaddingBytes")).add("actualPaddingHex", m36993(jSONObject, "actualPaddingHex"));
            JSONValue jSONValue = jSONObject.get("terminatorRequired");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                jSONValue = JSON.NULL;
            }
            jSONValueAdd = jSONObjectAdd.add("terminatorRequired", jSONValue).add("bytesPatched", m36983(jSONObject, "bytesPatched")).add("limitBytes", m36983(jSONObject, "limitBytes")).add("endByteOffset", m36993(jSONObject, "endByteOffset")).add("entrySize", m36983(jSONObject, "entrySize"));
        } else {
            jSONValueAdd = JSON.NULL;
        }
        JSONArray jSONArrayM36967 = m36967(c10186.f32599);
        if (jSONArrayM36967.size() <= 0) {
            if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str)) {
                String strM37002 = m37002(jSONObject, "workspaceId");
                String strM37003 = m37002(jSONObject, "editSessionId");
                String strM37004 = m37002(jSONObject, "locator");
                JSONValue jSONValue2 = jSONObject.get("byteOffset");
                int iAsInt = -1;
                if (jSONValue2 != null && jSONValue2.isNumber()) {
                    try {
                        iAsInt = jSONValue2.asInt();
                    } catch (RuntimeException unused) {
                    }
                }
                String strM37005 = m37002(jSONObject, "paddingMode");
                String strM37006 = m37002(jSONObject, "actualHex");
                if (strM37002.isEmpty() || strM37003.isEmpty() || strM37004.isEmpty() || iAsInt < 0 || strM37006.length() < 2 || (strM37006.length() & 1) != 0) {
                    jSONArrayM36967 = JSON.array();
                } else {
                    boolean zEquals = "null_pad".equals(strM37005);
                    jSONArrayM36967 = JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", strM37002, "editSessionId", strM37003).add("locator", strM37004).add("byteOffset", iAsInt).add("maxBytes", zEquals ? 4096 : strM37006.length() / 2), "mt_apk_read_bytes", "retry", zEquals ? "Read up to the native string patch limit and stop at the first NUL, then retry mt_apk_native_patch_string with the bytes before that terminator as refreshed expectedText." : "Read the exact observed patch window, then retry mt_apk_native_patch_string only with refreshed expectedText derived from these bytes; do not include later bytes unless the fixed slot boundary is known independently."));
                }
            } else {
                jSONArrayM36967 = JSON.array();
            }
        }
        return C15300.m36730(c10186, jSONValueAdd, jSONArrayM36967);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m36967(JSONArray jSONArray) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONValue m36993(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? JSON.NULL : JSON.value(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m36983(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m37002(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36964(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C3260) it.next()).f10596)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m36999(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C24144) it.next()).f78151)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3260 m36985(C4006 c4006) {
        List<C3260> list = c4006.f13692;
        if (list.isEmpty()) {
            return null;
        }
        long j = c4006.f13688.f21199;
        for (C3260 c3260 : list) {
            if (c3260.f10597 == j) {
                return c3260;
            }
        }
        return (C3260) list.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36989(ArrayList arrayList, HashSet hashSet, C3260 c3260) {
        if (c3260 == null || arrayList.size() >= 8 || !hashSet.add(Long.valueOf(c3260.f10597))) {
            return;
        }
        arrayList.add(c3260);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m36966(int i, String str) {
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
    public static String m36984(String str) {
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
    public static C14201 m36988(C10077 c10077, String str) {
        int i = c10077.f32305;
        long j = i;
        long j2 = c10077.f32303;
        long j3 = c10077.f32307;
        if ("max_analysis_bytes_reached".equals(str)) {
            j = ((long) i) * 2;
        } else if ("max_blocks_reached".equals(str)) {
            j2 *= 2;
        } else if ("max_instructions_reached".equals(str)) {
            j3 *= 2;
        }
        return m36987(c10077, j, j2, j3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m36965(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        double d2 = d * 1.25d;
        return d2 >= 9.223372036854776E18d ? C25227.FOREVER_NS : (long) Math.ceil(d2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14201 m36987(C10077 c10077, long j, long j2, long j3) {
        return new C14201((int) Math.min(65536, Math.max(c10077.f32305, j)), (int) Math.min(4096, Math.max(c10077.f32303, j2)), (int) Math.min(10000, Math.max(c10077.f32307, j3)), j > 65536 || j2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || j3 > 10000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36973(C9007 c9007) throws C10186 {
        m36994(c9007);
        if (!c9007.f29351) {
            return m36992();
        }
        return JSON.object().add("sectionName", c9007.f29342).add("virtualAddress", m36982(c9007.f29349)).add("fileOffset", m36982(c9007.f29344)).add("rangeOffset", m36982(c9007.f29347)).add("size", c9007.f29353).add("isLoaded", c9007.f29348).add("isExecutable", c9007.f29350).add("segment", c9007.f29346);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36992() {
        JSONObject jSONObjectAdd = JSON.object().add("sectionName", "");
        JSONValue jSONValue = JSON.NULL;
        return jSONObjectAdd.add("virtualAddress", jSONValue).add("fileOffset", jSONValue).add("rangeOffset", jSONValue).add("size", 0).add("isLoaded", false).add("isExecutable", false).add("segment", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36981(boolean z, String str, int i, int i2, Long l2) {
        return JSON.object().add("hasMore", z).add("nextCursor", str == null ? JSON.NULL : JSON.value(str)).add("returnedCount", i).add("limitMax", i2).add("totalAvailableCount", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m36982(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value(C11218.m28261(j));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36997() {
        return C10932.m27734("Result for mt_apk_native_map_address. ELF address mapping. Check found, mapping.isLoaded, and mapping.isExecutable before following an address. enclosingSymbol is best-effort context.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex.")).add("found", C10932.m27740(ClassTransform.BOOLEAN, "For virtual input, whether the address is in a loaded file-backed ELF range; virtual-only runtime bytes can still miss. For file_offset input, whether SO file bytes contain the offset. Check mapping.isLoaded before treating the mapped address as loaded at runtime.")).add("mapping", C10932.m27731(m36996().add("enclosingSymbol", C22783.m51386(JSON.object().add("found", C10932.m27740(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol contains the mapped virtual address.")).add("name", C10932.m27740("string", "Raw ELF symbol name, or empty string when not found.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled symbol name when available and different from name, otherwise empty string.")).add("instructionMode", C10932.m27740("string", "Best-effort mode hint for mt_apk_native_disassemble or mt_apk_native_analyze_control_flow: auto, arm, thumb, unknown, or empty string when not found. unknown is not a valid tool input; try thumb and arm separately.")).add("startVirtualAddress", C10932.m27743("string", "Symbol start virtual address, or null.")).add("startFileOffset", C10932.m27743("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C10932.m27743("string", "Offset from startVirtualAddress to the mapped virtual address, or null.")), "integer", "Symbol size in bytes, or 0 when not found.", "size", "Best-effort non-imported sized ELF symbol that contains mapping.virtualAddress. It may be a function or another symbol type, and does not guarantee exact function boundaries. When mapping.isExecutable=true and startVirtualAddress is not null, copy startVirtualAddress to mt_apk_native_analyze_control_flow.address and choose outputMode=summary for triage or outputMode=full when detail arrays are needed. instructionMode is only a follow-up hint: auto, arm, and thumb can be copied to mt_apk_native_disassemble or mt_apk_native_analyze_control_flow; unknown means try thumb and arm separately, and empty string means no hint is available.")), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable. enclosingSymbol is best-effort and uses only non-imported sized ELF symbols; enclosingSymbol.found=false may mean stripped symbols, missing symbol sizes, or unavailable symbol metadata, not that no function contains the address. enclosingSymbol.instructionMode is a best-effort follow-up hint, not proof of the symbol's real instruction state.")), "Address mapping result."), C10932.m27741(C10932.m27731(JSON.object(), "No tool-specific diagnostics.")), C10932.m27733("mt_apk_native_map_address nextActions is intentionally empty."));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m37000() {
        return C10932.m27734("Result for mt_apk_native_disassemble. An instruction window in disassemblyText with address, mode, boundary, and continuation metadata. Check incompleteInstructionAtEnd before interpreting trailing bytes.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C10932.m27740("string", "Requested instruction mode.")).add("stopAtSymbolBoundary", C10932.m27740(ClassTransform.BOOLEAN, "Whether this window should use the containing best-effort sized ELF symbol end as an upper bound when available.")).add("resolvedInstructionMode", C10932.m27740("string", "Resolved instruction mode; copy to mt_apk_native_patch_instructions.instructionMode when editing this window.")).add("effectiveAddress", C10932.m27743("string", "Effective virtual address; copy to mt_apk_native_patch_instructions.address with addressKind=virtual when editing this window.")).add("mapping", C10932.m27731(m36996(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("symbolBoundary", C22783.m51386(JSON.object().add("requested", C10932.m27740(ClassTransform.BOOLEAN, "Whether stopAtSymbolBoundary was requested.")).add("applied", C10932.m27740(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol end is available as an upper bound for this disassembly view.")).add("endReached", C10932.m27740(ClassTransform.BOOLEAN, "Whether bytesConsumed reaches endVirtualAddressExclusive in this response.")).add("name", C10932.m27740("string", "Raw ELF symbol name when applied, otherwise empty string.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled symbol name when applied and available, otherwise empty string.")).add("startVirtualAddress", C10932.m27743("string", "Symbol start virtual address, or null.")).add("endVirtualAddressExclusive", C10932.m27743("string", "Symbol end address, the first address after this symbol, or null.")).add("offset", C10932.m27743("string", "Offset from startVirtualAddress to data.effectiveAddress, or null.")), "integer", "Symbol size in bytes, or 0 when not applied.", "size", "Best-effort disassembly stop boundary. applied=true means a symbol end address is available as an upper bound for this view; maxBytes or maxInstructions may still stop the response earlier. Disassembly never crosses endVirtualAddressExclusive when applied=true. endReached=true only means this response consumed bytes up to that end address, not that a full function was disassembled.")).add("arch", C10932.m27740("string", "Architecture used for disassembly.")).add("archBits", C10932.m27740("integer", "ELF class/ABI bit width; ARM32 stays 32 even when decoding Thumb instructions.")).add("instructionSet", C10932.m27740("string", "Instruction set used for this disassembly: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C10932.m27740("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("bytesRead", C10932.m27740("integer", "Logical byte window length exposed for this response, capped by maxBytes and the current mapping or applied symbol boundary.")).add("bytesConsumed", C10932.m27740("integer", "Bytes represented by disassemblyText.")).add("incompleteInstructionAtEnd", C10932.m27740(ClassTransform.BOOLEAN, "Whether the byte window ended with leftover bytes that are too short to form one complete instruction. These leftover bytes are not counted in bytesConsumed; retry the same address with a larger maxBytes instead of treating this as invalid code.")).add("disassemblyText", C10932.m27740("string", "Compact instruction text. Each line is \"0x<hex-address>: <hex-bytes> <assembly>\"; addresses include the 0x prefix and can be copied directly with addressKind=virtual, addresses have no leading zero padding. Lines have no indentation and use one space between columns. Machine bytes are contiguous lowercase hex in original byte order, ready to concatenate into expectedHex. The address is the effective virtual address, not the input file offset or original odd Thumb address.")).add("instructionCount", C10932.m27740("integer", "Instruction count represented in disassemblyText.")).add("hasMore", C10932.m27740(ClassTransform.BOOLEAN, "Whether another contiguous window is available.")).add("nextAddressKind", C10932.m27743("string", "Value to pass as addressKind on the next mt_apk_native_disassemble call, or null.")).add("nextAddress", C10932.m27743("string", "Value to pass as address on the next mt_apk_native_disassemble call, or null.")).add("nextInstructionMode", C10932.m27743("string", "Value to pass as instructionMode on the next mt_apk_native_disassemble call, or null.")), "Disassembly result."), C10932.m27741(C10932.m27731(m36969("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_disassemble errors; diagnostics is null for unrelated argument or runtime errors.")), C10932.m27737("When data.hasMore=true, a purpose=continue action calls mt_apk_native_disassemble with complete arguments for the next window; otherwise success has no actions. ARM32 instructionMode errors may return mt_apk_native_disassemble retry actions; copy those arguments directly. Follow each action's tool and purpose, not mt_apk_continue. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C10932.m27732(C16237.m38546(), "mt_apk_native_disassemble", "continue"), C10932.m27732(C16237.m38546(), "mt_apk_native_disassemble", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static JSONObject m37004() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex; odd ARM32 virtual input keeps the Thumb T-bit here.")).add("instructionMode", C10932.m27740("string", "Requested instruction mode.")).add("outputMode", C10932.m27738("Requested output mode: full or summary.", "full", ErrorBundle.SUMMARY_ENTRY)).add("detailOmitted", C10932.m27740(ClassTransform.BOOLEAN, "true only when outputMode=summary; blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while observed counts remain populated.")).add("resolvedInstructionMode", C10932.m27740("string", "Instruction mode used to decode this CFG.")).add("effectiveAddress", C10932.m27740("string", "Mapped virtual address for the request; ARM32 Thumb clears the T-bit.")).add("mapping", C10932.m27731(m36996(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C10932.m27740("string", "Architecture used for CFG decoding.")).add("archBits", C10932.m27740("integer", "ELF class/ABI bit width; ARM32 stays 32 for Thumb CFGs.")).add("instructionSet", C10932.m27740("string", "Instruction set used for this graph: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C10932.m27740("string", "Instruction width category: mixed16_32, fixed32, or variable.")).add("function", C22783.m51386(JSON.object().add("startVirtualAddress", C10932.m27740("string", "Function candidate start virtual address as lowercase 0x hex.")).add("startFileOffset", C10932.m27740("string", "Function candidate start ELF file offset as lowercase 0x hex.")).add("name", C10932.m27740("string", "Raw ELF symbol name, or empty string for requested_address fallback.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled name when available, otherwise empty string.")).add("symbolSize", C10932.m27740("integer", "Sized symbol byte length, or 0 for requested_address fallback.")).add("startSource", C10932.m27738("How the start was selected.", "function_symbol", "executable_symbol", "requested_address")).add("boundarySource", C10932.m27738("How the exclusive end boundary was selected.", "function_symbol", "executable_symbol", "executable_mapping")), "string", "Exclusive function boundary end as lowercase 0x hex.", "boundaryEndVirtualAddress", "Selected function candidate and exclusive analysis boundary. Symbol-based boundaries are best-effort ELF metadata; requested_address falls back to the initial executable mapping.")).add("blocks", C22121.m50076("type", "array", "description", "Basic-block details sorted by virtual address. In outputMode=full, this array contains the observed blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.blockCount for the observed count. assemblyText is compact factual disassembly without machine bytes; each line is 0xaddress: mnemonic operands.").add("items", C22783.m51386(JSON.object().add("startVirtualAddress", C10932.m27740("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C10932.m27740("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C10932.m27740("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C10932.m27740("integer", "Instruction lines in assemblyText.")).add("terminator", C10932.m27738("How this block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")), "string", "One line per instruction in the form 0xaddress: mnemonic operands; no machine bytes.", "assemblyText", "One returned basic block."))).add("edges", C22121.m50076("type", "array", "description", "Confirmed direct edge details. In outputMode=full, both endpoints are block starts present in blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.edgeCount for the observed count. Calls are not CFG edges.").add("items", C10932.m27731(JSON.object().add("fromVirtualAddress", C10932.m27740("string", "Source block start as lowercase 0x hex.")).add("toVirtualAddress", C10932.m27740("string", "Target block start as lowercase 0x hex.")).add("kind", C10932.m27738("Edge kind.", "fallthrough", "branch_true", "branch_false", "jump")), "One direct block edge."))).add("externalFlows", C22121.m50076("type", "array", "description", "Known direct exit details from the selected function. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.externalFlowCount for the observed count. These are expected exits and do not make controlFlowComplete false.").add("items", C10932.m27731(JSON.object().add("sourceVirtualAddress", C10932.m27740("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C10932.m27738("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C10932.m27740("string", "Known external target as lowercase 0x hex.")).add("reason", C10932.m27738("Why this target was not followed.", "outside_function_boundary", "other_function_symbol")), "One known external flow.")));
        JSONObject jSONObjectM27731 = C10932.m27731(JSON.object().add("sourceVirtualAddress", C10932.m27740("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C10932.m27738("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C10932.m27740("string", "Known target address as lowercase 0x hex.")).add("reason", C10932.m27738("Why the target was unresolved.", "target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction")), "Known target that could not become a returned block.");
        return C10932.m27734("Result for mt_apk_native_analyze_control_flow. A bounded function graph or summary. Read analysisSummary for completeness. Shape hints describe only the observed subgraph. Retry results replace the previous graph; never merge them.", C10932.m27731(jSONObjectAdd.add("unresolvedFlows", C22121.m50076("type", "array", "description", "Details for control-flow paths not converted into confirmed block edges. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.unresolvedFlowCount and observedGraphSummary.unresolvedReasonCounts for observed totals and reason counts. Read analysisSummary.completionReason before retrying or drawing conclusions.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM27731).add(C10932.m27731(JSON.object().add("sourceVirtualAddress", C10932.m27740("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C10932.m27735("indirect_jump", "Indirect jump flow.")).add("reason", C10932.m27735("indirect_target", "The target is not statically known.")), "Indirect jump whose target was not statically known.")).add(C10932.m27731(JSON.object().add("sourceVirtualAddress", C10932.m27740("string", "Function candidate start as lowercase 0x hex.")).add("flowKind", C10932.m27735("decode", "Entry decode flow.")).add("reason", C10932.m27735("invalid_instruction", "The entry instruction could not be decoded.")), "Function entry could not be decoded."))))).add("analysisSummary", C22783.m51386(JSON.object().add("controlFlowComplete", C10932.m27740(ClassTransform.BOOLEAN, "Whether all statically resolvable direct flow inside the selected boundary was explored with no unresolved flows.")).add("completionReason", C10932.m27738("Primary completion reason in fixed priority order.", "complete", "max_analysis_bytes_reached", "max_blocks_reached", "max_instructions_reached", "invalid_instruction", "unresolved_indirect_flow", "invalid_control_flow_target")).add("meaning", C10932.m27740("string", "Stable explanation of completionReason and retry semantics.")).add("bytesAnalyzed", C10932.m27740("integer", "Unique successfully decoded instruction bytes.")), "integer", "Unique successfully decoded instructions.", "instructionsAnalyzed", "CFG completeness and budget usage. controlFlowComplete is true only when completionReason=complete and observedGraphSummary.unresolvedFlowCount=0. Read observedGraphSummary for counts in both output modes. Budget retry results replace this graph and must not be merged; a budget reason without a retry action means its limiting budget is already at the public limit.")).add("observedGraphSummary", C10932.m27731(JSON.object().add("blockCount", C10932.m27740("integer", "Observed basic-block count; this can be lower than the consumed candidate budget.")).add("edgeCount", C10932.m27740("integer", "Observed confirmed direct edge count.")).add("externalFlowCount", C10932.m27740("integer", "Observed known external flow count.")).add("unresolvedFlowCount", C10932.m27740("integer", "Observed unresolved flow count.")).add("terminatorCounts", C22783.m51386(JSON.object().add("fallthrough", C10932.m27740("integer", "Observed fallthrough terminator count.")).add("conditional_jump", C10932.m27740("integer", "Observed conditional_jump terminator count.")).add("jump", C10932.m27740("integer", "Observed jump terminator count.")).add("indirect_jump", C10932.m27740("integer", "Observed indirect_jump terminator count.")).add("return", C10932.m27740("integer", "Observed return terminator count.")).add("trap", C10932.m27740("integer", "Observed trap terminator count.")).add("invalid", C10932.m27740("integer", "Observed invalid terminator count.")), "integer", "Observed budget_boundary terminator count.", "budget_boundary", "Observed basic-block terminator counts; all fields are present and 0 means no observed block used that terminator.")).add("unresolvedReasonCounts", C22783.m51386(JSON.object().add("target_not_executable", C10932.m27740("integer", "Observed target_not_executable count.")).add("unaligned_or_overlapping_target", C10932.m27740("integer", "Observed unaligned_or_overlapping_target count.")).add("instruction_mode_transition", C10932.m27740("integer", "Observed instruction_mode_transition count.")).add("max_blocks_reached", C10932.m27740("integer", "Observed max_blocks_reached count.")).add("max_analysis_bytes_reached", C10932.m27740("integer", "Observed max_analysis_bytes_reached count.")).add("max_instructions_reached", C10932.m27740("integer", "Observed max_instructions_reached count.")).add("invalid_instruction", C10932.m27740("integer", "Observed invalid_instruction count.")), "integer", "Observed indirect_target count.", "indirect_target", "Observed unresolved-flow reason counts; all fields are present and 0 means no observed unresolved flow used that reason.")).add("observedShapeHints", C10932.m27742("Conservative observed-only hints. Values may include observed_linear, observed_branchy, and observed_dispatcher_like. Empty array means no hint matched.")), "Observed CFG summary for the subgraph analyzed in this call. Counts remain populated in both output modes. In summary mode, the four detail array fields remain present but empty, so use these counts instead of their lengths. observedShapeHints are conservative hints about the observed subgraph only.")).add("entryPreview", C10932.m27731(JSON.object().add("available", C10932.m27740(ClassTransform.BOOLEAN, "Whether an entry or fallback first block was available.")).add("startVirtualAddress", C10932.m27743("string", "Preview block start address, or null when unavailable.")).add("lines", C10932.m27742("At most 16 original assemblyText lines from the entry or fallback first block.")), "Preview of the entry block assemblyText.")).add("notableBlocks", C22121.m50076("type", "array", "description", "At most 8 representative observed blocks for summary triage, with assemblyText previews.").add("items", C10932.m27731(JSON.object().add("startVirtualAddress", C10932.m27743("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C10932.m27743("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C10932.m27740("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C10932.m27740("integer", "Instruction count reported for the full block.")).add("terminator", C10932.m27738("How this observed block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")).add("previewLines", C10932.m27742("At most 4 original assemblyText lines from this block.")), "One observed notable block preview."))), "Function-local direct static CFG result. Read analysisSummary before treating this graph as complete; a budget retry replaces this result rather than extending it."), C10932.m27741(C10932.m27731(m36969("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_analyze_control_flow errors; diagnostics is null for unrelated argument or runtime errors.")), C10932.m27737("Budget or ARM32 mode errors may return mt_apk_native_analyze_control_flow retry actions. A retry result replaces the previous graph and must not be merged. When no larger CFG retry is available, mt_apk_native_disassemble may inspect a local instruction window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open.", C10932.m27732(C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C10932.m27740("string", "ZIP entry locator for the native ELF.")).add("addressKind", C10932.m27738("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C10932.m27740("string", "Unsigned address string for a function symbol or an address inside the function candidate.")).add("instructionMode", C10932.m27738("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("outputMode", C10932.m27738("Output mode: full populates graph detail arrays; summary keeps the required detail arrays present but empty while observed counts remain populated.", "full", ErrorBundle.SUMMARY_ENTRY)).add("maxAnalysisBytes", C10932.m27740("integer", "Unique successfully decoded instruction-byte budget.")).add("maxBlocks", C10932.m27740("integer", "Candidate basic-block start budget.")), "integer", "Unique successfully decoded instruction budget.", "maxInstructions", "Arguments for mt_apk_native_analyze_control_flow."), "mt_apk_native_analyze_control_flow", "retry"), C10932.m27732(C16237.m38546(), "mt_apk_native_disassemble", "inspect"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36991() {
        JSONObject jSONObjectM51386 = C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id that was modified.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed input address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex. ARM32 odd Thumb virtual input keeps bit0 here.")).add("instructionMode", C10932.m27740("string", "Requested instruction mode.")).add("resolvedInstructionMode", C10932.m27740("string", "Resolved instruction mode used for assembly and follow-up disassembly.")).add("effectiveAddress", C10932.m27743("string", "Effective virtual address used for mapping and assembly. Thumb virtual input clears the T-bit here.")).add("mapping", C10932.m27731(m36996(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C10932.m27740("string", "Architecture passed to the assembler.")).add("archBits", C10932.m27740("integer", "ELF class/ABI bit width; ARM32 stays 32 even when patching Thumb instructions.")).add("instructionSet", C10932.m27740("string", "Instruction set used for this patch: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C10932.m27740("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("patchedVirtualAddress", C10932.m27743("string", "Virtual address actually patched. This equals effectiveAddress and never includes the ARM Thumb T-bit.")).add("patchedFileOffset", C10932.m27743("string", "ELF file offset inside the zip_entry bytes that was patched.")).add("bytesPatched", C10932.m27740("integer", "Final equal-length byte count written to the edit session.")).add("expectedHex", C10932.m27740("string", "Expected bytes that were verified before writing, uppercase hex without spaces.")).add("assembledHex", C10932.m27740("string", "Raw bytes produced by the assembler before optional NOP padding, uppercase hex without spaces.")).add("afterHex", C10932.m27740("string", "Final bytes written after optional NOP padding, uppercase hex without spaces.")).add("paddingMode", C10932.m27740("string", "Padding mode used for this patch: none or nop.")), "integer", "Number of NOP padding bytes appended to assembledHex before writing.", "nopBytesInserted", "Native instruction patch result.");
        JSONObject jSONObjectM36969 = m36969("Stable instruction-mode reason token for retryable ARM32 patch errors. Empty string means this is not an instruction-mode retry error; ignore addressModeHint and retryInstructionModes and inspect the other diagnostics fields instead.", "Fixed ARM32 address hint string. Empty string means this is not an instruction-mode retry error.");
        jSONObjectM36969.add("patchedFileOffset", C10932.m27743("string", "Patch ELF file offset for expectedHex mismatch, or null.")).add("expectedHex", C10932.m27743("string", "Expected uppercase hex for a stale guard mismatch, or null.")).add("actualHex", C10932.m27743("string", "Actual uppercase hex read from the current edit session view, or null.")).add("expectedBytes", C10932.m27743("integer", "Patch window byte count for length errors, or null.")).add("assembledBytes", C10932.m27743("integer", "Assembler output byte count for length errors, or null.")).add("paddingMode", C10932.m27743("string", "Requested padding mode for length errors, or null.")).add("remainingBytes", C10932.m27743("integer", "Bytes left to fill when NOP padding is unavailable, or null.")).add("instructionSet", C10932.m27743("string", "Instruction set for NOP padding diagnostics, or null.")).add("instructionWidth", C10932.m27743("string", "Instruction width for NOP padding diagnostics, or null.")).add("arch", C10932.m27743("string", "Assembler architecture for assembly failures, or null.")).add("bits", C10932.m27743("integer", "Assembler bit width for assembly failures, or null.")).add("message", C10932.m27743("string", "Sanitized assembler failure message, or null."));
        return C10932.m27734("Result for mt_apk_native_patch_instructions. Verified instruction replacement. assembledHex contains assembled bytes; afterHex includes any NOP padding. Use nextActions for read-back or error recovery.", jSONObjectM51386, C10932.m27741(C10932.m27731(jSONObjectM36969, "native_patch_instructions diagnostics. diagnostics is null for unrelated argument errors. The instruction-mode fields reason, addressModeHint, and retryInstructionModes apply only to ARM32 retry errors; when reason is empty, ignore those fields and use expectedHex/actualHex, expectedBytes/assembledBytes, remainingBytes, or message to decide the next step.")), C10932.m27737("Successful native instruction patch returns disassemble and read_bytes verification actions. ARM32 instructionMode errors may return native patch retry actions; stale expectedHex errors may return read_bytes recovery. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C10932.m27732(C16237.m38546(), "mt_apk_native_disassemble", "inspect"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "inspect"), C10932.m27732(C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Non-empty edit session id returned by mt_apk_session_create.")).add("locator", C10932.m27740("string", "ZIP entry locator for the native ELF.")).add("addressKind", C10932.m27738("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C10932.m27740("string", "Unsigned target address string copied from the failed request. The effective address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit.")).add("instructionMode", C10932.m27738("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("expectedHex", C10932.m27740("string", "Stale-view guard bytes for the patch window. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it or use replacement bytes.")).add("replacementAssembly", C10932.m27740("string", "Assembly source text containing instructions and labels only, not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly.")).add("paddingMode", C10932.m27738("Padding mode: none or nop.", "none", "nop")), "Arguments for mt_apk_native_patch_instructions."), "mt_apk_native_patch_instructions", "retry"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m36963() {
        return C10932.m27734("Result for mt_apk_native_patch_string. String patch result. beforeHex and afterHex cover the full byte window including padding or a final NUL. Use nextActions to verify the result.", C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id that was modified.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed input address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex.")).add("effectiveAddress", C10932.m27743("string", "Mapped virtual address used for context, or null when file_offset input is not mapped.")).add("mapping", C10932.m27731(m36996(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("patchedFileOffset", C10932.m27743("string", "Patched SO file offset inside the zip_entry bytes as lowercase 0x hex. Use nextActions[].arguments.byteOffset for decimal mt_apk_read_bytes input.")).add("textEncoding", C10932.m27740("string", "Always utf8; this is not an input option.")).add("expectedTextByteCount", C10932.m27740("integer", "UTF-8 byte count of expectedText.")).add("replacementTextByteCount", C10932.m27740("integer", "UTF-8 byte count of replacementText.")).add("extraPaddingBytesConsumed", C10932.m27740("integer", "Extra padding bytes consumed after expectedText when replacementText is longer; 0 when equal or shorter.")).add("terminatorPreserved", C10932.m27740(ClassTransform.BOOLEAN, "true only for successful null_pad patches; false for none and space_pad.")).add("bytesPatched", C10932.m27740("integer", "Complete patch window byte count, not actual changed byte count.")).add("beforeHex", C10932.m27740("string", "Complete bytes verified before writing, uppercase hex. Includes padding or final NUL when applicable.")).add("afterHex", C10932.m27740("string", "Complete bytes written, uppercase hex. Includes padding or final NUL when applicable.")), "string", "Padding mode used for this patch: none, null_pad, or space_pad.", "paddingMode", "Native UTF-8 string patch result."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string when unavailable.")).add("locator", C10932.m27740("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C10932.m27740("string", "Requested address kind, or empty string when unavailable.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("patchedFileOffset", C10932.m27743("string", "Patched SO file offset as lowercase 0x hex, or null.")).add("paddingMode", C10932.m27743("string", "Requested padding mode, or null.")).add("expectedText", C10932.m27743("string", "Expected UTF-8 text stale guard, or null.")).add("actualText", C10932.m27743("string", "Best-effort readable actual text prefix, or null. The exact bytes are in actualHex.")).add("expectedHex", C10932.m27743("string", "Expected full patch window bytes as uppercase hex, or null.")).add("actualHex", C10932.m27743("string", "Actual current bytes as uppercase hex, or null.")).add("expectedTextByteCount", C10932.m27743("integer", "UTF-8 byte count of expectedText, or null.")).add("replacementTextByteCount", C10932.m27743("integer", "UTF-8 byte count of replacementText, or null.")).add("requiredPaddingBytes", C10932.m27743("integer", "Padding bytes checked after expectedText, or null.")).add("actualPaddingHex", C10932.m27743("string", "Actual padding/terminator bytes as uppercase hex, or null.")).add("terminatorRequired", C10932.m27743(ClassTransform.BOOLEAN, "Whether null_pad required a final NUL terminator, or null.")).add("bytesPatched", C10932.m27743("integer", "Complete patch window byte count, or null.")).add("limitBytes", C10932.m27743("integer", "Maximum supported patch window bytes, or null.")).add("endByteOffset", C10932.m27743("string", "Exclusive end SO file offset as lowercase 0x hex, or null.")).add("entrySize", C10932.m27743("integer", "SO entry size in bytes, or null.")), "native_patch_string diagnostics. diagnostics is null for unrelated argument errors. actualText is only a readable best-effort prefix; use actualHex as the exact stale-guard fact.")), C10932.m27737("Successful native string patch returns one read_bytes verification action. Stale expectedText or padding errors use a 4096-byte recovery window only for null_pad; space_pad and none stay within the exact observed window because their slot boundary is not self-describing. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "inspect"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36995() {
        return C10932.m27734("Result for mt_apk_native_xref. Direct static references. Read scanSummary before interpreting empty refs or warnings; pagination.hasMore controls continuation. Results are not a complete caller graph.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK.")).add("locator", C10932.m27740("string", "zip_entry locator.")).add("addressKind", C10932.m27740("string", "Parsed input address kind: virtual or file_offset.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C10932.m27740("string", "Requested instruction mode.")).add("resolvedInstructionMode", C10932.m27740("string", "Resolved instruction mode used for scanning source instructions; data-only scans return auto.")).add("scanKind", C10932.m27740("string", "Scan domain used for this page: code, data, or both.")).add("referenceKinds", C10932.m27742("Reference kinds used for this scan, normalized in fixed order. Values are call, jump, data, and unknown; jump covers branch/jump instructions. In data phases only data refs are emitted.")).add("targetMapped", C10932.m27740(ClassTransform.BOOLEAN, "Whether the target has a loaded file-backed mapping usable for this xref scan. false may mean miss, virtual-only address, or mapping.isLoaded=false.")).add("targetVirtualAddress", C10932.m27743("string", "Mapped target virtual address when targetMapped=true, otherwise null. ARM32 odd virtual input clears bit0 only for an executable mapping; a loaded non-executable odd target stays exact. Executable ARM32 targets may still match odd Thumb function pointers when this value is even.")).add("targetFileOffset", C10932.m27743("string", "Mapped target ELF file offset within the zip_entry bytes when targetMapped=true, otherwise null.")).add("mapping", C10932.m27731(m36996(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C10932.m27740("string", "Architecture used for scanning.")).add("archBits", C10932.m27740("integer", "ELF class/ABI bit width; ARM32 stays 32 even when scanning Thumb instructions.")).add("instructionSet", C10932.m27740("string", "Instruction set used for source instructions: thumb, arm, aarch64, x86, or x86_64; data-only scans return an empty string.")).add("instructionWidth", C10932.m27740("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86; data-only scans return an empty string.")).add("refs", C22121.m50076("type", "array", "description", "Best-effort direct static references found on this page after applying data.scanKind and data.referenceKinds. Use data.scanSummary.reason, data.scanSummary.meaning, and data.scanSummary.completionReason to interpret empty refs; read data.scanSummary.warningCode and data.scanSummary.warning before trusting low-address instruction data refs. Do not treat empty refs alone as proof that no matching reference exists.").add("items", C22783.m51386(JSON.object().add("sourceVirtualAddress", C10932.m27743("string", "Source virtual address.")).add("sourceFileOffset", C10932.m27743("string", "Source ELF file offset within the zip_entry bytes; convert this 0x hex string to a decimal byteOffset before calling mt_apk_read_bytes.")).add("sourceKind", C10932.m27740("string", "Source kind: instruction, data_relocation, or data_pointer.")).add("sourceSize", C10932.m27740("integer", "Source byte size represented by bytes: instruction size for sourceKind=instruction, or data slot size for data_relocation/data_pointer.")).add("sourceSymbol", C10932.m27739(C10932.m27731(JSON.object().add("name", C10932.m27740("string", "Raw ELF symbol name.")).add("demangledName", C10932.m27740("string", "Best-effort C++ demangled name when available and different from name, otherwise empty string.")).add("startVirtualAddress", C10932.m27740("string", "Symbol start virtual address as a lowercase 0x hex string.")).add("startFileOffset", C10932.m27743("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C10932.m27740("string", "Offset from startVirtualAddress to this ref source address as a lowercase 0x hex string.")).add("size", C10932.m27740("integer", "Symbol size in bytes; this is best-effort metadata, not proof of an exact function boundary.")), "Best-effort non-imported sized ELF symbol containing this ref source address. null means no safe symbol context is available; stripped or malformed symbol metadata can cause null. For sourceKind=instruction, use startVirtualAddress with mt_apk_native_analyze_control_flow, copy xref data.resolvedInstructionMode to preserve ARM32 source mode, and choose outputMode=summary for triage or outputMode=full for detail arrays; use mt_apk_native_disassemble for exact bytes. For data sources, this is owner context for the slot or pointer, not a CFG function entry or caller relationship."))).add("bytes", C10932.m27740("string", "Source bytes as lowercase hex.")).add(TextBundle.TEXT_ENTRY, C10932.m27740("string", "Disassembled instruction text, relocation summary, or data pointer text, truncated to 512 characters.")), "string", "Reference kind: call, jump, data, or unknown. jump covers branch/jump instructions.", "referenceKind", "Native xref item."))).add("scannedBytes", C10932.m27740("integer", "Code/data-pointer bytes scanned on this page; relocation item scanning is not counted here and uses its own per-page budget.")).add("scanComplete", C10932.m27740(ClassTransform.BOOLEAN, "Whether this xref request has no more pages. Prefer data.scanSummary.reason, meaning, and completionReason to interpret empty refs and progress.")).add("scanSummary", C22783.m51386(JSON.object().add("reason", C10932.m27740("string", "Stable reason token: target_not_mapped, refs_found, scan_incomplete, or no_refs_found.")).add("meaning", C10932.m27740("string", "Short explanation of this page and whether to continue.")).add("completionReason", C10932.m27740("string", "Stable page-stop token: target_not_mapped, result_limit_reached, scan_budget_exhausted, relocation_page_budget_exhausted, or scan_space_exhausted.")).add("warningCode", C10932.m27740("string", "Stable warning token, or empty string when no warning applies. low_address_instruction_data_reference_noise means code/both instruction data refs may match ordinary immediates.")), "string", "Short warning text, or empty string when no warning applies.", "warning", "Stable explanation of this native xref page. reason is one of target_not_mapped, refs_found, scan_incomplete, or no_refs_found. completionReason explains why this page stopped: target_not_mapped means no scan ran; result_limit_reached means this page stopped after returning limit refs; scan_budget_exhausted means this page used maxScanBytes and can continue; relocation_page_budget_exhausted means this page used the relocation item page budget and can continue; scan_space_exhausted means the selected direct-reference scan space is exhausted, but it is not proof of a complete caller graph. data.scanSummary.warningCode and data.scanSummary.warning are empty unless this request has a known AI interpretation risk. Read meaning before treating empty refs as no references.")).add("pagination", C10932.m27736("Number of refs returned on this page.", "Maximum limit accepted by mt_apk_continue for later native xref pages.", "Always null for native xref because the tool does not pre-scan the whole SO; null means unknown, not zero. Use hasMore only as the continuation signal; use data.scanSummary to interpret scan meaning.")), "Native xref scan result."), C10932.m27741(C10932.m27731(m36969("Stable reason token: arm32_mode_required or data_scan_requires_auto.", "Fixed hint string: ARM32 file/even address does not identify ARM or Thumb, data scan does not decode instructions, odd target virtual address does not identify source instruction mode, or empty string when no mode hint is available.").add("scanKind", C10932.m27740("string", "Requested scan kind, or empty string when unavailable.")).add("referenceKinds", C10932.m27742("Requested reference kinds, or empty when unavailable.")), "Instruction mode diagnostics for ARM32/data-scan mt_apk_native_xref errors; diagnostics is null for unrelated argument or runtime errors.")), C10932.m27737("Success continuation uses mt_apk_continue when data.pagination.hasMore=true. ARM32 or data-scan instructionMode errors may return mt_apk_native_xref retry actions; copy those arguments directly. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue"), C10932.m27732(C22783.m51386(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id.")).add("editSessionId", C10932.m27740("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C10932.m27740("string", "ZIP entry locator for the native ELF.")).add("addressKind", C10932.m27738("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C10932.m27740("string", "Unsigned target address string copied from the failed request.")).add("instructionMode", C10932.m27738("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("scanKind", C10932.m27738("Scan domain: code, data, or both.", "code", e.m, "both")).add("referenceKinds", C22121.m50076("type", "array", "description", "Reference kinds to return.").add("items", C10932.m27738("Reference kind.", "call", "jump", e.m, "unknown"))).add("maxScanBytes", C10932.m27740("integer", "Maximum code/data-pointer bytes to consume on this xref page.")), "integer", "Maximum refs to return on this page.", "limit", "Arguments for mt_apk_native_xref."), "mt_apk_native_xref", "retry"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m36969(String str, String str2) {
        return JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C10932.m27740("string", "Edit session id, or empty string for base APK or unavailable context.")).add("locator", C10932.m27740("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C10932.m27740("string", "Requested address kind, or empty string when unavailable.")).add("address", C10932.m27740("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("instructionMode", C10932.m27740("string", "Requested instruction mode, or empty string when unavailable.")).add("reason", C10932.m27740("string", str)).add("addressModeHint", C10932.m27740("string", str2)).add("retryInstructionModes", C10932.m27742("Instruction modes corresponding one-to-one with root nextActions retry actions, in the same order. Empty when no retry action is available."));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m36996() {
        return JSON.object().add("sectionName", C10932.m27740("string", "Section or segment name, or empty string on miss.")).add("virtualAddress", C10932.m27743("string", "Mapped virtual address, or null.")).add("fileOffset", C10932.m27743("string", "Mapped ELF file offset within the zip_entry bytes, or null.")).add("rangeOffset", C10932.m27743("string", "Offset inside mapped range, or null.")).add("size", C10932.m27740("integer", "Mapped range size, or 0 on miss.")).add("isLoaded", C10932.m27740(ClassTransform.BOOLEAN, "Whether this file-backed mapping belongs to a loaded ELF range. false means do not treat it as a runtime address; true does not make virtual-only bytes outside file backing mappable.")).add("isExecutable", C10932.m27740(ClassTransform.BOOLEAN, "Whether this loaded mapping is executable; do not disassemble when false.")).add("segment", C10932.m27740(ClassTransform.BOOLEAN, "Whether the mapping came from a segment; this does not mean the address is loaded."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36990(String str, boolean z) {
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
