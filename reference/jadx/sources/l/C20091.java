package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20091 extends AbstractC5543 implements InterfaceC2263, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14447 f65270;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C20091(C14447 c14447) {
        this.f65270 = c14447;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C7390(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C7390(this);
    }

    @Override // l.InterfaceC2263
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo6946() {
        return new C20796(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C15858(this, 0, this.f65270.f47387);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C14447 c14447 = this.f65270;
        int i = c14447.f47387;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C17268(c14447, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f65270.f47387;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character) && entry.getValue() != null && (entry.getValue() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C14447 c14447 = this.f65270;
            if (c14447.mo9551(cCharValue) && c14447.mo9552(cCharValue) == ((Character) entry.getValue()).charValue()) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Character) || entry.getValue() == null || !(entry.getValue() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        char cCharValue2 = ((Character) entry.getValue()).charValue();
        C14447 c14447 = this.f65270;
        int iM34848 = c14447.m34848(cCharValue);
        if (iM34848 == -1 || cCharValue2 != c14447.f47385[iM34848]) {
            return false;
        }
        int i = (c14447.f47387 - iM34848) - 1;
        char[] cArr = c14447.f47389;
        int i2 = iM34848 + 1;
        System.arraycopy(cArr, i2, cArr, iM34848, i);
        char[] cArr2 = c14447.f47385;
        System.arraycopy(cArr2, i2, cArr2, iM34848, i);
        c14447.f47387--;
        return true;
    }
}
