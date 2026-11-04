package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C15719 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23179 f51078;

    public C15719(ViewOnClickListenerC23179 viewOnClickListenerC23179) {
        this.f51078 = viewOnClickListenerC23179;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f51078.f75115, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f51078;
        C6025 c6025 = viewOnClickListenerC23179.f75111;
        if (c6025.f20606 != -1) {
            int i = C20195.f64830;
            if (C6790.m18953()) {
                throw new C4866(C1364.m5010(new C13778(2), R.string.MT_Protector));
            }
            if (C6790.m18963()) {
                throw new C4866(C1364.m5010(new C13778(1702), R.string.MT_Protector));
            }
            C2592 c2592M8672 = C2592.m8672(4167);
            c2592M8672.m8686(c6025.f20606);
            C13778 c13778M8688 = c2592M8672.m8688();
            if (!c13778M8688.m33676()) {
                throw new C4866(C1364.m5010(c13778M8688, R.string.MT_Protector));
            }
        }
        C3787.m12322(viewOnClickListenerC23179.f75111).mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f51078;
        ActivityC3041 activityC3041 = viewOnClickListenerC23179.f75115;
        C6025 c6025 = viewOnClickListenerC23179.f75111;
        if (c6025.f20606 == -1) {
            ServiceC18703.f60801.add(c6025.f20607);
            int iIndexOf = activityC3041.f9848.indexOf(viewOnClickListenerC23179.f75111);
            if (iIndexOf == -1) {
                new C12515(activityC3041).m8197();
                return;
            }
            ArrayList arrayList = new ArrayList(activityC3041.f9848);
            arrayList.remove(iIndexOf);
            activityC3041.f9848 = C4681.unmodifiableList(arrayList);
            activityC3041.f9857.notifyItemRemoved(iIndexOf);
            return;
        }
        int iIndexOf2 = activityC3041.f9853.indexOf(viewOnClickListenerC23179.f75111);
        if (iIndexOf2 == -1) {
            new C12515(activityC3041).m8197();
            return;
        }
        ArrayList arrayList2 = new ArrayList(activityC3041.f9853);
        arrayList2.remove(iIndexOf2);
        activityC3041.f9853 = C4681.unmodifiableList(arrayList2);
        activityC3041.f9857.notifyItemRemoved(activityC3041.f9848.size() + iIndexOf2);
        new RunnableC14006(activityC3041);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (!(exc instanceof C4866) && !(exc instanceof C3090)) {
            this.f51078.f75115.m40401(exc, (DialogInterface.OnDismissListener) null);
        } else {
            C22673.m51154((CharSequence) exc.getMessage());
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
