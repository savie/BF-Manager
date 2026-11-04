package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܺ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I16G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16704 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f53965 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m39462() {
        return C6382.m18134().m49876("injectionSchemes");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m39467() {
        AbstractC22044 abstractC22044M39462 = m39462();
        List<String> listMo4282 = abstractC22044M39462.mo4282();
        ArrayList arrayList = new ArrayList(listMo4282.size());
        for (String str : listMo4282) {
            if (str.toLowerCase().endsWith(".json")) {
                arrayList.add(str.substring(0, str.length() - 5));
            }
        }
        Collections.sort(arrayList);
        if (f53965 && arrayList.isEmpty()) {
            String strM49088 = C21576.m49088(R.string.MT_Protector);
            try {
                abstractC22044M39462.m49876(strM49088 + ".json").m49879("{\"a\":[{\"b\":{\"a\":\"\",\"b\":0,\"c\":1,\"d\":\"\",\"e\":0,\"f\":1,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"Ljava\\/lang\\/String;\",\"k\":0,\"l\":0,\"m\":0,\"n\":0,\"o\":1},\"c\":0,\"d\":0},{\"b\":{\"a\":\"Ljava\\/lang\\/String;\",\"b\":0,\"c\":0,\"d\":\"<init>\",\"e\":0,\"f\":0,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"V\",\"k\":0,\"l\":0,\"m\":0,\"n\":1,\"o\":0},\"c\":1,\"d\":1}]}");
                arrayList.add(strM49088);
            } catch (IOException unused) {
            }
        }
        f53965 = false;
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39469(String str, String str2) {
        AbstractC22044 abstractC22044M49876 = m39462().m49876(str + ".json");
        AbstractC22044 abstractC22044M49877 = m39462().m49876(str2.concat(".json"));
        if (!str.equalsIgnoreCase(str2)) {
            return abstractC22044M49876.mo4301(abstractC22044M49877);
        }
        AbstractC22044 abstractC22044M49862 = abstractC22044M49876.m49862(".tmp");
        return abstractC22044M49876.mo4301(abstractC22044M49862) && abstractC22044M49862.mo4301(abstractC22044M49877);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39464(String str, String str2) throws IOException {
        AbstractC22044 abstractC22044M39462 = m39462();
        abstractC22044M39462.m49876(str + ".json").m49847(abstractC22044M39462.m49876(str2.concat(".json")), (C24523) null, (InterfaceC23711) null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m39470(String str) {
        return C1402.m5124(5, 0, m39462().m49876(str.concat(".json")).m49839(true).getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39463(String str) {
        m39462().m49876(str + ".json").mo4296();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39468(String str) {
        return m39462().m49876(str + ".json").mo2934();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C24910 m39466(String str) {
        AbstractC22044 abstractC22044M49876 = m39462().m49876(str + ".json");
        C24910 c24910 = new C24910(str);
        c24910.m55496(new JSONObject(abstractC22044M49876.m49871()));
        return c24910;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39465(C24910 c24910) {
        m39462().m49876(c24910.f80623 + ".json").m49879(c24910.m55497().toString());
    }
}
