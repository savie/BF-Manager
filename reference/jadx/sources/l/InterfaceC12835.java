package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۫ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SBNY */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12835 extends Collection, InterfaceC3886 {
    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC3886
    InterfaceC21040 iterator();

    @Override // java.util.Collection, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: parallelStream */
    InterfaceC20670 mo52748parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    InterfaceC16321 spliterator();

    @Override // java.util.Collection, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: stream */
    InterfaceC20670 mo52749stream();

    /* JADX INFO: renamed from: ۙ */
    boolean mo5933(char c);

    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    boolean mo5934(Character ch);

    /* JADX INFO: renamed from: ۙ */
    boolean mo5935(InterfaceC13338 interfaceC13338);

    /* JADX INFO: renamed from: ۫ */
    boolean mo5936(char c);

    /* JADX INFO: renamed from: ᩴ */
    boolean mo4843(char c);
}
