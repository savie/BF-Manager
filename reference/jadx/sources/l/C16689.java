package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܽܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16689 implements Closeable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Logger f53464 = Logger.getLogger(C2576.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f53465;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0460 f53466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4693 f53467;

    public C16689(InterfaceC23683 interfaceC23683) {
        this.f53465 = interfaceC23683;
        C0460 c0460 = new C0460(interfaceC23683);
        this.f53466 = c0460;
        this.f53467 = new C4693(c0460);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39159(boolean z, C15984 c15984) throws IOException {
        short s;
        try {
            this.f53465.mo16413(9L);
            int iM39155 = m39155(this.f53465);
            if (iM39155 < 0 || iM39155 > 16384) {
                C2576.m8030("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM39155));
                throw null;
            }
            byte b = (byte) (this.f53465.readByte() & 255);
            if (z && b != 4) {
                C2576.m8030("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
                throw null;
            }
            byte b2 = (byte) (this.f53465.readByte() & 255);
            int i = this.f53465.readInt();
            int i2 = i & Integer.MAX_VALUE;
            Logger logger = f53464;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C2576.m8028(true, i2, iM39155, b, b2));
            }
            switch (b) {
                case 0:
                    InterfaceC23683 interfaceC23683 = this.f53465;
                    if (i2 == 0) {
                        C2576.m8030("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z2 = (b2 & 1) != 0;
                    if ((b2 & UTF8.S_CS3) != 0) {
                        C2576.m8030("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC23683.readByte() & 255) : (short) 0;
                    int iM39154 = m39154(iM39155, b2, s);
                    C20217 c20217 = c15984.f51764;
                    if (i2 != 0 && (i & 1) == 0) {
                        c20217.m45696(i2, interfaceC23683, iM39154, z2);
                    } else {
                        C11045 c11045M45691 = c20217.m45691(i2);
                        if (c11045M45691 == null) {
                            c20217.m45704(i2, EnumC9365.PROTOCOL_ERROR);
                            long j = iM39154;
                            c20217.m45689(j);
                            interfaceC23683.skip(j);
                        } else {
                            c11045M45691.m27857(interfaceC23683, iM39154);
                            if (z2) {
                                c11045M45691.m27852();
                            }
                        }
                    }
                    interfaceC23683.skip(s);
                    return true;
                case 1:
                    m39156(c15984, iM39155, b2, i2);
                    return true;
                case 2:
                    if (iM39155 != 5) {
                        C2576.m8030("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM39155));
                        throw null;
                    }
                    if (i2 == 0) {
                        C2576.m8030("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    InterfaceC23683 interfaceC23684 = this.f53465;
                    interfaceC23684.readInt();
                    interfaceC23684.readByte();
                    return true;
                case 3:
                    if (iM39155 != 4) {
                        C2576.m8030("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM39155));
                        throw null;
                    }
                    if (i2 == 0) {
                        C2576.m8030("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i3 = this.f53465.readInt();
                    EnumC9365 enumC9365M24012 = EnumC9365.m24012(i3);
                    if (enumC9365M24012 == null) {
                        C2576.m8030("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                        throw null;
                    }
                    C20217 c20218 = c15984.f51764;
                    if (i2 != 0 && (i & 1) == 0) {
                        c20218.m45695(i2, enumC9365M24012);
                        return true;
                    }
                    C11045 c11045M45703 = c20218.m45703(i2);
                    if (c11045M45703 != null) {
                        c11045M45703.m27860(enumC9365M24012);
                    }
                    return true;
                case 4:
                    InterfaceC23683 interfaceC23685 = this.f53465;
                    if (i2 != 0) {
                        C2576.m8030("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b2 & 1) == 0) {
                        if (iM39155 % 6 != 0) {
                            C2576.m8030("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM39155));
                            throw null;
                        }
                        C4631 c4631 = new C4631();
                        for (int i4 = 0; i4 < iM39155; i4 += 6) {
                            int i5 = interfaceC23685.readShort() & HPKE.aead_EXPORT_ONLY;
                            int i6 = interfaceC23685.readInt();
                            if (i5 == 2) {
                                if (i6 != 0 && i6 != 1) {
                                    C2576.m8030("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i5 == 3) {
                                i5 = 4;
                            } else if (i5 != 4) {
                                if (i5 == 5 && (i6 < 16384 || i6 > 16777215)) {
                                    C2576.m8030("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                    throw null;
                                }
                            } else {
                                if (i6 < 0) {
                                    C2576.m8030("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i5 = 7;
                            }
                            c4631.m12784(i5, i6);
                        }
                        C20217 c20219 = c15984.f51764;
                        try {
                            c20219.f65624.execute(new C7516(c15984, new Object[]{c20219.f65613}, c4631));
                            break;
                        } catch (RejectedExecutionException unused) {
                        }
                    } else if (iM39155 != 0) {
                        C2576.m8030("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    return true;
                case 5:
                    InterfaceC23683 interfaceC23686 = this.f53465;
                    if (i2 == 0) {
                        C2576.m8030("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC23686.readByte() & 255) : (short) 0;
                    int i7 = interfaceC23686.readInt() & Integer.MAX_VALUE;
                    int iM39156 = m39154(iM39155 - 4, b2, s);
                    C0460 c0460 = this.f53466;
                    c0460.f2085 = iM39156;
                    c0460.f2080 = iM39156;
                    c0460.f2083 = s;
                    c0460.f2082 = b2;
                    c0460.f2084 = i2;
                    C4693 c4693 = this.f53467;
                    c4693.m13006();
                    c15984.f51764.m45698(c4693.m13005(), i7);
                    return true;
                case 6:
                    m39158(c15984, iM39155, b2, i2);
                    return true;
                case 7:
                    m39157(c15984, iM39155, i2);
                    return true;
                case 8:
                    if (iM39155 != 4) {
                        C2576.m8030("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM39155));
                        throw null;
                    }
                    long j2 = ((long) this.f53465.readInt()) & 2147483647L;
                    if (j2 == 0) {
                        C2576.m8030("windowSizeIncrement was 0", Long.valueOf(j2));
                        throw null;
                    }
                    if (i2 == 0) {
                        synchronized (c15984.f51764) {
                            C20217 c202110 = c15984.f51764;
                            c202110.f65622 += j2;
                            c202110.notifyAll();
                            break;
                        }
                        return true;
                    }
                    C11045 c11045M45692 = c15984.f51764.m45691(i2);
                    if (c11045M45692 != null) {
                        synchronized (c11045M45692) {
                            c11045M45692.f37511 += j2;
                            if (j2 > 0) {
                                c11045M45692.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f53465.skip(iM39155);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39156(C15984 c15984, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            C2576.m8030("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f53465.readByte() & 255) : (short) 0;
        if ((b & UTF8.S_CS3) != 0) {
            InterfaceC23683 interfaceC23683 = this.f53465;
            interfaceC23683.readInt();
            interfaceC23683.readByte();
            i -= 5;
        }
        int iM39154 = m39154(i, b, s);
        C0460 c0460 = this.f53466;
        c0460.f2085 = iM39154;
        c0460.f2080 = iM39154;
        c0460.f2083 = s;
        c0460.f2082 = b;
        c0460.f2084 = i2;
        C4693 c4693 = this.f53467;
        c4693.m13006();
        ArrayList arrayListM13005 = c4693.m13005();
        C20217 c20217 = c15984.f51764;
        if (i2 != 0 && (i2 & 1) == 0) {
            c20217.m45699(arrayListM13005, i2, z);
            return;
        }
        synchronized (c20217) {
            C11045 c11045M45691 = c15984.f51764.m45691(i2);
            if (c11045M45691 == null) {
                if (c15984.f51764.f65623) {
                    return;
                }
                C20217 c20218 = c15984.f51764;
                if (i2 <= c20218.f65604) {
                    return;
                }
                if (i2 % 2 == c20218.f65606 % 2) {
                    return;
                }
                C11045 c11045 = new C11045(i2, c15984.f51764, false, z, C0140.m1230(arrayListM13005));
                C20217 c20219 = c15984.f51764;
                c20219.f65604 = i2;
                c20219.f65616.put(Integer.valueOf(i2), c11045);
                C20217.f65601.execute(new C10339(c15984, new Object[]{c15984.f51764.f65613, Integer.valueOf(i2)}, c11045));
                return;
            }
            c11045M45691.m27855(arrayListM13005);
            if (z) {
                c11045M45691.m27852();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39158(C15984 c15984, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            C2576.m8030("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C2576.m8030("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f53465.readInt();
        int i4 = this.f53465.readInt();
        if ((b & 1) == 0) {
            try {
                c15984.f51764.f65624.execute(new C8928(c15984.f51764, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (c15984.f51764) {
            try {
                if (i3 == 1) {
                    C20217.m45683(c15984.f51764);
                } else if (i3 == 2) {
                    C20217.m45678(c15984.f51764);
                } else if (i3 == 3) {
                    C20217.m45682(c15984.f51764);
                    c15984.f51764.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39157(C15984 c15984, int i, int i2) throws IOException {
        C11045[] c11045Arr;
        if (i < 8) {
            C2576.m8030("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C2576.m8030("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f53465.readInt();
        int i4 = this.f53465.readInt();
        int i5 = i - 8;
        if (EnumC9365.m24012(i4) == null) {
            C2576.m8030("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C14511 c14511Mo16421 = C14511.f47541;
        if (i5 > 0) {
            c14511Mo16421 = this.f53465.mo16421(i5);
        }
        c14511Mo16421.mo34938();
        synchronized (c15984.f51764) {
            c11045Arr = (C11045[]) c15984.f51764.f65616.values().toArray(new C11045[c15984.f51764.f65616.size()]);
            c15984.f51764.f65623 = true;
        }
        for (C11045 c11045 : c11045Arr) {
            if (c11045.f37517 > i3 && c11045.m27858()) {
                c11045.m27860(EnumC9365.REFUSED_STREAM);
                c15984.f51764.m45703(c11045.f37517);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f53465.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39155(InterfaceC23683 interfaceC23683) {
        return (interfaceC23683.readByte() & 255) | ((interfaceC23683.readByte() & 255) << 16) | ((interfaceC23683.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39154(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C2576.m8030("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
