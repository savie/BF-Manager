package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4086 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13162(final AbstractActivityC17204 abstractActivityC17204, RunnableC21244 runnableC21244) {
        final C14526 c14526 = new C14526(ApplicationC17729.f58258);
        final C6324 c6324 = new C6324(abstractActivityC17204, c14526, abstractActivityC17204, runnableC21244);
        c6324.m40982(R.string.MT_Protector);
        final C17771 c17771M40988 = c6324.m40988();
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final RunnableC16018 runnableC16018 = new RunnableC16018(c14526, c17771M40988, (TextView) viewM40395.findViewById(R.id.MT_Protector), abstractActivityC17204);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۤ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17771 c17771 = c17771M40988;
                String strTrim = c17771.m41599().toString().trim();
                C14526 c14527 = c14526;
                new C8560(abstractActivityC17204, strTrim, c14527.m35044(strTrim), c14527.m35043(strTrim), new C12289(c17771, strTrim, c14527, runnableC16018)).m22955(true);
            }
        });
        c17771M40988.m41608();
        c17771M40988.m41602();
        c17771M40988.m41596(new RunnableC3340(c14526, runnableC16018));
        c17771M40988.m41593(new C24224(runnableC16018));
        c17771M40988.m41592(17);
        C23255 c23255M41605 = c17771M40988.m41605();
        c23255M41605.m52333(6);
        c23255M41605.m52337(abstractActivityC17204.getString(R.string.MT_Protector));
        c23255M41605.setOnKeyListener(new View.OnKeyListener() { // from class: l.᩵ۤ֫
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    c6324.onClick(view);
                }
                return true;
            }
        });
        c23255M41605.mo52291(2);
        c6324.m40983(viewM40395);
        c6324.m40986();
    }
}
