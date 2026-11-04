package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f31878;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        f31878 = linkedHashMap;
        linkedHashMap.put("<!--", new C18146());
        linkedHashMap.put("<!", new C0247());
        linkedHashMap.put("<?", new C7705());
        linkedHashMap.put("<", new C18892());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21130 m25772(StringReader stringReader) throws IOException {
        char[] cArr = new char[10];
        stringReader.mark(10);
        stringReader.read(cArr, 0, 10);
        stringReader.reset();
        String strValueOf = String.valueOf(cArr);
        for (Map.Entry entry : f31878.entrySet()) {
            if (strValueOf.startsWith((String) entry.getKey())) {
                AbstractC21130 abstractC21130 = (AbstractC21130) ((Supplier) entry.getValue()).get();
                abstractC21130.m48229(stringReader);
                return abstractC21130;
            }
        }
        C0993 c0993 = new C0993(0);
        c0993.m48229(stringReader);
        return c0993;
    }
}
