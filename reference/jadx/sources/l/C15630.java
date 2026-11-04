package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15630 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22344 f50764;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f50765 = new ArrayList();

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC13393) abstractC11800).f42683.setImageResource(((EnumC3459) this.f50765.get(i)).f11950);
    }

    public C15630(C22344 c22344) {
        this.f50764 = c22344;
        for (EnumC3459 enumC3459 : EnumC3459.values()) {
            if (!enumC3459.f11949) {
                this.f50765.add(enumC3459);
            }
        }
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC13393(viewGroup.getContext());
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f50765.size();
    }
}
