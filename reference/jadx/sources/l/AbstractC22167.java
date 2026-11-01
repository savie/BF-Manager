package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22167 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f72506;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f72507;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72508;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72509;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8387 f72510;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72511 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6482(int i, Object obj);

    public AbstractC22167(C6644 c6644) {
        this.f72507 = c6644;
        this.f72509 = c6644.f22445;
        this.f72508 = c6644.f22440;
        this.f72506 = c6644.f22441;
    }

    public final boolean hasNext() {
        return this.f72508 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49177() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f72508--;
        boolean z = this.f72506;
        C6644 c6644 = this.f72507;
        if (z) {
            this.f72506 = false;
            int i2 = c6644.f22445;
            this.f72511 = i2;
            return i2;
        }
        Object[] objArr = c6644.f22442;
        do {
            i = this.f72509 - 1;
            this.f72509 = i;
            if (i < 0) {
                this.f72511 = Integer.MIN_VALUE;
                Object obj = this.f72510.get((-i) - 1);
                int iM25125 = C9927.m25125(obj.hashCode());
                int i3 = c6644.f22443;
                while (true) {
                    int i4 = iM25125 & i3;
                    if (obj.equals(objArr[i4])) {
                        return i4;
                    }
                    iM25125 = i4 + 1;
                    i3 = c6644.f22443;
                }
            }
        } while (objArr[i] == null);
        this.f72511 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f72506;
        C6644 c6644 = this.f72507;
        if (z) {
            this.f72506 = false;
            int i2 = c6644.f22445;
            this.f72511 = i2;
            mo6482(i2, obj);
            this.f72508--;
        }
        Object[] objArr = c6644.f22442;
        while (this.f72508 != 0) {
            int i3 = this.f72509 - 1;
            this.f72509 = i3;
            if (i3 < 0) {
                this.f72511 = Integer.MIN_VALUE;
                Object obj2 = this.f72510.get((-i3) - 1);
                int iM25125 = C9927.m25125(obj2.hashCode());
                int i4 = c6644.f22443;
                while (true) {
                    i = iM25125 & i4;
                    if (obj2.equals(objArr[i])) {
                        break;
                    }
                    iM25125 = i + 1;
                    i4 = c6644.f22443;
                }
                mo6482(i, obj);
                this.f72508--;
            } else if (objArr[i3] != null) {
                this.f72511 = i3;
                mo6482(i3, obj);
                this.f72508--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f72511;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C6644 c6644 = this.f72507;
        int i2 = c6644.f22445;
        if (i == i2) {
            c6644.f22441 = false;
            c6644.f22442[i2] = null;
        } else {
            int i3 = this.f72509;
            if (i3 >= 0) {
                Object[] objArr = c6644.f22442;
                int[] iArr = c6644.f22435;
                loop0: while (true) {
                    int i4 = (i + 1) & c6644.f22443;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM25125 = C9927.m25125(obj.hashCode());
                            int i5 = c6644.f22443;
                            int i6 = iM25125 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f72510 == null) {
                            this.f72510 = new C8387(2);
                        }
                        this.f72510.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    iArr[i] = iArr[i4];
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c6644.mo18020(this.f72510.set((-i3) - 1, null));
                this.f72511 = -1;
                return;
            }
        }
        c6644.f22440--;
        this.f72511 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
