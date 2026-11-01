package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5BR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10749 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC21414[] f36647 = new InterfaceC21414[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36646 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27043(String str, InterfaceC21414 interfaceC21414) {
        ArrayList arrayList = this.f36646;
        int size = arrayList.size();
        InterfaceC21414[] interfaceC21414Arr = this.f36647;
        if (size == interfaceC21414Arr.length) {
            InterfaceC21414[] interfaceC21414Arr2 = new InterfaceC21414[interfaceC21414Arr.length + 10];
            this.f36647 = interfaceC21414Arr2;
            System.arraycopy(interfaceC21414Arr, 0, interfaceC21414Arr2, 0, interfaceC21414Arr.length);
        }
        this.f36647[arrayList.size()] = interfaceC21414;
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27042(String str) {
        int iIndexOf = this.f36646.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new RuntimeException("Null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27044(C0164 c0164, int i) {
        this.f36647[i].mo3144(c0164.f1249);
    }

    public C10749() {
        m27043("FqEbNJXkJJiNHyALXoAPmNssdfAfNBwo", new C19378());
        m27043("VccaTcBCLZNJJFdPoFgCfDEXEfyLbLRc", new C13426());
        m27043("EPBCJBqAFiXcEDiZdDcukBwcwgiRscVA", new C17886());
        m27043("CTHiqssoBaukCbPJsgNBkFeCwooFJZbf", new C21460());
        m27043("qoNZDuCTyLXAuEZHyHscRAodgmRgkJVA", new C9421());
        m27043("ybqoPJTkJJFqmNPBdfToJBZDdTDCNdiR", new C13012());
        m27043("NBwgiNDasoayTwBCayNZeyybZTbXcyHi", new C13672());
        C15065.m36097(this);
        C3546.m10460(this);
        C6845.m18450(this);
        C1430.m5000(this);
        C17181.m40103(this);
        C8009.m21104(this);
        C1658.m5563(this);
        C7781.m20455(this);
    }
}
