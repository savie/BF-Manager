package l;

import android.text.style.BackgroundColorSpan;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ᩴۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19758 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63587;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63588;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63589;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63590;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63591;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63592;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63593;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63594;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f63595;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f63597;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f63598;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CompoundButton f63599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BackgroundColorSpan f63600 = new BackgroundColorSpan(1627389951 & C3296.f10738);

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC10807 f63601;

    /* JADX WARN: Multi-variable type inference failed */
    public C19758(InterfaceC23488 interfaceC23488) {
        this.f63595 = (AbstractActivityC17204) interfaceC23488;
        AbstractActivityC17204 abstractActivityC17204Mo44752 = interfaceC23488.mo44752();
        this.f63597 = abstractActivityC17204Mo44752;
        CompoundButton compoundButton = (CompoundButton) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f63599 = compoundButton;
        this.f63598 = (TextView) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f63588 = new ViewOnLongClickListenerC10807(this, 1, R.id.MT_Protector);
        this.f63591 = new ViewOnLongClickListenerC10807(this, 1, R.id.MT_Protector);
        this.f63593 = new ViewOnLongClickListenerC10807(this, 2, R.id.MT_Protector);
        this.f63601 = new ViewOnLongClickListenerC10807(this, 2, R.id.MT_Protector);
        this.f63594 = new ViewOnLongClickListenerC10807(this, 4, R.id.MT_Protector);
        this.f63596 = new ViewOnLongClickListenerC10807(this, 4, R.id.MT_Protector);
        this.f63589 = new ViewOnLongClickListenerC10807(this, 8, R.id.MT_Protector);
        this.f63590 = new ViewOnLongClickListenerC10807(this, 8, R.id.MT_Protector);
        this.f63592 = new ViewOnLongClickListenerC10807(this, 4, R.id.MT_Protector);
        this.f63587 = new ViewOnLongClickListenerC10807(this, 8, R.id.MT_Protector);
        compoundButton.setOnCheckedChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45517() {
        int iMin;
        byte[] bArr;
        this.f63598.setText("");
        this.f63588.m27544(0);
        this.f63591.m27544(0);
        this.f63593.m27544(0);
        this.f63601.m27544(0);
        this.f63594.m27544(0);
        this.f63596.m27544(0);
        this.f63589.m27544(0);
        this.f63590.m27544(0);
        this.f63592.m27544(0);
        this.f63587.m27544(0);
        C12628 c12628Mo44761 = this.f63595.mo44761();
        if (c12628Mo44761.m31371()) {
            return;
        }
        C19143 c19143M17213 = c12628Mo44761.f40509.m17213();
        try {
            synchronized (c19143M17213) {
                try {
                    int length = c19143M17213.length();
                    int iMax = Math.max(0, Math.min(c12628Mo44761.f40509.m17202(), length));
                    long jMin = length;
                    if (c12628Mo44761.f40509.m17206()) {
                        jMin = Math.min(jMin, ((long) c12628Mo44761.f40509.m17208()) + 1);
                    }
                    iMin = (int) Math.min(8L, Math.max(0L, jMin - ((long) iMax)));
                    bArr = new byte[iMin];
                    c19143M17213.m44363(iMax, bArr, 0, iMin);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iMin > 0) {
                StringBuilder sb = new StringBuilder(iMin * 3);
                for (int i = 0; i < iMin; i++) {
                    sb.append(String.format("%02X ", Integer.valueOf(bArr[i] & 255)));
                }
                sb.deleteCharAt(sb.length() - 1);
                this.f63598.setText(sb.toString());
            }
            if (this.f63588.m27544(iMin)) {
                this.f63588.m27543(String.valueOf((int) ((byte) this.f63588.m27542(bArr))));
            }
            if (this.f63591.m27544(iMin)) {
                this.f63591.m27543(String.valueOf(this.f63591.m27542(bArr)));
            }
            if (this.f63593.m27544(iMin)) {
                this.f63593.m27543(String.valueOf((int) ((short) this.f63593.m27542(bArr))));
            }
            if (this.f63601.m27544(iMin)) {
                this.f63601.m27543(String.valueOf(this.f63601.m27542(bArr)));
            }
            if (this.f63594.m27544(iMin)) {
                this.f63594.m27543(String.valueOf((int) this.f63594.m27542(bArr)));
            }
            if (this.f63596.m27544(iMin)) {
                this.f63596.m27543(String.valueOf(this.f63596.m27542(bArr)));
            }
            if (this.f63589.m27544(iMin)) {
                this.f63589.m27543(String.valueOf(this.f63589.m27542(bArr)));
            }
            if (this.f63590.m27544(iMin)) {
                ViewOnLongClickListenerC10807 viewOnLongClickListenerC10807 = this.f63590;
                int i2 = viewOnLongClickListenerC10807.f34294;
                byte[] bArr2 = new byte[i2];
                if (viewOnLongClickListenerC10807.f34292.f63599.isChecked()) {
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                } else {
                    for (int i3 = 1; i3 <= i2; i3++) {
                        bArr2[i3 - 1] = bArr[i2 - i3];
                    }
                }
                viewOnLongClickListenerC10807.m27543(new BigInteger(1, bArr2).toString());
            }
            if (this.f63592.m27544(iMin)) {
                this.f63592.m27543(Float.toString(Float.intBitsToFloat((int) this.f63592.m27542(bArr))));
            }
            if (this.f63587.m27544(iMin)) {
                this.f63587.m27543(Double.toString(Double.longBitsToDouble(this.f63587.m27542(bArr))));
            }
        } catch (IOException e) {
            c12628Mo44761.m31361(e);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m45517();
    }
}
