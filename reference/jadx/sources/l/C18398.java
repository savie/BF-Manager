package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18398 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42681(AbstractActivityC12483 abstractActivityC12483) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C17492 c17492 = (C17492) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        textView2.setText("-- " + ((Object) textView2.getText()) + " --");
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC22999(abstractActivityC12483, 2));
        textView.setText(((Object) textView.getText()) + " ↓↓");
        C21220 c21220 = new C21220(abstractActivityC12483);
        c21220.registerAdapterDataObserver(new C6403(c21220, c17492, textView2));
        c21220.notifyDataSetChanged();
        c17492.setAdapter(c21220);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }
}
