package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C0180 extends AbstractC9874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f1261;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2920 f1262;

    public C0180(C2920 c2920, EnumSet enumSet) {
        this.f1262 = c2920;
        this.f1261 = enumSet;
    }

    public final String toString() {
        return "Requires[" + this.f1261 + "," + this.f1262 + "]";
    }

    @Override // l.InterfaceC16482
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1476(InterfaceC15736 interfaceC15736) {
        interfaceC15736.mo19134(this);
    }
}
