package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0301 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f1622;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f1623;

    public C0301(ActivityC11632 activityC11632, LinkedList linkedList) {
        this.f1623 = activityC11632;
        this.f1622 = linkedList;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f1623, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        while (true) {
            LinkedList linkedList = this.f1622;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC15387 interfaceC15387 = (InterfaceC15387) linkedList.peek();
            C13638.requireNonNull(interfaceC15387);
            this.f12806.m40698(this.f1623.getString(R.string.MT_Protector) + " " + interfaceC15387.getTitle());
            interfaceC15387.mo36824();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        LinkedList linkedList = this.f1622;
        InterfaceC15387 interfaceC15387 = linkedList.isEmpty() ? null : (InterfaceC15387) linkedList.peek();
        if (interfaceC15387 == null) {
            this.f1623.m31002(exc, (DialogInterface.OnDismissListener) null);
        } else {
            interfaceC15387.mo36823(exc);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f1623.m29018();
        m10251();
    }
}
