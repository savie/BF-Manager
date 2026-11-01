package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes.dex */
public final class C22640 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC14879 f73776;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73777;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Pattern f73778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23229 f73779;

    public C22640(AbstractViewOnClickListenerC14879 abstractViewOnClickListenerC14879, Pattern pattern, String str) {
        this.f73776 = abstractViewOnClickListenerC14879;
        this.f73778 = pattern;
        this.f73777 = str;
        this.f73779 = C23229.m51233(abstractViewOnClickListenerC14879.f48632);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f73776.f48632, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f73776.mo22037(this.f73778, this.f73777);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f73779.m51236()) {
            this.f73776.mo22036();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f73779.m51236()) {
            this.f73776.f48632.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
