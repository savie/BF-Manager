package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14989 extends AbstractC1566 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12006[] f48918;

    public C14989(EnumC12006[] enumC12006Arr) {
        this.f48918 = enumC12006Arr;
        this.f5441 = Arrays.hashCode(enumC12006Arr);
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ܽ */
    public final EnumC12006[] mo5560() {
        return this.f48918;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo5566(EnumC12006 enumC12006) {
        for (EnumC12006 enumC12007 : this.f48918) {
            if (enumC12007 == enumC12006) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC1566 mo5551() {
        boolean zMo5566 = mo5566(EnumC12006.OBJECT);
        AbstractC1566 abstractC1566 = AbstractC1566.f5426;
        if (zMo5566) {
            return abstractC1566;
        }
        if (!mo5566(EnumC12006.ARRAY)) {
            return new C19465(this.f48918[0]);
        }
        return new C7048(abstractC1566);
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        return Arrays.equals(this.f48918, ((C14989) obj).f48918);
    }

    @Override // l.AbstractC1566
    public final String toString() {
        String string;
        EnumC12006[] enumC12006Arr = this.f48918;
        if (enumC12006Arr.length == EnumC12006.values().length) {
            return "??";
        }
        StringBuilder sb = new StringBuilder("??[");
        int length = enumC12006Arr == null ? 0 : enumC12006Arr.length;
        if (length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(enumC12006Arr[0]);
            for (int i = 1; i < length; i++) {
                sb2.append(", ");
                sb2.append(enumC12006Arr[i]);
            }
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
