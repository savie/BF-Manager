package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C13597 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f43189;

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c21362.m48598();
            return;
        }
        double dDoubleValue = number.doubleValue();
        if (this.f43189) {
            C22854.m51571(dDoubleValue);
        }
        c21362.m48586(dDoubleValue);
    }

    public C13597(boolean z) {
        this.f43189 = z;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        return Double.valueOf(c4208.m13448());
    }
}
