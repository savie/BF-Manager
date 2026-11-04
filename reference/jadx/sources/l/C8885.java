package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C8885 extends C5815 implements InterfaceC8273, InterfaceC19597 {
    @Override // l.InterfaceC8273
    public final /* synthetic */ void add(int i) {
        C2307.m7789();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
    }

    @Override // l.InterfaceC24073
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6036, l.InterfaceC20343, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // l.InterfaceC20343
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3189.$default$forEachRemaining((InterfaceC20343) this, intConsumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo12332((Integer) obj);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12327(int i) {
        C2307.m7792();
        throw null;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12329(Integer num) {
        C2307.m7790((InterfaceC8273) this, num);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo12332(Integer num) {
        C2307.m7793((InterfaceC8273) this, num);
    }

    @Override // l.C5815, l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // l.C5815, java.util.Iterator, java.util.ListIterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return m16946().f3592;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        return m16948().f3592;
    }
}
