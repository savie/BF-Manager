package l;

import java.util.List;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۡ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9018 extends List, Comparable, InterfaceC1340 {
    void add(int i, int i2);

    @Override // l.InterfaceC1340
    boolean add(int i);

    @Override // java.util.List
    @Deprecated
    Integer get(int i);

    int getInt(int i);

    int indexOf(int i);

    @Override // java.util.List
    @Deprecated
    int indexOf(Object obj);

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, l.InterfaceC1340, l.InterfaceC20206
    InterfaceC8273 iterator();

    int lastIndexOf(int i);

    @Override // java.util.List
    @Deprecated
    int lastIndexOf(Object obj);

    @Override // java.util.List
    InterfaceC8273 listIterator();

    @Override // java.util.List
    InterfaceC8273 listIterator(int i);

    @Override // java.util.List
    @Deprecated
    Integer remove(int i);

    int set(int i, int i2);

    @Override // java.util.List
    InterfaceC9018 subList(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo14687(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    void mo14688(int i, int i2, int i3, int[] iArr);

    /* JADX INFO: renamed from: ۙ */
    void mo14689(int i, int i2, int[] iArr);

    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    void mo18911(int i, Integer num);

    /* JADX INFO: renamed from: ۙ */
    void mo14690(IntUnaryOperator intUnaryOperator);

    /* JADX INFO: renamed from: ۤ */
    void mo14694(InterfaceC4544 interfaceC4544);

    /* JADX INFO: renamed from: ۤ */
    void mo14695(int[] iArr);

    /* JADX INFO: renamed from: ܶ */
    int mo14697(int i);

    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    Integer mo18912(int i, Integer num);

    /* JADX INFO: renamed from: ᩷ */
    void mo14698(int i, int i2, int[] iArr);

    /* JADX INFO: renamed from: ᩷ */
    void mo14699(InterfaceC4544 interfaceC4544);

    /* JADX INFO: renamed from: ᩷ */
    void mo14700(int[] iArr);
}
