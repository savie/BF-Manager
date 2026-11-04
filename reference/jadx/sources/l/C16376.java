package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16376 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38866(AbstractActivityC17204 abstractActivityC17204) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        C25227 c25227 = (C25227) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        textView2.setText("-- " + ((Object) textView2.getText()) + " --");
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC2134(abstractActivityC17204, 2));
        textView.setText(((Object) textView.getText()) + " ↓↓");
        C17122 c17122 = new C17122(abstractActivityC17204);
        c17122.registerAdapterDataObserver(new C2207(c17122, c25227, textView2));
        c17122.notifyDataSetChanged();
        c25227.setAdapter(c17122);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }
}
