package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12402 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 f41426;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16635 f41427;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f41429;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC19706 f41430;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f41431;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C9724 f41436;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC10273 f41434 = new C8862();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f41435 = new IdentityHashMap();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f41425 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f41432 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f41428 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f41433 = new HashSet();

    public C12402(InterfaceC16635 interfaceC16635, InterfaceC8313 interfaceC8313, InterfaceC8065 interfaceC8065, C9724 c9724) {
        this.f41436 = c9724;
        this.f41427 = interfaceC16635;
        this.f41426 = interfaceC8313;
        this.f41431 = interfaceC8065;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30851(List list, InterfaceC10273 interfaceC10273) {
        ArrayList arrayList = this.f41432;
        m30839(0, arrayList.size());
        return m30850(arrayList.size(), list, interfaceC10273);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30850(int i, List list, InterfaceC10273 interfaceC10273) {
        if (!list.isEmpty()) {
            this.f41434 = interfaceC10273;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C0406 c0406 = (C0406) list.get(i2 - i);
                ArrayList arrayList = this.f41432;
                if (i2 > 0) {
                    C0406 c0407 = (C0406) arrayList.get(i2 - 1);
                    c0406.f1897 = c0407.f1893.m4269().mo19929() + c0407.f1897;
                } else {
                    c0406.f1897 = 0;
                }
                c0406.f1896 = false;
                c0406.f1894.clear();
                int iMo19929 = c0406.f1893.m4269().mo19929();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((C0406) arrayList.get(i3)).f1897 += iMo19929;
                }
                arrayList.add(i2, c0406);
                this.f41425.put(c0406.f1895, c0406);
                if (this.f41429) {
                    m30844(c0406);
                    if (this.f41435.isEmpty()) {
                        this.f41433.add(c0406);
                    } else {
                        C20163 c20163 = (C20163) this.f41428.get(c0406);
                        if (c20163 != null) {
                            c20163.f65478.mo17764(c20163.f65477);
                        }
                    }
                }
            }
        }
        return m30847();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30848(int i, int i2, List list) {
        ArrayList arrayList = this.f41432;
        C2023.m6507(i >= 0 && i <= i2 && i2 <= arrayList.size());
        C2023.m6507(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C0406) arrayList.get(i3)).f1893.mo4109((C13689) list.get(i3 - i));
        }
        return m30847();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m30845() {
        return this.f41429;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30849(int i, int i2, InterfaceC10273 interfaceC10273) {
        C2023.m6507(i >= 0 && i <= i2 && i2 <= this.f41432.size());
        this.f41434 = interfaceC10273;
        m30839(i, i2);
        return m30847();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30852(InterfaceC10273 interfaceC10273) {
        int size = this.f41432.size();
        if (interfaceC10273.getLength() != size) {
            interfaceC10273 = interfaceC10273.mo23001().mo22995(size);
        }
        this.f41434 = interfaceC10273;
        return m30847();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30855() {
        C2023.m6507(this.f41432.size() >= 0);
        this.f41434 = null;
        return m30847();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30856() {
        return this.f41432.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30854(InterfaceC19706 interfaceC19706) {
        C2023.m6510(!this.f41429);
        this.f41430 = interfaceC19706;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41432;
            if (i < arrayList.size()) {
                C0406 c0406 = (C0406) arrayList.get(i);
                m30844(c0406);
                this.f41433.add(c0406);
                i++;
            } else {
                this.f41429 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2572 m30846(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        Object obj = c15274.f49778;
        int i = AbstractC18979.f61434;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C15274 c15274M36575 = c15274.m36575(pair.second);
        C0406 c0406 = (C0406) this.f41425.get(obj2);
        c0406.getClass();
        this.f41433.add(c0406);
        C20163 c20163 = (C20163) this.f41428.get(c0406);
        if (c20163 != null) {
            c20163.f65478.mo17761(c20163.f65477);
        }
        c0406.f1894.add(c15274M36575);
        C2572 c2572Mo4105 = c0406.f1893.mo4105(c15274M36575, interfaceC15732, j);
        this.f41435.put(c2572Mo4105, c0406);
        m30838();
        return c2572Mo4105;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30853(InterfaceC6806 interfaceC6806) {
        IdentityHashMap identityHashMap = this.f41435;
        C0406 c0406 = (C0406) identityHashMap.remove(interfaceC6806);
        c0406.getClass();
        c0406.f1893.mo4108(interfaceC6806);
        c0406.f1894.remove(((C2572) interfaceC6806).f10136);
        if (!identityHashMap.isEmpty()) {
            m30838();
        }
        m30840(c0406);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30858() {
        HashMap map = this.f41428;
        for (C20163 c20163 : map.values()) {
            try {
                c20163.f65478.mo17768(c20163.f65477);
            } catch (RuntimeException e) {
                C0303.m1854("Failed to release child source.", e);
            }
            InterfaceC18095 interfaceC18095 = c20163.f65478;
            C15930 c15930 = c20163.f65479;
            interfaceC18095.mo17760((InterfaceC20918) c15930);
            c20163.f65478.mo17758((InterfaceC16262) c15930);
        }
        map.clear();
        this.f41433.clear();
        this.f41429 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16511 m30847() {
        ArrayList arrayList = this.f41432;
        if (arrayList.isEmpty()) {
            return AbstractC16511.f53035;
        }
        int iMo19929 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C0406 c0406 = (C0406) arrayList.get(i);
            c0406.f1897 = iMo19929;
            iMo19929 += c0406.f1893.m4269().mo19929();
        }
        return new C9580(arrayList, this.f41434);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10273 m30857() {
        return this.f41434;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m30838() {
        Iterator it = this.f41433.iterator();
        while (it.hasNext()) {
            C0406 c0406 = (C0406) it.next();
            if (c0406.f1894.isEmpty()) {
                C20163 c20163 = (C20163) this.f41428.get(c0406);
                if (c20163 != null) {
                    c20163.f65478.mo17764(c20163.f65477);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30839(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f41432;
            C0406 c0406 = (C0406) arrayList.remove(i3);
            this.f41425.remove(c0406.f1895);
            int i4 = -c0406.f1893.m4269().mo19929();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C0406) arrayList.get(i5)).f1897 += i4;
            }
            c0406.f1896 = true;
            if (this.f41429) {
                m30840(c0406);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۜ۫ۙ, l.᩸ܰܰ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30844(C0406 c0406) {
        C1161 c1161 = c0406.f1893;
        ?? r1 = new InterfaceC21623() { // from class: l.ۜ۫ۙ
            @Override // l.InterfaceC21623
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo18265(AbstractC6537 abstractC6537, AbstractC16511 abstractC16511) {
                ((C0530) this.f22790.f41427).m2520();
            }
        };
        C15930 c15930 = new C15930(this, c0406);
        this.f41428.put(c0406, new C20163(c1161, r1, c15930));
        String str = C17983.f57504;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c1161.mo17757(new Handler(looperMyLooper, null), (InterfaceC20918) c15930);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c1161.mo17756(new Handler(looperMyLooper2, null), (InterfaceC16262) c15930);
        c1161.mo17762((InterfaceC21623) r1, this.f41430, this.f41436);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30840(C0406 c0406) {
        if (c0406.f1896 && c0406.f1894.isEmpty()) {
            C20163 c20163 = (C20163) this.f41428.remove(c0406);
            c20163.getClass();
            C15930 c15930 = c20163.f65479;
            InterfaceC18095 interfaceC18095 = c20163.f65478;
            interfaceC18095.mo17768(c20163.f65477);
            interfaceC18095.mo17760((InterfaceC20918) c15930);
            interfaceC18095.mo17758((InterfaceC16262) c15930);
            this.f41433.remove(c0406);
        }
    }
}
