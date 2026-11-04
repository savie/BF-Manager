package l;

import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩷ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C21859 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f69685;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f69686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f69687;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f69688;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C21859(int i, int i2, String str, byte[] bArr) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                C20782.m47565(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C20782.m47565(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                C20782.m47565(z);
                break;
            case "auxiliary.tracks.map":
                C20782.m47565(i2 == 0);
                break;
        }
        this.f69685 = str;
        this.f69688 = bArr;
        this.f69687 = i;
        this.f69686 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m49556() {
        C20782.m47567("Metadata is not an auxiliary tracks map", this.f69685.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f69688;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21859.class == obj.getClass()) {
            C21859 c21859 = (C21859) obj;
            if (this.f69685.equals(c21859.f69685) && Arrays.equals(this.f69688, c21859.f69688) && this.f69687 == c21859.f69687 && this.f69686 == c21859.f69686) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f69688) + C12351.m30817(527, 31, this.f69685)) * 31) + this.f69687) * 31) + this.f69686;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[LOOP:0: B:32:0x00a8->B:34:0x00ab, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f69685;
        byte[] bArr = this.f69688;
        int i = this.f69686;
        if (i != 0) {
            if (i == 1) {
                string = C7116.m19481(bArr);
            } else if (i == 23) {
                C12128.m30307("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(C18444.m42968(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                C12128.m30307("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(C18444.m42968(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = C7116.f23455;
                sb = new StringBuilder(bArr.length * 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C21287(bArr).m48482());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM49556 = m49556();
            StringBuilder sbM27333 = C10732.m27333("track types = ");
            C17349.m40725().m40729(sbM27333, arrayListM49556.iterator());
            string = sbM27333.toString();
        } else {
            String str3 = C7116.f23455;
            sb = new StringBuilder(bArr.length * 2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & 15, 16));
            }
            string = sb.toString();
        }
        return ExternalValue$$ExternalSyntheticOutline0.m("mdta: key=", str, ", value=", string);
    }
}
