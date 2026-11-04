package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11486 extends AbstractC18551 {
    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(final C8614 c8614) {
        final Resources resourcesM49055 = C21576.m49055();
        final CharSequence[] charSequenceArr = {resourcesM49055.getString(R.string.MT_Protector), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 1, 1), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 3, 3), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 7, 7), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 14, 14), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 30, 30), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 60, 60), resourcesM49055.getQuantityString(R.plurals.MT_Protector, 90, 90)};
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ᩴ۠۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C8614 c8615 = c8614;
                C2361 c2361BuildDialog2 = c8615.m23233().buildDialog();
                c2361BuildDialog2.m8021(R.string.MT_Protector);
                c2361BuildDialog2.m8008(resourcesM49055.getString(R.string.MT_Protector, charSequenceArr[i]));
                c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener(this.f63417, i, c8615) { // from class: l.ܳ۠۫

                    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ int f49672;

                    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ C8614 f49673;

                    {
                        this.f49672 = i;
                        this.f49673 = c8615;
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i2) {
                        long j;
                        long j2;
                        boolean z;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i3 = this.f49672;
                        switch (i3) {
                            case 0:
                                j = C25227.FOREVER_NS;
                                Main mainM23233 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23233, j, z).m8197();
                                return;
                            case 1:
                                j2 = 86400000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23234 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23234, j, z).m8197();
                                return;
                            case 2:
                                j2 = 259200000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23235 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23235, j, z).m8197();
                                return;
                            case 3:
                                j2 = 604800000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23236 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23236, j, z).m8197();
                                return;
                            case 4:
                                j2 = 1209600000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23237 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23237, j, z).m8197();
                                return;
                            case 5:
                                j2 = 2592000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23238 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23238, j, z).m8197();
                                return;
                            case 6:
                                j2 = 5184000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM23239 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM23239, j, z).m8197();
                                return;
                            case 7:
                                j2 = 7776000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM232310 = this.f49673.m23233();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C1792(mainM232310, j, z).m8197();
                                return;
                            default:
                                throw new RuntimeException();
                        }
                    }
                });
                c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog2.m8016();
            }
        });
        c2361BuildDialog.m8016();
    }
}
