package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3723 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        if ((c21422.m47974("local") || c21422.m47974(b.k)) && !c21422.m47977() && c21422.m47975() == 2) {
            return c21422.m47968() || c21422.m47978();
        }
        return false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        ArrayList arrayList = new ArrayList(c21422.m47979());
        if (arrayList.size() != 2) {
            return;
        }
        if (c21422.m47974("local")) {
            try {
                C2462.m7541(c21422.m47966(), EnumC11636.MODIFY_DIRECTORY_LINKED);
                ArrayList arrayList2 = new ArrayList(2);
                AbstractC20745 abstractC20745Mo7989 = ((InterfaceC2557) arrayList.get(0)).mo7989();
                AbstractC20745 abstractC20745Mo79810 = ((InterfaceC2557) arrayList.get(1)).mo7989();
                AbstractC20745 abstractC20745M46733 = abstractC20745Mo7989.m46733(".tmp");
                if (abstractC20745Mo7989.mo24646(abstractC20745M46733)) {
                    arrayList2.add(abstractC20745M46733.getName());
                    if (abstractC20745Mo79810.mo24646(abstractC20745Mo7989)) {
                        arrayList2.add(abstractC20745Mo7989.getName());
                        if (abstractC20745M46733.mo24646(abstractC20745Mo79810)) {
                            arrayList2.add(abstractC20745Mo79810.getName());
                            arrayList2.remove(abstractC20745M46733.getName());
                            int i = C22252.f72742;
                            C22252.m49408(abstractC20745Mo7989.mo33986(), true);
                            C22252.m49408(abstractC20745Mo79810.mo33986(), true);
                        } else if (abstractC20745Mo7989.mo24646(abstractC20745Mo79810)) {
                            arrayList2.remove(abstractC20745Mo7989.getName());
                            if (abstractC20745M46733.mo24646(abstractC20745Mo7989)) {
                                arrayList2.remove(abstractC20745M46733.getName());
                            }
                        }
                    } else if (abstractC20745M46733.mo24646(abstractC20745Mo7989)) {
                        arrayList2.remove(abstractC20745M46733.getName());
                    }
                    C15829.m37611(R.string.MT_Protector);
                } else {
                    C15829.m37611(R.string.MT_Protector);
                }
                if (!arrayList2.isEmpty()) {
                    c21422.m47965().m28831();
                    c21422.m47965().m28777((Collection) arrayList2);
                    c21422.m47969();
                }
                C21094.m47530();
                return;
            } catch (C4987 e) {
                c21422.m47980().m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (c21422.m47974(b.k)) {
            new C12897(this, c21422, (AbstractC12233) c21422.m47960().mo13029(), arrayList).m10243();
        }
    }
}
