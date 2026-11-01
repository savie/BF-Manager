package l;

import android.view.View;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9725 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24679(final AbstractActivityC12483 abstractActivityC12483, TextInputLayout textInputLayout, final EditText editText, final RunnableC3744 runnableC3744) {
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.֫ܿۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9725.m24680(abstractActivityC12483, runnableC3744, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24680(AbstractActivityC12483 abstractActivityC12483, Runnable runnable, EditText editText) {
        C6936 c6936M125;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((abstractActivityC12483 instanceof Main) && (c6936M125 = ((Main) abstractActivityC12483).m125()) != null) {
            m24678(arrayList, arrayList2, c6936M125.m18623(), R.string.MT_Protector);
            m24678(arrayList, arrayList2, c6936M125.m18662(), R.string.MT_Protector);
        }
        arrayList2.add(C16737.m39288(R.string.MT_Protector));
        arrayList.add(C11904.f39934);
        for (C18149 c18149 : (ArrayList) C8272.m21692()) {
            arrayList2.add(c18149.f58040);
            arrayList.add(C5553.m15311(c18149.f58039));
        }
        if (runnable != null) {
            arrayList2.add(C16737.m39288(R.string.MT_Protector));
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21267((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC1253(runnable, arrayList, editText, 1));
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24678(ArrayList arrayList, ArrayList arrayList2, C11545 c11545, int i) {
        if (c11545.m28814("local")) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(c11545.m28799(), new String[0]);
            String name = abstractC20745M15313.getName();
            if (name.isEmpty()) {
                name = C16737.m39288(R.string.MT_Protector);
            }
            arrayList2.add(C16737.m39264(i, name));
            arrayList.add(abstractC20745M15313);
        }
    }
}
