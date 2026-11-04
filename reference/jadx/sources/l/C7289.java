package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86FQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7289 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Map f24004 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f24005 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f24006;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC1566[] f24007;

    public C7289(int i, AbstractC1566 abstractC1566) {
        this.f24006 = abstractC1566;
        this.f24003 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m19956() {
        return this.f24006.mo5570();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m19952() {
        return this.f24006;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m19957() {
        return C18366.m42831(this.f24003, 512);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19958() {
        return C18366.m42831(this.f24003, 16384);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1566[] m19961() {
        return this.f24007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19955(AbstractC1566[] abstractC1566Arr) {
        this.f24007 = abstractC1566Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m19960() {
        return this.f24004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19953(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10492 c10492 = (C10492) it.next();
            map.put(c10492.mo8532().m49701(), c10492);
        }
        this.f24004 = map;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m19959() {
        return this.f24005;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19954(List list) {
        this.f24005 = list;
    }

    public final int hashCode() {
        return this.f24006.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7289.class != obj.getClass()) {
            return false;
        }
        return this.f24006.equals(((C7289) obj).f24006);
    }

    public final String toString() {
        return this.f24006.toString();
    }
}
