package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6978 extends AbstractC4674 {
    public C6978() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        if (!C1709.m5693()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (c21422.m47975() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c21422.m47979().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10840((InterfaceC2557) it.next()));
            }
            c21422.m47960().mo13033(c21422.m47965(), arrayList, new RunnableC2749(1, arrayList, c21422));
            return;
        }
        c21422.m47960().m28625(c21422.m47965(), c21422.m47981(), new C13329(c21422.m47970(), c21422));
    }
}
