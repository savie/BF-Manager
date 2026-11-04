package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4402 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0673 f15831;

    public C4402(ActivityC0673 activityC0673) {
        this.f15831 = activityC0673;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC18572 viewOnClickListenerC18572 = (ViewOnClickListenerC18572) abstractC11800;
        viewOnClickListenerC18572.f60341.setVisibility(0);
        viewOnClickListenerC18572.f60342.setText(((C23794) this.f15831.f2555.get(i)).f1122);
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC0673 activityC0673 = this.f15831;
        return new ViewOnClickListenerC18572(activityC0673, LayoutInflater.from(activityC0673).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f15831.f2555.size();
    }
}
