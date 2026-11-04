package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10025 extends AbstractC3074 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7043 f32152;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C10025(C7043 c7043) {
        this.f32152 = c7043;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f32152.m19368(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C7043 c7043 = this.f32152;
        int iM19368 = c7043.m19368(obj);
        if (iM19368 == -1) {
            return false;
        }
        int i = (c7043.f23232 - iM19368) - 1;
        Object[] objArr = c7043.f23237;
        int i2 = iM19368 + 1;
        System.arraycopy(objArr, i2, objArr, iM19368, i);
        Object[] objArr2 = c7043.f23233;
        System.arraycopy(objArr2, i2, objArr2, iM19368, i);
        int i3 = c7043.f23232 - 1;
        c7043.f23232 = i3;
        c7043.f23237[i3] = null;
        c7043.f23233[i3] = null;
        return true;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7789(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C7789(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C18976(this, 0, this.f32152.f23232);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C7043 c7043 = this.f32152;
        Object[] objArr = c7043.f23237;
        int i = c7043.f23232;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32152.f23232;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f32152.clear();
    }
}
