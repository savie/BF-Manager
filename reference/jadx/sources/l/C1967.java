package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1967 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f6599;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f6600;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16882 f6601;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f6602;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f6603;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f6604;

    public C1967(AbstractActivityC17204 abstractActivityC17204, AbstractC16882 abstractC16882, C23255 c23255, C23255 c23256, C23255 c23257) {
        this.f6602 = abstractActivityC17204;
        this.f6601 = abstractC16882;
        this.f6604 = c23255;
        this.f6599 = c23256;
        this.f6600 = c23257;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f6602);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f6603 = this.f6601.mo11389();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f6603.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C1170.stream(this.f6603).map(new C13153()).toArray(new C3987(1));
        C2361 c2361BuildDialog = this.f6602.buildDialog();
        final AbstractC16882 abstractC16882 = this.f6601;
        final C23255 c23255 = this.f6604;
        final C23255 c23256 = this.f6599;
        final C23255 c23257 = this.f6600;
        c2361BuildDialog.m8014(charSequenceArr, new DialogInterface.OnClickListener(abstractC16882, c23255, c23256, c23257) { // from class: l.ۚܰ۫

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ C23255 f19669;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ C23255 f19671;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ C23255 f19672;

            {
                this.f19672 = c23255;
                this.f19671 = c23256;
                this.f19669 = c23257;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8373 c8373 = (C8373) this.f19670.f6603.get(i);
                String strM22535 = c8373.m22535();
                String strM22533 = c8373.m22533();
                C23255 c23258 = this.f19672;
                int iM54099 = c23258.m54099();
                C23255 c23259 = this.f19671;
                if (iM54099 > 0 && TextUtils.equals(c23258.m54021(), c23259.m54021())) {
                    c23258.mo52335((CharSequence) strM22535);
                }
                c23259.mo52335((CharSequence) strM22535);
                this.f19669.mo52335((CharSequence) strM22533);
                c23259.requestFocus();
            }
        });
        c2361BuildDialog.m8016();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f6602.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
