package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19228 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6025 f62179;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f62180;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f62181;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11990 f62182;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f62183 = new HashMap();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f62184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f62185;

    public C19228(ActivityC3041 activityC3041, String str) {
        this.f62181 = activityC3041;
        this.f62185 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f62181);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        HashMap map = this.f62183;
        String str = this.f62185;
        C11381 c11381M55329 = C24808.m55329(C14584.m35193(str, new String[0]));
        if (c11381M55329 == null) {
            throw new Exception();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM28713 = c11381M55329.m28713();
        Rect rectCopyBounds = drawableM28713.copyBounds();
        drawableM28713.setBounds(0, 0, 256, 256);
        drawableM28713.draw(canvas);
        drawableM28713.setBounds(rectCopyBounds);
        C22941 c22941 = new C22941(str);
        try {
            boolean z = c22941.getEntry("assets/xposed_init") != null;
            C8002 entry = c22941.getEntry(C2317.m7820(1));
            int i = 2;
            while (true) {
                for (C22737 c22737 : (AbstractC8696) C24975.m55778(c22941.m51727(entry)).mo4327()) {
                    String type = c22737.getType();
                    if (!map.containsKey(type)) {
                        map.put(type, new C2820(c22737));
                    }
                }
                int i2 = i + 1;
                C8002 entry2 = c22941.getEntry(C2317.m7820(i));
                if (entry2 == null) {
                    break;
                }
                i = i2;
                entry = entry2;
            }
            c22941.close();
            C6025 c6025 = new C6025();
            this.f62179 = c6025;
            c6025.f20608 = C18978.m44077();
            this.f62179.f20613 = c11381M55329.m28715();
            this.f62179.f20615 = c11381M55329.m28718();
            this.f62179.f20610 = c11381M55329.m28716();
            C6025 c6026 = this.f62179;
            c6026.f20614 = bitmapCreateBitmap;
            c6026.f20611 = System.currentTimeMillis();
            this.f62184 = String.valueOf(c11381M55329.m28712());
            this.f62180 = C8311.m22390(c11381M55329.m28721());
            String str2 = this.f62179.f20615;
            C11990 c11990 = new C11990();
            c11990.f38630 = true;
            c11990.f38629 = false;
            c11990.f38631 = z;
            c11990.f38632 = false;
            c11990.f38634 = C14483.m34972(str2, ".**");
            AbstractC22044 abstractC22044M49876 = C6382.m18134().m49876("protector/config/" + str2 + ".json");
            if (abstractC22044M49876.mo2934() && abstractC22044M49876.mo4304()) {
                try {
                    c11990.m30128(abstractC22044M49876.m49871());
                } catch (IOException unused) {
                }
            }
            this.f62182 = c11990;
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC3041 activityC3041 = this.f62181;
        View viewM40395 = activityC3041.m40395(R.layout.MT_Protector);
        ImageView imageView = (ImageView) viewM40395.findViewById(R.id.icon);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM40395.findViewById(R.id.button1);
        View viewFindViewById2 = viewM40395.findViewById(R.id.MT_Protector);
        activityC3041.f9850 = c23256;
        final String str = this.f62185;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ۛܿۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20956 c20956 = this.f21992.f62181.f9858;
                C23255 c23257 = c23256;
                String string = c23257.m54099() == 0 ? str : c23257.m54021().toString();
                c20956.getClass();
                C20956.m47909(c20956, R.string.MT_Protector, string, null, 12);
            }
        });
        checkBox.setChecked(this.f62182.f38630);
        checkBox2.setChecked(this.f62182.f38629);
        checkBox3.setChecked(this.f62182.f38631);
        checkBox4.setChecked(false);
        c23256.mo52335((CharSequence) this.f62182.f38633);
        c23255.mo52335((CharSequence) this.f62182.f38634);
        c23255.mo52339(c23255.m54099());
        imageView.setImageBitmap(this.f62179.f20614);
        textView.setText(this.f62179.f20613);
        textView2.setText(this.f62179.f20610);
        textView3.setText(this.f62184);
        textView4.setText(this.f62179.f20615);
        textView5.setText(this.f62180);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.᩺ܿۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19228 c19228 = this.f79378;
                ActivityC3041 activityC3042 = c19228.f62181;
                String string = c23255.m54021().toString();
                String string2 = c23256.m54021().toString();
                Collection collectionValues = c19228.f62183.values();
                int i = ActivityC3041.f9847;
                new C10277(activityC3042, string, string2, collectionValues).m8197();
            }
        });
        C2361 c2361BuildDialog = activityC3041.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        checkBox.setOnCheckedChangeListener(new C4312(dialogInterfaceC8327M8016, checkBox, checkBox4, 0));
        checkBox4.setOnCheckedChangeListener(new C14752());
        C21232.m48398(dialogInterfaceC8327M8016);
        Button buttonM22436 = dialogInterfaceC8327M8016.m22436();
        final String str2 = this.f62185;
        buttonM22436.setOnClickListener(new View.OnClickListener() { // from class: l.᩶ܿۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                final C19228 c19228 = this.f68574;
                C11990 c11990 = c19228.f62179.f20616;
                C23255 c23257 = c23255;
                c11990.f38634 = c23257.m54021().toString();
                c19228.f62179.f20616.f38630 = checkBox.isChecked();
                c19228.f62179.f20616.f38629 = checkBox2.isChecked();
                c19228.f62179.f20616.f38631 = checkBox3.isChecked();
                c19228.f62179.f20616.f38632 = checkBox4.isChecked();
                c19228.f62179.f20616.f38633 = c23256.m54021().toString().trim();
                c19228.f62179.f20611 = System.currentTimeMillis();
                ActivityC3041 activityC3042 = c19228.f62181;
                String str3 = c19228.f62179.f20616.f38633;
                Collection<C2820> collectionValues = c19228.f62183.values();
                C6025 c6025 = c19228.f62179;
                int i = ActivityC3041.f9847;
                boolean z2 = false;
                try {
                    C5804 c5804M16929 = C5804.m16929(str3);
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : c6025.f20616.f38634.split("\n")) {
                        if (!str4.isEmpty()) {
                            arrayList.add(new C11769(str4, true));
                        }
                    }
                    Collections.sort(arrayList);
                    int i2 = 0;
                    int i3 = 0;
                    for (C2820 c2820 : collectionValues) {
                        String strM16930 = c5804M16929.m16930(c2820.f9270);
                        if (!c2820.f9268) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                C11769 c11769 = (C11769) it.next();
                                if (c11769.m29546(strM16930)) {
                                    z = !c11769.f38034;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2++;
                            i3 += c2820.f9269;
                        }
                    }
                    if (i2 == 0) {
                        C22673.m51152(R.string.MT_Protector);
                        int iM19160 = C6907.m19160(6.0f);
                        int iM19161 = C6907.m19160(3.0f);
                        float f = -iM19160;
                        float f2 = iM19160;
                        float f3 = -iM19161;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(c23257, "translationX", 0.0f, f, 0.0f, f2, 0.0f, f, 0.0f, f2, 0.0f, f3, 0.0f, iM19161, 0.0f, f3, 0.0f).setDuration(1000L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        duration.start();
                    } else if (i2 > C6790.m18954() || i3 > C6790.m18965()) {
                        C2361 c2361BuildDialog2 = activityC3042.buildDialog();
                        c2361BuildDialog2.m8021(R.string.MT_Protector);
                        c2361BuildDialog2.m8008(activityC3042.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i3)));
                        c2361BuildDialog2.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog2.m8016();
                    } else {
                        z2 = true;
                    }
                } catch (Exception e) {
                    activityC3042.m40401(new Exception(activityC3042.getString(R.string.MT_Protector), e), (DialogInterface.OnDismissListener) null);
                }
                if (z2) {
                    C2361 c2361BuildDialog3 = activityC3042.buildDialog();
                    c2361BuildDialog3.m8021(R.string.MT_Protector);
                    c2361BuildDialog3.m8000(R.string.MT_Protector);
                    final String str5 = str2;
                    final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                    c2361BuildDialog3.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܿۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C19228 c19229 = c19228;
                            C6025 c6026 = c19229.f62179;
                            String str6 = c6026.f20615;
                            C11990 c11991 = c6026.f20616;
                            AbstractC22044 abstractC22044M49876 = C6382.m18134().m49876("protector/config/" + str6 + ".json");
                            if (abstractC22044M49876.mo2934()) {
                                abstractC22044M49876.mo4296();
                            }
                            try {
                                abstractC22044M49876.mo49834();
                                abstractC22044M49876.m49879(c11991.m30127());
                            } catch (IOException unused) {
                            }
                            ActivityC3041 activityC3043 = c19229.f62181;
                            C6025 c6027 = c19229.f62179;
                            int i5 = ActivityC3041.f9847;
                            new C1329(activityC3043, c6027, str5).m8197();
                            dialogInterfaceC8327.dismiss();
                        }
                    });
                    c2361BuildDialog3.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog3.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ܿۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C19228 c19229 = c19228;
                            ActivityC3041 activityC3043 = c19229.f62181;
                            C11990 c11991 = c19229.f62179.f20616;
                            String str6 = c11991.f38634;
                            String str7 = c11991.f38633;
                            Collection collectionValues2 = c19229.f62183.values();
                            int i5 = ActivityC3041.f9847;
                            new C10277(activityC3043, str6, str7, collectionValues2).m8197();
                        }
                    });
                    c2361BuildDialog3.m8016();
                }
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ܿܿۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ActivityC3041 activityC3042 = this.f60155.f62181;
                int i = ActivityC3041.f9847;
                String[] strArr = {activityC3042.getString(R.string.MT_Protector), activityC3042.getString(R.string.MT_Protector), activityC3042.getString(R.string.MT_Protector), activityC3042.getString(R.string.MT_Protector)};
                SpannableString spannableString = new SpannableString(C24276.m54282(4, "\n \n", strArr));
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String str3 = strArr[i3];
                    int iIndexOf = str3.indexOf(10) + 1;
                    if (iIndexOf != 0) {
                        int i4 = iIndexOf + i2;
                        spannableString.setSpan(new ForegroundColorSpan(C3296.f10741), i4, str3.length() + i2, 17);
                        spannableString.setSpan(new RelativeSizeSpan(0.85f), i4, str3.length() + i2, 17);
                        int length = str3.length() + 3 + i2;
                        if (length < spannableString.length()) {
                            spannableString.setSpan(new AbsoluteSizeSpan(C6907.m19161(6.0f)), length - 3, length, 17);
                        }
                        i2 = length;
                    }
                }
                C2361 c2361BuildDialog2 = activityC3042.buildDialog();
                c2361BuildDialog2.m8021(R.string.MT_Protector);
                c2361BuildDialog2.m8008(spannableString);
                c2361BuildDialog2.m8026(R.string.MT_Protector, null);
                c2361BuildDialog2.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2361BuildDialog2.m8016();
                C5416.m16141(dialogInterfaceC8327M8017);
                dialogInterfaceC8327M8017.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܿۧ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ActivityC3041 activityC3043 = activityC3042;
                        int i5 = ActivityC3041.f9847;
                        try {
                            activityC3043.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C13047.m32504())));
                        } catch (Throwable th) {
                            activityC3043.m40401(th, (DialogInterface.OnDismissListener) null);
                        }
                    }
                });
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
