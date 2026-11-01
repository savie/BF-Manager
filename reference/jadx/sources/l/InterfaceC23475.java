package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩻ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBNY */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC23475 extends Collection, InterfaceC6809 {
    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC6809
    InterfaceC15277 iterator();

    @Override // java.util.Collection, l.InterfaceC10441
    @Deprecated
    InterfaceC5046 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.lang.Iterable, l.InterfaceC23475, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    InterfaceC11687 spliterator();

    @Override // java.util.Collection, l.InterfaceC10441
    @Deprecated
    InterfaceC5046 stream();

    /* JADX INFO: renamed from: ֨ */
    boolean mo2286(char c);

    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    boolean mo5453(Character ch);

    /* JADX INFO: renamed from: ۙ */
    boolean mo5454(InterfaceC23744 interfaceC23744);

    /* JADX INFO: renamed from: ۚ */
    boolean mo5455(char c);

    /* JADX INFO: renamed from: ܰ */
    boolean mo2291(char c);
}
