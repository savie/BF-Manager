package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7418 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20824 f24696;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f24697;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f24698;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f24699;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7418(C20824 c20824, View view) {
        super(view);
        this.f24696 = c20824;
        C0674.m3027(view);
        this.f24698 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f24697 = (TextView) view.findViewById(R.id.MT_Protector);
        View viewFindViewById = view.findViewById(R.id.drag);
        this.f24699 = viewFindViewById;
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۡۧ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7418 c7418 = this.f30355;
                C20824 c20825 = c7418.f24696;
                int bindingAdapterPosition = c7418.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c20825.f67671.size()) {
                    return;
                }
                C20824.m46838(c20825, (C9422) c20825.f67671.get(bindingAdapterPosition - 1), false);
            }
        });
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۤۧ֨
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C7418 c7418 = this.f34934;
                C20824 c20825 = c7418.f24696;
                if (motionEvent.getActionMasked() != 0 || !C20824.m46846(c20825, c7418.getBindingAdapterPosition())) {
                    return false;
                }
                c20825.f67669.m12830(c7418);
                return false;
            }
        });
    }
}
