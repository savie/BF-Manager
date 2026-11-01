package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes.dex */
public final class C22586 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f73611;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        f73611 = linkedHashMap;
        linkedHashMap.put("<!--", new C14120());
        linkedHashMap.put("<!", new C12003());
        linkedHashMap.put("<?", new C2829());
        linkedHashMap.put("<", new C5652());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4946 m50094(StringReader stringReader) throws IOException {
        char[] cArr = new char[10];
        stringReader.mark(10);
        stringReader.read(cArr, 0, 10);
        stringReader.reset();
        String strValueOf = String.valueOf(cArr);
        for (Map.Entry entry : f73611.entrySet()) {
            if (strValueOf.startsWith((String) entry.getKey())) {
                AbstractC4946 abstractC4946 = (AbstractC4946) ((Supplier) entry.getValue()).get();
                abstractC4946.m13735(stringReader);
                return abstractC4946;
            }
        }
        C1418 c1418 = new C1418(0);
        c1418.m13735(stringReader);
        return c1418;
    }
}
