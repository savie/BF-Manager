package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4I6 */
/* JADX INFO: loaded from: classes.dex */
public class C21928 extends AbstractC15960 {
    @Override // l.AbstractC15960
    /* JADX INFO: renamed from: ۙ */
    public final void mo38080(C4028 c4028, C17452 c17452) {
        ArrayList arrayList = this.f51828;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC10739 abstractC10739M45393 = C19690.m45393(this.f51827, this.f51830);
            arrayList.set(i, abstractC10739M45393);
            abstractC10739M45393.m27352(c4028, i, c17452);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC10739 m49623(int i) {
        try {
            return (AbstractC10739) this.f51828.get(i);
        } catch (Exception e) {
            throw C14468.m34931("Error occured while retrieving the " + this.f51830.f49668 + " item at index " + i, e);
        }
    }
}
