package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C1494 implements InterfaceC8360, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5203 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14171 f5204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f5205;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo1358((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo1360((Character) obj);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1358(Character ch) {
        C2394.m8136((InterfaceC8360) this, ch);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo1360(Character ch) {
        C2394.m8138((InterfaceC8360) this, ch);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Character.valueOf(mo1359());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C14326.m34752(this);
    }

    public C1494(C14171 c14171, int i) {
        this.f5204 = c14171;
        this.f5205 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5205 < this.f5204.f44820;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f5205 > 0;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f5204.f44819;
        int i = this.f5205;
        this.f5205 = i + 1;
        this.f5203 = i;
        return cArr[i];
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f5204.f44819;
        int i = this.f5205 - 1;
        this.f5205 = i;
        this.f5203 = i;
        return cArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5205;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5205 - 1;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final void mo1356(char c) {
        int i = this.f5205;
        this.f5205 = i + 1;
        this.f5204.mo21904(c, i);
        this.f5203 = -1;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1362(char c) {
        int i = this.f5203;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f5204.mo21898(c, i);
    }

    @Override // l.InterfaceC8360, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f5203;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f5204.mo21903(i);
        int i2 = this.f5203;
        int i3 = this.f5205;
        if (i2 < i3) {
            this.f5205 = i3 - 1;
        }
        this.f5203 = -1;
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C14171 c14171 = this.f5204;
        char[] cArr = c14171.f44819;
        while (true) {
            int i = this.f5205;
            if (i >= c14171.f44820) {
                return;
            }
            this.f5205 = i + 1;
            this.f5203 = i;
            interfaceC12089.mo10258(cArr[i]);
        }
    }
}
