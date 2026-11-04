package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC2674 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8640 f8496;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f8497;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f8498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f8499;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f8500;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2674(C8640 c8640, View view) {
        super(view);
        this.f8496 = c8640;
        C17423.m40911(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f8497 = (TextView) view.findViewById(R.id.title);
        this.f8499 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f8498 = imageView;
        Drawable drawableM20563 = C7508.m20563(c8640.f28230, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        this.f8500 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C8640 c8640 = this.f8496;
        BitSet bitSet = c8640.f28229;
        ActivityC5440 activityC5440 = c8640.f28230;
        if (activityC5440.f19006) {
            boolean z = bitSet.get(bindingAdapterPosition);
            bitSet.set(bindingAdapterPosition, !z);
            if (!z) {
                c8640.f28234++;
            } else {
                c8640.f28234--;
            }
            c8640.f28235 = -1;
            this.itemView.setBackgroundColor(!z ? C3296.f10761 : 0);
            activityC5440.m16252(c8640.f28234 > 0);
            if (!z) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                int iAbs = Math.abs(bindingAdapterPosition2 - c8640.f28228);
                c8640.f28228 = bindingAdapterPosition2;
                if (iAbs == 1) {
                    c8640.f28233++;
                } else {
                    c8640.f28233 = 1;
                }
                if (c8640.f28233 == 5) {
                    C22673.m51159(R.string.MT_Protector);
                    c8640.f28233 = 0;
                    return;
                }
                return;
            }
            c8640.f28228 = -2;
            return;
        }
        activityC5440.m16248((C16626) ((ArrayList) c8640.m23286()).get(bindingAdapterPosition), R.string.MT_Protector, false, new InterfaceC0818() { // from class: l.ᩳ۫ᩴ
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                C8640 c8641 = this.f61797.f8496;
                ArrayList arrayList = (ArrayList) c8641.m23286();
                int i = bindingAdapterPosition;
                arrayList.set(i, (C16626) obj);
                c8641.f28227.notifyItemChanged(i);
                C24832.m55356();
            }
        });
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C8640 c8640 = this.f8496;
        BitSet bitSet = c8640.f28229;
        ActivityC5440 activityC5440 = c8640.f28230;
        if (!activityC5440.f19006) {
            C18452 c18452 = new C18452(activityC5440, view, 0);
            c18452.m42997();
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42994(new InterfaceC21436() { // from class: l.۟۫ᩴ
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC2674 viewOnClickListenerC2674 = this.f26244;
                    C8640 c8641 = viewOnClickListenerC2674.f8496;
                    ActivityC5440 activityC5441 = c8641.f28230;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.string.MT_Protector) {
                        viewOnClickListenerC2674.onClick(view);
                        return true;
                    }
                    final int i = bindingAdapterPosition;
                    if (itemId == R.string.MT_Protector) {
                        final C8640 c8642 = (C8640) activityC5441.f19003.get(activityC5441.f18998.m36517());
                        final List listM6080 = c8642.m23287().m6080();
                        activityC5441.m16248(new C16626(), R.string.MT_Protector, true, new InterfaceC0818() { // from class: l.ۢ۫ᩴ
                            @Override // l.InterfaceC0818
                            public final void accept(Object obj) {
                                int i2 = i + 1;
                                listM6080.add(i2, (C16626) obj);
                                C8640 c8643 = c8642;
                                c8643.f28227.notifyItemInserted(i2);
                                c8643.f28226.smoothScrollToPosition(i2);
                                C24832.m55356();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C2361 c2361BuildDialog = activityC5441.buildDialog();
                        c2361BuildDialog.m8021(R.string.MT_Protector);
                        c2361BuildDialog.m8008(activityC5441.getString(R.string.MT_Protector, viewOnClickListenerC2674.f8497.getText()));
                        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨۫ᩴ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                C8640 c8643 = viewOnClickListenerC2674.f8496;
                                ArrayList arrayList = (ArrayList) c8643.m23286();
                                int i3 = i;
                                arrayList.remove(i3);
                                c8643.f28227.notifyItemRemoved(i3);
                                C24832.m55356();
                            }
                        });
                        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog.m8016();
                        return true;
                    }
                    if (itemId != R.string.MT_Protector) {
                        if (itemId == R.string.MT_Protector) {
                            ActivityC5440.m16257(activityC5441, i);
                        }
                        return true;
                    }
                    final C8640 c8643 = (C8640) activityC5441.f19003.get(activityC5441.f18998.m36517());
                    final List listM6081 = c8643.m23287().m6080();
                    activityC5441.m16248(C16626.m39341(((C16626) ((ArrayList) c8641.m23286()).get(i)).m39344()), R.string.MT_Protector, true, new InterfaceC0818() { // from class: l.ۡ۫ᩴ
                        @Override // l.InterfaceC0818
                        public final void accept(Object obj) {
                            int i2 = i + 1;
                            listM6081.add(i2, (C16626) obj);
                            C8640 c8644 = c8643;
                            c8644.f28227.notifyItemInserted(i2);
                            c8644.f28226.smoothScrollToPosition(i2);
                            C24832.m55356();
                        }
                    });
                    return true;
                }
            });
            C22744.m51282(view, c18452);
            return true;
        }
        int i = c8640.f28235;
        if (i == -1) {
            c8640.f28235 = bindingAdapterPosition;
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c8640.f28234++;
                this.itemView.setBackgroundColor(C3296.f10761);
                activityC5440.m16252(c8640.f28234 > 0);
            }
            return true;
        }
        c8640.f28235 = -1;
        if (i <= bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (bindingAdapterPosition <= i) {
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c8640.f28234++;
            }
            bindingAdapterPosition++;
        }
        c8640.f28227.notifyDataSetChanged();
        activityC5440.m16252(c8640.f28234 > 0);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f8498.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f8496.f28231.m30178(this);
        return false;
    }
}
