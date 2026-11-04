package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩻᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC25328 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f81789;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17122 f81790;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f81791;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC25328(C17122 c17122, View view) {
        super(view);
        this.f81790 = c17122;
        view.setOnClickListener(this);
        this.f81789 = (ImageView) view.findViewById(R.id.icon);
        this.f81791 = (TextView) view.findViewById(R.id.text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C17122 c17122 = this.f81790;
        C2361 c2361BuildDialog = c17122.f55863.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(c17122.f55863.getString(R.string.MT_Protector, ((C17868) c17122.f55864.get(bindingAdapterPosition)).m41711()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C17122 c17123 = this.f38329.f81790;
                String strM41712 = ((C17868) c17123.f55864.remove(bindingAdapterPosition)).m41712();
                C1761.m6205(c17123.f55863, Collections.singletonList(strM41712));
                ShortcutActivity.m134(strM41712);
                c17123.notifyDataSetChanged();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
