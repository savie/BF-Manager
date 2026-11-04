package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes3.dex */
public final class C3833 extends AbstractC9843 {
    public C3833() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ۛ֫۫] */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        final List<AbstractC9843> listAsList = Arrays.asList(new C4994(R.string.MT_Protector, -1), new C25176(R.string.MT_Protector, -1), new C22938(R.string.MT_Protector, -1), new C7253(), new C10959(R.string.MT_Protector, -1), new C7999(R.string.MT_Protector, -1), new C19186(R.string.MT_Protector, -1), new C13241(R.string.MT_Protector, -1));
        ArrayList arrayList = new ArrayList(listAsList.size());
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (AbstractC9843 abstractC9843 : listAsList) {
            arrayList.add(C21576.m49088(abstractC9843.m25627()));
            arrayList2.add(Boolean.valueOf(abstractC9843.mo2481(c12915)));
        }
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8021(m25627());
        c2361BuildDialog.m8007(new C23971(c12915.m31979(), arrayList, arrayList2), (DialogInterfaceOnClickListenerC6071) new DialogInterface.OnClickListener() { // from class: l.ۛ֫۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ((AbstractC9843) listAsList.get(i)).mo2016(c12915);
            }
        });
        c2361BuildDialog.m8016();
    }
}
