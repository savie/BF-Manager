package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public class C11514 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15187 f38706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f38707 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38708;

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC4705 mo15810(C12738 c12738) {
        Iterator it = this.f38707.iterator();
        while (it.hasNext()) {
            ((C13631) it.next()).mo15810(c12738);
        }
        return this;
    }

    public C11514(C15187 c15187, boolean z) {
        this.f38706 = c15187;
        this.f38708 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28699(C13631 c13631) {
        this.f38707.add(c13631);
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f38706.f43854);
        ArrayList arrayList = this.f38707;
        c23509.m51770(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4705) it.next()).mo2341(c23509);
        }
    }

    @Override // l.InterfaceC4705
    public int getLength() {
        return C9030.stream(this.f38707).flatMapToInt(new C4457()).sum() + 4;
    }
}
