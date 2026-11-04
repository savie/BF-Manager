package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13467 implements InterfaceC24334 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23164 f42866;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20180 f42867;

    public C13467(Map map) {
        C20180 c20180 = new C20180();
        this.f42867 = c20180;
        this.f42866 = new C23164(c20180);
        c20180.m40049(map);
    }

    @Override // l.InterfaceC24334
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0385 mo33125() {
        return new C0385(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ܳ᩻᩵] */
    @Override // l.InterfaceC24334
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33128(C0966 c0966) {
        c0966.m3836(this.f42867);
        c0966.m3837((C15704) new InterfaceC14636() { // from class: l.ܳ᩻᩵
            @Override // l.InterfaceC14636
            /* JADX INFO: renamed from: ۙ */
            public final InterfaceC4196 mo35269(List list) {
                return this.f51032.m33126(list);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4196 m33126(List list) {
        List listM52085 = this.f42866.m52085(list);
        if (listM52085.isEmpty()) {
            return C10359.f32978;
        }
        return new C6010(listM52085);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6010 m33127(byte[] bArr) {
        return new C6010(this.f42866.m52084("input.dex", bArr));
    }
}
