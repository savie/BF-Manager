package l;

import java.io.DataInputStream;
import java.text.MessageFormat;

/* JADX INFO: renamed from: l.۠֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8318 extends AbstractC20997 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public String f27295;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C1606 f27296;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public short f27297;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public String f27298;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public short f27299;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public short f27300;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public short f27301;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public short f27302;

    public AbstractC8318(DataInputStream dataInputStream, C3381 c3381, String str) {
        this.f27299 = dataInputStream.readShort();
        this.f27302 = dataInputStream.readShort();
        this.f27301 = dataInputStream.readShort();
        this.f27300 = dataInputStream.readShort();
        this.f27297 = dataInputStream.readShort();
        this.f67151 = c3381.f67151;
        this.f27296 = c3381.f6371;
        int iM6506 = c3381.m6506("Start");
        this.f27298 = String.format(MessageFormat.format("%{0}s  Length  Slot  Name    %s", Integer.valueOf(iM6506)), "Start", str);
        this.f27295 = MessageFormat.format("%{0}d  %6d  %4d  %4s  %s", Integer.valueOf(iM6506));
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        m48012(1);
        if (i == 0) {
            m48013(mo19010());
            m48013(this.f27298);
        }
        StringBuilder sb = new StringBuilder("#");
        short s = this.f27301;
        sb.append((int) s);
        String strM47996 = m47996(6, sb.toString());
        C1606 c1606 = this.f27296;
        String strM5644 = c1606.m5644(s);
        short s2 = this.f27300;
        String strM5645 = c1606.m5644(s2);
        boolean z = this.f67132;
        short s3 = this.f27297;
        short s4 = this.f27302;
        short s5 = this.f27299;
        String str = this.f27295;
        if (!z) {
            m48013(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), m47996(6, strM5644), strM5645));
            return;
        }
        if (this.f67146) {
            m48013(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM47996, C13645.m33382(s2, "#")));
            return;
        }
        m47997(m47996(mo12384(), String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM47996, String.format("%-4s", C13645.m33382(s2, "#")))));
        m48006(" // " + strM5644 + ":" + strM5645);
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩴ */
    public final int mo12384() {
        return this.f67148 + 7;
    }
}
