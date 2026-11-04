package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB7U */
/* JADX INFO: loaded from: classes5.dex */
public final class C15195 extends AbstractC9843 {
    public C15195() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
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
            c12915.m31987().mo10162(c12915.m31983(), arrayList, new RunnableC22655(0, arrayList, c12915));
            return;
        }
        final C8614 c8614M31974 = c12915.m31974();
        c12915.m31987().m20201(c12915.m31983(), c12915.m31989(), new InterfaceC9600() { // from class: l.ᩴ۟ܳ
            @Override // l.InterfaceC9600
            /* JADX INFO: renamed from: ۙ */
            public final void mo1839(C14406 c14406) {
                c14406.m34838();
                C8614 c8614 = c8614M31974;
                c8614.m23213().m20201(c8614, c8614.m23235(), new C8536(c14406, c12915, c8614));
            }
        });
    }
}
