package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C18427 extends C13951 implements InterfaceC8360, InterfaceC19597 {
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

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1362(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C13951, java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Character.valueOf(mo1359());
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۙ */
    public final void mo1356(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C13951, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return C14326.m34752(this);
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        return m34022().f66377;
    }

    @Override // l.InterfaceC8360
    /* JADX INFO: renamed from: ۠ۙ */
    public final char mo1359() {
        return m34023().f66377;
    }
}
