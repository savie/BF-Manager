package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12906 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public String f42894;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public String f42895;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f42896;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f42897;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC23282 f42898;

    public C12906(C3980 c3980) {
        super(c3980);
        this.f42898 = null;
        this.f42896 = -1;
        this.f42894 = l.b;
        this.f42895 = System.getProperty("line.separator");
        this.f22696 = EnumC10020.SIGNATURE;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31981() {
        return this.f42897;
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9757() {
        return !this.f22707;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31978(int i, DataInputStream dataInputStream) {
        if (i != 2) {
            if (this.f22711) {
                this.f47519.m2163().mo24457("{0}: Invalid attribute length #{1}", EnumC16783.f53727.m39430(), Integer.valueOf(i));
            } else {
                throw new C16639(this.f47519.m2163(), "{0}: Invalid attribute length #{1}", EnumC16783.f53727.m39430(), Integer.valueOf(i));
            }
        }
        this.f42897 = dataInputStream.readUnsignedShort();
    }

    public final String toString() {
        return String.format("signature[%d]=%s", Integer.valueOf(this.f42897), this.f47512.m27831(this.f42897));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m31982() {
        if (this.f42898 == null) {
            this.f47519.getClass();
            this.f42898 = new C14110(this.f42897).m34151(this.f47512);
        }
        AbstractC23282 abstractC23282 = this.f42898;
        if (abstractC23282 != null) {
            return abstractC23282.toString().replace('/', '.');
        }
        return this.f47512.m27831(this.f42897);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 m31980() {
        if (this.f42898 == null) {
            this.f47519.getClass();
            this.f42898 = new C14110(this.f42897).m34151(this.f47512);
        }
        return this.f42898;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m31984(int i) {
        this.f42896 = i;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩺ */
    public final int mo14807() {
        int i = this.f42896;
        return i == -1 ? super.mo14807() : i;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m31983() {
        this.f42895 = "";
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۡ */
    public final void mo8967() {
        m18223(m18222(mo14807(), this.f22696.m25298()));
        String strM27831 = this.f47512.m27831(this.f42897);
        if (this.f22692) {
            if (this.f22704) {
                m18228(String.format("#%d%s", Integer.valueOf(this.f42897), this.f42894).concat(this.f42895));
                return;
            } else {
                this.f22710.mo18524(m18222(m18220(), String.format("#%d%s", Integer.valueOf(this.f42897), this.f42894)));
                m18228(" // ".concat(strM27831).concat(this.f42895));
                return;
            }
        }
        m18228(strM27831.concat(this.f42894).concat(this.f42895));
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8969() {
        m18223(m18222(mo14807(), EnumC10020.SIGNATURE.m25297()));
        String strM27831 = this.f47512.m27831(this.f42897);
        if (this.f22692) {
            if (this.f22704) {
                m18228(String.format("#%d%s", Integer.valueOf(this.f42897), this.f42894).concat(this.f42895));
                return;
            } else {
                this.f22710.mo18524(m18222(m18220(), String.format("#%d%s", Integer.valueOf(this.f42897), this.f42894)));
                m18228(" // ".concat(strM27831).concat(this.f42895));
                return;
            }
        }
        m18228(strM27831.concat(this.f42894).concat(this.f42895));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13111 m31977(Function function) {
        String str;
        if (this.f22709) {
            return new C13111("", "");
        }
        String str2 = String.format(":#%d", Integer.valueOf(this.f42897));
        if (((Boolean) function.apply(Integer.valueOf(this.f42897))).booleanValue()) {
            str = ":" + this.f47512.m27831(this.f42897);
        } else {
            str = String.format(":?%d Invalid constant_pool index", Integer.valueOf(this.f42897));
        }
        return new C13111(str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31979(boolean z) {
        this.f42894 = z ? l.b : ",";
    }
}
