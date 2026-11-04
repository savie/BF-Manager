package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۖۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2449 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f7866;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f7867;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f7868;

    public C2449(ActivityC0848 activityC0848, LinkedList linkedList, Runnable runnable) {
        this.f7868 = activityC0848;
        this.f7867 = linkedList;
        this.f7866 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f7868, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        while (true) {
            LinkedList linkedList = this.f7867;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC17583 interfaceC17583 = (InterfaceC17583) linkedList.peek();
            C17359.requireNonNull(interfaceC17583);
            this.f7780.m33189(this.f7868.getString(R.string.MT_Protector) + " " + interfaceC17583.getTitle());
            interfaceC17583.mo29882();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        Runnable runnable = this.f7866;
        if (runnable != null) {
            C21576.m49068(runnable);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        LinkedList linkedList = this.f7867;
        InterfaceC17583 interfaceC17583 = linkedList.isEmpty() ? null : (InterfaceC17583) linkedList.peek();
        if (interfaceC17583 != null) {
            exc = interfaceC17583.mo29881(exc);
        }
        if (exc != null) {
            ActivityC0848 activityC0848 = this.f7868;
            activityC0848.m40401(exc, (DialogInterface.OnDismissListener) null);
            if (exc instanceof C18636) {
                C18636 c18636 = (C18636) exc;
                C15301 c15301M36736 = C15301.m36736(c18636.f60596, c18636.f60595);
                c15301M36736.f50017 = false;
                activityC0848.m3431(c18636.m43392(), c15301M36736);
                C20283 c20283 = activityC0848.f3179;
                C17359.requireNonNull(c20283);
                c20283.m46575(c18636.m43392());
                return;
            }
            if (exc instanceof C17692) {
                C17692 c17692 = (C17692) exc;
                C15301 c15301M36737 = C15301.m36736(c17692.f58154, c17692.f58152);
                c15301M36737.f50017 = false;
                activityC0848.m3452(c17692.m41404(), c15301M36737);
                C11967 c11967 = activityC0848.f3181;
                C17359.requireNonNull(c11967);
                c11967.m29972(c17692.m41404());
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f7868.m3440();
        m8196();
    }
}
