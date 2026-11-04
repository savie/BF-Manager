package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18350 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Main f59822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f59823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19842 f59824;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f59825 = new ArrayList();

    public C18350(Main main, final C25227 c25227) {
        this.f59822 = main;
        TextView textView = (TextView) ((View) c25227.getParent()).findViewById(R.id.MT_Protector);
        C17359.requireNonNull(textView);
        this.f59823 = textView;
        textView.setText(R.string.MT_Protector);
        c25227.setLayoutManager(new C0067(main));
        AbstractC3269 itemAnimator = c25227.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m10754(200L);
            itemAnimator.m10769(200L);
            itemAnimator.m10761(200L);
            itemAnimator.m10766(200L);
        }
        new C11999(new C10891(this)).m30173(c25227);
        C19842 c19842 = new C19842(this);
        this.f59824 = c19842;
        c25227.setAdapter(c19842);
        C13678.m33462().m40350(main, new InterfaceC16438() { // from class: l.ۙ۬ۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C18350.m42806(this.f17186, (Iterable) obj);
            }
        });
        main.m124(new Runnable() { // from class: l.᩷۬ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C18350.m42807(this.f71172, c25227);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42806(C18350 c18350, Iterable iterable) {
        TextView textView = c18350.f59823;
        ArrayList arrayList = new ArrayList(c18350.f59825.size() + 1);
        ArrayList arrayList2 = c18350.f59825;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC18900) it.next());
        }
        c18350.f59825 = arrayList;
        C8050.m21936(new C22826(arrayList2, arrayList), true).m35496(c18350.f59824);
        if (c18350.f59824.getItemCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42807(C18350 c18350, C25227 c25227) {
        c18350.f59823.setTextColor(C3296.f10779);
        C19842 c19842 = new C19842(c18350);
        c18350.f59824 = c19842;
        c25227.setAdapter(c19842);
    }
}
