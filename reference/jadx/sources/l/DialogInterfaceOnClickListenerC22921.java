package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22921 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74511;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f74513;

    public /* synthetic */ DialogInterfaceOnClickListenerC22921(C20409 c20409, Object obj, int i) {
        this.f74512 = i;
        this.f74513 = c20409;
        this.f74511 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f74512) {
            case 0:
                final C16881 c16881 = (C16881) this.f74511;
                final C20409 c20409 = this.f74513;
                if (!c20409.m13338()) {
                    ((ActivityC11632) c20409.requireActivity()).m29016(c20409);
                } else {
                    C8067 c8067BuildDialog = ((ActivityC11632) c20409.requireActivity()).buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21253(R.string.MT_Protector);
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۤۖ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            C20409 c204010 = c20409;
                            ((ActivityC11632) c204010.requireActivity()).m29016(c204010);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡۤۖ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c20409.m46104(c16881);
                        }
                    });
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21269();
                }
                break;
            default:
                ActivityC11632 activityC11632 = (ActivityC11632) this.f74511;
                this.f74513.m46150();
                activityC11632.m29017(false);
                break;
        }
    }
}
