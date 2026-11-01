package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes4.dex */
public class C7267 extends AbstractC14324 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20673 f24182;

    public C7267(AbstractC20673 abstractC20673) {
        this.f24182 = abstractC20673;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        return this.f24182.mo8945(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24182.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f24182.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f24182.mo8947();
        return null;
    }

    @Override // l.InterfaceC4733, java.util.SortedSet
    public final InterfaceC16481 comparator() {
        this.f24182.mo8947();
        return null;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13103() {
        return this.f24182.mo8951();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ֨ۙ */
    public final int mo13099() {
        return this.f24182.mo8953();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4733 mo13102(int i) {
        return this.f24182.mo8943(i).keySet();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4733 mo13104(int i) {
        return this.f24182.mo8952(i).keySet();
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC4733 mo13100(int i, int i2) {
        return this.f24182.mo8950(i, i2).keySet();
    }
}
