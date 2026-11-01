package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13641 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44993;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44995;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44996;

    public /* synthetic */ DialogInterfaceOnClickListenerC13641(Object obj, Object obj2, Object obj3, int i) {
        this.f44994 = i;
        this.f44996 = obj;
        this.f44993 = obj2;
        this.f44995 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f44994) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f44996;
                ArrayList arrayList2 = (ArrayList) this.f44993;
                Runnable runnable = (Runnable) this.f44995;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.set(i2, (InterfaceC2557) arrayList2.get(i2));
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                final C13812 c13812 = (C13812) this.f44996;
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f44993;
                final int[] iArr = (int[]) this.f44995;
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܽۘ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C13812.m33625(c13812, iArr);
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                break;
        }
    }
}
