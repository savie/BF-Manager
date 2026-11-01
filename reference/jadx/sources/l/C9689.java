package l;

import java.util.HashMap;
import java.util.Queue;

/* JADX INFO: renamed from: l.ۢܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9689 implements InterfaceC11930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f32655 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f32656;

    public C9689(C18279 c18279) {
        this.f32656 = c18279;
    }

    @Override // l.InterfaceC11930
    /* JADX INFO: renamed from: ۙ */
    public final void mo6261(C6990 c6990) {
        ((Queue) C9735.computeIfAbsent(this.f32655, c6990.f23517.f16301.f30086.mo44804(), new C3105(8))).add(c6990);
    }

    @Override // l.InterfaceC11930
    /* JADX INFO: renamed from: ۙ */
    public final void mo6260(C4603 c4603) {
        HashMap map = this.f32655;
        if (map.isEmpty()) {
            return;
        }
        C18279 c18279 = this.f32656;
        InterfaceC11930 interfaceC11930 = c18279.f58316;
        try {
            c18279.f58316 = c18279.f58318;
            Queue queue = (Queue) map.get(c4603.f16301.f30086.mo44804());
            while (queue != null && !queue.isEmpty()) {
                c18279.m42470((C6990) queue.remove());
            }
            c18279.f58316 = interfaceC11930;
        } catch (Throwable th) {
            c18279.f58316 = interfaceC11930;
            throw th;
        }
    }
}
