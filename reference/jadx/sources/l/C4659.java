package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4659 implements InterfaceC3639 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8894 f16457;

    public C4659(AbstractC8894 abstractC8894) {
        this.f16457 = abstractC8894;
    }

    @Override // l.InterfaceC3639
    /* JADX INFO: renamed from: ۙ */
    public final void mo10739(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        AbstractC8894 abstractC8894 = this.f16457;
        C18065 c18065 = (C18065) abstractC8894.f30497.pollFirst();
        if (c18065 == null) {
            return;
        }
        String str = c18065.f57776;
        int i2 = c18065.f57775;
        ComponentCallbacksC22654 componentCallbacksC22654M34976 = abstractC8894.f30509.m34976(str);
        if (componentCallbacksC22654M34976 == null) {
            return;
        }
        componentCallbacksC22654M34976.onRequestPermissionsResult(i2, strArr, iArr);
    }
}
