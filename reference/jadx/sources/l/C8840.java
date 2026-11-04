package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8840 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f28908;

    public C8840(ArrayList arrayList) throws C14060 {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8095 c8095 = (C8095) it.next();
            if (map.put(c8095.f26757, c8095.f26758) != null) {
                throw new C14060("Duplicate signed attribute: " + c8095.f26757);
            }
        }
        this.f28908 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19370 m23703(String str) throws C14060 {
        List list = (List) this.f28908.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() <= 1) {
            return (C19370) list.get(0);
        }
        throw new C14060(C14442.m34865("Attribute ", str, " has multiple values"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23704() {
        C19370 c19370M23703 = m23703("1.2.840.113549.1.9.3");
        if (c19370M23703 == null) {
            return null;
        }
        try {
            return ((C9585) C3708.m12052(c19370M23703.m44796(), C9585.class)).f31016;
        } catch (C12657 e) {
            throw new C14060("Failed to decode OBJECT IDENTIFIER", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m23705() {
        C19370 c19370M23703 = m23703("1.2.840.113549.1.9.4");
        if (c19370M23703 == null) {
            return null;
        }
        try {
            return ((C2874) C3708.m12052(c19370M23703.m44796(), C2874.class)).f9460;
        } catch (C12657 e) {
            throw new C14060("Failed to decode OBJECT IDENTIFIER", e);
        }
    }
}
