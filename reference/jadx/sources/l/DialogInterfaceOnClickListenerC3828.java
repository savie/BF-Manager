package l;

import android.content.DialogInterface;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3828 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14190;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14192;

    public /* synthetic */ DialogInterfaceOnClickListenerC3828(int i, Object obj, Object obj2) {
        this.f14191 = i;
        this.f14192 = obj;
        this.f14190 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f14191) {
            case 0:
                ActivityC11632.m28987((ActivityC11632) this.f14192, (CheckBox) this.f14190);
                break;
            default:
                final C20409 c20409 = (C20409) this.f14192;
                final C16881 c16881 = (C16881) this.f14190;
                if (!c20409.m13338()) {
                    c20409.m46132(-1, false, true);
                } else {
                    C8067 c8067BuildDialog = ((ActivityC11632) c20409.requireActivity()).buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21253(R.string.MT_Protector);
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1065(2, c20409));
                    c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۠ۤۖ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c20409.m46065(c16881);
                        }
                    });
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21269();
                }
                break;
        }
    }
}
