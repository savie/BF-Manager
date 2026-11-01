package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5627 extends AbstractC14613 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7038 f19277;

    @Override // l.AbstractC14613, l.AbstractC20257, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C5627(C7038 c7038) {
        this.f19277 = c7038;
    }

    @Override // l.InterfaceC14800
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo6642(long j) {
        return this.f19277.m18874(j) != -1;
    }

    @Override // l.AbstractC14613
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15519(long j) {
        C7038 c7038 = this.f19277;
        int iM18874 = c7038.m18874(j);
        if (iM18874 == -1) {
            return false;
        }
        int i = (c7038.f23647 - iM18874) - 1;
        long[] jArr = c7038.f23649;
        int i2 = iM18874 + 1;
        System.arraycopy(jArr, i2, jArr, iM18874, i);
        Object[] objArr = c7038.f23645;
        System.arraycopy(objArr, i2, objArr, iM18874, i);
        int i3 = c7038.f23647 - 1;
        c7038.f23647 = i3;
        c7038.f23645[i3] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11978(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC14800, l.InterfaceC5522
    public final InterfaceC1288 iterator() {
        return new C11978(this);
    }

    @Override // l.AbstractC14613, l.AbstractC20257, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C2804(this, 0, this.f19277.f23647);
    }

    @Override // l.AbstractC20257, l.InterfaceC5522
    public final void forEach(LongConsumer longConsumer) {
        C7038 c7038 = this.f19277;
        long[] jArr = c7038.f23649;
        int i = c7038.f23647;
        for (int i2 = 0; i2 < i; i2++) {
            longConsumer.accept(jArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19277.f23647;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19277.clear();
    }
}
