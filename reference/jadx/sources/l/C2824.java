package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.ۖܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2824 implements InterfaceC5062 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Vector f9276 = new Vector();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22962 f9277;

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Vector mo9294() {
        Vector vector;
        m9293();
        vector = new Vector();
        for (int i = 0; i < this.f9276.size(); i++) {
            vector.addElement((InterfaceC7387) this.f9276.elementAt(i));
        }
        return vector;
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void mo9297() {
        for (int i = 0; i < this.f9276.size(); i++) {
            ((InterfaceC7387) this.f9276.elementAt(i)).clear();
        }
        this.f9276.removeAllElements();
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo9298(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.f9276.size(); i++) {
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) this.f9276.elementAt(i);
            byte[] bArrMo20290 = interfaceC7387.mo20290();
            if (bArrMo20290 != null && C9011.m24054(bArr, bArrMo20290)) {
                this.f9276.removeElement(interfaceC7387);
                interfaceC7387.clear();
                return true;
            }
        }
        return false;
    }

    public C2824(C22962 c22962) {
        this.f9277 = c22962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9295(InterfaceC7387 interfaceC7387) {
        if (!this.f9276.contains(interfaceC7387)) {
            C14098 c14098 = (C14098) interfaceC7387;
            byte[] bArrMo20290 = c14098.mo20290();
            if (bArrMo20290 == null) {
                this.f9276.addElement(interfaceC7387);
                return;
            }
            for (int i = 0; i < this.f9276.size(); i++) {
                byte[] bArrMo20291 = ((InterfaceC7387) this.f9276.elementAt(i)).mo20290();
                if (bArrMo20291 != null && C9011.m24054(bArrMo20290, bArrMo20291)) {
                    if (c14098.mo20292() || !((InterfaceC7387) this.f9276.elementAt(i)).mo20292()) {
                        return;
                    } else {
                        mo9298(bArrMo20291);
                    }
                }
            }
            this.f9276.addElement(interfaceC7387);
        }
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo9296(byte[] bArr) {
        try {
            m9295(C14098.m34255(this.f9277, "from remote:", bArr));
        } catch (C2079 unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9293() {
        Vector vector = new Vector();
        Vector vector2 = this.f9276;
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) vector2.elementAt(i);
            byte[] bArrMo20290 = interfaceC7387.mo20290();
            if (bArrMo20290 != null) {
                for (int i2 = i + 1; i2 < size; i2++) {
                    InterfaceC7387 interfaceC7388 = (InterfaceC7387) vector2.elementAt(i2);
                    byte[] bArrMo20291 = interfaceC7388.mo20290();
                    if (bArrMo20291 != null && C9011.m24054(bArrMo20290, bArrMo20291) && interfaceC7387.mo20292() == interfaceC7388.mo20292()) {
                        vector.addElement(bArrMo20290);
                        break;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            mo9298((byte[]) vector.elementAt(i3));
        }
    }
}
