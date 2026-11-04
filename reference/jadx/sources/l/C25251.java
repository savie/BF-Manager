package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C8YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C25251 implements InterfaceC9674 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f81575;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f81577 = new HashSet(3);

    public C25251(ArrayList arrayList) {
        this.f81575 = arrayList;
        this.f81576 = new ArrayList(arrayList.size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m56392() {
        Iterator it = this.f81575.iterator();
        while (it.hasNext()) {
            m56391((InterfaceC2963) it.next());
        }
        return this.f81576;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56391(InterfaceC2963 interfaceC2963) {
        ArrayList arrayList = this.f81576;
        if (arrayList.contains(interfaceC2963)) {
            return;
        }
        HashSet hashSet = this.f81577;
        if (hashSet.contains(interfaceC2963)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(interfaceC2963);
        interfaceC2963.mo9655(this);
        hashSet.remove(interfaceC2963);
        if (arrayList.contains(interfaceC2963)) {
            return;
        }
        if (C4981.class.isAssignableFrom(interfaceC2963.getClass())) {
            arrayList.add(0, interfaceC2963);
        } else {
            arrayList.add(interfaceC2963);
        }
    }

    @Override // l.InterfaceC9674
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2963 mo25247() {
        InterfaceC2963 interfaceC2963;
        InterfaceC2963 interfaceC2964;
        Iterator it = this.f81576.iterator();
        do {
            interfaceC2963 = null;
            if (!it.hasNext()) {
                interfaceC2964 = null;
                break;
            }
            interfaceC2964 = (InterfaceC2963) it.next();
        } while (!C4981.class.isAssignableFrom(interfaceC2964.getClass()));
        if (interfaceC2964 != null) {
            return interfaceC2964;
        }
        List<InterfaceC2963> list = this.f81575;
        for (InterfaceC2963 interfaceC2965 : list) {
            if (C4981.class.isAssignableFrom(interfaceC2965.getClass())) {
                interfaceC2963 = interfaceC2965;
                break;
            }
        }
        if (interfaceC2963 == null) {
            throw new IllegalStateException("Requested plugin is not added: " + C4981.class.getName() + ", plugins: " + list);
        }
        m56391(interfaceC2963);
        return interfaceC2963;
    }
}
