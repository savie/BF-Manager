package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes4.dex */
public final class C10720 extends AbstractC9843 {
    public C10720() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        if (!C18978.m44078()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (c12915.m31981() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c12915.m31982().iterator();
            while (it.hasNext()) {
                arrayList.add(new C14406((InterfaceC2386) it.next()));
            }
            c12915.m31987().mo10162(c12915.m31983(), arrayList, new RunnableC4755(0, arrayList, c12915));
            return;
        }
        c12915.m31987().m20201(c12915.m31983(), c12915.m31989(), new C19600(c12915.m31974(), c12915));
    }
}
