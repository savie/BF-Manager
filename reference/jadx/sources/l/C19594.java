package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4I6 */
/* JADX INFO: loaded from: classes5.dex */
public class C19594 extends AbstractC11127 {
    @Override // l.AbstractC11127
    /* JADX INFO: renamed from: ۙ */
    public final void mo28061(C13825 c13825, C6187 c6187) {
        ArrayList arrayList = this.f37761;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC9011 abstractC9011M20123 = C7599.m20123(this.f37759, this.f37762);
            arrayList.set(i, abstractC9011M20123);
            abstractC9011M20123.m23324(c13825, i, c6187);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9011 m44688(int i) {
        try {
            return (AbstractC9011) this.f37761.get(i);
        } catch (Exception e) {
            throw C11708.m29248("Error occured while retrieving the " + this.f37762.f68397 + " item at index " + i, e);
        }
    }
}
