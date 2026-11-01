package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20324 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f65832;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f65833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0567 f65834;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20324(ActivityC0567 activityC0567, View view) {
        super(view);
        this.f65834 = activityC0567;
        C0674.m3027(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f65832 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f65833 = imageView;
        Drawable drawableM26304 = C10405.m26304(activityC0567, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        ActivityC0567 activityC0567 = this.f65834;
        activityC0567.f2352 = bindingAdapterPosition;
        ((C21735) activityC0567.f2350.get(activityC0567.f2352)).mo4703((AbstractActivityC12483) activityC0567);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C16195 c16195 = new C16195(this.f65834, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.᩷ᩳ֨
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC20324 viewOnClickListenerC20324 = this.f68484;
                ActivityC0567 activityC0567 = viewOnClickListenerC20324.f65834;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC20324.onClick(view);
                } else {
                    C8067 c8067BuildDialog = activityC0567.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC0567.getString(R.string.MT_Protector, viewOnClickListenerC20324.f65832.getText()));
                    final int i = bindingAdapterPosition;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺᩳ֨
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = i;
                            C5717.m15774(i3);
                            viewOnClickListenerC20324.f65834.f2348.notifyItemRemoved(i3);
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
        if (this.f65833.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f65834.f2349.m12830(this);
        return false;
    }
}
