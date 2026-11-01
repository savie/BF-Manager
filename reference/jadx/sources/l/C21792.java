package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21792 extends AbstractC23909 implements InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18970 f70582;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21792(C18970 c18970, int i) {
        super(i);
        this.f70582 = c18970;
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ܰ */
    public final Object mo28153(int i) {
        C18970 c18970 = this.f70582;
        return c18970.f61421.f29126[c18970.f39905 + i];
    }

    @Override // l.AbstractC23909
    /* JADX INFO: renamed from: ۙ */
    public final void mo33877(int i, Object obj) {
        this.f70582.add(i, obj);
    }

    @Override // l.AbstractC23909
    /* JADX INFO: renamed from: ܰ */
    public final void mo33878(int i, Object obj) {
        this.f70582.set(i, obj);
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ۨ */
    public final void mo28152(int i) {
        this.f70582.remove(i);
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ۙ */
    public final int mo28151() {
        C18970 c18970 = this.f70582;
        return c18970.f39904 - c18970.f39905;
    }

    @Override // l.AbstractC11209, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C18970 c18970 = this.f70582;
        Object[] objArr = c18970.f61421.f29126;
        int i = c18970.f39905;
        int i2 = this.f37929;
        this.f37929 = i2 + 1;
        this.f37928 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC23909, l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C18970 c18970 = this.f70582;
        Object[] objArr = c18970.f61421.f29126;
        int i = c18970.f39905;
        int i2 = this.f37929 - 1;
        this.f37929 = i2;
        this.f37928 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC11209, java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C18970 c18970 = this.f70582;
        Object[] objArr = c18970.f61421.f29126;
        int i = c18970.f39904 - c18970.f39905;
        while (true) {
            int i2 = this.f37929;
            if (i2 >= i) {
                return;
            }
            int i3 = c18970.f39905;
            this.f37929 = i2 + 1;
            this.f37928 = i2;
            consumer.n(objArr[i3 + i2]);
        }
    }
}
