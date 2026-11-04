package l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes5.dex */
public final class C17122 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f55863;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f55864;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC25328 viewOnClickListenerC25328 = (ViewOnClickListenerC25328) abstractC11800;
        C17868 c17868 = (C17868) this.f55864.get(i);
        viewOnClickListenerC25328.f81789.setImageBitmap(c17868.m41710());
        viewOnClickListenerC25328.f81791.setText(c17868.m41711());
    }

    public C17122(AbstractActivityC17204 abstractActivityC17204) throws Throwable {
        this.f55863 = abstractActivityC17204;
        ArrayList arrayList = new ArrayList();
        this.f55864 = new ArrayList();
        for (C15184 c15184 : C1761.m6202(abstractActivityC17204)) {
            Bitmap bitmapM135 = ShortcutActivity.m135(c15184.m36530());
            if (bitmapM135 != null) {
                this.f55864.add(0, new C17868(c15184.m36530(), c15184.m36531(), bitmapM135));
            } else {
                arrayList.add(c15184.m36530());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C1761.m6205(abstractActivityC17204, (List) arrayList);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC25328(this, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f55864.size();
    }
}
