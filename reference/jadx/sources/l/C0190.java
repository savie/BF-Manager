package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0190 implements InterfaceC15277, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12186 f1312;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1313 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1314 = 0;

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo1416());
    }

    public C0190(C12186 c12186) {
        this.f1312 = c12186;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1314 < this.f1312.f40783;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public final char mo1416() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f1312.f40782;
        int i = this.f1314;
        this.f1314 = i + 1;
        this.f1313 = i;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1313 == -1) {
            throw new IllegalStateException();
        }
        this.f1313 = -1;
        C12186 c12186 = this.f1312;
        int i = c12186.f40783;
        c12186.f40783 = i - 1;
        int i2 = this.f1314;
        int i3 = i2 - 1;
        this.f1314 = i3;
        char[] cArr = c12186.f40782;
        System.arraycopy(cArr, i2, cArr, i3, i - i2);
    }

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C12186 c12186 = this.f1312;
        char[] cArr = c12186.f40782;
        while (true) {
            int i = this.f1314;
            if (i >= c12186.f40783) {
                return;
            }
            this.f1314 = i + 1;
            interfaceC1164.mo4297(cArr[i]);
        }
    }
}
