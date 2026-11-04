package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.۬۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13849 implements InterfaceC25320 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3191 f43943;

    public C13849(AbstractC3191 abstractC3191) {
        this.f43943 = abstractC3191;
    }

    @Override // l.InterfaceC25320
    /* JADX INFO: renamed from: ۙ */
    public final void mo16160(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC3191 abstractC3191 = this.f43943;
        C16615 c16615 = (C16615) abstractC3191.f10389.pollFirst();
        if (c16615 == null) {
            return;
        }
        String str = c16615.f53736;
        int i2 = c16615.f53735;
        ComponentCallbacksC11612 componentCallbacksC11612M3827 = abstractC3191.f10410.m3827(str);
        if (componentCallbacksC11612M3827 == null) {
            return;
        }
        componentCallbacksC11612M3827.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
