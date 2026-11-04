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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19363 implements TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f62544;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f62545;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f62546;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Spinner f62547;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f62548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17771 f62549;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f62550 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f62551;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f62552;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Charset f62537 = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static Charset f62541 = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static Charset f62543 = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Charset f62540 = Charset.forName("GBK");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f62539 = BigInteger.valueOf(C25227.FOREVER_NS);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f62538 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final BigInteger f62542 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C19363(boolean z, C17771 c17771, TextView textView, Spinner spinner, CheckBox checkBox) {
        this.f62545 = z;
        this.f62549 = c17771;
        this.f62551 = textView;
        this.f62547 = spinner;
        this.f62546 = checkBox;
        spinner.setSelection(ApplicationC17729.f58258.getInt(z ? "hex_search_type" : "hex_replace_type", 0));
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean(z ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", false));
        m44779();
        c17771.m41593(this);
        spinner.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setEnabled(false);
        ViewOnClickListenerC15284.m36686(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44777() {
        C17771 c17771 = this.f62549;
        String string = c17771.m41599().toString();
        if (string.equals(this.f62548)) {
            return;
        }
        this.f62548 = string;
        c17771.m41603();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m44779() {
        String string = this.f62549.m41599().toString();
        boolean zIsEmpty = string.isEmpty();
        byte[] bArr = null;
        int i = 0;
        TextView textView = this.f62551;
        if (zIsEmpty) {
            this.f62552 = null;
            this.f62544 = false;
            this.f62550 = true;
            textView.setTextColor(C3296.f10779);
            textView.setText(this.f62545 ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        this.f62550 = false;
        this.f62544 = false;
        switch (this.f62547.getSelectedItemPosition()) {
            case 0:
                String strReplaceAll = string.replaceAll("\\s+", "");
                int length = strReplaceAll.length();
                if (length % 2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strReplaceAll.substring(0, strReplaceAll.length() - 1));
                    sb.append("0");
                    strReplaceAll = ExternalValue$$ExternalSyntheticOutline0.m(strReplaceAll.length() - 1, strReplaceAll, sb);
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
                    this.f62552 = bArr;
                    m44780();
                    return;
                } else {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 1:
                this.f62552 = string.getBytes(f62537);
                break;
            case 2:
                this.f62552 = string.getBytes(f62543);
                break;
            case 3:
                this.f62552 = string.getBytes(f62541);
                break;
            case 4:
                this.f62552 = string.getBytes(f62540);
                break;
            case 5:
                try {
                    long j = Long.parseLong(string);
                    if (j < -128 || j > 127) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f62552 = new byte[]{(byte) (j & 255)};
                        m44780();
                    }
                    return;
                } catch (NumberFormatException unused2) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 6:
                try {
                    long j2 = Long.parseLong(string);
                    if (j2 < 0 || j2 > 255) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        this.f62552 = new byte[]{(byte) (j2 & 255)};
                        m44780();
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 7:
                try {
                    long j3 = Long.parseLong(string);
                    if (j3 < -32768 || j3 > 32767) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(2, j3);
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 8:
                try {
                    long j4 = Long.parseLong(string);
                    if (j4 < 0 || j4 > 65535) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(2, j4);
                    }
                    return;
                } catch (NumberFormatException unused5) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 9:
                try {
                    long j5 = Long.parseLong(string);
                    if (j5 < -2147483648L || j5 > 2147483647L) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(4, j5);
                    }
                    return;
                } catch (NumberFormatException unused6) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 10:
                try {
                    long j6 = Long.parseLong(string);
                    if (j6 < 0 || j6 > 4294967295L) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(4, j6);
                    }
                    return;
                } catch (NumberFormatException unused7) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 11:
                try {
                    BigInteger bigInteger = new BigInteger(string);
                    if (bigInteger.compareTo(f62538) < 0 || bigInteger.compareTo(f62539) > 0) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(8, bigInteger.longValue());
                    }
                    return;
                } catch (NumberFormatException unused8) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 12:
                try {
                    BigInteger bigInteger2 = new BigInteger(string);
                    if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f62542) > 0) {
                        this.f62544 = true;
                        textView.setTextColor(C3296.f10774);
                        textView.setText(R.string.MT_Protector);
                    } else {
                        m44778(8, bigInteger2.longValue());
                    }
                    return;
                } catch (NumberFormatException unused9) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 13:
                try {
                    m44778(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                    return;
                } catch (NumberFormatException unused10) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            case 14:
                try {
                    m44778(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
                    return;
                } catch (NumberFormatException unused11) {
                    this.f62544 = true;
                    textView.setTextColor(C3296.f10774);
                    textView.setText(R.string.MT_Protector);
                    return;
                }
            default:
                return;
        }
        m44780();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44780() {
        int iMin = Math.min(this.f62552.length, 50);
        StringBuilder sb = new StringBuilder(iMin * 2);
        for (int i = 0; i < iMin; i++) {
            byte b = this.f62552[i];
            if (i != 0) {
                sb.append(' ');
            }
            sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (iMin < this.f62552.length) {
            sb.append("…");
        }
        int i2 = C3296.f10768;
        TextView textView = this.f62551;
        textView.setTextColor(i2);
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44778(int i, long j) {
        this.f62552 = new byte[i];
        if (this.f62546.isChecked()) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f62552[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f62552[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m44780();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m44779();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ApplicationC17729.f58258.edit().mo3486(i, this.f62545 ? "hex_search_type" : "hex_replace_type").apply();
        this.f62546.setEnabled(i > 4);
        m44779();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ApplicationC17729.f58258.edit().putBoolean(this.f62545 ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", z);
        m44779();
    }
}
