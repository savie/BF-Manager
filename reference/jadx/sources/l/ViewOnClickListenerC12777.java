package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12777 extends AbstractC3603 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TextView f42593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6426 f42594;

    @Override // l.AbstractC3603
    /* JADX INFO: renamed from: ۙ */
    public final void mo6660(AbstractC9871 abstractC9871) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12777(ActivityC6426 activityC6426, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC6426).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f42594 = activityC6426;
        this.itemView.setOnClickListener(this);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f42593 = textView;
        textView.setText(C2877.m8662().toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = (String[]) C20318.stream(EnumC17465.values()).map(new C1443(2)).toArray(new C21949());
        C8067 c8067BuildDialog = this.f42594.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(strArr, C2877.m8662().ordinal(), new DialogInterface.OnClickListener() { // from class: l.֨֨ۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2877.m8661(EnumC17465.values()[i]);
                this.f3358.f42593.setText(C2877.m8662().toString());
                dialogInterface.dismiss();
            }
        });
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }
}
