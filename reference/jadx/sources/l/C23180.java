package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.᩺ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23180 implements InterfaceC15690 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f75226;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15690 f75227;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseArray f75228 = new SparseArray();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75229;

    public C23180(InterfaceC15690 interfaceC15690, InterfaceC13302 interfaceC13302) {
        this.f75227 = interfaceC15690;
        this.f75226 = interfaceC13302;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8011 mo7684(int i, int i2) {
        InterfaceC15690 interfaceC15690 = this.f75227;
        if (i2 != 3) {
            this.f75229 = true;
            return interfaceC15690.mo7684(i, i2);
        }
        SparseArray sparseArray = this.f75228;
        C21768 c21768 = (C21768) sparseArray.get(i);
        if (c21768 != null) {
            return c21768;
        }
        C21768 c21769 = new C21768(interfaceC15690.mo7684(i, i2), this.f75226);
        sparseArray.put(i, c21769);
        return c21769;
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ᩹ */
    public final void mo7696() {
        this.f75227.mo7696();
        if (!this.f75229) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f75228;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C21768) sparseArray.valueAt(i)).m48532();
            i++;
        }
    }

    @Override // l.InterfaceC15690
    /* JADX INFO: renamed from: ۙ */
    public final void mo7690(InterfaceC6599 interfaceC6599) {
        this.f75227.mo7690(interfaceC6599);
    }
}
