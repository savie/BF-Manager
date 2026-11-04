package l;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۙۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17074;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f17075;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3328 f17076;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8614 f17077;

    public C4885(C8614 c8614, List list) {
        boolean z;
        this.f17077 = c8614;
        this.f17075 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2386) it.next()).isDirectory()) {
                z = true;
                this.f17074 = z;
            }
        }
        z = false;
        this.f17074 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14994(final RunnableC5631 runnableC5631) {
        List list = this.f17075;
        int size = list.size();
        C8614 c8614 = this.f17077;
        if (size == 1) {
            AbstractC20042 abstractC20042 = (AbstractC20042) ((InterfaceC2386) list.get(0));
            C3328 c3328 = new C3328(c8614.m23233(), abstractC20042.mo5155().m24243(), this.f17074, false, new Runnable() { // from class: l.ۡ᩵۫
                @Override // java.lang.Runnable
                public final void run() {
                    C4885.m14989(this.f31067, runnableC5631);
                }
            });
            c3328.m10970();
            this.f17076 = c3328;
            return;
        }
        C3328 c3329 = new C3328(c8614.m23233(), SecP521R1Field.P16, this.f17074, false, new Runnable() { // from class: l.ۖ᩵۫
            @Override // java.lang.Runnable
            public final void run() {
                this.f9473.m14993(runnableC5631);
            }
        });
        c3329.m10970();
        this.f17076 = c3329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14989(C4885 c4885, RunnableC5631 runnableC5631) {
        if (c4885.f17076.m10972()) {
            c4885.m14993(runnableC5631);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m14993(RunnableC5631 runnableC5631) {
        new C14074(this, (AbstractC18881) this.f17077.m23213().mo10174(), this.f17076.m10971(), this.f17076.m10969(), runnableC5631).m8197();
    }
}
