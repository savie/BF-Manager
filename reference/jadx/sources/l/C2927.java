package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C2927 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f9586;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f9587;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f9588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2927(C8893 c8893, View view) {
        super(view);
        this.f9587 = c8893;
        this.f9588 = (TextView) view.findViewById(R.id.title);
        this.f9586 = (TextView) view.findViewById(R.id.MT_Protector);
        C17423.m40911(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۡ᩷ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2927 c2927 = this.f31157;
                C8893 c8894 = c2927.f9587;
                int bindingAdapterPosition = c2927.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c8894.f29055.f53645.size()) {
                    return;
                }
                C8893.m23796(c8894, ((C24778) c8894.f29055.f53645.get(bindingAdapterPosition - 1)).f80214);
            }
        });
    }
}
