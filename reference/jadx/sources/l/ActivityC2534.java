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

/* JADX INFO: renamed from: l.ۖ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC2534 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8084 = 0;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C24910 f8085;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C3280 f8086;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f8087;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C12975 f8088;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C18942 f8089;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "SchemeEditorActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC7178(1, this));
        String stringExtra = getIntent().getStringExtra("schemeName");
        C17359.requireNonNull(stringExtra);
        setTitle(stringExtra);
        try {
            this.f8085 = C16704.m39466(stringExtra);
        } catch (Exception unused) {
            this.f8085 = new C24910(stringExtra);
        }
        C18942 c18942 = new C18942(this);
        this.f8089 = c18942;
        listView.setAdapter((ListAdapter) c18942);
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
        m8443(-1, (C1789) null);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m8443(i, (C1789) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8447(ActivityC2534 activityC2534, C9245 c9245, CompoundButton compoundButton, CompoundButton compoundButton2, CompoundButton compoundButton3, CompoundButton compoundButton4, CompoundButton compoundButton5, CompoundButton compoundButton6, CompoundButton compoundButton7, C1789 c1789, int i, DialogInterfaceC8327 dialogInterfaceC8327) {
        Spinner spinner = c9245.f30093;
        if (spinner.getSelectedItemPosition() != 2) {
            if (!compoundButton.isChecked() && !compoundButton2.isChecked() && !compoundButton3.isChecked()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            C3280 c3280 = activityC2534.f8086;
            if (c3280.f10689.m50980() && c3280.f10693.m50980() && c3280.f10691.m50980()) {
                if (spinner.getSelectedItemPosition() == 1 && activityC2534.f8087 == 0) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
            } else {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        } else {
            if (!compoundButton4.isChecked() && !compoundButton5.isChecked() && !compoundButton6.isChecked() && !compoundButton7.isChecked()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            C12975 c12975 = activityC2534.f8088;
            if (!c12975.f41599.m50980() || !c12975.f41602.m50980() || !c12975.f41601.m50980()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        }
        c1789.f6107 = spinner.getSelectedItemPosition();
        activityC2534.f8086.f10695 = compoundButton.isChecked();
        activityC2534.f8086.f10690 = compoundButton3.isChecked();
        activityC2534.f8086.f10694 = compoundButton2.isChecked();
        activityC2534.f8088.f41604 = compoundButton4.isChecked();
        activityC2534.f8088.f41605 = compoundButton5.isChecked();
        activityC2534.f8088.f41600 = compoundButton6.isChecked();
        activityC2534.f8088.f41603 = compoundButton7.isChecked();
        c1789.f6106 = activityC2534.f8086;
        c1789.f6105 = activityC2534.f8088;
        c1789.f6108 = activityC2534.f8087;
        if (i == -1) {
            activityC2534.f8085.f80625.add(c1789);
        }
        try {
            C16704.m39465(activityC2534.f8085);
        } catch (IOException e) {
            activityC2534.m40401(e, (DialogInterface.OnDismissListener) null);
        }
        activityC2534.f8089.notifyDataSetChanged();
        dialogInterfaceC8327.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8448(final ActivityC2534 activityC2534, C9245 c9245, final TextView textView) {
        if (c9245.f30093.getSelectedItemPosition() != 2) {
            View viewM40395 = activityC2534.m40395(R.layout.MT_Protector);
            final C9991 c9991 = new C9991(viewM40395, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
            final C9991 c9992 = new C9991(viewM40395, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
            final C9991 c9993 = new C9991(viewM40395, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
            final C9991 c9994 = new C9991(viewM40395, R.id.header4, R.id.textInputLayout4, R.id.editText4, R.id.MT_Protector, R.id.MT_Protector);
            final C3280 c3280 = activityC2534.f8086;
            c9991.m25838(c3280.f10689);
            c9992.m25838(c3280.f10693);
            c9993.m25838(c3280.f10692);
            c9994.m25838(c3280.f10691);
            C2361 c2361BuildDialog = activityC2534.buildDialog();
            c2361BuildDialog.m8005(viewM40395);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8012(false);
            final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            C21232.m48398(dialogInterfaceC8327M8016);
            dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܰ۠ۤ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC2534.f8084;
                    ActivityC2534 activityC2535 = this.f45522;
                    activityC2535.getClass();
                    C9991 c9995 = c9991;
                    boolean zIsChecked = c9995.f32099.isChecked();
                    C9991 c9996 = c9992;
                    C9991 c9997 = c9993;
                    C9991 c9998 = c9994;
                    if (zIsChecked && c9996.f32099.isChecked() && c9997.f32099.isChecked() && c9998.f32099.isChecked()) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    if (!c9995.f32099.isChecked() && c9995.m25840()) {
                        c9995.m25837(R.string.MT_Protector);
                        return;
                    }
                    if (!c9996.f32099.isChecked() && c9996.m25840()) {
                        c9996.m25837(R.string.MT_Protector);
                        return;
                    }
                    if (!c9998.f32099.isChecked() && c9998.m25840()) {
                        c9998.m25837(R.string.MT_Protector);
                        return;
                    }
                    try {
                        c9995.m25836();
                        c9996.m25836();
                        c9997.m25836();
                        c9998.m25836();
                        c9995.m25839();
                        c9996.m25839();
                        c9997.m25839();
                        c9998.m25839();
                        TextView textView2 = textView;
                        if (textView2.getVisibility() == 8) {
                            textView2.setVisibility(0);
                        }
                        textView2.setText(c3280.m10815());
                        dialogInterfaceC8327M8016.dismiss();
                    } catch (PatternSyntaxException e) {
                        activityC2535.m40401(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩶۠ۤ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC2534.f8084;
                    C0297 c0297 = new C0297(this.f67632, c9991, c9992, c9993, c9994);
                    c0297.m22945(R.string.MT_Protector);
                    c0297.m22943("Smali");
                    c0297.m22933("Lxxx;->method()V");
                    c0297.m22961();
                    String strM49080 = C21576.m49080();
                    if (strM49080 != null) {
                        String[] strArrSplit = strM49080.split("->");
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
                                            c0297.m22924((CharSequence) strM49080);
                                            c0297.m22959();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c0297.m22955(true);
                }
            });
            return;
        }
        View viewM40396 = activityC2534.m40395(R.layout.MT_Protector);
        final C9991 c9995 = new C9991(viewM40396, R.id.header1, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector);
        final C9991 c9996 = new C9991(viewM40396, R.id.header2, R.id.MT_Protector, R.id.editText2, R.id.MT_Protector, R.id.MT_Protector);
        final C9991 c9997 = new C9991(viewM40396, R.id.header3, R.id.MT_Protector, R.id.editText3, R.id.MT_Protector, R.id.MT_Protector);
        final C12975 c12975 = activityC2534.f8088;
        c9995.m25838(c12975.f41599);
        c9996.m25838(c12975.f41602);
        c9997.m25838(c12975.f41601);
        C2361 c2361BuildDialog2 = activityC2534.buildDialog();
        c2361BuildDialog2.m8005(viewM40396);
        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2361BuildDialog2.m8016();
        C21232.m48398(dialogInterfaceC8327M8017);
        dialogInterfaceC8327M8017.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩺۠ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC2534.f8084;
                ActivityC2534 activityC2535 = this.f78187;
                activityC2535.getClass();
                C9991 c9998 = c9995;
                boolean zIsChecked = c9998.f32099.isChecked();
                C9991 c9999 = c9996;
                C9991 c99910 = c9997;
                if (zIsChecked && c9999.f32099.isChecked() && c99910.f32099.isChecked()) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                if (!c9998.f32099.isChecked() && c9998.m25840()) {
                    c9998.m25837(R.string.MT_Protector);
                    return;
                }
                if (!c9999.f32099.isChecked() && c9999.m25840()) {
                    c9999.m25837(R.string.MT_Protector);
                    return;
                }
                if (!c99910.f32099.isChecked() && c99910.m25840()) {
                    c99910.m25837(R.string.MT_Protector);
                    return;
                }
                try {
                    c9998.m25836();
                    c9999.m25836();
                    c99910.m25836();
                    c9998.m25839();
                    c9999.m25839();
                    c99910.m25839();
                    TextView textView2 = textView;
                    if (textView2.getVisibility() == 8) {
                        textView2.setVisibility(0);
                    }
                    textView2.setText(c12975.m32385());
                    dialogInterfaceC8327M8017.dismiss();
                } catch (PatternSyntaxException e) {
                    activityC2535.m40401(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
        dialogInterfaceC8327M8017.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۠ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC2534.f8084;
                C7755 c7755 = new C7755(this.f13735, c9995, c9996, c9997);
                c7755.m22945(R.string.MT_Protector);
                c7755.m22943("Smali");
                c7755.m22933("Lxxx;->field:I");
                c7755.m22961();
                String strM49080 = C21576.m49080();
                if (strM49080 != null) {
                    String[] strArrSplit = strM49080.split("->");
                    if (strArrSplit.length == 2) {
                        String str = strArrSplit[0];
                        if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                            String[] strArrSplit2 = strArrSplit[1].split(":");
                            if (strArrSplit2.length == 2 && !strArrSplit2[0].isEmpty() && strArrSplit2[1].matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                c7755.m22924((CharSequence) strM49080);
                                c7755.m22959();
                            }
                        }
                    }
                }
                c7755.m22955(true);
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
    private void m8443(final int i, C1789 c1789) {
        C1789 c17810;
        final C1789 c17811;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != -1) {
            c17810 = (C1789) this.f8085.f80625.get(i);
        } else {
            if (c1789 != null) {
                C1789 c17812 = new C1789();
                c17812.f6106 = new C3280();
                c17812.f6105 = new C12975();
                c17812.f6107 = c1789.f6107;
                c17812.f6106.m10816(c1789.f6106);
                c17812.f6105.m32386(c1789.f6105);
                c17812.f6108 = c1789.f6108;
                c17811 = c17812;
            } else {
                c17810 = new C1789();
            }
            this.f8087 = c17811.f6108;
            this.f8086 = new C3280();
            this.f8088 = new C12975();
            this.f8086.m10816(c17811.f6106);
            this.f8088.m32386(c17811.f6105);
            View viewM40395 = m40395(R.layout.MT_Protector);
            final C9245 c9245 = new C9245();
            c9245.f30095 = c17811;
            Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner1);
            c9245.f30093 = spinner;
            spinner.setAdapter((SpinnerAdapter) new C3054(this, getResources().getStringArray(R.array.MT_Protector)));
            c9245.f30096 = viewM40395.findViewById(R.id.MT_Protector);
            c9245.f30094 = viewM40395.findViewById(R.id.MT_Protector);
            c9245.f30097 = viewM40395.findViewById(R.id.MT_Protector);
            c9245.f30091 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
            c9245.f30092 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
            final CompoundButton compoundButton = (CompoundButton) viewM40395.findViewById(R.id.switch1);
            final CompoundButton compoundButton2 = (CompoundButton) viewM40395.findViewById(R.id.switch2);
            final CompoundButton compoundButton3 = (CompoundButton) viewM40395.findViewById(R.id.switch3);
            final CompoundButton compoundButton4 = (CompoundButton) viewM40395.findViewById(R.id.switch4);
            final CompoundButton compoundButton5 = (CompoundButton) viewM40395.findViewById(R.id.switch5);
            final CompoundButton compoundButton6 = (CompoundButton) viewM40395.findViewById(R.id.switch6);
            final CompoundButton compoundButton7 = (CompoundButton) viewM40395.findViewById(R.id.switch7);
            View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox5 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            CheckBox checkBox6 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
            spinner.setSelection(c17811.f6107);
            c9245.m24430(c17811.f6107);
            spinner.setOnItemSelectedListener(new C1043(c9245));
            checkBox.setTag(1);
            checkBox2.setTag(2);
            checkBox3.setTag(4);
            checkBox4.setTag(8);
            checkBox5.setTag(16);
            checkBox6.setTag(32);
            C16707 c16707 = new C16707(1, this);
            checkBox.setOnCheckedChangeListener(c16707);
            checkBox2.setOnCheckedChangeListener(c16707);
            checkBox3.setOnCheckedChangeListener(c16707);
            checkBox4.setOnCheckedChangeListener(c16707);
            checkBox5.setOnCheckedChangeListener(c16707);
            checkBox6.setOnCheckedChangeListener(c16707);
            compoundButton.setChecked(c17811.f6106.f10695);
            compoundButton2.setChecked(c17811.f6106.f10690);
            compoundButton3.setChecked(c17811.f6106.f10694);
            compoundButton4.setChecked(c17811.f6105.f41604);
            compoundButton5.setChecked(c17811.f6105.f41605);
            compoundButton6.setChecked(c17811.f6105.f41600);
            compoundButton7.setChecked(c17811.f6105.f41603);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۨ۠ۤ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC2534.m8448(this.f39357, c9245, textView);
                }
            };
            viewFindViewById.setOnClickListener(onClickListener);
            textView.setOnClickListener(onClickListener);
            if ((c17811.f6108 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            checkBox.setChecked(z);
            if ((c17811.f6108 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            checkBox2.setChecked(z2);
            if ((c17811.f6108 & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            checkBox3.setChecked(z3);
            if ((c17811.f6108 & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            checkBox4.setChecked(z4);
            if ((c17811.f6108 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkBox5.setChecked(z5);
            if ((c17811.f6108 & 32) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            checkBox6.setChecked(z6);
            C2361 c2361BuildDialog = buildDialog();
            c2361BuildDialog.m8005(viewM40395);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8012(false);
            final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            C21232.m48398(dialogInterfaceC8327M8016);
            dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۛ۠ۤ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC2534.m8447(this.f21248, c9245, compoundButton, compoundButton3, compoundButton2, compoundButton4, compoundButton5, compoundButton6, compoundButton7, c17811, i, dialogInterfaceC8327M8016);
                }
            });
        }
        c17811 = c17810;
        this.f8087 = c17811.f6108;
        this.f8086 = new C3280();
        this.f8088 = new C12975();
        this.f8086.m10816(c17811.f6106);
        this.f8088.m32386(c17811.f6105);
        View viewM40396 = m40395(R.layout.MT_Protector);
        final C9245 c9246 = new C9245();
        c9246.f30095 = c17811;
        Spinner spinner2 = (Spinner) viewM40396.findViewById(R.id.spinner1);
        c9246.f30093 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) new C3054(this, getResources().getStringArray(R.array.MT_Protector)));
        c9246.f30096 = viewM40396.findViewById(R.id.MT_Protector);
        c9246.f30094 = viewM40396.findViewById(R.id.MT_Protector);
        c9246.f30097 = viewM40396.findViewById(R.id.MT_Protector);
        c9246.f30091 = (TextView) viewM40396.findViewById(R.id.MT_Protector);
        c9246.f30092 = (TextView) viewM40396.findViewById(R.id.MT_Protector);
        final CompoundButton compoundButton8 = (CompoundButton) viewM40396.findViewById(R.id.switch1);
        final CompoundButton compoundButton9 = (CompoundButton) viewM40396.findViewById(R.id.switch2);
        final CompoundButton compoundButton10 = (CompoundButton) viewM40396.findViewById(R.id.switch3);
        final CompoundButton compoundButton11 = (CompoundButton) viewM40396.findViewById(R.id.switch4);
        final CompoundButton compoundButton12 = (CompoundButton) viewM40396.findViewById(R.id.switch5);
        final CompoundButton compoundButton13 = (CompoundButton) viewM40396.findViewById(R.id.switch6);
        final CompoundButton compoundButton14 = (CompoundButton) viewM40396.findViewById(R.id.switch7);
        View viewFindViewById2 = viewM40396.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox7 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox8 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox9 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox10 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox11 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        CheckBox checkBox12 = (CheckBox) viewM40396.findViewById(R.id.MT_Protector);
        spinner2.setSelection(c17811.f6107);
        c9246.m24430(c17811.f6107);
        spinner2.setOnItemSelectedListener(new C1043(c9246));
        checkBox7.setTag(1);
        checkBox8.setTag(2);
        checkBox9.setTag(4);
        checkBox10.setTag(8);
        checkBox11.setTag(16);
        checkBox12.setTag(32);
        C16707 c16708 = new C16707(1, this);
        checkBox7.setOnCheckedChangeListener(c16708);
        checkBox8.setOnCheckedChangeListener(c16708);
        checkBox9.setOnCheckedChangeListener(c16708);
        checkBox10.setOnCheckedChangeListener(c16708);
        checkBox11.setOnCheckedChangeListener(c16708);
        checkBox12.setOnCheckedChangeListener(c16708);
        compoundButton8.setChecked(c17811.f6106.f10695);
        compoundButton9.setChecked(c17811.f6106.f10690);
        compoundButton10.setChecked(c17811.f6106.f10694);
        compoundButton11.setChecked(c17811.f6105.f41604);
        compoundButton12.setChecked(c17811.f6105.f41605);
        compoundButton13.setChecked(c17811.f6105.f41600);
        compoundButton14.setChecked(c17811.f6105.f41603);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.ۨ۠ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC2534.m8448(this.f39357, c9246, textView2);
            }
        };
        viewFindViewById2.setOnClickListener(onClickListener2);
        textView2.setOnClickListener(onClickListener2);
        if ((c17811.f6108 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        checkBox7.setChecked(z);
        if ((c17811.f6108 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox8.setChecked(z2);
        if ((c17811.f6108 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkBox9.setChecked(z3);
        if ((c17811.f6108 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        checkBox10.setChecked(z4);
        if ((c17811.f6108 & 16) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        checkBox11.setChecked(z5);
        if ((c17811.f6108 & 32) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        checkBox12.setChecked(z6);
        C2361 c2361BuildDialog2 = buildDialog();
        c2361BuildDialog2.m8005(viewM40396);
        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2361BuildDialog2.m8016();
        C21232.m48398(dialogInterfaceC8327M8017);
        dialogInterfaceC8327M8017.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۛ۠ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC2534.m8447(this.f21248, c9246, compoundButton8, compoundButton10, compoundButton9, compoundButton11, compoundButton12, compoundButton13, compoundButton14, c17811, i, dialogInterfaceC8327M8017);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8446(ActivityC2534 activityC2534, CompoundButton compoundButton, boolean z) {
        int iIntValue = ((Integer) compoundButton.getTag()).intValue();
        if (z) {
            activityC2534.f8087 = iIntValue | activityC2534.f8087;
        } else {
            activityC2534.f8087 = (~iIntValue) & activityC2534.f8087;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C18452 c18452 = new C18452(this, view, 0);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.᩵۠ۤ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC2534.m8445(this.f65447, i, menuItem);
                return true;
            }
        });
        C22744.m51282(view, c18452);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8445(final ActivityC2534 activityC2534, final int i, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            activityC2534.m8443(-1, (C1789) activityC2534.f8085.f80625.get(i));
            return;
        }
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC2534);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(activityC2534.getString(R.string.MT_Protector, ((C1789) activityC2534.f8085.f80625.get(i)).m6250()));
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ۠ۤ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC2534.m8444(this.f59436, i);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8444(ActivityC2534 activityC2534, int i) {
        activityC2534.f8085.f80625.remove(i);
        try {
            C16704.m39465(activityC2534.f8085);
        } catch (IOException e) {
            activityC2534.m40401(e, (DialogInterface.OnDismissListener) null);
        }
        activityC2534.f8089.notifyDataSetChanged();
    }
}
