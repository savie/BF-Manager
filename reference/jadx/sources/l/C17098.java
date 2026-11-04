package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17098 extends AbstractC24319 implements InterfaceC9794 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC22631 f55816 = EnumC22631.f73432;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f55817;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public C17098(ArrayList arrayList, int i) {
        super(f55816);
        if (arrayList == null) {
            this.f55817 = AbstractC1928.of();
            return;
        }
        this.f55817 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f55817.add(new C23812(this, i, (C21335) it.next()));
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC14379
    /* JADX INFO: renamed from: ֡ */
    public final List mo20143() {
        return this.f55817;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC12384, l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public final int mo3033() {
        return (this.f55817.size() * 2) + 4;
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f55816.f73508;
    }
}
