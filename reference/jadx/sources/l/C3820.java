package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3820 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20974 f13028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18736 f13031;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f13030 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13029 = -1;

    public C3820(C20974 c20974) {
        this.f13028 = c20974;
        this.f13031 = new C18736(c20974.f67066);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13030 < this.f13028.f67066.f7510;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13030;
        this.f13030 = i + 1;
        this.f13029 = i;
        C18736 c18736 = this.f13031;
        c18736.f60893 = i;
        return c18736;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f13029 == -1) {
            throw new IllegalStateException();
        }
        this.f13029 = -1;
        C20974 c20974 = this.f13028;
        C2329 c2329 = c20974.f67066;
        int i = c2329.f7510;
        c2329.f7510 = i - 1;
        int i2 = this.f13030;
        int i3 = i2 - 1;
        this.f13030 = i3;
        int i4 = i - i2;
        Object[] objArr = c2329.f7515;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c20974.f67066.f7511;
        int i5 = this.f13030;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f13031.f60893 = -1;
        C2329 c23210 = c20974.f67066;
        c23210.f7515[c23210.f7510] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f13028.f67066.f7510;
        while (true) {
            int i2 = this.f13030;
            if (i2 >= i) {
                return;
            }
            this.f13030 = i2 + 1;
            this.f13029 = i2;
            C18736 c18736 = this.f13031;
            c18736.f60893 = i2;
            consumer.accept(c18736);
        }
    }
}
