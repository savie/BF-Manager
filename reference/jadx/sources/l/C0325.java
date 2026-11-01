package l;

import android.text.style.BackgroundColorSpan;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.֡ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0325 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1709;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1710;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1711;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1712;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1713;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1715;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1716;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1717;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BackgroundColorSpan f1718 = new BackgroundColorSpan(1627389951 & C20368.f65970);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC8793 f1719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CompoundButton f1720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f1721;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC15849 f1722;

    public C0325(ViewOnClickListenerC8793 viewOnClickListenerC8793) {
        this.f1719 = viewOnClickListenerC8793;
        CompoundButton compoundButton = (CompoundButton) viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        this.f1720 = compoundButton;
        this.f1721 = (TextView) viewOnClickListenerC8793.m31016(R.id.MT_Protector);
        this.f1713 = new ViewOnLongClickListenerC15849(this, 1, R.id.MT_Protector);
        this.f1710 = new ViewOnLongClickListenerC15849(this, 1, R.id.MT_Protector);
        this.f1717 = new ViewOnLongClickListenerC15849(this, 2, R.id.MT_Protector);
        this.f1712 = new ViewOnLongClickListenerC15849(this, 2, R.id.MT_Protector);
        this.f1715 = new ViewOnLongClickListenerC15849(this, 4, R.id.MT_Protector);
        this.f1714 = new ViewOnLongClickListenerC15849(this, 4, R.id.MT_Protector);
        this.f1722 = new ViewOnLongClickListenerC15849(this, 8, R.id.MT_Protector);
        this.f1711 = new ViewOnLongClickListenerC15849(this, 8, R.id.MT_Protector);
        this.f1716 = new ViewOnLongClickListenerC15849(this, 4, R.id.MT_Protector);
        this.f1709 = new ViewOnLongClickListenerC15849(this, 8, R.id.MT_Protector);
        compoundButton.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1976() {
        int iMin;
        byte[] bArr;
        this.f1721.setText("");
        this.f1713.m37738(0);
        this.f1710.m37738(0);
        this.f1717.m37738(0);
        this.f1712.m37738(0);
        this.f1715.m37738(0);
        this.f1714.m37738(0);
        this.f1722.m37738(0);
        this.f1711.m37738(0);
        this.f1716.m37738(0);
        this.f1709.m37738(0);
        C13026 c13026 = this.f1719.f30239;
        C2516 c2516M33458 = c13026.f43452.m33458();
        try {
            synchronized (c2516M33458) {
                int length = c2516M33458.length();
                int iMax = Math.max(0, Math.min(c13026.f43452.m33443(), length));
                long jMin = length;
                if (c13026.f43452.m33475()) {
                    jMin = Math.min(jMin, ((long) c13026.f43452.m33465()) + 1);
                }
                iMin = (int) Math.min(8L, Math.max(0L, jMin - ((long) iMax)));
                bArr = new byte[iMin];
                c2516M33458.m7798(iMax, iMin, bArr);
            }
            if (iMin > 0) {
                StringBuilder sb = new StringBuilder(iMin * 3);
                for (int i = 0; i < iMin; i++) {
                    sb.append(String.format("%02X ", Integer.valueOf(bArr[i] & 255)));
                }
                sb.deleteCharAt(sb.length() - 1);
                this.f1721.setText(sb.toString());
            }
            if (this.f1713.m37738(iMin)) {
                this.f1713.m37737(String.valueOf((int) ((byte) this.f1713.m37736(bArr))));
            }
            if (this.f1710.m37738(iMin)) {
                this.f1710.m37737(String.valueOf(this.f1710.m37736(bArr)));
            }
            if (this.f1717.m37738(iMin)) {
                this.f1717.m37737(String.valueOf((int) ((short) this.f1717.m37736(bArr))));
            }
            if (this.f1712.m37738(iMin)) {
                this.f1712.m37737(String.valueOf(this.f1712.m37736(bArr)));
            }
            if (this.f1715.m37738(iMin)) {
                this.f1715.m37737(String.valueOf((int) this.f1715.m37736(bArr)));
            }
            if (this.f1714.m37738(iMin)) {
                this.f1714.m37737(String.valueOf(this.f1714.m37736(bArr)));
            }
            if (this.f1722.m37738(iMin)) {
                this.f1722.m37737(String.valueOf(this.f1722.m37736(bArr)));
            }
            if (this.f1711.m37738(iMin)) {
                ViewOnLongClickListenerC15849 viewOnLongClickListenerC15849 = this.f1711;
                int i2 = viewOnLongClickListenerC15849.f51308;
                byte[] bArr2 = new byte[i2];
                if (viewOnLongClickListenerC15849.f51303.f1720.isChecked()) {
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                } else {
                    for (int i3 = 1; i3 <= i2; i3++) {
                        bArr2[i3 - 1] = bArr[i2 - i3];
                    }
                }
                viewOnLongClickListenerC15849.m37737(new BigInteger(1, bArr2).toString());
            }
            if (this.f1716.m37738(iMin)) {
                this.f1716.m37737(Float.toString(Float.intBitsToFloat((int) this.f1716.m37736(bArr))));
            }
            if (this.f1709.m37738(iMin)) {
                this.f1709.m37737(Double.toString(Double.longBitsToDouble(this.f1709.m37736(bArr))));
            }
        } catch (IOException e) {
            this.f1719.m22893(e);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m1976();
    }
}
