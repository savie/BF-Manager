package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֫ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f6900;

    public C1768(BitSet bitSet) {
        this.f6900 = bitSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5809(char c) {
        if (c > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        this.f6900.set(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5810(char c, char c2) {
        while (c <= c2) {
            m5809(c);
            c = (char) (c + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9531 m5808() {
        return new C9531(this);
    }
}
