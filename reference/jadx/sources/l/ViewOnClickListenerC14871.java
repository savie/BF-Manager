package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܶ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC14871 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21220 f48591;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f48592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f48593;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC14871(C21220 c21220, View view) {
        super(view);
        this.f48591 = c21220;
        view.setOnClickListener(this);
        this.f48592 = (ImageView) view.findViewById(R.id.icon);
        this.f48593 = (TextView) view.findViewById(R.id.text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21220 c21220 = this.f48591;
        C8067 c8067BuildDialog = c21220.f69132.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(c21220.f69132.getString(R.string.MT_Protector, ((C17692) c21220.f69133.get(bindingAdapterPosition)).m41223()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺֡ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C21220 c21221 = this.f73747.f48591;
                String strM41225 = ((C17692) c21221.f69133.remove(bindingAdapterPosition)).m41225();
                C11692.m29194(c21221.f69132, Collections.singletonList(strM41225));
                ShortcutActivity.m140(strM41225);
                c21221.notifyDataSetChanged();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
