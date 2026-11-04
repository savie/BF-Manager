package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5587 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16561(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList, RunnableC9840 runnableC9840) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        ImageView imageView = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        final C25227 c25227 = (C25227) viewM40395.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۤ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12964 adapter = c25227.getAdapter();
                boolean z = view.getTag(R.id.MT_Protector) != null;
                C18452 c18452 = new C18452(view.getContext(), view, 0);
                C9898 c9898M42995 = c18452.m42995();
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(z);
                c18452.m42994(new C19757(arrayList2, z, view, adapter));
                c18452.mo21878();
            }
        });
        C18597.m43181(c25227);
        C11999 c11999 = new C11999(new C10806(arrayList2));
        c25227.setAdapter(new C15281(abstractActivityC17204, arrayList2, c11999));
        c11999.m30173(c25227);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21995(arrayList, arrayList2, runnableC9840, 0));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
