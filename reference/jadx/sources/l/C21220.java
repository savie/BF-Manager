package l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21220 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f69132;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f69133;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC14871 viewOnClickListenerC14871 = (ViewOnClickListenerC14871) abstractC12554;
        C17692 c17692 = (C17692) this.f69133.get(i);
        viewOnClickListenerC14871.f48592.setImageBitmap(c17692.m41224());
        viewOnClickListenerC14871.f48593.setText(c17692.m41223());
    }

    public C21220(AbstractActivityC12483 abstractActivityC12483) throws Throwable {
        this.f69132 = abstractActivityC12483;
        ArrayList arrayList = new ArrayList();
        this.f69133 = new ArrayList();
        for (C3348 c3348 : C11692.m29191(abstractActivityC12483)) {
            Bitmap bitmapM141 = ShortcutActivity.m141(c3348.m9957());
            if (bitmapM141 != null) {
                this.f69133.add(0, new C17692(c3348.m9957(), c3348.m9958(), bitmapM141));
            } else {
                arrayList.add(c3348.m9957());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C11692.m29194(abstractActivityC12483, (List) arrayList);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC14871(this, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f69133.size();
    }
}
