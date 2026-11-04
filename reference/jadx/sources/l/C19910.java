package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G9AG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19910 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        c12915.m31970(b.k);
        AbstractC0148 abstractC0148M18806 = ((C6728) c12915.m31987()).m18806();
        if (abstractC0148M18806 == null) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        C8877 c8877 = new C8877(abstractC0148M18806, true);
        C8877 c8878 = new C8877(abstractC0148M18806, false);
        final ArrayList arrayList = new ArrayList();
        for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
            arrayList.add(C22961.m51813(interfaceC2386.getPath(), interfaceC2386.isDirectory() ? c8877 : c8878));
        }
        final C20065 c20065M23194 = c12915.m31983().m23194();
        if (arrayList.size() <= 5) {
            C22961.m51797(arrayList, c20065M23194.m46167());
            C20634.m47244(c12915.m31979());
            return;
        }
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ܶ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22961.m51797(arrayList, c20065M23194.m46167());
                C20634.m47244(c12915.m31979());
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
