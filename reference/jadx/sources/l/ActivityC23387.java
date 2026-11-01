package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩻֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23387 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75766 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C7864 f75767;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C12098 f75768;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C0807 f75769;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C22681 f75770;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f75771;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "SchemeEditorActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC8814(1, this));
        String stringExtra = getIntent().getStringExtra("schemeName");
        C13638.requireNonNull(stringExtra);
        setTitle(stringExtra);
        try {
            this.f75770 = C14920.m35665(stringExtra);
        } catch (Exception unused) {
            this.f75770 = new C22681(stringExtra);
        }
        C12098 c12098 = new C12098(this);
        this.f75768 = c12098;
        listView.setAdapter((ListAdapter) c12098);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        m51526(-1, (C3629) null);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m51526(i, (C3629) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51530(ActivityC23387 activityC23387, C10687 c10687, CompoundButton compoundButton, CompoundButton compoundButton2, CompoundButton compoundButton3, CompoundButton compoundButton4, CompoundButton compoundButton5, CompoundButton compoundButton6, CompoundButton compoundButton7, C3629 c3629, int i, DialogInterfaceC19356 dialogInterfaceC19356) {
        Spinner spinner = c10687.f36486;
        if (spinner.getSelectedItemPosition() != 2) {
            if (!compoundButton.isChecked() && !compoundButton2.isChecked() && !compoundButton3.isChecked()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            C7864 c7864 = activityC23387.f75767;
            if (c7864.f25879.m7428() && c7864.f25880.m7428() && c7864.f25877.m7428()) {
                if (spinner.getSelectedItemPosition() == 1 && activityC23387.f75771 == 0) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
            } else {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        } else {
            if (!compoundButton4.isChecked() && !compoundButton5.isChecked() && !compoundButton6.isChecked() && !compoundButton7.isChecked()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            C0807 c0807 = activityC23387.f75769;
            if (!c0807.f3416.m7428() || !c0807.f3420.m7428() || !c0807.f3414.m7428()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        }
        c3629.f13334 = spinner.getSelectedItemPosition();
        activityC23387.f75767.f25878 = compoundButton.isChecked();
        activityC23387.f75767.f25881 = compoundButton3.isChecked();
        activityC23387.f75767.f25882 = compoundButton2.isChecked();
        activityC23387.f75769.f3419 = compoundButton4.isChecked();
        activityC23387.f75769.f3415 = compoundButton5.isChecked();
        activityC23387.f75769.f3418 = compoundButton6.isChecked();
        activityC23387.f75769.f3417 = compoundButton7.isChecked();
        c3629.f13333 = activityC23387.f75767;
        c3629.f13332 = activityC23387.f75769;
        c3629.f13331 = activityC23387.f75771;
        if (i == -1) {
            activityC23387.f75770.f73861.add(c3629);
        }
        try {
            C14920.m35664(activityC23387.f75770);
        } catch (IOException e) {
            activityC23387.m31002(e, (DialogInterface.OnDismissListener) null);
        }
        activityC23387.f75768.notifyDataSetChanged();
        dialogInterfaceC19356.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51531(final ActivityC23387 activityC23387, C10687 c10687, final TextView textView) {
        if (c10687.f36486.getSelectedItemPosition() != 2) {
            View viewM30995 = activityC23387.m30995(R.layout.MT_Protector);
            final C17036 c17036 = new C17036(viewM30995, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
            final C17036 c17037 = new C17036(viewM30995, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
            final C17036 c17038 = new C17036(viewM30995, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
            final C17036 c17039 = new C17036(viewM30995, R.id.header4, R.id.textInputLayout4, R.id.editText4, R.id.MT_Protector, R.id.MT_Protector);
            final C7864 c7864 = activityC23387.f75767;
            c17036.m39808(c7864.f25879);
            c17037.m39808(c7864.f25880);
            c17038.m39808(c7864.f25883);
            c17039.m39808(c7864.f25877);
            C8067 c8067BuildDialog = activityC23387.buildDialog();
            c8067BuildDialog.m21258(viewM30995);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21265(false);
            final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C8875.m23019(dialogInterfaceC19356M21269);
            dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩷֫ۨ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC23387.f75766;
                    ActivityC23387 activityC23388 = this.f66974;
                    activityC23388.getClass();
                    C17036 c170310 = c17036;
                    boolean zIsChecked = c170310.f54421.isChecked();
                    C17036 c170311 = c17037;
                    C17036 c170312 = c17038;
                    C17036 c170313 = c17039;
                    if (zIsChecked && c170311.f54421.isChecked() && c170312.f54421.isChecked() && c170313.f54421.isChecked()) {
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    if (!c170310.f54421.isChecked() && c170310.m39810()) {
                        c170310.m39807(R.string.MT_Protector);
                        return;
                    }
                    if (!c170311.f54421.isChecked() && c170311.m39810()) {
                        c170311.m39807(R.string.MT_Protector);
                        return;
                    }
                    if (!c170313.f54421.isChecked() && c170313.m39810()) {
                        c170313.m39807(R.string.MT_Protector);
                        return;
                    }
                    try {
                        c170310.m39806();
                        c170311.m39806();
                        c170312.m39806();
                        c170313.m39806();
                        c170310.m39809();
                        c170311.m39809();
                        c170312.m39809();
                        c170313.m39809();
                        TextView textView2 = textView;
                        if (textView2.getVisibility() == 8) {
                            textView2.setVisibility(0);
                        }
                        textView2.setText(c7864.m20761());
                        dialogInterfaceC19356M21269.dismiss();
                    } catch (PatternSyntaxException e) {
                        activityC23388.m31002(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ܺ֫ۨ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC23387.f75766;
                    C0102 c0102 = new C0102(this.f50814, c17036, c17037, c17038, c17039);
                    c0102.m40376(R.string.MT_Protector);
                    c0102.m40351("Smali");
                    c0102.m40367("Lxxx;->method()V");
                    c0102.m40369();
                    String strM39296 = C16737.m39296();
                    if (strM39296 != null) {
                        String[] strArrSplit = strM39296.split("->");
                        if (strArrSplit.length == 2) {
                            String str = strArrSplit[0];
                            if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                                String[] strArrSplit2 = strArrSplit[1].split("\\(");
                                if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty()) {
                                    String[] strArrSplit3 = strArrSplit2[1].split("\\)");
                                    if (strArrSplit3.length == 2) {
                                        String str2 = strArrSplit3[0];
                                        String str3 = strArrSplit3[1];
                                        if (str2.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") && str3.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                            c0102.m40346((CharSequence) strM39296);
                                            c0102.m40355();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c0102.m40368(true);
                }
            });
            return;
        }
        View viewM30996 = activityC23387.m30995(R.layout.MT_Protector);
        final C17036 c170310 = new C17036(viewM30996, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
        final C17036 c170311 = new C17036(viewM30996, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
        final C17036 c170312 = new C17036(viewM30996, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
        final C0807 c0807 = activityC23387.f75769;
        c170310.m39808(c0807.f3416);
        c170311.m39808(c0807.f3420);
        c170312.m39808(c0807.f3414);
        C8067 c8067BuildDialog2 = activityC23387.buildDialog();
        c8067BuildDialog2.m21258(viewM30996);
        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8067BuildDialog2.m21269();
        C8875.m23019(dialogInterfaceC19356M212610);
        dialogInterfaceC19356M212610.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤ֫ۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC23387.f75766;
                ActivityC23387 activityC23388 = this.f34108;
                activityC23388.getClass();
                C17036 c170313 = c170310;
                boolean zIsChecked = c170313.f54421.isChecked();
                C17036 c170314 = c170311;
                C17036 c170315 = c170312;
                if (zIsChecked && c170314.f54421.isChecked() && c170315.f54421.isChecked()) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                if (!c170313.f54421.isChecked() && c170313.m39810()) {
                    c170313.m39807(R.string.MT_Protector);
                    return;
                }
                if (!c170314.f54421.isChecked() && c170314.m39810()) {
                    c170314.m39807(R.string.MT_Protector);
                    return;
                }
                if (!c170315.f54421.isChecked() && c170315.m39810()) {
                    c170315.m39807(R.string.MT_Protector);
                    return;
                }
                try {
                    c170313.m39806();
                    c170314.m39806();
                    c170315.m39806();
                    c170313.m39809();
                    c170314.m39809();
                    c170315.m39809();
                    TextView textView2 = textView;
                    if (textView2.getVisibility() == 8) {
                        textView2.setVisibility(0);
                    }
                    textView2.setText(c0807.m3377());
                    dialogInterfaceC19356M212610.dismiss();
                } catch (PatternSyntaxException e) {
                    activityC23388.m31002(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
        dialogInterfaceC19356M212610.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.۟֫ۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC23387.f75766;
                C16331 c16331 = new C16331(this.f23922, c170310, c170311, c170312);
                c16331.m40376(R.string.MT_Protector);
                c16331.m40351("Smali");
                c16331.m40367("Lxxx;->field:I");
                c16331.m40369();
                String strM39296 = C16737.m39296();
                if (strM39296 != null) {
                    String[] strArrSplit = strM39296.split("->");
                    if (strArrSplit.length == 2) {
                        String str = strArrSplit[0];
                        if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                            String[] strArrSplit2 = strArrSplit[1].split(":");
                            if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty() && strArrSplit2[1].matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                c16331.m40346((CharSequence) strM39296);
                                c16331.m40355();
                            }
                        }
                    }
                }
                c16331.m40368(true);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:11:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:12:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:15:0x0205  */
    /* JADX WARN: Code duplicated, block: B:16:0x0207  */
    /* JADX WARN: Code duplicated, block: B:19:0x0211  */
    /* JADX WARN: Code duplicated, block: B:20:0x0213  */
    /* JADX WARN: Code duplicated, block: B:23:0x021d  */
    /* JADX WARN: Code duplicated, block: B:24:0x021f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0229  */
    /* JADX WARN: Code duplicated, block: B:28:0x022b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0235  */
    /* JADX WARN: Code duplicated, block: B:32:0x0237  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51526(final int i, C3629 c3629) {
        C3629 c36210;
        final C3629 c36211;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != -1) {
            c36210 = (C3629) this.f75770.f73861.get(i);
        } else {
            if (c3629 != null) {
                C3629 c36212 = new C3629();
                c36212.f13333 = new C7864();
                c36212.f13332 = new C0807();
                c36212.f13334 = c3629.f13334;
                c36212.f13333.m20762(c3629.f13333);
                c36212.f13332.m3378(c3629.f13332);
                c36212.f13331 = c3629.f13331;
                c36211 = c36212;
            } else {
                c36210 = new C3629();
            }
            this.f75771 = c36211.f13331;
            this.f75767 = new C7864();
            this.f75769 = new C0807();
            this.f75767.m20762(c36211.f13333);
            this.f75769.m3378(c36211.f13332);
            View viewM30995 = m30995(R.layout.MT_Protector);
            final C10687 c10687 = new C10687();
            c10687.f36489 = c36211;
            Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner1);
            c10687.f36486 = spinner;
            spinner.setAdapter((SpinnerAdapter) new C0733(this, getResources().getStringArray(R.array.MT_Protector)));
            c10687.f36491 = viewM30995.findViewById(R.id.MT_Protector);
            c10687.f36492 = viewM30995.findViewById(R.id.MT_Protector);
            c10687.f36487 = viewM30995.findViewById(R.id.MT_Protector);
            c10687.f36488 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            c10687.f36490 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            final CompoundButton compoundButton = (CompoundButton) viewM30995.findViewById(R.id.switch1);
            final CompoundButton compoundButton2 = (CompoundButton) viewM30995.findViewById(R.id.switch2);
            final CompoundButton compoundButton3 = (CompoundButton) viewM30995.findViewById(R.id.switch3);
            final CompoundButton compoundButton4 = (CompoundButton) viewM30995.findViewById(R.id.switch4);
            final CompoundButton compoundButton5 = (CompoundButton) viewM30995.findViewById(R.id.switch5);
            final CompoundButton compoundButton6 = (CompoundButton) viewM30995.findViewById(R.id.switch6);
            final CompoundButton compoundButton7 = (CompoundButton) viewM30995.findViewById(R.id.switch7);
            View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox5 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            CheckBox checkBox6 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
            spinner.setSelection(c36211.f13334);
            c10687.m26896(c36211.f13334);
            spinner.setOnItemSelectedListener(new C5747(c10687));
            checkBox.setTag(1);
            checkBox2.setTag(2);
            checkBox3.setTag(4);
            checkBox4.setTag(8);
            checkBox5.setTag(16);
            checkBox6.setTag(32);
            C8021 c8021 = new C8021(this, 1);
            checkBox.setOnCheckedChangeListener(c8021);
            checkBox2.setOnCheckedChangeListener(c8021);
            checkBox3.setOnCheckedChangeListener(c8021);
            checkBox4.setOnCheckedChangeListener(c8021);
            checkBox5.setOnCheckedChangeListener(c8021);
            checkBox6.setOnCheckedChangeListener(c8021);
            compoundButton.setChecked(c36211.f13333.f25878);
            compoundButton2.setChecked(c36211.f13333.f25881);
            compoundButton3.setChecked(c36211.f13333.f25882);
            compoundButton4.setChecked(c36211.f13332.f3419);
            compoundButton5.setChecked(c36211.f13332.f3415);
            compoundButton6.setChecked(c36211.f13332.f3418);
            compoundButton7.setChecked(c36211.f13332.f3417);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩵֫ۨ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC23387.m51531(this.f61865, c10687, textView);
                }
            };
            viewFindViewById.setOnClickListener(onClickListener);
            textView.setOnClickListener(onClickListener);
            if ((c36211.f13331 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
            if ((c36211.f13331 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            checkBox2.setChecked(z2);
            if ((c36211.f13331 & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            checkBox3.setChecked(z3);
            if ((c36211.f13331 & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            checkBox4.setChecked(z4);
            if ((c36211.f13331 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkBox5.setChecked(z5);
            if ((c36211.f13331 & 32) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            checkBox6.setChecked(z6);
            C8067 c8067BuildDialog = buildDialog();
            c8067BuildDialog.m21258(viewM30995);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21265(false);
            final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C8875.m23019(dialogInterfaceC19356M21269);
            dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֫ۨ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC23387.m51530(this.f29634, c10687, compoundButton, compoundButton3, compoundButton2, compoundButton4, compoundButton5, compoundButton6, compoundButton7, c36211, i, dialogInterfaceC19356M21269);
                }
            });
        }
        c36211 = c36210;
        this.f75771 = c36211.f13331;
        this.f75767 = new C7864();
        this.f75769 = new C0807();
        this.f75767.m20762(c36211.f13333);
        this.f75769.m3378(c36211.f13332);
        View viewM30996 = m30995(R.layout.MT_Protector);
        final C10687 c10688 = new C10687();
        c10688.f36489 = c36211;
        Spinner spinner2 = (Spinner) viewM30996.findViewById(R.id.spinner1);
        c10688.f36486 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new C0733(this, getResources().getStringArray(R.array.MT_Protector)));
        c10688.f36491 = viewM30996.findViewById(R.id.MT_Protector);
        c10688.f36492 = viewM30996.findViewById(R.id.MT_Protector);
        c10688.f36487 = viewM30996.findViewById(R.id.MT_Protector);
        c10688.f36488 = (TextView) viewM30996.findViewById(R.id.MT_Protector);
        c10688.f36490 = (TextView) viewM30996.findViewById(R.id.MT_Protector);
        final CompoundButton compoundButton8 = (CompoundButton) viewM30996.findViewById(R.id.switch1);
        final CompoundButton compoundButton9 = (CompoundButton) viewM30996.findViewById(R.id.switch2);
        final CompoundButton compoundButton10 = (CompoundButton) viewM30996.findViewById(R.id.switch3);
        final CompoundButton compoundButton11 = (CompoundButton) viewM30996.findViewById(R.id.switch4);
        final CompoundButton compoundButton12 = (CompoundButton) viewM30996.findViewById(R.id.switch5);
        final CompoundButton compoundButton13 = (CompoundButton) viewM30996.findViewById(R.id.switch6);
        final CompoundButton compoundButton14 = (CompoundButton) viewM30996.findViewById(R.id.switch7);
        View viewFindViewById2 = viewM30996.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox7 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox8 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox9 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox10 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox11 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        CheckBox checkBox12 = (CheckBox) viewM30996.findViewById(R.id.MT_Protector);
        spinner2.setSelection(c36211.f13334);
        c10688.m26896(c36211.f13334);
        spinner2.setOnItemSelectedListener(new C5747(c10688));
        checkBox7.setTag(1);
        checkBox8.setTag(2);
        checkBox9.setTag(4);
        checkBox10.setTag(8);
        checkBox11.setTag(16);
        checkBox12.setTag(32);
        C8021 c8022 = new C8021(this, 1);
        checkBox7.setOnCheckedChangeListener(c8022);
        checkBox8.setOnCheckedChangeListener(c8022);
        checkBox9.setOnCheckedChangeListener(c8022);
        checkBox10.setOnCheckedChangeListener(c8022);
        checkBox11.setOnCheckedChangeListener(c8022);
        checkBox12.setOnCheckedChangeListener(c8022);
        compoundButton8.setChecked(c36211.f13333.f25878);
        compoundButton9.setChecked(c36211.f13333.f25881);
        compoundButton10.setChecked(c36211.f13333.f25882);
        compoundButton11.setChecked(c36211.f13332.f3419);
        compoundButton12.setChecked(c36211.f13332.f3415);
        compoundButton13.setChecked(c36211.f13332.f3418);
        compoundButton14.setChecked(c36211.f13332.f3417);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.᩵֫ۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC23387.m51531(this.f61865, c10688, textView2);
            }
        };
        viewFindViewById2.setOnClickListener(onClickListener2);
        textView2.setOnClickListener(onClickListener2);
        if ((c36211.f13331 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox7.setChecked(z);
        if ((c36211.f13331 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox8.setChecked(z2);
        if ((c36211.f13331 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkBox9.setChecked(z3);
        if ((c36211.f13331 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        checkBox10.setChecked(z4);
        if ((c36211.f13331 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        checkBox11.setChecked(z5);
        if ((c36211.f13331 & 32) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        checkBox12.setChecked(z6);
        C8067 c8067BuildDialog2 = buildDialog();
        c8067BuildDialog2.m21258(viewM30996);
        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8067BuildDialog2.m21269();
        C8875.m23019(dialogInterfaceC19356M212610);
        dialogInterfaceC19356M212610.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֫ۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC23387.m51530(this.f29634, c10688, compoundButton8, compoundButton10, compoundButton9, compoundButton11, compoundButton12, compoundButton13, compoundButton14, c36211, i, dialogInterfaceC19356M212610);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51529(ActivityC23387 activityC23387, CompoundButton compoundButton, boolean z) {
        int iIntValue = ((Integer) compoundButton.getTag()).intValue();
        if (z) {
            activityC23387.f75771 = iIntValue | activityC23387.f75771;
        } else {
            activityC23387.f75771 = (~iIntValue) & activityC23387.f75771;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C16195 c16195 = new C16195(this, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new C5299(i, this));
        C2766.m8440(view, c16195);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51528(final ActivityC23387 activityC23387, final int i, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            activityC23387.m51526(-1, (C3629) activityC23387.f75770.f73861.get(i));
            return;
        }
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC23387);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(activityC23387.getString(R.string.MT_Protector, ((C3629) activityC23387.f75770.f73861.get(i)).m10730()));
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֫ۨ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC23387.m51527(this.f63691, i);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51527(ActivityC23387 activityC23387, int i) {
        activityC23387.f75770.f73861.remove(i);
        try {
            C14920.m35664(activityC23387.f75770);
        } catch (IOException e) {
            activityC23387.m31002(e, (DialogInterface.OnDismissListener) null);
        }
        activityC23387.f75768.notifyDataSetChanged();
    }
}
