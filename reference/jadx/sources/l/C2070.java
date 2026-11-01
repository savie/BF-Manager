package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BJP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2070 extends AbstractC3481 {
    public C2070(List list) {
        this.f12776.addAll(list);
        this.f12777 = this.f12776.size();
    }

    public C2070(AbstractC4166... abstractC4166Arr) {
        this(Arrays.asList(abstractC4166Arr));
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        for (int i = this.f12777 - 1; i >= 0; i--) {
            if (!((AbstractC4166) this.f12776.get(i)).mo2407(c0617, c0618)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C4145.m11781(this.f12776, "");
    }
}
