package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18177 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42297(final AbstractActivityC12483 abstractActivityC12483, RunnableC0736 runnableC0736) {
        final C18883 c18883 = new C18883(ApplicationC0716.f2992);
        final C15356 c15356 = new C15356(abstractActivityC12483, c18883, abstractActivityC12483, runnableC0736);
        c15356.m12428(R.string.MT_Protector);
        final C9160 c9160M12433 = c15356.m12433();
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final RunnableC1243 runnableC1243 = new RunnableC1243(c18883, c9160M12433, (TextView) viewM30995.findViewById(R.id.MT_Protector), abstractActivityC12483);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۬ܽ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9160 c9160 = c9160M12433;
                String strTrim = c9160.m23513().toString().trim();
                C18883 c18884 = c18883;
                new C16766(abstractActivityC12483, strTrim, c18884.m43559(strTrim), c18884.m43558(strTrim), new C23117(c9160, strTrim, c18884, runnableC1243)).m40368(true);
            }
        });
        c9160M12433.m23512();
        c9160M12433.m23501();
        c9160M12433.m23509(new RunnableC4065(c18883, runnableC1243));
        c9160M12433.m23506(new C21705(runnableC1243));
        c9160M12433.m23505(17);
        C10948 c10948M23516 = c9160M12433.m23516();
        c10948M23516.m27481(6);
        c10948M23516.m16962(abstractActivityC12483.getString(R.string.MT_Protector));
        c10948M23516.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۜܽ۬
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    c15356.onClick(view);
                }
                return true;
            }
        });
        c10948M23516.m16930(2);
        c15356.m12429(viewM30995);
        c15356.m12425();
    }
}
