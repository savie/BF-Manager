package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A20 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1718 implements InterfaceC9481 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f6785 = C13488.m32997(C1718.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5952 f6786;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f6787;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4581 f6788;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14420 f6789;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f6790 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17987 f6791;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f6792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3129 f6793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6794;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f6795;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f6796;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        boolean zIsOpen = isOpen();
        this.f6790 = false;
        C3129 c3129 = this.f6793;
        if (c3129 != null) {
            c3129.getClass();
            this.f6793 = null;
        }
        C4581 c4581 = this.f6788;
        if (c4581 != null) {
            c4581.getClass();
            this.f6788 = null;
        }
        try {
            if (zIsOpen) {
                this.f6786.m16227();
            } else {
                C5952 c5952 = this.f6786;
                if (c5952 != null) {
                    c5952.m16227();
                }
            }
            this.f6786 = null;
            C17987 c17987 = this.f6791;
            if (c17987 != null) {
                c17987.m41879();
            }
        } catch (Throwable th) {
            C17987 c17988 = this.f6791;
            if (c17988 != null) {
                c17988.m41879();
            }
            throw th;
        }
    }

    @Override // l.InterfaceC9481
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9481 mo5724() {
        if (InterfaceC9481.class.isAssignableFrom(C1718.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5952 m5719() {
        if (!this.f6790) {
            throw new C12303("Pipe handle already closed");
        }
        if (!isOpen()) {
            C17987 c17987M5722 = m5722();
            try {
                if (c17987M5722.m41875()) {
                    C5952 c5952M40193 = this.f6789.m40193(this.f6787, 0, this.f6792, 7, 128, 0);
                    this.f6786 = c5952M40193;
                    c5952M40193.m16224();
                    c17987M5722.close();
                    return c5952M40193;
                }
                if (this.f6787.startsWith("\\pipe\\")) {
                    c17987M5722.m41868(new C15414(this.f6787, c17987M5722.m41882()), new C21763(c17987M5722.m41882()), new EnumC19358[0]);
                }
                if (c17987M5722.m41870(16) || this.f6787.startsWith("\\pipe\\")) {
                    this.f6786 = this.f6789.m40192(this.f6794, this.f6792, 7, 128, 0);
                } else {
                    this.f6786 = this.f6789.m40193("\\pipe" + this.f6787, this.f6794, this.f6792, 7, 128, 0);
                }
                C5952 c5952 = this.f6786;
                c5952.m16224();
                c17987M5722.close();
                return c5952;
            } catch (Throwable th) {
                try {
                    c17987M5722.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f6785.mo12127("Pipe already open");
        C5952 c5953 = this.f6786;
        c5953.m16224();
        return c5953;
    }

    public C1718(C14420 c14420) {
        this.f6789 = c14420;
        this.f6796 = (c14420.m34690() & 512) == 512;
        this.f6795 = false;
        this.f6794 = (c14420.m34690() & (-65281)) | 32;
        this.f6792 = (c14420.m34690() & 7) | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f6787 = c14420.f54929.m7557();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14420 m5716() {
        return this.f6789;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17987 m5722() {
        if (this.f6791 == null) {
            this.f6791 = this.f6789.m40191();
        }
        C17987 c17987 = this.f6791;
        c17987.m41869();
        return c17987;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m5723() {
        return this.f6787;
    }

    public final boolean isOpen() {
        C5952 c5952;
        return this.f6790 && (c5952 = this.f6786) != null && c5952.m16226();
    }

    @Override // l.InterfaceC9481
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5726() {
        if (!this.f6790) {
            return true;
        }
        C5952 c5952 = this.f6786;
        return (c5952 == null || c5952.m16226()) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3129 m5717() throws C12303 {
        if (!this.f6790) {
            throw new C12303("Already closed");
        }
        C3129 c3129 = this.f6793;
        if (c3129 != null) {
            return c3129;
        }
        C17987 c17987M5722 = m5722();
        try {
            this.f6793 = new C3129(this, c17987M5722);
            c17987M5722.close();
            return this.f6793;
        } catch (Throwable th) {
            try {
                c17987M5722.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4581 m5725() throws C12303 {
        if (!this.f6790) {
            throw new C12303("Already closed");
        }
        C4581 c4581 = this.f6788;
        if (c4581 != null) {
            return c4581;
        }
        C17987 c17987M5722 = m5722();
        try {
            this.f6788 = new C4581(this, c17987M5722);
            c17987M5722.close();
            return this.f6788;
        } catch (Throwable th) {
            try {
                c17987M5722.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC9481
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5718(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C5952 c5952M5719 = m5719();
        try {
            C17987 c17987M16222 = c5952M5719.m16222();
            try {
                if (c17987M16222.m41875()) {
                    C21453 c21453 = new C21453(c17987M16222.m41882(), c5952M5719.m16229(), bArr2);
                    c21453.m48077();
                    c21453.m48075(new C0348(bArr, i, i2));
                    c21453.m48076(i3);
                    int iM41619 = ((C17925) c17987M16222.m41868(c21453, null, EnumC19358.NO_RETRY)).m41619();
                    c17987M16222.close();
                    c5952M5719.m16227();
                    return iM41619;
                }
                if (this.f6796) {
                    C6946 c6946 = new C6946(c17987M16222.m41882(), c5952M5719.m16223(), bArr, i, i2);
                    C23175 c23175 = new C23175(c17987M16222.m41882(), bArr2);
                    if ((this.f6789.m34690() & 1536) == 1536) {
                        c6946.m8266();
                    }
                    c17987M16222.m41868(c6946, c23175, EnumC19358.NO_RETRY);
                    int iM51168 = c23175.m51168();
                    c17987M16222.close();
                    c5952M5719.m16227();
                    return iM51168;
                }
                if (this.f6795) {
                    c17987M16222.m41868(new C15414(this.f6787, c17987M16222.m41882()), new C21763(c17987M16222.m41882()), new EnumC19358[0]);
                    C1301 c1301 = new C1301(c17987M16222.m41882(), bArr2);
                    c17987M16222.m41868(new C22469(c17987M16222.m41882(), this.f6787, bArr, i, i2), c1301, new EnumC19358[0]);
                    int iM4646 = c1301.m4646();
                    c17987M16222.close();
                    c5952M5719.m16227();
                    return iM4646;
                }
                C4581 c4581M5725 = m5725();
                C3129 c3129M5717 = m5717();
                c4581M5725.m52019(i, bArr, i2, 0);
                c3129M5717.getClass();
                int iM27294 = c3129M5717.m27294(0, bArr2.length, bArr2);
                c17987M16222.close();
                c5952M5719.m16227();
                return iM27294;
            } catch (Throwable th) {
                try {
                    c17987M16222.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c5952M5719.m16227();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // l.InterfaceC9481
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo5721(int i, int i2, byte[] bArr) {
        return m5717().m27294(i, i2, bArr);
    }

    @Override // l.InterfaceC9481
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5720(int i, int i2, byte[] bArr) throws IOException {
        m5725().m52019(i, bArr, i2, 1);
    }
}
