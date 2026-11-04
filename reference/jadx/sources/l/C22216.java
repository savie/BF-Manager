package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.᩷ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87YT */
/* JADX INFO: loaded from: classes.dex */
public final class C22216 implements InterfaceC5062 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Vector f71562 = new Vector();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC5062 f71563;

    public C22216(InterfaceC5062 interfaceC5062) {
        this.f71563 = interfaceC5062;
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9296(byte[] bArr) {
        return this.f71563.mo9296(bArr);
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9298(byte[] bArr) {
        return this.f71563.mo9298(bArr);
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9297() {
        this.f71562.removeAllElements();
        this.f71563.mo9297();
    }

    @Override // l.InterfaceC5062
    /* JADX INFO: renamed from: ۙ */
    public final Vector mo9294() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            Vector vector2 = this.f71562;
            if (i >= vector2.size()) {
                break;
            }
            vector.add((InterfaceC7387) vector2.elementAt(i));
            i++;
        }
        Vector vectorMo9294 = this.f71563.mo9294();
        for (int i2 = 0; i2 < vectorMo9294.size(); i2++) {
            vector.add((InterfaceC7387) vectorMo9294.elementAt(i2));
        }
        return vector;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50240(InterfaceC7387 interfaceC7387) {
        if (!interfaceC7387.mo20292() && (interfaceC7387 instanceof C14098)) {
            try {
                this.f71563.mo9296(((C14098) interfaceC7387).m34256().mo2674());
            } catch (C2079 unused) {
            }
        } else {
            this.f71562.addElement(interfaceC7387);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50241() {
        Vector vector = this.f71562;
        if (vector.size() > 0) {
            for (Object obj : vector.toArray()) {
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj;
                vector.removeElement(interfaceC7387);
                m50240(interfaceC7387);
            }
        }
    }
}
