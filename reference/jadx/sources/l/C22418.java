package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩹ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes.dex */
public final class C22418 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f73148;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static boolean f73149;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f73150;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CheckBox f73151;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f73152;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f73153;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0544 f73154;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f73155;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final TextView f73156;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f73157;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public List f73158;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f73159;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final TextView f73160;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f73161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f73162;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C9160 f73163;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC23124 f73164;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public EnumC6895 f73165;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Runnable f73166;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f73167;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C11545 f73168;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f73169;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9160 f73170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f73171;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f73172;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f73173;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11462 f73174;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f73175 = Collections.singletonList("");

    static {
        ArrayList arrayList = new ArrayList();
        f73148 = arrayList;
        arrayList.addAll(C1250.m4467(ApplicationC0716.f2992.mo16347("sir", (byte[]) null)));
        f73150 = Executors.newFixedThreadPool(Math.min(C5464.f18831, 3));
    }

    public C22418(C11545 c11545, InterfaceC0544 interfaceC0544) {
        EnumC23124 enumC23124M51123;
        this.f73168 = c11545;
        this.f73154 = interfaceC0544;
        this.f73174 = c11545.m28817();
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        this.f73160 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        this.f73159 = viewFindViewById;
        this.f73171 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f73163 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.editText2);
        this.f73170 = c9160;
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f73173 = checkBox;
        this.f73172 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f73167 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f73151 = checkBox3;
        this.f73152 = (TextView) viewM30995.findViewById(R.id.textView1);
        this.f73156 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM30995.findViewById(R.id.MT_Protector);
        this.f73169 = viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM30995.findViewById(R.id.MT_Protector);
        this.f73162 = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC17445(3, this));
        viewFindViewById4.setEnabled(!f73148.isEmpty());
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC14141(2, this));
        if (ApplicationC0716.f2992.contains("fsnm")) {
            enumC23124M51123 = EnumC23124.m51123(ApplicationC0716.f2992.getInt("fsnm", EnumC23124.CONTAINS.m51125()));
        } else if (ApplicationC0716.f2992.contains("sir") || ApplicationC0716.f2992.contains("file_search_record") || ApplicationC0716.f2992.contains("file_search_record_empty")) {
            enumC23124M51123 = EnumC23124.WILDCARD;
        } else {
            enumC23124M51123 = EnumC23124.CONTAINS;
        }
        m49719(enumC23124M51123);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܿ֡᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f54354.f73170.m23518(z);
            }
        });
        c9160.m23507(ApplicationC0716.f2992.getString("file_advanced_search", ""));
        checkBox2.setChecked(!ApplicationC0716.f2992.getBoolean("file_search_ignore_case", true));
        checkBox3.setChecked(ApplicationC0716.f2992.getBoolean("file_search_regex", false));
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("file_search_sub", true));
        c9160.m23516().m27482(3);
        c9160.m23516().m16960(17.0f);
        c9160.m23504();
        try {
            this.f73153 = Long.parseLong(ApplicationC0716.f2992.getString("file_search_max_size", "-1"));
        } catch (NumberFormatException unused) {
            this.f73153 = -1L;
        }
        try {
            this.f73155 = Long.parseLong(ApplicationC0716.f2992.getString("file_search_min_size", "-1"));
        } catch (NumberFormatException unused2) {
            this.f73155 = -1L;
        }
        long j = this.f73155;
        if (j >= 0) {
            long j2 = this.f73153;
            if (j == j2 && j2 != C17492.FOREVER_NS) {
                this.f73153 = j2 + 1;
            }
        }
        this.f73152.setText(EnumC4072.m11602(j, this.f73153));
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC5714(0, this));
        try {
            this.f73161 = Long.parseLong(ApplicationC0716.f2992.getString("fsmaxt", "-1"));
        } catch (NumberFormatException unused3) {
            this.f73161 = -1L;
        }
        try {
            this.f73157 = Long.parseLong(ApplicationC0716.f2992.getString("fsmint", "-1"));
        } catch (NumberFormatException unused4) {
            this.f73157 = -1L;
        }
        this.f73165 = EnumC6895.m18504(ApplicationC0716.f2992.getInt("fstp", 0));
        m49700();
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC0653(2, this));
        this.f73172.setOnCheckedChangeListener(this);
        this.f73172.setChecked(f73149);
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2627(2, this));
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ۜ֡᩹
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C22418.m49707(this.f21737);
            }
        });
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC22648(0, this, dialogInterfaceC19356M21269));
        C16737.m39290(this.f73163.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49734(List list) {
        this.f73175 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49733(ArrayList arrayList, Runnable runnable) {
        this.f73158 = arrayList;
        this.f73166 = runnable;
        this.f73160.setText(R.string.MT_Protector);
        this.f73173.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49707(C22418 c22418) {
        c22418.m49731();
        Runnable runnable = c22418.f73166;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m49721(C22418 c22418) {
        c22418.m49731();
        Runnable runnable = c22418.f73166;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49719(EnumC23124 enumC23124) {
        this.f73164 = enumC23124;
        int iM51126 = enumC23124.m51126();
        TextView textView = this.f73171;
        textView.setText(iM51126);
        this.f73159.setContentDescription(textView.getText());
        this.f73163.m23518(enumC23124 == EnumC23124.REGEX);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m49702(final C22418 c22418) {
        final EnumC23124[] enumC23124ArrValues = EnumC23124.values();
        View view = c22418.f73159;
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        C12418 c12418M38298 = c16195.m38298();
        C17356.m40381(c12418M38298, R.string.MT_Protector);
        for (int i = 0; i < enumC23124ArrValues.length; i++) {
            c12418M38298.add(0, i, i, enumC23124ArrValues[i].m51124()).setCheckable(true);
        }
        c12418M38298.setGroupCheckable(0, true, true);
        c12418M38298.getItem(c22418.f73164.ordinal()).setChecked(true);
        c16195.m38296(new InterfaceC21133() { // from class: l.ܶ֡᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f48644.m49719(enumC23124ArrValues[menuItem.getItemId()]);
                return true;
            }
        });
        C0671.m3000(c16195).m6964();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49727(final C22418 c22418) {
        final EnumC4072[] enumC4072ArrValues = EnumC4072.values();
        final int length = enumC4072ArrValues.length;
        TextView textView = c22418.f73152;
        C16195 c16195 = new C16195(textView.getContext(), textView, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC4072ArrValues.length) {
            c12418M38298.add(0, i, i == 0 ? 0 : i + 1, enumC4072ArrValues[i].m11603()).setCheckable(true);
            i++;
        }
        c12418M38298.setGroupCheckable(0, true, true);
        EnumC4072 enumC4072M11599 = EnumC4072.m11599(c22418.f73155, c22418.f73153);
        c12418M38298.findItem(enumC4072M11599 == null ? length : enumC4072M11599.ordinal()).setChecked(true);
        c16195.m38296(new InterfaceC21133() { // from class: l.ᩴ֡᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C22418.m49710(this.f58681, length, enumC4072ArrValues, menuItem);
                return true;
            }
        });
        C0671.m3000(c16195).m6964();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49710(C22418 c22418, int i, EnumC4072[] enumC4072Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            C8909.m23173(c22418.f73168.m28824(), c22418.f73155, c22418.f73153, new C9372(c22418));
            return;
        }
        EnumC4072 enumC4072 = enumC4072Arr[itemId];
        long jM11604 = enumC4072.m11604();
        long jM11605 = enumC4072.m11605();
        c22418.f73155 = jM11604;
        c22418.f73153 = jM11605;
        c22418.f73152.setText(EnumC4072.m11602(jM11604, jM11605));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m49724(final C22418 c22418) {
        final EnumC6895[] enumC6895ArrValues = EnumC6895.values();
        final int length = enumC6895ArrValues.length;
        TextView textView = c22418.f73156;
        C16195 c16195 = new C16195(textView.getContext(), textView, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC6895ArrValues.length) {
            c12418M38298.add(0, i, i == 0 ? 0 : i + 1, enumC6895ArrValues[i].m18506()).setCheckable(true);
            i++;
        }
        c12418M38298.setGroupCheckable(0, true, true);
        EnumC6895 enumC6895 = c22418.f73165;
        if (enumC6895 == null && c22418.f73157 == -1 && c22418.f73161 == -1) {
            enumC6895 = EnumC6895.ANY;
        }
        c12418M38298.findItem(enumC6895 == null ? length : enumC6895.ordinal()).setChecked(true);
        c16195.m38296(new InterfaceC21133() { // from class: l.ᩳ֡᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C22418.m49711(this.f56231, length, enumC6895ArrValues, menuItem);
                return true;
            }
        });
        C0671.m3000(c16195).m6964();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49711(C22418 c22418, int i, EnumC6895[] enumC6895Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            c22418.m49701();
            C8909.m23174(c22418.f73168.m28824(), c22418.f73157, c22418.f73161, new C14415(c22418));
            return;
        }
        EnumC6895 enumC6895 = enumC6895Arr[itemId];
        if (enumC6895 != EnumC6895.ANY) {
            c22418.f73165 = enumC6895;
            c22418.m49701();
            c22418.m49700();
        } else {
            c22418.f73165 = null;
            c22418.f73157 = -1L;
            c22418.f73161 = -1L;
            c22418.m49700();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49712(C22418 c22418, long j, long j2) {
        c22418.f73155 = j;
        c22418.f73153 = j2;
        c22418.f73152.setText(EnumC4072.m11602(j, j2));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49728(C22418 c22418, long j, long j2) {
        c22418.f73165 = null;
        c22418.f73157 = j;
        c22418.f73161 = j2;
        c22418.m49700();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m49700() {
        EnumC6895 enumC6895 = this.f73165;
        this.f73156.setText(enumC6895 == null ? EnumC6895.m18503(this.f73157, this.f73161) : enumC6895.m18506());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m49701() {
        EnumC6895 enumC6895 = this.f73165;
        if (enumC6895 != null) {
            long[] jArrM18507 = enumC6895.m18507(System.currentTimeMillis());
            this.f73157 = jArrM18507[0];
            this.f73161 = jArrM18507[1];
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m49720() {
        ApplicationC0716.f2992.edit().mo4067("sir", C1250.m4466(f73148)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۤ֡᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49705(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C9030.stream(f73148).map(new C7831(0)).toArray(new C19120());
        C8067 c8067BuildDialog = this.f73168.m28824().buildDialog();
        C4406 c4406 = new C4406(R.layout.MT_Protector, c8067BuildDialog.m21273(), Arrays.asList(charSequenceArr));
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21259(c4406, (DialogInterfaceOnClickListenerC9948) new DialogInterface.OnClickListener() { // from class: l.ۤ֡᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22418.m49708(this.f34009, i);
            }
        });
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44376().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.۟֡᩹
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, int i, long j) {
                C22418.m49717(this.f23826, charSequenceArr, dialogInterfaceC19356M21269, view, i);
                return true;
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.᩷֡᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C22418.m49715(this.f66512, dialogInterfaceC19356M21269, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49708(C22418 c22418, int i) {
        C1250 c1250 = (C1250) f73148.get(i);
        c22418.m49719(c1250.m4482());
        c22418.f73163.m23507(c1250.m4473());
        c22418.f73173.setChecked(c1250.m4480());
        c22418.f73172.setChecked(c1250.m4471());
        c22418.f73155 = c1250.m4477();
        c22418.f73153 = c1250.m4475();
        c22418.f73157 = c1250.m4478();
        c22418.f73161 = c1250.m4481();
        c22418.f73165 = c1250.m4476();
        c22418.f73170.m23507(c1250.m4470());
        c22418.f73167.setChecked(c1250.m4469());
        c22418.f73151.setChecked(c1250.m4479());
        c22418.f73152.setText(EnumC4072.m11602(c22418.f73155, c22418.f73153));
        c22418.m49700();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49717(final C22418 c22418, CharSequence[] charSequenceArr, final DialogInterfaceC19356 dialogInterfaceC19356, final View view, final int i) {
        C8067 c8067BuildDialog = c22418.f73168.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(charSequenceArr[i]);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ֡᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C22418.m49709(this.f50711, i, dialogInterfaceC19356, view);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49709(C22418 c22418, int i, DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        ArrayList arrayList = f73148;
        arrayList.remove(i);
        m49720();
        dialogInterfaceC19356.dismiss();
        if (arrayList.isEmpty()) {
            c22418.f73162.setEnabled(false);
        } else {
            c22418.m49705(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49715(C22418 c22418, DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        C10654 c10654 = new C10654(c22418, c22418.f73168.m28824(), dialogInterfaceC19356, view);
        c10654.m40376(R.string.MT_Protector);
        c10654.m40353(R.string.MT_Protector);
        c10654.m40367(C16737.m39288(R.string.MT_Protector));
        c10654.m40350(2);
        c10654.m40375(2);
        c10654.m40340();
        c10654.m40368(true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m49731() {
        InterfaceC17314 interfaceC17314PutString = ApplicationC0716.f2992.edit().putString("file_advanced_search", this.f73170.m23513().toString()).mo4065(this.f73164.m51125(), "fsnm").putBoolean("file_search_ignore_case", !this.f73167.isChecked()).putBoolean("file_search_regex", this.f73151.isChecked()).putBoolean("file_search_sub", this.f73173.isChecked()).putString("file_search_max_size", Long.toString(this.f73153)).putString("file_search_min_size", Long.toString(this.f73155)).putString("fsmaxt", Long.toString(this.f73161)).putString("fsmint", Long.toString(this.f73157));
        EnumC6895 enumC6895 = this.f73165;
        interfaceC17314PutString.mo4065(enumC6895 == null ? 0 : enumC6895.m18508(), "fstp").apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49714(C22418 c22418, DialogInterfaceC19356 dialogInterfaceC19356) {
        DialogInterface.OnDismissListener onDismissListener;
        C14690 c14690;
        long jM11596;
        long j;
        long j2;
        long j3;
        C14690 c14690M35218;
        DialogInterface.OnDismissListener onDismissListener2;
        CheckBox checkBox = c22418.f73173;
        C11545 c11545 = c22418.f73168;
        CheckBox checkBox2 = c22418.f73167;
        CheckBox checkBox3 = c22418.f73151;
        C9160 c9160 = c22418.f73170;
        c22418.m49701();
        C9160 c9161 = c22418.f73163;
        String string = c9161.m23513().toString();
        CheckBox checkBox4 = c22418.f73172;
        if (checkBox4.isChecked()) {
            long j4 = c22418.f73153;
            jM11596 = EnumC4072.m11596(c22418.f73155, j4);
            long j5 = c22418.f73157;
            j = j4;
            long j6 = c22418.f73161;
            if (c9160.m23502() == 0) {
                onDismissListener2 = null;
                c14690M35218 = null;
                j6 = j6;
            } else {
                String string2 = c9160.m23513().toString();
                if (!checkBox3.isChecked()) {
                    string2 = C17874.m41459(string2);
                }
                try {
                    c14690M35218 = checkBox2.isChecked() ? C14690.m35218(8, string2) : C14690.m35218(74, string2);
                    onDismissListener2 = null;
                } catch (PatternSyntaxException e) {
                    c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            c14690 = c14690M35218;
            j3 = j6;
            j2 = j5;
            onDismissListener = onDismissListener2;
        } else {
            onDismissListener = null;
            c14690 = null;
            jM11596 = -1;
            j = -1;
            j2 = -1;
            j3 = -1;
        }
        try {
            try {
                C5359 c5359 = new C5359(string, c22418.f73164, checkBox.isChecked(), jM11596, j, j2, j3, c14690);
                if (checkBox4.isChecked()) {
                    c9160.m23519();
                }
                c9161.m23519();
                c22418.m49731();
                final C1250 c1250 = new C1250(c9161.m23513().toString(), c22418.f73164, checkBox.isChecked(), checkBox4.isChecked(), c22418.f73155, c22418.f73153, c22418.f73157, c22418.f73161, c22418.f73165, c9160.m23513().toString(), checkBox2.isChecked(), checkBox3.isChecked());
                Predicate predicate = new Predicate() { // from class: l.᩸֡᩹
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate2) {
                        return C8512.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate2) {
                        return C8512.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c1250.m4472((C1250) obj);
                    }
                };
                ArrayList arrayList = f73148;
                C9030.removeIf(arrayList, predicate);
                arrayList.add(0, c1250);
                while (arrayList.size() > 100) {
                    C19028.m43762(arrayList, 1);
                }
                m49720();
                dialogInterfaceC19356.dismiss();
                new C2891(c22418, c5359).m10243();
            } catch (PatternSyntaxException e2) {
                e = e2;
                c11545.m28824().m31002(e, onDismissListener);
            }
        } catch (PatternSyntaxException e3) {
            e = e3;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f73169.setVisibility(z ? 0 : 8);
        f73149 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49706(final C11545 c11545, final InterfaceC0544 interfaceC0544, final C11835 c11835) {
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        int i = 0;
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(C16737.m39264(R.string.MT_Protector, Integer.valueOf(c11835.f39735.size())));
        C6606 c6606 = (C6606) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(c6606);
        final C13952 c13952 = new C13952(c11835, c11545, c6606);
        c6606.setAdapter((ListAdapter) c13952);
        c6606.setSelection(c11835.f39736);
        c6606.setFastScrollEnabled(true);
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21257(new DialogInterfaceOnDismissListenerC3596(i, c11835, c6606));
        String str = c11835.f39734;
        if (str.equals("local")) {
            c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8537(i, c11835, c13952));
            c8067BuildDialog.m21278("↕", new DialogInterface.OnClickListener() { // from class: l.᩶֡᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    c11545.m28812("//SEARCH//" + c11835.hashCode(), true);
                }
            });
        } else {
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡֡᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C11835 c11836 = c11835;
                    BaseAdapter baseAdapter = c13952;
                    synchronized (c11836) {
                        c11836.f39735.clear();
                    }
                    baseAdapter.notifyDataSetChanged();
                }
            });
        }
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        ImageView imageView = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        C5031.m14011(imageView, C16737.m39283(R.string.MT_Protector));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ֡᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC0544.mo2552(c11545, view, c11835, new C4778(dialogInterfaceC19356M21269));
            }
        });
        if (str.equals("local")) {
            Drawable drawableMutate = c11545.m28824().getResources().getDrawable(R.drawable.MT_Protector).mutate();
            drawableMutate.setColorFilter(C9682.m24638(C20368.f65970));
            Button buttonM44361 = dialogInterfaceC19356M21269.m44361();
            int textSize = (int) buttonM44361.getTextSize();
            drawableMutate.setBounds(0, 0, textSize, textSize);
            SpannableString spannableString = new SpannableString("↕");
            spannableString.setSpan(new ImageSpan(drawableMutate), 0, 1, 33);
            buttonM44361.setText(spannableString);
        }
        c6606.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۫֡᩹
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                dialogInterfaceC19356M21269.dismiss();
                C11835 c11836 = c11835;
                C6189 c6189 = (C6189) c11836.f39735.get(i2);
                c6189.f21065 = true;
                InterfaceC2557 interfaceC2557M17194 = c6189.m17194();
                String name = interfaceC2557M17194.getName();
                C11545 c11546 = c11545;
                c11546.m28763(name);
                c11546.m28812(interfaceC2557M17194.getParent(), c11836.f39734.equals("local"));
            }
        });
        C23250.m51309(dialogInterfaceC19356M21269);
    }
}
