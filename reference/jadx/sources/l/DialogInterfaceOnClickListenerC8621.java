package l;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.۠ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8621 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f28181;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28182;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f28184;

    public /* synthetic */ DialogInterfaceOnClickListenerC8621(AbstractActivityC17204 abstractActivityC17204, int i, CheckBox checkBox, int i2) {
        this.f28182 = i2;
        this.f28184 = abstractActivityC17204;
        this.f28183 = i;
        this.f28181 = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28182) {
            case 0:
                ActivityC18143.m42289((ActivityC18143) this.f28184, this.f28183, this.f28181);
                break;
            default:
                ActivityC0848.m3390((ActivityC0848) this.f28184, this.f28183, this.f28181);
                break;
        }
    }
}
