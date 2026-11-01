package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܶ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I16G */
/* JADX INFO: loaded from: classes4.dex */
public final class C14920 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f48697 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35661() {
        return C11904.m29695().m46690("injectionSchemes");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35666() {
        AbstractC20745 abstractC20745M35661 = m35661();
        List<String> listMo33973 = abstractC20745M35661.mo33973();
        ArrayList arrayList = new ArrayList(listMo33973.size());
        for (String str : listMo33973) {
            if (str.toLowerCase().endsWith(".json")) {
                arrayList.add(str.substring(0, str.length() - 5));
            }
        }
        Collections.sort(arrayList);
        if (f48697 && arrayList.isEmpty()) {
            String strM39288 = C16737.m39288(R.string.MT_Protector);
            try {
                abstractC20745M35661.m46690(strM39288 + ".json").m46735("{\"a\":[{\"b\":{\"a\":\"\",\"b\":0,\"c\":1,\"d\":\"\",\"e\":0,\"f\":1,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"Ljava\\/lang\\/String;\",\"k\":0,\"l\":0,\"m\":0,\"n\":0,\"o\":1},\"c\":0,\"d\":0},{\"b\":{\"a\":\"Ljava\\/lang\\/String;\",\"b\":0,\"c\":0,\"d\":\"<init>\",\"e\":0,\"f\":0,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"V\",\"k\":0,\"l\":0,\"m\":0,\"n\":1,\"o\":0},\"c\":1,\"d\":1}]}");
                arrayList.add(strM39288);
            } catch (IOException unused) {
            }
        }
        f48697 = false;
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35668(String str, String str2) {
        AbstractC20745 abstractC20745M46690 = m35661().m46690(str + ".json");
        AbstractC20745 abstractC20745M46691 = m35661().m46690(str2.concat(".json"));
        if (!str.equalsIgnoreCase(str2)) {
            return abstractC20745M46690.mo24646(abstractC20745M46691);
        }
        AbstractC20745 abstractC20745M46733 = abstractC20745M46690.m46733(".tmp");
        return abstractC20745M46690.mo24646(abstractC20745M46733) && abstractC20745M46733.mo24646(abstractC20745M46691);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35663(String str, String str2) throws IOException {
        AbstractC20745 abstractC20745M35661 = m35661();
        abstractC20745M35661.m46690(str + ".json").m46701(abstractC20745M35661.m46690(str2.concat(".json")), (C5222) null, (InterfaceC8978) null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m35660(String str) {
        return C20630.m46498(5, 0, m35661().m46690(str.concat(".json")).m46693(true).getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35662(String str) {
        m35661().m46690(str + ".json").mo24647();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35667(String str) {
        return m35661().m46690(str + ".json").mo33975();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C22681 m35665(String str) {
        AbstractC20745 abstractC20745M46690 = m35661().m46690(str + ".json");
        C22681 c22681 = new C22681(str);
        c22681.m50241(new JSONObject(abstractC20745M46690.m46730()));
        return c22681;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35664(C22681 c22681) {
        m35661().m46690(c22681.f73863 + ".json").m46735(c22681.m50242().toString());
    }
}
