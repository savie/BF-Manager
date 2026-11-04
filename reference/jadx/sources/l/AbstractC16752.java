package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16752 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f54071;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f54072;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Spinner f54073;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC24958 f54074;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f54075;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23255 f54076;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TextView f54077;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Spinner f54078;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String[] f54079;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1255 f54080;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC24958[] f54081 = {EnumC24958.ZIP, EnumC24958.SEVEN_ZIP, EnumC24958.TAR, EnumC24958.TAR_GZIP, EnumC24958.TAR_XZ, EnumC24958.TAR_ZSTD, EnumC24958.TAR_BZIP2, EnumC24958.TAR_LZ4, EnumC24958.GZIP, EnumC24958.XZ, EnumC24958.ZSTD, EnumC24958.BZIP2, EnumC24958.LZ4};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23255 f54082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f54083;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f54084;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1255 f54085;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54086;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16800 f54087;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3054 f54088;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23255 f54089;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Spinner f54090;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f54091;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String[] f54092;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f54093;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1255 f54094;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1255 f54095;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f54096;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C1626 f54097;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Spinner f54098;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract void mo39560();

    public AbstractC16752(AbstractActivityC17204 abstractActivityC17204) {
        ArrayList arrayList = new ArrayList();
        this.f54086 = arrayList;
        this.f54075 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.setKeepScreenOn(true);
        this.f54076 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f54098 = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f54096 = (TextView) viewM40395.findViewById(R.id.textView3);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner2);
        this.f54073 = spinner;
        this.f54077 = (TextView) viewM40395.findViewById(R.id.textView4);
        C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
        this.f54097 = c1626;
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f54082 = c23255;
        this.f54071 = (TextView) viewM40395.findViewById(R.id.textView5);
        this.f54089 = (C23255) viewM40395.findViewById(R.id.editText3);
        this.f54078 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
        this.f54090 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
        this.f54085 = (C1255) viewM40395.findViewById(R.id.switch1);
        this.f54095 = (C1255) viewM40395.findViewById(R.id.switch2);
        this.f54094 = (C1255) viewM40395.findViewById(R.id.switch3);
        this.f54080 = (C1255) viewM40395.findViewById(R.id.switch4);
        String[] stringArray = abstractActivityC17204.getResources().getStringArray(R.array.MT_Protector);
        this.f54079 = stringArray;
        this.f54084 = (String[]) Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.f54092 = (String[]) Arrays.copyOfRange(stringArray, 1, stringArray.length - 1);
        Collections.addAll(arrayList, stringArray);
        C3054 c3054 = new C3054(abstractActivityC17204, arrayList);
        this.f54088 = c3054;
        spinner.setAdapter((SpinnerAdapter) c3054);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8023(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        this.f54091 = dialogInterfaceC8327M8016;
        C21232.m48398(dialogInterfaceC8327M8016);
        c1626.m5767(-1);
        c1626.m5757(R.drawable.MT_Protector);
        c1626.m5759(new ViewOnClickListenerC21970(this, abstractActivityC17204));
        c23255.m53899(new C19736(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39531(AbstractC16752 abstractC16752, AbstractActivityC17204 abstractActivityC17204) {
        List listM48113 = C21054.m48113();
        if (listM48113.isEmpty()) {
            abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC6138.class));
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C1170.stream(listM48113).map(new C8195(3)).toArray(new C19392(2));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8014(charSequenceArr, new DialogInterfaceOnClickListenerC3302(1, abstractC16752, listM48113));
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13348(2, abstractActivityC17204));
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39530(AbstractC16752 abstractC16752, List list, int i) {
        abstractC16752.f54082.mo52335((CharSequence) ((C14340) list.get(i)).f45235);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39554(String str, String str2) {
        this.f54083 = str;
        this.f54072 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m39549() {
        String str;
        C23255 c23255 = this.f54076;
        String string = c23255.m54021().toString();
        if (!this.f54093) {
            EnumC24958 enumC24958 = this.f54074;
            if (enumC24958.f80819) {
                str = this.f54072.toLowerCase() + this.f54074.f80817;
            } else {
                str = enumC24958.f80817;
            }
            if (string.toLowerCase().endsWith(str)) {
                this.f54083 = string.substring(0, string.length() - str.length());
            }
        }
        EnumC24958 enumC24958M39556 = m39556();
        C1255 c1255 = this.f54094;
        if (c1255.getVisibility() == 0 && c1255.isChecked()) {
            c23255.setEnabled(false);
            String string2 = this.f54075.getString(R.string.MT_Protector);
            if (this.f54087 == null) {
                C11579 c11579M39673 = C16800.m39673("\\A(" + C18415.m42926(string2) + MotionUtils.EASING_TYPE_FORMAT_END);
                c11579M39673.m29112(C3296.f10738);
                c11579M39673.m29111(c23255.m53954());
                this.f54087 = c11579M39673.m29110();
            }
            if (!this.f54093) {
                c23255.m53923(this.f54087);
            }
            this.f54093 = true;
            StringBuilder sbM27333 = C10732.m27333(string2);
            sbM27333.append(enumC24958M39556.f80817);
            c23255.mo52335((CharSequence) sbM27333.toString());
        } else {
            if (this.f54093) {
                c23255.m53923((C16800) null);
            }
            this.f54093 = false;
            c23255.setEnabled(true);
            if (enumC24958M39556.f80819) {
                c23255.mo52335((CharSequence) (this.f54083 + this.f54072 + enumC24958M39556.f80817));
            } else {
                c23255.mo52335((CharSequence) (this.f54083 + enumC24958M39556.f80817));
            }
            c23255.mo52316(0, this.f54083.length());
            c23255.requestFocus();
        }
        this.f54074 = enumC24958M39556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39553(int i, boolean z, boolean z2) {
        String str;
        String str2;
        boolean z3 = this.f54093;
        C23255 c23255 = this.f54076;
        if (z3) {
            c23255.m53923((C16800) null);
        }
        this.f54093 = false;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54083);
        EnumC24958 enumC24958 = EnumC24958.ZIP;
        this.f54074 = enumC24958;
        sb.append(enumC24958.f80817);
        c23255.mo52335((CharSequence) sb.toString());
        final boolean z4 = i == 1 && !z;
        if (!z4) {
            C1255 c1255 = this.f54094;
            c1255.setVisibility(0);
            c1255.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۙۢܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                    AbstractC16752.m39529(this.f16865);
                }
            });
        }
        int i2 = z2 ? 0 : 8;
        C1255 c1256 = this.f54080;
        c1256.setVisibility(i2);
        c1256.setChecked(ApplicationC17729.f58258.getBoolean("dcaw", false));
        boolean z5 = ApplicationC17729.f58258.getBoolean("dcds", false);
        C1255 c1257 = this.f54095;
        c1257.setChecked(z5);
        AbstractActivityC17204 abstractActivityC17204 = this.f54075;
        c1257.setText(abstractActivityC17204.getResources().getQuantityString(R.plurals.MT_Protector, i));
        C15260 c15260 = new C15260(this, this.f54075, this.f54081, z, i);
        Spinner spinner = this.f54098;
        spinner.setAdapter((SpinnerAdapter) c15260);
        C3054 c3054 = new C3054(abstractActivityC17204, Arrays.asList(abstractActivityC17204.getString(R.string.MT_Protector), "10 MB", "25 MB", "50 MB", "100 MB", abstractActivityC17204.getString(R.string.MT_Protector)));
        Spinner spinner2 = this.f54078;
        spinner2.setAdapter((SpinnerAdapter) c3054);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f54089.setEnabled(atomicBoolean.get());
        C13023 c13023 = new C13023(abstractActivityC17204, Arrays.asList("KB", "MB", "GB"), atomicBoolean);
        Spinner spinner3 = this.f54090;
        spinner3.setAdapter((SpinnerAdapter) c13023);
        spinner3.setSelection(1);
        spinner3.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩷ۢܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !atomicBoolean.get();
            }
        });
        spinner2.setOnItemSelectedListener(new C5566(this, atomicBoolean, c13023));
        C1837 c1837 = new C1837(this);
        if (z4 && ApplicationC17729.f58258.getBoolean("ccsa2", false)) {
            str = "ccf2";
            str2 = "ccl2";
        } else {
            str = "ccf";
            str2 = "ccl";
        }
        spinner.setOnItemSelectedListener(c1837);
        int i3 = ApplicationC17729.f58258.getInt(str, 0);
        int i4 = i3 >= this.f54081.length ? 0 : i3;
        spinner.setSelection(i4);
        c1837.onItemSelected(null, null, i4, 0L);
        int i5 = ApplicationC17729.f58258.getInt(str2, 3);
        ArrayList arrayList = this.f54086;
        if (arrayList.size() == this.f54092.length) {
            i5--;
        }
        int size = arrayList.size();
        this.f54073.setSelection(size == 0 ? 0 : Math.max(0, Math.min(i5, size - 1)));
        this.f54085.setChecked(ApplicationC17729.f58258.getBoolean("ccef", false));
        m39549();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f54091;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۢܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34230.mo39560();
            }
        });
        dialogInterfaceC8327.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩸ۢܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC16752.m39532(this.f73752, z4);
            }
        });
        C21576.m49090(c23255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39529(AbstractC16752 abstractC16752) {
        abstractC16752.m39549();
        SpinnerAdapter adapter = abstractC16752.f54098.getAdapter();
        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39532(AbstractC16752 abstractC16752, boolean z) {
        String[] strArr = abstractC16752.f54092;
        ArrayList arrayList = abstractC16752.f54086;
        Spinner spinner = abstractC16752.f54073;
        C1255 c1255 = abstractC16752.f54085;
        Spinner spinner2 = abstractC16752.f54098;
        ApplicationC17729.f58258.edit().putBoolean("dcaw", abstractC16752.f54080.isChecked()).putBoolean("dcds", abstractC16752.f54095.isChecked()).apply();
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        if (z && abstractC16752.m39556().f80819) {
            InterfaceC18752 interfaceC18752Mo3486 = interfaceC18752Edit.putBoolean("ccsa2", true).mo3486(spinner2.getSelectedItemPosition(), "ccf2");
            int selectedItemPosition = spinner.getSelectedItemPosition();
            if (arrayList.size() == strArr.length) {
                selectedItemPosition++;
            }
            interfaceC18752Mo3486.mo3486(selectedItemPosition, "ccl2").putBoolean("ccef", c1255.isChecked()).apply();
            return;
        }
        if (z) {
            interfaceC18752Edit.putBoolean("ccsa2", false);
        }
        InterfaceC18752 interfaceC18752Mo3487 = interfaceC18752Edit.mo3486(spinner2.getSelectedItemPosition(), "ccf");
        int selectedItemPosition2 = spinner.getSelectedItemPosition();
        if (arrayList.size() == strArr.length) {
            selectedItemPosition2++;
        }
        interfaceC18752Mo3487.mo3486(selectedItemPosition2, "ccl").putBoolean("ccef", c1255.isChecked()).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39552() {
        this.f54091.dismiss();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m39564() {
        return this.f54076.m54021().toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC24958 m39556() {
        return this.f54081[this.f54098.getSelectedItemPosition()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39551() {
        return this.f54073.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39559() {
        int selectedItemPosition = this.f54073.getSelectedItemPosition();
        if (selectedItemPosition == 0) {
            return 0;
        }
        if (selectedItemPosition == 1) {
            return 1;
        }
        if (selectedItemPosition == 2) {
            return 3;
        }
        if (selectedItemPosition == 3) {
            return 5;
        }
        if (selectedItemPosition == 4) {
            return 7;
        }
        if (selectedItemPosition == 5) {
            return 9;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m39565() {
        Spinner spinner = this.f54073;
        if (spinner.isEnabled()) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39557() {
        return this.f54094.isChecked();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m39566() {
        C1255 c1255 = this.f54080;
        return c1255.getVisibility() == 0 && c1255.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39533(int i, C25179 c25179) {
        int i2;
        boolean z;
        int i3 = 0;
        int i4 = -1;
        if (i != 0) {
            z = true;
            if (i != 1) {
                if (i == 2) {
                    i4 = 3;
                } else if (i == 4) {
                    i4 = 9;
                } else if (i == 5) {
                    i4 = 10;
                } else if (i == 6) {
                    c25179.m56130();
                    i2 = 8;
                }
                i3 = 8;
            } else {
                i3 = 8;
                i4 = 1;
            }
            i2 = i3;
            z = false;
        } else {
            i2 = i3;
            z = false;
        }
        c25179.m56121(i4);
        c25179.m56135(i2);
        return z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m39563() {
        return this.f54097.getVisibility() == 0 ? this.f54082.m54021().toString() : "";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m39555() {
        double d;
        C23255 c23255 = this.f54089;
        if (c23255.getVisibility() == 0) {
            int selectedItemPosition = this.f54078.getSelectedItemPosition();
            if (selectedItemPosition == 1) {
                return 10485760L;
            }
            if (selectedItemPosition == 2) {
                return 26214400L;
            }
            if (selectedItemPosition == 3) {
                return 52428800L;
            }
            if (selectedItemPosition == 4) {
                return 104857600L;
            }
            if (selectedItemPosition == 5) {
                String string = c23255.m54021().toString();
                if (string.isEmpty()) {
                    return -2L;
                }
                try {
                    double d2 = Double.parseDouble(string);
                    int selectedItemPosition2 = this.f54090.getSelectedItemPosition();
                    if (selectedItemPosition2 == 0) {
                        d = 1024.0d;
                    } else {
                        if (selectedItemPosition2 != 1) {
                            if (selectedItemPosition2 == 2) {
                                d = 1.073741824E9d;
                            }
                            return (long) d2;
                        }
                        d = 1048576.0d;
                    }
                    d2 *= d;
                    return (long) d2;
                } catch (NumberFormatException unused) {
                    return -1L;
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23255 m39558() {
        return this.f54089;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m39561() {
        C1255 c1255 = this.f54085;
        return c1255.getVisibility() == 0 && !m39563().isEmpty() && c1255.isChecked();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m39562() {
        return this.f54095.isChecked();
    }
}
