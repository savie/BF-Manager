package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23519 implements TextWatcher {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f76111 = {2, 4, 8, 16};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f76112 = {32, 40, 64, 8};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EditText f76113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11545 f76115;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f76116;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Main f76117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17168 f76118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f76120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10819[] f76119 = {new C10819(this, 0, "MD5", new C10113()), new C10819(this, 1, "SHA1", new C7290()), new C10819(this, 2, "SHA256", new C20696()), new C10819(this, 3, "CRC32", new C15758())};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f76114 = ApplicationC0716.f2992.getBoolean("fsuc", false);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51782(C11545 c11545, InterfaceC2557 interfaceC2557) {
        new C23519(c11545, interfaceC2557);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51792(final Button button, final C11545 c11545, final InterfaceC2557 interfaceC2557) {
        button.setOnClickListener(new ViewOnClickListenerC21401(0, c11545, interfaceC2557));
        button.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۡۛ᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C23519.m51781(button, c11545, interfaceC2557);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51781(Button button, C11545 c11545, InterfaceC2557 interfaceC2557) {
        Activity activityM22527 = C8703.m22527(button.getContext());
        C13638.requireNonNull(activityM22527);
        m51783((AbstractActivityC12483) activityM22527, new RunnableC7917(3, c11545, interfaceC2557));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51793(C11545 c11545, InterfaceC2557 interfaceC2557) {
        new C23519(c11545, interfaceC2557);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51783(AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        int i = 1;
        CharSequence[] charSequenceArr = {"MD5", "SHA1", "SHA256", "CRC32"};
        int i2 = ApplicationC0716.f2992.getInt("fsf", 0);
        final boolean[] zArr = new boolean[4];
        for (int i3 = 0; i3 < 4; i3++) {
            zArr[i3] = (f76111[i3] & i2) == 0;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21268(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.֡ۛ᩹
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                zArr[i4] = z;
            }
        });
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new ViewOnClickListenerC0661(zArr, dialogInterfaceC19356M10334, runnable, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51786(boolean[] zArr, DialogInterfaceC19356 dialogInterfaceC19356, Runnable runnable) {
        int i = 1;
        if (!zArr[0] && !zArr[1] && !zArr[2] && !zArr[3]) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (zArr.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (!zArr[i2]) {
                    i = f76111[i2] | i;
                }
            }
            ApplicationC0716.f2992.edit().mo4065(i, "fsf").apply();
            dialogInterfaceC19356.dismiss();
            runnable.run();
            return;
        }
        throw new IllegalArgumentException("Unexpected checksum item count");
    }

    public C23519(C11545 c11545, InterfaceC2557 interfaceC2557) {
        this.f76117 = c11545.m28824();
        this.f76115 = c11545;
        this.f76116 = interfaceC2557;
        C17168 c17168 = new C17168(ApplicationC0716.f2992.getInt("fsf", 0));
        this.f76118 = c17168;
        RunnableC19991 runnableC19991 = new RunnableC19991(0, this);
        int[] iArrM40087 = c17168.m40087();
        if (iArrM40087.length == 0) {
            runnableC19991.run();
        } else {
            new C12230(this, iArrM40087, runnableC19991).m10243();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51784(final C23519 c23519) {
        Main main = c23519.f76117;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        editText.setText(c23519.f76116.getName());
        editText.setKeyListener(null);
        C10819[] c10819Arr = c23519.f76119;
        c10819Arr[0].m27123(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM30995);
        c10819Arr[1].m27123(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM30995);
        c10819Arr[2].m27123(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM30995);
        c10819Arr[3].m27123(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM30995);
        c23519.f76113 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        c23519.f76120 = (TextView) viewM30995.findViewById(R.id.textView1);
        c23519.f76113.addTextChangedListener(c23519);
        int i = 0;
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC17873(i, c23519));
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC18579(i, c23519));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM44361 = c8067BuildDialog.m21269().m44361();
        ViewGroup viewGroup = (ViewGroup) buttonM44361.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM44361);
        CheckBox checkBox = (CheckBox) main.m30995(R.layout.MT_Protector);
        checkBox.setText(R.string.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setChecked(c23519.f76114);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ۛ᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C23519.m51785(this.f26233, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51788(C23519 c23519) {
        String strM39296 = C16737.m39296();
        if (strM39296 != null) {
            String strReplaceAll = strM39296.replaceAll("[\\s:]", "");
            String[] strArr = {"sha256", "sha1", "md5", "crc32", "sha256sum", "sha1sum", "md5sum", "crc32sum"};
            if (strReplaceAll.indexOf(58) != -1) {
                String lowerCase = strReplaceAll.toLowerCase();
                for (int i = 0; i < 8; i++) {
                    String str = strArr[i];
                    if (lowerCase.startsWith(str)) {
                        strReplaceAll = strReplaceAll.substring(str.length());
                        break;
                    }
                }
            }
            c23519.f76113.setText(c23519.f76114 ? strReplaceAll.toUpperCase() : strReplaceAll.toLowerCase());
            c23519.f76113.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51785(C23519 c23519, boolean z) {
        c23519.f76114 = z;
        C1679.m5597(ApplicationC0716.f2992, "fsuc", z);
        for (C10819 c10819 : c23519.f76119) {
            if (c23519.f76118.m40088(c10819.f36846)) {
                EditText editText = c10819.f36841;
                String string = editText.getText().toString();
                editText.setText(c23519.f76114 ? string.toUpperCase() : string.toLowerCase());
            }
        }
        String string2 = c23519.f76113.getText().toString();
        c23519.f76113.setText(c23519.f76114 ? string2.toUpperCase() : string2.toLowerCase());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m51779(C23519 c23519) {
        int i = ApplicationC0716.f2992.getInt("fsf", 0);
        C17168 c17168 = c23519.f76118;
        c17168.m40085(i);
        for (C10819 c10819 : c23519.f76119) {
            c10819.m27122();
        }
        c23519.afterTextChanged(c23519.f76113.getText());
        RunnableC7448 runnableC7448 = new RunnableC7448(3, c23519);
        int[] iArrM40087 = c17168.m40087();
        if (iArrM40087.length == 0) {
            runnableC7448.run();
        } else {
            new C12230(c23519, iArrM40087, runnableC7448).m10243();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51794(C23519 c23519) {
        for (C10819 c10819 : c23519.f76119) {
            c10819.m27122();
        }
        c23519.afterTextChanged(c23519.f76113.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strTrim = editable.toString().trim();
        if (!strTrim.isEmpty()) {
            C10819[] c10819Arr = this.f76119;
            int length = c10819Arr.length;
            int i = 0;
            while (true) {
                int[] iArr = f76112;
                C17168 c17168 = this.f76118;
                if (i < length) {
                    C10819 c10819 = c10819Arr[i];
                    int length2 = strTrim.length();
                    int i2 = c10819.f36846;
                    String str = c10819.f36845;
                    if (length2 == iArr[i2]) {
                        String strM40089 = c17168.m40089(i2);
                        if (!c17168.m40088(c10819.f36846) || strM40089 == null) {
                            this.f76120.setText(str.concat(" ?"));
                            this.f76120.setTextColor(C20368.f65966);
                            return;
                        } else if (strTrim.equalsIgnoreCase(strM40089)) {
                            this.f76120.setText(str.concat(" √"));
                            this.f76120.setTextColor(C20368.f65973);
                            return;
                        } else {
                            this.f76120.setText(str.concat(" ×"));
                            this.f76120.setTextColor(C20368.f65966);
                            return;
                        }
                    }
                    i++;
                } else {
                    if (strTrim.length() > 8) {
                        for (C10819 c108110 : c10819Arr) {
                            int i3 = c108110.f36846;
                            String strM400810 = c17168.m40089(i3);
                            if (c17168.m40088(i3) && strM400810 != null && strTrim.length() < iArr[i3] && C6851.m18466(strTrim, strM400810)) {
                                this.f76120.setText(c108110.f36845.concat(" ≈"));
                                this.f76120.setTextColor(C20368.f65973);
                                return;
                            }
                        }
                    }
                    this.f76120.setText("?");
                    this.f76120.setTextColor(C20368.f65970);
                    return;
                }
            }
        } else {
            this.f76120.setText((CharSequence) null);
        }
    }
}
