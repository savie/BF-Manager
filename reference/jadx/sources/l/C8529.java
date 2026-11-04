package l;

import java.util.List;

/* JADX INFO: renamed from: l.۠ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8529 extends AbstractC7038 {
    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ۙ */
    public final void mo8611(long j, Object obj) {
        ((InterfaceC15987) C22832.m51520(j, obj)).mo23372();
    }

    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ۙ */
    public final void mo8612(long j, Object obj, Object obj2) {
        InterfaceC15987 interfaceC15987Mo4024 = (InterfaceC15987) C22832.m51520(j, obj);
        InterfaceC15987 interfaceC15987 = (InterfaceC15987) C22832.m51520(j, obj2);
        int size = interfaceC15987Mo4024.size();
        int size2 = interfaceC15987.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC15987Mo4024.mo23371()) {
                interfaceC15987Mo4024 = interfaceC15987Mo4024.mo4024(size2 + size);
            }
            interfaceC15987Mo4024.addAll(interfaceC15987);
        }
        if (size > 0) {
            interfaceC15987 = interfaceC15987Mo4024;
        }
        C22832.m51505(j, obj, interfaceC15987);
    }

    @Override // l.AbstractC7038
    /* JADX INFO: renamed from: ᩷ */
    public final List mo8613(long j, Object obj) {
        InterfaceC15987 interfaceC15987 = (InterfaceC15987) C22832.m51520(j, obj);
        if (interfaceC15987.mo23371()) {
            return interfaceC15987;
        }
        int size = interfaceC15987.size();
        InterfaceC15987 interfaceC15987Mo4024 = interfaceC15987.mo4024(size == 0 ? 10 : size * 2);
        C22832.m51505(j, obj, interfaceC15987Mo4024);
        return interfaceC15987Mo4024;
    }
}
