package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14898 extends AbstractList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f48673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2196 f48674;

    public C14898(InterfaceC2196 interfaceC2196, List list) {
        this.f48674 = interfaceC2196;
        this.f48673 = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return C15604.m37269(this.f48674, this.f48673.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48673.size();
    }
}
