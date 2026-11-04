package l;

/* JADX INFO: renamed from: l.᩷ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes.dex */
public final class C21854 implements InterfaceC8743 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f69621;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f69622;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f69623;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69624;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10665 f69625;

    public C21854(C10665 c10665, int i, int i2, int i3, int i4) {
        this.f69625 = c10665;
        this.f69624 = i;
        this.f69621 = i2;
        this.f69623 = i3;
        this.f69622 = i4;
    }

    @Override // l.InterfaceC8743
    public final String getText() {
        C10665 c10665 = this.f69625;
        int size = c10665.f33827.size();
        int i = this.f69624;
        return i >= size ? "<EOF>" : c10665.f33827.mo19728(C4467.m14163(i, this.f69621));
    }

    @Override // l.InterfaceC8743
    public final int getType() {
        return this.f69622 >> 1;
    }

    @Override // l.InterfaceC8743
    public final int getLine() {
        return C10665.m27172(this.f69625, this.f69624) + 1;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ۙ */
    public final int mo23437() {
        C10665 c10665 = this.f69625;
        int i = this.f69624;
        return i - c10665.f33828[C10665.m27172(c10665, i)];
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩷ */
    public final int mo23441() {
        return this.f69622 & 1;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ۤ */
    public final int mo23438() {
        return this.f69623;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩸ */
    public final int mo23442() {
        return this.f69624;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ᩴ */
    public final int mo23440() {
        return this.f69621;
    }

    @Override // l.InterfaceC8743
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC13963 mo23439() {
        return this.f69625.f33829;
    }

    @Override // l.InterfaceC8743
    public final InterfaceC17693 getInputStream() {
        return this.f69625.f33827;
    }
}
