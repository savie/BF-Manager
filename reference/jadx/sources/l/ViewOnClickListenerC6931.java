package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC6931 extends AbstractC13642 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f22937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4584 f22938;

    @Override // l.AbstractC13642
    /* JADX INFO: renamed from: ۙ */
    public final void mo3834(AbstractC18118 abstractC18118) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC6931(ActivityC4584 activityC4584, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC4584).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f22938 = activityC4584;
        this.itemView.setOnClickListener(this);
        TextView textView = (TextView) this.itemView.findViewById(R.id.MT_Protector);
        this.f22937 = textView;
        textView.setText(C20003.m46001().toString());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = (String[]) C13847.stream(EnumC8815.values()).map(new C15431(1)).toArray(new C2456());
        C2361 c2361BuildDialog = this.f22938.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(strArr, C20003.m46001().ordinal(), new DialogInterface.OnClickListener() { // from class: l.۠ۚᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20003.m45999(EnumC8815.values()[i]);
                this.f27578.f22937.setText(C20003.m46001().toString());
                dialogInterface.dismiss();
            }
        });
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }
}
