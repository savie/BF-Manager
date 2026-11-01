package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17514 implements InterfaceC13988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f55689;

    public C17514(ArrayList arrayList) {
        this.f55689 = arrayList;
    }

    @Override // l.InterfaceC13988
    /* JADX INFO: renamed from: ۙ */
    public final void mo18588(C11871 c11871, C11871 c11872) {
        ArrayList arrayListM29613 = c11871.m29613();
        if (arrayListM29613.size() == 1 && ((AbstractC22454) arrayListM29613.get(0)).mo17426() == C6372.f21606) {
            BitSet bitSet = (BitSet) c11871.m29596().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((C11871) this.f55689.get(iNextSetBit)).m29602(c11871.m29617(), c11871.m29599());
            }
        }
    }
}
