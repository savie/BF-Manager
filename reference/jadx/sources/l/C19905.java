package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ᩴܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f64056 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45833(InterfaceC15344 interfaceC15344) {
        IdentityHashMap identityHashMap = this.f64056;
        ArrayList arrayList = (ArrayList) identityHashMap.get(interfaceC15344);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListM21715 = C7972.m21715((Iterable) interfaceC15344.mo35832());
        identityHashMap.put(interfaceC15344, arrayListM21715);
        return arrayListM21715;
    }
}
