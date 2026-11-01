package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0758 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2169 f3072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3073 = new ArrayList();

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC12754) abstractC12554).f42509.setImageResource(((EnumC20447) this.f3073.get(i)).f66371);
    }

    public C0758(C2169 c2169) {
        this.f3072 = c2169;
        for (EnumC20447 enumC20447 : EnumC20447.values()) {
            if (!enumC20447.f66372) {
                this.f3073.add(enumC20447);
            }
        }
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC12754(viewGroup.getContext());
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f3073.size();
    }
}
