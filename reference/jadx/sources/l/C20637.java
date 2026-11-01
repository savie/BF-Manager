package l;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩷ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20637 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11545 f67197;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f67198;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f67199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17998 f67200;

    public C20637(C11545 c11545, List list) {
        boolean z;
        this.f67197 = c11545;
        this.f67199 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2557) it.next()).isDirectory()) {
                z = true;
                this.f67198 = z;
            }
        }
        z = false;
        this.f67198 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46506(final RunnableC10138 runnableC10138) {
        List list = this.f67199;
        int size = list.size();
        C11545 c11545 = this.f67197;
        if (size == 1) {
            C6794 c6794 = (C6794) ((InterfaceC2557) list.get(0));
            C17998 c17998 = new C17998(c11545.m28824(), c6794.mo7971().m29318(), this.f67198, true, new Runnable() { // from class: l.ۡۙ֨
                @Override // java.lang.Runnable
                public final void run() {
                    C20637.m46502(this.f29817, runnableC10138);
                }
            });
            c17998.m41909();
            this.f67200 = c17998;
            return;
        }
        C17998 c17999 = new C17998(c11545.m28824(), SecP521R1Field.P16, this.f67198, true, new RunnableC17977(1, this, runnableC10138));
        c17999.m41909();
        this.f67200 = c17999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46502(C20637 c20637, RunnableC10138 runnableC10138) {
        C11545 c11545 = c20637.f67197;
        if (c20637.f67200.m41907()) {
            try {
                C2462.m7541(c11545.m28801(), EnumC11636.MODIFY_DIRECTORY_LINKED);
                new C10054(c20637, c20637.f67200.m41910(), c20637.f67200.m41911(), runnableC10138).m10243();
            } catch (C4987 e) {
                c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m46505(C20637 c20637, RunnableC10138 runnableC10138) {
        C11545 c11545 = c20637.f67197;
        try {
            C2462.m7541(c11545.m28801(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            new C10054(c20637, c20637.f67200.m41910(), c20637.f67200.m41911(), runnableC10138).m10243();
        } catch (C4987 e) {
            c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
