package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q98G */
/* JADX INFO: loaded from: classes3.dex */
public final class C11734 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f39434;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final CheckBox f39436;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f39437;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f39439;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f39440;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39441;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f39442;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f39443;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f39444;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f39445;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f39446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f39447;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CheckBox f39449;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f39448 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f39435 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f39438 = 0;

    public C11734(Main main) {
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        this.f39440 = viewM30995;
        this.f39446 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f39439 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f39434 = viewM30995.findViewById(R.id.MT_Protector);
        this.f39442 = viewM30995.findViewById(R.id.MT_Protector);
        this.f39445 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f39444 = (TextView) viewM30995.findViewById(R.id.textFileCount);
        this.f39447 = (TextView) viewM30995.findViewById(R.id.textFolderCount);
        this.f39436 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f39449 = checkBox;
        TextView textView = (TextView) viewM30995.findViewById(R.id.textView);
        this.f39437 = textView;
        viewM30995.findViewById(R.id.speedModeHelp).setOnClickListener(new ViewOnClickListenerC22904(1, main));
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("dfsmd", false));
        boolean z = ApplicationC0716.f2988.getBoolean("deletion_warning", true);
        this.f39443 = z;
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29334() {
        CheckBox checkBox = this.f39436;
        return checkBox.getVisibility() == 0 && checkBox.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29332(final String str, final String str2) {
        CheckBox checkBox = this.f39436;
        checkBox.setVisibility(0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܰܰ֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C11734.m29330(this.f45688, str2, str, z);
            }
        };
        int i = C20370.f66031;
        checkBox.setChecked(C16737.f53615.getBoolean("def_mov_recycle_bin", true));
        onCheckedChangeListener.onCheckedChanged(checkBox, checkBox.isChecked());
        checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29330(C11734 c11734, String str, String str2, boolean z) {
        if (c11734.f39443) {
            c11734.f39437.setVisibility(z ? 8 : 0);
        }
        TextView textView = c11734.f39439;
        if (!z) {
            str = str2;
        }
        textView.setText(str);
        if (c11734.f39441) {
            c11734.f39442.setVisibility(z ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29331() {
        if (this.f39442.getVisibility() == 8) {
            this.f39441 = true;
            if (m29334()) {
                return;
            }
            C16737.m39273(new RunnableC8017(1, this));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m29333() {
        if (this.f39442.getVisibility() != 0) {
            return false;
        }
        boolean zIsChecked = this.f39449.isChecked();
        C1679.m5597(ApplicationC0716.f2992, "dfsmd", zIsChecked);
        return zIsChecked;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29329(C11734 c11734) {
        c11734.f39445.setText(C1791.m5863(c11734.f39448));
        c11734.f39444.setText(String.valueOf(c11734.f39435));
        c11734.f39447.setText(String.valueOf(c11734.f39438));
    }
}
