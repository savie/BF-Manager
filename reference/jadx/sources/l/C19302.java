package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.᩵ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19302 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Vector f62281 = new Vector();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19925 f62282;

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ۙ */
    public final synchronized Vector mo19220() {
        Vector vector;
        m44289();
        vector = new Vector();
        for (int i = 0; i < this.f62281.size(); i++) {
            vector.addElement((InterfaceC19219) this.f62281.elementAt(i));
        }
        return vector;
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ܰ */
    public final synchronized void mo19224() {
        for (int i = 0; i < this.f62281.size(); i++) {
            ((InterfaceC19219) this.f62281.elementAt(i)).clear();
        }
        this.f62281.removeAllElements();
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ܰ */
    public final synchronized boolean mo19225(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.f62281.size(); i++) {
            InterfaceC19219 interfaceC19219 = (InterfaceC19219) this.f62281.elementAt(i);
            byte[] bArrMo22440 = interfaceC19219.mo22440();
            if (bArrMo22440 != null && C8491.m22174(bArr, bArrMo22440)) {
                this.f62281.removeElement(interfaceC19219);
                interfaceC19219.clear();
                return true;
            }
        }
        return false;
    }

    public C19302(C19925 c19925) {
        this.f62282 = c19925;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m44290(InterfaceC19219 interfaceC19219) {
        if (!this.f62281.contains(interfaceC19219)) {
            C8636 c8636 = (C8636) interfaceC19219;
            byte[] bArrMo22440 = c8636.mo22440();
            if (bArrMo22440 == null) {
                this.f62281.addElement(interfaceC19219);
                return;
            }
            for (int i = 0; i < this.f62281.size(); i++) {
                byte[] bArrMo22441 = ((InterfaceC19219) this.f62281.elementAt(i)).mo22440();
                if (bArrMo22441 != null && C8491.m22174(bArrMo22440, bArrMo22441)) {
                    if (c8636.mo22442() || !((InterfaceC19219) this.f62281.elementAt(i)).mo22442()) {
                        return;
                    } else {
                        mo19225(bArrMo22441);
                    }
                }
            }
            this.f62281.addElement(interfaceC19219);
        }
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ۙ */
    public final synchronized boolean mo19222(byte[] bArr) {
        try {
            m44290(C8636.m22435(this.f62282, "from remote:", bArr));
        } catch (C5813 unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m44289() {
        Vector vector = new Vector();
        Vector vector2 = this.f62281;
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            InterfaceC19219 interfaceC19219 = (InterfaceC19219) vector2.elementAt(i);
            byte[] bArrMo22440 = interfaceC19219.mo22440();
            if (bArrMo22440 != null) {
                for (int i2 = i + 1; i2 < size; i2++) {
                    InterfaceC19219 interfaceC192110 = (InterfaceC19219) vector2.elementAt(i2);
                    byte[] bArrMo22441 = interfaceC192110.mo22440();
                    if (bArrMo22441 != null && C8491.m22174(bArrMo22440, bArrMo22441) && interfaceC19219.mo22442() == interfaceC192110.mo22442()) {
                        vector.addElement(bArrMo22440);
                        break;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            mo19225((byte[]) vector.elementAt(i3));
        }
    }
}
