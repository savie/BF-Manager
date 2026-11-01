package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77DE */
/* JADX INFO: loaded from: classes3.dex */
public class C3006 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int[] f11254;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public EnumC20934 f11255;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8966(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (i != (unsignedShort * 2) + 2) {
            throw new ClassFormatError(C15489.m37076(this.f11255.m47084(), "_attribute: Invalid attribute length"));
        }
        this.f11254 = new int[unsignedShort];
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            this.f11254[i2] = dataInputStream.readUnsignedShort();
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo8969() {
        if (this.f11254.length > 2) {
            mo8970();
        } else {
            mo8968();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo8968() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = this.f11254.length - 1;
        boolean z = this.f22692;
        String str = z ? "" : l.b;
        int i = 0;
        while (i <= length) {
            String str2 = ", ";
            if (z) {
                sb.append("#");
                sb.append(this.f11254[i]);
                sb.append(i == length ? l.b : ", ");
            }
            sb2.append(this.f47512.m27831(this.f11254[i]));
            if (i == length) {
                str2 = str;
            }
            sb2.append(str2);
            i++;
        }
        m18223(m18222(mo14807(), this.f11255.m47084()));
        if (z) {
            if (this.f22704) {
                m18219(sb.toString());
                return;
            }
            this.f22710.mo18524(m18222(m18220(), sb.toString()));
            m18219(" // " + ((Object) sb2));
            return;
        }
        m18219(sb2.toString());
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void mo8970() {
        String string;
        String strM47084 = this.f11255.m47084();
        int length = strM47084.length();
        if (length < 0) {
            throw new IllegalArgumentException(C8479.m22141(length, "count is negative: "));
        }
        if (length != 0) {
            string = " ";
            if (length != 1) {
                if (1 > Integer.MAX_VALUE / length) {
                    throw new OutOfMemoryError(C2271.m6966(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        int length2 = this.f11254.length - 1;
        int i2 = 0;
        while (i2 <= length2) {
            if (!this.f22692) {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(this.f47512.m27831(this.f11254[i2]));
                m18219(i2 == length2 ? l.b : ",");
            } else if (this.f22704) {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(String.format("#%d", Integer.valueOf(this.f11254[i2])));
                m18219(i2 == length2 ? l.b : ",");
            } else {
                m18223(m18222(mo14807(), i2 == 0 ? strM47084 : string));
                this.f22710.mo18524(m18222(m18220(), String.format("#%d%s", Integer.valueOf(this.f11254[i2]), i2 == length2 ? l.b : ",")));
                m18219(" // " + this.f47512.m27831(this.f11254[i2]));
            }
            i2++;
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo8967() {
        mo8969();
    }
}
