package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15242 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36583(final AbstractActivityC17204 abstractActivityC17204, C1626 c1626, final C23255 c23255, final RunnableC19006 runnableC19006) {
        c1626.m5767(-1);
        c1626.m5757(R.drawable.MT_Protector);
        c1626.m5759(new View.OnClickListener() { // from class: l.ᩴۡᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15242.m36582(abstractActivityC17204, runnableC19006, c23255);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36582(AbstractActivityC17204 abstractActivityC17204, Runnable runnable, C23255 c23255) {
        C20065 c20065M117;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((abstractActivityC17204 instanceof Main) && (c20065M117 = ((Main) abstractActivityC17204).m117()) != null) {
            m36581(arrayList, arrayList2, c20065M117.m46139(), R.string.MT_Protector);
            m36581(arrayList, arrayList2, c20065M117.m46182(), R.string.MT_Protector);
        }
        arrayList2.add(C21576.m49088(R.string.MT_Protector));
        arrayList.add(C6382.f21566);
        for (C16997 c16997 : (ArrayList) C17743.m41556()) {
            arrayList2.add(c16997.f55539);
            arrayList.add(C14584.m35191(c16997.f55538));
        }
        if (runnable != null) {
            arrayList2.add(C21576.m49088(R.string.MT_Protector));
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8014((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC0983(runnable, arrayList, c23255, 1));
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36581(ArrayList arrayList, ArrayList arrayList2, C8614 c8614, int i) {
        if (c8614.m23228("local")) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(c8614.m23204(), new String[0]);
            String name = abstractC22044M35193.getName();
            if (name.isEmpty()) {
                name = C21576.m49088(R.string.MT_Protector);
            }
            arrayList2.add(C21576.m49059(i, name));
            arrayList.add(abstractC22044M35193);
        }
    }
}
