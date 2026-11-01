package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C11186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f37883;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11186 m28126(InputStream inputStream) throws IOException {
        C12993 c12993 = new C12993(new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
        try {
            C6246 c6246 = new C6246();
            c12993.m32135(c6246);
            C11186 c11186M17309 = c6246.m17309();
            c12993.close();
            return c11186M17309;
        } catch (Throwable th) {
            try {
                c12993.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C11186(Map map) {
        new HashMap();
        C13261 c13261M18530 = AbstractC6910.m18530();
        for (Map.Entry entry : ((AbstractC6910) map).entrySet()) {
            c13261M18530.mo32741((String) entry.getKey(), ((C2012) entry.getValue()).m6480());
        }
        this.f37883 = c13261M18530.mo32742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m28127() {
        AbstractC6910 abstractC6910 = this.f37883;
        HashMap map = new HashMap(abstractC6910.size());
        AbstractC0477 it = abstractC6910.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put((String) entry.getKey(), ((C4525) entry.getValue()).f16107);
        }
        return map;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ArrayList arrayList = new ArrayList(this.f37883.values());
            Collections.sort(arrayList, C7618.comparing(new C7459(3)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4525) it.next()).m12640(stringWriter);
            }
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11186) {
            return this.f37883.equals(((C11186) obj).f37883);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37883.hashCode() * 31;
    }
}
