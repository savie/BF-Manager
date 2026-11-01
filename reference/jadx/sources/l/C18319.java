package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA06 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18319 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f58439;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f58440;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f58441;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f58442;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58443;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f58444;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f58445;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58446;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f58447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String[] f58448;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f58449;

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        int iM13545 = C4850.m13545(i, bArr);
        this.f58440 = iM13545;
        if (iM13545 != 3 && iM13545 != 1) {
            throw new C17655(C12441.m30911(this.f58440, " referral not supported. Please report this to jcifs at samba dot org.", new StringBuilder("Version ")));
        }
        this.f58442 = C4850.m13545(i + 2, bArr);
        this.f58441 = C4850.m13545(i + 4, bArr);
        this.f58443 = C4850.m13545(i + 6, bArr);
        int i3 = i + 8;
        int i4 = this.f58440;
        if (i4 == 3) {
            this.f58446 = C4850.m13545(i3, bArr);
            this.f58444 = C4850.m13545(i + 10, bArr);
            int i5 = i + 12;
            if ((this.f58443 & 2) == 0) {
                int iM13546 = C4850.m13545(i5, bArr);
                int iM13547 = C4850.m13545(i + 14, bArr);
                int iM13548 = C4850.m13545(i + 16, bArr);
                if (iM13546 > 0) {
                    this.f58447 = m42554(iM13546 + i, i2, bArr);
                }
                if (iM13548 > 0) {
                    this.f58439 = m42554(iM13548 + i, i2, bArr);
                }
                if (iM13547 > 0) {
                    this.f58445 = m42554(i + iM13547, i2, bArr);
                }
            } else {
                int iM13549 = C4850.m13545(i5, bArr);
                int iM135410 = C4850.m13545(i + 14, bArr);
                int iM135411 = C4850.m13545(i + 16, bArr);
                if (iM13549 > 0) {
                    this.f58449 = m42554(iM13549 + i, i2, bArr);
                }
                if (iM135411 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < iM135410; i6++) {
                        String strM42554 = m42554(i + iM135411, i2, bArr);
                        arrayList.add(strM42554);
                        iM135411 += (strM42554.length() * 2) + 2;
                    }
                    this.f58448 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (i4 == 1) {
            this.f58439 = m42554(i3, i2, bArr);
        }
        return this.f58442;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m42554(int i, int i2, byte[] bArr) {
        if (i % 2 != 0) {
            i++;
        }
        return C10933.m27419(i, C10933.m27420(i, i2, bArr), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Referral[version=");
        sb.append(this.f58440);
        sb.append(",size=");
        sb.append(this.f58442);
        sb.append(",serverType=");
        sb.append(this.f58441);
        sb.append(",flags=");
        sb.append(this.f58443);
        sb.append(",proximity=");
        sb.append(this.f58446);
        sb.append(",ttl=");
        sb.append(this.f58444);
        sb.append(",path=");
        sb.append(this.f58447);
        sb.append(",altPath=");
        sb.append(this.f58445);
        sb.append(",node=");
        return new String(C22697.m50267(sb, this.f58439, "]"));
    }
}
