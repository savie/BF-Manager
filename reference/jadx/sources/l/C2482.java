package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes3.dex */
public class C2482 extends AbstractC5991 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8448 f7947;

    public C2482(AbstractC8448 abstractC8448) {
        this.f7947 = abstractC8448;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        return this.f7947.mo13467(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7947.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7947.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f7947.mo13470();
        return null;
    }

    @Override // l.InterfaceC16695, java.util.SortedSet
    public final InterfaceC4544 comparator() {
        this.f7947.mo13470();
        return null;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo8337() {
        return this.f7947.mo13474();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int mo8335() {
        return this.f7947.mo13469();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC16695 mo8338(int i) {
        return this.f7947.mo13472(i).keySet();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16695 mo8336(int i) {
        return this.f7947.mo13475(i).keySet();
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16695 mo8334(int i, int i2) {
        return this.f7947.mo13473(i, i2).keySet();
    }
}
