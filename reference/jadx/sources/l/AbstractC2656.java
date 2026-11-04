package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2656 extends AbstractC8118 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8467;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo5139();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo5141(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract float mo5142(int i);

    public AbstractC2656(int i) {
        this.f8467 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8467 < mo5139();
    }

    @Override // l.InterfaceC9367
    public float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8467;
        this.f8467 = i + 1;
        this.f8466 = i;
        return mo5142(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f8466;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo5141(i);
        int i2 = this.f8466;
        int i3 = this.f8467;
        if (i2 < i3) {
            this.f8467 = i3 - 1;
        }
        this.f8466 = -1;
    }

    @Override // l.InterfaceC9367
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo8798(InterfaceC0419 interfaceC0419) {
        while (this.f8467 < mo5139()) {
            int i = this.f8467;
            this.f8467 = i + 1;
            this.f8466 = i;
            interfaceC0419.mo2223(mo5142(i));
        }
    }
}
