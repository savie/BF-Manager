package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܽۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16622 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53328 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m39083(InterfaceC19133 interfaceC19133) {
        IdentityHashMap identityHashMap = this.f53328;
        ArrayList arrayList = (ArrayList) identityHashMap.get(interfaceC19133);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListM50277 = C22703.m50277((Iterable) interfaceC19133.mo26941());
        identityHashMap.put(interfaceC19133, arrayListM50277);
        return arrayListM50277;
    }
}
