package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.۟ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87YT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7224 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Vector f24053 = new Vector();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10047 f24054;

    public C7224(InterfaceC10047 interfaceC10047) {
        this.f24054 = interfaceC10047;
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19222(byte[] bArr) {
        return this.f24054.mo19222(bArr);
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19225(byte[] bArr) {
        return this.f24054.mo19225(bArr);
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo19224() {
        this.f24053.removeAllElements();
        this.f24054.mo19224();
    }

    @Override // l.InterfaceC10047
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Vector mo19220() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            Vector vector2 = this.f24053;
            if (i >= vector2.size()) {
                break;
            }
            vector.add((InterfaceC19219) vector2.elementAt(i));
            i++;
        }
        Vector vectorMo19220 = this.f24054.mo19220();
        for (int i2 = 0; i2 < vectorMo19220.size(); i2++) {
            vector.add((InterfaceC19219) vectorMo19220.elementAt(i2));
        }
        return vector;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19221(InterfaceC19219 interfaceC19219) {
        if (!interfaceC19219.mo22442() && (interfaceC19219 instanceof C8636)) {
            try {
                this.f24054.mo19222(((C8636) interfaceC19219).m22439().mo7211());
            } catch (C5813 unused) {
            }
        } else {
            this.f24053.addElement(interfaceC19219);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19223() {
        Vector vector = this.f24053;
        if (vector.size() > 0) {
            for (Object obj : vector.toArray()) {
                InterfaceC19219 interfaceC19219 = (InterfaceC19219) obj;
                vector.removeElement(interfaceC19219);
                m19221(interfaceC19219);
            }
        }
    }
}
