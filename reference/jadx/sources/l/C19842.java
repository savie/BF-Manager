package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C19842 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18350 f63784;

    public C19842(C18350 c18350) {
        this.f63784 = c18350;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC21334) abstractC11800).mo1486((AbstractC18900) ((ArrayList) this.f63784.f59825).get(i));
    }

    @Override // l.AbstractC12964
    public final void onViewRecycled(AbstractC11800 abstractC11800) {
        ((ViewOnClickListenerC21334) abstractC11800).mo1486((AbstractC18900) null);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC21334(this.f63784.f59822, viewGroup);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return ((ArrayList) this.f63784.f59825).size();
    }
}
