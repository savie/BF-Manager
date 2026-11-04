package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13298 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f42453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f42454;

    public final int hashCode() {
        return Float.floatToIntBits(this.f42453) + (Float.floatToIntBits(this.f42454) * 31);
    }

    public C13298(float f, float f2) {
        this.f42454 = f;
        this.f42453 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13298)) {
            return false;
        }
        C13298 c13298 = (C13298) obj;
        return this.f42454 == c13298.f42454 && this.f42453 == c13298.f42453;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f42454), Float.valueOf(this.f42453)};
        String[] strArrSplit = "width;height".length() == 0 ? new String[0] : "width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C13298.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m32839() {
        return this.f42454 / this.f42453;
    }
}
