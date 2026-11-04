package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes.dex */
public final class C23926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f77455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77456;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f77457;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC15720 f77458;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77459;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f77460;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f77461;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3042 f77462;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f77463;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f77464;

    public C23926(C11991 c11991) {
        this.f77456 = C5147.m15548(c11991.f38636, c11991.f38638);
        InterfaceC3042 interfaceC3042M30139 = C11991.m30139(c11991);
        this.f77462 = interfaceC3042M30139;
        this.f77459 = c11991.f38645;
        ArrayList arrayList = c11991.f38642;
        this.f77464 = arrayList;
        ArrayList arrayList2 = c11991.f38643;
        this.f77463 = arrayList2;
        ArrayList arrayList3 = c11991.f38637;
        this.f77460 = arrayList3;
        HashSet hashSet = c11991.f38640;
        this.f77461 = hashSet;
        this.f77458 = c11991.f38644;
        this.f77455 = c11991.f38639;
        int i = c11991.f38635;
        this.f77457 = i;
        interfaceC3042M30139.mo9894(new C11858(arrayList, arrayList2, arrayList3, hashSet, i, new C20354(1)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4534 m53443(String str) {
        C17359.requireNonNull(str, "input must not be null");
        AbstractC4534 abstractC4534M15558 = new C5147(this.f77456, this.f77462, this.f77464, this.f77463, this.f77460, this.f77461, this.f77458, this.f77455, this.f77457).m15558(str);
        Iterator it = this.f77459.iterator();
        while (it.hasNext()) {
            abstractC4534M15558 = ((InterfaceC3788) it.next()).mo12323(abstractC4534M15558);
        }
        return abstractC4534M15558;
    }
}
