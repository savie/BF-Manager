package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N97D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17195 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56024 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f56025 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40362(C11974 c11974) {
        HashMap map = this.f56025;
        if (map.containsKey(c11974)) {
            return;
        }
        map.put(c11974, Integer.valueOf(map.size()));
        this.f56024.add(c11974);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40358(C11974 c11974) {
        Integer num = (Integer) this.f56025.get(c11974);
        C17359.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40360(C6178 c6178) {
        ArrayList arrayList = this.f56024;
        c6178.m17809(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C11974) it.next()).m30039(c6178);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40361(C20348 c20348) {
        int iM46741 = c20348.m46741();
        ArrayList arrayList = this.f56024;
        arrayList.ensureCapacity(iM46741);
        for (int i = 0; i < iM46741; i++) {
            arrayList.add(C11974.m30033(c20348));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m40359(int i) {
        return (C11974) this.f56024.get(i);
    }
}
