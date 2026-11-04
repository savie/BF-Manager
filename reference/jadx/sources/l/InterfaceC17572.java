package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܽۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17572 extends Collection, InterfaceC10113 {
    boolean add(float f);

    @Override // java.util.Collection, l.InterfaceC17572
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10113
    InterfaceC9367 iterator();

    @Override // l.InterfaceC17572, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: parallelStream */
    InterfaceC20670 mo52748parallelStream();

    @Override // java.util.Collection, l.InterfaceC17572
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC15906 spliterator();

    @Override // l.InterfaceC17572, l.InterfaceC9372
    @Deprecated
    /* JADX INFO: renamed from: stream */
    InterfaceC20670 mo52749stream();

    /* JADX INFO: renamed from: ۙ */
    boolean mo2880(InterfaceC1737 interfaceC1737);

    /* JADX INFO: renamed from: ܳ */
    boolean mo6580(float f);

    /* JADX INFO: renamed from: ᩴ */
    boolean mo2883(float f);

    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    boolean mo2885(Float f);
}
