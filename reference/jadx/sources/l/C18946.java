package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18946 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f61439;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f61440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3034 f61441;

    public C18946(int i, View view) {
        super(view);
        this.f61441 = (C3034) view.findViewById(R.id.icon);
        this.f61440 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f61439 = imageView;
        imageView.setAlpha(0.5f);
        C17423.m40911(view);
    }
}
