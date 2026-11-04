package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20286 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f65134;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f65135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12081 f65136;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC20286(ActivityC12081 activityC12081, View view) {
        super(view);
        this.f65136 = activityC12081;
        C17423.m40911(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f65135 = (TextView) view.findViewById(R.id.title);
        this.f65134 = (TextView) view.findViewById(R.id.MT_Protector);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(C20613.f66109.f66114.m30080());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f65136.m30255(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C18452 c18452 = new C18452(this.f65136, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42997();
        c18452.m42994(new InterfaceC21436() { // from class: l.᩹ۗܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC20286 viewOnClickListenerC20286 = this.f75414;
                ActivityC12081 activityC12081 = viewOnClickListenerC20286.f65136;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC20286.onClick(view);
                } else {
                    C2361 c2361BuildDialog = activityC12081.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC12081.getString(R.string.MT_Protector, viewOnClickListenerC20286.f65135.getText()));
                    final int i = bindingAdapterPosition;
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۗܳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC12081 activityC12082 = viewOnClickListenerC20286.f65136;
                            List list = activityC12082.f38897;
                            int i3 = i;
                            activityC12082.f38898.mo37735((C16556) list.remove(i3));
                            activityC12082.f38899.notifyItemRemoved(i3);
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
}
