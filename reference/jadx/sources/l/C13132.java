package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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

/* JADX INFO: renamed from: l.۫۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13132 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f41990;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f41991;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f41992;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17771 f41993;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f41994;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f41995;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox f41996;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f41997;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public EnumC25067 f41998;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f41999;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC16861 f42000;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f42001;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f42002 = Collections.singletonList("");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f42003;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C17771 f42004;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final TextView f42005;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f42006;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f42007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f42008;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f42009;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C8614 f42010;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f42011;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f42012;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public List f42013;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f42014;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f42015;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0454 f42016;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7364 f42017;

    static {
        ArrayList arrayList = new ArrayList();
        f41990 = arrayList;
        arrayList.addAll(C5675.m16673(ApplicationC17729.f58258.mo7903("sir", (byte[]) null)));
        f41991 = Executors.newFixedThreadPool(Math.min(C11138.f35105, 3));
    }

    public C13132(C8614 c8614, InterfaceC0454 interfaceC0454) {
        EnumC16861 enumC16861M39818;
        this.f42010 = c8614;
        this.f42016 = interfaceC0454;
        this.f42017 = c8614.m23213();
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        this.f42005 = (TextView) viewM40395.findViewById(R.id.title);
        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        this.f42003 = viewFindViewById;
        this.f42012 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f42004 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.editText2);
        this.f41993 = c17771;
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f42009 = checkBox;
        this.f42014 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f41996 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f42011 = checkBox3;
        this.f42006 = (TextView) viewM40395.findViewById(R.id.textView1);
        this.f41995 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = viewM40395.findViewById(R.id.MT_Protector);
        this.f42008 = viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById4 = viewM40395.findViewById(R.id.MT_Protector);
        this.f41994 = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC10170(4, this));
        viewFindViewById4.setEnabled(!f41990.isEmpty());
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC15677(3, this));
        if (ApplicationC17729.f58258.contains("fsnm")) {
            enumC16861M39818 = EnumC16861.m39818(ApplicationC17729.f58258.getInt("fsnm", EnumC16861.CONTAINS.m39821()));
        } else if (ApplicationC17729.f58258.contains("sir") || ApplicationC17729.f58258.contains("file_search_record") || ApplicationC17729.f58258.contains("file_search_record_empty")) {
            enumC16861M39818 = EnumC16861.WILDCARD;
        } else {
            enumC16861M39818 = EnumC16861.CONTAINS;
        }
        m32629(enumC16861M39818);
        checkBox3.setOnCheckedChangeListener(new C1004(0, this));
        c17771.m41594(ApplicationC17729.f58258.getString("file_advanced_search", ""));
        checkBox2.setChecked(!ApplicationC17729.f58258.getBoolean("file_search_ignore_case", true));
        checkBox3.setChecked(ApplicationC17729.f58258.getBoolean("file_search_regex", false));
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("file_search_sub", true));
        c17771.m41605().m52310(3);
        c17771.m41605().m53981(17.0f);
        c17771.m41591();
        try {
            this.f42001 = Long.parseLong(ApplicationC17729.f58258.getString("file_search_max_size", "-1"));
        } catch (NumberFormatException unused) {
            this.f42001 = -1L;
        }
        try {
            this.f42007 = Long.parseLong(ApplicationC17729.f58258.getString("file_search_min_size", "-1"));
        } catch (NumberFormatException unused2) {
            this.f42007 = -1L;
        }
        long j = this.f42007;
        if (j >= 0) {
            long j2 = this.f42001;
            if (j == j2 && j2 != C25227.FOREVER_NS) {
                this.f42001 = j2 + 1;
            }
        }
        this.f42006.setText(EnumC11640.m29241(j, this.f42001));
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC6407(1, this));
        try {
            this.f41999 = Long.parseLong(ApplicationC17729.f58258.getString("fsmaxt", "-1"));
        } catch (NumberFormatException unused3) {
            this.f41999 = -1L;
        }
        try {
            this.f41997 = Long.parseLong(ApplicationC17729.f58258.getString("fsmint", "-1"));
        } catch (NumberFormatException unused4) {
            this.f41997 = -1L;
        }
        this.f41998 = EnumC25067.m55895(ApplicationC17729.f58258.getInt("fstp", 0));
        m32635();
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC15798(3, this));
        this.f42014.setOnCheckedChangeListener(this);
        this.f42014.setChecked(f41992);
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15164(1, this));
        c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.᩹ۜܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C13132.m32617(this.f75686);
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC6895(this, dialogInterfaceC8327M8016));
        C21576.m49090(this.f42004.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32648(List list) {
        this.f42002 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32647(ArrayList arrayList, Runnable runnable) {
        this.f42013 = arrayList;
        this.f42015 = runnable;
        this.f42005.setText(R.string.MT_Protector);
        this.f42009.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32617(C13132 c13132) {
        c13132.m32637();
        Runnable runnable = c13132.f42015;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m32639(C13132 c13132) {
        c13132.m32637();
        Runnable runnable = c13132.f42015;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32629(EnumC16861 enumC16861) {
        this.f42000 = enumC16861;
        int iM39822 = enumC16861.m39822();
        TextView textView = this.f42012;
        textView.setText(iM39822);
        this.f42003.setContentDescription(textView.getText());
        this.f42004.m41606(enumC16861 == EnumC16861.REGEX);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m32645(final C13132 c13132) {
        final EnumC16861[] enumC16861ArrValues = EnumC16861.values();
        View view = c13132.f42003;
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        C9898 c9898M42995 = c18452.m42995();
        C0950.m3783(c9898M42995, R.string.MT_Protector);
        for (int i = 0; i < enumC16861ArrValues.length; i++) {
            c9898M42995.add(0, i, i, enumC16861ArrValues[i].m39820()).setCheckable(true);
        }
        c9898M42995.setGroupCheckable(0, true, true);
        c9898M42995.getItem(c13132.f42000.ordinal()).setChecked(true);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۗۜܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f10569.m32629(enumC16861ArrValues[menuItem.getItemId()]);
                return true;
            }
        });
        C19198.m44467(c18452).m36149();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32641(final C13132 c13132) {
        final EnumC11640[] enumC11640ArrValues = EnumC11640.values();
        final int length = enumC11640ArrValues.length;
        TextView textView = c13132.f42006;
        C18452 c18452 = new C18452(textView.getContext(), textView, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC11640ArrValues.length) {
            c9898M42995.add(0, i, i == 0 ? 0 : i + 1, enumC11640ArrValues[i].m29244()).setCheckable(true);
            i++;
        }
        c9898M42995.setGroupCheckable(0, true, true);
        EnumC11640 enumC11640M29237 = EnumC11640.m29237(c13132.f42007, c13132.f42001);
        c9898M42995.findItem(enumC11640M29237 == null ? length : enumC11640M29237.ordinal()).setChecked(true);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۛۜܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C13132.m32620(this.f21150, length, enumC11640ArrValues, menuItem);
                return true;
            }
        });
        C19198.m44467(c18452).m36149();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32620(C13132 c13132, int i, EnumC11640[] enumC11640Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            C17059.m40187(c13132.f42010.m23233(), c13132.f42007, c13132.f42001, new C17859(c13132));
            return;
        }
        EnumC11640 enumC11640 = enumC11640Arr[itemId];
        long jM29245 = enumC11640.m29245();
        long jM29246 = enumC11640.m29246();
        c13132.f42007 = jM29245;
        c13132.f42001 = jM29246;
        c13132.f42006.setText(EnumC11640.m29241(jM29245, jM29246));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m32632(final C13132 c13132) {
        final EnumC25067[] enumC25067ArrValues = EnumC25067.values();
        final int length = enumC25067ArrValues.length;
        TextView textView = c13132.f41995;
        C18452 c18452 = new C18452(textView.getContext(), textView, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, length, 1, R.string.MT_Protector).setCheckable(true);
        int i = 0;
        while (i < enumC25067ArrValues.length) {
            c9898M42995.add(0, i, i == 0 ? 0 : i + 1, enumC25067ArrValues[i].m55897()).setCheckable(true);
            i++;
        }
        c9898M42995.setGroupCheckable(0, true, true);
        EnumC25067 enumC25067 = c13132.f41998;
        if (enumC25067 == null && c13132.f41997 == -1 && c13132.f41999 == -1) {
            enumC25067 = EnumC25067.ANY;
        }
        c9898M42995.findItem(enumC25067 == null ? length : enumC25067.ordinal()).setChecked(true);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۨۜܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C13132.m32621(this.f39194, length, enumC25067ArrValues, menuItem);
                return true;
            }
        });
        C19198.m44467(c18452).m36149();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32621(C13132 c13132, int i, EnumC25067[] enumC25067Arr, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == i) {
            c13132.m32644();
            C17059.m40186(c13132.f42010.m23233(), c13132.f41997, c13132.f41999, new C17340(c13132));
            return;
        }
        EnumC25067 enumC25067 = enumC25067Arr[itemId];
        if (enumC25067 != EnumC25067.ANY) {
            c13132.f41998 = enumC25067;
            c13132.m32644();
            c13132.m32635();
        } else {
            c13132.f41998 = null;
            c13132.f41997 = -1L;
            c13132.f41999 = -1L;
            c13132.m32635();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32622(C13132 c13132, long j, long j2) {
        c13132.f42007 = j;
        c13132.f42001 = j2;
        c13132.f42006.setText(EnumC11640.m29241(j, j2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32642(C13132 c13132, long j, long j2) {
        c13132.f41998 = null;
        c13132.f41997 = j;
        c13132.f41999 = j2;
        c13132.m32635();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m32635() {
        EnumC25067 enumC25067 = this.f41998;
        this.f41995.setText(enumC25067 == null ? EnumC25067.m55894(this.f41997, this.f41999) : enumC25067.m55897());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m32644() {
        EnumC25067 enumC25067 = this.f41998;
        if (enumC25067 != null) {
            long[] jArrM55898 = enumC25067.m55898(System.currentTimeMillis());
            this.f41997 = jArrM55898[0];
            this.f41999 = jArrM55898[1];
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m32638() {
        ApplicationC17729.f58258.edit().mo3488("sir", C5675.m16672(f41990)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ܰۜܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32615(final View view) {
        int i = 0;
        final CharSequence[] charSequenceArr = (CharSequence[]) C1170.stream(f41990).map(new C24125(i)).toArray(new C3987(i));
        C2361 c2361BuildDialog = this.f42010.m23233().buildDialog();
        C19131 c19131 = new C19131(R.layout.MT_Protector, c2361BuildDialog.m8020(), Arrays.asList(charSequenceArr));
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8006(c19131, (DialogInterfaceOnClickListenerC14427) new DialogInterface.OnClickListener() { // from class: l.ܰۜܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13132.m32618(this.f45434, i2);
            }
        });
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22437().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.᩶ۜܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, int i2, long j) {
                C13132.m32627(this.f67524, charSequenceArr, dialogInterfaceC8327M8016, view, i2);
                return true;
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ܿۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C13132.m32625(this.f59357, dialogInterfaceC8327M8016, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32618(C13132 c13132, int i) {
        C5675 c5675 = (C5675) f41990.get(i);
        c13132.m32629(c5675.m16681());
        c13132.f42004.m41594(c5675.m16674());
        c13132.f42009.setChecked(c5675.m16685());
        c13132.f42014.setChecked(c5675.m16675());
        c13132.f42007 = c5675.m16682();
        c13132.f42001 = c5675.m16677();
        c13132.f41997 = c5675.m16687();
        c13132.f41999 = c5675.m16683();
        c13132.f41998 = c5675.m16684();
        c13132.f41993.m41594(c5675.m16678());
        c13132.f41996.setChecked(c5675.m16679());
        c13132.f42011.setChecked(c5675.m16680());
        c13132.f42006.setText(EnumC11640.m29241(c13132.f42007, c13132.f42001));
        c13132.m32635();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32627(final C13132 c13132, CharSequence[] charSequenceArr, final DialogInterfaceC8327 dialogInterfaceC8327, final View view, final int i) {
        C2361 c2361BuildDialog = c13132.f42010.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(charSequenceArr[i]);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ۜܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13132.m32619(this.f1546, i, dialogInterfaceC8327, view);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32619(C13132 c13132, int i, DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        ArrayList arrayList = f41990;
        arrayList.remove(i);
        m32638();
        dialogInterfaceC8327.dismiss();
        if (arrayList.isEmpty()) {
            c13132.f41994.setEnabled(false);
        } else {
            c13132.m32615(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32625(C13132 c13132, DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        C9206 c9206 = new C9206(c13132, c13132.f42010.m23233(), dialogInterfaceC8327, view);
        c9206.m22945(R.string.MT_Protector);
        c9206.m22935(R.string.MT_Protector);
        c9206.m22933(C21576.m49088(R.string.MT_Protector));
        c9206.m22948(2);
        c9206.m22942(2);
        c9206.m22918();
        c9206.m22955(true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m32637() {
        InterfaceC18752 interfaceC18752PutString = ApplicationC17729.f58258.edit().putString("file_advanced_search", this.f41993.m41599().toString()).mo3486(this.f42000.m39821(), "fsnm").putBoolean("file_search_ignore_case", !this.f41996.isChecked()).putBoolean("file_search_regex", this.f42011.isChecked()).putBoolean("file_search_sub", this.f42009.isChecked()).putString("file_search_max_size", Long.toString(this.f42001)).putString("file_search_min_size", Long.toString(this.f42007)).putString("fsmaxt", Long.toString(this.f41999)).putString("fsmint", Long.toString(this.f41997));
        EnumC25067 enumC25067 = this.f41998;
        interfaceC18752PutString.mo3486(enumC25067 == null ? 0 : enumC25067.m55899(), "fstp").apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32624(C13132 c13132, DialogInterfaceC8327 dialogInterfaceC8327) {
        DialogInterface.OnDismissListener onDismissListener;
        C18415 c18415;
        long jM29243;
        long j;
        long j2;
        long j3;
        C18415 c18415M42924;
        DialogInterface.OnDismissListener onDismissListener2;
        CheckBox checkBox = c13132.f42009;
        C8614 c8614 = c13132.f42010;
        CheckBox checkBox2 = c13132.f41996;
        CheckBox checkBox3 = c13132.f42011;
        C17771 c17771 = c13132.f41993;
        c13132.m32644();
        C17771 c17772 = c13132.f42004;
        String string = c17772.m41599().toString();
        CheckBox checkBox4 = c13132.f42014;
        if (checkBox4.isChecked()) {
            long j4 = c13132.f42001;
            jM29243 = EnumC11640.m29243(c13132.f42007, j4);
            long j5 = c13132.f41997;
            j = j4;
            long j6 = c13132.f41999;
            if (c17771.m41607() == 0) {
                onDismissListener2 = null;
                c18415M42924 = null;
                j6 = j6;
            } else {
                String string2 = c17771.m41599().toString();
                if (!checkBox3.isChecked()) {
                    string2 = C17370.m40798(string2);
                }
                try {
                    c18415M42924 = checkBox2.isChecked() ? C18415.m42924(8, string2) : C18415.m42924(74, string2);
                    onDismissListener2 = null;
                } catch (PatternSyntaxException e) {
                    c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
            c18415 = c18415M42924;
            j3 = j6;
            j2 = j5;
            onDismissListener = onDismissListener2;
        } else {
            onDismissListener = null;
            c18415 = null;
            jM29243 = -1;
            j = -1;
            j2 = -1;
            j3 = -1;
        }
        try {
            try {
                C15107 c15107 = new C15107(string, c13132.f42000, checkBox.isChecked(), jM29243, j, j2, j3, c18415);
                if (checkBox4.isChecked()) {
                    c17771.m41603();
                }
                c17772.m41603();
                c13132.m32637();
                final C5675 c5675 = new C5675(c17772.m41599().toString(), c13132.f42000, checkBox.isChecked(), checkBox4.isChecked(), c13132.f42007, c13132.f42001, c13132.f41997, c13132.f41999, c13132.f41998, c17771.m41599().toString(), checkBox2.isChecked(), checkBox3.isChecked());
                Predicate predicate = new Predicate() { // from class: l.᩵ۜܳ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate2) {
                        return C19025.$default$and(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate2) {
                        return C19025.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c5675.m16676((C5675) obj);
                    }
                };
                ArrayList arrayList = f41990;
                C1170.removeIf(arrayList, predicate);
                arrayList.add(0, c5675);
                while (arrayList.size() > 100) {
                    C2764.m9138(arrayList, 1);
                }
                m32638();
                dialogInterfaceC8327.dismiss();
                new C4929(c13132, c15107).m8197();
            } catch (PatternSyntaxException e2) {
                e = e2;
                c8614.m23233().m40401(e, onDismissListener);
            }
        } catch (PatternSyntaxException e3) {
            e = e3;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f42008.setVisibility(z ? 0 : 8);
        f41992 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32616(final C8614 c8614, final InterfaceC0454 interfaceC0454, final C22829 c22829) {
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        int i = 1;
        int i2 = 0;
        ((TextView) viewM40395.findViewById(R.id.title)).setText(C21576.m49059(R.string.MT_Protector, Integer.valueOf(c22829.f73990.size())));
        final C19987 c19987 = (C19987) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(c19987);
        C10894 c10894 = new C10894(c22829, c8614, c19987);
        c19987.setAdapter((ListAdapter) c10894);
        c19987.setSelection(c22829.f73992);
        c19987.setFastScrollEnabled(true);
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.ܶۜܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c22829.f73992 = c19987.getFirstVisiblePosition();
            }
        });
        String str = c22829.f73991;
        if (str.equals("local")) {
            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10463(i, c22829, c10894));
            c2361BuildDialog.m8025("↕", new DialogInterfaceOnClickListenerC23137(2, c8614, c22829));
        } else {
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7716(i2, c22829, c10894));
        }
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        ImageView imageView = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        C22666.m51122(imageView, C21576.m49075(R.string.MT_Protector));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC0454.mo2271(c8614, view, c22829, new C22083(dialogInterfaceC8327M8016));
            }
        });
        if (str.equals("local")) {
            Drawable drawableMutate = c8614.m23233().getResources().getDrawable(R.drawable.MT_Protector).mutate();
            drawableMutate.setColorFilter(C2930.m9575(C3296.f10738));
            Button buttonM22440 = dialogInterfaceC8327M8016.m22440();
            int textSize = (int) buttonM22440.getTextSize();
            drawableMutate.setBounds(0, 0, textSize, textSize);
            SpannableString spannableString = new SpannableString("↕");
            spannableString.setSpan(new ImageSpan(drawableMutate), 0, 1, 33);
            buttonM22440.setText(spannableString);
        }
        c19987.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۢۜܳ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                dialogInterfaceC8327M8016.dismiss();
                C22829 c228210 = c22829;
                C1200 c1200 = (C1200) c228210.f73990.get(i3);
                c1200.f4366 = true;
                InterfaceC2386 interfaceC2386M4414 = c1200.m4414();
                String name = interfaceC2386M4414.getName();
                C8614 c8615 = c8614;
                c8615.m23230(name);
                c8615.m23226(interfaceC2386M4414.getParent(), c228210.f73991.equals("local"));
            }
        });
        C5416.m16144(dialogInterfaceC8327M8016);
    }
}
