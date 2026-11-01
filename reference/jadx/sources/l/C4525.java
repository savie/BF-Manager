package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۙ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4525 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f16107;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f16108;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f16109;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f16110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f16111;

    public C4525() {
        throw null;
    }

    public C4525(String str, String str2, HashMap map, HashMap map2, Map map3) {
        this.f16109 = str;
        this.f16107 = str2;
        this.f16110 = AbstractC6910.copyOf((Map) map);
        this.f16108 = AbstractC6910.copyOf((Map) map2);
        this.f16111 = map3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12640(StringWriter stringWriter) throws IOException {
        stringWriter.append((CharSequence) this.f16107);
        stringWriter.append(" -> ");
        stringWriter.append((CharSequence) this.f16109);
        stringWriter.append(":\n");
        AbstractC0477 it = this.f16108.values().iterator();
        while (it.hasNext()) {
            C22165 c22165 = (C22165) it.next();
            if (!c22165.m49176()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c22165.toString()).append('\n');
            }
        }
        AbstractC0477 it2 = this.f16110.values().iterator();
        while (it2.hasNext()) {
            C22165 c22166 = (C22165) it2.next();
            if (!c22166.m49176()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c22166.toString()).append('\n');
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = this.f16111.values().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(((C3423) it3.next()).f12633);
        }
        Collections.sort(arrayList, C7618.comparingInt(new C14714()));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            stringWriter.append(ASN1Dump.TAB).append((CharSequence) ((C9775) it4.next()).toString()).append('\n');
        }
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m12640(stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4525)) {
            return false;
        }
        C4525 c4525 = (C4525) obj;
        return this.f16107.equals(c4525.f16107) && this.f16109.equals(c4525.f16109) && this.f16110.equals(c4525.f16110) && this.f16108.equals(c4525.f16108) && this.f16111.equals(c4525.f16111);
    }

    public final int hashCode() {
        return this.f16111.hashCode() + ((this.f16108.hashCode() + ((this.f16110.hashCode() + C13958.m33812(this.f16107.hashCode() * 31, 31, this.f16109)) * 31)) * 31);
    }
}
