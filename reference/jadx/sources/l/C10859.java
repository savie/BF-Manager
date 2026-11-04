package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۤۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10859 extends AbstractC8622 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19810 f34402;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10859(C19810 c19810, int i) {
        super(i);
        this.f34402 = c19810;
    }

    @Override // l.AbstractC2656
    /* JADX INFO: renamed from: ᩷ */
    public final float mo5142(int i) {
        C19810 c19810 = this.f34402;
        return c19810.f63682.f50088[c19810.f31088 + i];
    }

    @Override // l.AbstractC8622
    /* JADX INFO: renamed from: ۙ */
    public final void mo5140(float f, int i) {
        this.f34402.mo25096(f, i);
    }

    @Override // l.AbstractC8622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5143(float f, int i) {
        this.f34402.mo25091(f, i);
    }

    @Override // l.AbstractC2656
    /* JADX INFO: renamed from: ۤ */
    public final void mo5141(int i) {
        this.f34402.mo25095(i);
    }

    @Override // l.AbstractC2656
    /* JADX INFO: renamed from: ۙ */
    public final int mo5139() {
        C19810 c19810 = this.f34402;
        return c19810.f31089 - c19810.f31088;
    }

    @Override // l.AbstractC2656, l.InterfaceC9367
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C19810 c19810 = this.f34402;
        float[] fArr = c19810.f63682.f50088;
        int i = c19810.f31088;
        int i2 = this.f8467;
        this.f8467 = i2 + 1;
        this.f8466 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC8622, l.InterfaceC10685
    /* JADX INFO: renamed from: ᩶ */
    public final float mo15019() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C19810 c19810 = this.f34402;
        float[] fArr = c19810.f63682.f50088;
        int i = c19810.f31088;
        int i2 = this.f8467 - 1;
        this.f8467 = i2;
        this.f8466 = i2;
        return fArr[i + i2];
    }

    @Override // l.AbstractC8118, l.InterfaceC24073
    /* JADX INFO: renamed from: ۤ */
    public final void forEachRemaining(InterfaceC0419 interfaceC0419) {
        C19810 c19810 = this.f34402;
        float[] fArr = c19810.f63682.f50088;
        int i = c19810.f31089 - c19810.f31088;
        while (true) {
            int i2 = this.f8467;
            if (i2 >= i) {
                return;
            }
            int i3 = c19810.f31088;
            this.f8467 = i2 + 1;
            this.f8466 = i2;
            interfaceC0419.mo2223(fArr[i3 + i2]);
        }
    }
}
