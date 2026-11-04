package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۨ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12210 implements InterfaceC6245 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f39242;

    public C12210(C20415 c20415) {
        this.f39242 = c20415.f65420;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30485(char c) {
        return this.f39242.get(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20415 m30484() {
        return new C20415((BitSet) this.f39242.clone());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20415 m30483() {
        return new C20415(new BitSet());
    }
}
