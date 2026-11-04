package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC17670 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f58060;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21400 f58061;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58062;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15301 f58063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5607 f58064;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17670(C21400 c21400, View view) {
        super(view);
        this.f58061 = c21400;
        this.f58060 = (TextView) view.findViewById(R.id.textView);
        C17423.m40915(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21400 c21400 = this.f58061;
        if ((c21400.f68169 == null || c21400.f68169.m30009(this.f58064.f19435)) && !C14941.f48783.m55200()) {
            ((ActivityC0848) c21400.requireActivity()).m3452(this.f58064.f19435, this.f58063);
            c21400.f68169.m29972(this.f58064.f19435);
            if (((C1878) c21400.f68165.peek()).f6307.add(this.f58064.f19435 + " " + this.f58062)) {
                C21576.m49069(new Runnable() { // from class: l.ܺܶۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC17670 viewOnClickListenerC17670 = this.f55315;
                        C21400 c21401 = viewOnClickListenerC17670.f58061;
                        c21401.f68166.notifyItemChanged(viewOnClickListenerC17670.getAdapterPosition());
                        c21401.m48661();
                    }
                }, 200L);
            }
        }
    }
}
