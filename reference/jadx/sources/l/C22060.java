package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7MF */
/* JADX INFO: loaded from: classes.dex */
public final class C22060 implements InterfaceC15524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15524 f71482;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f71483;

    public C22060(InterfaceC15524 interfaceC15524, List list) {
        this.f71482 = interfaceC15524;
        this.f71483 = list;
    }

    @Override // l.InterfaceC15524
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5207(Uri uri, C0261 c0261) {
        AbstractC10681 abstractC10681 = (AbstractC10681) this.f71482.mo5207(uri, c0261);
        List list = this.f71483;
        return (list == null || list.isEmpty()) ? abstractC10681 : (AbstractC10681) abstractC10681.mo15798(list);
    }
}
