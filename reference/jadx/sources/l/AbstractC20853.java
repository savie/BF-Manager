package l;

import java.io.DataInputStream;
import java.text.MessageFormat;

/* JADX INFO: renamed from: l.᩷ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20853 extends AbstractC6741 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public short f67740;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public short f67741;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C11038 f67742;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public String f67743;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public short f67744;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f67745;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public short f67746;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public short f67747;

    public AbstractC20853(DataInputStream dataInputStream, C5061 c5061, String str) {
        this.f67740 = dataInputStream.readShort();
        this.f67746 = dataInputStream.readShort();
        this.f67741 = dataInputStream.readShort();
        this.f67747 = dataInputStream.readShort();
        this.f67744 = dataInputStream.readShort();
        this.f22710 = c5061.f22710;
        this.f67742 = c5061.f47512;
        int iM34923 = c5061.m34923("Start");
        this.f67743 = String.format(MessageFormat.format("%{0}s  Length  Slot  Name    %s", Integer.valueOf(iM34923)), "Start", str);
        this.f67745 = MessageFormat.format("%{0}d  %6d  %4d  %4s  %s", Integer.valueOf(iM34923));
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        m18208(1);
        if (i == 0) {
            m18209(mo18230());
            m18209(this.f67743);
        }
        StringBuilder sb = new StringBuilder("#");
        short s = this.f67741;
        sb.append((int) s);
        String strM18222 = m18222(6, sb.toString());
        C11038 c11038 = this.f67742;
        String strM27831 = c11038.m27831(s);
        short s2 = this.f67747;
        String strM27832 = c11038.m27831(s2);
        boolean z = this.f22692;
        short s3 = this.f67744;
        short s4 = this.f67746;
        short s5 = this.f67740;
        String str = this.f67745;
        if (!z) {
            m18209(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), m18222(6, strM27831), strM27832));
            return;
        }
        if (this.f22704) {
            m18209(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM18222, C8479.m22141(s2, "#")));
            return;
        }
        m18223(m18222(mo12770(), String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM18222, String.format("%-4s", C8479.m22141(s2, "#")))));
        m18219(" // " + strM27831 + ":" + strM27832);
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۚ */
    public final int mo12770() {
        return this.f22686 + 7;
    }
}
