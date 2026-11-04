package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩻ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24857 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f80458;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f80459;

    public C24857(ActivityC18143 activityC18143, LinkedList linkedList) {
        this.f80459 = activityC18143;
        this.f80458 = linkedList;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f80459, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        while (true) {
            LinkedList linkedList = this.f80458;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC16934 interfaceC16934 = (InterfaceC16934) linkedList.peek();
            C17359.requireNonNull(interfaceC16934);
            this.f7780.m33189(this.f80459.getString(R.string.MT_Protector) + " " + interfaceC16934.getTitle());
            interfaceC16934.mo39911();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        LinkedList linkedList = this.f80458;
        InterfaceC16934 interfaceC16934 = linkedList.isEmpty() ? null : (InterfaceC16934) linkedList.peek();
        if (interfaceC16934 == null) {
            this.f80459.m40401(exc, (DialogInterface.OnDismissListener) null);
        } else {
            interfaceC16934.mo39910(exc);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f80459.m42302();
        m8196();
    }
}
