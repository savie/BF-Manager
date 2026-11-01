package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3275 extends AbstractC6741 implements Iterable, InterfaceC12387, InterfaceC16585 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14504 f12144;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12145;

    @Override // java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C3275(AbstractC14504 abstractC14504, Class cls, int i) {
        this.f12144 = abstractC14504;
        this.f12145 = new ArrayList(i);
        this.f22696 = EnumC10020.m25295(cls);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m9756() {
        ArrayList arrayList = this.f12145;
        return !arrayList.isEmpty() && (arrayList.get(0) instanceof InterfaceC12387);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9755(AbstractC6741 abstractC6741) {
        if (abstractC6741 instanceof AbstractC14504) {
            ((AbstractC14504) abstractC6741).f47514 = this.f12144;
        }
        this.f12145.add(abstractC6741);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public void mo3628() {
        ArrayList arrayList = this.f12145;
        int size = arrayList.size();
        if (size > 0) {
            boolean zM25300 = this.f22696.m25300();
            mo9754(mo9753());
            for (int i = 0; i < size; i++) {
                AbstractC6741 abstractC6741 = (AbstractC6741) arrayList.get(i);
                if (abstractC6741 instanceof InterfaceC12387) {
                    ((InterfaceC12387) abstractC6741).mo9754(mo9753());
                }
                abstractC6741.f22686 = this.f22686;
                if (zM25300 && mo18231()) {
                    abstractC6741.mo14101(i, size);
                } else {
                    abstractC6741.mo14102(i, size);
                }
            }
        }
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo9757() {
        ArrayList arrayList = this.f12145;
        return !arrayList.isEmpty() && C9030.stream(arrayList).anyMatch(new C9627(0));
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo9753() {
        if (!this.f22697 && m9756()) {
            this.f22688 = m9756() ? C9030.stream(this.f12145).map(new C1533(9)).mapToInt(new C23738()).max().orElse(0) : 0;
            this.f22697 = true;
        }
        return this.f22688;
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9754(final int i) {
        if (i <= 0 || !m9756()) {
            return;
        }
        C9030.stream(this.f12145).map(new C14566(0)).peek(new Consumer() { // from class: l.֫ܰۤ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                ((InterfaceC12387) obj).mo9754(i);
            }
        });
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12145.iterator();
    }

    @Override // java.lang.Iterable, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C0356.forEach(this.f12145, consumer);
    }

    @Override // java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return C23846.spliterator(this.f12145);
    }
}
