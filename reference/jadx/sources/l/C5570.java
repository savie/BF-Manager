package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5570 extends AbstractC11026 {
    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(final C11545 c11545) {
        final Resources resourcesM39279 = C16737.m39279();
        final CharSequence[] charSequenceArr = {resourcesM39279.getString(R.string.MT_Protector), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 1, 1), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 3, 3), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 7, 7), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 14, 14), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 30, 30), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 60, 60), resourcesM39279.getQuantityString(R.plurals.MT_Protector, 90, 90)};
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۗܺ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, final int i) {
                dialogInterface.dismiss();
                final C11545 c11546 = c11545;
                C8067 c8067BuildDialog2 = c11546.m28824().buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21261(resourcesM39279.getString(R.string.MT_Protector, charSequenceArr[i]));
                final C5570 c5570 = this.f12320;
                c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener(c5570, i, c11546) { // from class: l.ۙ᩶֨

                    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ int f17115;

                    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ C11545 f17116;

                    {
                        this.f17115 = i;
                        this.f17116 = c11546;
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i2) {
                        long j;
                        long j2;
                        boolean z;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i3 = this.f17115;
                        switch (i3) {
                            case 0:
                                j = C17492.FOREVER_NS;
                                Main mainM28824 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28824, j, z).m10243();
                                return;
                            case 1:
                                j2 = 86400000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM28825 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28825, j, z).m10243();
                                return;
                            case 2:
                                j2 = 259200000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM28826 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28826, j, z).m10243();
                                return;
                            case 3:
                                j2 = 604800000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM28827 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28827, j, z).m10243();
                                return;
                            case 4:
                                j2 = 1209600000;
                                j = jCurrentTimeMillis - j2;
                                Main mainM28828 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28828, j, z).m10243();
                                return;
                            case 5:
                                j2 = 2592000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM28829 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM28829, j, z).m10243();
                                return;
                            case 6:
                                j2 = 5184000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM288210 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM288210, j, z).m10243();
                                return;
                            case 7:
                                j2 = 7776000000L;
                                j = jCurrentTimeMillis - j2;
                                Main mainM288211 = this.f17116.m28824();
                                if (i3 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                new C2747(mainM288211, j, z).m10243();
                                return;
                            default:
                                throw new RuntimeException();
                        }
                    }
                });
                c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog2.m21269();
            }
        });
        c8067BuildDialog.m21269();
    }
}
