package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54184;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f54185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20525 f54186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8614 f54187;

    public C16795(C8614 c8614, List list) {
        boolean z;
        this.f54187 = c8614;
        this.f54185 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                z = true;
                this.f54184 = z;
            }
        }
        z = false;
        this.f54184 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39659(final RunnableC3547 runnableC3547) {
        List list = this.f54185;
        int size = list.size();
        C8614 c8614 = this.f54187;
        if (size == 1) {
            C6004 c6004 = (C6004) list.get(0);
            C9097 c9097Mo5155 = c6004.mo5155();
            C20525 c20525 = new C20525(c8614.m23233(), c9097Mo5155.m24241(), c9097Mo5155.m24237(), this.f54184, new Runnable() { // from class: l.֫ۧ۫
                @Override // java.lang.Runnable
                public final void run() {
                    C16795.m39655(this.f6315, runnableC3547);
                }
            });
            c20525.m47053(c6004.getName());
            c20525.m47055();
            this.f54186 = c20525;
            return;
        }
        C20525 c20526 = new C20525(c8614.m23233(), null, null, this.f54184, new Runnable() { // from class: l.ۧۧ۫
            @Override // java.lang.Runnable
            public final void run() {
                C16795.m39658(this.f36371, runnableC3547);
            }
        });
        c20526.m47053(C21576.m49059(R.string.MT_Protector, Integer.valueOf(list.size())));
        c20526.m47055();
        this.f54186 = c20526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39655(C16795 c16795, RunnableC3547 runnableC3547) {
        C8614 c8614 = c16795.f54187;
        if (c16795.f54186.m47056()) {
            try {
                C6265.m17912(c8614.m23192(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                new C25001(c16795, c16795.f54186.m47058(), c16795.f54186.m47054(), runnableC3547).m8197();
            } catch (C4866 e) {
                c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39658(C16795 c16795, RunnableC3547 runnableC3547) {
        C8614 c8614 = c16795.f54187;
        try {
            C6265.m17912(c8614.m23192(), EnumC12230.MODIFY_DIRECTORY_LINKED);
            new C25001(c16795, c16795.f54186.m47058(), c16795.f54186.m47054(), runnableC3547).m8197();
        } catch (C4866 e) {
            c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
