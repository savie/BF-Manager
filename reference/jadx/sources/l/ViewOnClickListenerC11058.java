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

/* JADX INFO: renamed from: l.ۤᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11058 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f34886;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f34887;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22993 f34888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f34889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11058(ActivityC22993 activityC22993, View view) {
        super(view);
        this.f34888 = activityC22993;
        C17423.m40911(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f34886 = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f34887 = imageView;
        Drawable drawableM20563 = C7508.m20563(activityC22993, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        this.f34889 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f34888.m51878(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C18452 c18452 = new C18452(this.f34888, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42997();
        c18452.m42994(new InterfaceC21436() { // from class: l.ۙᩳ᩻
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC11058 viewOnClickListenerC11058 = this.f17787;
                ActivityC22993 activityC22993 = viewOnClickListenerC11058.f34888;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC11058.onClick(view);
                } else {
                    C2361 c2361BuildDialog = activityC22993.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC22993.getString(R.string.MT_Protector, viewOnClickListenerC11058.f34886.getText()));
                    final int i = bindingAdapterPosition;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ᩳ᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC22993 activityC22994 = viewOnClickListenerC11058.f34888;
                            ArrayList arrayList = activityC22994.f74644;
                            int i3 = i;
                            arrayList.remove(i3);
                            activityC22994.f74645.notifyItemRemoved(i3);
                            int i4 = C1036.f3749;
                            C5261.m15836(new RunnableC18935(0), C1036.class, 500L);
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
        if (this.f34887.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f34888.f74643.m30178(this);
        return false;
    }
}
