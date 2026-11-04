package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩸ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes.dex */
public final class C22742 implements TextWatcher {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final BigInteger f73793 = BigInteger.valueOf(C25227.FOREVER_NS);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f73794 = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f73795 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f73796;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f73797;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f73798;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23255 f73799;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f73800 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f73801;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f73802;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C22742(C23255 c23255, TextView textView, int i, boolean z) {
        this.f73799 = c23255;
        this.f73798 = textView;
        this.f73801 = i;
        this.f73797 = z;
        m51279();
        c23255.m53899(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51279() {
        String string = this.f73799.m54021().toString();
        boolean zIsEmpty = string.isEmpty();
        TextView textView = this.f73798;
        if (zIsEmpty) {
            this.f73802 = null;
            this.f73796 = false;
            this.f73800 = true;
            textView.setText(R.string.MT_Protector);
            return;
        }
        this.f73800 = false;
        this.f73796 = false;
        int i = this.f73801;
        if (i == R.id.MT_Protector) {
            try {
                long j = Long.parseLong(string);
                if (j < -128 || j > 127) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f73802 = new byte[]{(byte) (j & 255)};
                    m51277();
                }
                return;
            } catch (NumberFormatException unused) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j2 = Long.parseLong(string);
                if (j2 < 0 || j2 > 255) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    this.f73802 = new byte[]{(byte) (j2 & 255)};
                    m51277();
                }
                return;
            } catch (NumberFormatException unused2) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j3 = Long.parseLong(string);
                if (j3 < -32768 || j3 > 32767) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(2, j3);
                }
                return;
            } catch (NumberFormatException unused3) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j4 = Long.parseLong(string);
                if (j4 < 0 || j4 > 65535) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(2, j4);
                }
                return;
            } catch (NumberFormatException unused4) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j5 = Long.parseLong(string);
                if (j5 < -2147483648L || j5 > 2147483647L) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(4, j5);
                }
                return;
            } catch (NumberFormatException unused5) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                long j6 = Long.parseLong(string);
                if (j6 < 0 || j6 > 4294967295L) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(4, j6);
                }
                return;
            } catch (NumberFormatException unused6) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger = new BigInteger(string);
                if (bigInteger.compareTo(f73794) < 0 || bigInteger.compareTo(f73793) > 0) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(8, bigInteger.longValue());
                }
                return;
            } catch (NumberFormatException unused7) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                BigInteger bigInteger2 = new BigInteger(string);
                if (bigInteger2.compareTo(BigInteger.ZERO) < 0 || bigInteger2.compareTo(f73795) > 0) {
                    this.f73796 = true;
                    textView.setText(R.string.MT_Protector);
                } else {
                    m51278(8, bigInteger2.longValue());
                }
                return;
            } catch (NumberFormatException unused8) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i == R.id.MT_Protector) {
            try {
                m51278(4, Float.floatToRawIntBits(Float.parseFloat(string)));
                return;
            } catch (NumberFormatException unused9) {
                this.f73796 = true;
                textView.setText(R.string.MT_Protector);
                return;
            }
        }
        if (i != R.id.MT_Protector) {
            throw new IllegalStateException();
        }
        try {
            m51278(8, Double.doubleToRawLongBits(Double.parseDouble(string)));
        } catch (NumberFormatException unused10) {
            this.f73796 = true;
            textView.setText(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51277() {
        StringBuilder sb = new StringBuilder(this.f73802.length * 3);
        for (byte b : this.f73802) {
            sb.append(String.format("%02X ", Integer.valueOf(b & 255)));
        }
        this.f73798.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51278(int i, long j) {
        this.f73802 = new byte[i];
        if (this.f73797) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f73802[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f73802[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m51277();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m51279();
    }
}
