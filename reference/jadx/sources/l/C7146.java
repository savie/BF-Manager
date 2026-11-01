package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.۟֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7146 implements InterfaceC8558 {
    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList mo19051() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : C0674.f2833.entrySet()) {
            arrayList.add(new C9969(((String) entry.getKey()).substring(6), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19052(C9969 c9969) {
        C0674.f2833.put("local:" + c9969.m25236(), Integer.valueOf(c9969.m25237()));
        C0674.m3028();
    }

    @Override // l.InterfaceC8558
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo19053(C9969 c9969) {
        C0674.f2833.remove("local:" + c9969.m25236());
        C0674.m3028();
    }
}
