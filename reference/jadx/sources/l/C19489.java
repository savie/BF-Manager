package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19489 extends AbstractC5543 implements InterfaceC1849, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16667 f62716;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C19489(C16667 c16667) {
        this.f62716 = c16667;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C18077(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C18077(this);
    }

    @Override // l.InterfaceC1849
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo6012() {
        return new C18783(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C8200(this, 0, this.f62716.f53437);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C16667 c16667 = this.f62716;
        int i = c16667.f53437;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C20900(c16667, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62716.f53437;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C16667 c16667 = this.f62716;
            if (c16667.mo8945(iIntValue) && C13638.equals(c16667.get(iIntValue), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C16667 c16667 = this.f62716;
        int iM39132 = c16667.m39132(iIntValue);
        if (iM39132 == -1 || !C13638.equals(value, c16667.f53435[iM39132])) {
            return false;
        }
        int i = (c16667.f53437 - iM39132) - 1;
        int[] iArr = c16667.f53439;
        int i2 = iM39132 + 1;
        System.arraycopy(iArr, i2, iArr, iM39132, i);
        Object[] objArr = c16667.f53435;
        System.arraycopy(objArr, i2, objArr, iM39132, i);
        int i3 = c16667.f53437 - 1;
        c16667.f53437 = i3;
        c16667.f53435[i3] = null;
        return true;
    }
}
