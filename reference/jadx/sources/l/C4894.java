package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4894 implements InterfaceC10685, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17104 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15334 f17105;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17106;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1165.m4306(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo15018(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Float.valueOf(mo15019());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    public C4894(C15334 c15334, int i) {
        this.f17105 = c15334;
        this.f17106 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17106 < this.f17105.f50089;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f17106 > 0;
    }

    @Override // l.InterfaceC9367
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f17105.f50088;
        int i = this.f17106;
        this.f17106 = i + 1;
        this.f17104 = i;
        return fArr[i];
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float mo15019() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f17105.f50088;
        int i = this.f17106 - 1;
        this.f17106 = i;
        this.f17104 = i;
        return fArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17106;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17106 - 1;
    }

    @Override // l.InterfaceC10685
    public final void add(float f) {
        int i = this.f17106;
        this.f17106 = i + 1;
        this.f17105.mo25096(f, i);
        this.f17104 = -1;
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo15018(float f) {
        int i = this.f17104;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f17105.mo25091(f, i);
    }

    @Override // l.InterfaceC10685, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f17104;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f17105.mo25095(i);
        int i2 = this.f17104;
        int i3 = this.f17106;
        if (i2 < i3) {
            this.f17106 = i3 - 1;
        }
        this.f17104 = -1;
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ۤ */
    public final void forEachRemaining(InterfaceC0419 interfaceC0419) {
        C15334 c15334 = this.f17105;
        float[] fArr = c15334.f50088;
        while (true) {
            int i = this.f17106;
            if (i >= c15334.f50089) {
                return;
            }
            this.f17106 = i + 1;
            this.f17104 = i;
            interfaceC0419.mo2223(fArr[i]);
        }
    }
}
