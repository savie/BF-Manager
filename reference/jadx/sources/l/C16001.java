package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BJP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16001 extends AbstractC3323 {
    public C16001(List list) {
        this.f10867.addAll(list);
        this.f10868 = this.f10867.size();
    }

    public C16001(AbstractC0078... abstractC0078Arr) {
        this(Arrays.asList(abstractC0078Arr));
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        for (int i = this.f10868 - 1; i >= 0; i--) {
            if (!((AbstractC0078) this.f10867.get(i)).mo1133(c15496, c15497)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0669.m2897(this.f10867, "");
    }
}
