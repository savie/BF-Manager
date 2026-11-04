package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10060 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0366 f32252;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8614 f32253;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f32254;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Main f32256;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23255 f32257;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f32259;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int[] f32250 = {2, 4, 8, 16};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f32249 = {32, 40, 64, 8};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f32251 = {"md5", "sha1", "sha256", "crc32", "md5sum", "sha1sum", "sha256sum", "crc32sum"};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19011[] f32258 = {new C19011(this, 0, "MD5", new C20503(0)), new C19011(this, 1, "SHA1", new C12298(0)), new C19011(this, 2, "SHA256", new C6333(0)), new C19011(this, 3, "CRC32", new C24233(0))};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f32255 = ApplicationC17729.f58258.getBoolean("fsuc", false);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25998(C8614 c8614, InterfaceC2386 interfaceC2386) {
        new C10060(c8614, interfaceC2386);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26010(final Button button, final C8614 c8614, final InterfaceC2386 interfaceC2386) {
        button.setOnClickListener(new ViewOnClickListenerC17519(c8614, interfaceC2386));
        button.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۗۤ۫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C10060.m25997(button, c8614, interfaceC2386);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25997(Button button, C8614 c8614, InterfaceC2386 interfaceC2386) {
        Activity activityM10534 = C3200.m10534(button.getContext());
        C17359.requireNonNull(activityM10534);
        m26001((AbstractActivityC17204) activityM10534, new RunnableC16313(4, c8614, interfaceC2386));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26011(C8614 c8614, InterfaceC2386 interfaceC2386) {
        new C10060(c8614, interfaceC2386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26001(AbstractActivityC17204 abstractActivityC17204, final Runnable runnable) {
        CharSequence[] charSequenceArr = {"MD5", "SHA1", "SHA256", "CRC32"};
        int i = ApplicationC17729.f58258.getInt("fsf", 0);
        final boolean[] zArr = new boolean[4];
        for (int i2 = 0; i2 < 4; i2++) {
            zArr[i2] = (f32250[i2] & i) == 0;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8015(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ۘۤ۫
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                zArr[i3] = z;
            }
        });
        final DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۤ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10060.m26002(zArr, dialogInterfaceC8327M34866, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26002(boolean[] zArr, DialogInterfaceC8327 dialogInterfaceC8327, Runnable runnable) {
        int i = 1;
        if (!zArr[0] && !zArr[1] && !zArr[2] && !zArr[3]) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (zArr.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (!zArr[i2]) {
                    i = f32250[i2] | i;
                }
            }
            ApplicationC17729.f58258.edit().mo3486(i, "fsf").apply();
            dialogInterfaceC8327.dismiss();
            runnable.run();
            return;
        }
        throw new IllegalArgumentException("Unexpected checksum item count");
    }

    public C10060(C8614 c8614, InterfaceC2386 interfaceC2386) {
        this.f32256 = c8614.m23233();
        this.f32253 = c8614;
        this.f32254 = interfaceC2386;
        C0366 c0366 = new C0366(ApplicationC17729.f58258.getInt("fsf", 0));
        this.f32252 = c0366;
        RunnableC8518 runnableC8518 = new RunnableC8518(2, this);
        int[] iArrM2140 = c0366.m2140();
        if (iArrM2140.length == 0) {
            runnableC8518.run();
        } else {
            new C18265(this, iArrM2140, runnableC8518).m8197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25999(final C10060 c10060) {
        Main main = c10060.f32256;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c23255.m52312();
        c23255.mo52335((CharSequence) c10060.f32254.getName());
        c23255.m54107(true);
        C19011[] c19011Arr = c10060.f32258;
        c19011Arr[0].m44099(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM40395);
        c19011Arr[1].m44099(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM40395);
        c19011Arr[2].m44099(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM40395);
        c19011Arr[3].m44099(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM40395);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c10060.f32257 = c23256;
        c23256.m52312();
        c10060.f32257.m52304(new InputFilter[]{new InputFilter() { // from class: l.ܶۤ۫
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return C10060.m25996(this.f51988, charSequence, i, i2);
            }
        }, new InputFilter.LengthFilter(64)});
        c10060.f32259 = (TextView) viewM40395.findViewById(R.id.textView1);
        c10060.f32257.m53899(c10060);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC21993(2, c10060));
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC3673(3, c10060));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM22440 = c2361BuildDialog.m8016().m22440();
        ViewGroup viewGroup = (ViewGroup) buttonM22440.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM22440);
        CheckBox checkBox = (CheckBox) main.m40395(R.layout.MT_Protector);
        checkBox.setText(R.string.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setChecked(c10060.f32255);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩹ۤ۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C10060.m26000(this.f75948, z);
            }
        });
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26009(C10060 c10060) {
        String strM49080 = C21576.m49080();
        if (strM49080 != null) {
            c10060.f32257.mo52335((CharSequence) strM49080);
            c10060.f32257.mo52339(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26000(C10060 c10060, boolean z) {
        c10060.f32255 = z;
        C6421.m18184(ApplicationC17729.f58258, "fsuc", z);
        for (C19011 c19011 : c10060.f32258) {
            if (c10060.f32252.m2141(c19011.f61578)) {
                C23255 c23255 = c19011.f61581;
                String string = c23255.m54021().toString();
                c23255.mo52335((CharSequence) (c10060.f32255 ? string.toUpperCase() : string.toLowerCase()));
            }
        }
        String string2 = c10060.f32257.m54021().toString();
        c10060.f32257.mo52335((CharSequence) (c10060.f32255 ? string2.toUpperCase() : string2.toLowerCase()));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannableString m25996(C10060 c10060, CharSequence charSequence, int i, int i2) {
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        boolean z = charSequence instanceof Spanned;
        if (z) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(i, i2, Object.class)) {
                int spanFlags = spanned.getSpanFlags(obj);
                if ((spanFlags & 256) != 0) {
                    spannableStringBuilder.setSpan(obj, Math.max(i, spanned.getSpanStart(obj)) - i, Math.min(i2, spanned.getSpanEnd(obj)) - i, spanFlags);
                }
            }
        }
        boolean z2 = false;
        for (int length = spannableStringBuilder.length() - 1; length >= 0; length--) {
            char cCharAt = spannableStringBuilder.charAt(length);
            if (cCharAt == ' ' || (cCharAt >= '\t' && cCharAt <= '\r')) {
                spannableStringBuilder.delete(length, length + 1);
                z2 = true;
            }
        }
        int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, ':', 0, Math.min(spannableStringBuilder.length(), 10));
        if (iIndexOf > 0) {
            String string = spannableStringBuilder.subSequence(0, iIndexOf).toString();
            for (int i4 = 0; i4 < 8; i4++) {
                if (f32251[i4].equalsIgnoreCase(string)) {
                    spannableStringBuilder.delete(0, iIndexOf + 1);
                    z2 = true;
                    break;
                }
            }
        }
        for (int length2 = spannableStringBuilder.length() - 1; length2 >= 0; length2--) {
            char cCharAt2 = spannableStringBuilder.charAt(length2);
            if (cCharAt2 == ':') {
                spannableStringBuilder.delete(length2, length2 + 1);
            } else {
                boolean z3 = c10060.f32255;
                if (z3) {
                    if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                        int i5 = length2 + 1;
                        if (z3) {
                            i3 = cCharAt2 - ' ';
                        } else {
                            i3 = cCharAt2 + ' ';
                        }
                        spannableStringBuilder.replace(length2, i5, (CharSequence) String.valueOf((char) i3));
                    }
                } else if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    int i6 = length2 + 1;
                    if (z3) {
                        i3 = cCharAt2 - ' ';
                    } else {
                        i3 = cCharAt2 + ' ';
                    }
                    spannableStringBuilder.replace(length2, i6, (CharSequence) String.valueOf((char) i3));
                }
            }
            z2 = true;
        }
        if (z2 || z) {
            return new SpannableString(spannableStringBuilder);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26012(C10060 c10060) {
        int i = ApplicationC17729.f58258.getInt("fsf", 0);
        C0366 c0366 = c10060.f32252;
        c0366.m2138(i);
        for (C19011 c19011 : c10060.f32258) {
            c19011.m44098();
        }
        c10060.afterTextChanged(c10060.f32257.m54021());
        RunnableC5458 runnableC5458 = new RunnableC5458(5, c10060);
        int[] iArrM2140 = c0366.m2140();
        if (iArrM2140.length == 0) {
            runnableC5458.run();
        } else {
            new C18265(c10060, iArrM2140, runnableC5458).m8197();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26014(C10060 c10060) {
        for (C19011 c19011 : c10060.f32258) {
            c19011.m44098();
        }
        c10060.afterTextChanged(c10060.f32257.m54021());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strTrim = editable.toString().trim();
        if (!strTrim.isEmpty()) {
            C19011[] c19011Arr = this.f32258;
            int length = c19011Arr.length;
            int i = 0;
            while (true) {
                int[] iArr = f32249;
                C0366 c0366 = this.f32252;
                if (i < length) {
                    C19011 c19011 = c19011Arr[i];
                    int length2 = strTrim.length();
                    int i2 = c19011.f61578;
                    String str = c19011.f61580;
                    if (length2 == iArr[i2]) {
                        String strM2142 = c0366.m2142(i2);
                        if (!c0366.m2141(c19011.f61578) || strM2142 == null) {
                            this.f32259.setText(str.concat(" ?"));
                            this.f32259.setTextColor(C3296.f10774);
                            return;
                        } else if (strTrim.equalsIgnoreCase(strM2142)) {
                            this.f32259.setText(str.concat(" √"));
                            this.f32259.setTextColor(C3296.f10768);
                            return;
                        } else {
                            this.f32259.setText(str.concat(" ×"));
                            this.f32259.setTextColor(C3296.f10774);
                            return;
                        }
                    }
                    i++;
                } else {
                    if (strTrim.length() > 8) {
                        for (C19011 c19012 : c19011Arr) {
                            int i3 = c19012.f61578;
                            String strM2143 = c0366.m2142(i3);
                            if (c0366.m2141(i3) && strM2143 != null && strTrim.length() < iArr[i3]) {
                                int i4 = C24276.f78588;
                                if (AbstractC21292.f67895.m48533(strTrim, strM2143)) {
                                    this.f32259.setText(c19012.f61580.concat(" ≈"));
                                    this.f32259.setTextColor(C3296.f10768);
                                    return;
                                }
                            }
                        }
                    }
                    this.f32259.setText("?");
                    this.f32259.setTextColor(C3296.f10738);
                    return;
                }
            }
        } else {
            this.f32259.setText((CharSequence) null);
        }
    }
}
