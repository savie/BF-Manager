package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes5.dex */
public class C16521 extends AbstractC20997 implements Iterable, InterfaceC10838, InterfaceC22091 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53488;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1890 f53489;

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C16521(AbstractC1890 abstractC1890, Class cls, int i) {
        this.f53489 = abstractC1890;
        this.f53488 = new ArrayList(i);
        this.f67131 = EnumC10882.m27628(cls);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m39149() {
        ArrayList arrayList = this.f53488;
        return !arrayList.isEmpty() && (arrayList.get(0) instanceof InterfaceC10838);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39148(AbstractC20997 abstractC20997) {
        if (abstractC20997 instanceof AbstractC1890) {
            ((AbstractC1890) abstractC20997).f6376 = this.f53489;
        }
        this.f53488.add(abstractC20997);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public void mo1688() {
        ArrayList arrayList = this.f53488;
        int size = arrayList.size();
        if (size > 0) {
            boolean zM27633 = this.f67131.m27633();
            mo12383(mo12385());
            for (int i = 0; i < size; i++) {
                AbstractC20997 abstractC20997 = (AbstractC20997) arrayList.get(i);
                if (abstractC20997 instanceof InterfaceC10838) {
                    ((InterfaceC10838) abstractC20997).mo12383(mo12385());
                }
                abstractC20997.f67148 = this.f67148;
                if (zM27633 && mo5637()) {
                    abstractC20997.mo11100(i, size);
                } else {
                    abstractC20997.mo11099(i, size);
                }
            }
        }
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo19009() {
        ArrayList arrayList = this.f53488;
        return !arrayList.isEmpty() && C1170.stream(arrayList).anyMatch(new C24727(0));
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ᩸ */
    public final int mo12385() {
        if (!this.f67134 && m39149()) {
            this.f67136 = m39149() ? C1170.stream(this.f53488).map(new C8110(6)).mapToInt(new C1544(1)).max().orElse(0) : 0;
            this.f67134 = true;
        }
        return this.f67136;
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ۙ */
    public final void mo12383(int i) {
        if (i <= 0 || !m39149()) {
            return;
        }
        C1170.stream(this.f53488).map(new C10346(6)).peek(new C11300(i, 0));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f53488.iterator();
    }

    @Override // java.lang.Iterable, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C4937.forEach(this.f53488, consumer);
    }

    @Override // java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return C12884.spliterator(this.f53488);
    }
}
