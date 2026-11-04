package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4632 implements InterfaceC21040, InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10597 f16412;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16411 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16413 = 0;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo5320());
    }

    public C4632(C10597 c10597) {
        this.f16412 = c10597;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16413 < this.f16412.f33649;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f16412.f33648;
        int i = this.f16413;
        this.f16413 = i + 1;
        this.f16411 = i;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f16411 == -1) {
            throw new IllegalStateException();
        }
        this.f16411 = -1;
        C10597 c10597 = this.f16412;
        int i = c10597.f33649;
        c10597.f33649 = i - 1;
        int i2 = this.f16413;
        int i3 = i2 - 1;
        this.f16413 = i3;
        char[] cArr = c10597.f33648;
        System.arraycopy(cArr, i2, cArr, i3, i - i2);
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C10597 c10597 = this.f16412;
        char[] cArr = c10597.f33648;
        while (true) {
            int i = this.f16413;
            if (i >= c10597.f33649) {
                return;
            }
            this.f16413 = i + 1;
            interfaceC12089.mo10258(cArr[i]);
        }
    }
}
