package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes5.dex */
public final class C15497 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50437;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Pattern f50438;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC13260 f50439;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11555 f50440;

    public C15497(AbstractViewOnClickListenerC13260 abstractViewOnClickListenerC13260, Pattern pattern, String str) {
        this.f50439 = abstractViewOnClickListenerC13260;
        this.f50438 = pattern;
        this.f50437 = str;
        this.f50440 = C11555.m29068(abstractViewOnClickListenerC13260.f42363);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f50439.f42363, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f50439.mo32809(this.f50438, this.f50437);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f50440.m29071()) {
            this.f50439.mo32808();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f50440.m29071()) {
            this.f50439.f42363.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
