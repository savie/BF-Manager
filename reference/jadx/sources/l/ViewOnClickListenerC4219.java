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

/* JADX INFO: renamed from: l.ۘ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC4219 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7042 f15300;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f15301;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f15302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f15303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC4219(ActivityC7042 activityC7042, View view) {
        super(view);
        this.f15300 = activityC7042;
        C0674.m3027(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f15302 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f15301 = imageView;
        Drawable drawableM26304 = C10405.m26304(activityC7042, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        this.f15303 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f15300.m18887(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C16195 c16195 = new C16195(this.f15300, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.֨᩸᩺
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC4219 viewOnClickListenerC4219 = this.f5800;
                ActivityC7042 activityC7042 = viewOnClickListenerC4219.f15300;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC4219.onClick(view);
                } else {
                    C8067 c8067BuildDialog = activityC7042.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC7042.getString(R.string.MT_Protector, viewOnClickListenerC4219.f15302.getText()));
                    final int i = bindingAdapterPosition;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬᩸᩺
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC7042 activityC7043 = viewOnClickListenerC4219.f15300;
                            ArrayList arrayList = (ArrayList) activityC7043.f23660;
                            int i3 = i;
                            arrayList.remove(i3);
                            activityC7043.f23659.notifyItemRemoved(i3);
                            int i4 = C4925.f17255;
                            C4716.m13051(new RunnableC18999(1), C4925.class, 500L);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21269();
                }
                return true;
            }
        });
        C2766.m8440(view, c16195);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f15301.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f15300.f23661.m12830(this);
        return false;
    }
}
