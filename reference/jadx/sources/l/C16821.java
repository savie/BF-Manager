package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16821 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f54278;

    public C16821(AbstractC17567 abstractC17567) {
        this.f54278 = abstractC17567;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        if (obj == null) {
            c21362.m48598();
        } else {
            this.f54278.mo3723(c21362, obj);
        }
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        return this.f54278.mo3722(c4208);
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f54278 + "]";
    }
}
