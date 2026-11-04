package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes5.dex */
public class C17747 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17001 f58292;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3577 f58293;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17001 f58294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17001 f58295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58296 = 0;

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

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    public C17747(C3577 c3577) {
        this.f58293 = c3577;
        this.f58295 = c3577.f12251;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f58295 != null;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f58292 != null;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo38574() {
        this.f58295 = this.f58295.m40071();
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C17001 c17001 = this.f58295;
        this.f58292 = c17001;
        this.f58294 = c17001;
        this.f58296++;
        mo38574();
        return this.f58294.f55552;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo38575() {
        this.f58292 = this.f58292.m40070();
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C17001 c17001 = this.f58292;
        this.f58295 = c17001;
        this.f58294 = c17001;
        this.f58296--;
        mo38575();
        return this.f58294.f55552;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f58296;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f58296 - 1;
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C17001 c17001 = this.f58294;
        if (c17001 == null) {
            throw new IllegalStateException();
        }
        if (c17001 == this.f58292) {
            this.f58296--;
        }
        this.f58292 = c17001;
        this.f58295 = c17001;
        mo38575();
        mo38574();
        this.f58293.remove(this.f58294.f55552);
        this.f58294 = null;
    }
}
