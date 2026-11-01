package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.Entry;

/* JADX INFO: renamed from: l.۫ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 17A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12451 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m30925(AbstractC20745 abstractC20745, C7886 c7886, ArrayList arrayList, ArrayList arrayList2) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((C9878) it.next()).f33725);
        }
        if (hashSet.isEmpty()) {
            return new HashMap();
        }
        if (c7886 == null) {
            try {
                return m30924(abstractC20745, hashSet);
            } catch (IOException unused) {
                return new HashMap();
            }
        }
        if (!abstractC20745.m46690("entry_resources.jsonl").mo33971()) {
            m30928(abstractC20745, c7886, arrayList);
        }
        try {
            return m30924(abstractC20745, hashSet);
        } catch (C0455 unused2) {
            m30928(abstractC20745, c7886, arrayList);
            try {
                return m30924(abstractC20745, hashSet);
            } catch (C0455 unused3) {
                return new HashMap();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m30924(AbstractC20745 abstractC20745, HashSet hashSet) throws IOException {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        HashMap map = new HashMap();
        if (hashSet2.isEmpty()) {
            return map;
        }
        BufferedReader bufferedReaderM46734 = abstractC20745.m46690("entry_resources.jsonl").m46734();
        while (true) {
            try {
                String line = bufferedReaderM46734.readLine();
                if (line == null) {
                    break;
                }
                try {
                    JSONObject jSONObject = new JSONObject(line);
                    try {
                        String string = jSONObject.getString(Entry.DEFAULT_NAME, null);
                        try {
                            String string2 = jSONObject.getString("resourceId", null);
                            try {
                                String string3 = jSONObject.getString("resourceName", null);
                                if (string == null || string2 == null || string3 == null) {
                                    throw new C0455("Invalid entry resource cache record");
                                }
                                if (hashSet2.contains(string) && !map.containsKey(string)) {
                                    map.put(string, new C16684(string2, string3));
                                    if (map.size() == hashSet2.size()) {
                                        break;
                                    }
                                }
                            } catch (RuntimeException e) {
                                throw new C0455("Invalid entry resource cache record", e);
                            }
                        } catch (RuntimeException e2) {
                            throw new C0455("Invalid entry resource cache record", e2);
                        }
                    } catch (RuntimeException e3) {
                        throw new C0455("Invalid entry resource cache record", e3);
                    }
                } catch (Exception e4) {
                    throw new C0455("Invalid entry resource cache record", e4);
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM46734.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReaderM46734.close();
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30927(AbstractC20745 abstractC20745, C1493 c1493, HashSet hashSet) {
        abstractC20745.m46739();
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".entry_resources.jsonl.tmp");
        abstractC20745M46690.mo24647();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC20745M46690.mo33976(false), StandardCharsets.UTF_8));
            try {
                m30926(c1493, hashSet, bufferedWriter);
                bufferedWriter.close();
                AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("entry_resources.jsonl");
                abstractC20745M46691.mo24647();
                if (!abstractC20745M46690.mo24646(abstractC20745M46691)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15157.m36345();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC20745M46690.mo24647();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30926(C1493 c1493, HashSet hashSet, BufferedWriter bufferedWriter) throws IOException {
        InterfaceC9961 value;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (InterfaceC17721 interfaceC17721 : c1493.mo17615()) {
            if (hashSet3.add(Integer.valueOf(interfaceC17721.mo19106()))) {
                HashSet hashSet4 = new HashSet();
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (hashSet4.add(Integer.valueOf(interfaceC19133.mo26942()))) {
                        String typeName = interfaceC19133.getTypeName();
                        if (!"string".equals(typeName) && !"array".equals(typeName) && !"plurals".equals(typeName) && !"style".equals(typeName) && !"attr".equals(typeName) && !"id".equals(typeName)) {
                            Iterator it = interfaceC19133.mo25271().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC3609 interfaceC3609 : ((InterfaceC12783) it.next()).mo31746()) {
                                    if (!interfaceC3609.mo7644() && (value = interfaceC3609.getValue()) != null && value.mo25192() == 3 && value.mo25187() != null) {
                                        String value2 = value.mo25187().getValue();
                                        if (!value2.endsWith("/") && hashSet.contains(value2) && hashSet2.add(value2)) {
                                            bufferedWriter.write(JSON.object().add(Entry.DEFAULT_NAME, value2).add("resourceId", C22703.m50274(interfaceC3609.mo10693())).add("resourceName", interfaceC19133.getTypeName() + "/" + interfaceC3609.mo7645()).toString());
                                            bufferedWriter.newLine();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30928(AbstractC20745 abstractC20745, C7886 c7886, Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C9878 c9878 = (C9878) it.next();
            if (!c9878.f33725.endsWith("/")) {
                hashSet.add(c9878.f33725);
            }
        }
        try {
            m30927(abstractC20745, c7886.m20809(), hashSet);
        } catch (RuntimeException | C12731 unused) {
            abstractC20745.m46739();
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".entry_resources.jsonl.tmp");
            abstractC20745M46690.mo24647();
            try {
                new BufferedWriter(new OutputStreamWriter(abstractC20745M46690.mo33976(false), StandardCharsets.UTF_8)).close();
                AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("entry_resources.jsonl");
                abstractC20745M46691.mo24647();
                if (!abstractC20745M46690.mo24646(abstractC20745M46691)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C15157.m36345();
            } catch (Throwable th) {
                abstractC20745M46690.mo24647();
                throw th;
            }
        }
    }
}
