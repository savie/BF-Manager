package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֨ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f4918;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f4919;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f4920;

    public C1069(ActivityC5677 activityC5677, LinkedList linkedList, Runnable runnable) {
        this.f4920 = activityC5677;
        this.f4918 = linkedList;
        this.f4919 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f4920, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        while (true) {
            LinkedList linkedList = this.f4918;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC9018 interfaceC9018 = (InterfaceC9018) linkedList.peek();
            C13638.requireNonNull(interfaceC9018);
            this.f12806.m40698(this.f4920.getString(R.string.MT_Protector) + " " + interfaceC9018.getTitle());
            interfaceC9018.mo15975();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        Runnable runnable = this.f4919;
        if (runnable != null) {
            C16737.m39273(runnable);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        LinkedList linkedList = this.f4918;
        InterfaceC9018 interfaceC9018 = linkedList.isEmpty() ? null : (InterfaceC9018) linkedList.peek();
        if (interfaceC9018 != null) {
            exc = interfaceC9018.mo15974(exc);
        }
        if (exc != null) {
            ActivityC5677 activityC5677 = this.f4920;
            activityC5677.m31002(exc, (DialogInterface.OnDismissListener) null);
            if (exc instanceof C4682) {
                C4682 c4682 = (C4682) exc;
                C8500 c8500M22223 = C8500.m22223(c4682.f16563, c4682.f16564);
                c8500M22223.f29474 = false;
                activityC5677.m15660(c4682.m12987(), c8500M22223);
                C6094 c6094 = activityC5677.f19365;
                C13638.requireNonNull(c6094);
                c6094.m16532(c4682.m12987());
                return;
            }
            if (exc instanceof C8563) {
                C8563 c8563 = (C8563) exc;
                C8500 c8500M22224 = C8500.m22223(c8563.f29593, c8563.f29592);
                c8500M22224.f29474 = false;
                activityC5677.m15674(c8563.m22321(), c8500M22224);
                C8229 c8229 = activityC5677.f19360;
                C13638.requireNonNull(c8229);
                c8229.m21575(c8563.m22321());
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f4920.m15679();
        m10251();
    }
}
