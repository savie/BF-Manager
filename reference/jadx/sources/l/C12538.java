package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12538 extends AbstractC11127 {
    @Override // l.AbstractC11127
    /* JADX INFO: renamed from: ۙ */
    public final void mo28061(C13825 c13825, C6187 c6187) {
        ArrayList arrayList = this.f37761;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            EnumC21004 enumC21004 = this.f37762;
            if (i < size) {
                c13825.m33640(enumC21004.f68396);
                AbstractC9011 abstractC9011M20123 = C7599.m20123(this.f37759, enumC21004);
                arrayList.set(i, abstractC9011M20123);
                abstractC9011M20123.m23324(c13825, i, c6187);
                i++;
            } else {
                c6187.m17185(enumC21004, arrayList);
                return;
            }
        }
    }
}
