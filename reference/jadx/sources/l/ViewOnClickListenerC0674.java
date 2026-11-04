package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0674 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11514 f2557;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f2558;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f2559;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f2560;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f2561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f2562;

    public /* synthetic */ ViewOnClickListenerC0674(C23255 c23255, AbstractActivityC17204 abstractActivityC17204, CharSequence[] charSequenceArr, C11514 c11514, ArrayList arrayList, C1626 c1626) {
        this.f2559 = c23255;
        this.f2562 = abstractActivityC17204;
        this.f2560 = charSequenceArr;
        this.f2557 = c11514;
        this.f2558 = arrayList;
        this.f2561 = c1626;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final C23255 c23255 = this.f2559;
        if (c23255.hasFocus() || !c23255.requestFocus()) {
            C2361 c2361BuildDialog = this.f2562.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            final C11514 c11514 = this.f2557;
            int i = c11514.f36230;
            final ArrayList arrayList = this.f2558;
            final C1626 c1626 = this.f2561;
            c2361BuildDialog.m8013(this.f2560, i, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩶ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C15243.m36590(dialogInterface, "dialog");
                    c11514.f36230 = i2;
                    ArrayList arrayList2 = arrayList;
                    Object obj = arrayList2.get(i2);
                    C23255 c23256 = c23255;
                    c23256.setTag(obj);
                    c23256.mo52335((CharSequence) ((AbstractC0148) arrayList2.get(i2)).getName());
                    c1626.m5769(false);
                    dialogInterface.dismiss();
                }
            });
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8016();
        }
    }
}
