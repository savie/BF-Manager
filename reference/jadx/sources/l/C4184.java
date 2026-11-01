package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4184 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f15235 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Main f15236;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f15237;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0263 f15238;

    public C4184(Main main, C17492 c17492) {
        this.f15236 = main;
        TextView textView = (TextView) ((View) c17492.getParent()).findViewById(R.id.MT_Protector);
        C13638.requireNonNull(textView);
        this.f15237 = textView;
        textView.setText(R.string.MT_Protector);
        c17492.setLayoutManager(new C13115(main));
        AbstractC1825 itemAnimator = c17492.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m5954(200L);
            itemAnimator.m5952(200L);
            itemAnimator.m5961(200L);
            itemAnimator.m5964(200L);
        }
        new C4647(new C15787(this)).m12825(c17492);
        C0263 c0263 = new C0263(this);
        this.f15238 = c0263;
        c17492.setAdapter(c0263);
        C20725.m46654().m44959(main, new C6992(1, this));
        main.m131(new RunnableC4493(2, this, c17492));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11832(C4184 c4184, Iterable iterable) {
        TextView textView = c4184.f15237;
        ArrayList arrayList = new ArrayList(c4184.f15235.size() + 1);
        ArrayList arrayList2 = c4184.f15235;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC17902) it.next());
        }
        c4184.f15235 = arrayList;
        C4066.m11593(new C20020(arrayList2, arrayList)).m15146(c4184.f15238);
        if (c4184.f15238.getItemCount() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11833(C4184 c4184, C17492 c17492) {
        c4184.f15237.setTextColor(C20368.f66009);
        C0263 c0263 = new C0263(c4184);
        c4184.f15238 = c0263;
        c17492.setAdapter(c0263);
    }
}
