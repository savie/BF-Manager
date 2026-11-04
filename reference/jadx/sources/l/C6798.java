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

/* JADX INFO: renamed from: l.ۜ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C6798 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f22657;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6798 m18980(InputStream inputStream) throws IOException {
        C16732 c16732 = new C16732(new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)));
        try {
            C8289 c8289 = new C8289();
            c16732.m39510(c8289);
            C6798 c6798M22384 = c8289.m22384();
            c16732.close();
            return c6798M22384;
        } catch (Throwable th) {
            try {
                c16732.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C6798(Map map) {
        new HashMap();
        C25049 c25049M41247 = AbstractC17589.m41247();
        for (Map.Entry entry : map.entrySet()) {
            c25049M41247.mo14569((String) entry.getKey(), ((C21954) entry.getValue()).m49682());
        }
        this.f22657 = c25049M41247.mo14570();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m18981() {
        AbstractC17589 abstractC17589 = this.f22657;
        HashMap map = new HashMap(abstractC17589.size());
        AbstractC4516 it = abstractC17589.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put((String) entry.getKey(), ((C19716) entry.getValue()).f63460);
        }
        return map;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ArrayList arrayList = new ArrayList(this.f22657.values());
            Collections.sort(arrayList, C2661.comparing(new C10346(2)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C19716) it.next()).m45410(stringWriter);
            }
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6798) {
            return this.f22657.equals(((C6798) obj).f22657);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22657.hashCode() * 31;
    }
}
