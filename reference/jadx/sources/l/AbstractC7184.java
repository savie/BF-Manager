package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7184 extends AbstractC18742 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23981;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo19117();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo19118(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract float mo19119(int i);

    public AbstractC7184(int i) {
        this.f23981 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23981 < mo19117();
    }

    @Override // l.InterfaceC10007
    public float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23981;
        this.f23981 = i + 1;
        this.f23980 = i;
        return mo19119(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f23980;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo19118(i);
        int i2 = this.f23980;
        int i3 = this.f23981;
        if (i2 < i3) {
            this.f23981 = i3 - 1;
        }
        this.f23980 = -1;
    }

    @Override // l.InterfaceC10007
    /* JADX INFO: renamed from: ۨ */
    public void mo2133(InterfaceC17767 interfaceC17767) {
        while (this.f23981 < mo19117()) {
            int i = this.f23981;
            this.f23981 = i + 1;
            this.f23980 = i;
            interfaceC17767.mo35707(mo19119(i));
        }
    }
}
