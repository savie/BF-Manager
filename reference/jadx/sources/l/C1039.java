package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֨ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes3.dex */
public class C1039 extends AbstractC8802 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13035 f4840;

    public C1039(AbstractC13035 abstractC13035) {
        this.f4840 = abstractC13035;
    }

    @Override // l.InterfaceC23475
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2286(char c) {
        return this.f4840.mo15965(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4840.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4840.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f4840.comparator();
        return null;
    }
}
