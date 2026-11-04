package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0135 extends AbstractC5530 implements InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18780 f1098;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135(C18780 c18780, int i) {
        super(i);
        this.f1098 = c18780;
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo1294(int i) {
        C18780 c18780 = this.f1098;
        return c18780.f60993.f31642[c18780.f51221 + i];
    }

    @Override // l.AbstractC5530
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1292(int i, Object obj) {
        this.f1098.add(i, obj);
    }

    @Override // l.AbstractC5530
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1295(int i, Object obj) {
        this.f1098.set(i, obj);
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo1293(int i) {
        this.f1098.remove(i);
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1291() {
        C18780 c18780 = this.f1098;
        return c18780.f51222 - c18780.f51221;
    }

    @Override // l.AbstractC12987, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C18780 c18780 = this.f1098;
        Object[] objArr = c18780.f60993.f31642;
        int i = c18780.f51221;
        int i2 = this.f41623;
        this.f41623 = i2 + 1;
        this.f41622 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC5530, l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C18780 c18780 = this.f1098;
        Object[] objArr = c18780.f60993.f31642;
        int i = c18780.f51221;
        int i2 = this.f41623 - 1;
        this.f41623 = i2;
        this.f41622 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC12987, java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C18780 c18780 = this.f1098;
        Object[] objArr = c18780.f60993.f31642;
        int i = c18780.f51222 - c18780.f51221;
        while (true) {
            int i2 = this.f41623;
            if (i2 >= i) {
                return;
            }
            int i3 = c18780.f51221;
            this.f41623 = i2 + 1;
            this.f41622 = i2;
            consumer.n(objArr[i3 + i2]);
        }
    }
}
