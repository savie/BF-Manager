package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C14349 extends AbstractC9874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f45254;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14106 f45255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 f45256;

    public C14349(C14106 c14106, C14769 c14769, EnumSet enumSet) {
        this.f45255 = c14106;
        this.f45256 = c14769;
        this.f45254 = enumSet;
    }

    public final String toString() {
        C14106 c14106 = this.f45255;
        C14769 c14769 = this.f45256;
        if (c14769 == null) {
            return "Opens[" + c14106 + "]";
        }
        return "Opens[" + c14106 + ":" + c14769 + "]";
    }

    @Override // l.InterfaceC16482
    /* JADX INFO: renamed from: ۙ */
    public final void mo1476(InterfaceC15736 interfaceC15736) {
        interfaceC15736.mo19135(this);
    }
}
