package l;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.ܶۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15119 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49385;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49386;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f49387;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f49388;

    public /* synthetic */ DialogInterfaceOnClickListenerC15119(AbstractActivityC12483 abstractActivityC12483, int i, CheckBox checkBox, int i2) {
        this.f49386 = i2;
        this.f49388 = abstractActivityC12483;
        this.f49385 = i;
        this.f49387 = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f49386) {
            case 0:
                ActivityC11632.m29002((ActivityC11632) this.f49388, this.f49385, this.f49387);
                break;
            default:
                ActivityC5677.m15618((ActivityC5677) this.f49388, this.f49385, this.f49387);
                break;
        }
    }
}
