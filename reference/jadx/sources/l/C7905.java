package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.۟۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7MF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7905 implements InterfaceC9584 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9584 f26260;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f26261;

    public C7905(InterfaceC9584 interfaceC9584, List list) {
        this.f26260 = interfaceC9584;
        this.f26261 = list;
    }

    @Override // l.InterfaceC9584
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo21443(Uri uri, C2247 c2247) {
        AbstractC23415 abstractC23415 = (AbstractC23415) this.f26260.mo21443(uri, c2247);
        List list = this.f26261;
        return (list == null || list.isEmpty()) ? abstractC23415 : (AbstractC23415) abstractC23415.mo38069(list);
    }
}
