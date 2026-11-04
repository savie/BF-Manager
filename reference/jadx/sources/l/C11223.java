package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q98G */
/* JADX INFO: loaded from: classes3.dex */
public final class C11223 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f35389;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f35390;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f35391;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f35392;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f35394;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f35395;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f35397;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f35398;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f35399;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f35401;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f35403;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CheckBox f35404;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f35396 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35402 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35400 = 0;

    public C11223(Main main) {
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        this.f35390 = viewM40395;
        this.f35403 = (TextView) viewM40395.findViewById(R.id.title);
        this.f35394 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f35395 = viewM40395.findViewById(R.id.MT_Protector);
        this.f35392 = viewM40395.findViewById(R.id.MT_Protector);
        this.f35397 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f35398 = (TextView) viewM40395.findViewById(R.id.textFileCount);
        this.f35399 = (TextView) viewM40395.findViewById(R.id.textFolderCount);
        this.f35389 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f35404 = checkBox;
        TextView textView = (TextView) viewM40395.findViewById(R.id.textView);
        this.f35391 = textView;
        viewM40395.findViewById(R.id.speedModeHelp).setOnClickListener(new ViewOnClickListenerC22412(main, 0));
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("dfsmd", false));
        boolean z = ApplicationC17729.f58262.getBoolean("deletion_warning", true);
        this.f35401 = z;
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m28286() {
        CheckBox checkBox = this.f35389;
        return checkBox.getVisibility() == 0 && checkBox.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28284(String str, String str2) {
        CheckBox checkBox = this.f35389;
        checkBox.setVisibility(0);
        C4312 c4312 = new C4312(this, str2, str, 1);
        int i = C19632.f63249;
        checkBox.setChecked(C21576.f68932.getBoolean("def_mov_recycle_bin", true));
        c4312.onCheckedChanged(checkBox, checkBox.isChecked());
        checkBox.setOnCheckedChangeListener(c4312);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28282(C11223 c11223, String str, String str2, boolean z) {
        if (c11223.f35401) {
            c11223.f35391.setVisibility(z ? 8 : 0);
        }
        TextView textView = c11223.f35394;
        if (!z) {
            str = str2;
        }
        textView.setText(str);
        if (c11223.f35393) {
            c11223.f35392.setVisibility(z ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28283() {
        if (this.f35392.getVisibility() == 8) {
            this.f35393 = true;
            if (m28286()) {
                return;
            }
            C21576.m49068(new RunnableC22836(4, this));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m28285() {
        if (this.f35392.getVisibility() != 0) {
            return false;
        }
        boolean zIsChecked = this.f35404.isChecked();
        C6421.m18184(ApplicationC17729.f58258, "dfsmd", zIsChecked);
        return zIsChecked;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28281(C11223 c11223) {
        c11223.f35397.setText(C8311.m22390(c11223.f35396));
        c11223.f35398.setText(String.valueOf(c11223.f35402));
        c11223.f35399.setText(String.valueOf(c11223.f35400));
    }
}
