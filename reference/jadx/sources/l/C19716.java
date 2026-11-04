package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ᩴۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes5.dex */
public final class C19716 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f63456;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f63457;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f63458;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f63459;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f63460;

    public C19716() {
        throw null;
    }

    public C19716(String str, String str2, HashMap map, HashMap map2, Map map3) {
        this.f63458 = str;
        this.f63460 = str2;
        this.f63457 = AbstractC17589.copyOf((Map) map);
        this.f63456 = AbstractC17589.copyOf((Map) map2);
        this.f63459 = map3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45410(StringWriter stringWriter) throws IOException {
        stringWriter.append((CharSequence) this.f63460);
        stringWriter.append(" -> ");
        stringWriter.append((CharSequence) this.f63458);
        stringWriter.append(":\n");
        AbstractC4516 it = this.f63456.values().iterator();
        while (it.hasNext()) {
            C11511 c11511 = (C11511) it.next();
            if (!c11511.m28967()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c11511.toString()).append('\n');
            }
        }
        AbstractC4516 it2 = this.f63457.values().iterator();
        while (it2.hasNext()) {
            C11511 c11512 = (C11511) it2.next();
            if (!c11512.m28967()) {
                stringWriter.append(ASN1Dump.TAB).append((CharSequence) c11512.toString()).append('\n');
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = this.f63459.values().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(((C22700) it3.next()).f73688);
        }
        Collections.sort(arrayList, C2661.comparingInt(new C4800()));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            stringWriter.append(ASN1Dump.TAB).append((CharSequence) ((C10765) it4.next()).toString()).append('\n');
        }
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m45410(stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19716)) {
            return false;
        }
        C19716 c19716 = (C19716) obj;
        return this.f63460.equals(c19716.f63460) && this.f63458.equals(c19716.f63458) && this.f63457.equals(c19716.f63457) && this.f63456.equals(c19716.f63456) && this.f63459.equals(c19716.f63459);
    }

    public final int hashCode() {
        return this.f63459.hashCode() + ((this.f63456.hashCode() + ((this.f63457.hashCode() + C12351.m30817(this.f63460.hashCode() * 31, 31, this.f63458)) * 31)) * 31);
    }
}
