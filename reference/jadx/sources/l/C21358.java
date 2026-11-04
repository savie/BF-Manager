package l;

import android.view.View;
import android.widget.AutoCompleteTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21358 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f68024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f68025;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f68026;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f68027;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f68028;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f68029;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f68030;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f68031;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AutoCompleteTextView f68032;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f68033;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f68034;

    public /* synthetic */ C21358(C1255 c1255, AutoCompleteTextView autoCompleteTextView, C1626 c1626, C1626 c1627, C1626 c1628, AbstractActivityC17204 abstractActivityC17204, C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259) {
        this.f68025 = c1255;
        this.f68032 = autoCompleteTextView;
        this.f68033 = c1626;
        this.f68031 = c1627;
        this.f68030 = c1628;
        this.f68029 = abstractActivityC17204;
        this.f68026 = c23255;
        this.f68024 = c23256;
        this.f68028 = c23257;
        this.f68034 = c23258;
        this.f68027 = c23259;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        final AbstractC24342 abstractC24342 = (AbstractC24342) obj;
        this.f68025.setVisibility(abstractC24342.mo18227() == 0 ? 0 : 8);
        this.f68032.setTag(abstractC24342);
        this.f68033.m5761(abstractC24342.mo18221());
        this.f68031.m5761(abstractC24342.mo18226());
        boolean zMo18224 = abstractC24342.mo18224();
        C1626 c1626 = this.f68030;
        if (zMo18224) {
            c1626.m5767(-1);
            c1626.m5757(R.drawable.MT_Protector);
            final AbstractActivityC17204 abstractActivityC17204 = this.f68029;
            final C23255 c23255 = this.f68026;
            final C23255 c23256 = this.f68024;
            final C23255 c23257 = this.f68028;
            final C23255 c23258 = this.f68034;
            final C23255 c23259 = this.f68027;
            c1626.m5759(new View.OnClickListener() { // from class: l.ۢܰ۫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abstractC24342.mo30881(abstractActivityC17204, c23255, c23256, c23257, c23258, c23259);
                }
            });
            return;
        }
        c1626.m5767(0);
    }
}
