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

/* JADX INFO: renamed from: l.᩹᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22571 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f73567;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f73568;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f73569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1403 f73570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f73571;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22571(C1403 c1403, View view) {
        super(view);
        this.f73570 = c1403;
        C0674.m3027(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f73568 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f73567 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f73569 = imageView;
        Drawable drawableM26304 = C10405.m26304(c1403.f5818, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        this.f73571 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1403 c1403 = this.f73570;
        BitSet bitSet = c1403.f5819;
        ActivityC19749 activityC19749 = c1403.f5818;
        if (activityC19749.f63459) {
            boolean z = bitSet.get(bindingAdapterPosition);
            bitSet.set(bindingAdapterPosition, !z);
            if (!z) {
                c1403.f5821++;
            } else {
                c1403.f5821--;
            }
            c1403.f5814 = -1;
            this.itemView.setBackgroundColor(!z ? C20368.f65992 : 0);
            activityC19749.m44940(c1403.f5821 > 0);
            if (!z) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                int iAbs = Math.abs(bindingAdapterPosition2 - c1403.f5820);
                c1403.f5820 = bindingAdapterPosition2;
                if (iAbs == 1) {
                    c1403.f5817++;
                } else {
                    c1403.f5817 = 1;
                }
                if (c1403.f5817 == 5) {
                    C15829.m37618(R.string.MT_Protector);
                    c1403.f5817 = 0;
                    return;
                }
                return;
            }
            c1403.f5820 = -2;
            return;
        }
        activityC19749.m44933((C21159) ((ArrayList) c1403.m4914()).get(bindingAdapterPosition), R.string.MT_Protector, false, new InterfaceC17295() { // from class: l.ܰ᩹ۚ
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                C1403 c1404 = this.f46340.f73570;
                ArrayList arrayList = (ArrayList) c1404.m4914();
                int i = bindingAdapterPosition;
                arrayList.set(i, (C21159) obj);
                c1404.f5816.notifyItemChanged(i);
                C7754.m20408();
            }
        });
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C1403 c1403 = this.f73570;
        BitSet bitSet = c1403.f5819;
        ActivityC19749 activityC19749 = c1403.f5818;
        if (!activityC19749.f63459) {
            C16195 c16195 = new C16195(activityC19749, view, 0);
            c16195.m38292();
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38296(new InterfaceC21133() { // from class: l.ۙ᩹ۚ
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC22571 viewOnClickListenerC22571 = this.f17263;
                    C1403 c1404 = viewOnClickListenerC22571.f73570;
                    ActivityC19749 activityC197410 = c1404.f5818;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.string.MT_Protector) {
                        viewOnClickListenerC22571.onClick(view);
                        return true;
                    }
                    final int i = bindingAdapterPosition;
                    if (itemId == R.string.MT_Protector) {
                        final C1403 c1405 = (C1403) activityC197410.f63470.get(activityC197410.f63464.m44426());
                        final List listM23579 = c1405.m4915().m23579();
                        activityC197410.m44933(new C21159(), R.string.MT_Protector, true, new InterfaceC17295() { // from class: l.ۨ᩹ۚ
                            @Override // l.InterfaceC17295
                            public final void accept(Object obj) {
                                int i2 = i + 1;
                                listM23579.add(i2, (C21159) obj);
                                C1403 c1406 = c1405;
                                c1406.f5816.notifyItemInserted(i2);
                                c1406.f5815.smoothScrollToPosition(i2);
                                C7754.m20408();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C8067 c8067BuildDialog = activityC197410.buildDialog();
                        c8067BuildDialog.m21274(R.string.MT_Protector);
                        c8067BuildDialog.m21261(activityC197410.getString(R.string.MT_Protector, viewOnClickListenerC22571.f73568.getText()));
                        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖ᩹ۚ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                C1403 c1406 = viewOnClickListenerC22571.f73570;
                                ArrayList arrayList = (ArrayList) c1406.m4914();
                                int i3 = i;
                                arrayList.remove(i3);
                                c1406.f5816.notifyItemRemoved(i3);
                                C7754.m20408();
                            }
                        });
                        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c8067BuildDialog.m21269();
                        return true;
                    }
                    if (itemId != R.string.MT_Protector) {
                        if (itemId == R.string.MT_Protector) {
                            ActivityC19749.m44938(activityC197410, i);
                        }
                        return true;
                    }
                    final C1403 c1406 = (C1403) activityC197410.f63470.get(activityC197410.f63464.m44426());
                    final List listM235710 = c1406.m4915().m23579();
                    activityC197410.m44933(C21159.m47613(((C21159) ((ArrayList) c1404.m4914()).get(i)).m47616()), R.string.MT_Protector, true, new InterfaceC17295() { // from class: l.ۚ᩹ۚ
                        @Override // l.InterfaceC17295
                        public final void accept(Object obj) {
                            int i2 = i + 1;
                            listM235710.add(i2, (C21159) obj);
                            C1403 c1407 = c1406;
                            c1407.f5816.notifyItemInserted(i2);
                            c1407.f5815.smoothScrollToPosition(i2);
                            C7754.m20408();
                        }
                    });
                    return true;
                }
            });
            C2766.m8440(view, c16195);
            return true;
        }
        int i = c1403.f5814;
        if (i == -1) {
            c1403.f5814 = bindingAdapterPosition;
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c1403.f5821++;
                this.itemView.setBackgroundColor(C20368.f65992);
                activityC19749.m44940(c1403.f5821 > 0);
            }
            return true;
        }
        c1403.f5814 = -1;
        if (i <= bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (bindingAdapterPosition <= i) {
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c1403.f5821++;
            }
            bindingAdapterPosition++;
        }
        c1403.f5816.notifyDataSetChanged();
        activityC19749.m44940(c1403.f5821 > 0);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f73569.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f73570.f5813.m12830(this);
        return false;
    }
}
