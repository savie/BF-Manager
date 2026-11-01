package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8YQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1476 implements InterfaceC19116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f6005;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6006;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f6007 = new HashSet(3);

    public C1476(ArrayList arrayList) {
        this.f6005 = arrayList;
        this.f6006 = new ArrayList(arrayList.size());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m5124() {
        Iterator it = this.f6005.iterator();
        while (it.hasNext()) {
            m5122((InterfaceC8533) it.next());
        }
        return this.f6006;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5122(InterfaceC8533 interfaceC8533) {
        ArrayList arrayList = this.f6006;
        if (arrayList.contains(interfaceC8533)) {
            return;
        }
        HashSet hashSet = this.f6007;
        if (hashSet.contains(interfaceC8533)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(interfaceC8533);
        interfaceC8533.mo3312(this);
        hashSet.remove(interfaceC8533);
        if (arrayList.contains(interfaceC8533)) {
            return;
        }
        if (C16064.class.isAssignableFrom(interfaceC8533.getClass())) {
            arrayList.add(0, interfaceC8533);
        } else {
            arrayList.add(interfaceC8533);
        }
    }

    @Override // l.InterfaceC19116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8533 mo5123() {
        InterfaceC8533 interfaceC8533;
        InterfaceC8533 interfaceC8534;
        Iterator it = this.f6006.iterator();
        do {
            interfaceC8533 = null;
            if (!it.hasNext()) {
                interfaceC8534 = null;
                break;
            }
            interfaceC8534 = (InterfaceC8533) it.next();
        } while (!C16064.class.isAssignableFrom(interfaceC8534.getClass()));
        if (interfaceC8534 != null) {
            return interfaceC8534;
        }
        List<InterfaceC8533> list = this.f6005;
        for (InterfaceC8533 interfaceC8535 : list) {
            if (C16064.class.isAssignableFrom(interfaceC8535.getClass())) {
                interfaceC8533 = interfaceC8535;
                break;
            }
        }
        if (interfaceC8533 == null) {
            throw new IllegalStateException("Requested plugin is not added: " + C16064.class.getName() + ", plugins: " + list);
        }
        m5122(interfaceC8533);
        return interfaceC8533;
    }
}
