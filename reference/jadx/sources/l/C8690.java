package l;

/* JADX INFO: renamed from: l.ۡۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8690 implements InterfaceC19761 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f29896;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f29897;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f29898;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f29899;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10101 f29900;

    public C8690(C10101 c10101, int i, int i2, int i3, int i4) {
        this.f29900 = c10101;
        this.f29896 = i;
        this.f29899 = i2;
        this.f29898 = i3;
        this.f29897 = i4;
    }

    @Override // l.InterfaceC19761
    public final String getText() {
        C10101 c10101 = this.f29900;
        int size = c10101.f34489.size();
        int i = this.f29896;
        return i >= size ? "<EOF>" : c10101.f34489.mo5499(C22043.m48958(i, this.f29899));
    }

    @Override // l.InterfaceC19761
    public final int getType() {
        return this.f29897 >> 1;
    }

    @Override // l.InterfaceC19761
    public final int getLine() {
        return C10101.m25705(this.f29900, this.f29896) + 1;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo22509() {
        C10101 c10101 = this.f29900;
        int i = this.f29896;
        return i - c10101.f34490[C10101.m25705(c10101, i)];
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo22512() {
        return this.f29897 & 1;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo22511() {
        return this.f29898;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo22508() {
        return this.f29896;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo22510() {
        return this.f29899;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC10589 mo22513() {
        return this.f29900.f34491;
    }

    @Override // l.InterfaceC19761
    public final InterfaceC1623 getInputStream() {
        return this.f29900.f34489;
    }
}
