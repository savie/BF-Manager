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
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import java.net.Inet4Address;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2564 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8237 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f8238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f8239 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BroadcastReceiver f8240 = new C10021();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f8241;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f8242;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13700 f8243;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8621(final AbstractActivityC17204 abstractActivityC17204, int i) {
        final C2564 c2564 = new C2564();
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        final ImageView imageView = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM40395.findViewById(R.id.MT_Protector);
        final C8530 c8530 = (C8530) viewM40395.findViewById(R.id.MT_Protector);
        final ImageView imageView2 = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        RadioGroup radioGroup = (RadioGroup) viewM40395.findViewById(R.id.MT_Protector);
        int i2 = i == 1 ? 1 : 0;
        final int[] iArr = {i2};
        final String[] strArr = {null};
        final boolean[] zArr = {true};
        final long[] jArr = {0};
        final Runnable[] runnableArr = new Runnable[1];
        int i3 = i2;
        runnableArr[0] = new Runnable() { // from class: l.ܶۡᩴ
            @Override // java.lang.Runnable
            public final void run() {
                long jM10151 = ServiceC3107.m10151();
                long jMax = Math.max(jArr[0] - System.currentTimeMillis(), 0L);
                C8530 c8531 = c8530;
                c8531.m22845(jMax, jM10151);
                if (zArr[0] && viewFindViewById3.getVisibility() == 0 && jMax > 0) {
                    c8531.postDelayed(runnableArr[0], 200L);
                }
            }
        };
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.ܰۡᩴ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C2564.m8622(zArr, c8530, runnableArr, abstractActivityC17204);
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
        dialogInterfaceC8327M7999.m22428(new DialogInterfaceOnShowListenerC21210());
        dialogInterfaceC8327M7999.m22432();
        final RunnableC1444 runnableC1444M25158 = C9646.m25158(viewM40395.findViewById(R.id.MT_Protector), abstractActivityC17204, dialogInterfaceC8327M7999);
        ViewOnClickListenerC15284.m36686(textView2);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC16978(1, abstractActivityC17204));
        imageView.setOnClickListener(new View.OnClickListener(c2564) { // from class: l.ܿۡᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                int i4 = iArr[0];
                String str = strArr[0];
                if (!C2564.m8623(i4, str, i4 == 0 ? ServiceC3107.m10148() : ServiceC22717.m51237())) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                try {
                    View viewM40396 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                    ImageView imageView3 = (ImageView) viewM40396.findViewById(R.id.MT_Protector);
                    TextView textView4 = (TextView) viewM40396.findViewById(R.id.MT_Protector);
                    imageView3.setImageBitmap(C2564.m8615(C6907.m19160(220.0f), str));
                    ViewOnClickListenerC15284.m36687(textView4, str);
                    int i5 = DialogInterfaceC8327.f27315;
                    C2361 c2361 = new C2361(abstractActivityC17205);
                    c2361.m8021(R.string.MT_Protector);
                    c2361.m8005(viewM40396);
                    c2361.m8026(R.string.MT_Protector, null);
                    c2361.m8016();
                } catch (RuntimeException | C7915 unused) {
                    C22673.m51152(R.string.MT_Protector);
                }
            }
        });
        dialogInterfaceC8327M7999.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.֡ۡᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = iArr[0];
                int i5 = 1;
                final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (i4 == 0) {
                    View viewM40396 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                    final C1255 c1255 = (C1255) viewM40396.findViewById(R.id.MT_Protector);
                    c1255.setChecked((C4422.m14043() & 2) != 0);
                    viewM40396.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12293(c1255, 1));
                    final C23255 c23255 = (C23255) viewM40396.findViewById(R.id.MT_Protector);
                    final C23255 c23256 = (C23255) viewM40396.findViewById(R.id.editText4);
                    final C1626 c1626 = (C1626) viewM40396.findViewById(R.id.textInputLayout4);
                    final C23255 c23257 = (C23255) viewM40396.findViewById(R.id.MT_Protector);
                    final C1626 c1627 = (C1626) viewM40396.findViewById(R.id.MT_Protector);
                    ((TextView) viewM40396.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
                    viewM40396.findViewById(R.id.textView2).setVisibility(8);
                    viewM40396.findViewById(R.id.editText2).setVisibility(8);
                    viewM40396.findViewById(R.id.textView3).setVisibility(8);
                    viewM40396.findViewById(R.id.editText3).setVisibility(8);
                    ((TextView) viewM40396.findViewById(R.id.textView5)).setText(R.string.MT_Protector);
                    ((TextView) viewM40396.findViewById(R.id.textView6)).setVisibility(0);
                    Button button = (Button) viewM40396.findViewById(R.id.MT_Protector);
                    button.setVisibility(0);
                    final C2564 c2565 = this.f1794;
                    button.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۡᩴ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final AbstractActivityC17204 abstractActivityC17206 = abstractActivityC17205;
                            View viewM40397 = abstractActivityC17206.m40395(R.layout.MT_Protector);
                            ((TextView) viewM40397.findViewById(R.id.title)).setText(R.string.MT_Protector);
                            ListView listView = (ListView) viewM40397.findViewById(R.id.MT_Protector);
                            final C1073 c1073 = new C1073(abstractActivityC17206);
                            listView.setAdapter((ListAdapter) c1073);
                            C18597.m43179(listView);
                            final C2564 c2566 = c2565;
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۛۡᩴ
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view3, int i6, long j) {
                                    final C1073 c1074 = c1073;
                                    if (c1074.m4032()) {
                                        return;
                                    }
                                    final C4071 c4071M4031 = c1074.m4031(i6);
                                    final AbstractActivityC17204 abstractActivityC17207 = abstractActivityC17206;
                                    View viewM40398 = abstractActivityC17207.m40395(R.layout.MT_Protector);
                                    String string = abstractActivityC17207.getString(c4071M4031.m13145() ? R.string.MT_Protector : R.string.MT_Protector);
                                    String strM13148 = c4071M4031.m13148();
                                    if (TextUtils.isEmpty(strM13148)) {
                                        strM13148 = abstractActivityC17207.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(strM13148);
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(string);
                                    long jM13144 = c4071M4031.m13144();
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(jM13144 <= 0 ? abstractActivityC17207.getString(R.string.MT_Protector) : C22482.m50713(jM13144));
                                    long jM13149 = c4071M4031.m13149();
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(jM13149 <= 0 ? abstractActivityC17207.getString(R.string.MT_Protector) : C22482.m50713(jM13149));
                                    String strM13147 = c4071M4031.m13147();
                                    if (TextUtils.isEmpty(strM13147)) {
                                        strM13147 = abstractActivityC17207.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(strM13147);
                                    String strM13146 = c4071M4031.m13146();
                                    if (TextUtils.isEmpty(strM13146)) {
                                        strM13146 = abstractActivityC17207.getString(R.string.MT_Protector);
                                    }
                                    ((TextView) viewM40398.findViewById(R.id.MT_Protector)).setText(strM13146);
                                    int i7 = DialogInterfaceC8327.f27315;
                                    C2361 c2361 = new C2361(abstractActivityC17207);
                                    c2361.m8005(viewM40398);
                                    c2361.m8026(R.string.MT_Protector, null);
                                    c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                    final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
                                    Button buttonM22436 = dialogInterfaceC8327M8016.m22436();
                                    final C2564 c2567 = c2566;
                                    buttonM22436.setOnClickListener(new View.OnClickListener(c2567, abstractActivityC17207, c4071M4031, c1074, dialogInterfaceC8327M8016) { // from class: l.᩺ۡᩴ

                                        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ DialogInterfaceC8327 f78343;

                                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ AbstractActivityC17204 f78344;

                                        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C1073 f78345;

                                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                                        public final /* synthetic */ C4071 f78346;

                                        {
                                            this.f78344 = abstractActivityC17207;
                                            this.f78346 = c4071M4031;
                                            this.f78345 = c1074;
                                            this.f78343 = dialogInterfaceC8327M8016;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            final C4071 c4071 = this.f78346;
                                            String strM13149 = c4071.m13148();
                                            boolean zIsEmpty = TextUtils.isEmpty(strM13149);
                                            AbstractActivityC17204 abstractActivityC17208 = this.f78344;
                                            if (zIsEmpty) {
                                                strM13149 = abstractActivityC17208.getString(R.string.MT_Protector);
                                            }
                                            int i8 = DialogInterfaceC8327.f27315;
                                            C2361 c2362 = new C2361(abstractActivityC17208);
                                            c2362.m8021(R.string.MT_Protector);
                                            c2362.m8008(abstractActivityC17208.getString(R.string.MT_Protector, strM13149));
                                            final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2362, R.string.MT_Protector, null, R.string.MT_Protector, null);
                                            Button buttonM22437 = dialogInterfaceC8327M34866.m22436();
                                            final DialogInterfaceC8327 dialogInterfaceC8327 = this.f78343;
                                            final C1073 c1075 = this.f78345;
                                            buttonM22437.setOnClickListener(new View.OnClickListener() { // from class: l.ۘۡᩴ
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view5) {
                                                    dialogInterfaceC8327M34866.dismiss();
                                                    if (ServiceC3107.m10147(c4071.m13143())) {
                                                        dialogInterfaceC8327.dismiss();
                                                        c1075.m4033();
                                                    } else {
                                                        C22673.m51152(R.string.MT_Protector);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                            int i6 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(abstractActivityC17206);
                            c2361.m8005(viewM40397);
                            c2361.m8026(R.string.MT_Protector, null);
                            c2361.m8016();
                        }
                    });
                    c23255.mo52335((CharSequence) C0870.m3556().mo4294());
                    c23256.mo52335((CharSequence) String.valueOf(C0870.m3555()));
                    c23257.m52337(C21576.m49088(R.string.MT_Protector));
                    c23257.m52326(2);
                    c23257.m52304(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    c23257.mo52335((CharSequence) C0870.m3552());
                    C15242.m36583(abstractActivityC17205, (C1626) viewM40396.findViewById(R.id.MT_Protector), c23255, (RunnableC19006) null);
                    C7893.m21433(c1626);
                    C7893.m21433(c1627);
                    int i6 = DialogInterfaceC8327.f27315;
                    C2361 c2361 = new C2361(abstractActivityC17205);
                    c2361.m8021(R.string.MT_Protector);
                    c2361.m8005(viewM40396);
                    c2361.m8026(R.string.MT_Protector, null);
                    c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361.m8012(false);
                    final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
                    dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۨۡᩴ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C2564.m8618(c1626, c23256, c23257, c1627, c23255, c1255, dialogInterfaceC8327M8016);
                        }
                    });
                    C21232.m48398(dialogInterfaceC8327M8016);
                    return;
                }
                View viewM40397 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                final C1255 c1256 = (C1255) viewM40397.findViewById(R.id.MT_Protector);
                c1256.setChecked((C4422.m14043() & 4) != 0);
                viewM40397.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC6591(i5, c1256));
                final C23255 c23258 = (C23255) viewM40397.findViewById(R.id.MT_Protector);
                final C23255 c23259 = (C23255) viewM40397.findViewById(R.id.editText2);
                final C23255 c232510 = (C23255) viewM40397.findViewById(R.id.editText3);
                final C23255 c232511 = (C23255) viewM40397.findViewById(R.id.editText4);
                final C1626 c1628 = (C1626) viewM40397.findViewById(R.id.textInputLayout4);
                final C23255 c232512 = (C23255) viewM40397.findViewById(R.id.MT_Protector);
                c23258.mo52335((CharSequence) C19733.m45436().mo4294());
                c23259.mo52335((CharSequence) C19733.m45438());
                c232510.mo52335((CharSequence) C19733.m45441());
                c232512.mo52335((CharSequence) C19733.m45440());
                c232511.mo52335((CharSequence) String.valueOf(C19733.m45439()));
                AbstractC0148.m1317(c232512, abstractActivityC17205);
                C15242.m36583(abstractActivityC17205, (C1626) viewM40397.findViewById(R.id.MT_Protector), c23258, (RunnableC19006) null);
                C7893.m21433(c1628);
                int i7 = DialogInterfaceC8327.f27315;
                C2361 c2362 = new C2361(abstractActivityC17205);
                c2362.m8021(R.string.MT_Protector);
                c2362.m8005(viewM40397);
                c2362.m8026(R.string.MT_Protector, null);
                c2362.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2362.m8012(false);
                final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2362.m8016();
                dialogInterfaceC8327M8017.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۡᩴ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C2564.m8619(c1628, c232511, c23258, c23259, c232510, c232512, c1256, dialogInterfaceC8327M8017);
                    }
                });
                C21232.m48398(dialogInterfaceC8327M8017);
            }
        });
        final Button buttonM22440 = dialogInterfaceC8327M7999.m22440();
        final Button buttonM22436 = dialogInterfaceC8327M7999.m22436();
        buttonM22440.setOnClickListener(new ViewOnClickListenerC15533(2, iArr));
        radioGroup.check(i3 == 1 ? R.id.MT_Protector : R.id.MT_Protector);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.۟ۡᩴ
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i4) {
                C2564.m8617(i4, iArr);
            }
        });
        Runnable runnable = new Runnable(c2564) { // from class: l.ᩳۡᩴ
            /* JADX WARN: Code duplicated, block: B:56:0x0142  */
            /* JADX WARN: Code duplicated, block: B:57:0x014b  */
            /* JADX WARN: Code duplicated, block: B:60:0x015f  */
            @Override // java.lang.Runnable
            public final void run() {
                String strM10149;
                boolean zM8623;
                ImageView imageView3;
                View view;
                String[] strArr2;
                String strM;
                if (zArr[0]) {
                    runnableC1444M25158.run();
                    int[] iArr2 = iArr;
                    boolean zM10148 = iArr2[0] == 0 ? ServiceC3107.m10148() : ServiceC22717.m51237();
                    Runnable[] runnableArr2 = runnableArr;
                    c8530.removeCallbacks(runnableArr2[0]);
                    View view2 = viewFindViewById3;
                    view2.setVisibility(8);
                    buttonM22436.setText((ServiceC3107.m10148() || ServiceC22717.m51237()) ? R.string.MT_Protector : R.string.MT_Protector);
                    buttonM22440.setText(zM10148 ? R.string.MT_Protector : R.string.MT_Protector);
                    Inet4Address inet4AddressM55712 = C24955.m55712();
                    ImageView imageView4 = imageView2;
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    int i4 = R.string.MT_Protector;
                    if (inet4AddressM55712 != null) {
                        imageView4.setImageResource(R.drawable.MT_Protector);
                        if (zM10148) {
                            textView4.setText(iArr2[0] == 0 ? R.string.MT_Protector : R.string.MT_Protector);
                            strM10149 = iArr2[0] == 0 ? ServiceC3107.m10149() : ServiceC22717.m51229();
                            textView5.setText(strM10149);
                            if (iArr2[0] == 0) {
                                String strM10152 = ServiceC3107.m10152();
                                long jM10153 = ServiceC3107.m10153();
                                if (!TextUtils.isEmpty(strM10152) && jM10153 > System.currentTimeMillis()) {
                                    jArr[0] = jM10153;
                                    if (strM10152.length() == 6) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(strM10152.substring(0, 3));
                                        sb.append(" ");
                                        strM = ExternalValue$$ExternalSyntheticOutline0.m(3, strM10152, sb);
                                    } else {
                                        strM = strM10152;
                                    }
                                    String strM49059 = C21576.m49059(R.string.MT_Protector, strM);
                                    int iIndexOf = strM49059.indexOf(strM);
                                    int length = strM10152.length();
                                    TextView textView6 = textView3;
                                    CharSequence charSequence = strM49059;
                                    charSequence = strM49059;
                                    if (length == 6 && iIndexOf >= 0) {
                                        int iMax = Math.max(C6907.m19160(2.0f), Math.round(textView6.getTextSize() * 0.15f));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM49059);
                                        spannableStringBuilder.setSpan(new C9275(iMax), iIndexOf + 3, iIndexOf + 4, 33);
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
                        zM8623 = C2564.m8623(iArr2[0], strM10149, zM10148);
                        imageView3 = imageView;
                        view = viewFindViewById2;
                        strArr2 = strArr;
                        if (zM8623) {
                            strArr2[0] = strM10149;
                            imageView3.setVisibility(0);
                            view.setVisibility(0);
                        } else {
                            strArr2[0] = null;
                            imageView3.setVisibility(4);
                            view.setVisibility(4);
                        }
                        View view3 = viewFindViewById;
                        view3.setVisibility(C21998.m49728(view3.getContext()) ? 8 : 0);
                    }
                    imageView4.setImageResource(R.drawable.MT_Protector);
                    if (zM10148) {
                        i4 = R.string.MT_Protector;
                    }
                    textView4.setText(i4);
                    textView5.setText(R.string.MT_Protector);
                    strM10149 = null;
                    zM8623 = C2564.m8623(iArr2[0], strM10149, zM10148);
                    imageView3 = imageView;
                    view = viewFindViewById2;
                    strArr2 = strArr;
                    if (zM8623) {
                        strArr2[0] = strM10149;
                        imageView3.setVisibility(0);
                        view.setVisibility(0);
                    } else {
                        strArr2[0] = null;
                        imageView3.setVisibility(4);
                        view.setVisibility(4);
                    }
                    View view4 = viewFindViewById;
                    view4.setVisibility(C21998.m49728(view4.getContext()) ? 8 : 0);
                }
            }
        };
        viewM40395.setTag(runnable);
        f8239.add(runnable);
        m8614();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8622(boolean[] zArr, C8530 c8530, Runnable[] runnableArr, AbstractActivityC17204 abstractActivityC17204) {
        zArr[0] = false;
        c8530.removeCallbacks(runnableArr[0]);
        int i = f8241;
        if (i != 0) {
            int i2 = i - 1;
            f8241 = i2;
            if (i2 == 0) {
                f8243.m33493();
                f8243 = null;
                C21576.m49063(f8240);
            }
        }
        if (abstractActivityC17204 instanceof ActivityC12647) {
            abstractActivityC17204.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8620(AbstractActivityC17204 abstractActivityC17204) {
        abstractActivityC17204.m40399(new RunnableC3310());
        C21998.m49729(abstractActivityC17204);
        m8614();
        C21576.m49069(new RunnableC13814(2), 1000L);
        C21576.m49069(new RunnableC13814(2), c.a);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8617(int i, int[] iArr) {
        int i2 = i == R.id.MT_Protector ? 1 : 0;
        iArr[0] = i2;
        ApplicationC17729.f58262.edit().putInt("remote_manager_last_protocol", i2 != 1 ? 0 : 1).apply();
        m8614();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8616() {
        m8614();
        C21576.m49069(new RunnableC13814(2), 1000L);
        C21576.m49069(new RunnableC13814(2), c.a);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8623(int i, String str, boolean z) {
        if (i != 0 || !z || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toString().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m8615(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("size must be greater than 0");
        }
        EnumC0457 enumC0457 = EnumC0457.AZTEC;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i);
        }
        C19585 c19585M28706 = C12872.m31903(str, EnumC7169.L).m28706();
        if (c19585M28706 == null) {
            throw new IllegalStateException();
        }
        int iM45187 = c19585M28706.m45187();
        int iM45185 = c19585M28706.m45185();
        int i2 = iM45187 + 8;
        int i3 = iM45185 + 8;
        int iMax = Math.max(i, i2);
        int iMax2 = Math.max(i, i3);
        int iMin = Math.min(iMax / i2, iMax2 / i3);
        int i4 = (iMax - (iM45187 * iMin)) / 2;
        int i5 = (iMax2 - (iM45185 * iMin)) / 2;
        C10151 c10151 = new C10151(iMax, iMax2);
        int i6 = 0;
        while (i6 < iM45185) {
            int i7 = 0;
            int i8 = i4;
            while (i7 < iM45187) {
                if (c19585M28706.m45181(i7, i6) == 1) {
                    c10151.m26261(i8, i5, iMin, iMin);
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
                iArr[i10 + i11] = c10151.m26262(i11, i9) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8618(C1626 c1626, C23255 c23255, C23255 c23256, C1626 c1627, C23255 c23257, C1255 c1255, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (m8624(c1626, c23255)) {
            String string = c23256.m54021().toString();
            if (!C0870.m3554(string)) {
                c1627.m5768(C21576.m49088(R.string.MT_Protector));
                c23256.requestFocus();
                return;
            }
            c1627.m5768((CharSequence) null);
            c1627.m5769(false);
            String strMo4294 = C0870.m3556().mo4294();
            int iM3555 = C0870.m3555();
            String strM3552 = C0870.m3552();
            C0870.m3553(c23257.m54021().toString(), c23255.m54021().toString(), string);
            C4422.m14046(2, c1255.isChecked());
            if ((!strMo4294.equals(C0870.m3556().mo4294()) || iM3555 != C0870.m3555() || !strM3552.equals(C0870.m3552())) && ServiceC3107.m10148()) {
                f8238 = true;
                Application applicationM49084 = C21576.m49084();
                applicationM49084.stopService(new Intent(applicationM49084, (Class<?>) ServiceC3107.class));
            }
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8619(C1626 c1626, C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259, C1255 c1255, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (m8624(c1626, c23255)) {
            String strMo4294 = C19733.m45436().mo4294();
            String strM45438 = C19733.m45438();
            String strM45441 = C19733.m45441();
            String strM45440 = C19733.m45440();
            int iM45439 = C19733.m45439();
            C19733.m45433(c23256.m54021().toString(), c23257.m54021().toString(), c23258.m54021().toString(), c23259.m54021().toString(), c23255.m54021().toString());
            C4422.m14046(4, c1255.isChecked());
            if ((!strMo4294.equals(C19733.m45436().mo4294()) || !strM45438.equals(C19733.m45438()) || !strM45441.equals(C19733.m45441()) || !strM45440.equals(C19733.m45440()) || iM45439 != C19733.m45439()) && ServiceC22717.m51237()) {
                f8242 = true;
                Application applicationM49084 = C21576.m49084();
                applicationM49084.stopService(new Intent(applicationM49084, (Class<?>) ServiceC22717.class));
            }
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8624(C1626 c1626, C23255 c23255) {
        if (C18856.m43756(c23255.m54021().toString()) == null) {
            c1626.m5768(C21576.m49088(R.string.MT_Protector));
            c23255.requestFocus();
            return false;
        }
        c1626.m5768((CharSequence) null);
        c1626.m5769(false);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8614() {
        Iterator it = f8239.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m8630() {
        if (f8241 == 0) {
            f8243 = new C13700(C21576.m49084(), new RunnableC13814(2));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STARTED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_STOPPED");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START");
            intentFilter.addAction("bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STARTED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_STOPPED");
            intentFilter.addAction("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
            C21576.m49064(f8240, intentFilter);
        }
        f8241++;
    }
}
