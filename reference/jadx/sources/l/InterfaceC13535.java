package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܰۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13535 extends Collection, InterfaceC19179 {
    boolean add(float f);

    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC19179
    InterfaceC10007 iterator();

    @Override // java.util.Collection, l.InterfaceC10441
    @Deprecated
    InterfaceC5046 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    InterfaceC11501 spliterator();

    @Override // java.util.Collection, l.InterfaceC10441
    @Deprecated
    InterfaceC5046 stream();

    /* JADX INFO: renamed from: ۙ */
    boolean mo6888(InterfaceC1539 interfaceC1539);

    /* JADX INFO: renamed from: ۚ */
    boolean mo6889(float f);

    @Deprecated
    /* JADX INFO: renamed from: ܰ */
    boolean mo6891(Float f);

    /* JADX INFO: renamed from: ᩹ */
    boolean mo5900(float f);
}
