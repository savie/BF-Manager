package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15443 implements InterfaceC21040, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f50300 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5749 f50301;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo5320());
    }

    public C15443(C5749 c5749) {
        this.f50301 = c5749;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50300 < this.f50301.f19793.f6731;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f50301.f19793.f6732;
        int i = this.f50300;
        this.f50300 = i + 1;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f50300;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C5749 c5749 = this.f50301;
        C2020 c2020 = c5749.f19793;
        int i2 = c2020.f6731 - i;
        char[] cArr = c2020.f6736;
        System.arraycopy(cArr, i, cArr, i - 1, i2);
        char[] cArr2 = c5749.f19793.f6732;
        int i3 = this.f50300;
        System.arraycopy(cArr2, i3, cArr2, i3 - 1, i2);
        c5749.f19793.f6731--;
        this.f50300--;
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C2020 c2020 = this.f50301.f19793;
        char[] cArr = c2020.f6732;
        int i = c2020.f6731;
        while (true) {
            int i2 = this.f50300;
            if (i2 >= i) {
                return;
            }
            this.f50300 = i2 + 1;
            interfaceC12089.mo10258(cArr[i2]);
        }
    }
}
