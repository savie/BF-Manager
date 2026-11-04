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

/* JADX INFO: renamed from: l.᩸ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22933 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m51687(AbstractC22044 abstractC22044, C2751 c2751, ArrayList arrayList, ArrayList arrayList2) throws IOException {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((C19291) it.next()).f62362);
        }
        if (hashSet.isEmpty()) {
            return new HashMap();
        }
        if (c2751 == null) {
            try {
                return m51686(abstractC22044, hashSet);
            } catch (IOException unused) {
                return new HashMap();
            }
        }
        if (!abstractC22044.m49876("entry_resources.jsonl").mo4304()) {
            m51688(abstractC22044, c2751, arrayList);
        }
        try {
            return m51686(abstractC22044, hashSet);
        } catch (C22187 unused2) {
            m51688(abstractC22044, c2751, arrayList);
            try {
                return m51686(abstractC22044, hashSet);
            } catch (C22187 unused3) {
                return new HashMap();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m51686(AbstractC22044 abstractC22044, HashSet hashSet) throws IOException {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add((String) it.next());
        }
        HashMap map = new HashMap();
        if (hashSet2.isEmpty()) {
            return map;
        }
        BufferedReader bufferedReaderM49863 = abstractC22044.m49876("entry_resources.jsonl").m49863();
        while (true) {
            try {
                String line = bufferedReaderM49863.readLine();
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
                                    throw new C22187("Invalid entry resource cache record");
                                }
                                if (hashSet2.contains(string) && !map.containsKey(string)) {
                                    map.put(string, new C10998(string2, string3));
                                    if (map.size() == hashSet2.size()) {
                                        break;
                                    }
                                }
                            } catch (RuntimeException e) {
                                throw new C22187("Invalid entry resource cache record", e);
                            }
                        } catch (RuntimeException e2) {
                            throw new C22187("Invalid entry resource cache record", e2);
                        }
                    } catch (RuntimeException e3) {
                        throw new C22187("Invalid entry resource cache record", e3);
                    }
                } catch (Exception e4) {
                    throw new C22187("Invalid entry resource cache record", e4);
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM49863.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReaderM49863.close();
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51689(AbstractC22044 abstractC22044, C24296 c24296, HashSet hashSet) throws IOException {
        abstractC22044.m49853();
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".entry_resources.jsonl.tmp");
        abstractC22044M49876.mo4296();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC22044M49876.mo4289(false), StandardCharsets.UTF_8));
            try {
                m51690(c24296, hashSet, bufferedWriter);
                bufferedWriter.close();
                AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("entry_resources.jsonl");
                abstractC22044M49877.mo4296();
                if (!abstractC22044M49876.mo4301(abstractC22044M49877)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C22099.m50062();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC22044M49876.mo4296();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51690(C24296 c24296, HashSet hashSet, BufferedWriter bufferedWriter) throws IOException {
        InterfaceC5650 value;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (InterfaceC10869 interfaceC10869 : c24296.mo15672()) {
            if (hashSet3.add(Integer.valueOf(interfaceC10869.mo27607()))) {
                HashSet hashSet4 = new HashSet();
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (hashSet4.add(Integer.valueOf(interfaceC15344.mo35833()))) {
                        String typeName = interfaceC15344.getTypeName();
                        if (!"string".equals(typeName) && !"array".equals(typeName) && !"plurals".equals(typeName) && !"style".equals(typeName) && !"attr".equals(typeName) && !"id".equals(typeName)) {
                            Iterator it = interfaceC15344.mo33925().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC8697 interfaceC8697 : ((InterfaceC2731) it.next()).mo9078()) {
                                    if (!interfaceC8697.mo18155() && (value = interfaceC8697.getValue()) != null && value.mo16635() == 3 && value.mo11710() != null) {
                                        String value2 = value.mo11710().getValue();
                                        if (!value2.endsWith("/") && hashSet.contains(value2) && hashSet2.add(value2)) {
                                            bufferedWriter.write(JSON.object().add(Entry.DEFAULT_NAME, value2).add("resourceId", C7972.m21711(interfaceC8697.mo23384())).add("resourceName", interfaceC15344.getTypeName() + "/" + interfaceC8697.mo18156()).toString());
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
    public static void m51688(AbstractC22044 abstractC22044, C2751 c2751, Iterable iterable) throws IOException {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C19291 c19291 = (C19291) it.next();
            if (!c19291.f62362.endsWith("/")) {
                hashSet.add(c19291.f62362);
            }
        }
        try {
            m51689(abstractC22044, c2751.m9101(), hashSet);
        } catch (RuntimeException | C10186 unused) {
            abstractC22044.m49853();
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".entry_resources.jsonl.tmp");
            abstractC22044M49876.mo4296();
            try {
                new BufferedWriter(new OutputStreamWriter(abstractC22044M49876.mo4289(false), StandardCharsets.UTF_8)).close();
                AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("entry_resources.jsonl");
                abstractC22044M49877.mo4296();
                if (!abstractC22044M49876.mo4301(abstractC22044M49877)) {
                    throw new IOException("Failed to publish entry resource cache");
                }
                C22099.m50062();
            } catch (Throwable th) {
                abstractC22044M49876.mo4296();
                throw th;
            }
        }
    }
}
