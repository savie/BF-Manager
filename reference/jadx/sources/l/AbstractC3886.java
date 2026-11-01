package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3886 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Spinner f14515;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f14516;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12562 f14517;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f14518;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f14519;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f14520;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC13060[] f14521 = {EnumC13060.ZIP, EnumC13060.SEVEN_ZIP, EnumC13060.TAR, EnumC13060.TAR_GZIP, EnumC13060.TAR_XZ, EnumC13060.TAR_ZSTD, EnumC13060.TAR_BZIP2, EnumC13060.TAR_LZ4, EnumC13060.GZIP, EnumC13060.XZ, EnumC13060.ZSTD, EnumC13060.BZIP2, EnumC13060.LZ4};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC13060 f14522;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String[] f14523;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public TextView f14524;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextInputLayout f14525;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12562 f14526;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String[] f14527;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EditText f14528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12562 f14529;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0733 f14530;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EditText f14531;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Spinner f14532;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f14533;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Spinner f14534;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public EditText f14535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f14536;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String[] f14537;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f14538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12562 f14539;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Spinner f14540;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract void mo11295();

    public AbstractC3886(AbstractActivityC12483 abstractActivityC12483) {
        ArrayList arrayList = new ArrayList();
        this.f14538 = arrayList;
        this.f14519 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.setKeepScreenOn(true);
        this.f14528 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        this.f14540 = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f14533 = (TextView) viewM30995.findViewById(R.id.textView3);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner2);
        this.f14534 = spinner;
        this.f14524 = (TextView) viewM30995.findViewById(R.id.textView4);
        TextInputLayout textInputLayout = (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector);
        this.f14525 = textInputLayout;
        EditText editText = (EditText) viewM30995.findViewById(R.id.editText2);
        this.f14535 = editText;
        this.f14536 = (TextView) viewM30995.findViewById(R.id.textView5);
        this.f14531 = (EditText) viewM30995.findViewById(R.id.editText3);
        this.f14515 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
        this.f14532 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
        this.f14539 = (C12562) viewM30995.findViewById(R.id.switch1);
        this.f14517 = (C12562) viewM30995.findViewById(R.id.switch2);
        this.f14529 = (C12562) viewM30995.findViewById(R.id.switch3);
        this.f14526 = (C12562) viewM30995.findViewById(R.id.switch4);
        String[] stringArray = abstractActivityC12483.getResources().getStringArray(R.array.MT_Protector);
        this.f14527 = stringArray;
        this.f14537 = (String[]) Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.f14523 = (String[]) Arrays.copyOfRange(stringArray, 1, stringArray.length - 1);
        Collections.addAll(arrayList, stringArray);
        C0733 c0733 = new C0733(abstractActivityC12483, arrayList);
        this.f14530 = c0733;
        spinner.setAdapter((SpinnerAdapter) c0733);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21276(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        this.f14520 = dialogInterfaceC19356M21269;
        C8875.m23019(dialogInterfaceC19356M21269);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC5526(this, abstractActivityC12483));
        editText.addTextChangedListener(new C13766(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11264(AbstractC3886 abstractC3886, AbstractActivityC12483 abstractActivityC12483) {
        List listM27972 = C11088.m27972();
        if (listM27972.isEmpty()) {
            abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC12499.class));
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C9030.stream(listM27972).map(new C12740(1)).toArray(new C4592());
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21267(charSequenceArr, new DialogInterfaceOnClickListenerC12728(1, abstractC3886, listM27972));
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20268(2, abstractActivityC12483));
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11263(AbstractC3886 abstractC3886, List list, int i) {
        abstractC3886.f14535.setText(((C6148) list.get(i)).f21002);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11288(String str, String str2) {
        this.f14516 = str;
        this.f14518 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m11278() {
        String str;
        EditText editText = this.f14528;
        Editable text = editText.getText();
        boolean z = ((ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class)).length > 0;
        String string = text.toString();
        if (!z) {
            EnumC13060 enumC13060 = this.f14522;
            if (enumC13060.f43541) {
                str = this.f14518.toLowerCase() + this.f14522.f43543;
            } else {
                str = enumC13060.f43543;
            }
            if (string.toLowerCase().endsWith(str)) {
                this.f14516 = string.substring(0, string.length() - str.length());
            }
        }
        EnumC13060 enumC13060M11291 = m11291();
        C12562 c12562 = this.f14529;
        if (c12562.getVisibility() == 0 && c12562.isChecked()) {
            editText.setEnabled(false);
            SpannableString spannableString = new SpannableString(C16737.m39288(R.string.MT_Protector) + enumC13060M11291.f43543);
            spannableString.setSpan(new ForegroundColorSpan(C20368.f65970), 0, spannableString.length() - enumC13060M11291.f43543.length(), 17);
            editText.setText(spannableString);
        } else {
            editText.setEnabled(true);
            if (enumC13060M11291.f43541) {
                editText.setText(this.f14516 + this.f14518 + enumC13060M11291.f43543);
            } else {
                editText.setText(this.f14516 + enumC13060M11291.f43543);
            }
            editText.setSelection(0, this.f14516.length());
            editText.requestFocus();
        }
        this.f14522 = enumC13060M11291;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11287(int i, boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14516);
        EnumC13060 enumC13060 = EnumC13060.ZIP;
        this.f14522 = enumC13060;
        sb.append(enumC13060.f43543);
        String string = sb.toString();
        EditText editText = this.f14528;
        editText.setText(string);
        final boolean z3 = i == 1 && !z;
        if (!z3) {
            C12562 c12562 = this.f14529;
            c12562.setVisibility(0);
            c12562.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܳۡ᩹
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    AbstractC3886.m11262(this.f47310);
                }
            });
        }
        int i2 = z2 ? 0 : 8;
        C12562 c12563 = this.f14526;
        c12563.setVisibility(i2);
        c12563.setChecked(ApplicationC0716.f2992.getBoolean("dcaw", false));
        boolean z4 = ApplicationC0716.f2992.getBoolean("dcds", false);
        C12562 c12564 = this.f14517;
        c12564.setChecked(z4);
        AbstractActivityC12483 abstractActivityC12483 = this.f14519;
        c12564.setText(abstractActivityC12483.getResources().getQuantityString(R.plurals.MT_Protector, i));
        C11649 c11649 = new C11649(this, this.f14519, this.f14521, z, i);
        Spinner spinner = this.f14540;
        spinner.setAdapter((SpinnerAdapter) c11649);
        C0733 c0733 = new C0733(abstractActivityC12483, Arrays.asList(abstractActivityC12483.getString(R.string.MT_Protector), "10 MB", "25 MB", "50 MB", "100 MB", abstractActivityC12483.getString(R.string.MT_Protector)));
        Spinner spinner2 = this.f14515;
        spinner2.setAdapter((SpinnerAdapter) c0733);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f14531.setEnabled(atomicBoolean.get());
        C2475 c2475 = new C2475(abstractActivityC12483, Arrays.asList("KB", "MB", "GB"), atomicBoolean);
        Spinner spinner3 = this.f14532;
        spinner3.setAdapter((SpinnerAdapter) c2475);
        spinner3.setSelection(1);
        spinner3.setOnTouchListener(new View.OnTouchListener() { // from class: l.֫ۡ᩹
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !atomicBoolean.get();
            }
        });
        spinner2.setOnItemSelectedListener(new C5298(this, atomicBoolean, c2475));
        C22232 c22232 = new C22232(this);
        if (z3 && ApplicationC0716.f2992.getBoolean("ccsa2", false)) {
            str = "ccf2";
            str2 = "ccl2";
        } else {
            str = "ccf";
            str2 = "ccl";
        }
        spinner.setOnItemSelectedListener(c22232);
        int i3 = ApplicationC0716.f2992.getInt(str, 0);
        int i4 = i3 >= this.f14521.length ? 0 : i3;
        spinner.setSelection(i4);
        c22232.onItemSelected(null, null, i4, 0L);
        int i5 = ApplicationC0716.f2992.getInt(str2, 3);
        ArrayList arrayList = this.f14538;
        if (arrayList.size() == this.f14523.length) {
            i5--;
        }
        int size = arrayList.size();
        this.f14534.setSelection(size == 0 ? 0 : Math.max(0, Math.min(i5, size - 1)));
        this.f14539.setChecked(ApplicationC0716.f2992.getBoolean("ccef", false));
        m11278();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f14520;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۢۡ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32107.mo11295();
            }
        });
        dialogInterfaceC19356.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۗۡ᩹
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC3886.m11265(this.f11844, z3);
            }
        });
        C16737.m39290(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11262(AbstractC3886 abstractC3886) {
        abstractC3886.m11278();
        SpinnerAdapter adapter = abstractC3886.f14540.getAdapter();
        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11265(AbstractC3886 abstractC3886, boolean z) {
        String[] strArr = abstractC3886.f14523;
        ArrayList arrayList = abstractC3886.f14538;
        Spinner spinner = abstractC3886.f14534;
        C12562 c12562 = abstractC3886.f14539;
        Spinner spinner2 = abstractC3886.f14540;
        ApplicationC0716.f2992.edit().putBoolean("dcaw", abstractC3886.f14526.isChecked()).putBoolean("dcds", abstractC3886.f14517.isChecked()).apply();
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        if (z && abstractC3886.m11291().f43541) {
            InterfaceC17314 interfaceC17314Mo4065 = interfaceC17314Edit.putBoolean("ccsa2", true).mo4065(spinner2.getSelectedItemPosition(), "ccf2");
            int selectedItemPosition = spinner.getSelectedItemPosition();
            if (arrayList.size() == strArr.length) {
                selectedItemPosition++;
            }
            interfaceC17314Mo4065.mo4065(selectedItemPosition, "ccl2").putBoolean("ccef", c12562.isChecked()).apply();
            return;
        }
        if (z) {
            interfaceC17314Edit.putBoolean("ccsa2", false);
        }
        InterfaceC17314 interfaceC17314Mo4066 = interfaceC17314Edit.mo4065(spinner2.getSelectedItemPosition(), "ccf");
        int selectedItemPosition2 = spinner.getSelectedItemPosition();
        if (arrayList.size() == strArr.length) {
            selectedItemPosition2++;
        }
        interfaceC17314Mo4066.mo4065(selectedItemPosition2, "ccl").putBoolean("ccef", c12562.isChecked()).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11286() {
        this.f14520.dismiss();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m11293() {
        return this.f14528.getText().toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC13060 m11291() {
        return this.f14521[this.f14540.getSelectedItemPosition()];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m11285() {
        return this.f14534.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m11297() {
        int selectedItemPosition = this.f14534.getSelectedItemPosition();
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11284() {
        Spinner spinner = this.f14534;
        if (spinner.isEnabled()) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m11290() {
        return this.f14529.isChecked();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m11298() {
        C12562 c12562 = this.f14526;
        return c12562.getVisibility() == 0 && c12562.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11266(int i, C22918 c22918) {
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
                    c22918.m50718();
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
        c22918.m50722(i4);
        c22918.m50733(i2);
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m11289() {
        return this.f14525.getVisibility() == 0 ? this.f14535.getText().toString() : "";
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m11292() {
        double d;
        EditText editText = this.f14531;
        if (editText.getVisibility() == 0) {
            int selectedItemPosition = this.f14515.getSelectedItemPosition();
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
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    return -2L;
                }
                try {
                    double d2 = Double.parseDouble(string);
                    int selectedItemPosition2 = this.f14532.getSelectedItemPosition();
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EditText m11283() {
        return this.f14531;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m11294() {
        C12562 c12562 = this.f14539;
        return c12562.getVisibility() == 0 && !m11289().isEmpty() && c12562.isChecked();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m11296() {
        return this.f14517.isChecked();
    }
}
