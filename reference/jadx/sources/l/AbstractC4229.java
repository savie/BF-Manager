package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4229 implements InterfaceC16842 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4229 f15428;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15429;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f15432;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f15433;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24367 f15436;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f15438;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4910 f15435 = new C4910();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10875 f15437 = new C10875();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4910 f15430 = new C4910();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo13506(InterfaceC5656 interfaceC5656);

    public AbstractC4229(C24367 c24367, int i, int i2) {
        this.f15436 = c24367;
        this.f15434 = new ArrayList(i);
        this.f15431 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m13516() {
        return this.f15433;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13519(String str) {
        this.f15433 = this.f15436.m54478(str);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m13512() {
        return this.f15432;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13514(String str) {
        this.f15432 = this.f15436.m54478(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13520(AbstractC4229 abstractC4229) {
        this.f15428 = abstractC4229;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13518() {
        return this.f15429;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13502(int i) {
        this.f15429 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10875 m13522() {
        return this.f15437;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13504(String str) {
        this.f15437.add(this.f15436.m54478(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13505(AbstractC4229 abstractC4229) {
        this.f15435.add(abstractC4229);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4910 m13515() {
        return this.f15430;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13510(C21383 c21383) {
        this.f15430.add(c21383);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13517() {
        return this.f15434;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13507(C7958 c7958) {
        this.f15434.add(c7958);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13513() {
        return this.f15431;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13509(C18399 c18399) {
        this.f15431.add(c18399);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13511(boolean z, boolean z2, boolean z3, boolean z4, InterfaceC5656 interfaceC5656) {
        AbstractC4229 abstractC4229;
        AbstractC4229 abstractC42210;
        if (z) {
            mo13506(interfaceC5656);
        }
        if (z2 && (abstractC42210 = this.f15428) != null) {
            abstractC42210.m13511(true, true, z3, false, interfaceC5656);
        }
        if (z3) {
            if (!z2 && (abstractC4229 = this.f15428) != null) {
                abstractC4229.m13511(false, false, true, false, interfaceC5656);
            }
            C4910 c4910 = this.f15435;
            int size = c4910.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC4229) c4910.get(i)).m13511(true, false, true, false, interfaceC5656);
            }
        }
        if (z4) {
            C4910 c4911 = this.f15430;
            int size2 = c4911.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AbstractC4229) c4911.get(i2)).m13511(true, false, false, true, interfaceC5656);
            }
        }
    }

    @Override // l.InterfaceC16842
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo13501() {
        return this.f15438;
    }

    @Override // l.InterfaceC16842
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13503(Object obj) {
        this.f15438 = obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13521(InterfaceC11621 interfaceC11621) {
        ArrayList arrayList = this.f15434;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC14669) arrayList.get(i)).mo21663(this, interfaceC11621);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13508(InterfaceC11621 interfaceC11621) {
        ArrayList arrayList = this.f15431;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC14669) arrayList.get(i)).mo21663(this, interfaceC11621);
        }
    }
}
