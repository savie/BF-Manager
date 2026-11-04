package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public class C12381 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f39750 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7660 f39751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39752;

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3359 mo7367(C15291 c15291) {
        Iterator it = this.f39750.iterator();
        while (it.hasNext()) {
            ((C20586) it.next()).mo7367(c15291);
        }
        return this;
    }

    public C12381(C7660 c7660, boolean z) {
        this.f39751 = c7660;
        this.f39752 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30862(C20586 c20586) {
        this.f39750.add(c20586);
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f39751.f67820);
        ArrayList arrayList = this.f39750;
        c11388.m28740(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3359) it.next()).mo1599(c11388);
        }
    }

    @Override // l.InterfaceC3359
    public int getLength() {
        return C1170.stream(this.f39750).flatMapToInt(new C8110(5)).sum() + 4;
    }
}
