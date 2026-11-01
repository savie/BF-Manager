package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6948 extends AbstractC21765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f23370;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19670 f23371;

    public C6948(C19670 c19670, EnumSet enumSet) {
        this.f23371 = c19670;
        this.f23370 = enumSet;
    }

    public final String toString() {
        return "Requires[" + this.f23370 + "," + this.f23371 + "]";
    }

    @Override // l.InterfaceC14044
    /* JADX INFO: renamed from: ۙ */
    public final void mo4647(InterfaceC2753 interfaceC2753) {
        interfaceC2753.mo8401(this);
    }
}
