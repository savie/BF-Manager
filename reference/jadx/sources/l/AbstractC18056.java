package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18056 extends AbstractC14741 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59121;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2588();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo2589(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract char mo2590(int i);

    public AbstractC18056(int i) {
        this.f59121 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59121 < mo2588();
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f59121;
        this.f59121 = i + 1;
        this.f59120 = i;
        return mo2590(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.f59120;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo2589(i);
        int i2 = this.f59120;
        int i3 = this.f59121;
        if (i2 < i3) {
            this.f59121 = i3 - 1;
        }
        this.f59120 = -1;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩷ */
    public void mo5321(InterfaceC12089 interfaceC12089) {
        while (this.f59121 < mo2588()) {
            int i = this.f59121;
            this.f59121 = i + 1;
            this.f59120 = i;
            interfaceC12089.mo10258(mo2590(i));
        }
    }
}
