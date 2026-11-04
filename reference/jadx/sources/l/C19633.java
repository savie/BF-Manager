package l;

/* JADX INFO: renamed from: l.ᩴۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19633 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5812 f63257;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63259;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f63260;

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        int i3 = i + 1;
        this.f63260 = bArr[i] == 0;
        this.f63259 = bArr[i3] & 255;
        int iM2318 = C0481.m2318(i + 2, bArr);
        this.f63258 = C0481.m2322(i + 4, bArr);
        this.f63257 = new C5812(bArr, i + 8);
        return iM2318;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f63260 ? "Allow " : "Deny  ");
        String strM16943 = this.f63257.m16943();
        stringBuffer.append(strM16943);
        int length = 25 - strM16943.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(" 0x");
        stringBuffer.append(C6033.m17503(this.f63258, 8));
        stringBuffer.append(' ');
        stringBuffer.append((this.f63259 & 16) != 0 ? "Inherited " : "Direct    ");
        int i2 = this.f63259 & 11;
        if (i2 == 0) {
            str = "This folder only";
        } else if (i2 == 1) {
            str = "This folder and files";
        } else if (i2 == 2) {
            str = "This folder and subfolders";
        } else if (i2 != 3) {
            switch (i2) {
                case 9:
                    str = "Files only";
                    break;
                case 10:
                    str = "Subfolders only";
                    break;
                case 11:
                    str = "Subfolders and files only";
                    break;
                default:
                    str = "Invalid";
                    break;
            }
        } else {
            str = "This folder, subfolders and files";
        }
        stringBuffer.append(str);
        int length2 = 34 - str.length();
        for (int i3 = 0; i3 < length2; i3++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }
}
