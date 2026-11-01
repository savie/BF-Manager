package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8R4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19395 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f62528;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f62530;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62531;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C19395(int i, int i2, String str, byte[] bArr) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                C2023.m6507(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C2023.m6507(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                C2023.m6507(z);
                break;
            case "auxiliary.tracks.map":
                C2023.m6507(i2 == 0);
                break;
        }
        this.f62529 = str;
        this.f62528 = bArr;
        this.f62531 = i;
        this.f62530 = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44440() {
        C2023.m6509("Metadata is not an auxiliary tracks map", this.f62529.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f62528;
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
        if (obj != null && C19395.class == obj.getClass()) {
            C19395 c19395 = (C19395) obj;
            if (this.f62529.equals(c19395.f62529) && Arrays.equals(this.f62528, c19395.f62528) && this.f62531 == c19395.f62531 && this.f62530 == c19395.f62530) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f62528) + C13958.m33812(527, 31, this.f62529)) * 31) + this.f62531) * 31) + this.f62530;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[LOOP:0: B:32:0x00a8->B:34:0x00ab, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f62529;
        byte[] bArr = this.f62528;
        int i = this.f62530;
        if (i != 0) {
            if (i == 1) {
                string = C17983.m41834(bArr);
            } else if (i == 23) {
                C18304.m42515("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(C17039.m39816(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                C18304.m42515("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(C17039.m39816(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = C17983.f57504;
                sb = new StringBuilder(bArr.length * 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C2460(bArr).m7526());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM44440 = m44440();
            StringBuilder sbM23356 = C9023.m23356("track types = ");
            C13366.m32864().m32868(sbM23356, arrayListM44440.iterator());
            string = sbM23356.toString();
        } else {
            String str3 = C17983.f57504;
            sb = new StringBuilder(bArr.length * 2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & 15, 16));
            }
            string = sb.toString();
        }
        return C7997.m21055("mdta: key=", str, ", value=", string);
    }
}
