package l;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11389 extends AbstractC18900 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f35848 = 0;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public abstract void m28744();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204) {
        m43836(abstractActivityC17204);
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM40395.findViewById(R.id.textView1);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.textView2);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۚۙ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AbstractC11389.f35848;
                AbstractC11389 abstractC11389 = this.f18916;
                abstractC11389.getClass();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                abstractC11389.m28744();
            }
        });
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8005(viewM40395);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        m43851().m40350(dialogInterfaceC8327M8016, new InterfaceC16438() { // from class: l.֫ۙ᩻
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                AbstractC11389.m28743(this.f5810, textView, textView2);
            }
        });
        return dialogInterfaceC8327M8016;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28743(AbstractC11389 abstractC11389, TextView textView, TextView textView2) {
        if (abstractC11389.m43852()) {
            textView.setText(abstractC11389.m43866());
        }
        if (abstractC11389.m43832()) {
            textView2.setText(abstractC11389.m43839());
        }
    }
}
