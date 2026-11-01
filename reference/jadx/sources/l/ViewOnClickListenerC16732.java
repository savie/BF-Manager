package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16732 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12499 f53585;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f53586;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f53587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f53588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16732(ActivityC12499 activityC12499, View view) {
        super(view);
        this.f53585 = activityC12499;
        C0674.m3027(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f53587 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f53586 = imageView;
        Drawable drawableM26304 = C10405.m26304(activityC12499, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        this.f53588 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f53585.m31044(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C16195 c16195 = new C16195(this.f53585, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.᩶ܶ᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC16732 viewOnClickListenerC16732 = this.f65701;
                ActivityC12499 activityC12499 = viewOnClickListenerC16732.f53585;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    C16737.m39272((CharSequence) ((C6148) activityC12499.f41797.get(viewOnClickListenerC16732.getBindingAdapterPosition())).f21002);
                } else if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC16732.onClick(view);
                } else {
                    C8067 c8067BuildDialog = activityC12499.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC12499.getString(R.string.MT_Protector, viewOnClickListenerC16732.f53587.getText()));
                    final int i = bindingAdapterPosition;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܶ᩹
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC12499 activityC124910 = viewOnClickListenerC16732.f53585;
                            List list = activityC124910.f41797;
                            int i3 = i;
                            list.remove(i3);
                            activityC124910.f41795.notifyItemRemoved(i3);
                            C11088.m27977();
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
        if (this.f53586.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f53585.f41796.m12830(this);
        return false;
    }
}
