package l;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۤ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10609 extends List, Comparable, InterfaceC10131 {
    void add(int i, int i2);

    @Override // l.InterfaceC10131
    boolean add(int i);

    @Override // java.util.List
    @Deprecated
    Integer get(int i);

    int getInt(int i);

    int indexOf(int i);

    @Override // java.util.List
    @Deprecated
    int indexOf(Object obj);

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, l.InterfaceC10131, l.InterfaceC22603
    InterfaceC21191 iterator();

    int lastIndexOf(int i);

    @Override // java.util.List
    @Deprecated
    int lastIndexOf(Object obj);

    @Override // java.util.List
    InterfaceC21191 listIterator();

    @Override // java.util.List
    InterfaceC21191 listIterator(int i);

    @Override // java.util.List
    @Deprecated
    Integer remove(int i);

    int set(int i, int i2);

    @Override // java.util.List
    InterfaceC10609 subList(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo3166(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo3167(int i, int i2, int i3, int[] iArr);

    /* JADX INFO: renamed from: ۙ */
    void mo3168(int i, int i2, int[] iArr);

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    void mo26775(int i, Integer num);

    /* JADX INFO: renamed from: ۙ */
    void mo3169(IntUnaryOperator intUnaryOperator);

    /* JADX INFO: renamed from: ۨ */
    void mo3174(InterfaceC16481 interfaceC16481);

    /* JADX INFO: renamed from: ۨ */
    void mo3175(int[] iArr);

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    Integer mo26776(int i, Integer num);

    /* JADX INFO: renamed from: ܰ */
    void mo3177(int i, int i2, int[] iArr);

    /* JADX INFO: renamed from: ܰ */
    void mo3178(InterfaceC16481 interfaceC16481);

    /* JADX INFO: renamed from: ܰ */
    void mo3179(int[] iArr);

    /* JADX INFO: renamed from: ᩳ */
    int mo3180(int i);
}
