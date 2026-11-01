package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12393 extends AbstractC20590 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6042 f41415;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12393(C6042 c6042, int i) {
        super(i);
        this.f41415 = c6042;
    }

    @Override // l.AbstractC7184
    /* JADX INFO: renamed from: ܰ */
    public final float mo19119(int i) {
        C6042 c6042 = this.f41415;
        return c6042.f20519.f37398[c6042.f35021 + i];
    }

    @Override // l.AbstractC20590
    /* JADX INFO: renamed from: ۙ */
    public final void mo23006(float f, int i) {
        this.f41415.mo26069(f, i);
    }

    @Override // l.AbstractC20590
    /* JADX INFO: renamed from: ܰ */
    public final void mo23007(float f, int i) {
        this.f41415.mo26064(f, i);
    }

    @Override // l.AbstractC7184
    /* JADX INFO: renamed from: ۨ */
    public final void mo19118(int i) {
        this.f41415.mo26070(i);
    }

    @Override // l.AbstractC7184
    /* JADX INFO: renamed from: ۙ */
    public final int mo19117() {
        C6042 c6042 = this.f41415;
        return c6042.f35020 - c6042.f35021;
    }

    @Override // l.AbstractC7184, l.InterfaceC10007
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C6042 c6042 = this.f41415;
        float[] fArr = c6042.f20519.f37398;
        int i = c6042.f35021;
        int i2 = this.f23981;
        this.f23981 = i2 + 1;
        this.f23980 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC20590, l.InterfaceC12124
    /* JADX INFO: renamed from: ᩶ */
    public final float mo2134() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C6042 c6042 = this.f41415;
        float[] fArr = c6042.f20519.f37398;
        int i = c6042.f35021;
        int i2 = this.f23981 - 1;
        this.f23981 = i2;
        this.f23980 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC18742, l.InterfaceC3758
    /* JADX INFO: renamed from: ۨ */
    public final void forEachRemaining(InterfaceC17767 interfaceC17767) {
        C6042 c6042 = this.f41415;
        float[] fArr = c6042.f20519.f37398;
        int i = c6042.f35020 - c6042.f35021;
        while (true) {
            int i2 = this.f23981;
            if (i2 >= i) {
                return;
            }
            int i3 = c6042.f35021;
            this.f23981 = i2 + 1;
            this.f23980 = i2;
            interfaceC17767.mo35707(fArr[i3 + i2]);
        }
    }
}
