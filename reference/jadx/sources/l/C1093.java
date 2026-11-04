package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.֨ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1093 implements InterfaceC22722 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f3900;

    public C1093(ArrayList arrayList) {
        this.f3900 = arrayList;
    }

    @Override // l.InterfaceC22722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4093(C19738 c19738, C19738 c19739) {
        ArrayList arrayListM45460 = c19738.m45460();
        if (arrayListM45460.size() == 1 && ((AbstractC5568) arrayListM45460.get(0)).mo4988() == C0809.f3062) {
            BitSet bitSet = (BitSet) c19738.m45465().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((C19738) this.f3900.get(iNextSetBit)).m45452(c19738.m45472(), c19738.m45448());
            }
        }
    }
}
