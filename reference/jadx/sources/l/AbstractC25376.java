package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25376 implements InterfaceC3746 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f81930;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f81931;

    /* JADX INFO: renamed from: ۫ */
    public abstract InterfaceC5984 mo5363();

    public AbstractC25376(int i, int i2) {
        this.f81930 = i;
        this.f81931 = i2;
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ᩴ */
    public final int mo3130() {
        return this.f81930;
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ᩸ */
    public final int mo3132() {
        return this.f81931;
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ۙ */
    public final C16424 mo3127() {
        return new C16424(this);
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo3129() {
        return new C2255(mo5363());
    }

    @Override // l.InterfaceC3746
    /* JADX INFO: renamed from: ۤ */
    public final Iterator mo3128() {
        return new C11949(mo5363(), this.f81930, this.f81931);
    }
}
