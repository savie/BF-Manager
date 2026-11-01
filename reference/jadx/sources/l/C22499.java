package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M8XG */
/* JADX INFO: loaded from: classes.dex */
public final class C22499 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15840 f73450 = new C15840();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3117 f73451 = new C3117();

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f73450;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        if (interfaceC8119.mo21199()) {
            return null;
        }
        return C22168.m49178(interfaceC8119.getIndex());
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo1822(C11647 c11647) {
        this.f73451.m9380(c11647);
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo48248(C0316 c0316) {
        this.f73451.m9379(c0316);
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۘ */
    public final List mo48247() {
        C11606 c11606 = new C11606();
        for (C17955 c17955 : this.f73451.m9377()) {
            c11606.m28937(c17955.m41782(), c17955);
        }
        Object[] objArr = {c11606};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C13638.requireNonNull(obj);
        arrayList.add(obj);
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۬ */
    public final void mo1824() {
        C15840 c15840;
        C3117 c3117 = this.f73451;
        Iterator it = c3117.m9377().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c15840 = this.f73450;
            if (!zHasNext) {
                break;
            } else {
                c15840.m44387((C17955) it.next());
            }
        }
        if (c3117.m9382().m7582()) {
            c15840.m44391();
        } else {
            c15840.m44384(c3117.m9381());
        }
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo19625(InterfaceC14429 interfaceC14429) {
        C2473 c2473M9382 = this.f73451.m9382();
        if (c2473M9382.m7582()) {
            return;
        }
        interfaceC14429.mo5680(c2473M9382, this.f73450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2473 m50016() {
        return this.f73451.m9382();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m50015(int i) {
        return this.f73451.m9378(i);
    }
}
