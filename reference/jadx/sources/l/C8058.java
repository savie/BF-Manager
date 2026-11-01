package l;

import java.util.List;

/* JADX INFO: renamed from: l.۠۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8058 extends AbstractC19347 {
    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21203(long j, Object obj) {
        ((InterfaceC2016) C15882.m37785(j, obj)).mo6483();
    }

    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21204(long j, Object obj, Object obj2) {
        InterfaceC2016 interfaceC2016Mo3072 = (InterfaceC2016) C15882.m37785(j, obj);
        InterfaceC2016 interfaceC2016 = (InterfaceC2016) C15882.m37785(j, obj2);
        int size = interfaceC2016Mo3072.size();
        int size2 = interfaceC2016.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC2016Mo3072.mo6484()) {
                interfaceC2016Mo3072 = interfaceC2016Mo3072.mo3072(size2 + size);
            }
            interfaceC2016Mo3072.addAll(interfaceC2016);
        }
        if (size > 0) {
            interfaceC2016 = interfaceC2016Mo3072;
        }
        C15882.m37774(j, obj, interfaceC2016);
    }

    @Override // l.AbstractC19347
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List mo21205(long j, Object obj) {
        InterfaceC2016 interfaceC2016 = (InterfaceC2016) C15882.m37785(j, obj);
        if (interfaceC2016.mo6484()) {
            return interfaceC2016;
        }
        int size = interfaceC2016.size();
        InterfaceC2016 interfaceC2016Mo3072 = interfaceC2016.mo3072(size == 0 ? 10 : size * 2);
        C15882.m37774(j, obj, interfaceC2016Mo3072);
        return interfaceC2016Mo3072;
    }
}
