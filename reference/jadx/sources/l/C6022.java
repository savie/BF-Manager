package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6022 extends AbstractC13639 implements InterfaceC22969 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC10297 f20488 = EnumC10297.f35054;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f20489;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public C6022(ArrayList arrayList, int i) {
        super(f20488);
        if (arrayList == null) {
            this.f20489 = AbstractC22433.of();
            return;
        }
        this.f20489 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f20489.add(new C14490(this, i, (C5171) it.next()));
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC5391
    /* JADX INFO: renamed from: ܽ */
    public final List mo14955() {
        return this.f20489;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC3384, l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public final int mo5436() {
        return (this.f20489.size() * 2) + 4;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f20488.f35328;
    }
}
