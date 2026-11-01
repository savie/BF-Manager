package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21314 extends C19904 implements InterfaceC20921, InterfaceC6206 {
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo19148((Character) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo19149((Character) obj);
    }

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

    @Override // l.InterfaceC3758
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C23038.m50972((InterfaceC15277) this, interfaceC1164);
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ۖ */
    public final void mo19147(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C19904, l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        return Character.valueOf(mo19146());
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ܰ */
    public final void mo19150(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C19904, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        return C23038.m50970(this);
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        return m45175().f18265;
    }

    @Override // l.InterfaceC20921
    /* JADX INFO: renamed from: ֫ۙ */
    public final char mo19146() {
        return m45176().f18265;
    }
}
