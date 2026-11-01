package l;

/* JADX INFO: renamed from: l.ᩴ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19025 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f61548;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61549;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8775 f61550;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61551;

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        int i3 = i + 1;
        this.f61551 = bArr[i] == 0;
        this.f61548 = bArr[i3] & 255;
        int iM13545 = C4850.m13545(i + 2, bArr);
        this.f61549 = C4850.m13549(i + 4, bArr);
        this.f61550 = new C8775(bArr, i + 8);
        return iM13545;
    }

    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f61551 ? "Allow " : "Deny  ");
        String strM22848 = this.f61550.m22848();
        stringBuffer.append(strM22848);
        int length = 25 - strM22848.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(" 0x");
        stringBuffer.append(C5993.m16280(this.f61549, 8));
        stringBuffer.append(' ');
        stringBuffer.append((this.f61548 & 16) != 0 ? "Inherited " : "Direct    ");
        int i2 = this.f61548 & 11;
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
