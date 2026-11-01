package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCH0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18098 extends AbstractC21626 implements InterfaceC20921, InterfaceC6206 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo19148((Character) obj);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo19149((Character) obj);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19362(char c, int i);

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo19148(Character ch) {
        C7515.m20022((InterfaceC20921) this, ch);
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo19149(Character ch) {
        C7515.m20024((InterfaceC20921) this, ch);
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo19365(char c, int i);

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Character.valueOf(mo19146());
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return C23038.m50970(this);
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f70141 > 0;
    }

    /* JADX INFO: renamed from: ֫ۙ */
    public char mo19146() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f70141 - 1;
        this.f70141 = i;
        this.f70140 = i;
        return mo19364(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f70141;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f70141 - 1;
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public void mo19150(char c) {
        int i = this.f70141;
        this.f70141 = i + 1;
        mo19362(c, i);
        this.f70140 = -1;
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        int i = this.f70140;
        if (i == -1) {
            throw new IllegalStateException();
        }
        mo19365(c, i);
    }
}
