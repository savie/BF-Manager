package l;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8620 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f28177;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f28178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f28179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f28180;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8620(C12921 c12921, View view) {
        super(view);
        this.f28180 = c12921;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f28179 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28178 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28177 = (ImageView) view.findViewById(R.id.MT_Protector);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۨ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8620 c8620 = this.f8464;
                C12921.m32009(c8620.f28180, c8620.getBindingAdapterPosition());
            }
        });
    }
}
