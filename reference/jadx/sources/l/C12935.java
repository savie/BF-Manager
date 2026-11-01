package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12935 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32044(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList, RunnableC18522 runnableC18522) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        final C17492 c17492 = (C17492) viewM30995.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۛ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0414 adapter = c17492.getAdapter();
                boolean z = view.getTag(R.id.MT_Protector) != null;
                C16195 c16195 = new C16195(view.getContext(), view, 0);
                C12418 c12418M38298 = c16195.m38298();
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(z);
                c16195.m38296(new C5173(arrayList2, z, view, adapter));
                c16195.m38297();
            }
        });
        C16754.m39316(c17492);
        C4647 c4647 = new C4647(new C11524(arrayList2));
        c17492.setAdapter(new C22107(abstractActivityC12483, arrayList2, c4647));
        c4647.m12825(c17492);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13641(arrayList, arrayList2, runnableC18522, 0));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
