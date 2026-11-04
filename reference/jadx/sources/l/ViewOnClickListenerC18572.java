package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC18572 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f60341;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f60342;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0673 f60343;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC18572(ActivityC0673 activityC0673, View view) {
        super(view);
        this.f60343 = activityC0673;
        C17423.m40911(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f60342 = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f60341 = imageView;
        Drawable drawableM20563 = C7508.m20563(activityC0673, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        ActivityC0673 activityC0673 = this.f60343;
        activityC0673.f2554 = bindingAdapterPosition;
        ((C23794) activityC0673.f2555.get(activityC0673.f2554)).mo1328((AbstractActivityC17204) activityC0673);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C18452 c18452 = new C18452(this.f60343, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42997();
        c18452.m42994(new InterfaceC21436() { // from class: l.ܰ᩶۫
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC18572 viewOnClickListenerC18572 = this.f48537;
                ActivityC0673 activityC0673 = viewOnClickListenerC18572.f60343;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC18572.onClick(view);
                } else {
                    C2361 c2361BuildDialog = activityC0673.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC0673.getString(R.string.MT_Protector, viewOnClickListenerC18572.f60342.getText()));
                    final int i = bindingAdapterPosition;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩶۫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = i;
                            C7606.m20799(i3);
                            viewOnClickListenerC18572.f60343.f2556.notifyItemRemoved(i3);
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
        if (this.f60341.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f60343.f2551.m30178(this);
        return false;
    }
}
