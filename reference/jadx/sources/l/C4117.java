package l;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۘۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4117 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f13980;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f13981;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3328 f13982;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8614 f13983;

    public C4117(C8614 c8614, List list) {
        boolean z;
        this.f13983 = c8614;
        this.f13981 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2386) it.next()).isDirectory()) {
                z = true;
                this.f13980 = z;
            }
        }
        z = false;
        this.f13980 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13214(final RunnableC3547 runnableC3547) {
        List list = this.f13981;
        int size = list.size();
        C8614 c8614 = this.f13983;
        if (size == 1) {
            C6004 c6004 = (C6004) ((InterfaceC2386) list.get(0));
            C3328 c3328 = new C3328(c8614.m23233(), c6004.mo5155().m24243(), this.f13980, true, new RunnableC17936(1, this, runnableC3547));
            c3328.m10970();
            this.f13982 = c3328;
            return;
        }
        C3328 c3329 = new C3328(c8614.m23233(), SecP521R1Field.P16, this.f13980, true, new Runnable() { // from class: l.ۨۧ۫
            @Override // java.lang.Runnable
            public final void run() {
                C4117.m13213(this.f39591, runnableC3547);
            }
        });
        c3329.m10970();
        this.f13982 = c3329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13210(C4117 c4117, RunnableC3547 runnableC3547) {
        C8614 c8614 = c4117.f13983;
        if (c4117.f13982.m10972()) {
            try {
                C6265.m17912(c8614.m23192(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                new C6355(c4117, c4117.f13982.m10969(), c4117.f13982.m10971(), runnableC3547).m8197();
            } catch (C4866 e) {
                c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m13213(C4117 c4117, RunnableC3547 runnableC3547) {
        C8614 c8614 = c4117.f13983;
        try {
            C6265.m17912(c8614.m23192(), EnumC12230.MODIFY_DIRECTORY_LINKED);
            new C6355(c4117, c4117.f13982.m10969(), c4117.f13982.m10971(), runnableC3547).m8197();
        } catch (C4866 e) {
            c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
