package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2934 implements InterfaceC2605 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8900 f9599;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9600;

    public C2934(C8900 c8900, int i) {
        this.f9599 = c8900;
        this.f9600 = i;
    }

    @Override // l.InterfaceC2605
    /* JADX INFO: renamed from: ۙ */
    public final C12629 mo5195(String str, EnumC6161 enumC6161) {
        C8900 c8900 = this.f9599;
        List[] listArr = c8900.f29082;
        int i = this.f9600;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(5);
            c8900.f29082[i] = arrayList;
        }
        C12629 c12629 = new C12629(str, enumC6161);
        arrayList.add(c12629);
        return c12629;
    }
}
