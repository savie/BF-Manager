package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9531 implements InterfaceC3179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f32220;

    public C9531(C1768 c1768) {
        this.f32220 = c1768.f6900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24377(char c) {
        return this.f32220.get(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1768 m24376() {
        return new C1768((BitSet) this.f32220.clone());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1768 m24375() {
        return new C1768(new BitSet());
    }
}
