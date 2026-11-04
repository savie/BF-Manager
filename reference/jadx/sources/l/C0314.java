package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: UITQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0314 extends AbstractC16678 implements InterfaceC23435 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f1716;

    public final String toString() {
        return "InsnContainer";
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        C15975.m38093(this, c13476, interfaceC3145);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String mo1988() {
        return "IC";
    }

    public C0314(C18959 c18959) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c18959);
        this.f1716 = arrayList;
    }

    public C0314(List list) {
        this.f1716 = list;
    }

    @Override // l.InterfaceC23435
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo1986() {
        return this.f1716;
    }
}
