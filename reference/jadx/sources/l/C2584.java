package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2584 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0347 f8307;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9757 m8647(C24960 c24960, boolean z) {
        int i;
        Iterator it;
        C4339 c4339M48397 = new C21230(c24960, new C2584(c24960, z).f8307).m48397();
        c24960.m55753();
        c24960.m55735(c4339M48397);
        ArrayList<C19738> arrayListM55749 = c24960.m55749();
        for (C19738 c19738 : arrayListM55749) {
            c19738.m45453(new C9295(arrayListM55749));
            c19738.m45471();
        }
        Iterator it2 = arrayListM55749.iterator();
        while (it2.hasNext()) {
            ((C19738) it2.next()).m45464();
        }
        int iM55741 = c24960.m55741();
        C22985 c22985 = new C22985(c24960.m55737());
        int iM55737 = c24960.m55737();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iM55737) {
                break;
            }
            if (i2 < iM55741) {
                c22985.mo13841(i2, (iM55737 - iM55741) + i2, 1);
            } else {
                c22985.mo13841(i2, i2 - iM55741, 1);
            }
            i2++;
        }
        c24960.m55735(c22985);
        c24960.m55734(new C1093(c24960.m55749()));
        ArrayList arrayListM557410 = c24960.m55749();
        C19738 c19738M55746 = c24960.m55746();
        BitSet bitSetM55727 = c24960.m55727();
        int iCardinality = bitSetM55727.cardinality();
        if (c19738M55746 != null && bitSetM55727.get(c19738M55746.m45472())) {
            iCardinality--;
        }
        C14978 c14978 = new C14978(iCardinality);
        Iterator it3 = arrayListM557410.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            C19738 c19739 = (C19738) it3.next();
            if (!bitSetM55727.get(c19739.m45472()) || c19739 == c19738M55746) {
                it = it3;
            } else {
                int i4 = i3 + 1;
                C24698 c24698M45468 = c19739.m45468();
                int iM45463 = c19739.m45463();
                C19738 c19738M55747 = c24960.m55746();
                int iM55043 = c24698M45468.m55043(c19738M55747 == null ? -1 : c19738M55747.m45479());
                if (iM55043 < 0) {
                    iM55043 = -1;
                }
                if (iM55043 >= 0) {
                    if (c24698M45468.size() > i) {
                        throw new RuntimeException("Exit predecessor must have no other successors".concat(C5306.m15934(c19739.m45479())));
                    }
                    c24698M45468 = C24698.f79910;
                    C18708 c18708Mo4988 = ((AbstractC5568) j$$ExternalSyntheticOutline0.m(c19739.m45460(), i)).mo4988();
                    if (c18708Mo4988.m43508() != 2 && c18708Mo4988 != C0809.f2933) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    iM45463 = -1;
                }
                c24698M45468.mo15005();
                int iM45479 = c19739.m45479();
                ArrayList arrayListM45460 = c19739.m45460();
                int size = arrayListM45460.size();
                C15724 c15724 = new C15724(size);
                int i5 = 0;
                while (i5 < size) {
                    c15724.m31603(i5, ((AbstractC5568) arrayListM45460.get(i5)).mo4997());
                    i5++;
                    it3 = it3;
                }
                it = it3;
                c15724.mo15005();
                c14978.m36041(i3, new C22438(iM45479, c15724, c24698M45468, iM45463));
                i3 = i4;
            }
            i = 1;
            it3 = it;
        }
        if (c19738M55746 == null || c19738M55746.m45460().isEmpty()) {
            return new C18246(new C9757(c14978, c24960.m55726(c24960.m55751()))).m42400();
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    public C2584(C24960 c24960, boolean z) {
        this.f8307 = C18992.m44093(c24960);
    }
}
