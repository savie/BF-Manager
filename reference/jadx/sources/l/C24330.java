package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C24330 extends AbstractC7730 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashSet f78906;

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC24139[] mo17870() {
        return new InterfaceC24139[]{EnumC18587.STUCK};
    }

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo17868(InterfaceC24139 interfaceC24139) {
        if (interfaceC24139 == EnumC18587.STUCK) {
            return this.f78906;
        }
        throw new IllegalStateException();
    }

    @Override // l.AbstractC7730
    /* JADX INFO: renamed from: ᩴ */
    public final Iterable mo21015() {
        return this.f78906;
    }
}
