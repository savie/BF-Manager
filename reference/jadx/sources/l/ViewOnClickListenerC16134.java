package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC16134 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f52417;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18372 f52418;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5607 f52419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15301 f52420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52421;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16134(C18372 c18372, View view) {
        super(view);
        this.f52418 = c18372;
        this.f52417 = (TextView) view.findViewById(R.id.textView);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18372 c18372 = this.f52418;
        if ((c18372.f59861 == null || c18372.f59861.m46617(this.f52419.f19435)) && !C14941.f48783.m55200()) {
            ((ActivityC0848) c18372.requireActivity()).m3431(this.f52419.f19435, this.f52420);
            c18372.f59861.m46575(this.f52419.f19435);
            if (((C1878) c18372.f59864.peek()).f6307.add(this.f52419.f19435 + " " + this.f52421)) {
                C21576.m49069(new Runnable() { // from class: l.ܽܰۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC16134 viewOnClickListenerC16134 = this.f57970;
                        C18372 c18373 = viewOnClickListenerC16134.f52418;
                        c18373.f59865.notifyItemChanged(viewOnClickListenerC16134.getAdapterPosition());
                        c18373.m42861();
                    }
                }, 200L);
            }
        }
    }
}
