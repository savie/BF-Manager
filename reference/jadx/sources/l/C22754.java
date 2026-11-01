package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes.dex */
public final class C22754 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11545 f74099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f74100;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f74101;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19226 f74102;

    public C22754(C11545 c11545, List list) {
        boolean z;
        this.f74099 = c11545;
        this.f74101 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                z = true;
                this.f74100 = z;
            }
        }
        z = false;
        this.f74100 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50419(final RunnableC10138 runnableC10138) {
        List list = this.f74101;
        int size = list.size();
        C11545 c11545 = this.f74099;
        if (size == 1) {
            C6794 c6794 = (C6794) list.get(0);
            C11731 c11731Mo7971 = c6794.mo7971();
            C19226 c19226 = new C19226(c11545.m28824(), c11731Mo7971.m29326(), c11731Mo7971.m29320(), this.f74100, new Runnable() { // from class: l.۬ۙ֨
                @Override // java.lang.Runnable
                public final void run() {
                    C22754.m50415(this.f42821, runnableC10138);
                }
            });
            c19226.m44159(c6794.getName());
            c19226.m44163();
            this.f74102 = c19226;
            return;
        }
        C19226 c19227 = new C19226(c11545.m28824(), null, null, this.f74100, new Runnable() { // from class: l.ۘۙ֨
            @Override // java.lang.Runnable
            public final void run() {
                C22754.m50418(this.f13500, runnableC10138);
            }
        });
        c19227.m44159(C16737.m39264(R.string.MT_Protector, Integer.valueOf(list.size())));
        c19227.m44163();
        this.f74102 = c19227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50415(C22754 c22754, RunnableC10138 runnableC10138) {
        C11545 c11545 = c22754.f74099;
        if (c22754.f74102.m44160()) {
            try {
                C2462.m7541(c11545.m28801(), EnumC11636.MODIFY_DIRECTORY_LINKED);
                new C6525(c22754, c22754.f74102.m44157(), c22754.f74102.m44161(), runnableC10138).m10243();
            } catch (C4987 e) {
                c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50418(C22754 c22754, RunnableC10138 runnableC10138) {
        C11545 c11545 = c22754.f74099;
        try {
            C2462.m7541(c11545.m28801(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            new C6525(c22754, c22754.f74102.m44157(), c22754.f74102.m44161(), runnableC10138).m10243();
        } catch (C4987 e) {
            c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
