package l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10179 implements InterfaceC15241 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7356 f34764;

    public C10179(C7356 c7356) {
        this.f34764 = c7356;
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo25907(Object obj) {
        return ((C7701) obj).m20332();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo25908(Object obj) {
        return ((C7701) obj).m20334();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo25906(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        C7356 c7356 = this.f34764;
        List list = (List) C9030.stream(c7356.f24424.m28195(c7356.m19631(strM28608))).skip(1L).collect(C1890.toList());
        if (c7356.f24425 == null && !list.isEmpty()) {
            try {
                C7356.m19628(c7356, list, strM28608);
            } catch (IOException unused) {
            }
        }
        return list;
    }
}
