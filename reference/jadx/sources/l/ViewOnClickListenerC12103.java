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

/* JADX INFO: renamed from: l.ۨۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12103 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f38950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f38951;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6138 f38952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f38953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12103(ActivityC6138 activityC6138, View view) {
        super(view);
        this.f38952 = activityC6138;
        C17423.m40911(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f38950 = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f38951 = imageView;
        Drawable drawableM20563 = C7508.m20563(activityC6138, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        this.f38953 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f38952.m17742(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C18452 c18452 = new C18452(this.f38952, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42997();
        c18452.m42994(new InterfaceC21436() { // from class: l.ۗۘܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC12103 viewOnClickListenerC12103 = this.f10221;
                ActivityC6138 activityC6138 = viewOnClickListenerC12103.f38952;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    C21576.m49067((CharSequence) ((C14340) activityC6138.f20956.get(viewOnClickListenerC12103.getBindingAdapterPosition())).f45235);
                } else if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC12103.onClick(view);
                } else {
                    C2361 c2361BuildDialog = activityC6138.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC6138.getString(R.string.MT_Protector, viewOnClickListenerC12103.f38950.getText()));
                    final int i = bindingAdapterPosition;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۘܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC6138 activityC6139 = viewOnClickListenerC12103.f38952;
                            List list = activityC6139.f20956;
                            int i3 = i;
                            list.remove(i3);
                            activityC6139.f20958.notifyItemRemoved(i3);
                            C21054.m48116();
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                }
                return true;
            }
        });
        C22744.m51282(view, c18452);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f38951.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f38952.f20957.m30178(this);
        return false;
    }
}
