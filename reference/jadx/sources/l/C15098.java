package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15098 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11369 f49284;

    public C15098(C11369 c11369) {
        this.f49284 = c11369;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC1675) abstractC11800).m6018(i);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC1675(this.f49284, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f49284.size();
    }
}
