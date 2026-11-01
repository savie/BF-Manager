package l;

import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6626 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21264 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f69237;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f69238;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC8793 f69239;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7381 f69240;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2516 f69241;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f69242;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f69243;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1736 f69244;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69245;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f69246;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f69247;

    public C21264(ViewOnClickListenerC8793 viewOnClickListenerC8793, String str, boolean z, boolean z2) {
        this.f69239 = viewOnClickListenerC8793;
        this.f69238 = viewOnClickListenerC8793.f30240;
        this.f69246 = str;
        this.f69243 = z;
        this.f69242 = z2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        boolean z = this.f69242;
        int i = R.string.MT_Protector;
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f69239;
        if (z) {
            try {
                m10246(viewOnClickListenerC8793, R.string.MT_Protector);
            } catch (RuntimeException unused) {
            }
        } else {
            if (!this.f69243) {
                i = R.string.MT_Protector;
            }
            m10246(viewOnClickListenerC8793, i);
            this.f12806.m40697((Runnable) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo10253() {
        return this.f69242;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܶ֫ۚ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܶ֫ۚ] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        AbstractC20745 abstractC20745 = this.f69238;
        if (C7859.m20758(abstractC20745.mo33986(), new C22676(this))) {
            boolean z = this.f69243;
            String str = this.f69246;
            if (!z) {
                C1736.m5755(str);
            }
            if (str != null) {
                ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f69239;
                C1736 c1736M5753 = null;
                try {
                    c1736M5753 = C1736.m5753(str, (C14915) new InterfaceC5614() { // from class: l.ܶ֫ۚ
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return this.f48694.m47732();
                        }
                    });
                    C17031 c17031M15801 = C5742.m15801(c1736M5753, abstractC20745, (C14915) new InterfaceC5614() { // from class: l.ܶ֫ۚ
                        @Override // l.InterfaceC5614
                        /* JADX INFO: renamed from: ֨ */
                        public final boolean mo2357() {
                            return this.f48694.m47732();
                        }
                    });
                    this.f69244 = c1736M5753;
                    C2516 c2516 = c17031M15801.f54415;
                    this.f69241 = c2516;
                    c2516.m7795(viewOnClickListenerC8793.getCacheDir());
                    this.f69240 = c17031M15801.f54412;
                    this.f69237 = c17031M15801.f54413;
                    this.f69245 = c17031M15801.f54414;
                    return;
                } catch (Exception e) {
                    if (this.f69242 && !(e instanceof C1105) && viewOnClickListenerC8793.m22907()) {
                        this.f69247 = true;
                    } else if (c1736M5753 != null && !viewOnClickListenerC8793.m22900(c1736M5753)) {
                        try {
                            c1736M5753.m5783();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else if (c1736M5753 == null) {
                        C1736.m5756(str, e);
                    }
                    if (this.f69247) {
                        return;
                    }
                }
            }
            if (m47732()) {
                return;
            }
            if (!abstractC20745.m46725() && (!abstractC20745.mo33988() || !abstractC20745.mo33971())) {
                throw new IOException("File can not be read");
            }
            try {
                m47731();
            } catch (C1105 unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m47731() throws Throwable {
        Throwable th;
        C8868 c8868M23008;
        if (m47732()) {
            return;
        }
        C7381 c7381M19649 = C7381.m19649(this.f69238);
        this.f69240 = c7381M19649;
        AbstractC20745 abstractC20745M19655 = c7381M19649.m19655();
        boolean z = false;
        boolean z2 = abstractC20745M19655.mo36912() && !abstractC20745M19655.m46725();
        this.f69237 = z2;
        try {
            if (z2) {
                c8868M23008 = C8868.m23010(abstractC20745M19655.mo36913());
                try {
                    if (!this.f69240.m19651().equals(c8868M23008.m23011())) {
                        throw new C8599();
                    }
                    this.f69245 = c8868M23008.m23011().m13012() > ((long) c8868M23008.length());
                } catch (Throwable th2) {
                    th = th2;
                    if (c8868M23008 != null) {
                        c8868M23008.close();
                    }
                    throw th;
                }
            } else {
                C1736 c1736M5770 = C1736.m5770();
                this.f69244 = c1736M5770;
                C15432 c15432M5776 = c1736M5770.m5776();
                BufferedInputStream bufferedInputStreamM46719 = abstractC20745M19655.m46719();
                try {
                    BufferedOutputStream bufferedOutputStreamM46708 = c15432M5776.m46708();
                    try {
                        byte[] bArr = new byte[262144];
                        long j = 0;
                        while (true) {
                            if (!m47732()) {
                                int i = bufferedInputStreamM46719.read(bArr, 0, j < 2147483647L ? (int) Math.min(262144, 2147483647L - j) : 1);
                                if (i < 0) {
                                    break;
                                }
                                if (i != 0) {
                                    long j2 = i;
                                    if (j2 > 2147483647L - j) {
                                        z = true;
                                        break;
                                    } else {
                                        bufferedOutputStreamM46708.write(bArr, 0, i);
                                        j += j2;
                                    }
                                }
                            } else {
                                throw new C1105();
                            }
                            try {
                                bufferedInputStreamM46719.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        bufferedOutputStreamM46708.close();
                        bufferedInputStreamM46719.close();
                        this.f69245 = z;
                        if (m47732()) {
                            return;
                        }
                        this.f69240.m19656();
                        c8868M23008 = C8868.m23008(c15432M5776);
                    } catch (Throwable th4) {
                        try {
                            bufferedOutputStreamM46708.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    bufferedInputStreamM46719.close();
                    throw th6;
                }
            }
            if (!m47732()) {
                this.f69241 = new C2516(c8868M23008, this.f69239.getCacheDir());
            } else {
                c8868M23008.close();
            }
        } catch (Throwable th7) {
            th = th7;
            c8868M23008 = null;
            if (c8868M23008 != null) {
                c8868M23008.close();
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C2516 c2516;
        boolean z = this.f69247;
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f69239;
        if (z) {
            viewOnClickListenerC8793.m22901();
            return;
        }
        if (m47732() || (c2516 = this.f69241) == null) {
            m47730();
            if (viewOnClickListenerC8793.m22889()) {
                return;
            }
            viewOnClickListenerC8793.finish();
            return;
        }
        this.f69239.m22894(c2516, this.f69244, this.f69240, this.f69237, this.f69245);
        this.f69241 = null;
        this.f69244 = null;
        if (viewOnClickListenerC8793.isFinishing() || viewOnClickListenerC8793.isDestroyed() || viewOnClickListenerC8793.m22891() || C1709.m5693()) {
            return;
        }
        C15829.m37618(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        m47730();
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f69239;
        if (viewOnClickListenerC8793.isFinishing() || viewOnClickListenerC8793.isDestroyed()) {
            return;
        }
        viewOnClickListenerC8793.m31003((Throwable) exc, true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m47730() {
        C2516 c2516 = this.f69241;
        if (c2516 != null) {
            try {
                c2516.close();
            } catch (IOException unused) {
            }
            this.f69241 = null;
        }
        C1736 c1736 = this.f69244;
        if (c1736 == null || this.f69239.m22900(c1736)) {
            return;
        }
        try {
            this.f69244.m5783();
        } catch (IOException unused2) {
        }
        this.f69244 = null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m47732() {
        if (this.f69239.m22890()) {
            return true;
        }
        C17485 c17485 = this.f12806;
        return c17485 != null && c17485.m40693();
    }
}
