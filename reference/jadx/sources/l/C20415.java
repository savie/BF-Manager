package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩵۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f65420;

    public C20415(BitSet bitSet) {
        this.f65420 = bitSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46828(char c) {
        if (c > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        this.f65420.set(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46829(char c, char c2) {
        while (c <= c2) {
            m46828(c);
            c = (char) (c + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12210 m46827() {
        return new C12210(this);
    }
}
