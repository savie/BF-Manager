package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.textfield.TextInputLayout;
import java.net.Inet4Address;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܺۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15745 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C19729 f51044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51045 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f51046;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f51047;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f51048;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f51043 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f51049 = new C10100();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37478(final AbstractActivityC12483 abstractActivityC12483, int i) {
        final C15745 c15745 = new C15745();
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        final ImageView imageView = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        final TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM30995.findViewById(R.id.MT_Protector);
        final C19978 c19978 = (C19978) viewM30995.findViewById(R.id.MT_Protector);
        final ImageView imageView2 = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        RadioGroup radioGroup = (RadioGroup) viewM30995.findViewById(R.id.MT_Protector);
        int i2 = i == 1 ? 1 : 0;
        final int[] iArr = {i2};
        final String[] strArr = {null};
        final boolean[] zArr = {true};
        final long[] jArr = {0};
        final Runnable[] runnableArr = new Runnable[1];
        int i3 = i2;
        runnableArr[0] = new Runnable() { // from class: l.ܰۛۚ
            @Override // java.lang.Runnable
            public final void run() {
                long jM12664 = ServiceC4538.m12664();
                long jMax = Math.max(jArr[0] - System.currentTimeMillis(), 0L);
                C19978 c19979 = c19978;
                c19979.m45271(jMax, jM12664);
                if (zArr[0] && viewFindViewById3.getVisibility() == 0 && jMax > 0) {
                    c19979.postDelayed(runnableArr[0], 200L);
                }
            }
        };
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21257(new DialogInterface.OnDismissListener() { // from class: l.ۜۛۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C15745.m37479(zArr, c19978, runnableArr, abstractActivityC12483);
            }
        });
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
        dialogInterfaceC19356M21252.m44369(new DialogInterfaceOnShowListenerC22800());
        dialogInterfaceC19356M21252.m44362();
        final RunnableC11110 runnableC11110M52471 = C23810.m52471(viewM30995.findViewById(R.id.MT_Protector), abstractActivityC12483, dialogInterfaceC19356M21252);
        ViewOnClickListenerC22523.m50034(textView2);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܶۛۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15745.m37477(abstractActivityC12483);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(c15745) { // from class: l.᩸ۛۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                int i4 = iArr[0];
                String str = strArr[0];
                if (!C15745.m37480(i4, str, i4 == 0 ? ServiceC4538.m12674() : ServiceC7629.m20160())) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                try {
                    View viewM30996 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                    ImageView imageView3 = (ImageView) viewM30996.findViewById(R.id.MT_Protector);
                    TextView textView4 = (TextView) viewM30996.findViewById(R.id.MT_Protector);
                    imageView3.setImageBitmap(C15745.m37472(C13932.m33769(220.0f), str));
                    ViewOnClickListenerC22523.m50035(textView4, str);
                    int i5 = DialogInterfaceC19356.f62401;
                    C8067 c8067 = new C8067(abstractActivityC12484);
                    c8067.m21274(R.string.MT_Protector);
                    c8067.m21258(viewM30996);
                    c8067.m21251(R.string.MT_Protector, null);
                    c8067.m21269();
                } catch (RuntimeException | C6625 unused) {
                    C15829.m37611(R.string.MT_Protector);
                }
            }
        });
        dialogInterfaceC19356M21252.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۛۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = iArr[0];
                final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (i4 == 0) {
                    View viewM30996 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                    final EditText editText = (EditText) viewM30996.findViewById(R.id.MT_Protector);
                    final EditText editText2 = (EditText) viewM30996.findViewById(R.id.editText4);
                    final TextInputLayout textInputLayout = (TextInputLayout) viewM30996.findViewById(R.id.textInputLayout4);
                    final EditText editText3 = (EditText) viewM30996.findViewById(R.id.MT_Protector);
                    final TextInputLayout textInputLayout2 = (TextInputLayout) viewM30996.findViewById(R.id.MT_Protector);
                    ((TextView) viewM30996.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
                    viewM30996.findViewById(R.id.textView2).setVisibility(8);
                    viewM30996.findViewById(R.id.editText2).setVisibility(8);
                    viewM30996.findViewById(R.id.textView3).setVisibility(8);
                    viewM30996.findViewById(R.id.editText3).setVisibility(8);
                    ((TextView) viewM30996.findViewById(R.id.textView5)).setText(R.string.MT_Protector);
                    ((TextView) viewM30996.findViewById(R.id.textView6)).setVisibility(0);
                    Button button = (Button) viewM30996.findViewById(R.id.MT_Protector);
                    button.setVisibility(0);
                    final C15745 c15746 = this.f56556;
                    button.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۛۚ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12484;
                            View viewM30997 = abstractActivityC12485.m30995(R.layout.MT_Protector);
                            ((TextView) viewM30997.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            ListView listView = (ListView) viewM30997.findViewById(R.id.MT_Protector);
                            final C7277 c7277 = new C7277(abstractActivityC12485);
                            listView.setAdapter((ListAdapter) c7277);
                            C16754.m39314(listView);
                            final C15745 c15747 = c15746;
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.֨ۛۚ
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view3, int i5, long j) {
                                    final C7277 c7278 = c7277;
                                    if (c7278.m19412()) {
                                        return;
                                    }
                                    final C11884 c11884M19411 = c7278.m19411(i5);
                                    final AbstractActivityC12483 abstractActivityC12486 = abstractActivityC12485;
                                    View viewM30998 = abstractActivityC12486.m30995(R.layout.MT_Protector);
                                    String string = abstractActivityC12486.getString(c11884M19411.m29634() ? R.string.MT_Protector : R.string.MT_Protector);
                                    String strM29639 = c11884M19411.m29639();
                                    if (TextUtils.isEmpty(strM29639)) {
                                        strM29639 = abstractActivityC12486.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(strM29639);
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(string);
                                    long jM29638 = c11884M19411.m29638();
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(jM29638 <= 0 ? abstractActivityC12486.getString(R.string.MT_Protector) : C5319.m14739(jM29638));
                                    long jM29635 = c11884M19411.m29635();
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(jM29635 <= 0 ? abstractActivityC12486.getString(R.string.MT_Protector) : C5319.m14739(jM29635));
                                    String strM29637 = c11884M19411.m29637();
                                    if (TextUtils.isEmpty(strM29637)) {
                                        strM29637 = abstractActivityC12486.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(strM29637);
                                    String strM29640 = c11884M19411.m29640();
                                    if (TextUtils.isEmpty(strM29640)) {
                                        strM29640 = abstractActivityC12486.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM30998.findViewById(R.id.MT_Protector)).setText(strM29640);
                                    int i6 = DialogInterfaceC19356.f62401;
                                    C8067 c8067 = new C8067(abstractActivityC12486);
                                    c8067.m21258(viewM30998);
                                    c8067.m21251(R.string.MT_Protector, null);
                                    c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                    final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
                                    Button buttonM44373 = dialogInterfaceC19356M21269.m44373();
                                    final C15745 c15748 = c15747;
                                    buttonM44373.setOnClickListener(new View.OnClickListener(c15748, abstractActivityC12486, c11884M19411, c7278, dialogInterfaceC19356M21269) { // from class: l.۬ۛۚ

                                        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C7277 f42941;

                                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ AbstractActivityC12483 f42942;

                                        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ DialogInterfaceC19356 f42943;

                                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C11884 f42944;

                                        {
                                            this.f42942 = abstractActivityC12486;
                                            this.f42944 = c11884M19411;
                                            this.f42941 = c7278;
                                            this.f42943 = dialogInterfaceC19356M21269;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            final C11884 c11884 = this.f42944;
                                            String strM296310 = c11884.m29639();
                                            boolean zIsEmpty = TextUtils.isEmpty(strM296310);
                                            AbstractActivityC12483 abstractActivityC12487 = this.f42942;
                                            if (zIsEmpty) {
                                                strM296310 = abstractActivityC12487.getString(R.string.MT_Protector);
                                            }
                                            int i7 = DialogInterfaceC19356.f62401;
                                            C8067 c8068 = new C8067(abstractActivityC12487);
                                            c8068.m21274(R.string.MT_Protector);
                                            c8068.m21261(abstractActivityC12487.getString(R.string.MT_Protector, strM296310));
                                            final DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8068, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                            Button buttonM44374 = dialogInterfaceC19356M10334.m44373();
                                            final DialogInterfaceC19356 dialogInterfaceC19356 = this.f42943;
                                            final C7277 c7279 = this.f42941;
                                            buttonM44374.setOnClickListener(new View.OnClickListener() { // from class: l.ۘۛۚ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    dialogInterfaceC19356M10334.dismiss();
                                                    if (ServiceC4538.m12670(c11884.m29636())) {
                                                        dialogInterfaceC19356.dismiss();
                                                        c7279.m19413();
                                                    } else {
                                                        C15829.m37611(R.string.MT_Protector);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            int i5 = DialogInterfaceC19356.f62401;
                            C8067 c8067 = new C8067(abstractActivityC12485);
                            c8067.m21258(viewM30997);
                            c8067.m21251(R.string.MT_Protector, null);
                            c8067.m21269();
                        }
                    });
                    editText.setText(C17944.m41774().mo33986());
                    editText2.setText(String.valueOf(C17944.m41773()));
                    editText3.setHint(R.string.MT_Protector);
                    editText3.setInputType(2);
                    editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    editText3.setText(C17944.m41770());
                    C9725.m24679(abstractActivityC12484, (TextInputLayout) viewM30996.findViewById(R.id.MT_Protector), editText, (RunnableC3744) null);
                    C11150.m28071(textInputLayout);
                    C11150.m28071(textInputLayout2);
                    int i5 = DialogInterfaceC19356.f62401;
                    C8067 c8067 = new C8067(abstractActivityC12484);
                    c8067.m21274(R.string.MT_Protector);
                    c8067.m21258(viewM30996);
                    c8067.m21251(R.string.MT_Protector, null);
                    c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067.m21265(false);
                    final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
                    dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۛۚ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C15745.m37476(textInputLayout, editText2, editText3, textInputLayout2, editText, dialogInterfaceC19356M21269);
                        }
                    });
                    C8875.m23019(dialogInterfaceC19356M21269);
                    return;
                }
                View viewM30997 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                final EditText editText4 = (EditText) viewM30997.findViewById(R.id.MT_Protector);
                final EditText editText5 = (EditText) viewM30997.findViewById(R.id.editText2);
                final EditText editText6 = (EditText) viewM30997.findViewById(R.id.editText3);
                final EditText editText7 = (EditText) viewM30997.findViewById(R.id.editText4);
                final TextInputLayout textInputLayout3 = (TextInputLayout) viewM30997.findViewById(R.id.textInputLayout4);
                final EditText editText8 = (EditText) viewM30997.findViewById(R.id.MT_Protector);
                editText4.setText(C21034.m47436().mo33986());
                editText5.setText(C21034.m47438());
                editText6.setText(C21034.m47431());
                editText8.setText(C21034.m47437());
                editText7.setText(String.valueOf(C21034.m47435()));
                AbstractC12068.m29991(editText8, abstractActivityC12484);
                C9725.m24679(abstractActivityC12484, (TextInputLayout) viewM30997.findViewById(R.id.MT_Protector), editText4, (RunnableC3744) null);
                C11150.m28071(textInputLayout3);
                int i6 = DialogInterfaceC19356.f62401;
                C8067 c8068 = new C8067(abstractActivityC12484);
                c8068.m21274(R.string.MT_Protector);
                c8068.m21258(viewM30997);
                c8068.m21251(R.string.MT_Protector, null);
                c8068.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8068.m21265(false);
                final DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8068.m21269();
                dialogInterfaceC19356M212610.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۨۛۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C15745.m37475(textInputLayout3, editText7, editText4, editText5, editText6, editText8, dialogInterfaceC19356M212610);
                    }
                });
                C8875.m23019(dialogInterfaceC19356M212610);
            }
        });
        final Button buttonM44361 = dialogInterfaceC19356M21252.m44361();
        final Button buttonM44373 = dialogInterfaceC19356M21252.m44373();
        buttonM44361.setOnClickListener(new ViewOnClickListenerC8182(1, iArr));
        radioGroup.check(i3 == 1 ? R.id.MT_Protector : R.id.MT_Protector);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.ᩴۛۚ
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                C15745.m37474(i4, iArr);
            }
        });
        Runnable runnable = new Runnable(c15745) { // from class: l.۠ۛۚ
            /* JADX WARN: Code duplicated, block: B:56:0x0142  */
            /* JADX WARN: Code duplicated, block: B:57:0x014b  */
            /* JADX WARN: Code duplicated, block: B:60:0x015f  */
            @Override // java.lang.Runnable
            public final void run() {
                String strM12673;
                boolean zM37480;
                ImageView imageView3;
                View view;
                String[] strArr2;
                String strM1616;
                if (zArr[0]) {
                    runnableC11110M52471.run();
                    int[] iArr2 = iArr;
                    boolean zM12674 = iArr2[0] == 0 ? ServiceC4538.m12674() : ServiceC7629.m20160();
                    Runnable[] runnableArr2 = runnableArr;
                    c19978.removeCallbacks(runnableArr2[0]);
                    View view2 = viewFindViewById3;
                    view2.setVisibility(8);
                    buttonM44373.setText((ServiceC4538.m12674() || ServiceC7629.m20160()) ? R.string.MT_Protector : R.string.MT_Protector);
                    buttonM44361.setText(zM12674 ? R.string.MT_Protector : R.string.MT_Protector);
                    Inet4Address inet4AddressM40774 = C17506.m40774();
                    ImageView imageView4 = imageView2;
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    int i4 = R.string.MT_Protector;
                    if (inet4AddressM40774 != null) {
                        imageView4.setImageResource(R.drawable.MT_Protector);
                        if (zM12674) {
                            textView4.setText(iArr2[0] == 0 ? R.string.MT_Protector : R.string.MT_Protector);
                            strM12673 = iArr2[0] == 0 ? ServiceC4538.m12673() : ServiceC7629.m20169();
                            textView5.setText(strM12673);
                            if (iArr2[0] == 0) {
                                String strM12676 = ServiceC4538.m12676();
                                long jM12671 = ServiceC4538.m12671();
                                if (!TextUtils.isEmpty(strM12676) && jM12671 > System.currentTimeMillis()) {
                                    jArr[0] = jM12671;
                                    if (strM12676.length() == 6) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(strM12676.substring(0, 3));
                                        sb.append(" ");
                                        strM1616 = C0242.m1616(3, strM12676, sb);
                                    } else {
                                        strM1616 = strM12676;
                                    }
                                    String strM39264 = C16737.m39264(R.string.MT_Protector, strM1616);
                                    int iIndexOf = strM39264.indexOf(strM1616);
                                    int length = strM12676.length();
                                    TextView textView6 = textView3;
                                    CharSequence charSequence = strM39264;
                                    charSequence = strM39264;
                                    if (length == 6 && iIndexOf >= 0) {
                                        int iMax = Math.max(C13932.m33769(2.0f), Math.round(textView6.getTextSize() * 0.15f));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM39264);
                                        spannableStringBuilder.setSpan(new C20683(iMax), iIndexOf + 3, iIndexOf + 4, 33);
                                        charSequence = spannableStringBuilder;
                                    }
                                    textView6.setText(charSequence);
                                    view2.setVisibility(0);
                                    runnableArr2[0].run();
                                }
                            }
                        } else {
                            textView4.setText(R.string.MT_Protector);
                            textView5.setText(R.string.MT_Protector);
                        }
                        zM37480 = C15745.m37480(iArr2[0], strM12673, zM12674);
                        imageView3 = imageView;
                        view = viewFindViewById2;
                        strArr2 = strArr;
                        if (zM37480) {
                            strArr2[0] = strM12673;
                            imageView3.setVisibility(0);
                            view.setVisibility(0);
                        } else {
                            strArr2[0] = null;
                            imageView3.setVisibility(4);
                            view.setVisibility(4);
                        }
                        View view3 = viewFindViewById;
                        view3.setVisibility(C14057.m34005(view3.getContext()) ? 8 : 0);
                    }
                    imageView4.setImageResource(R.drawable.MT_Protector);
                    if (zM12674) {
                        i4 = R.string.MT_Protector;
                    }
                    textView4.setText(i4);
                    textView5.setText(R.string.MT_Protector);
                    strM12673 = null;
                    zM37480 = C15745.m37480(iArr2[0], strM12673, zM12674);
                    imageView3 = imageView;
                    view = viewFindViewById2;
                    strArr2 = strArr;
                    if (zM37480) {
                        strArr2[0] = strM12673;
                        imageView3.setVisibility(0);
                        view.setVisibility(0);
                    } else {
                        strArr2[0] = null;
                        imageView3.setVisibility(4);
                        view.setVisibility(4);
                    }
                    View view4 = viewFindViewById;
                    view4.setVisibility(C14057.m34005(view4.getContext()) ? 8 : 0);
                }
            }
        };
        viewM30995.setTag(runnable);
        f51043.add(runnable);
        m37471();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37479(boolean[] zArr, C19978 c19978, Runnable[] runnableArr, AbstractActivityC12483 abstractActivityC12483) {
        zArr[0] = false;
        c19978.removeCallbacks(runnableArr[0]);
        int i = f51046;
        if (i != 0) {
            int i2 = i - 1;
            f51046 = i2;
            if (i2 == 0) {
                f51044.m44856();
                f51044 = null;
                C16737.m39268(f51049);
            }
        }
        if (abstractActivityC12483 instanceof ActivityC20515) {
            abstractActivityC12483.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37477(AbstractActivityC12483 abstractActivityC12483) {
        abstractActivityC12483.m30998(new RunnableC2337());
        C14057.m34006(abstractActivityC12483);
        m37471();
        C16737.m39274(new RunnableC19272(), 1000L);
        C16737.m39274(new RunnableC19272(), c.a);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37474(int i, int[] iArr) {
        int i2 = i == R.id.MT_Protector ? 1 : 0;
        iArr[0] = i2;
        ApplicationC0716.f2988.edit().putInt("remote_manager_last_protocol", i2 != 1 ? 0 : 1).apply();
        m37471();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37473() {
        m37471();
        C16737.m39274(new RunnableC19272(), 1000L);
        C16737.m39274(new RunnableC19272(), c.a);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37480(int i, String str, boolean z) {
        if (i != 0 || !z || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toString().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m37472(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0");
        }
        EnumC3802 enumC3802 = EnumC3802.AZTEC;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i);
        }
        C20032 c20032M16180 = C16504.m38778(str, EnumC19326.L).m16180();
        if (c20032M16180 == null) {
            throw new IllegalStateException();
        }
        int iM45357 = c20032M16180.m45357();
        int iM45362 = c20032M16180.m45362();
        int i2 = iM45357 + 8;
        int i3 = iM45362 + 8;
        int iMax = Math.max(i, i2);
        int iMax2 = Math.max(i, i3);
        int iMin = Math.min(iMax / i2, iMax2 / i3);
        int i4 = (iMax - (iM45357 * iMin)) / 2;
        int i5 = (iMax2 - (iM45362 * iMin)) / 2;
        C15093 c15093 = new C15093(iMax, iMax2);
        int i6 = 0;
        while (i6 < iM45362) {
            int i7 = 0;
            int i8 = i4;
            while (i7 < iM45357) {
                if (c20032M16180.m45358(i7, i6) == 1) {
                    c15093.m36165(i8, i5, iMin, iMin);
                }
                i7++;
                i8 += iMin;
            }
            i6++;
            i5 += iMin;
        }
        int[] iArr = new int[i * i];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 * i;
            for (int i11 = 0; i11 < i; i11++) {
                iArr[i10 + i11] = c15093.m36166(i11, i9) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37476(TextInputLayout textInputLayout, EditText editText, EditText editText2, TextInputLayout textInputLayout2, EditText editText3, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (m37481(textInputLayout, editText)) {
            String string = editText2.getText().toString();
            if (!C17944.m41772(string)) {
                textInputLayout2.setError(C16737.m39288(R.string.MT_Protector));
                editText2.requestFocus();
                return;
            }
            textInputLayout2.setError(null);
            textInputLayout2.setErrorEnabled(false);
            C17944.m41771(editText3.getText().toString(), editText.getText().toString(), string);
            if (ServiceC4538.m12674()) {
                f51047 = true;
                Application applicationM39277 = C16737.m39277();
                applicationM39277.stopService(new Intent(applicationM39277, (Class<?>) ServiceC4538.class));
            }
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37475(TextInputLayout textInputLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (m37481(textInputLayout, editText)) {
            C21034.m47432(editText2.getText().toString(), editText3.getText().toString(), editText4.getText().toString(), editText5.getText().toString(), editText.getText().toString());
            if (ServiceC7629.m20160()) {
                f51048 = true;
                Application applicationM39277 = C16737.m39277();
                applicationM39277.stopService(new Intent(applicationM39277, (Class<?>) ServiceC7629.class));
            }
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37481(TextInputLayout textInputLayout, EditText editText) {
        if (C15945.m37905(editText.getText().toString()) == null) {
            textInputLayout.setError(C16737.m39288(R.string.MT_Protector));
            editText.requestFocus();
            return false;
        }
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m37471() {
        Iterator it = f51043.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m37485() {
        if (f51046 == 0) {
            f51044 = new C19729(C16737.m39277(), new RunnableC19272());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STARTED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STOPPED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STARTED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STOPPED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
            C16737.m39269(f51049, intentFilter);
        }
        f51046++;
    }
}
