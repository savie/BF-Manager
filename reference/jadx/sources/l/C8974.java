package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8974 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("trash") && c21422.m47959().length() <= 1;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("trash");
        int iM47975 = c21422.m47975();
        m12943(c21422, R.string.MT_Protector, iM47975 == 1 ? C16737.m39264(R.string.MT_Protector, c21422.m47981().mo7963()) : C16737.m39264(R.string.MT_Protector, Integer.valueOf(iM47975)));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        List listM47979 = c21422.m47979();
        ArrayList arrayList = new ArrayList(listM47979.size());
        Iterator it = listM47979.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6151) ((InterfaceC2557) it.next())).m17155());
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C19557.class);
        c10142.m25780(c21422);
        c10142.m25767("infos", arrayList);
        c10142.m25763();
    }
}
