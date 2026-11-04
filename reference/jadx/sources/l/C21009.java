package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21009 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("trash") && c12915.m31978().length() <= 1;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("trash");
        int iM31981 = c12915.m31981();
        m25620(c12915, R.string.MT_Protector, iM31981 == 1 ? C21576.m49059(R.string.MT_Protector, c12915.m31989().mo8100()) : C21576.m49059(R.string.MT_Protector, Integer.valueOf(iM31981)));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        List listM31982 = c12915.m31982();
        ArrayList arrayList = new ArrayList(listM31982.size());
        Iterator it = listM31982.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6838) ((InterfaceC2386) it.next())).m19056());
        }
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C14295.class);
        c8458.m22731(c12915);
        c8458.m22718("infos", arrayList);
        c8458.m22714();
    }
}
