package l;

/* JADX INFO: renamed from: l.ܺ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77JV */
/* JADX INFO: loaded from: classes5.dex */
public class C16221 extends C20454 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17295 f52344;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f52345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f52346;

    @Override // l.C20454, l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public boolean mo20678(C6111 c6111, boolean z, boolean z2, int i, int i2) {
        return true;
    }

    public C16221(int i, int i2, InterfaceC17295 interfaceC17295) {
        super(14);
        this.f52346 = i;
        this.f52345 = i2;
        this.f52344 = interfaceC17295;
    }

    @Override // l.C20454
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo38337() {
        return this.f52346;
    }

    @Override // l.C20454
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo38336() {
        return this.f52345;
    }

    @Override // l.C20454, l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final void mo20677(C6111 c6111) {
        this.f52344.accept(c6111);
    }
}
