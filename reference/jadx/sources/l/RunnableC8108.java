package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8108 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Main mainM47527 = C21094.m47527();
        if (mainM47527 != null) {
            C8067 c8067BuildDialog = mainM47527.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19397(0, mainM47527));
            c8067BuildDialog.m21278("Shizuku", (DialogInterface.OnClickListener) null);
            DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C23250.m51307(dialogInterfaceC19356M21269);
            dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC8814(0, mainM47527));
        }
    }
}
