package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6301 extends AbstractC17902 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21321 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public abstract void m17385();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483) {
        m41556(abstractActivityC12483);
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.textView1);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.textView2);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩷ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AbstractC6301.f21321;
                AbstractC6301 abstractC6301 = this.f55917;
                abstractC6301.getClass();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                abstractC6301.m17385();
            }
        });
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21258(viewM30995);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        m41568().m44959(dialogInterfaceC19356M21269, new C13270(this, textView, textView2, 1));
        return dialogInterfaceC19356M21269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17384(AbstractC6301 abstractC6301, TextView textView, TextView textView2) {
        if (abstractC6301.m41582()) {
            textView.setText(abstractC6301.m41586());
        }
        if (abstractC6301.m41589()) {
            textView2.setText(abstractC6301.m41576());
        }
    }
}
