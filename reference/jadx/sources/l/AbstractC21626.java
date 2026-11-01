package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21626 extends AbstractC6684 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70140;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70141;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo19361();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo19363(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract char mo19364(int i);

    public AbstractC21626(int i) {
        this.f70141 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70141 < mo19361();
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f70141;
        this.f70141 = i + 1;
        this.f70140 = i;
        return mo19364(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f70140;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo19363(i);
        int i2 = this.f70140;
        int i3 = this.f70141;
        if (i2 < i3) {
            this.f70141 = i3 - 1;
        }
        this.f70140 = -1;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ܰ */
    public void mo1415(InterfaceC1164 interfaceC1164) {
        while (this.f70141 < mo19361()) {
            int i = this.f70141;
            this.f70141 = i + 1;
            this.f70140 = i;
            interfaceC1164.mo4297(mo19364(i));
        }
    }
}
