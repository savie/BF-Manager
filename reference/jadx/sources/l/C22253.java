package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes.dex */
public final class C22253 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f71663;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f71664;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f71665;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11064 f71666;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22253(C11064 c11064, View view) {
        super(view);
        this.f71666 = c11064;
        C17423.m40911(view);
        this.f71664 = (TextView) view.findViewById(R.id.title);
        this.f71663 = (TextView) view.findViewById(R.id.MT_Protector);
        View viewFindViewById = view.findViewById(R.id.drag);
        this.f71665 = viewFindViewById;
        view.setOnClickListener(new View.OnClickListener() { // from class: l.۬᩸ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C22253 c22253 = this.f44708;
                C11064 c11065 = c22253.f71666;
                int bindingAdapterPosition = c22253.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c11065.f34897.size()) {
                    return;
                }
                C11064.m27959(c11065, (C0911) c11065.f34897.get(bindingAdapterPosition - 1), false);
            }
        });
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۙᩴۚ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C22253 c22253 = this.f17800;
                C11064 c11065 = c22253.f71666;
                if (motionEvent.getActionMasked() != 0 || !C11064.m27970(c11065, c22253.getBindingAdapterPosition())) {
                    return false;
                }
                c11065.f34902.m30178(c22253);
                return false;
            }
        });
    }
}
