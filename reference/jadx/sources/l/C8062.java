package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8062 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8768 f28274;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f28275;

    public C8062(AbstractActivityC12483 abstractActivityC12483, C8768 c8768) {
        this.f28275 = abstractActivityC12483;
        this.f28274 = c8768;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f28275, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C8768 c8768 = this.f28274;
        C5079 c5079M22825 = c8768.m22825();
        if (!c8768.f30166.isEmpty()) {
            C2256 c2256M14172 = c5079M22825.m14172();
            c2256M14172.m6928(new C15824(c8768.f30166));
            c5079M22825 = c2256M14172.m6922();
        }
        C11229 c11229 = new C11229(c5079M22825, c8768.f30163);
        if (!TextUtils.isEmpty(c8768.f30165)) {
            c11229.m28201(c8768.f30165, c8768.f30164, false);
        }
        c11229.m28195(c8768.f30163 + "/");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f28275.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f12806.m40693()) {
            return;
        }
        m10251();
    }
}
