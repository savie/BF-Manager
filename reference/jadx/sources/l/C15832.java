package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15832 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6138 f51502;

    public C15832(ActivityC6138 activityC6138) {
        this.f51502 = activityC6138;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC12103 viewOnClickListenerC12103 = (ViewOnClickListenerC12103) abstractC11800;
        viewOnClickListenerC12103.f38951.setVisibility(0);
        viewOnClickListenerC12103.f38950.setText(((C14340) this.f51502.f20956.get(i)).m34760());
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC6138 activityC6138 = this.f51502;
        return new ViewOnClickListenerC12103(activityC6138, LayoutInflater.from(activityC6138).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f51502.f20956.size();
    }
}
