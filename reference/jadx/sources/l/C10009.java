package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10009 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f34187;

    public C10009(AbstractC7186 abstractC7186) {
        this.f34187 = abstractC7186;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        if (obj == null) {
            c1145.m4214();
        } else {
            this.f34187.mo1572(c1145, obj);
        }
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        return this.f34187.mo1571(c5379);
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f34187 + "]";
    }
}
