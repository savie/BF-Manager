package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: KIV4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12467 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f40047;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f40044 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f40043 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f40046 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20672 f40045 = new C20672(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30963(Object obj, String str) {
        C15243.m36590(str, "key");
        this.f40047.put(str, obj);
        InterfaceC3920 interfaceC3920 = (InterfaceC3920) this.f40043.get(str);
        if (interfaceC3920 != null) {
            interfaceC3920.setValue(obj);
        }
        InterfaceC3920 interfaceC3921 = (InterfaceC3920) this.f40046.get(str);
        if (interfaceC3921 != null) {
            interfaceC3921.setValue(obj);
        }
    }

    public C12467(Map map) {
        this.f40047 = new LinkedHashMap(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20672 m30962() {
        return this.f40045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m30961(C12467 c12467) {
        C21914[] c21914Arr;
        for (Map.Entry entry : C5834.m17023(c12467.f40046).entrySet()) {
            c12467.m30963(((InterfaceC3920) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : C5834.m17023(c12467.f40044).entrySet()) {
            c12467.m30963(((InterfaceC19742) entry2.getValue()).mo14860(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = c12467.f40047;
        if (linkedHashMap.isEmpty()) {
            c21914Arr = new C21914[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new C21914((String) entry3.getKey(), entry3.getValue()));
            }
            c21914Arr = (C21914[]) arrayList.toArray(new C21914[0]);
        }
        return C1826.m6304((C21914[]) Arrays.copyOf(c21914Arr, c21914Arr.length));
    }
}
