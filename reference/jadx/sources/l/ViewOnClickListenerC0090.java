package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֡֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0090 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f1003;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TextView f1004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16319 f1005;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC0090(ActivityC16319 activityC16319, View view) {
        super(view);
        this.f1005 = activityC16319;
        C0674.m3027(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f1003 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f1004 = (TextView) view.findViewById(R.id.MT_Protector);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(C0690.f2900.f2943.m35074());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1005.m38483(getBindingAdapterPosition());
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C16195 c16195 = new C16195(this.f1005, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.ܺ֨᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC0090 viewOnClickListenerC0090 = this.f50781;
                ActivityC16319 activityC16319 = viewOnClickListenerC0090.f1005;
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    viewOnClickListenerC0090.onClick(view);
                } else {
                    C8067 c8067BuildDialog = activityC16319.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC16319.getString(R.string.MT_Protector, viewOnClickListenerC0090.f1003.getText()));
                    final int i = bindingAdapterPosition;
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֨᩹
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC16319 activityC163110 = viewOnClickListenerC0090.f1005;
                            List list = activityC163110.f52553;
                            int i3 = i;
                            activityC163110.f52552.mo19053((C9969) list.remove(i3));
                            activityC163110.f52551.notifyItemRemoved(i3);
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
}
