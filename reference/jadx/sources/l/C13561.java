package l;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܰۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11545 f44736;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f44737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f44738;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17998 f44739;

    public C13561(C11545 c11545, List list) {
        boolean z;
        this.f44736 = c11545;
        this.f44738 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2557) it.next()).isDirectory()) {
                z = true;
                this.f44737 = z;
            }
        }
        z = false;
        this.f44737 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33156(final RunnableC3681 runnableC3681) {
        List list = this.f44738;
        int size = list.size();
        C11545 c11545 = this.f44736;
        if (size == 1) {
            AbstractC5362 abstractC5362 = (AbstractC5362) ((InterfaceC2557) list.get(0));
            C17998 c17998 = new C17998(c11545.m28824(), abstractC5362.mo7971().m29318(), this.f44737, false, new Runnable() { // from class: l.ܳ۬֨
                @Override // java.lang.Runnable
                public final void run() {
                    C13561.m33151(this.f47600, runnableC3681);
                }
            });
            c17998.m41909();
            this.f44739 = c17998;
            return;
        }
        C17998 c17999 = new C17998(c11545.m28824(), SecP521R1Field.P16, this.f44737, false, new Runnable() { // from class: l.֫۬֨
            @Override // java.lang.Runnable
            public final void run() {
                this.f7028.m33154(runnableC3681);
            }
        });
        c17999.m41909();
        this.f44739 = c17999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33151(C13561 c13561, RunnableC3681 runnableC3681) {
        if (c13561.f44739.m41907()) {
            c13561.m33154(runnableC3681);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m33154(RunnableC3681 runnableC3681) {
        new C4387(this, (AbstractC12233) this.f44736.m28817().mo13029(), this.f44739.m41911(), this.f44739.m41910(), runnableC3681).m10243();
    }
}
