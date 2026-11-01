package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes5.dex */
public final class C15693 extends C1580 implements InterfaceC21191, InterfaceC6206 {
    @Override // l.InterfaceC21191
    public final /* synthetic */ void add(int i) {
        C7786.m20456();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // l.InterfaceC3758
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC13431, l.InterfaceC22104, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // l.InterfaceC22104
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C5170.$default$forEachRemaining((InterfaceC22104) this, intConsumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo3718((Integer) obj);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3716(int i) {
        C7786.m20459();
        throw null;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo3718(Integer num) {
        C7786.m20460((InterfaceC21191) this, num);
    }

    @Override // l.C1580, l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        return Integer.valueOf(mo3719());
    }

    @Override // l.C1580, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return m5385().f29881;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        return m5387().f29881;
    }
}
