package l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۘᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4336 implements InterfaceC17058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14776 f15701;

    public C4336(C14776 c14776) {
        this.f15701 = c14776;
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12540(Object obj) {
        return ((C7087) obj).m19424();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ᩷ */
    public final String mo12541(Object obj) {
        return ((C7087) obj).m19422();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final List mo12539(String str) {
        String strM20187 = AbstractC7364.m20187(str);
        C14776 c14776 = this.f15701;
        List list = (List) C1170.stream(c14776.f48351.m17320(c14776.m35566(strM20187))).skip(1L).collect(C2025.toList());
        if (c14776.f48348 == null && !list.isEmpty()) {
            try {
                C14776.m35565(c14776, list, strM20187);
            } catch (IOException unused) {
            }
        }
        return list;
    }
}
