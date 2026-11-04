package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6E5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17130 implements InterfaceC21197 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f55878;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f55879;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f55880;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55881;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21965 f55882;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f55883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f55884;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f35998;
    }

    public C17130(InterfaceC21197 interfaceC21197) {
        this.f55882 = interfaceC21197.mo8532();
        this.f55878 = interfaceC21197.mo8519();
        this.f55884 = C4681.unmodifiableList(interfaceC21197.mo8537());
        this.f55883 = C4681.unmodifiableList(interfaceC21197.mo8554());
        this.f55879 = C4681.unmodifiableList(interfaceC21197.mo8542());
        this.f55880 = interfaceC21197.mo8510();
        this.f55881 = interfaceC21197.mo8545();
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ܺ */
    public final C21965 mo8532() {
        return this.f55882;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC1566 mo8519() {
        return this.f55878;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩴ */
    public final List mo8537() {
        return this.f55884;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩸ */
    public final List mo8554() {
        return this.f55883;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩵ */
    public final List mo8542() {
        return this.f55879;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo8510() {
        return this.f55880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40285(AbstractC1566 abstractC1566) {
        this.f55878 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40284(ArrayList arrayList) {
        this.f55884 = arrayList;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩶ */
    public final int mo8545() {
        return this.f55881;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return C14483.m34974(this) + " (mut)";
    }

    public final String toString() {
        return "Mutable" + mo1790();
    }
}
