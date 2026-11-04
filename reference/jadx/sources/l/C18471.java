package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18471 implements InterfaceC8360, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8360 f60136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8030 f60137;

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

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C14326.m34754((InterfaceC21040) this, interfaceC12089);
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Character.valueOf(mo1359());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C14326.m34752(this);
    }

    public C18471(C8030 c8030, InterfaceC8360 interfaceC8360) {
        this.f60137 = c8030;
        this.f60136 = interfaceC8360;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f60136.nextIndex() - this.f60137.f26648;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f60136.previousIndex() - this.f60137.f26648;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f60136.nextIndex() < this.f60137.f26649;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f60136.previousIndex() >= this.f60137.f26648;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f60136.mo5320();
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f60136.mo1359();
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final void mo1356(char c) {
        this.f60136.mo1356(c);
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1362(char c) {
        this.f60136.mo1362(c);
    }

    @Override // l.InterfaceC8360, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f60136.remove();
    }
}
