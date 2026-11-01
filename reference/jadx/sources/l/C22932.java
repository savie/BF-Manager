package l;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22932 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f74541;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f74542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f74543;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f74544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22932(C7409 c7409, View view) {
        super(view);
        this.f74541 = c7409;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f74544 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f74543 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f74542 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۜۤܰ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C22932 c22932 = this.f22595;
                C7409.m19771(c22932.f74541, c22932.getBindingAdapterPosition());
            }
        });
    }
}
