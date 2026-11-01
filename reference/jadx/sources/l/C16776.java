package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16776 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f53700;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f53701;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f53702;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16776(C12543 c12543, View view) {
        super(view);
        this.f53701 = c12543;
        this.f53702 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f53700 = (TextView) view.findViewById(R.id.MT_Protector);
        C0674.m3027(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.֡ܿ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C16776 c16776 = this.f2297;
                C12543 c12544 = c16776.f53701;
                int bindingAdapterPosition = c16776.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c12544.f41985.f26263.size()) {
                    return;
                }
                C12543.m31193(c12544, ((C18593) c12544.f41985.f26263.get(bindingAdapterPosition - 1)).f59153);
            }
        });
    }
}
