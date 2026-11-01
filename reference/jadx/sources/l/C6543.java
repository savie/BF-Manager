package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۜۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes2.dex */
public final class C6543 implements TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f22034 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f22035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f22036;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f22037;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9160 f22038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f22039;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f22040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f22041;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Spinner f22042;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Charset f22033 = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static Charset f22031 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static Charset f22032 = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Charset f22027 = Charset.forName("GBK");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f22030 = BigInteger.valueOf(C17492.FOREVER_NS);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f22029 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f22028 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6543(boolean z, C9160 c9160, TextView textView, Spinner spinner, CheckBox checkBox) {
        this.f22036 = z;
        this.f22038 = c9160;
        this.f22040 = textView;
        this.f22042 = spinner;
        this.f22037 = checkBox;
        spinner.setSelection(ApplicationC0716.f2992.getInt(z ? "hex_search_type" : "hex_replace_type", 0));
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean(z ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", false));
        m17777();
        c9160.m23506(this);
        spinner.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setEnabled(false);
        ViewOnClickListenerC22523.m50034(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17775() {
        C9160 c9160 = this.f22038;
        String string = c9160.m23513().toString();
        if (string.equals(this.f22035)) {
            return;
        }
        this.f22035 = string;
        c9160.m23519();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17777() {
        String string = this.f22038.m23513().toString();
        boolean zIsEmpty = string.isEmpty();
        byte[] bArr = null;
        int i = 0;
        TextView textView = this.f22040;
        if (zIsEmpty) {
            this.f22041 = null;
            this.f22039 = false;
            this.f22034 = true;
            textView.setTextColor(C20368.f66009);
            textView.setText(this.f22036 ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        this.f22034 = false;
        this.f22039 = false;
        switch (this.f22042.getSelectedItemPosition()) {
            case 0:
                String strReplaceAll = string.replaceAll("\\s+", "");
                int length = strReplaceAll.length();
                if (length % 2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strReplaceAll.substring(0, strReplaceAll.length() - 1));
                    sb.append("0");
                    strReplaceAll = C0242.m1616(strReplaceAll.length() - 1, strReplaceAll, sb);
                    length++;
                }
                byte[] bArr2 = new byte[length / 2];
                while (i < length) {
                    int i2 = i + 2;
                    try {
                        bArr2[i / 2] = (byte) Integer.parseInt(strReplaceAll.substring(i, i2), 16);
                        i = i2;
                    } catch (NumberFormatException unused) {
                    }
                }
                bArr = bArr2;
                if (bArr != null) {
                    this.f22041 = bArr;
                    m17778();
                    return;
                } else {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 1:
                this.f22041 = string.getBytes(f22033);
                break;
            case 2:
                this.f22041 = string.getBytes(f22032);
                break;
            case 3:
                this.f22041 = string.getBytes(f22031);
                break;
            case 4:
                this.f22041 = string.getBytes(f22027);
                break;
            case 5:
                try {
                    long j = Long.parseLong(string);
                    if (j < -128 || j > 127) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f22041 = new byte[]{(byte) (j & 255)};
                        m17778();
                    }
                    return;
                } catch (NumberFormatException unused2) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 6:
                try {
                    long j2 = Long.parseLong(string);
                    if (j2 < 0 || j2 > 255) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f22041 = new byte[]{(byte) (j2 & 255)};
                        m17778();
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 7:
                try {
                    long j3 = Long.parseLong(string);
                    if (j3 < -32768 || j3 > 32767) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(2, j3);
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 8:
                try {
                    long j4 = Long.parseLong(string);
                    if (j4 < 0 || j4 > 65535) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(2, j4);
                    }
                    return;
                } catch (NumberFormatException unused5) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 9:
                try {
                    long j5 = Long.parseLong(string);
                    if (j5 < -2147483648L || j5 > 2147483647L) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(4, j5);
                    }
                    return;
                } catch (NumberFormatException unused6) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 10:
                try {
                    long j6 = Long.parseLong(string);
                    if (j6 < 0 || j6 > 4294967295L) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(4, j6);
                    }
                    return;
                } catch (NumberFormatException unused7) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 11:
                try {
                    BigInteger bigInteger = new BigInteger(string);
                    if (bigInteger.compareTo(f22029) < 0 || bigInteger.compareTo(f22030) > 0) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(8, bigInteger.longValue());
                    }
                    return;
                } catch (NumberFormatException unused8) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 12:
                try {
                    BigInteger bigInteger2 = new BigInteger(string);
                    if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f22028) > 0) {
                        this.f22039 = true;
                        textView.setTextColor(C20368.f65966);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m17776(8, bigInteger2.longValue());
                    }
                    return;
                } catch (NumberFormatException unused9) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 13:
                try {
                    m17776(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                    return;
                } catch (NumberFormatException unused10) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 14:
                try {
                    m17776(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
                    return;
                } catch (NumberFormatException unused11) {
                    this.f22039 = true;
                    textView.setTextColor(C20368.f65966);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            default:
                return;
        }
        m17778();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17778() {
        int iMin = Math.min(this.f22041.length, 50);
        StringBuilder sb = new StringBuilder(iMin * 2);
        for (int i = 0; i < iMin; i++) {
            byte b = this.f22041[i];
            if (i != 0) {
                sb.append(' ');
            }
            sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (iMin < this.f22041.length) {
            sb.append("…");
        }
        int i2 = C20368.f65973;
        TextView textView = this.f22040;
        textView.setTextColor(i2);
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17776(int i, long j) {
        this.f22041 = new byte[i];
        if (this.f22037.isChecked()) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f22041[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f22041[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m17778();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m17777();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ApplicationC0716.f2992.edit().mo4065(i, this.f22036 ? "hex_search_type" : "hex_replace_type").apply();
        this.f22037.setEnabled(i > 4);
        m17777();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ApplicationC0716.f2992.edit().putBoolean(this.f22036 ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", z);
        m17777();
    }
}
