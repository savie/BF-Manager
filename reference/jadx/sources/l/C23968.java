package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5BR */
/* JADX INFO: loaded from: classes.dex */
public final class C23968 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22760[] f77569 = new InterfaceC22760[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77568 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53498(String str, InterfaceC22760 interfaceC22760) {
        ArrayList arrayList = this.f77568;
        int size = arrayList.size();
        InterfaceC22760[] interfaceC22760Arr = this.f77569;
        if (size == interfaceC22760Arr.length) {
            InterfaceC22760[] interfaceC22760Arr2 = new InterfaceC22760[interfaceC22760Arr.length + 10];
            this.f77569 = interfaceC22760Arr2;
            System.arraycopy(interfaceC22760Arr, 0, interfaceC22760Arr2, 0, interfaceC22760Arr.length);
        }
        this.f77569[arrayList.size()] = interfaceC22760;
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53497(String str) {
        int iIndexOf = this.f77568.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new RuntimeException("Null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53499(C23222 c23222, int i) {
        this.f77569[i].mo1200(c23222.f75230);
    }

    public C23968() {
        m53498("FqEbNJXkJJiNHyALXoAPmNssdfAfNBwo", new C17933());
        m53498("VccaTcBCLZNJJFdPoFgCfDEXEfyLbLRc", new C13808());
        m53498("EPBCJBqAFiXcEDiZdDcukBwcwgiRscVA", new C15300());
        m53498("CTHiqssoBaukCbPJsgNBkFeCwooFJZbf", new C18969());
        m53498("qoNZDuCTyLXAuEZHyHscRAodgmRgkJVA", new C0385(0));
        m53498("ybqoPJTkJJFqmNPBdfToJBZDdTDCNdiR", new C25040());
        m53498("NBwgiNDasoayTwBCayNZeyybZTbXcyHi", new C19776());
        C10825.m27554(this);
        C19425.m44917(this);
        C10978.m27823(this);
        C7097.m19440(this);
        C6352.m18070(this);
        C5606.m16583(this);
        C18284.m42617(this);
        C17187.m40356(this);
    }
}
