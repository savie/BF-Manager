package l;

/* JADX INFO: renamed from: l.۬᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0S */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14080 extends AbstractC6383 implements InterfaceC2894 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f44579 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f44581 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f44578 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44583 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44580 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44582 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo5132();

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo5133(C3399 c3399);

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo5135(C3399 c3399);

    /* JADX INFO: renamed from: ᩷ */
    public C7369 mo5134() {
        String strConcat;
        if (this.f44582 == 0) {
            return null;
        }
        int i = this.f44582;
        int i2 = 0;
        int i3 = 9;
        while (i3 >= i2) {
            int i4 = (i2 + i3) / 2;
            int i5 = InterfaceC8860.f28948[i4];
            if (i > i5) {
                i2 = i4 + 1;
            } else {
                if (i >= i5) {
                    strConcat = InterfaceC8860.f28949[i4];
                    return new C7369(strConcat);
                }
                i3 = i4 - 1;
            }
        }
        strConcat = "0x".concat(C6033.m17503(i, 8));
        return new C7369(strConcat);
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6571(C3399 c3399) {
        int i = c3399.f11055;
        c3399.m11128(16);
        int i2 = 0;
        if (this.f44579 == 0) {
            int i3 = c3399.f11055;
            c3399.m11138(0);
            c3399.m11134(0);
            c3399.m11134(mo5132());
            i2 = i3;
        }
        mo5133(c3399);
        int i4 = c3399.f11055 - i;
        this.f44578 = i4;
        if (this.f44579 == 0) {
            c3399.f11055 = i2;
            int i5 = i4 - i2;
            this.f44580 = i5;
            c3399.m11138(i5);
        }
        c3399.f11055 = i;
        m34247(c3399);
        c3399.f11055 = i + this.f44578;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34247(C3399 c3399) {
        c3399.m11133(5);
        c3399.m11133(0);
        c3399.m11133(this.f44579);
        c3399.m11133(this.f44581);
        c3399.m11138(16);
        c3399.m11134(this.f44578);
        c3399.m11134(0);
        c3399.m11138(this.f44583);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34246(C3399 c3399) throws C20553 {
        if (c3399.m11131() != 5 || c3399.m11131() != 0) {
            throw new C20553("DCERPC version not supported");
        }
        this.f44579 = c3399.m11131();
        this.f44581 = c3399.m11131();
        if (c3399.m11127() != 16) {
            throw new C20553("Data representation not supported");
        }
        this.f44578 = c3399.m11135();
        if (c3399.m11135() != 0) {
            throw new C20553("DCERPC authentication not supported");
        }
        this.f44583 = c3399.m11127();
    }

    @Override // l.AbstractC6383
    /* JADX INFO: renamed from: ۙ */
    public final void mo6570(C3399 c3399) throws C20553 {
        m34246(c3399);
        int i = this.f44579;
        if (i != 12 && i != 2 && i != 3 && i != 13) {
            throw new C20553("Unexpected ptype: " + this.f44579);
        }
        if (i == 2 || i == 3) {
            this.f44580 = c3399.m11127();
            c3399.m11135();
            c3399.m11135();
        }
        int i2 = this.f44579;
        if (i2 == 3 || i2 == 13) {
            this.f44582 = c3399.m11127();
        } else {
            mo5135(c3399);
        }
    }
}
