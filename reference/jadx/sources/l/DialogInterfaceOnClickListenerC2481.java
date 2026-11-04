package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2481 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7944;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f7946;

    public /* synthetic */ DialogInterfaceOnClickListenerC2481(C7941 c7941, Object obj, int i) {
        this.f7944 = i;
        this.f7946 = c7941;
        this.f7945 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f7944) {
            case 0:
                final AbstractC2720 abstractC2720 = (AbstractC2720) this.f7945;
                final C7941 c7941 = this.f7946;
                if (!c7941.m19933()) {
                    ((ActivityC18143) c7941.requireActivity()).m42295(c7941);
                } else {
                    C2361 c2361BuildDialog = ((ActivityC18143) c7941.requireActivity()).buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8000(R.string.MT_Protector);
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            C7941 c7942 = c7941;
                            ((ActivityC18143) c7942.requireActivity()).m42295(c7942);
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩺᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i2) {
                            c7941.m21529(abstractC2720);
                        }
                    });
                    c2361BuildDialog.m8012(false);
                    c2361BuildDialog.m8016();
                }
                break;
            default:
                ActivityC18143 activityC18143 = (ActivityC18143) this.f7945;
                this.f7946.m21618();
                activityC18143.m42306(false);
                break;
        }
    }
}
