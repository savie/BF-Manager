package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩶ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20082 implements TextWatcher {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f65240 = BigInteger.valueOf(C17492.FOREVER_NS);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f65241 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final BigInteger f65242 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65243 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f65244;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f65245;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EditText f65246;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f65247;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f65248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f65249;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20082(EditText editText, TextView textView, int i, boolean z) {
        this.f65246 = editText;
        this.f65244 = textView;
        this.f65248 = i;
        this.f65245 = z;
        m45454();
        editText.addTextChangedListener(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45454() {
        String string = this.f65246.getText().toString();
        boolean zIsEmpty = string.isEmpty();
        TextView textView = this.f65244;
        if (zIsEmpty) {
            this.f65249 = null;
            this.f65247 = false;
            this.f65243 = true;
            textView.setText(R.string.MT_Protector);
            return;
        }
        this.f65243 = false;
        this.f65247 = false;
        int i = this.f65248;
        if (i == R.id.MT_Protector) {
            try {
                long j = Long.parseLong(string);
                if (j < -128 || j > 127) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f65249 = new byte[]{(byte) (j & 255)};
                    m45452();
                }
                return;
            } catch (NumberFormatException unused) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j2 = Long.parseLong(string);
                if (j2 < 0 || j2 > 255) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f65249 = new byte[]{(byte) (j2 & 255)};
                    m45452();
                }
                return;
            } catch (NumberFormatException unused2) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j3 = Long.parseLong(string);
                if (j3 < -32768 || j3 > 32767) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(2, j3);
                }
                return;
            } catch (NumberFormatException unused3) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j4 = Long.parseLong(string);
                if (j4 < 0 || j4 > 65535) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(2, j4);
                }
                return;
            } catch (NumberFormatException unused4) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j5 = Long.parseLong(string);
                if (j5 < -2147483648L || j5 > 2147483647L) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(4, j5);
                }
                return;
            } catch (NumberFormatException unused5) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j6 = Long.parseLong(string);
                if (j6 < 0 || j6 > 4294967295L) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(4, j6);
                }
                return;
            } catch (NumberFormatException unused6) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger = new BigInteger(string);
                if (bigInteger.compareTo(f65241) < 0 || bigInteger.compareTo(f65240) > 0) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(8, bigInteger.longValue());
                }
                return;
            } catch (NumberFormatException unused7) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger2 = new BigInteger(string);
                if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f65242) > 0) {
                    this.f65247 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m45453(8, bigInteger2.longValue());
                }
                return;
            } catch (NumberFormatException unused8) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                m45453(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                return;
            } catch (NumberFormatException unused9) {
                this.f65247 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i != R.id.MT_Protector) {
            throw new IllegalStateException();
        }
        try {
            m45453(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
        } catch (NumberFormatException unused10) {
            this.f65247 = true;
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45452() {
        StringBuilder sb = new StringBuilder(this.f65249.length * 3);
        for (byte b : this.f65249) {
            sb.append(String.format("%02X ", Integer.valueOf(b & 255)));
        }
        this.f65244.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45453(int i, long j) {
        this.f65249 = new byte[i];
        if (this.f65245) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f65249[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f65249[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m45452();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m45454();
    }
}
